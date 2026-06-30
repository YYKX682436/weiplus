package jm3;

/* loaded from: classes10.dex */
public final class c0 implements com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.g3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a f381833a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c3 f381834b;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a activityC16653xffd2636a, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c3 c3Var) {
        this.f381833a = activityC16653xffd2636a;
        this.f381834b = c3Var;
    }

    public void a(int i17, fm3.q item, boolean z17, fm3.w wVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a activity = this.f381833a;
        if (wVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f435481a;
            ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5.class)).W6(true);
            com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5 z5Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5.class);
            z5Var.getClass();
            p3325xe03a0797.p3326xc267989b.l.d(z5Var.E, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s5(z5Var, item, null), 3, null);
            activity.Z6().animate().translationY(((android.view.View) ((jz5.n) activity.f232403f).mo141623x754a37bb()).getY() - ((android.view.View) ((jz5.n) activity.f232402e).mo141623x754a37bb()).getY()).start();
            ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4) zVar.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4.class)).f232708v = z17;
            activity.Z6().c();
            return;
        }
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a.f232401u;
        android.view.View X6 = activity.X6();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(X6, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$4$2", "onEditItem", "(ILcom/tencent/mm/plugin/mv/model/MusicMVVideoConvertData;ZLcom/tencent/mm/plugin/mv/model/MusicMvAnimationInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        X6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(X6, "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$4$2", "onEditItem", "(ILcom/tencent/mm/plugin/mv/model/MusicMVVideoConvertData;ZLcom/tencent/mm/plugin/mv/model/MusicMvAnimationInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        activity.Y6().m81387x205ac394(i65.a.b(activity.mo55332x76847179(), 12));
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) activity.f232410p).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "access$getMvItemEditThumb(...)");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d Y6 = activity.Y6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Y6, "access$getAlbumFakeThumb(...)");
        android.animation.Animator b17 = wVar.b(fm3.x.a(imageView), Y6, false);
        b17.addListener(new jm3.b0(activity));
        b17.setDuration(250L);
        b17.start();
        pf5.z zVar2 = pf5.z.f435481a;
        ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5) zVar2.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5.class)).W6(true);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5 z5Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5) zVar2.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5.class);
        z5Var2.getClass();
        p3325xe03a0797.p3326xc267989b.l.d(z5Var2.E, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s5(z5Var2, item, null), 3, null);
        activity.Z6().animate().translationY(((android.view.View) ((jz5.n) activity.f232403f).mo141623x754a37bb()).getY() - ((android.view.View) ((jz5.n) activity.f232402e).mo141623x754a37bb()).getY()).start();
        ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4) zVar2.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4.class)).f232708v = z17;
        activity.Z6().c();
    }
}
