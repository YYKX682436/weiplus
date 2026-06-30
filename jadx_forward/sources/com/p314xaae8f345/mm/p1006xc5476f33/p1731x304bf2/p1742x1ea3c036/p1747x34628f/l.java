package com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f;

/* loaded from: classes8.dex */
public class l extends com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 {

    /* renamed from: j2, reason: collision with root package name */
    public final java.util.Map f221443j2;

    /* renamed from: k2, reason: collision with root package name */
    public final java.util.Map f221444k2;

    /* renamed from: l2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.k f221445l2;

    /* renamed from: m2, reason: collision with root package name */
    public android.widget.FrameLayout f221446m2;

    /* renamed from: n2, reason: collision with root package name */
    public android.view.View f221447n2;

    /* renamed from: o2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 f221448o2;

    /* renamed from: p2, reason: collision with root package name */
    public final java.lang.String f221449p2;

    /* renamed from: q2, reason: collision with root package name */
    public android.app.Dialog f221450q2;

    /* renamed from: r2, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f221451r2;

    /* renamed from: s2, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.j f221452s2;

    public l(sd.x xVar, sd.o0 o0Var, android.os.Bundle bundle) {
        super(xVar, o0Var, bundle);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = new java.util.concurrent.ConcurrentHashMap();
        this.f221443j2 = concurrentHashMap;
        this.f221444k2 = new java.util.concurrent.ConcurrentHashMap();
        android.content.Context context = this.f488143d;
        if (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) {
            this.f221451r2 = (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context;
        }
        java.lang.String string = bundle.getString("game_tab_key");
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            concurrentHashMap.put(string, this);
        }
        this.f221448o2 = this;
        this.V1 = this;
        c0(this, string);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y1 y1Var = this.f263719t;
        if (y1Var != null) {
            y1Var.b();
        }
        this.f221449p2 = bundle.getString("game_pre_inject_data");
        this.f488190n.remove("game_pre_inject_data");
        if (this.f221450q2 == null) {
            p012xc85e97e9.p016x746ad0e3.app.i0 i0Var = new p012xc85e97e9.p016x746ad0e3.app.i0(this.f488143d, com.p314xaae8f345.mm.R.C30868x68b1db1.f575753hf);
            this.f221450q2 = i0Var;
            i0Var.setCanceledOnTouchOutside(true);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0
    public void C(java.lang.String str) {
        super.C(str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0
    public void D(int i17, java.lang.String str, java.lang.String str2) {
        super.D(i17, str, str2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0
    public java.lang.String O() {
        return this.f221449p2;
    }

    public void W(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var;
        android.view.View view;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || (x0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) ((java.util.concurrent.ConcurrentHashMap) this.f221443j2).get(str)) == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabWebPage", "switch to tab: %s", str);
        if (x0Var != this || (view = this.f221447n2) == null) {
            x0Var.f488187h.bringToFront();
            x0Var.g();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var2 = this.f221448o2;
            if (x0Var2 != x0Var) {
                x0Var2.d();
            }
        } else {
            view.bringToFront();
        }
        this.f221448o2 = x0Var;
    }

    public final void X(java.lang.String str, int i17) {
        java.util.Map map = this.f221444k2;
        java.lang.Integer num = (java.lang.Integer) map.get(str);
        if (num == null) {
            map.put(str, java.lang.Integer.valueOf(i17));
        } else {
            map.put(str, java.lang.Integer.valueOf(i17 | num.intValue()));
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || !map.containsKey(str)) {
            return;
        }
        java.util.Map map2 = this.f221443j2;
        if (map2.containsKey(str) && ((java.lang.Integer) map.get(str)).intValue() == 3) {
            map.put(str, 4);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0) map2.get(str)).o("javascript:(function(){ window.__gameTabFirstShow__= 1; })()", null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabWebPage", "injectTabFirstShow, tabKey:%s", str);
        }
    }

    public void Y() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabWebPage", "computeFcp()");
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var : ((java.util.concurrent.ConcurrentHashMap) this.f221443j2).values()) {
            if (x0Var != null) {
                x0Var.M(null);
            }
        }
    }

    public final java.lang.String Z(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var) {
        if (x0Var == null) {
            return "";
        }
        for (java.util.Map.Entry entry : this.f221443j2.entrySet()) {
            if (x0Var == entry.getValue()) {
                return (java.lang.String) entry.getKey();
            }
        }
        return "";
    }

    @Override // sd.u0, sd.k
    public void a() {
        super.a();
        java.util.Map map = this.f221443j2;
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var : map.values()) {
            if (x0Var != null && x0Var != this) {
                x0Var.a();
            }
        }
        map.clear();
    }

    public void a0(java.lang.String str, java.lang.String str2, boolean z17) {
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
            return;
        }
        java.util.Map map = this.f221443j2;
        if (((java.util.concurrent.ConcurrentHashMap) map).containsKey(str) || this.f221446m2 == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabWebPage", "insertTabHomeWeb, tabKey:%s, url:%s", str, str2);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putAll(this.f488190n);
        bundle.putString("rawUrl", str2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0(this.f488145f, null, bundle);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.y1 y1Var = x0Var.f263719t;
        if (y1Var != null) {
            y1Var.b();
        }
        x0Var.V1 = this;
        x0Var.W1 = z17;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f221451r2;
        if (abstractActivityC21394xb3d2c0cf != null && abstractActivityC21394xb3d2c0cf.mo78538xecd98af8() && z17) {
            x0Var.Y1 = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabWebPage", "mockFetchFcp, url:%s", str2);
        }
        c0(x0Var, str);
        this.f221446m2.addView(x0Var.f488187h, 0, new android.widget.FrameLayout.LayoutParams(-1, -1));
        x0Var.b(str2, bundle);
        ((java.util.concurrent.ConcurrentHashMap) map).put(str, x0Var);
    }

    public void b0() {
    }

    public void c0(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var, java.lang.String str) {
        if (x0Var == null || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        x0Var.f221488g2 = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.i(this, str, x0Var);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0, sd.k
    public void d() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var = this.f221448o2;
        if (x0Var == null) {
            return;
        }
        if (!(x0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.l)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabWebPage", "onBackground, url:%s", x0Var.s());
            this.f221448o2.e();
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var2 = this.f221448o2;
            if (x0Var2.f263722w.isShown()) {
                x0Var2.J(false);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabWebPage", "GameTabWebPage onBackground, url:%s", x0Var.s());
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var3 = this.f221448o2;
        if (x0Var3 == this) {
            super.d();
        } else {
            x0Var3.d();
        }
        if (this.f263722w.isShown()) {
            J(false);
        }
    }

    public void d0(java.lang.String str) {
        if (this.f221445l2 != null) {
            if (!android.text.TextUtils.equals(str, "chat")) {
                this.f221445l2.g(str);
            } else if (this.f221445l2.h() == 1) {
                b0();
            } else {
                this.f221445l2.g(str);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0, sd.k
    public void f() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabWebPage", "onDestroy");
        android.app.Dialog dialog = this.f221450q2;
        if (dialog != null) {
            dialog.dismiss();
            this.f221450q2 = null;
        }
        super.f();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0, sd.k
    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var = this.f221448o2;
        if (x0Var == null) {
            return;
        }
        X(Z(x0Var), 1);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var2 = this.f221448o2;
        if (x0Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.l) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabWebPage", "GameTabWebPage onForeground, url:%s", x0Var2.s());
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0 x0Var3 = this.f221448o2;
            if (x0Var3 == this) {
                super.g();
            } else {
                x0Var3.g();
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameTabWebPage", "onForeground, url:%s", x0Var2.s());
            this.f221448o2.h();
        }
        android.app.Dialog dialog = this.f221450q2;
        if (dialog != null) {
            dialog.show();
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.g gVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.g(this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(gVar, 50L, false);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1742x1ea3c036.p1747x34628f.x0, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2408x1ea3c036.e0, sd.u0
    public android.view.View k() {
        android.view.View k17 = super.k();
        this.f221447n2 = k17;
        android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(this.f488143d);
        this.f221446m2 = frameLayout;
        frameLayout.addView(k17, new android.widget.FrameLayout.LayoutParams(-1, -1));
        return this.f221446m2;
    }
}
