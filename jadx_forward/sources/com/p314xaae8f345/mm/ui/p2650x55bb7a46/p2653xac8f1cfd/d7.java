package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes11.dex */
public class d7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f280459d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f280460e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f280461f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f280462g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f7 f280463h;

    public d7(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f7 f7Var, java.lang.String str, int i17, int i18, int i19, int i27) {
        this.f280463h = f7Var;
        this.f280459d = str;
        this.f280460e = i17;
        this.f280461f = i19;
        this.f280462g = i27;
    }

    @Override // java.lang.Runnable
    public void run() {
        long j17;
        long j18;
        java.lang.Class cls;
        int i17;
        java.lang.String str;
        android.database.Cursor B;
        int i18;
        java.lang.String str2 = this.f280459d;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return;
        }
        int wi6 = ((py.a) ((qy.i) i95.n0.c(qy.i.class))).wi(str2);
        xg3.m0 u17 = c01.d9.b().u();
        final java.lang.String str3 = this.f280459d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.f7 f7Var = this.f280463h;
        long j19 = f7Var.f280558r;
        long j27 = f7Var.f280559s;
        final com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var = (com.p314xaae8f345.mm.p2621x8fb0427b.g9) u17;
        g9Var.getClass();
        if (j27 < j19) {
            j18 = j19;
            j17 = j27;
        } else {
            j17 = j19;
            j18 = j27;
        }
        final java.lang.String X8 = g9Var.X8(str3);
        if (g9Var.Da(X8)) {
            cls = qy.i.class;
            i17 = wi6;
            str = null;
            final long j28 = j18;
            final long j29 = j17;
            final long j37 = j17;
            B = ot0.c3.l().c("getCursorInTimeLimit", new yz5.a() { // from class: com.tencent.mm.storage.g9$$i7
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    return ot0.z2.f430355a.S(com.p314xaae8f345.mm.p2621x8fb0427b.g9.this.f275522r, X8, str3, j29, j28);
                }
            }, new yz5.a() { // from class: com.tencent.mm.storage.g9$$j7
                @Override // yz5.a
                /* renamed from: invoke */
                public final java.lang.Object mo152xb9724478() {
                    com.p314xaae8f345.mm.p2621x8fb0427b.g9 g9Var2 = com.p314xaae8f345.mm.p2621x8fb0427b.g9.this;
                    g9Var2.getClass();
                    return g9Var2.f275522r.B("SELECT * FROM " + X8 + " WHERE" + g9Var2.Z8(str3) + "AND createTime >= " + j37 + " AND createTime <= " + j28, null);
                }
            });
        } else {
            cls = qy.i.class;
            i17 = wi6;
            str = null;
            long j38 = j18;
            long j39 = j17;
            if (g9Var.Pb(X8)) {
                B = ot0.z2.f430355a.S(g9Var.f275522r, X8, str3, j39, j38);
            } else {
                B = g9Var.f275522r.B("SELECT * FROM " + X8 + " WHERE" + g9Var.Z8(str3) + "AND createTime >= " + j39 + " AND createTime <= " + j38, null);
            }
        }
        int i19 = 0;
        if (B == null || !B.moveToFirst()) {
            i18 = 0;
        } else {
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 f9Var = new com.p314xaae8f345.mm.p2621x8fb0427b.f9();
            int i27 = 0;
            do {
                f9Var.mo9015xbf5d97fd(B);
                if (f9Var.A0() == 1) {
                    i27++;
                } else {
                    i19++;
                }
            } while (B.moveToNext());
            i18 = i19;
            i19 = i27;
        }
        if (B != null) {
            B.close();
        }
        long j47 = f7Var.f280559s;
        long j48 = f7Var.f280558r;
        int i28 = f7Var.f280560t;
        int i29 = f7Var.f280560t;
        f7Var.f280113d.r();
        int i37 = f7Var.f280562v;
        java.lang.String str4 = f7Var.f280563w;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6772x91863c0f c6772x91863c0f = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6772x91863c0f();
        c6772x91863c0f.f140968d = c6772x91863c0f.b("ChatRoomID", str2, true);
        c6772x91863c0f.f140969e = f7Var.f280559s - f7Var.f280558r;
        c6772x91863c0f.f140970f = i17;
        int i38 = f7Var.f280560t;
        c6772x91863c0f.f140971g = i18 + i38;
        c6772x91863c0f.f140972h = i19;
        c6772x91863c0f.f140973i = i38;
        c6772x91863c0f.f140974j = this.f280460e;
        c6772x91863c0f.f140975k = this.f280462g;
        c6772x91863c0f.f140976l = c6772x91863c0f.b("SessionId", f7Var.f280113d.r(), true);
        c6772x91863c0f.f140977m = f7Var.f280549f;
        c6772x91863c0f.f140978n = this.f280461f;
        c6772x91863c0f.f140979o = f7Var.f280562v;
        ((py.a) ((qy.i) i95.n0.c(cls))).getClass();
        c6772x91863c0f.f140980p = c01.v1.y(str2) ? 1L : 0L;
        java.lang.String str5 = f7Var.f280563w;
        c6772x91863c0f.f140982r = c6772x91863c0f.b("RedWord", str5 != null ? str5.replace(",", ";") : str, true);
        c6772x91863c0f.k();
    }
}
