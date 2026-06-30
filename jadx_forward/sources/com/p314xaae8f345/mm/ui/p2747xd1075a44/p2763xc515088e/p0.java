package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e;

/* loaded from: classes9.dex */
public class p0 {

    /* renamed from: a, reason: collision with root package name */
    public y9.i f293842a;

    /* renamed from: b, reason: collision with root package name */
    public android.view.View f293843b;

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f293844c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f293845d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f293846e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f293847f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.Button f293848g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.Button f293849h;

    /* renamed from: i, reason: collision with root package name */
    public int f293850i;

    /* renamed from: j, reason: collision with root package name */
    public com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 f293851j;

    /* renamed from: k, reason: collision with root package name */
    public db5.t4 f293852k;

    /* renamed from: l, reason: collision with root package name */
    public db5.g4 f293853l;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f293854m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.n0 f293855n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.o0 f293856o;

    public p0(android.content.Context context) {
        this.f293844c = context;
        this.f293853l = new db5.g4(context);
        this.f293842a = new y9.i(context, 0);
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.bys, null);
        this.f293843b = inflate;
        this.f293845d = (android.widget.ListView) inflate.findViewById(com.p314xaae8f345.mm.R.id.juv);
        this.f293848g = (android.widget.Button) this.f293843b.findViewById(com.p314xaae8f345.mm.R.id.khs);
        this.f293849h = (android.widget.Button) this.f293843b.findViewById(com.p314xaae8f345.mm.R.id.b5i);
        this.f293846e = this.f293843b.findViewById(com.p314xaae8f345.mm.R.id.gyr);
        this.f293847f = (android.widget.TextView) this.f293843b.findViewById(com.p314xaae8f345.mm.R.id.gzd);
        this.f293842a.setContentView(this.f293843b);
        this.f293850i = com.p314xaae8f345.mm.ui.zk.e(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561111u) + com.p314xaae8f345.mm.ui.zk.e(context, com.p314xaae8f345.mm.R.C30860x5b28f31.f561112v);
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046 A = com.p176xb6135e39.p177xcca8366f.p244x11d36527.p249xdcc86614.C2690x46972046.A((android.view.View) this.f293843b.getParent());
        this.f293851j = A;
        if (A != null) {
            A.C(this.f293850i);
            this.f293851j.f125976p = false;
        }
        this.f293842a.setOnDismissListener(new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.i0(this));
    }
}
