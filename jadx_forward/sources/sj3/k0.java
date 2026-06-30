package sj3;

/* loaded from: classes14.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sj3.a1 f490139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b f490140e;

    public k0(sj3.a1 a1Var, com.p314xaae8f345.mm.p1006xc5476f33.p1881xb81dc565.ui.p1889xd1075a44.C16586x7058535b c16586x7058535b) {
        this.f490139d = a1Var;
        this.f490140e = c16586x7058535b;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic$initNormalControl$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f490139d.onClick(this.f490140e);
        yj0.a.h(this, "com/tencent/mm/plugin/multitalk/ui/widget/ControlPanelLogic$initNormalControl$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
