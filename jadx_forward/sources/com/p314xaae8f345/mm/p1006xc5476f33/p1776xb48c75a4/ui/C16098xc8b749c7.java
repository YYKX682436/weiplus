package com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui;

/* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayCardLayout */
/* loaded from: classes9.dex */
public class C16098xc8b749c7 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f223813d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f223814e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f223815f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab f223816g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f223817h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913 f223818i;

    public C16098xc8b749c7(android.content.Context context) {
        super(context);
        a();
    }

    public final void a() {
        android.view.View inflate = android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.bji, this);
        this.f223813d = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.h2m);
        this.f223816g = (com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab) inflate.findViewById(com.p314xaae8f345.mm.R.id.h2r);
        this.f223814e = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.h2t);
        this.f223815f = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.h2s);
        this.f223817h = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.h2o);
        this.f223818i = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19659x677e0913) inflate.findViewById(com.p314xaae8f345.mm.R.id.h2n);
        this.f223816g.b();
    }

    /* renamed from: setCardRecord */
    public void m65143x409a4d83(r45.ax3 ax3Var) {
        java.lang.String str = ax3Var.f451869i;
        this.f223817h.setText(ax3Var.f451870m);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ax3Var.f451872o)) {
            this.f223818i.b(ax3Var.f451872o, 0, 0, u73.h.c(ax3Var.f451871n));
        }
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ri(this.f223813d, ax3Var.f451864d, 0.06f);
        com.p314xaae8f345.mm.p2802xd031a825.ui.r1.t0(this.f223814e, ax3Var.f451864d, 10);
        this.f223816g.setText(u73.h.a(ax3Var.f451865e));
        int i17 = ax3Var.f451866f;
        if (i17 == 0) {
            this.f223815f.setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560059a7));
            this.f223815f.setText(com.p314xaae8f345.mm.R.C30867xcad56011.fxt);
            return;
        }
        if (i17 != 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.HoneyPayCardLayout", "unknown rcvd: %s", java.lang.Integer.valueOf(i17));
            return;
        }
        long j17 = 0;
        if (ax3Var.f451868h != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HoneyPayCardLayout", "show check detail");
            this.f223815f.setText("");
            return;
        }
        long j18 = ax3Var.f451867g;
        if (j18 < 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.HoneyPayCardLayout", "unused quota wrong: %s", java.lang.Long.valueOf(j18));
        } else {
            j17 = j18;
        }
        this.f223815f.setText(getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fxs, com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.c2.b() + u73.h.a(j17)));
    }

    public C16098xc8b749c7(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public C16098xc8b749c7(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        a();
    }
}
