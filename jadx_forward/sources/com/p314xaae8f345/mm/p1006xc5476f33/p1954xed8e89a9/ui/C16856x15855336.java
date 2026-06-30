package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui;

@java.lang.Deprecated
/* renamed from: com.tencent.mm.plugin.profile.ui.HelperHeaderPreference */
/* loaded from: classes9.dex */
public class C16856x15855336 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.widget.TextView L;
    public android.widget.ImageView M;
    public android.widget.TextView N;
    public android.widget.TextView P;
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 Q;
    public hr3.i9 R;
    public boolean S;

    public C16856x15855336(android.content.Context context) {
        super(context);
        this.S = false;
    }

    public final void M() {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var;
        if (!this.S || (z3Var = this.Q) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.HelperHeaderPreference", "initView : bindView = " + this.S + "contact = " + this.Q);
            return;
        }
        java.lang.String d17 = z3Var.d1();
        if (this.M != null && this.Q.d1().equals(d17)) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.M, d17, null);
        }
        android.widget.TextView textView = this.L;
        if (textView != null) {
            textView.setText(this.Q.f2());
        }
        hr3.i9 i9Var = this.R;
        if (i9Var != null) {
            i9Var.a(this);
            java.lang.CharSequence mo133942xfb8046fd = this.R.mo133942xfb8046fd();
            if (mo133942xfb8046fd == null) {
                this.P.setVisibility(8);
            } else {
                this.P.setText(mo133942xfb8046fd);
                this.P.setVisibility(0);
            }
        }
    }

    public void N(com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, hr3.i9 i9Var) {
        hr3.i9 i9Var2 = this.R;
        if (i9Var2 != null) {
            i9Var2.mo133943x3f5eee52();
        }
        iz5.a.g(null, z3Var != null);
        this.Q = z3Var;
        this.R = i9Var;
        M();
    }

    public void O(boolean z17) {
        if (this.R == null) {
            return;
        }
        android.content.Context context = this.f279303d;
        if (!z17) {
            this.N.setTextColor(com.p314xaae8f345.mm.ui.p2740x696c9db.gd.a(context));
            this.N.setText(com.p314xaae8f345.mm.R.C30867xcad56011.iwu);
            this.N.setCompoundDrawablesWithIntrinsicBounds(com.p314xaae8f345.mm.R.C30861xcebc809e.bnh, 0, 0, 0);
        } else {
            android.widget.TextView textView = this.N;
            iz5.a.g(null, context != null);
            textView.setTextColor(new com.p314xaae8f345.mm.ui.p2740x696c9db.gd(context).f291981a[0]);
            this.N.setText(com.p314xaae8f345.mm.R.C30867xcad56011.iwo);
            this.N.setCompoundDrawablesWithIntrinsicBounds(com.p314xaae8f345.mm.R.C30861xcebc809e.bni, 0, 0, 0);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        this.M = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.cav);
        this.N = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cdv);
        this.L = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cdf);
        this.P = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f565422cd0);
        this.S = true;
        M();
        super.t(view);
    }

    public C16856x15855336(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.S = false;
    }

    public C16856x15855336(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.S = false;
    }
}
