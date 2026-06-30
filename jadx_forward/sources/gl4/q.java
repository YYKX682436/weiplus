package gl4;

/* loaded from: classes11.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.api.C4990x83627a9 f354408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gl4.z f354409e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f f354410f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bw5.w80 f354411g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qk.y8 f354412h;

    public q(com.p314xaae8f345.mm.api.C4990x83627a9 c4990x83627a9, gl4.z zVar, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f, bw5.w80 w80Var, qk.y8 y8Var) {
        this.f354408d = c4990x83627a9;
        this.f354409e = zVar;
        this.f354410f = activityC1102x9ee2d9f;
        this.f354411g = w80Var;
        this.f354412h = y8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ting/membership/TingMembershipHelper$showTingBindQQMusicDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.api.C4990x83627a9 request = this.f354408d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "tyt_vip_qmusic_authent_wxbean");
        hashMap.put("buy_vip_session", request.f134747g);
        hashMap.put("currscene", java.lang.Integer.valueOf(request.f134748h));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("view_clk", null, hashMap, 5, false);
        this.f354409e.d(this.f354410f, request, this.f354411g, this.f354412h);
        yj0.a.h(this, "com/tencent/mm/plugin/ting/membership/TingMembershipHelper$showTingBindQQMusicDialog$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
