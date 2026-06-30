package df2;

/* loaded from: classes3.dex */
public final class t7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.s8 f312957d;

    public t7(df2.s8 s8Var) {
        this.f312957d = s8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/GiftFundingCardController$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.s8 s8Var = this.f312957d;
        android.view.View view2 = s8Var.K;
        boolean z17 = false;
        if (view2 != null && !view2.isShown()) {
            z17 = true;
        }
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/GiftFundingCardController$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        s8Var.k7(3);
        if (zl2.r4.f555483a.y1(s8Var.getStore().getLiveRoomData())) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(s8Var.O6(), 1, true);
            k0Var.q(s8Var.O6().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dhy), 1);
            k0Var.f293405n = new df2.s7(k0Var, s8Var);
            k0Var.f293414s = (db5.t4) ((jz5.n) s8Var.A1).mo141623x754a37bb();
            k0Var.v();
        } else {
            s8Var.m7(df2.h7.f311840m);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/GiftFundingCardController$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
