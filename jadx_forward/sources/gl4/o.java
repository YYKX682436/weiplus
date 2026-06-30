package gl4;

/* loaded from: classes11.dex */
public final class o implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.api.C4990x83627a9 f354403d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ gl4.z f354404e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f f354405f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qk.y8 f354406g;

    public o(com.p314xaae8f345.mm.api.C4990x83627a9 c4990x83627a9, gl4.z zVar, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activityC1102x9ee2d9f, qk.y8 y8Var) {
        this.f354403d = c4990x83627a9;
        this.f354404e = zVar;
        this.f354405f = activityC1102x9ee2d9f;
        this.f354406g = y8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ting/membership/TingMembershipHelper$showTingBindQQMusicDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.api.C4990x83627a9 request = this.f354403d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("view_id", "tyt_vip_qmusic_authent_free");
        hashMap.put("buy_vip_session", request.f134747g);
        hashMap.put("currscene", java.lang.Integer.valueOf(request.f134748h));
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("view_clk", null, hashMap, 5, false);
        gl4.z zVar = this.f354404e;
        zVar.getClass();
        p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new gl4.i(zVar, this.f354405f, this.f354406g, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/ting/membership/TingMembershipHelper$showTingBindQQMusicDialog$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
