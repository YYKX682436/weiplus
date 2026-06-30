package r45;

/* loaded from: classes15.dex */
public class kd6 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public r45.bn6 f460134d;

    /* renamed from: e, reason: collision with root package name */
    public r45.bn6 f460135e;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f460137g;

    /* renamed from: h, reason: collision with root package name */
    public int f460138h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f460139i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f460140m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f460141n;

    /* renamed from: f, reason: collision with root package name */
    public boolean f460136f = false;

    /* renamed from: o, reason: collision with root package name */
    public long f460142o = 0;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.kd6)) {
            return false;
        }
        r45.kd6 kd6Var = (r45.kd6) fVar;
        return n51.f.a(this.f460134d, kd6Var.f460134d) && n51.f.a(this.f460135e, kd6Var.f460135e) && n51.f.a(java.lang.Boolean.valueOf(this.f460136f), java.lang.Boolean.valueOf(kd6Var.f460136f)) && n51.f.a(this.f460137g, kd6Var.f460137g) && n51.f.a(java.lang.Integer.valueOf(this.f460138h), java.lang.Integer.valueOf(kd6Var.f460138h)) && n51.f.a(this.f460139i, kd6Var.f460139i) && n51.f.a(this.f460140m, kd6Var.f460140m) && n51.f.a(this.f460141n, kd6Var.f460141n) && n51.f.a(java.lang.Long.valueOf(this.f460142o), java.lang.Long.valueOf(kd6Var.f460142o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.bn6 bn6Var = this.f460134d;
            if (bn6Var != null) {
                fVar.i(1, bn6Var.mo75928xcd1e8d8());
                this.f460134d.mo75956x3d5d1f78(fVar);
            }
            r45.bn6 bn6Var2 = this.f460135e;
            if (bn6Var2 != null) {
                fVar.i(2, bn6Var2.mo75928xcd1e8d8());
                this.f460135e.mo75956x3d5d1f78(fVar);
            }
            fVar.a(3, this.f460136f);
            java.lang.String str = this.f460137g;
            if (str != null) {
                fVar.j(4, str);
            }
            fVar.e(5, this.f460138h);
            java.lang.String str2 = this.f460139i;
            if (str2 != null) {
                fVar.j(6, str2);
            }
            java.lang.String str3 = this.f460140m;
            if (str3 != null) {
                fVar.j(7, str3);
            }
            java.lang.String str4 = this.f460141n;
            if (str4 != null) {
                fVar.j(8, str4);
            }
            fVar.h(9, this.f460142o);
            return 0;
        }
        if (i17 == 1) {
            r45.bn6 bn6Var3 = this.f460134d;
            int i18 = bn6Var3 != null ? 0 + b36.f.i(1, bn6Var3.mo75928xcd1e8d8()) : 0;
            r45.bn6 bn6Var4 = this.f460135e;
            if (bn6Var4 != null) {
                i18 += b36.f.i(2, bn6Var4.mo75928xcd1e8d8());
            }
            int a17 = i18 + b36.f.a(3, this.f460136f);
            java.lang.String str5 = this.f460137g;
            if (str5 != null) {
                a17 += b36.f.j(4, str5);
            }
            int e17 = a17 + b36.f.e(5, this.f460138h);
            java.lang.String str6 = this.f460139i;
            if (str6 != null) {
                e17 += b36.f.j(6, str6);
            }
            java.lang.String str7 = this.f460140m;
            if (str7 != null) {
                e17 += b36.f.j(7, str7);
            }
            java.lang.String str8 = this.f460141n;
            if (str8 != null) {
                e17 += b36.f.j(8, str8);
            }
            return e17 + b36.f.h(9, this.f460142o);
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
        r45.kd6 kd6Var = (r45.kd6) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr = (byte[]) j17.get(i19);
                    r45.bn6 bn6Var5 = new r45.bn6();
                    if (bArr != null && bArr.length > 0) {
                        bn6Var5.mo11468x92b714fd(bArr);
                    }
                    kd6Var.f460134d = bn6Var5;
                }
                return 0;
            case 2:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr2 = (byte[]) j18.get(i27);
                    r45.bn6 bn6Var6 = new r45.bn6();
                    if (bArr2 != null && bArr2.length > 0) {
                        bn6Var6.mo11468x92b714fd(bArr2);
                    }
                    kd6Var.f460135e = bn6Var6;
                }
                return 0;
            case 3:
                kd6Var.f460136f = aVar2.c(intValue);
                return 0;
            case 4:
                kd6Var.f460137g = aVar2.k(intValue);
                return 0;
            case 5:
                kd6Var.f460138h = aVar2.g(intValue);
                return 0;
            case 6:
                kd6Var.f460139i = aVar2.k(intValue);
                return 0;
            case 7:
                kd6Var.f460140m = aVar2.k(intValue);
                return 0;
            case 8:
                kd6Var.f460141n = aVar2.k(intValue);
                return 0;
            case 9:
                kd6Var.f460142o = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
