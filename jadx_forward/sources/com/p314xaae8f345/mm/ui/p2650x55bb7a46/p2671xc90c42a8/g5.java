package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8;

/* loaded from: classes9.dex */
public final class g5 implements com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m5 f283764a;

    public g5(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m5 m5Var) {
        this.f283764a = m5Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.i0
    public void a(android.view.View v17, int i17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0 inputItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inputItem, "inputItem");
        pt0.e0 e0Var = pt0.f0.f439742b1;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m5 m5Var = this.f283764a;
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 n17 = e0Var.n(m5Var.f284075e, ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.z4) inputItem).f279944d);
        m5Var.getClass();
        de5.a.f310929a.k(5, 8, 9);
        android.content.Context context = v17.getContext();
        java.lang.String V1 = n17.V1();
        if (V1 == null) {
            V1 = n17.y0();
        }
        java.lang.String str = V1;
        java.lang.String j17 = n17.j();
        if (j17 == null) {
            j17 = "";
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.wg.a(context, str, j17, com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(n17.Q0()), n17.A0() == 0, n17);
    }

    @Override // com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.i0
    public void b(android.view.View view, int i17, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2651xbb6ca34f.f0 item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShareCardHistoryListPresenter", "[onItemLongClick] position:%s", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.m5 m5Var = this.f283764a;
        m5Var.getClass();
        de5.a.f310929a.k(14, 8, 9);
        new com.p314xaae8f345.mm.ui.p2740x696c9db.s6(view.getContext()).a(view, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.e5.f283736d, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2671xc90c42a8.f5(m5Var, item), null);
    }
}
