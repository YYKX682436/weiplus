package bw5;

/* loaded from: classes9.dex */
public class u7 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f33754d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f33755e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f33756f;

    /* renamed from: g, reason: collision with root package name */
    public int f33757g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f33758h;

    /* renamed from: i, reason: collision with root package name */
    public int f33759i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f33760m;

    /* renamed from: n, reason: collision with root package name */
    public int f33761n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f33762o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f33763p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f33764q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f33765r;

    /* renamed from: s, reason: collision with root package name */
    public bw5.t7 f33766s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f33767t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f33768u = new boolean[15];

    static {
        new bw5.u7();
    }

    public java.lang.String b() {
        return this.f33768u[2] ? this.f33755e : "";
    }

    public java.lang.String c() {
        return this.f33768u[5] ? this.f33758h : "";
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.u7)) {
            return false;
        }
        bw5.u7 u7Var = (bw5.u7) fVar;
        return n51.f.a(this.f33754d, u7Var.f33754d) && n51.f.a(this.f33755e, u7Var.f33755e) && n51.f.a(this.f33756f, u7Var.f33756f) && n51.f.a(java.lang.Integer.valueOf(this.f33757g), java.lang.Integer.valueOf(u7Var.f33757g)) && n51.f.a(this.f33758h, u7Var.f33758h) && n51.f.a(java.lang.Integer.valueOf(this.f33759i), java.lang.Integer.valueOf(u7Var.f33759i)) && n51.f.a(java.lang.Boolean.valueOf(this.f33760m), java.lang.Boolean.valueOf(u7Var.f33760m)) && n51.f.a(java.lang.Integer.valueOf(this.f33761n), java.lang.Integer.valueOf(u7Var.f33761n)) && n51.f.a(java.lang.Boolean.valueOf(this.f33762o), java.lang.Boolean.valueOf(u7Var.f33762o)) && n51.f.a(this.f33763p, u7Var.f33763p) && n51.f.a(java.lang.Boolean.valueOf(this.f33764q), java.lang.Boolean.valueOf(u7Var.f33764q)) && n51.f.a(java.lang.Boolean.valueOf(this.f33765r), java.lang.Boolean.valueOf(u7Var.f33765r)) && n51.f.a(this.f33766s, u7Var.f33766s) && n51.f.a(this.f33767t, u7Var.f33767t);
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public bw5.u7 parseFrom(byte[] bArr) {
        return (bw5.u7) super.parseFrom(bArr);
    }

    public bw5.u7 e(java.lang.String str) {
        this.f33754d = str;
        this.f33768u[1] = true;
        return this;
    }

    public bw5.u7 f(java.lang.String str) {
        this.f33756f = str;
        this.f33768u[3] = true;
        return this;
    }

    public bw5.u7 g(int i17) {
        this.f33757g = i17;
        this.f33768u[4] = true;
        return this;
    }

    public java.lang.String getAppid() {
        return this.f33768u[1] ? this.f33754d : "";
    }

    public java.lang.String getPath() {
        return this.f33768u[3] ? this.f33756f : "";
    }

    public int getScene() {
        return this.f33757g;
    }

    public bw5.u7 i(java.lang.String str) {
        this.f33758h = str;
        this.f33768u[5] = true;
        return this;
    }

    public bw5.u7 j(int i17) {
        this.f33759i = i17;
        this.f33768u[6] = true;
        return this;
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.u7();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        boolean[] zArr = this.f33768u;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f33754d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f33755e;
            if (str2 != null && zArr[2]) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f33756f;
            if (str3 != null && zArr[3]) {
                fVar.j(3, str3);
            }
            if (zArr[4]) {
                fVar.e(4, this.f33757g);
            }
            java.lang.String str4 = this.f33758h;
            if (str4 != null && zArr[5]) {
                fVar.j(5, str4);
            }
            if (zArr[6]) {
                fVar.e(6, this.f33759i);
            }
            if (zArr[7]) {
                fVar.a(7, this.f33760m);
            }
            if (zArr[8]) {
                fVar.e(8, this.f33761n);
            }
            if (zArr[9]) {
                fVar.a(9, this.f33762o);
            }
            java.lang.String str5 = this.f33763p;
            if (str5 != null && zArr[10]) {
                fVar.j(10, str5);
            }
            if (zArr[11]) {
                fVar.a(11, this.f33764q);
            }
            if (zArr[12]) {
                fVar.a(12, this.f33765r);
            }
            bw5.t7 t7Var = this.f33766s;
            if (t7Var != null && zArr[13]) {
                fVar.i(13, t7Var.computeSize());
                this.f33766s.writeFields(fVar);
            }
            java.lang.String str6 = this.f33767t;
            if (str6 == null || !zArr[14]) {
                return 0;
            }
            fVar.j(14, str6);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str7 = this.f33754d;
            int j17 = (str7 == null || !zArr[1]) ? 0 : 0 + b36.f.j(1, str7);
            java.lang.String str8 = this.f33755e;
            if (str8 != null && zArr[2]) {
                j17 += b36.f.j(2, str8);
            }
            java.lang.String str9 = this.f33756f;
            if (str9 != null && zArr[3]) {
                j17 += b36.f.j(3, str9);
            }
            if (zArr[4]) {
                j17 += b36.f.e(4, this.f33757g);
            }
            java.lang.String str10 = this.f33758h;
            if (str10 != null && zArr[5]) {
                j17 += b36.f.j(5, str10);
            }
            if (zArr[6]) {
                j17 += b36.f.e(6, this.f33759i);
            }
            if (zArr[7]) {
                j17 += b36.f.a(7, this.f33760m);
            }
            if (zArr[8]) {
                j17 += b36.f.e(8, this.f33761n);
            }
            if (zArr[9]) {
                j17 += b36.f.a(9, this.f33762o);
            }
            java.lang.String str11 = this.f33763p;
            if (str11 != null && zArr[10]) {
                j17 += b36.f.j(10, str11);
            }
            if (zArr[11]) {
                j17 += b36.f.a(11, this.f33764q);
            }
            if (zArr[12]) {
                j17 += b36.f.a(12, this.f33765r);
            }
            bw5.t7 t7Var2 = this.f33766s;
            if (t7Var2 != null && zArr[13]) {
                j17 += b36.f.i(13, t7Var2.computeSize());
            }
            java.lang.String str12 = this.f33767t;
            return (str12 == null || !zArr[14]) ? j17 : j17 + b36.f.j(14, str12);
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
        switch (intValue) {
            case 1:
                this.f33754d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f33755e = aVar2.k(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f33756f = aVar2.k(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33757g = aVar2.g(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                this.f33758h = aVar2.k(intValue);
                zArr[5] = true;
                return 0;
            case 6:
                this.f33759i = aVar2.g(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f33760m = aVar2.c(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f33761n = aVar2.g(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f33762o = aVar2.c(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f33763p = aVar2.k(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f33764q = aVar2.c(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f33765r = aVar2.c(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size = j18.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j18.get(i18);
                    bw5.t7 t7Var3 = new bw5.t7();
                    if (bArr != null && bArr.length > 0) {
                        t7Var3.parseFrom(bArr);
                    }
                    this.f33766s = t7Var3;
                }
                zArr[13] = true;
                return 0;
            case 14:
                this.f33767t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            default:
                return -1;
        }
    }
}
