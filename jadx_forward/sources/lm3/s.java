package lm3;

/* loaded from: classes10.dex */
public final class s implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm3.b0 f401038d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lm3.e f401039e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f401040f;

    public s(lm3.b0 b0Var, lm3.e eVar, in5.s0 s0Var) {
        this.f401038d = b0Var;
        this.f401039e = eVar;
        this.f401040f = s0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lm3.b0 b0Var = this.f401038d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = b0Var.f401003e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e1.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        lm3.e eVar = this.f401039e;
        ((com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e1) a17).Q6(eVar.f401015d, 0L, new lm3.r(eVar, b0Var, this.f401040f));
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
