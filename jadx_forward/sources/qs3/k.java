package qs3;

/* loaded from: classes4.dex */
public final class k implements q80.f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16945xe78973e5 f447889a;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16945xe78973e5 c16945xe78973e5) {
        this.f447889a = c16945xe78973e5;
    }

    @Override // q80.f0
    /* renamed from: fail */
    public void mo555x2fd71e() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16945xe78973e5.B;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RadarMemberView", "OpenLiteApp fail");
        android.content.Intent intent = new android.content.Intent();
        com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16945xe78973e5 c16945xe78973e5 = this.f447889a;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = c16945xe78973e5.f236519u;
        intent.putExtra("k_username", z3Var != null ? z3Var.d1() : null);
        intent.putExtra("showShare", false);
        java.lang.String KExposeH5Url = com.p314xaae8f345.mm.ui.n2.f290931a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(KExposeH5Url, "KExposeH5Url");
        java.lang.String format = java.lang.String.format(KExposeH5Url, java.util.Arrays.copyOf(new java.lang.Object[]{38}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        intent.putExtra("rawUrl", format);
        j45.l.j(c16945xe78973e5.getContext(), "webview", ".ui.tools.WebViewUI", intent, null);
    }

    @Override // q80.f0
    /* renamed from: success */
    public void mo556x90b54003() {
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16945xe78973e5.B;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RadarMemberView", "OpenLiteApp success");
    }
}
