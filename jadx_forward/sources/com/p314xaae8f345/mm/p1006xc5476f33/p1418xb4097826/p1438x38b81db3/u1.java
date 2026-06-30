package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class u1 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.x1 f186192d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f186193e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 f186194f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186195g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter f186196h;

    public u1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.x1 x1Var, so2.y0 y0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 c15276x168ec665, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter nPresenter) {
        this.f186192d = x1Var;
        this.f186193e = y0Var;
        this.f186194f = c15276x168ec665;
        this.f186195g = s0Var;
        this.f186196h = nPresenter;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderCommentConvert$setCommentEmoji$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.x1.n(this.f186192d);
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f186193e.f492247r;
        java.lang.String mo42933xb5885648 = interfaceC4987x84e327cb != null ? interfaceC4987x84e327cb.mo42933xb5885648() : null;
        if (mo42933xb5885648 == null) {
            mo42933xb5885648 = "";
        }
        objArr[0] = mo42933xb5885648;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 c15276x168ec665 = this.f186194f;
        objArr[1] = java.lang.Integer.valueOf(c15276x168ec665.getStatus());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommentConvert", "emoji longClick %s emojiStatus:%d", objArr);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(this.f186195g.f374654e, 1, false);
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.r1(c15276x168ec665, 0, 1);
        so2.y0 y0Var = this.f186193e;
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.s1(0, y0Var, this.f186195g, 1, this.f186196h);
        k0Var.f293425z = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.t1(0, y0Var);
        k0Var.v();
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/convert/FinderCommentConvert$setCommentEmoji$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
