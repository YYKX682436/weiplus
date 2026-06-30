package t45;

/* loaded from: classes9.dex */
public class f0 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public t45.e0 f497084d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f497085e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f497086f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f497087g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f497088h;

    /* renamed from: i, reason: collision with root package name */
    public long f497089i;

    /* renamed from: m, reason: collision with root package name */
    public t45.g0 f497090m;

    /* renamed from: n, reason: collision with root package name */
    public int f497091n;

    /* renamed from: o, reason: collision with root package name */
    public long f497092o;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof t45.f0)) {
            return false;
        }
        t45.f0 f0Var = (t45.f0) fVar;
        return n51.f.a(this.f497084d, f0Var.f497084d) && n51.f.a(this.f497085e, f0Var.f497085e) && n51.f.a(this.f497086f, f0Var.f497086f) && n51.f.a(this.f497087g, f0Var.f497087g) && n51.f.a(this.f497088h, f0Var.f497088h) && n51.f.a(java.lang.Long.valueOf(this.f497089i), java.lang.Long.valueOf(f0Var.f497089i)) && n51.f.a(this.f497090m, f0Var.f497090m) && n51.f.a(java.lang.Integer.valueOf(this.f497091n), java.lang.Integer.valueOf(f0Var.f497091n)) && n51.f.a(java.lang.Long.valueOf(this.f497092o), java.lang.Long.valueOf(f0Var.f497092o));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        java.util.LinkedList linkedList = this.f497086f;
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            t45.e0 e0Var = this.f497084d;
            if (e0Var != null) {
                fVar.i(1, e0Var.mo75928xcd1e8d8());
                this.f497084d.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str = this.f497085e;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.g(3, 1, linkedList);
            java.lang.String str2 = this.f497087g;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            java.lang.String str3 = this.f497088h;
            if (str3 != null) {
                fVar.j(5, str3);
            }
            fVar.h(6, this.f497089i);
            t45.g0 g0Var = this.f497090m;
            if (g0Var != null) {
                fVar.i(7, g0Var.mo75928xcd1e8d8());
                this.f497090m.mo75956x3d5d1f78(fVar);
            }
            fVar.e(8, this.f497091n);
            fVar.h(9, this.f497092o);
            return 0;
        }
        if (i17 == 1) {
            t45.e0 e0Var2 = this.f497084d;
            int i18 = e0Var2 != null ? 0 + b36.f.i(1, e0Var2.mo75928xcd1e8d8()) : 0;
            java.lang.String str4 = this.f497085e;
            if (str4 != null) {
                i18 += b36.f.j(2, str4);
            }
            int g17 = i18 + b36.f.g(3, 1, linkedList);
            java.lang.String str5 = this.f497087g;
            if (str5 != null) {
                g17 += b36.f.j(4, str5);
            }
            java.lang.String str6 = this.f497088h;
            if (str6 != null) {
                g17 += b36.f.j(5, str6);
            }
            int h17 = g17 + b36.f.h(6, this.f497089i);
            t45.g0 g0Var2 = this.f497090m;
            if (g0Var2 != null) {
                h17 += b36.f.i(7, g0Var2.mo75928xcd1e8d8());
            }
            return h17 + b36.f.e(8, this.f497091n) + b36.f.h(9, this.f497092o);
        }
        if (i17 == 2) {
            byte[] bArr = (byte[]) objArr[0];
            linkedList.clear();
            c36.a aVar = new c36.a(bArr, com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
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
        t45.f0 f0Var = (t45.f0) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        switch (intValue) {
            case 1:
                java.util.LinkedList j17 = aVar2.j(intValue);
                int size = j17.size();
                for (int i19 = 0; i19 < size; i19++) {
                    byte[] bArr2 = (byte[]) j17.get(i19);
                    t45.e0 e0Var3 = new t45.e0();
                    if (bArr2 != null && bArr2.length > 0) {
                        e0Var3.mo11468x92b714fd(bArr2);
                    }
                    f0Var.f497084d = e0Var3;
                }
                return 0;
            case 2:
                f0Var.f497085e = aVar2.k(intValue);
                return 0;
            case 3:
                f0Var.f497086f.add(aVar2.k(intValue));
                return 0;
            case 4:
                f0Var.f497087g = aVar2.k(intValue);
                return 0;
            case 5:
                f0Var.f497088h = aVar2.k(intValue);
                return 0;
            case 6:
                f0Var.f497089i = aVar2.i(intValue);
                return 0;
            case 7:
                java.util.LinkedList j18 = aVar2.j(intValue);
                int size2 = j18.size();
                for (int i27 = 0; i27 < size2; i27++) {
                    byte[] bArr3 = (byte[]) j18.get(i27);
                    t45.g0 g0Var3 = new t45.g0();
                    if (bArr3 != null && bArr3.length > 0) {
                        g0Var3.mo11468x92b714fd(bArr3);
                    }
                    f0Var.f497090m = g0Var3;
                }
                return 0;
            case 8:
                f0Var.f497091n = aVar2.g(intValue);
                return 0;
            case 9:
                f0Var.f497092o = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }
}
