package qs3;

/* loaded from: classes4.dex */
public final class l implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16945xe78973e5 f447891d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16945xe78973e5 c16945xe78973e5) {
        this.f447891d = c16945xe78973e5;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/radar/ui/RadarMemberView$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean l17 = j62.e.g().l("clicfg_lbs_expose_config_switch_android", false, false, true);
        com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16945xe78973e5 c16945xe78973e5 = this.f447891d;
        if (l17) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("appId", "wxalited4df4810a40b1d9ddc0cbea44d263fd9");
            bundle.putString("query", "{\"scene\":38}");
            android.os.Bundle bundle2 = new android.os.Bundle();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = c16945xe78973e5.f236519u;
            bundle2.putString("k_username", z3Var != null ? z3Var.d1() : null);
            bundle.putBundle(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14345xae24a099, bundle2);
            int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16945xe78973e5.B;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RadarMemberView", "open liteapp:wxalited4df4810a40b1d9ddc0cbea44d263fd9,page:");
            ((com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) ((q80.g0) i95.n0.c(q80.g0.class))).kk(c16945xe78973e5.getContext(), bundle, true, false, new qs3.k(c16945xe78973e5));
        } else {
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var2 = c16945xe78973e5.f236519u;
            intent.putExtra("k_username", z3Var2 != null ? z3Var2.d1() : null);
            intent.putExtra("showShare", false);
            java.lang.String KExposeH5Url = com.p314xaae8f345.mm.ui.n2.f290931a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(KExposeH5Url, "KExposeH5Url");
            java.lang.String format = java.lang.String.format(KExposeH5Url, java.util.Arrays.copyOf(new java.lang.Object[]{38}, 1));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
            intent.putExtra("rawUrl", format);
            j45.l.j(c16945xe78973e5.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/radar/ui/RadarMemberView$initView$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
