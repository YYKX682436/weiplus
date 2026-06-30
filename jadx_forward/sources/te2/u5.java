package te2;

/* loaded from: classes3.dex */
public final class u5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f500005d;

    public u5(te2.p8 p8Var) {
        this.f500005d = p8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initBottomArea$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        te2.p8 p8Var = this.f500005d;
        te2.p8.n7(p8Var, 10, 0, 2, null);
        te2.rc rcVar = p8Var.A1;
        r45.h32 h32Var = rcVar.f499924b;
        java.lang.Integer valueOf = h32Var != null ? java.lang.Integer.valueOf(h32Var.m75939xb282bd08(18)) : null;
        r45.h32 h32Var2 = p8Var.f499853p1;
        if (h32Var2 == null) {
            h32Var2 = rcVar.f499924b;
        }
        if (h32Var2 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.c80) ((jz5.n) p8Var.W).mo141623x754a37bb()).e0(h32Var2, 1, new te2.t5(valueOf, p8Var));
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initBottomArea$4", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
