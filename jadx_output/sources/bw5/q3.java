package bw5;

/* loaded from: classes10.dex */
public class q3 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f31913d;

    /* renamed from: e, reason: collision with root package name */
    public long f31914e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f31915f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean[] f31916g = new boolean[4];

    static {
        new bw5.q3();
    }

    public java.lang.String b() {
        return this.f31916g[3] ? this.f31915f : "";
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public bw5.q3 parseFrom(byte[] bArr) {
        return (bw5.q3) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.q3)) {
            return false;
        }
        bw5.q3 q3Var = (bw5.q3) fVar;
        return n51.f.a(this.f31913d, q3Var.f31913d) && n51.f.a(java.lang.Long.valueOf(this.f31914e), java.lang.Long.valueOf(q3Var.f31914e)) && n51.f.a(this.f31915f, q3Var.f31915f);
    }

    public bw5.q3 d(java.lang.String str) {
        this.f31913d = str;
        this.f31916g[1] = true;
        return this;
    }

    public bw5.q3 e(java.lang.String str) {
        this.f31915f = str;
        this.f31916g[3] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.q3();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f31916g;
        int i18 = 0;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f31913d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.h(2, this.f31914e);
            }
            java.lang.String str2 = this.f31915f;
            if (str2 != null && zArr[3]) {
                fVar.j(3, str2);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str3 = this.f31913d;
            if (str3 != null && zArr[1]) {
                i18 = 0 + b36.f.j(1, str3);
            }
            if (zArr[2]) {
                i18 += b36.f.h(2, this.f31914e);
            }
            java.lang.String str4 = this.f31915f;
            return (str4 == null || !zArr[3]) ? i18 : i18 + b36.f.j(3, str4);
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
            this.f31913d = aVar2.k(intValue);
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f31914e = aVar2.i(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue != 3) {
            return -1;
        }
        this.f31915f = aVar2.k(intValue);
        zArr[3] = true;
        return 0;
    }
}
