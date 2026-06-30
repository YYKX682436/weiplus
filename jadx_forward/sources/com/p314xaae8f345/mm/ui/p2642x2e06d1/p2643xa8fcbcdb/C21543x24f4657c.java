package com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb;

/* renamed from: com.tencent.mm.ui.base.preference.ChoicePreference */
/* loaded from: classes11.dex */
public final class C21543x24f4657c extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.widget.RadioGroup L;
    public final java.util.HashMap M;
    public java.lang.String N;
    public int P;
    public java.lang.CharSequence[] Q;
    public java.lang.CharSequence[] R;
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.q0 S;

    public C21543x24f4657c(android.content.Context context) {
        this(context, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void D(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.q0 q0Var) {
        this.S = q0Var;
    }

    public void M(java.lang.String str) {
        this.N = str;
        com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.e eVar = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.e) this.M.get(str);
        if (eVar == null) {
            this.P = -1;
        } else {
            this.P = eVar.f279330b;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        android.widget.RadioGroup radioGroup = this.L;
        if (radioGroup != null) {
            radioGroup.check(this.P);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View u(android.view.ViewGroup viewGroup) {
        android.view.View u17 = super.u(viewGroup);
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f279303d.getSystemService("layout_inflater");
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.cgi);
        viewGroup2.removeAllViews();
        layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bzc, viewGroup2);
        this.L = (android.widget.RadioGroup) u17.findViewById(com.p314xaae8f345.mm.R.id.gtt);
        int i17 = 0;
        while (true) {
            java.lang.CharSequence[] charSequenceArr = this.R;
            if (i17 >= charSequenceArr.length) {
                this.L.setOnCheckedChangeListener(new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.f(this));
                return u17;
            }
            com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.e eVar = (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.e) this.M.get(charSequenceArr[i17]);
            if (eVar != null) {
                int i18 = eVar.f279330b;
                java.lang.CharSequence charSequence = eVar.f279329a;
                if (i17 == 0) {
                    android.widget.RadioButton radioButton = (android.widget.RadioButton) layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.by7, (android.view.ViewGroup) null);
                    radioButton.setText(charSequence);
                    radioButton.setId(i18);
                    this.L.addView(radioButton);
                } else if (i17 == this.R.length - 1) {
                    android.widget.RadioButton radioButton2 = (android.widget.RadioButton) layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.by9, (android.view.ViewGroup) null);
                    radioButton2.setText(charSequence);
                    radioButton2.setId(i18);
                    this.L.addView(radioButton2);
                } else {
                    android.widget.RadioButton radioButton3 = (android.widget.RadioButton) layoutInflater.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.by8, (android.view.ViewGroup) null);
                    radioButton3.setText(charSequence);
                    radioButton3.setId(i18);
                    this.L.addView(radioButton3);
                }
            }
            i17++;
        }
    }

    public C21543x24f4657c(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C21543x24f4657c(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        java.util.HashMap hashMap = new java.util.HashMap();
        this.M = hashMap;
        this.P = -1;
        int i18 = 0;
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, wm0.a.f528721f, i17, 0);
        this.Q = obtainStyledAttributes.getTextArray(0);
        this.R = obtainStyledAttributes.getTextArray(1);
        obtainStyledAttributes.recycle();
        if (this.Q == null) {
            this.Q = new java.lang.CharSequence[0];
        }
        if (this.R == null) {
            this.R = new java.lang.CharSequence[0];
        }
        iz5.a.g("entries count different", this.Q.length == this.R.length);
        hashMap.clear();
        while (true) {
            java.lang.CharSequence[] charSequenceArr = this.R;
            if (i18 >= charSequenceArr.length) {
                return;
            }
            java.lang.CharSequence charSequence = charSequenceArr[i18];
            hashMap.put(charSequence, new com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.e(charSequence, this.Q[i18], 1048576 + i18));
            i18++;
        }
    }
}
