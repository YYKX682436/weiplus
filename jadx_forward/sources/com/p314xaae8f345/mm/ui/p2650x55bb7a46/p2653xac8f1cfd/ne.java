package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes.dex */
public final class ne extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.oe f281120d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f281121e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f281122f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.oe oeVar, long j17, int i17) {
        super(0);
        this.f281120d = oeVar;
        this.f281121e = j17;
        this.f281122f = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.Long j17;
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 z07;
        java.util.List A0;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.oe oeVar = this.f281120d;
        java.lang.String x17 = oeVar.f280113d.x();
        com.p314xaae8f345.mm.p2621x8fb0427b.b3 a17 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a();
        int size = (a17 == null || (z07 = a17.z0(x17)) == null || (A0 = z07.A0()) == null) ? 0 : A0.size();
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6789x657ac4d2 c6789x657ac4d2 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6789x657ac4d2();
        c6789x657ac4d2.f141214e = this.f281121e;
        java.lang.String stringExtra = oeVar.f280113d.g().getIntent().getStringExtra("from_create_group_session_id");
        if (stringExtra == null) {
            stringExtra = "";
        }
        c6789x657ac4d2.f141216g = c6789x657ac4d2.b("create_group_sessionid", stringExtra, true);
        c6789x657ac4d2.f141217h = c6789x657ac4d2.b("chat_username", oeVar.f280113d.x(), true);
        c6789x657ac4d2.f141218i = size;
        java.lang.String stringExtra2 = oeVar.f280113d.g().getIntent().getStringExtra("from_create_group_select_num");
        c6789x657ac4d2.f141215f = (stringExtra2 == null || (j17 = r26.h0.j(stringExtra2)) == null) ? 0L : j17.longValue();
        c6789x657ac4d2.f141213d = this.f281122f;
        c6789x657ac4d2.f141219j = 20250909L;
        c6789x657ac4d2.k();
        return jz5.f0.f384359a;
    }
}
