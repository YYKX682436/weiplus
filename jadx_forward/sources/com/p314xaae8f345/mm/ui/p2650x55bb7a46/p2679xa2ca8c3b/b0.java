package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes9.dex */
public class b0 implements rl5.n {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yb5.d f284979a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f284980b;

    public b0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.a0 a0Var, yb5.d dVar, java.lang.String str) {
        this.f284979a = dVar;
        this.f284980b = str;
    }

    @Override // rl5.n
    public android.view.View a(android.content.Context context, android.view.MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        if (itemId != 137 && itemId != 4) {
            return null;
        }
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.c_4, null);
        ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.obc)).setText(this.f284979a.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572406b44));
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.h1v);
        java.lang.String Ni = ((rq1.m0) ((rq1.l0) i95.n0.c(rq1.l0.class))).Ni(this.f284980b);
        if (android.text.TextUtils.isEmpty(Ni)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
            textView.setText(Ni);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366 c16077xb54fe366 = (com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366) inflate.findViewById(com.p314xaae8f345.mm.R.id.h5n);
        c16077xb54fe366.u(com.p314xaae8f345.mm.vfs.w6.N(com.p314xaae8f345.mm.ui.bk.C() ? "assets:///fireWork_dark.gif" : "assets:///fireWork_light.gif", 0, -1), "");
        com.p314xaae8f345.mm.p1006xc5476f33.gif.k kVar = (com.p314xaae8f345.mm.p1006xc5476f33.gif.k) c16077xb54fe366.getDrawable();
        if (kVar != null) {
            kVar.D = 2;
        }
        return inflate;
    }
}
