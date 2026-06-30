package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b;

/* loaded from: classes4.dex */
public final class o extends com.p314xaae8f345.mm.p944x882e457a.i {

    /* renamed from: y, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.j f157403y = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.j(null);

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f157404m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f157405n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f157406o;

    /* renamed from: p, reason: collision with root package name */
    public final int f157407p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f157408q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f157409r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f157410s;

    /* renamed from: t, reason: collision with root package name */
    public final int f157411t;

    /* renamed from: u, reason: collision with root package name */
    public int f157412u;

    /* renamed from: v, reason: collision with root package name */
    public final long f157413v;

    /* renamed from: w, reason: collision with root package name */
    public long f157414w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f157415x;

    public /* synthetic */ o(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i18 & 1) != 0 ? null : str, (i18 & 2) != 0 ? null : str2, (i18 & 4) != 0 ? null : str3, (i18 & 8) != 0 ? 0 : i17, (i18 & 16) != 0 ? null : str4);
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    public pq5.g l() {
        k91.m4 ij6;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11829x68027553 w07;
        k91.m4 ij7;
        int i17 = 0;
        java.lang.String str = this.f157404m;
        boolean z17 = str == null || str.length() == 0;
        java.lang.String str2 = this.f157405n;
        if (z17) {
            if (str2 == null || str2.length() == 0) {
                t();
                return pq5.h.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.m(this));
            }
        }
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij() == null) {
            t();
            return pq5.h.d(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.n(this));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f157409r, "do cgi with username[" + str + "] appId:[" + str2 + ']');
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 b17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.e8.b();
        k91.v5 v5Var = null;
        java.lang.String W0 = b17 != null ? b17.W0() : null;
        java.lang.String str3 = android.os.Build.VERSION.RELEASE;
        r45.ib5 ib5Var = new r45.ib5();
        r45.kj6 kj6Var = new r45.kj6();
        if (str2 == null || str2.length() == 0) {
            kj6Var.f460300d = str;
            if (!(str == null || str.length() == 0) && (ij6 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij()) != null) {
                v5Var = ij6.n1(str, new java.lang.String[0]);
            }
        } else {
            kj6Var.f460304h = str2;
            if (!(str2 == null || str2.length() == 0) && (ij7 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.ij()) != null) {
                v5Var = ij7.k1(str2, new java.lang.String[0]);
            }
        }
        if (v5Var != null && (w07 = v5Var.w0()) != null) {
            i17 = w07.f158977d;
        }
        kj6Var.f460301e = i17;
        kj6Var.f460303g = this.f157406o;
        ib5Var.f458435d = kj6Var;
        ib5Var.f458436e = true;
        ib5Var.f458437f = this.f157407p;
        ib5Var.f458439h = this.f157408q;
        ib5Var.f458440i = str3;
        ib5Var.f458441m = W0;
        lVar.f152197a = ib5Var;
        lVar.f152198b = new r45.jb5();
        lVar.f152199c = this.f157410s;
        lVar.f152200d = this.f157411t;
        p(lVar.a());
        pq5.g l17 = super.l();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
        return l17;
    }

    public final void s(boolean z17) {
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.d5.a()) {
            l().b(lm5.d.f401134b, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.l(this, z17));
            return;
        }
        ((ku5.t0) ku5.t0.f394148d).g(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.p1030xc0dd282b.k(this, z17));
    }

    public final void t() {
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        lVar.f152197a = new r45.ib5();
        lVar.f152198b = new r45.jb5();
        lVar.f152199c = this.f157410s;
        lVar.f152200d = this.f157411t;
        p(lVar.a());
    }

    public o(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4) {
        this.f157404m = str;
        this.f157405n = str2;
        this.f157406o = str3;
        this.f157407p = i17;
        this.f157408q = str4;
        this.f157409r = "MicroMsg.AppBrand.CgiPreDownloadCode(" + hashCode() + ')';
        this.f157410s = "/cgi-bin/mmbiz-bin/wxasync/wxaapp_predownloadcode";
        this.f157411t = 1479;
        this.f157413v = java.lang.System.currentTimeMillis();
    }
}
