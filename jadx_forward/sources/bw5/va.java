package bw5;

/* loaded from: classes4.dex */
public class va extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: w, reason: collision with root package name */
    public static final bw5.va f115776w = new bw5.va();

    /* renamed from: d, reason: collision with root package name */
    public int f115777d = 0;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f115778e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f115779f = "";

    /* renamed from: g, reason: collision with root package name */
    public int f115780g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f115781h = 0;

    /* renamed from: i, reason: collision with root package name */
    public bw5.z9 f115782i = new bw5.z9();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f115783m = "";

    /* renamed from: n, reason: collision with root package name */
    public int f115784n = 0;

    /* renamed from: o, reason: collision with root package name */
    public boolean f115785o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f115786p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f115787q = false;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f115788r = "";

    /* renamed from: s, reason: collision with root package name */
    public boolean f115789s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f115790t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f115791u = false;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f115792v = "";

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof bw5.va)) {
            return false;
        }
        bw5.va vaVar = (bw5.va) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f115777d), java.lang.Integer.valueOf(vaVar.f115777d)) && n51.f.a(this.f115778e, vaVar.f115778e) && n51.f.a(this.f115779f, vaVar.f115779f) && n51.f.a(java.lang.Integer.valueOf(this.f115780g), java.lang.Integer.valueOf(vaVar.f115780g)) && n51.f.a(java.lang.Integer.valueOf(this.f115781h), java.lang.Integer.valueOf(vaVar.f115781h)) && n51.f.a(this.f115782i, vaVar.f115782i) && n51.f.a(this.f115783m, vaVar.f115783m) && n51.f.a(java.lang.Integer.valueOf(this.f115784n), java.lang.Integer.valueOf(vaVar.f115784n)) && n51.f.a(java.lang.Boolean.valueOf(this.f115785o), java.lang.Boolean.valueOf(vaVar.f115785o)) && n51.f.a(java.lang.Boolean.valueOf(this.f115786p), java.lang.Boolean.valueOf(vaVar.f115786p)) && n51.f.a(java.lang.Boolean.valueOf(this.f115787q), java.lang.Boolean.valueOf(vaVar.f115787q)) && n51.f.a(this.f115788r, vaVar.f115788r) && n51.f.a(java.lang.Boolean.valueOf(this.f115789s), java.lang.Boolean.valueOf(vaVar.f115789s)) && n51.f.a(java.lang.Boolean.valueOf(this.f115790t), java.lang.Boolean.valueOf(vaVar.f115790t)) && n51.f.a(java.lang.Boolean.valueOf(this.f115791u), java.lang.Boolean.valueOf(vaVar.f115791u)) && n51.f.a(this.f115792v, vaVar.f115792v);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new bw5.va();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f115777d);
            java.lang.String str = this.f115778e;
            if (str != null) {
                fVar.j(2, str);
            }
            java.lang.String str2 = this.f115779f;
            if (str2 != null) {
                fVar.j(3, str2);
            }
            fVar.e(4, this.f115780g);
            fVar.e(5, this.f115781h);
            bw5.z9 z9Var = this.f115782i;
            if (z9Var != null) {
                fVar.i(6, z9Var.mo75928xcd1e8d8());
                this.f115782i.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str3 = this.f115783m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            fVar.e(8, this.f115784n);
            fVar.a(9, this.f115785o);
            fVar.a(10, this.f115786p);
            fVar.a(11, this.f115787q);
            java.lang.String str4 = this.f115788r;
            if (str4 != null) {
                fVar.j(12, str4);
            }
            fVar.a(13, this.f115789s);
            fVar.a(14, this.f115790t);
            fVar.a(15, this.f115791u);
            java.lang.String str5 = this.f115792v;
            if (str5 != null) {
                fVar.j(16, str5);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f115777d) + 0;
            java.lang.String str6 = this.f115778e;
            if (str6 != null) {
                e17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f115779f;
            if (str7 != null) {
                e17 += b36.f.j(3, str7);
            }
            int e18 = e17 + b36.f.e(4, this.f115780g) + b36.f.e(5, this.f115781h);
            bw5.z9 z9Var2 = this.f115782i;
            if (z9Var2 != null) {
                e18 += b36.f.i(6, z9Var2.mo75928xcd1e8d8());
            }
            java.lang.String str8 = this.f115783m;
            if (str8 != null) {
                e18 += b36.f.j(7, str8);
            }
            int e19 = e18 + b36.f.e(8, this.f115784n) + b36.f.a(9, this.f115785o) + b36.f.a(10, this.f115786p) + b36.f.a(11, this.f115787q);
            java.lang.String str9 = this.f115788r;
            if (str9 != null) {
                e19 += b36.f.j(12, str9);
            }
            int a17 = e19 + b36.f.a(13, this.f115789s) + b36.f.a(14, this.f115790t) + b36.f.a(15, this.f115791u);
            java.lang.String str10 = this.f115792v;
            return str10 != null ? a17 + b36.f.j(16, str10) : a17;
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
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
                this.f115777d = aVar2.g(intValue);
                return 0;
            case 2:
                this.f115778e = aVar2.k(intValue);
                return 0;
            case 3:
                this.f115779f = aVar2.k(intValue);
                return 0;
            case 4:
                this.f115780g = aVar2.g(intValue);
                return 0;
            case 5:
                this.f115781h = aVar2.g(intValue);
                return 0;
            case 6:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    bw5.z9 z9Var3 = new bw5.z9();
                    if (bArr != null && bArr.length > 0) {
                        z9Var3.mo11468x92b714fd(bArr);
                    }
                    this.f115782i = z9Var3;
                }
                return 0;
            case 7:
                this.f115783m = aVar2.k(intValue);
                return 0;
            case 8:
                this.f115784n = aVar2.g(intValue);
                return 0;
            case 9:
                this.f115785o = aVar2.c(intValue);
                return 0;
            case 10:
                this.f115786p = aVar2.c(intValue);
                return 0;
            case 11:
                this.f115787q = aVar2.c(intValue);
                return 0;
            case 12:
                this.f115788r = aVar2.k(intValue);
                return 0;
            case 13:
                this.f115789s = aVar2.c(intValue);
                return 0;
            case 14:
                this.f115790t = aVar2.c(intValue);
                return 0;
            case 15:
                this.f115791u = aVar2.c(intValue);
                return 0;
            case 16:
                this.f115792v = aVar2.k(intValue);
                return 0;
            default:
                return -1;
        }
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd(byte[] bArr) {
        return (bw5.va) super.mo11468x92b714fd(bArr);
    }
}
