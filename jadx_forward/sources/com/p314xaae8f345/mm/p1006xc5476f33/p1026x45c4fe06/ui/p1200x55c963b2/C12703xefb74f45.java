package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.p1200x55c963b2;

/* renamed from: com.tencent.mm.plugin.appbrand.ui.autofill.AppBrandIDCardVerifyPwdFrag */
/* loaded from: classes14.dex */
public class C12703xefb74f45 extends com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010 {

    /* renamed from: d, reason: collision with root package name */
    public wj1.m0 f171084d;

    /* renamed from: e, reason: collision with root package name */
    public r45.kc f171085e;

    /* renamed from: f, reason: collision with root package name */
    public r45.jc f171086f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f171087g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f171088h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.j f171089i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f171090m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f171091n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.TextView f171092o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.Button f171093p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.C21493x36e72905 f171094q;

    /* renamed from: r, reason: collision with root package name */
    public com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3 f171095r;

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: dealContentView */
    public void mo26076x2105eeb2(android.view.View view) {
        r45.kc kcVar;
        android.view.View.AccessibilityDelegate a1Var;
        wj1.m0 m0Var = this.f171084d;
        if (m0Var == null || (kcVar = ((wj1.c0) m0Var).f528109a.f171073p) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDCardVerifyPwdFrag", "idCardUILogic or idCardUILogic.getIDCardShowInfo() is null, err");
            return;
        }
        java.util.LinkedList linkedList = kcVar.f460115f;
        if (linkedList == null || linkedList.size() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandIDCardVerifyPwdFrag", "sms.get(0) is null, err, return");
            return;
        }
        this.f171087g = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f564687y1);
        this.f171090m = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f564684xy);
        this.f171091n = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f564688y2);
        this.f171092o = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f564689y3);
        this.f171093p = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.f564673xn);
        this.f171094q = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21493x36e72905) view.findViewById(com.p314xaae8f345.mm.R.id.f564685xz);
        this.f171095r = (com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27990xda3033a3) view.findViewById(com.p314xaae8f345.mm.R.id.f564686y0);
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(mo7438x76847179()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.b_, (android.view.ViewGroup) null);
        this.f171088h = inflate;
        inflate.setBackgroundColor(m7460x893a2f6f().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a07));
        this.f171089i = new com.p314xaae8f345.mm.ui.j(this.f171088h);
        this.f171087g.addView(this.f171088h, 0, new android.widget.LinearLayout.LayoutParams(-1, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1219xd1075a44.b.a(mo7430x19263085())));
        r45.kc kcVar2 = ((wj1.c0) this.f171084d).f528109a.f171073p;
        this.f171085e = kcVar2;
        this.f171089i.g(kcVar2.f460113d);
        this.f171089i.c(new wj1.n0(this));
        this.f171090m.setText(this.f171085e.f460114e);
        this.f171086f = (r45.jc) this.f171085e.f460115f.get(0);
        this.f171091n.setText(((r45.jc) this.f171085e.f460115f.get(0)).f459226e);
        if (this.f171085e.f460115f.size() > 1) {
            this.f171092o.setVisibility(0);
            this.f171092o.setOnClickListener(new wj1.q0(this));
        } else {
            this.f171092o.setVisibility(8);
        }
        this.f171094q.setVisibility(0);
        this.f171094q.m78963x3d4bc56f(new wj1.t0(this));
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21493x36e72905 c21493x36e72905 = this.f171094q;
        wj1.u0 u0Var = new wj1.u0(this);
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21486x59d05a04 c21486x59d05a04 = c21493x36e72905.f278906e;
        if (c21486x59d05a04 != null) {
            c21486x59d05a04.addTextChangedListener(u0Var);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.MMFormVerifyCodeInputView", "watcher : %s, contentET : %s", u0Var, c21486x59d05a04);
        }
        android.widget.EditText m78955xd454f3ba = this.f171094q.m78955xd454f3ba();
        if (m78955xd454f3ba != null) {
            m78955xd454f3ba.setShowSoftInputOnFocus(false);
        }
        if (this.f171094q.m78956xfb85ada3() == null || this.f171094q.m78956xfb85ada3().toString().length() <= 0) {
            this.f171093p.setEnabled(false);
        } else {
            this.f171093p.setEnabled(true);
        }
        this.f171093p.setVisibility(0);
        this.f171093p.setOnClickListener(new wj1.v0(this));
        this.f171095r.m121476x53eb72f9(0);
        this.f171095r.m121469xce4186ff(this.f171094q.m78955xd454f3ba());
        int i17 = la5.a1.f399131b;
        if ((j62.e.g().i("clicfg_accessibility_strategy_android_r", 1, true, true) == 1) && fp.h.c(30) && la5.b.f399133a.g(true)) {
            jx3.f.INSTANCE.t(1624, 11);
            a1Var = new la5.z0();
        } else {
            a1Var = new la5.a1();
        }
        this.f171095r.setAccessibilityDelegate(a1Var);
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: getLayoutId */
    public int getF153758d() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569580fd;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: noActionBar */
    public boolean mo48374x69604d3c() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010, com.p314xaae8f345.mm.p789x6b725fbe.p791x16b96823.C10737xffc632b6, p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670
    /* renamed from: onResume */
    public void mo7517x57429eec() {
        super.mo7517x57429eec();
        if (m78668x4e2d2008()) {
            android.view.View m78646xc2a54588 = m78646xc2a54588();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m78646xc2a54588, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m78646xc2a54588.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m78646xc2a54588, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag", "onResume", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m78658x28280f95().m81450x8e764904(true);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractViewOnAttachStateChangeListenerC21400xb429b010
    /* renamed from: onSwipeBack */
    public void mo25467x59cfc822() {
        wj1.m0 m0Var = this.f171084d;
        if (m0Var != null) {
            ((wj1.c0) m0Var).f528109a.mo2295x59cfc822();
            android.view.View m78646xc2a54588 = m78646xc2a54588();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(m78646xc2a54588, arrayList.toArray(), "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag", "onSwipeBack", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            m78646xc2a54588.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(m78646xc2a54588, "com/tencent/mm/plugin/appbrand/ui/autofill/AppBrandIDCardVerifyPwdFrag", "onSwipeBack", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (m78668x4e2d2008()) {
                m78658x28280f95().m81450x8e764904(false);
            }
        }
    }
}
