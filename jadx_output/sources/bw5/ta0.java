package bw5;

/* loaded from: classes2.dex */
public class ta0 extends com.tencent.mm.protobuf.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f33328d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f33329e;

    /* renamed from: f, reason: collision with root package name */
    public long f33330f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f33331g;

    /* renamed from: h, reason: collision with root package name */
    public bw5.mc0 f33332h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f33333i;

    /* renamed from: m, reason: collision with root package name */
    public int f33334m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f33335n;

    /* renamed from: o, reason: collision with root package name */
    public long f33336o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f33337p;

    /* renamed from: q, reason: collision with root package name */
    public int f33338q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f33339r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f33340s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f33341t;

    /* renamed from: u, reason: collision with root package name */
    public int f33342u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean[] f33343v = new boolean[16];

    static {
        new bw5.ta0();
    }

    @Override // com.tencent.mm.protobuf.f
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public bw5.ta0 parseFrom(byte[] bArr) {
        return (bw5.ta0) super.parseFrom(bArr);
    }

    @Override // com.tencent.mm.protobuf.f
    public boolean compareContent(com.tencent.mm.protobuf.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.ta0)) {
            return false;
        }
        bw5.ta0 ta0Var = (bw5.ta0) fVar;
        return n51.f.a(this.f33328d, ta0Var.f33328d) && n51.f.a(java.lang.Boolean.valueOf(this.f33329e), java.lang.Boolean.valueOf(ta0Var.f33329e)) && n51.f.a(java.lang.Long.valueOf(this.f33330f), java.lang.Long.valueOf(ta0Var.f33330f)) && n51.f.a(this.f33331g, ta0Var.f33331g) && n51.f.a(this.f33332h, ta0Var.f33332h) && n51.f.a(java.lang.Boolean.valueOf(this.f33333i), java.lang.Boolean.valueOf(ta0Var.f33333i)) && n51.f.a(java.lang.Integer.valueOf(this.f33334m), java.lang.Integer.valueOf(ta0Var.f33334m)) && n51.f.a(this.f33335n, ta0Var.f33335n) && n51.f.a(java.lang.Long.valueOf(this.f33336o), java.lang.Long.valueOf(ta0Var.f33336o)) && n51.f.a(java.lang.Boolean.valueOf(this.f33337p), java.lang.Boolean.valueOf(ta0Var.f33337p)) && n51.f.a(java.lang.Integer.valueOf(this.f33338q), java.lang.Integer.valueOf(ta0Var.f33338q)) && n51.f.a(this.f33339r, ta0Var.f33339r) && n51.f.a(java.lang.Boolean.valueOf(this.f33340s), java.lang.Boolean.valueOf(ta0Var.f33340s)) && n51.f.a(this.f33341t, ta0Var.f33341t) && n51.f.a(java.lang.Integer.valueOf(this.f33342u), java.lang.Integer.valueOf(ta0Var.f33342u));
    }

    @Override // com.tencent.mm.protobuf.f
    public com.tencent.mm.protobuf.f newInstance() {
        return new bw5.ta0();
    }

    @Override // com.tencent.mm.protobuf.f
    public final int op(int i17, java.lang.Object... objArr) {
        int i18 = 0;
        boolean[] zArr = this.f33343v;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f33328d;
            if (str != null && zArr[1]) {
                fVar.j(1, str);
            }
            if (zArr[2]) {
                fVar.a(2, this.f33329e);
            }
            if (zArr[3]) {
                fVar.h(3, this.f33330f);
            }
            java.lang.String str2 = this.f33331g;
            if (str2 != null && zArr[4]) {
                fVar.j(4, str2);
            }
            bw5.mc0 mc0Var = this.f33332h;
            if (mc0Var != null && zArr[5]) {
                fVar.i(5, mc0Var.computeSize());
                this.f33332h.writeFields(fVar);
            }
            if (zArr[6]) {
                fVar.a(6, this.f33333i);
            }
            if (zArr[7]) {
                fVar.e(7, this.f33334m);
            }
            java.lang.String str3 = this.f33335n;
            if (str3 != null && zArr[8]) {
                fVar.j(8, str3);
            }
            if (zArr[9]) {
                fVar.h(9, this.f33336o);
            }
            if (zArr[10]) {
                fVar.a(10, this.f33337p);
            }
            if (zArr[11]) {
                fVar.e(11, this.f33338q);
            }
            java.lang.String str4 = this.f33339r;
            if (str4 != null && zArr[12]) {
                fVar.j(12, str4);
            }
            if (zArr[13]) {
                fVar.a(13, this.f33340s);
            }
            java.lang.String str5 = this.f33341t;
            if (str5 != null && zArr[14]) {
                fVar.j(14, str5);
            }
            if (zArr[15]) {
                fVar.e(15, this.f33342u);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str6 = this.f33328d;
            if (str6 != null && zArr[1]) {
                i18 = b36.f.j(1, str6) + 0;
            }
            if (zArr[2]) {
                i18 += b36.f.a(2, this.f33329e);
            }
            if (zArr[3]) {
                i18 += b36.f.h(3, this.f33330f);
            }
            java.lang.String str7 = this.f33331g;
            if (str7 != null && zArr[4]) {
                i18 += b36.f.j(4, str7);
            }
            bw5.mc0 mc0Var2 = this.f33332h;
            if (mc0Var2 != null && zArr[5]) {
                i18 += b36.f.i(5, mc0Var2.computeSize());
            }
            if (zArr[6]) {
                i18 += b36.f.a(6, this.f33333i);
            }
            if (zArr[7]) {
                i18 += b36.f.e(7, this.f33334m);
            }
            java.lang.String str8 = this.f33335n;
            if (str8 != null && zArr[8]) {
                i18 += b36.f.j(8, str8);
            }
            if (zArr[9]) {
                i18 += b36.f.h(9, this.f33336o);
            }
            if (zArr[10]) {
                i18 += b36.f.a(10, this.f33337p);
            }
            if (zArr[11]) {
                i18 += b36.f.e(11, this.f33338q);
            }
            java.lang.String str9 = this.f33339r;
            if (str9 != null && zArr[12]) {
                i18 += b36.f.j(12, str9);
            }
            if (zArr[13]) {
                i18 += b36.f.a(13, this.f33340s);
            }
            java.lang.String str10 = this.f33341t;
            if (str10 != null && zArr[14]) {
                i18 += b36.f.j(14, str10);
            }
            return zArr[15] ? i18 + b36.f.e(15, this.f33342u) : i18;
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
                this.f33328d = aVar2.k(intValue);
                zArr[1] = true;
                return 0;
            case 2:
                this.f33329e = aVar2.c(intValue);
                zArr[2] = true;
                return 0;
            case 3:
                this.f33330f = aVar2.i(intValue);
                zArr[3] = true;
                return 0;
            case 4:
                this.f33331g = aVar2.k(intValue);
                zArr[4] = true;
                return 0;
            case 5:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    bw5.mc0 mc0Var3 = new bw5.mc0();
                    if (bArr != null && bArr.length > 0) {
                        mc0Var3.parseFrom(bArr);
                    }
                    this.f33332h = mc0Var3;
                }
                zArr[5] = true;
                return 0;
            case 6:
                this.f33333i = aVar2.c(intValue);
                zArr[6] = true;
                return 0;
            case 7:
                this.f33334m = aVar2.g(intValue);
                zArr[7] = true;
                return 0;
            case 8:
                this.f33335n = aVar2.k(intValue);
                zArr[8] = true;
                return 0;
            case 9:
                this.f33336o = aVar2.i(intValue);
                zArr[9] = true;
                return 0;
            case 10:
                this.f33337p = aVar2.c(intValue);
                zArr[10] = true;
                return 0;
            case 11:
                this.f33338q = aVar2.g(intValue);
                zArr[11] = true;
                return 0;
            case 12:
                this.f33339r = aVar2.k(intValue);
                zArr[12] = true;
                return 0;
            case 13:
                this.f33340s = aVar2.c(intValue);
                zArr[13] = true;
                return 0;
            case 14:
                this.f33341t = aVar2.k(intValue);
                zArr[14] = true;
                return 0;
            case 15:
                this.f33342u = aVar2.g(intValue);
                zArr[15] = true;
                return 0;
            default:
                return -1;
        }
    }
}
