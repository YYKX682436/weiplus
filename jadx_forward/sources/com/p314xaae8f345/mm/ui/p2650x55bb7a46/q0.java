package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes8.dex */
public class q0 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.m6 f284127a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.u0 f284128b;

    public q0(com.p314xaae8f345.mm.ui.p2650x55bb7a46.u0 u0Var, com.p314xaae8f345.mm.ui.p2650x55bb7a46.m6 m6Var) {
        this.f284128b = u0Var;
        this.f284127a = m6Var;
    }

    @Override // db5.c1
    public void e(int i17) {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.u0 u0Var = this.f284128b;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.m6 m6Var = this.f284127a;
        if (i17 == 0) {
            android.content.Intent intent = new android.content.Intent();
            try {
                intent.putExtra("rawUrl", java.lang.String.format(com.p314xaae8f345.mm.ui.p2650x55bb7a46.u0.f284259f, java.net.URLEncoder.encode(m6Var.f283479a, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c), java.net.URLEncoder.encode(m6Var.f283480b, com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c), java.lang.Long.valueOf(m6Var.f283481c.I0()), java.lang.Integer.valueOf((int) (m6Var.f283481c.mo78012x3fdd41df() / 1000)), 42));
                intent.putExtra("show_bottom", false);
                intent.putExtra("showShare", false);
                j45.l.j(u0Var.f284261e.g(), "webview", ".ui.tools.WebViewUI", intent, null);
                return;
            } catch (java.io.UnsupportedEncodingException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppSpamClickListener", "exception in expore, %s", e17.getMessage());
                return;
            }
        }
        if (i17 != 1) {
            return;
        }
        java.lang.String str = m6Var.f283479a;
        java.lang.String str2 = m6Var.f283480b;
        c01.d9.e().a(mc1.c.f72820x366c91de, u0Var);
        r45.ye4 ye4Var = new r45.ye4();
        ye4Var.f472547f = 1;
        ye4Var.f472545d = m6Var.f283480b;
        ye4Var.f472546e = "";
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(ye4Var);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6008xcb262173 c6008xcb262173 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6008xcb262173();
        java.lang.String str3 = m6Var.f283479a;
        am.du duVar = c6008xcb262173.f136302g;
        duVar.f88034a = str3;
        duVar.f88035b = linkedList;
        if (c6008xcb262173.e()) {
            u0Var.f284260d = db5.e1.Q(u0Var.f284261e.g(), u0Var.f284261e.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), u0Var.f284261e.s().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq), true, true, new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p0(this));
        }
    }
}
