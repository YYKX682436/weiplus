package lm3;

/* loaded from: classes10.dex */
public final class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lm3.b0 f401032d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f401033e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lm3.e f401034f;

    public q(lm3.b0 b0Var, in5.s0 s0Var, lm3.e eVar) {
        this.f401032d = b0Var;
        this.f401033e = s0Var;
        this.f401034f = eVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        lm3.b0.n(this.f401032d, this.f401033e, this.f401034f, 1);
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/convert/MvItemConvert$initMvInfo$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
