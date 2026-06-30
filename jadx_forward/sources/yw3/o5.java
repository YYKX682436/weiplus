package yw3;

/* loaded from: classes.dex */
public final class o5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI f548373d;

    public o5(com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI repairerPatchDemoUI) {
        this.f548373d = repairerPatchDemoUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerPatchDemoUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.repairer.ui.demo.RepairerPatchDemoUI repairerPatchDemoUI = this.f548373d;
        dp.a.m125854x26a183b((android.content.Context) repairerPatchDemoUI, (java.lang.CharSequence) "触发手动安装弹窗", 1).show();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(new yw3.n5(repairerPatchDemoUI), 100L);
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerPatchDemoUI$onCreate$5", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
