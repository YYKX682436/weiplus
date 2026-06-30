package com.tencent.mm.plugin.finder.account.component;

/* loaded from: classes.dex */
public final class r implements com.tencent.mm.ui.zc {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.account.component.r f101726a = new com.tencent.mm.plugin.finder.account.component.r();

    @Override // com.tencent.mm.ui.zc
    public final void a(int i17, android.content.Intent intent) {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        com.tencent.mars.xlog.Log.i("MicroMsg.NewLife.FinderAccountSwitchUICForNewLife", "enterFinderCreateContactUIForResult, resultCode:" + i17 + " curFinderUserName:" + e17);
        if (e17 == null || r26.n0.N(e17)) {
            return;
        }
        ((nn3.f) ((ra0.x) i95.n0.c(ra0.x.class))).Ni("create_new_profile_succ", null, kz5.b1.e(new jz5.l("profile_finderusername", e17)), false);
    }
}
