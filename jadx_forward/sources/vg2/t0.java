package vg2;

/* loaded from: classes3.dex */
public final class t0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vg2.v0 f518119d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f518120e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ km2.q f518121f;

    public t0(vg2.v0 v0Var, java.util.List list, km2.q qVar) {
        this.f518119d = v0Var;
        this.f518120e = list;
        this.f518121f = qVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget$showWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        vg2.v0 v0Var = this.f518119d;
        vg2.j0 j0Var = new vg2.j0(v0Var.f518133a);
        j0Var.f518056h = vg2.r0.f518092d;
        j0Var.f518057i = new vg2.s0(v0Var);
        java.util.List couponInfoList = this.f518120e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(couponInfoList, "couponInfoList");
        j0Var.f518062q = this.f518121f;
        java.util.ArrayList arrayList2 = (java.util.ArrayList) j0Var.f518061p;
        arrayList2.clear();
        arrayList2.addAll(couponInfoList);
        vg2.h0 h0Var = j0Var.f518060o;
        if (h0Var != null) {
            h0Var.m8146xced61ae5();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = j0Var.f518058m;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setOnClickListener(new vg2.i0(j0Var));
        }
        j0Var.w();
        v0Var.b();
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/gift/widget/GiftPkSelectPanelWidget$showWidget$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
