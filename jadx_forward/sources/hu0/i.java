package hu0;

/* loaded from: classes5.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f366566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hu0.l f366567e;

    public i(boolean z17, hu0.l lVar) {
        this.f366566d = z17;
        this.f366567e = lVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationControlUIC$onViewCreated$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = this.f366566d;
        hu0.l lVar = this.f366567e;
        if (z17) {
            hu0.l.O6(lVar, "effect_modify_complete_continue_post");
        }
        lVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.ControlUIC", "onPublishClicked");
        gu0.k2 k2Var = (gu0.k2) ((jz5.n) lVar.f366570d).mo141623x754a37bb();
        if (k2Var != null) {
            k2Var.w();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = lVar.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(hu0.o.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            hu0.o oVar = (hu0.o) a17;
            oVar.Q6();
            lVar.R6(false);
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k2Var.f357258a.f338228a, "reedit");
            p3325xe03a0797.p3326xc267989b.y0 y0Var = k2Var.f357261d;
            if (b17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.ControlUIC", "onPublishClicked: reedit scene");
                hu0.f fVar = new hu0.f(k2Var, oVar, lVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.Session", "exportVideoForReedit: start");
                p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new gu0.q0(k2Var, fVar, null), 3, null);
            } else {
                hu0.h hVar = new hu0.h(k2Var, oVar, lVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.Session", "exportVideoAndUploadTemplate: start");
                p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new gu0.p0(k2Var, hVar, null), 3, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/mj_publisher/finder/composing_creation/preview/uic/ComposingCreationControlUIC$onViewCreated$2$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
