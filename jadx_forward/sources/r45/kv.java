package r45;

/* loaded from: classes9.dex */
public class kv extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public int f460503d;

    /* renamed from: e, reason: collision with root package name */
    public int f460504e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f460505f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460506g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f460507h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f460508i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f460509m;

    /* renamed from: n, reason: collision with root package name */
    public r45.bn f460510n;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kv)) {
            return false;
        }
        r45.kv kvVar = (r45.kv) fVar;
        return n51.f.a(java.lang.Integer.valueOf(this.f460503d), java.lang.Integer.valueOf(kvVar.f460503d)) && n51.f.a(java.lang.Integer.valueOf(this.f460504e), java.lang.Integer.valueOf(kvVar.f460504e)) && n51.f.a(this.f460505f, kvVar.f460505f) && n51.f.a(this.f460506g, kvVar.f460506g) && n51.f.a(this.f460507h, kvVar.f460507h) && n51.f.a(this.f460508i, kvVar.f460508i) && n51.f.a(java.lang.Boolean.valueOf(this.f460509m), java.lang.Boolean.valueOf(kvVar.f460509m)) && n51.f.a(this.f460510n, kvVar.f460510n);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.e(1, this.f460503d);
            fVar.e(2, this.f460504e);
            java.lang.String str = this.f460505f;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f460506g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f460507h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            java.lang.String str4 = this.f460508i;
            if (str4 != null) {
                fVar.j(6, str4);
            }
            fVar.a(7, this.f460509m);
            r45.bn bnVar = this.f460510n;
            if (bnVar != null) {
                fVar.i(8, bnVar.mo75928xcd1e8d8());
                this.f460510n.mo75956x3d5d1f78(fVar);
            }
            return 0;
        }
        if (i17 == 1) {
            int e17 = b36.f.e(1, this.f460503d) + 0 + b36.f.e(2, this.f460504e);
            java.lang.String str5 = this.f460505f;
            if (str5 != null) {
                e17 += b36.f.j(3, str5);
            }
            java.lang.String str6 = this.f460506g;
            if (str6 != null) {
                e17 += b36.f.j(4, str6);
            }
            java.lang.String str7 = this.f460507h;
            if (str7 != null) {
                e17 += b36.f.j(5, str7);
            }
            java.lang.String str8 = this.f460508i;
            if (str8 != null) {
                e17 += b36.f.j(6, str8);
            }
            int a17 = e17 + b36.f.a(7, this.f460509m);
            r45.bn bnVar2 = this.f460510n;
            return bnVar2 != null ? a17 + b36.f.i(8, bnVar2.mo75928xcd1e8d8()) : a17;
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
        r45.kv kvVar = (r45.kv) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                kvVar.f460503d = aVar2.g(intValue);
                return 0;
            case 2:
                kvVar.f460504e = aVar2.g(intValue);
                return 0;
            case 3:
                kvVar.f460505f = aVar2.k(intValue);
                return 0;
            case 4:
                kvVar.f460506g = aVar2.k(intValue);
                return 0;
            case 5:
                kvVar.f460507h = aVar2.k(intValue);
                return 0;
            case 6:
                kvVar.f460508i = aVar2.k(intValue);
                return 0;
            case 7:
                kvVar.f460509m = aVar2.c(intValue);
                return 0;
            case 8:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i18 = 0; i18 < size; i18++) {
                    byte[] bArr = (byte[]) j17.get(i18);
                    r45.bn bnVar3 = new r45.bn();
                    if (bArr != null && bArr.length > 0) {
                        bnVar3.mo11468x92b714fd(bArr);
                    }
                    kvVar.f460510n = bnVar3;
                }
                return 0;
            default:
                return -1;
        }
    }
}
