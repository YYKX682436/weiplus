package rn2;

/* loaded from: classes.dex */
public final class i0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f479294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f479295e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f479296f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.dz1 f479297g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ v65.n f479298h;

    public i0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, boolean z17, android.content.Context context, r45.dz1 dz1Var, v65.n nVar) {
        this.f479294d = k0Var;
        this.f479295e = z17;
        this.f479296f = context;
        this.f479297g = dz1Var;
        this.f479298h = nVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateGiftUtil$showBuyConfirmDialog$2$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateGiftUtil$showBuyConfirmDialog$2$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f479294d.u();
        boolean z18 = this.f479295e;
        v65.n nVar = this.f479298h;
        r45.dz1 dz1Var = this.f479297g;
        android.content.Context context = this.f479296f;
        p3325xe03a0797.p3326xc267989b.i2 i2Var = p3325xe03a0797.p3326xc267989b.i2.f392010d;
        if (z18) {
            p3325xe03a0797.p3326xc267989b.l.d(i2Var, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new rn2.g0(context, dz1Var, nVar, null), 2, null);
        } else {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.l.d(i2Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new rn2.h0(context, dz1Var, nVar, null), 2, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/create/FinderLiveLotteryCreateGiftUtil$showBuyConfirmDialog$2$3$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
