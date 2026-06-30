package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* renamed from: com.tencent.mm.ui.tools.ZoneRecommandPreference */
/* loaded from: classes15.dex */
public class C22561x90a7947 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5 L;
    public com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5 M;
    public com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5 N;
    public int P;
    public android.widget.TextView Q;
    public android.widget.TextView R;
    public android.widget.ImageView S;

    public C22561x90a7947(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void M() {
        android.widget.TextView textView = this.Q;
        if (textView == null || this.R == null) {
            return;
        }
        int i17 = this.P;
        if (i17 == 0) {
            textView.setVisibility(8);
            this.R.setVisibility(0);
            this.R.setText(com.p314xaae8f345.mm.R.C30867xcad56011.iok);
            this.S.setImageResource(com.p314xaae8f345.mm.R.raw.f79464x9083b19a);
            w(false);
            if (this.f279316t) {
                this.f279316t = false;
                return;
            }
            return;
        }
        if (i17 != 1) {
            if (i17 != 2) {
                return;
            }
            textView.setVisibility(8);
            this.R.setVisibility(0);
            this.R.setText(com.p314xaae8f345.mm.R.C30867xcad56011.ioh);
            this.S.setImageResource(com.p314xaae8f345.mm.R.raw.f79463x31e032fa);
            w(false);
            if (this.f279316t) {
                this.f279316t = false;
                return;
            }
            return;
        }
        textView.setVisibility(0);
        this.R.setVisibility(8);
        this.S.setImageResource(com.p314xaae8f345.mm.R.raw.f79464x9083b19a);
        com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5 c21050xe4d9f0f5 = this.L;
        java.lang.String str = "";
        if (c21050xe4d9f0f5 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21050xe4d9f0f5.m77921xfb82e301())) {
            str = "" + this.L.m77921xfb82e301();
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5 c21050xe4d9f0f52 = this.M;
        if (c21050xe4d9f0f52 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21050xe4d9f0f52.m77921xfb82e301())) {
            str = str + " " + this.M.m77921xfb82e301();
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.C21050xe4d9f0f5 c21050xe4d9f0f53 = this.N;
        if (c21050xe4d9f0f53 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c21050xe4d9f0f53.m77921xfb82e301())) {
            str = str + " " + this.N.m77921xfb82e301();
        }
        this.Q.setText(str);
        w(true);
        if (!this.f279316t) {
            this.f279316t = true;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        M();
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f279303d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570821c02, viewGroup2);
        this.Q = (android.widget.TextView) u17.findViewById(com.p314xaae8f345.mm.R.id.pte);
        this.R = (android.widget.TextView) u17.findViewById(com.p314xaae8f345.mm.R.id.nhj);
        this.S = (android.widget.ImageView) u17.findViewById(com.p314xaae8f345.mm.R.id.nhw);
        return u17;
    }

    public C22561x90a7947(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.P = 0;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
    }
}
