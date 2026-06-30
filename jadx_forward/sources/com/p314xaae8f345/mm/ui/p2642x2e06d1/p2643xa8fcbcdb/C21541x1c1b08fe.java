package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* renamed from: com.tencent.mm.ui.base.preference.CheckBoxPreference */
/* loaded from: classes9.dex */
public class C21541x1c1b08fe extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public boolean L;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 M;
    public android.widget.TextView N;
    public int P;
    public java.lang.String Q;
    public int R;
    public android.view.View S;
    public android.view.View.OnClickListener T;
    public android.widget.TextView U;
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.d V;
    public final boolean W;

    public C21541x1c1b08fe(android.content.Context context) {
        this(context, null);
    }

    public int M() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570830c13;
    }

    public boolean N() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = this.M;
        return viewOnClickListenerC22631x1cc07cc8 != null ? viewOnClickListenerC22631x1cc07cc8.f292896x : this.L;
    }

    public void O(boolean z17) {
        this.L = z17;
    }

    public void Q(java.lang.String str, int i17) {
        this.P = i17;
        this.Q = str;
        android.widget.TextView textView = this.N;
        if (textView != null) {
            if (i17 > 0) {
                textView.setBackgroundResource(i17);
            }
            if (android.text.TextUtils.isEmpty(this.Q)) {
                return;
            }
            this.N.setText(this.Q);
        }
    }

    public void R(int i17) {
        this.R = i17;
        android.widget.TextView textView = this.N;
        if (textView != null) {
            textView.setVisibility(i17);
        }
    }

    public void S(boolean z17) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = this.M;
        if (viewOnClickListenerC22631x1cc07cc8 != null) {
            this.L = z17;
            viewOnClickListenerC22631x1cc07cc8.m81392x52cfa5c6(z17);
        }
    }

    public final void T() {
        if (this.M == null || this.S == null) {
            return;
        }
        if (r()) {
            this.M.setEnabled(true);
            ((android.widget.TextView) this.S.findViewById(android.R.id.title)).setTextColor(this.S.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        } else {
            this.M.setEnabled(false);
            ((android.widget.TextView) this.S.findViewById(android.R.id.title)).setTextColor(this.S.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560428k4));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public java.lang.String l() {
        return N() ? "1" : "0";
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public int m() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        E(8);
        this.S = view;
        this.U = (android.widget.TextView) view.findViewById(android.R.id.summary);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8 viewOnClickListenerC22631x1cc07cc8 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.ViewOnClickListenerC22631x1cc07cc8) view.findViewById(com.p314xaae8f345.mm.R.id.btf);
        this.M = viewOnClickListenerC22631x1cc07cc8;
        viewOnClickListenerC22631x1cc07cc8.m81394xabebbf20(this.W);
        this.M.m81396xb3e0a10a(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.c(this));
        this.M.m81392x52cfa5c6(this.L);
        this.N = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.o_v);
        Q(this.Q, this.P);
        R(this.R);
        T();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.d dVar = this.V;
        if (dVar != null) {
            dVar.a(view);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        android.view.View.inflate(this.f279303d, M(), viewGroup2);
        this.S = u17;
        android.view.View.OnClickListener onClickListener = this.T;
        if (onClickListener != null) {
            u17.setOnClickListener(onClickListener);
        }
        return this.S;
    }

    public C21541x1c1b08fe(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C21541x1c1b08fe(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = false;
        this.P = -1;
        this.Q = "";
        this.R = 8;
        this.W = false;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.byv;
        this.W = context.obtainStyledAttributes(attributeSet, yl5.a.f544628b).getBoolean(0, false);
    }
}
