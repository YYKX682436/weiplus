package jm3;

/* loaded from: classes10.dex */
public final class j0 implements com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.w4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a f381861a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c3 f381862b;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a activityC16653xffd2636a, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c3 c3Var) {
        this.f381861a = activityC16653xffd2636a;
        this.f381862b = c3Var;
    }

    public void a(boolean z17) {
        int i17;
        int i18 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a.f232401u;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a activityC16653xffd2636a = this.f381861a;
        android.view.View X6 = activityC16653xffd2636a.X6();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(0);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(X6, arrayList.toArray(), "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$5", "onCancel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        X6.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(X6, "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$5", "onCancel", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        activityC16653xffd2636a.Y6().m81387x205ac394(i65.a.b(activityC16653xffd2636a.mo55332x76847179(), 12));
        pf5.z zVar = pf5.z.f435481a;
        p012xc85e97e9.p093xedfae76a.c1 a17 = zVar.a(activityC16653xffd2636a).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 h4Var = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4) a17;
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4 h4Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4) zVar.a(activityC16653xffd2636a).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.h4.class);
        android.view.View mo7935xa188593e = ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) ((jz5.n) h4Var2.f232697h).mo141623x754a37bb()).mo7935xa188593e(h4Var2.f232700n.f233397m);
        android.widget.ImageView imageView = (android.widget.ImageView) ((jz5.n) activityC16653xffd2636a.f232410p).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "access$getMvItemEditThumb(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo7935xa188593e);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d Y6 = activityC16653xffd2636a.Y6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Y6, "access$getAlbumFakeThumb(...)");
        android.animation.Animator b17 = fm3.x.a(imageView).b(fm3.x.a(mo7935xa188593e), Y6, h4Var.f232708v);
        b17.addListener(new jm3.e0(activityC16653xffd2636a));
        b17.setDuration(250L);
        b17.start();
        jm3.f0 f0Var = new jm3.f0(z17);
        int i19 = h4Var.f232700n.f233397m;
        java.util.ArrayList arrayList2 = h4Var.f232694e;
        fm3.q qVar = (fm3.q) kz5.n0.a0(arrayList2, i19);
        if (qVar != null) {
            f0Var.mo149xb9724478(java.lang.Integer.valueOf(i19), qVar);
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5) zVar.a(activityC16653xffd2636a).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.z5.class)).W6(false);
        if (h4Var.f232708v && (i17 = h4Var.f232702p) >= 0 && i17 < arrayList2.size()) {
            java.lang.Object obj = arrayList2.get(h4Var.f232702p);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            fm3.q qVar2 = (fm3.q) obj;
            int i27 = h4Var.f232702p;
            fm3.q qVar3 = qVar2.f345647o;
            if (qVar3 != null) {
                qVar3.f345643h = qVar2.f345643h;
                arrayList2.set(i27, qVar3);
                h4Var.R6().m8147xed6e4d18(i27);
                h4Var.V6(i27);
            }
        }
        activityC16653xffd2636a.Z6().animate().translationY(0.0f).start();
        activityC16653xffd2636a.Z6().d();
        if (this.f381862b.P6()) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16653xffd2636a.V6(activityC16653xffd2636a);
    }
}
