package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44;

/* renamed from: com.tencent.mm.plugin.websearch.widget.SOSEditTextView */
/* loaded from: classes8.dex */
public class C19227x8f71d8b3 extends com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381 {
    public static boolean T;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f263239J;
    public android.widget.TextView K;
    public boolean L;
    public android.view.View M;
    public bw4.b N;
    public boolean P;
    public boolean Q;
    public bw4.c R;
    public int S;

    public C19227x8f71d8b3(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = false;
        this.P = false;
        this.Q = false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381
    public boolean b() {
        return !this.C && this.f291362w == 2;
    }

    /* renamed from: getCancelTextView */
    public android.view.View m74101x3fa9db02() {
        return this.K;
    }

    /* renamed from: getSearchBarCancelTextContainer */
    public android.view.View m74102xf2c200a5() {
        return this.M;
    }

    /* renamed from: getSearchBarCancelTextContainerMaxWidth */
    public int m74103xbc954687() {
        int max = java.lang.Math.max(m74102xf2c200a5().getMeasuredWidth(), this.S);
        this.S = max;
        return max;
    }

    /* renamed from: getVoiceImageButton */
    public android.view.View m74104x4910e751() {
        return this.f263239J;
    }

    @Override // com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381
    public void i(int i17) {
        if (T) {
            android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.epp, (android.view.ViewGroup) this, true);
            return;
        }
        int i18 = this.f291362w;
        if (i18 == 0) {
            android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f571070cv5, (android.view.ViewGroup) this, true);
        } else if (i18 == 1 || i18 == 3) {
            android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cv6, (android.view.ViewGroup) this, true);
        } else {
            android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cv7, (android.view.ViewGroup) this, true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2736xc9fa65a8.C22479x68a26381
    public void j(android.util.AttributeSet attributeSet) {
        super.j(attributeSet);
        this.f263239J = findViewById(com.p314xaae8f345.mm.R.id.c8l);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.f568807o41);
        this.K = textView;
        textView.setTextSize(0, i65.a.f(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561108r) * i65.a.m(getContext()));
        this.M = findViewById(com.p314xaae8f345.mm.R.id.mdc);
        m80966xdb574fcd().setOnFocusChangeListener(null);
        m80966xdb574fcd().setHintTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560834vh));
        m80966xdb574fcd().setTextColor(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        if (m80969x4fdf4434() != null) {
            m80969x4fdf4434().setOnClickListener(new bw4.a(this));
        }
        this.S = java.lang.Math.max(m74102xf2c200a5().getMeasuredWidth(), (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561261dk));
    }

    /* renamed from: setCameraBtnClickListener */
    public void m74105xb3a8fda7(android.view.View.OnClickListener onClickListener) {
        android.view.View view = this.f263239J;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: setCancelBtnForceHide */
    public void m74106xe51af76d(boolean z17) {
        this.P = z17;
    }

    /* renamed from: setCancelTextViewCallback */
    public void m74107x6601d973(bw4.b bVar) {
        this.N = bVar;
    }

    /* renamed from: setCancelTextViewClickListener */
    public void m74108x4467b9ee(android.view.View.OnClickListener onClickListener) {
        android.widget.TextView textView = this.K;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
    }

    /* renamed from: setCancelTextViewVisibile */
    public void m74109xceb1ccf7(int i17) {
        android.widget.TextView textView = this.K;
        if (textView != null) {
            textView.setVisibility(i17);
        }
    }

    /* renamed from: setCancelVisableChangeListener */
    public void m74110x50e8d882(bw4.c cVar) {
        this.R = cVar;
    }

    /* renamed from: setCommonRightBtnForceHide */
    public void m74111x216d5aa0(boolean z17) {
        this.Q = z17;
    }

    /* renamed from: setCommonRightImageButtonVisibile */
    public void m74112x9e8eda7(int i17) {
        if (this.f263239J == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.SOSEditTextView", "setCommonRightImageButtonVisibile, commonRightImageButton is null!");
            return;
        }
        int i18 = 8;
        if (this.L) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.SOSEditTextView", "setCommonRightImageButtonVisibile, needForceHideCameraIcon override to GONE");
            i17 = 8;
        }
        if (!this.Q) {
            i18 = i17;
        } else {
            if (this.f263239J.getVisibility() == 8) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.SOSEditTextView", "setCommonRightImageButtonVisibile, commonRightBtnForceHide early return (already GONE)");
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.SOSEditTextView", "setCommonRightImageButtonVisibile, commonRightBtnForceHide override to GONE");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.SOSEditTextView", "setCommonRightImageButtonVisibile, final visibility = %d", java.lang.Integer.valueOf(i18));
        android.view.View view = this.f263239J;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/websearch/widget/SOSEditTextView", "setCommonRightImageButtonVisibile", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/websearch/widget/SOSEditTextView", "setCommonRightImageButtonVisibile", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* renamed from: setNeedForceHideCameraIcon */
    public void m74113x78e570b3(boolean z17) {
        this.L = z17;
    }

    /* renamed from: setSearchBarCancelTextContainerVisibile */
    public void m74114x6f2f9a9a(int i17) {
        android.view.View view = this.M;
        if (view != null) {
            if (this.P) {
                if (view.getVisibility() == 8) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.SOSEditTextView", "cancelBtnForceHide， return");
                    return;
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTS.SOSEditTextView", "cancelBtnForceHide， set Gone");
                    i17 = 8;
                }
            }
            android.view.View view2 = this.M;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/websearch/widget/SOSEditTextView", "setSearchBarCancelTextContainerVisibile", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/websearch/widget/SOSEditTextView", "setSearchBarCancelTextContainerVisibile", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            bw4.b bVar = this.N;
            if (bVar != null) {
                android.view.View view3 = this.M;
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19366xa1004627 activityC19366xa1004627 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.q) bVar).f266119a;
                activityC19366xa1004627.getClass();
                view3.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.w(activityC19366xa1004627, i17, view3), 0L);
            }
            bw4.c cVar = this.R;
            if (cVar != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateActionDonePos, visibility = ");
                sb6.append(i17);
                sb6.append("， hasHappenQuery = ");
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.ActivityC19380x649e7d5c activityC19380x649e7d5c = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.fts.x1) cVar).f266251a;
                sb6.append(activityC19380x649e7d5c.F5);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", sb6.toString());
                activityC19380x649e7d5c.Qa();
                if (((activityC19380x649e7d5c.F5 || activityC19380x649e7d5c.T4) ? false : true) || activityC19380x649e7d5c.J4.m74102xf2c200a5() == null) {
                    return;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2402xd1075a44.C19227x8f71d8b3 c19227x8f71d8b3 = activityC19380x649e7d5c.J4;
                c19227x8f71d8b3.u(c19227x8f71d8b3.m74102xf2c200a5().getVisibility() == 0);
            }
        }
    }

    /* renamed from: setVoiceBtnClickListener */
    public void m74115xba32d370(android.view.View.OnClickListener onClickListener) {
        android.view.View view = this.f263239J;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public C19227x8f71d8b3(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = false;
        this.P = false;
        this.Q = false;
    }
}
