package lm3;

/* loaded from: classes10.dex */
public final class v implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm3.b0 f401048d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lm3.e f401049e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f401050f;

    public v(lm3.b0 b0Var, lm3.e eVar, in5.s0 s0Var) {
        this.f401048d = b0Var;
        this.f401049e = eVar;
        this.f401050f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lm3.b0 b0Var = this.f401048d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = b0Var.f401003e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.e4 e4Var = ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e1) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e1.class)).f232642g;
        if (e4Var.isShowing()) {
            e4Var.dismiss();
        }
        lm3.e eVar = this.f401049e;
        fm3.u musicMv = eVar.f401015d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(musicMv, "musicMv");
        int i17 = musicMv.f345669p;
        boolean z17 = true;
        if (i17 != 1 && i17 != 4) {
            z17 = false;
        }
        if (z17) {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = b0Var.f401003e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
            p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity2).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q7.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q7) a17).O6(this.f401050f, eVar.f401015d, 2);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
