package bw5;

/* loaded from: classes2.dex */
public class h00 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public int f28038d;

    /* renamed from: e, reason: collision with root package name */
    public int f28039e;

    /* renamed from: f, reason: collision with root package name */
    public int f28040f;

    /* renamed from: g, reason: collision with root package name */
    public int f28041g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f28042h = new boolean[5];

    static {
        new bw5.h00();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.h00 parseFrom(byte[] bArr) {
        return (bw5.h00) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.h00)) {
            return false;
        }
        bw5.h00 h00Var = (bw5.h00) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f28038d), java.lang.Integer.valueOf(h00Var.f28038d)) && n51.f.a(java.lang.Integer.valueOf(this.f28039e), java.lang.Integer.valueOf(h00Var.f28039e)) && n51.f.a(java.lang.Integer.valueOf(this.f28040f), java.lang.Integer.valueOf(h00Var.f28040f)) && n51.f.a(java.lang.Integer.valueOf(this.f28041g), java.lang.Integer.valueOf(h00Var.f28041g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.h00();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28042h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.e(1, this.f28038d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f28039e);
            }
            if (zArr[3]) {
                fVar.e(3, this.f28040f);
            }
            if (zArr[4]) {
                fVar.e(4, this.f28041g);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = zArr[1] ? 0 + b36.f.e(1, this.f28038d) : 0;
            if (zArr[2]) {
                e17 += b36.f.e(2, this.f28039e);
            }
            if (zArr[3]) {
                e17 += b36.f.e(3, this.f28040f);
            }
            return zArr[4] ? e17 + b36.f.e(4, this.f28041g) : e17;
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
            this.f28038d = aVar2.g(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f28039e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f28040f = aVar2.g(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f28041g = aVar2.g(intValue);
        zArr[4] = true;
        return 0;
    }
}
