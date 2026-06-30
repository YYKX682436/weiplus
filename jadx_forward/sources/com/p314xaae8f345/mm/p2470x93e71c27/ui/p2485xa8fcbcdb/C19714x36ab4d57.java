package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2485xa8fcbcdb;

/* renamed from: com.tencent.mm.pluginsdk.ui.preference.SpecialCheckBoxPreference */
/* loaded from: classes11.dex */
public class C19714x36ab4d57 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.widget.ToggleButton L;
    public android.widget.ToggleButton M;
    public android.widget.ToggleButton N;
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 P;
    public final android.content.Context Q;
    public java.lang.String R;
    public boolean S;
    public boolean T;
    public final android.widget.CompoundButton.OnCheckedChangeListener U;
    public boolean V;

    public C19714x36ab4d57(android.content.Context context) {
        super(context);
        this.U = new y35.f0(this);
        this.V = false;
        this.Q = context;
    }

    public final boolean M() {
        if (this.S) {
            this.V = this.P.T == 0;
        } else if (!this.T) {
            this.V = c01.e2.P(this.P);
        }
        android.content.Context context = this.Q;
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            if (this.V) {
                ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).m78594xca3c3c9a(0);
                return true;
            }
            ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).m78594xca3c3c9a(8);
        }
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        this.L = (android.widget.ToggleButton) view.findViewById(com.p314xaae8f345.mm.R.id.m78);
        this.M = (android.widget.ToggleButton) view.findViewById(com.p314xaae8f345.mm.R.id.m77);
        this.N = (android.widget.ToggleButton) view.findViewById(com.p314xaae8f345.mm.R.id.m79);
        android.content.Context context = this.Q;
        this.R = ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).getIntent().getStringExtra("RoomInfo_Id");
        this.S = ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).getIntent().getBooleanExtra("Is_Chatroom", true);
        this.T = ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context).getIntent().getBooleanExtra("Is_Lbsroom", false);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).n(this.R, true);
        this.P = n17;
        if (n17 != null) {
            this.L.setChecked(((com.p314xaae8f345.mm.p2621x8fb0427b.m4) c01.d9.b().r()).K(this.P.d1()));
            this.N.setChecked(this.P.r2());
            this.M.setChecked(M());
        }
        android.widget.ToggleButton toggleButton = this.L;
        android.widget.CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.U;
        toggleButton.setOnCheckedChangeListener(onCheckedChangeListener);
        this.M.setOnCheckedChangeListener(onCheckedChangeListener);
        this.N.setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public C19714x36ab4d57(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.U = new y35.f0(this);
        this.V = false;
        this.Q = context;
    }

    public C19714x36ab4d57(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.U = new y35.f0(this);
        this.V = false;
        this.Q = context;
    }
}
