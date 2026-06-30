package com.p314xaae8f345.mm.p2615x3a3fddcb;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/sns_compose/SnsWithTaUI;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "sns-compose_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.sns_compose.SnsWithTaUI */
/* loaded from: classes14.dex */
public final class ActivityC21040xa43a551f extends com.p314xaae8f345.mm.ui.AbstractActivityC21399xe75e5101 {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f274954g = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f274955d;

    /* renamed from: e, reason: collision with root package name */
    public final long f274956e = java.lang.System.currentTimeMillis();

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f274957f = jz5.h.b(new m85.f(this));

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutView */
    public android.view.View mo44092x29ebce5() {
        com.p314xaae8f345.mm.p935xe99f85f3.C11098x3efa6197 c11098x3efa6197 = new com.p314xaae8f345.mm.p935xe99f85f3.C11098x3efa6197(this, null, 2, null);
        c11098x3efa6197.m47820xe9f5bdb7(u0.j.c(880148175, true, new m85.d(this)));
        return c11098x3efa6197;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21399xe75e5101, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f.p1 p1Var = (com.p314xaae8f345.mm.p2615x3a3fddcb.p2616x34628f.p1) ((jz5.n) this.f274957f).mo141623x754a37bb();
        p1Var.getClass();
        p1Var.f275101d = new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("compose_playVideo", this, 0, 4, null);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (!q85.d.f442329a) {
            q85.d.f442329a = true;
            r5.i iVar = new r5.i(context);
            android.graphics.Bitmap.Config bitmapConfig = android.graphics.Bitmap.Config.ARGB_8888;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bitmapConfig, "bitmapConfig");
            c6.c a17 = c6.c.a(iVar.f474059b, null, null, null, bitmapConfig, false, false, null, null, null, null, null, null, 4087, null);
            iVar.f474059b = a17;
            iVar.f474059b = c6.c.a(a17, null, null, null, null, false, false, null, null, null, c6.b.ENABLED, null, null, 3583, null);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList3.add(new jz5.l(new q85.u(), android.net.Uri.class));
            arrayList4.add(new o85.c(context));
            iVar.f474060c = new r5.c(kz5.n0.S0(arrayList), kz5.n0.S0(arrayList2), kz5.n0.S0(arrayList3), kz5.n0.S0(arrayList4));
            r5.j a18 = iVar.a();
            synchronized (r5.a.class) {
                r5.a.f474045b = a18;
            }
        }
        p012xc85e97e9.p016x746ad0e3.app.b mo2533x106ab264 = mo2533x106ab264();
        if (mo2533x106ab264 != null) {
            mo2533x106ab264.o();
        }
        this.f274955d = getIntent().getIntExtra("CONTACT_INFO_UI_SOURCE", 0);
        dx1.f fVar = dx1.g.f326022a;
        java.lang.String d17 = p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6747xb0278183.class).d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
        fVar.g("MomentsTogetherHistoryBrowsing", d17);
        fVar.i("MomentsTogetherHistoryBrowsing", "ifRedDot", java.lang.Integer.valueOf(getIntent().getIntExtra("has_dot", 0)));
        fVar.i("MomentsTogetherHistoryBrowsing", ya.b.f77502x92235c1b, java.lang.Integer.valueOf(this.f274955d));
        fVar.i("MomentsTogetherHistoryBrowsing", "withFriendFeedTime", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        fVar.i("MomentsTogetherHistoryBrowsing", "pageOwnerUsername", "");
        mo54448x9c8c0d33(new m85.e(this));
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f274956e;
        dx1.f fVar = dx1.g.f326022a;
        fVar.i("MomentsTogetherHistoryBrowsing", "withFriendFeedTime", java.lang.Long.valueOf(currentTimeMillis));
        fVar.i("MomentsTogetherHistoryBrowsing", "ownerSetting", 0);
        fVar.i("SnsUserBehaviourInfo", "withFriendsStayTime", java.lang.Long.valueOf(currentTimeMillis));
        dx1.f.b(fVar, "MomentsTogetherHistoryBrowsing", false, false, 6, null);
    }
}
