package te2;

/* loaded from: classes3.dex */
public final class y5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f500078d;

    public y5(te2.p8 p8Var) {
        this.f500078d = p8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initBottomArea$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        te2.p8 p8Var = this.f500078d;
        yz5.p pVar = p8Var.G1;
        if (pVar != null) {
            pVar.mo149xb9724478(p8Var.f499866y1, java.lang.Integer.valueOf(p8Var.f499862x0));
        } else {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new te2.b8(p8Var, false, null), 3, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initBottomArea$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
