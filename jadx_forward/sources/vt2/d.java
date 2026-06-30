package vt2;

/* loaded from: classes3.dex */
public final class d implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vt2.g f521479a;

    public d(vt2.g gVar) {
        this.f521479a = gVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        vt2.g gVar = this.f521479a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gVar.f521490b, "onReceiveValue value" + ((java.lang.String) obj));
        android.app.Activity context = gVar.f521489a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        vt2.g gVar2 = ((zt2.a) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(zt2.a.class)).f557107d;
        if (gVar2 != null) {
            gk2.e eVar = dk2.ef.I;
            r45.i56 i56Var = gVar2.f521493e;
            if (eVar == null || i56Var == null) {
                return;
            }
            android.app.Activity activity = gVar2.f521489a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderLiveShoppingManagerUI");
            p3325xe03a0797.p3326xc267989b.l.d(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14035xa3619e47) activity).f190948v, null, null, new vt2.f(gVar2, eVar, i56Var, null), 3, null);
        }
    }
}
