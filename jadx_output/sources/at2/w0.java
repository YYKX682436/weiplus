package at2;

/* loaded from: classes3.dex */
public final class w0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ at2.y0 f13771d;

    public w0(at2.y0 y0Var) {
        this.f13771d = y0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/replay/plugin/ReplaySpeedPanelController$onViewMount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        at2.y0.Z6(this.f13771d);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/replay/plugin/ReplaySpeedPanelController$onViewMount$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
