package com.p314xaae8f345.mm.p1006xc5476f33.p1948xa8fcbcdb;

/* renamed from: com.tencent.mm.plugin.preference.PluginPreference */
/* loaded from: classes11.dex */
public class C16804xd92b288e extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb implements kv.e0 {
    public java.lang.String L;
    public java.lang.String M;
    public java.lang.String N;
    public int P;
    public int Q;
    public boolean R;
    public android.widget.ImageView S;
    public float T;
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf U;
    public android.widget.TextView V;

    public C16804xd92b288e(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public boolean M(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
        if (n17 == null || ((int) n17.E2) == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PluginPreference", "plugin do not exist");
            return false;
        }
        this.L = n17.d1();
        this.M = n17.f2();
        C("settings_plugins_list_#" + this.L);
        return true;
    }

    public boolean N(java.lang.String str, java.lang.String str2) {
        this.L = str;
        this.M = str2;
        C("settings_plugins_list_#" + this.L);
        return true;
    }

    public final void O() {
        if (this.S != null) {
            if (this.L.equals("newsapp")) {
                this.S.setImageResource(com.p314xaae8f345.mm.R.raw.f78947xfc11b252);
            } else {
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.S, this.L, null);
            }
            this.S.setAlpha(this.T);
        }
    }

    @Override // kv.e0
    public void U(java.lang.String str) {
        java.lang.String str2 = this.L;
        if (str2 == null || !str2.equals(str)) {
            return;
        }
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50293x3498a0(new eq3.a(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        this.S = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h9o);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.o58);
        this.V = textView;
        if (textView != null) {
            textView.setVisibility(this.Q);
            this.V.setText(this.N);
            int i17 = this.P;
            if (i17 != -1) {
                this.V.setBackgroundDrawable(i65.a.i(this.U, i17));
            }
        }
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.k7m);
        if (textView2 != null) {
            textView2.setVisibility(this.R ? 0 : 8);
        }
        O();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f279303d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bzs, viewGroup2);
        return u17;
    }

    public C16804xd92b288e(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.N = "";
        this.P = -1;
        this.Q = 8;
        this.R = false;
        this.S = null;
        this.T = 1.0f;
        this.U = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
        ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
        com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().d(this);
    }
}
