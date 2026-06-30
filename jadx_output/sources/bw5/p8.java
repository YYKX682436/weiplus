package bw5;

/* loaded from: classes9.dex */
public class p8 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public boolean f31487d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f31488e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31489f;

    /* renamed from: g, reason: collision with root package name */
    public long f31490g;

    /* renamed from: h, reason: collision with root package name */
    public long f31491h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f31492i = new boolean[6];

    static {
        new bw5.p8();
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.p8)) {
            return false;
        }
        bw5.p8 p8Var = (bw5.p8) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f31487d), java.lang.Boolean.valueOf(p8Var.f31487d)) && n51.f.a(java.lang.Boolean.valueOf(this.f31488e), java.lang.Boolean.valueOf(p8Var.f31488e)) && n51.f.a(java.lang.Boolean.valueOf(this.f31489f), java.lang.Boolean.valueOf(p8Var.f31489f)) && n51.f.a(java.lang.Long.valueOf(this.f31490g), java.lang.Long.valueOf(p8Var.f31490g)) && n51.f.a(java.lang.Long.valueOf(this.f31491h), java.lang.Long.valueOf(p8Var.f31491h));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.p8();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31492i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            if (zArr[1]) {
                fVar.a(1, this.f31487d);
            }
            if (zArr[2]) {
                fVar.a(2, this.f31488e);
            }
            if (zArr[3]) {
                fVar.a(3, this.f31489f);
            }
            if (zArr[4]) {
                fVar.h(4, this.f31490g);
            }
            if (zArr[5]) {
                fVar.h(5, this.f31491h);
            }
            return 0;
        }
        if (i17 == 1) {
            int a17 = zArr[1] ? 0 + b36.f.a(1, this.f31487d) : 0;
            if (zArr[2]) {
                a17 += b36.f.a(2, this.f31488e);
            }
            if (zArr[3]) {
                a17 += b36.f.a(3, this.f31489f);
            }
            if (zArr[4]) {
                a17 += b36.f.h(4, this.f31490g);
            }
            return zArr[5] ? a17 + b36.f.h(5, this.f31491h) : a17;
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
            this.f31487d = aVar2.c(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f31488e = aVar2.c(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f31489f = aVar2.c(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f31490g = aVar2.i(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f31491h = aVar2.i(intValue);
        zArr[5] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.p8) super.parseFrom(bArr);
    }
}
