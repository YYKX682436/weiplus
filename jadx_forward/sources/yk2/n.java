package yk2;

/* loaded from: classes3.dex */
public final class n extends yk2.g {

    /* renamed from: f, reason: collision with root package name */
    public boolean f544331f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f544332g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f544333h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(android.view.ViewGroup root) {
        super(root);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(root, "root");
        this.f544332g = (android.widget.TextView) root.findViewById(com.p314xaae8f345.mm.R.id.pr9);
        this.f544333h = "";
    }

    @Override // yk2.g
    public void a(r45.lk2 response) {
        r45.aw1 aw1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        this.f544325e = response;
        r45.v32 v32Var = (r45.v32) response.m75936x14adae67(31);
        if (v32Var == null || (aw1Var = (r45.aw1) v32Var.m75936x14adae67(0)) == null) {
            return;
        }
        android.view.ViewGroup viewGroup = this.f544324d;
        viewGroup.setVisibility(0);
        if (!this.f544331f) {
            this.f544331f = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4 a4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a;
            java.lang.String b17 = b();
            ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
            a4Var.a(b17, "", b52.b.b(), "person_page_reward_level", "");
        }
        java.lang.String m75945x2fec8307 = aw1Var.m75945x2fec8307(3);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        this.f544333h = m75945x2fec8307;
        this.f544332g.setText(viewGroup.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d6i, java.lang.Integer.valueOf(aw1Var.m75939xb282bd08(0))));
    }

    @Override // yk2.g
    public int c() {
        return 8;
    }

    @Override // yk2.g
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4 a4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.a4.f183535a;
        java.lang.String b17 = b();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        a4Var.b(b17, b52.b.b(), "person_page_reward_level", "");
        java.lang.String str = this.f544333h;
        if (str == null || str.length() == 0) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f544333h);
        j45.l.n(this.f544324d.getContext(), "webview", ".ui.tools.WebViewUI", intent, 1016);
    }
}
