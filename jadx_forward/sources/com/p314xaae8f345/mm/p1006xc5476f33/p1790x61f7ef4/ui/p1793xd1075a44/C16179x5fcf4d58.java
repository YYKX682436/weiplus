package com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.p1793xd1075a44;

/* renamed from: com.tencent.mm.plugin.label.ui.widget.InputClearablePreference */
/* loaded from: classes8.dex */
public class C16179x5fcf4d58 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public java.lang.String L;
    public java.lang.String M;
    public java.lang.String N;
    public java.lang.String P;
    public int Q;
    public boolean R;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 S;
    public android.widget.ImageView T;
    public android.widget.TextView U;
    public int V;
    public k93.h W;

    public C16179x5fcf4d58(android.content.Context context) {
        this(context, null);
    }

    public final void M(java.lang.String str) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        int f17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.f(str);
        int i17 = this.Q;
        boolean z17 = f17 > i17;
        int b17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.b(i17, "");
        int d17 = com.p314xaae8f345.mm.ui.p2740x696c9db.v4.d(this.Q, str);
        android.widget.TextView textView = this.U;
        if (textView != null) {
            if (z17) {
                textView.setText(java.lang.String.format(this.N, java.lang.Integer.valueOf(b17), java.lang.Integer.valueOf(d17)));
                this.U.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
        }
        k93.h hVar = this.W;
        if (hVar != null) {
            boolean z18 = f17 <= this.Q;
            com.p314xaae8f345.mm.p1006xc5476f33.p1790x61f7ef4.ui.ActivityC16168xac76ee12 activityC16168xac76ee12 = ((f93.l1) hVar).f341912a;
            if (activityC16168xac76ee12.f224768v || !activityC16168xac76ee12.f224769w) {
                activityC16168xac76ee12.m78501x43e00957(z18);
            } else {
                activityC16168xac76ee12.m78501x43e00957(false);
                activityC16168xac76ee12.f224769w = false;
            }
        }
    }

    public void N(java.lang.String str) {
        this.L = str;
        if (this.S == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        this.S.setText(((ke0.e) xVar).bj(this.f279303d, this.L, this.V));
        M(this.L);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        this.V = i65.a.h(this.f279303d, com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2);
        this.S = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) view.findViewById(com.p314xaae8f345.mm.R.id.d98);
        this.T = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f565572ct2);
        this.U = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.dhb);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.S;
        if (c22621x7603e017 != null) {
            c22621x7603e017.mo81583x7e4f2d39(new android.text.InputFilter[]{new k93.i(this)});
        }
        this.S.addTextChangedListener(new k93.d(this));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.L);
        sb6.append("");
        N(this.L);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.L)) {
            this.S.mo81549xf579a34a(this.L.length());
        }
        if (this.R) {
            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new k93.g(this), 0L);
        }
        this.S.setHint(this.M);
        this.T.setOnClickListener(new k93.e(this));
        android.widget.TextView textView = this.U;
        if (textView != null) {
            textView.setOnTouchListener(new k93.f(this));
        }
    }

    public C16179x5fcf4d58(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C16179x5fcf4d58(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
    }
}
