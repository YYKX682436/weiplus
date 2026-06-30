package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd;

/* loaded from: classes.dex */
public final class r implements com.p314xaae8f345.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.r f183259a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1419xb9d38a2d.p1421xac8f1cfd.r();

    @Override // com.p314xaae8f345.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NewLife.FinderAccountSwitchUICForNewLife", "enterFinderCreateContactUIForResult, resultCode:" + i17 + " curFinderUserName:" + e17);
        if (e17 == null || r26.n0.N(e17)) {
            return;
        }
        ((nn3.f) ((ra0.x) i95.n0.c(ra0.x.class))).Ni("create_new_profile_succ", null, kz5.b1.e(new jz5.l("profile_finderusername", e17)), false);
    }
}
