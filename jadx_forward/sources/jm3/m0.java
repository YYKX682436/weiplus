package jm3;

/* loaded from: classes10.dex */
public final class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c3 f381868d;

    public m0(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c3 c3Var) {
        this.f381868d = c3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$fixTV$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.c3 c3Var = this.f381868d;
        java.lang.Integer num = (java.lang.Integer) c3Var.O6().mo3195x754a37bb();
        if (num == null || num.intValue() != 0) {
            c3Var.O6().mo7808x76db6cb1(0);
            fm3.g0 g0Var = fm3.g0.f345603a;
            fm3.g0.f345604b.D = 2L;
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6775xb6999670 c17 = g0Var.c();
            c17.f141015k = 12L;
            c17.k();
            c17.o();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/mv/ui/MusicMvMakerUI$onCreate$fixTV$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
