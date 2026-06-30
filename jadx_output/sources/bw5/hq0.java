package bw5;

/* loaded from: classes8.dex */
public class hq0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f28326d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f28327e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f28328f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f28329g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean[] f28330h = new boolean[5];

    static {
        new bw5.hq0();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hq0)) {
            return false;
        }
        bw5.hq0 hq0Var = (bw5.hq0) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f28326d), java.lang.Boolean.valueOf(hq0Var.f28326d)) && n51.f.a(java.lang.Boolean.valueOf(this.f28327e), java.lang.Boolean.valueOf(hq0Var.f28327e)) && n51.f.a(java.lang.Boolean.valueOf(this.f28328f), java.lang.Boolean.valueOf(hq0Var.f28328f)) && n51.f.a(java.lang.Boolean.valueOf(this.f28329g), java.lang.Boolean.valueOf(hq0Var.f28329g));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.hq0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f28330h;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f28326d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f28327e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f28328f);
            }
            if (zArr[4]) {
                fVar.a(4, this.f28329g);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f28326d) : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f28327e);
            }
            if (zArr[3]) {
                a17 += b36.f.a(3, this.f28328f);
            }
            return zArr[4] ? a17 + b36.f.a(4, this.f28329g) : a17;
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
            this.f28326d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f28327e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f28328f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue != 4) {
            return -1;
        }
        this.f28329g = aVar2.c(intValue);
        zArr[4] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.hq0) super.parseFrom(bArr);
    }
}
