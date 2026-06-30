package r45;

/* loaded from: classes8.dex */
public class o65 extends r45.js5 {

    /* renamed from: d, reason: collision with root package name */
    public int f463519d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f463520e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f463521f;

    /* renamed from: g, reason: collision with root package name */
    public int f463522g;

    /* renamed from: h, reason: collision with root package name */
    public long f463523h;

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof r45.o65)) {
            return false;
        }
        r45.o65 o65Var = (r45.o65) fVar;
        return n51.f.a(this.f76492x92037252, o65Var.f76492x92037252) && n51.f.a(java.lang.Integer.valueOf(this.f463519d), java.lang.Integer.valueOf(o65Var.f463519d)) && n51.f.a(this.f463520e, o65Var.f463520e) && n51.f.a(this.f463521f, o65Var.f463521f) && n51.f.a(java.lang.Integer.valueOf(this.f463522g), java.lang.Integer.valueOf(o65Var.f463522g)) && n51.f.a(java.lang.Long.valueOf(this.f463523h), java.lang.Long.valueOf(o65Var.f463523h));
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            r45.ie ieVar = this.f76492x92037252;
            if (ieVar != null) {
                fVar.i(1, ieVar.mo75928xcd1e8d8());
                this.f76492x92037252.mo75956x3d5d1f78(fVar);
            }
            fVar.e(2, this.f463519d);
            java.lang.String str = this.f463520e;
            if (str != null) {
                fVar.j(3, str);
            }
            java.lang.String str2 = this.f463521f;
            if (str2 != null) {
                fVar.j(4, str2);
            }
            fVar.e(5, this.f463522g);
            fVar.h(100, this.f463523h);
            return 0;
        }
        if (i17 == 1) {
            r45.ie ieVar2 = this.f76492x92037252;
            int i18 = (ieVar2 != null ? 0 + b36.f.i(1, ieVar2.mo75928xcd1e8d8()) : 0) + b36.f.e(2, this.f463519d);
            java.lang.String str3 = this.f463520e;
            if (str3 != null) {
                i18 += b36.f.j(3, str3);
            }
            java.lang.String str4 = this.f463521f;
            if (str4 != null) {
                i18 += b36.f.j(4, str4);
            }
            return i18 + b36.f.e(5, this.f463522g) + b36.f.h(100, this.f463523h);
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
        r45.o65 o65Var = (r45.o65) objArr[1];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i19 = 0; i19 < size; i19++) {
                byte[] bArr = (byte[]) j17.get(i19);
                r45.ie ieVar3 = new r45.ie();
                if (bArr != null && bArr.length > 0) {
                    ieVar3.mo11468x92b714fd(bArr);
                }
                o65Var.f76492x92037252 = ieVar3;
            }
            return 0;
        }
        if (intValue == 2) {
            o65Var.f463519d = aVar2.g(intValue);
            return 0;
        }
        if (intValue == 3) {
            o65Var.f463520e = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 4) {
            o65Var.f463521f = aVar2.k(intValue);
            return 0;
        }
        if (intValue == 5) {
            o65Var.f463522g = aVar2.g(intValue);
            return 0;
        }
        if (intValue != 100) {
            return -1;
        }
        o65Var.f463523h = aVar2.i(intValue);
        return 0;
    }
}
