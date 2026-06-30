package com.tencent.mm.plugin.appbrand.ui.autofill;

/* loaded from: classes14.dex */
public class AppBrandIDCardVerifyPwdFrag extends com.tencent.mm.ui.MMFragment {

    /* renamed from: d, reason: collision with root package name */
    public wj1.m0 f89551d;

    /* renamed from: e, reason: collision with root package name */
    public r45.kc f89552e;

    /* renamed from: f, reason: collision with root package name */
    public r45.jc f89553f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f89554g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f89555h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.ui.j f89556i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f89557m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f89558n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f89559o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f89560p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.base.MMFormVerifyCodeInputView f89561q;

    /* renamed from: r, reason: collision with root package name */
    public com.tenpay.android.wechat.MyKeyboardWindow f89562r;

    @Override // com.tencent.mm.ui.MMFragment
    public void dealContentView(android.view.View view) {
        r45.kc kcVar;
        android.view.View.AccessibilityDelegate a1Var;
        wj1.m0 m0Var = this.f89551d;
        if (m0Var == null || (kcVar = ((wj1.c0) m0Var).f446576a.f89540p) == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDCardVerifyPwdFrag", "idCardUILogic or idCardUILogic.getIDCardShowInfo() is null, err");
            return;
        }
        java.util.LinkedList linkedList = kcVar.f378582f;
        if (linkedList == null || linkedList.size() <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandIDCardVerifyPwdFrag", "sms.get(0) is null, err, return");
            return;
        }
        this.f89554g = (android.widget.LinearLayout) view.findViewById(com.tencent.mm.R.id.f483154y1);
        this.f89557m = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483151xy);
        this.f89558n = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483155y2);
        this.f89559o = (android.widget.TextView) view.findViewById(com.tencent.mm.R.id.f483156y3);
        this.f89560p = (android.widget.Button) view.findViewById(com.tencent.mm.R.id.f483140xn);
        this.f89561q = (com.tencent.mm.ui.base.MMFormVerifyCodeInputView) view.findViewById(com.tencent.mm.R.id.f483152xz);
        this.f89562r = (com.tenpay.android.wechat.MyKeyboardWindow) view.findViewById(com.tencent.mm.R.id.f483153y0);
        android.view.View inflate = com.tencent.mm.ui.id.b(getContext()).inflate(com.tencent.mm.R.layout.b_, (android.view.ViewGroup) null);
        this.f89555h = inflate;
        inflate.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.a07));
        this.f89556i = new com.tencent.mm.ui.j(this.f89555h);
        this.f89554g.addView(this.f89555h, 0, new android.widget.LinearLayout.LayoutParams(-1, com.tencent.mm.plugin.appbrand.widget.b.a(getActivity())));
        r45.kc kcVar2 = ((wj1.c0) this.f89551d).f446576a.f89540p;
        this.f89552e = kcVar2;
        this.f89556i.g(kcVar2.f378580d);
        this.f89556i.c(new wj1.n0(this));
        this.f89557m.setText(this.f89552e.f378581e);
        this.f89553f = (r45.jc) this.f89552e.f378582f.get(0);
        this.f89558n.setText(((r45.jc) this.f89552e.f378582f.get(0)).f377693e);
        if (this.f89552e.f378582f.size() > 1) {
            this.f89559o.setVisibility(0);
            this.f89559o.setOnClickListener(new wj1.q0(this));
        } else {
            this.f89559o.setVisibility(8);
        }
        this.f89561q.setVisibility(0);
        this.f89561q.setSendSmsBtnClickListener(new wj1.t0(this));
        com.tencent.mm.ui.base.MMFormVerifyCodeInputView mMFormVerifyCodeInputView = this.f89561q;
        wj1.u0 u0Var = new wj1.u0(this);
        com.tencent.mm.ui.base.MMClearEditText mMClearEditText = mMFormVerifyCodeInputView.f197373e;
        if (mMClearEditText != null) {
            mMClearEditText.addTextChangedListener(u0Var);
        } else {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMFormVerifyCodeInputView", "watcher : %s, contentET : %s", u0Var, mMClearEditText);
        }
        android.widget.EditText contentEditText = this.f89561q.getContentEditText();
        if (contentEditText != null) {
            contentEditText.setShowSoftInputOnFocus(false);
        }
        if (this.f89561q.getText() == null || this.f89561q.getText().toString().length() <= 0) {
            this.f89560p.setEnabled(false);
        } else {
            this.f89560p.setEnabled(true);
        }
        this.f89560p.setVisibility(0);
        this.f89560p.setOnClickListener(new wj1.v0(this));
        this.f89562r.setXMode(0);
        this.f89562r.setInputEditText(this.f89561q.getContentEditText());
        int i17 = la5.a1.f317598b;
        if ((j62.e.g().i("clicfg_accessibility_strategy_android_r", 1, true, true) == 1) && fp.h.c(30) && la5.b.f317600a.g(true)) {
            jx3.f.INSTANCE.t(1624, 11);
            a1Var = new la5.z0();
        } else {
            a1Var = new la5.a1();
        }
        this.f89562r.setAccessibilityDelegate(a1Var);
    }

    @Override // com.tencent.mm.ui.MMFragment
    /* renamed from: getLayoutId */
    public int getF72225d() {
        return com.tencent.mm.R.layout.f488047fd;
    }

    @Override // com.tencent.mm.ui.MMFragment
    public boolean noActionBar() {
        return true;
    }

    @Override // com.tencent.mm.ui.MMFragment, com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (isSupportNavigationSwipeBack()) {
            android.view.View contentView = getContentView();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(contentView, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            getSwipeBackLayout().setEnableGesture(true);
        }
    }

    @Override // com.tencent.mm.ui.MMFragment
    public void onSwipeBack() {
        wj1.m0 m0Var = this.f89551d;
        if (m0Var != null) {
            ((wj1.c0) m0Var).f446576a.onSwipeBack();
            android.view.View contentView = getContentView();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(contentView, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag", "onSwipeBack", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            contentView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(contentView, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag", "onSwipeBack", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (isSupportNavigationSwipeBack()) {
                getSwipeBackLayout().setEnableGesture(false);
            }
        }
    }
}
