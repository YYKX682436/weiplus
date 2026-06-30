package f21;

/* loaded from: classes11.dex */
public class d extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f340380d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f340381e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f340382f;

    /* renamed from: g, reason: collision with root package name */
    public f21.h0 f340383g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f340384h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof f21.d)) {
            return false;
        }
        f21.d dVar = (f21.d) fVar;
        return n51.f.a(this.f340380d, dVar.f340380d) && n51.f.a(this.f340381e, dVar.f340381e) && n51.f.a(this.f340382f, dVar.f340382f) && n51.f.a(this.f340383g, dVar.f340383g) && n51.f.a(this.f340384h, dVar.f340384h);
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f340380d;
            if (str != null) {
                fVar.j(1, str);
            }
            java.lang.String str2 = this.f340381e;
            if (str2 != null) {
                fVar.j(2, str2);
            }
            java.lang.String str3 = this.f340382f;
            if (str3 != null) {
                fVar.j(3, str3);
            }
            f21.h0 h0Var = this.f340383g;
            if (h0Var != null) {
                fVar.i(4, h0Var.mo75928xcd1e8d8());
                this.f340383g.mo75956x3d5d1f78(fVar);
            }
            java.lang.String str4 = this.f340384h;
            if (str4 != null) {
                fVar.j(5, str4);
            }
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str5 = this.f340380d;
            int j17 = str5 != null ? 0 + b36.f.j(1, str5) : 0;
            java.lang.String str6 = this.f340381e;
            if (str6 != null) {
                j17 += b36.f.j(2, str6);
            }
            java.lang.String str7 = this.f340382f;
            if (str7 != null) {
                j17 += b36.f.j(3, str7);
            }
            f21.h0 h0Var2 = this.f340383g;
            if (h0Var2 != null) {
                j17 += b36.f.i(4, h0Var2.mo75928xcd1e8d8());
            }
            java.lang.String str8 = this.f340384h;
            return str8 != null ? j17 + b36.f.j(5, str8) : j17;
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
        f21.d dVar = (f21.d) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            dVar.f340380d = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 2) {
            dVar.f340381e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 3) {
            dVar.f340382f = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 4) {
            if (intValue != 5) {
                return -1;
            }
            dVar.f340384h = aVar2.k(intValue);
            return 0;
        }
        java.util.LinkedList j18 = aVar2.j(intValue);
        int size = j18.size();
        for (int i18 = 0; i18 < size; i18++) {
            byte[] bArr = (byte[]) j18.get(i18);
            f21.h0 h0Var3 = new f21.h0();
            if (bArr != null && bArr.length > 0) {
                h0Var3.mo11468x92b714fd(bArr);
            }
            dVar.f340383g = h0Var3;
        }
        return 0;
    }
}
