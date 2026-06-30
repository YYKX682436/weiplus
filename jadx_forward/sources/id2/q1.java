package id2;

/* loaded from: classes.dex */
public final class q1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f372287d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f372288e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f372289f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f372290g;

    public q1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, boolean z17, id2.v1 v1Var, android.widget.TextView textView) {
        this.f372287d = k0Var;
        this.f372288e = z17;
        this.f372289f = v1Var;
        this.f372290g = textView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$showBuyConfirmDialog$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$showBuyConfirmDialog$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f372287d.u();
        boolean z18 = this.f372288e;
        id2.v1 v1Var = this.f372289f;
        android.widget.TextView textView = this.f372290g;
        p3325xe03a0797.p3326xc267989b.i2 i2Var = p3325xe03a0797.p3326xc267989b.i2.f392010d;
        if (z18) {
            p3325xe03a0797.p3326xc267989b.l.d(i2Var, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new id2.o1(v1Var, textView, null), 2, null);
        } else {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(i2Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new id2.p1(textView, v1Var, null), 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/uic/FinderLiveGiftPkgUIC$showBuyConfirmDialog$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
