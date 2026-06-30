package com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29;

/* loaded from: classes14.dex */
public class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Notification f231416d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f231417e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 f231418f;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 v0Var, android.app.Notification notification, boolean z17) {
        this.f231418f = v0Var;
        this.f231416d = notification;
        this.f231417e = z17;
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.v0 v0Var = this.f231418f;
        v0Var.f231719y1 = true;
        android.content.Intent intent = new android.content.Intent();
        if (v0Var.f231702n) {
            intent.putExtra("enterMainUIScreenProjectOnline", true);
            intent.putExtra("enterMainUIScreenProjectParams", v0Var.f231703o);
        }
        intent.setFlags(268435456);
        com.p314xaae8f345.mm.p960xd6a841b0.C11142xe8e5c41a c11142xe8e5c41a = v0Var.f231710t;
        intent.putExtra("enterMainUiWxGroupId", c11142xe8e5c41a != null ? c11142xe8e5c41a.f153141f : "");
        intent.setClass(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.ServiceConnectionC16581x3d1d6bd2.class);
        intent.putExtra("notification", this.f231416d);
        intent.putExtra("enterMainUiSource", 1);
        sj3.d4 Zi = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Zi();
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a1 a1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.a1(this);
        com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().getClass();
        boolean z17 = com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231707q.size() > com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.p1884x633fb29.e3.Ri().f231707q.contains(c01.z1.r());
        Zi.getClass();
        Zi.f490010f = intent;
        Zi.f490009e = a1Var;
        if (((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Ui(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)) {
            a1Var.d();
            Zi.f(intent, z17);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MultiTalkSmallWindow", "mini, permission denied");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        tb0.i iVar = (tb0.i) i95.n0.c(tb0.i.class);
        java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.kbt);
        sj3.c4 c4Var = new sj3.c4(a1Var, Zi, intent, z17);
        java.lang.String a17 = n25.a.a();
        ((sb0.f) iVar).getClass();
        com.p314xaae8f345.mm.p2470x93e71c27.p2476xe125c5cf.ActivityC19629x1cf9c994.R6(context, 9, string, c4Var, true, false, a17);
    }
}
