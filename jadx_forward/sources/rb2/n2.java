package rb2;

/* loaded from: classes10.dex */
public final class n2 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f475230d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 f475231e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f475232f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter f475233g;

    public n2(so2.y0 y0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 c15276x168ec665, in5.s0 s0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1608xc90c42a8.p1609xde351112.C14621x155ee542.NPresenter nPresenter) {
        this.f475230d = y0Var;
        this.f475231e = c15276x168ec665;
        this.f475232f = s0Var;
        this.f475233g = nPresenter;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb = this.f475230d.f492247r;
        java.lang.String mo42933xb5885648 = interfaceC4987x84e327cb != null ? interfaceC4987x84e327cb.mo42933xb5885648() : null;
        if (mo42933xb5885648 == null) {
            mo42933xb5885648 = "";
        }
        objArr[0] = mo42933xb5885648;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15276x168ec665 c15276x168ec665 = this.f475231e;
        objArr[1] = java.lang.Integer.valueOf(c15276x168ec665.getStatus());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderCommentConvert", "emoji longClick %s emojiStatus:%d", objArr);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(this.f475232f.f374654e, 1, false);
        k0Var.f293405n = new rb2.k2(c15276x168ec665, 0, 1);
        so2.y0 y0Var = this.f475230d;
        k0Var.f293414s = new rb2.l2(0, y0Var, this.f475232f, 1, this.f475233g);
        k0Var.f293425z = new rb2.m2(0, y0Var);
        k0Var.v();
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/convert/comment/FinderNewCommentConvert$refreshCommentEmoji$4", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
