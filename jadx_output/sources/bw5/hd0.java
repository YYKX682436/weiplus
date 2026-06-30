package bw5;

/* loaded from: classes2.dex */
public class hd0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public double f28172d;

    /* renamed from: e, reason: collision with root package name */
    public double f28173e;

    /* renamed from: f, reason: collision with root package name */
    public double f28174f;

    /* renamed from: g, reason: collision with root package name */
    public double f28175g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f28176h = new boolean[5];

    static {
        new bw5.hd0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.hd0 parseFrom(byte[] bArr) {
        return (bw5.hd0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hd0)) {
            return false;
        }
        bw5.hd0 hd0Var = (bw5.hd0) fVar;
        return n51.f.a(java.lang.Double.valueOf(this.f28172d), java.lang.Double.valueOf(hd0Var.f28172d)) && n51.f.a(java.lang.Double.valueOf(this.f28173e), java.lang.Double.valueOf(hd0Var.f28173e)) && n51.f.a(java.lang.Double.valueOf(this.f28174f), java.lang.Double.valueOf(hd0Var.f28174f)) && n51.f.a(java.lang.Double.valueOf(this.f28175g), java.lang.Double.valueOf(hd0Var.f28175g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.hd0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28176h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.c(1, this.f28172d);
            }
            if (zArr[2]) {
                fVar.c(2, this.f28173e);
            }
            if (zArr[3]) {
                fVar.c(3, this.f28174f);
            }
            if (zArr[4]) {
                fVar.c(4, this.f28175g);
            }
            return 0;
        }
        if (i17 == 1) {
            int c17 = zArr[1] ? 0 + b36.f.c(1, this.f28172d) : 0;
            if (zArr[2]) {
                c17 += b36.f.c(2, this.f28173e);
            }
            if (zArr[3]) {
                c17 += b36.f.c(3, this.f28174f);
            }
            return zArr[4] ? c17 + b36.f.c(4, this.f28175g) : c17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.tencent.mm.protobuf.f.unknownTagHandler);
            for (int nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar); nextFieldNumber > 0; nextFieldNumber = com.tencent.mm.protobuf.f.getNextFieldNumber(aVar)) {
                if (!super.populateBuilderWithField(aVar, this, nextFieldNumber)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f28172d = aVar2.e(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f28173e = aVar2.e(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f28174f = aVar2.e(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f28175g = aVar2.e(intValue);
        zArr[4] = true;
        return 0;
    }
}
