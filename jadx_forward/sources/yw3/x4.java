package yw3;

/* loaded from: classes.dex */
public final class x4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.repairer.ui.demo.RepairerNewLifeDebugUI f548462d;

    public x4(com.tencent.mm.plugin.repairer.ui.demo.RepairerNewLifeDebugUI repairerNewLifeDebugUI) {
        this.f548462d = repairerNewLifeDebugUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        j75.f Ai;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/repairer/ui/demo/RepairerNewLifeDebugUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = ra0.y.f475014g1;
        ra0.y Di = ((en3.v) ((ra0.v) i95.n0.c(ra0.v.class))).Di();
        if (Di != null && (Ai = ((en3.l0) Di).Ai()) != null) {
            Ai.B3(new sa0.b());
        }
        db5.t7.m(this.f548462d, "已设置");
        yj0.a.h(this, "com/tencent/mm/plugin/repairer/ui/demo/RepairerNewLifeDebugUI$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
