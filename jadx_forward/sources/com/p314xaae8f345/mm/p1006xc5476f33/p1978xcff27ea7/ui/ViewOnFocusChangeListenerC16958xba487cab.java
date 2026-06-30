package com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui;

/* renamed from: com.tencent.mm.plugin.recharge.ui.MallEditText */
/* loaded from: classes9.dex */
public class ViewOnFocusChangeListenerC16958xba487cab extends android.widget.LinearLayout implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.l f236616d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View.OnFocusChangeListener f236617e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f236618f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.AutoCompleteTextView f236619g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.ImageView f236620h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f236621i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.k f236622m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f236623n;

    /* renamed from: o, reason: collision with root package name */
    public int f236624o;

    /* renamed from: p, reason: collision with root package name */
    public int f236625p;

    /* renamed from: q, reason: collision with root package name */
    public int f236626q;

    /* renamed from: r, reason: collision with root package name */
    public final int f236627r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f236628s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.List f236629t;

    /* renamed from: u, reason: collision with root package name */
    public vs3.a f236630u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f236631v;

    /* renamed from: w, reason: collision with root package name */
    public int f236632w;

    /* JADX WARN: Removed duplicated region for block: B:16:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ViewOnFocusChangeListenerC16958xba487cab(android.content.Context r13, android.util.AttributeSet r14, int r15) {
        /*
            Method dump skipped, instructions count: 512
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ViewOnFocusChangeListenerC16958xba487cab.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* renamed from: setInputForce */
    private void m67829x6da99743(vs3.a aVar) {
        this.f236630u = aVar;
        if (aVar == null) {
            this.f236619g.setText("");
            b();
            this.f236618f.setText("");
            this.f236618f.setVisibility(8);
            return;
        }
        android.text.method.KeyListener keyListener = this.f236619g.getKeyListener();
        this.f236619g.setKeyListener(null);
        this.f236619g.setText(aVar.f521408a);
        android.widget.AutoCompleteTextView autoCompleteTextView = this.f236619g;
        autoCompleteTextView.setSelection(autoCompleteTextView.getText().length());
        this.f236619g.setKeyListener(keyListener);
        b();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f521409b) || !this.f236628s) {
            this.f236618f.setText("");
            this.f236618f.setVisibility(8);
        } else {
            this.f236618f.setText(aVar.f521409b);
            this.f236618f.setVisibility(0);
        }
    }

    public boolean a() {
        if (this.f236627r != 1) {
            return this.f236619g.getText().length() >= this.f236626q;
        }
        java.lang.String obj = this.f236619g.getText().toString();
        return obj.length() >= this.f236626q && obj.length() <= this.f236625p && android.telephony.PhoneNumberUtils.isGlobalPhoneNumber(vs3.b.a(obj));
    }

    public final void b() {
        boolean a17 = a();
        if (a17 != this.f236628s) {
            this.f236628s = a17;
            com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.l lVar = this.f236616d;
            if (lVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16960x141f579b activityC16960x141f579b = (com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16960x141f579b) lVar;
                if (!a17) {
                    ((java.util.HashMap) activityC16960x141f579b.A).clear();
                    activityC16960x141f579b.f236656e.setText("");
                    activityC16960x141f579b.f236657f.setVisibility(4);
                }
                activityC16960x141f579b.T6();
            }
            if (!a17) {
                if (this.f236618f.getVisibility() == 0) {
                    this.f236618f.setText("");
                    this.f236618f.setVisibility(8);
                }
                this.f236630u = null;
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.l lVar2 = this.f236616d;
        if (lVar2 != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16960x141f579b) lVar2).a7();
        }
    }

    /* renamed from: getFocus */
    public void m67830x746efb22() {
        this.f236619g.findFocus();
    }

    /* renamed from: getInputRecord */
    public vs3.a m67831xc50a7785() {
        vs3.a aVar = this.f236630u;
        if (aVar != null) {
            return aVar;
        }
        vs3.a aVar2 = new vs3.a(m67832xfb85ada3(), this.f236618f.getText().toString(), 0);
        this.f236630u = aVar2;
        return aVar2;
    }

    /* renamed from: getText */
    public java.lang.String m67832xfb85ada3() {
        if (this.f236627r != 1) {
            java.lang.String obj = this.f236619g.getText().toString();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            return obj == null ? "" : obj;
        }
        java.lang.String obj2 = this.f236619g.getText().toString();
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return obj2 == null ? "" : obj2;
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f236617e;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(this, z17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.l lVar = this.f236616d;
        if (lVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16960x141f579b activityC16960x141f579b = (com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.ActivityC16960x141f579b) lVar;
            if (!this.f236628s) {
                ((java.util.HashMap) activityC16960x141f579b.A).clear();
                activityC16960x141f579b.f236656e.setText("");
                activityC16960x141f579b.f236657f.setVisibility(4);
            }
            activityC16960x141f579b.T6();
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(android.view.MotionEvent motionEvent) {
        return !this.f236631v;
    }

    /* renamed from: setEllipsize */
    public void m67833xb86dec4b(android.text.TextUtils.TruncateAt truncateAt) {
        this.f236619g.setEllipsize(truncateAt);
    }

    /* renamed from: setHintStr */
    public void m67834xe8378f68(java.lang.String str) {
        this.f236619g.setHint(str);
    }

    /* renamed from: setImeOptions */
    public void m67835x843d819f(int i17) {
        this.f236619g.setImeOptions(i17);
    }

    /* renamed from: setInfoTvImageResource */
    public void m67836x6ee7c8d7(int i17) {
        this.f236621i = i17 == com.p314xaae8f345.mm.R.C30861xcebc809e.f563446aj3;
        this.f236620h.setImageResource(i17);
    }

    /* renamed from: setInfoTvOnClickListener */
    public void m67837x7646f18b(android.view.View.OnClickListener onClickListener) {
        this.f236620h.setOnClickListener(onClickListener);
    }

    /* renamed from: setInput */
    public void m67838x53271888(vs3.a aVar) {
        this.f236630u = aVar;
        if (aVar == null) {
            this.f236619g.setText("");
            b();
            this.f236618f.setText("");
            this.f236618f.setVisibility(8);
            return;
        }
        this.f236619g.setText(aVar.f521408a);
        android.widget.AutoCompleteTextView autoCompleteTextView = this.f236619g;
        autoCompleteTextView.setSelection(autoCompleteTextView.getText().length());
        b();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f521409b) || !this.f236628s) {
            this.f236618f.setText("");
            this.f236618f.setVisibility(8);
        } else {
            this.f236618f.setText(aVar.f521409b);
            this.f236618f.setVisibility(0);
        }
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        this.f236619g.setOnClickListener(onClickListener);
    }

    /* renamed from: setOnEditorActionListener */
    public void m67839x37562b58(android.widget.TextView.OnEditorActionListener onEditorActionListener) {
        this.f236619g.setOnEditorActionListener(onEditorActionListener);
    }

    @Override // android.view.View
    public void setOnFocusChangeListener(android.view.View.OnFocusChangeListener onFocusChangeListener) {
        super.setOnFocusChangeListener(onFocusChangeListener);
        this.f236617e = onFocusChangeListener;
    }

    /* renamed from: setOnInputValidChangeListener */
    public void m67840x749e7e77(com.p314xaae8f345.mm.p1006xc5476f33.p1978xcff27ea7.ui.l lVar) {
        this.f236616d = lVar;
    }

    public ViewOnFocusChangeListenerC16958xba487cab(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
