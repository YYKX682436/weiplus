package df2;

/* loaded from: classes3.dex */
public final class fb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.zb f311665d;

    public fb(df2.zb zbVar) {
        this.f311665d = zbVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveAnchorAiAssistantBannerController$onViewMount$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.zb zbVar = this.f311665d;
        r45.ff1 ff1Var = zbVar.f313477r;
        boolean z17 = ff1Var != null && ff1Var.m75939xb282bd08(7) == 5;
        zbVar.q7(5);
        zbVar.s7(r45.n72.kActionType_AiassistantClose, 2, "");
        if (z17) {
            zbVar.r7(3, df2.eb.f311583d);
        }
        zbVar.u7();
        df2.zb.w7(zbVar, false, null, 2, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LiveAnchorAiAssistantBannerController$onViewMount$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
