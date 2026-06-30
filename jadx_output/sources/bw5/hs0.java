package bw5;

/* loaded from: classes14.dex */
public class hs0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public bw5.is0 f28342d;

    /* renamed from: e, reason: collision with root package name */
    public int f28343e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f28344f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f28345g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f28346h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean[] f28347i = new boolean[6];

    static {
        new bw5.hs0();
    }

    public bw5.hs0 b(int i17) {
        this.f28343e = i17;
        this.f28347i[2] = true;
        return this;
    }

    public bw5.hs0 c(java.lang.String str) {
        this.f28344f = str;
        this.f28347i[3] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.hs0)) {
            return false;
        }
        bw5.hs0 hs0Var = (bw5.hs0) fVar;
        return n51.f.a(this.f28342d, hs0Var.f28342d) && n51.f.a(java.lang.Integer.valueOf(this.f28343e), java.lang.Integer.valueOf(hs0Var.f28343e)) && n51.f.a(this.f28344f, hs0Var.f28344f) && n51.f.a(this.f28345g, hs0Var.f28345g) && n51.f.a(this.f28346h, hs0Var.f28346h);
    }

    public bw5.hs0 d(java.lang.String str) {
        this.f28345g = str;
        this.f28347i[4] = true;
        return this;
    }

    public bw5.hs0 e(bw5.is0 is0Var) {
        this.f28342d = is0Var;
        this.f28347i[1] = true;
        return this;
    }

    public bw5.hs0 f(java.lang.String str) {
        this.f28346h = str;
        this.f28347i[5] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.hs0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f28347i;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            bw5.is0 is0Var = this.f28342d;
            if (is0Var != null && zArr[1]) {
                fVar.e(1, is0Var.f28701d);
            }
            if (zArr[2]) {
                fVar.e(2, this.f28343e);
            }
            java.lang.String str = this.f28344f;
            if (str != null && zArr[3]) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f28345g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f28346h;
            if (str3 != null && zArr[5]) {
                fVar.j(5, str3);
            }
            return 0;
        }
        if (i17 == 1) {
            bw5.is0 is0Var2 = this.f28342d;
            if (is0Var2 != null && zArr[1]) {
                i18 = 0 + b36.f.e(1, is0Var2.f28701d);
            }
            if (zArr[2]) {
                i18 += b36.f.e(2, this.f28343e);
            }
            java.lang.String str4 = this.f28344f;
            if (str4 != null && zArr[3]) {
                i18 += b36.f.j(3, str4);
            }
            java.lang.String str5 = this.f28345g;
            if (str5 != null && zArr[4]) {
                i18 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f28346h;
            return (str6 == null || !zArr[5]) ? i18 : i18 + b36.f.j(5, str6);
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
            int g17 = aVar2.g(intValue);
            this.f28342d = g17 != 1 ? g17 != 2 ? null : bw5.is0.WIFI_DIRECT_OP_TYPE_CONNECT : bw5.is0.WIFI_DIRECT_OP_TYPE_CREATE;
            zArr[1] = true;
            return 0;
        }
        if (intValue == 2) {
            this.f28343e = aVar2.g(intValue);
            zArr[2] = true;
            return 0;
        }
        if (intValue == 3) {
            this.f28344f = aVar2.k(intValue);
            zArr[3] = true;
            return 0;
        }
        if (intValue == 4) {
            this.f28345g = aVar2.k(intValue);
            zArr[4] = true;
            return 0;
        }
        if (intValue != 5) {
            return -1;
        }
        this.f28346h = aVar2.k(intValue);
        zArr[5] = true;
        return 0;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f parseFrom(byte[] bArr) {
        return (bw5.hs0) super.parseFrom(bArr);
    }
}
