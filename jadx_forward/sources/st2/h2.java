package st2;

/* loaded from: classes3.dex */
public class h2 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f493889a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.ref.WeakReference f493890b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f493891c;

    public h2(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var, java.lang.String appId) {
        df2.mu muVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        this.f493889a = "Finder.LiveMiniProgramReceiver";
        this.f493890b = new java.lang.ref.WeakReference(k0Var);
        this.f493891c = appId;
        if (k0Var == null || (muVar = (df2.mu) k0Var.mo57658x143f1b92(df2.mu.class)) == null) {
            return;
        }
        muVar.Z6(appId);
    }

    @Override // android.webkit.ValueCallback
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void onReceiveValue(java.lang.String value) {
        boolean z17;
        st2.h2 h2Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ga0 ga0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(value, "value");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f493889a, "onReceiveValue value".concat(value));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(value)) {
            return;
        }
        java.lang.ref.WeakReference weakReference = this.f493890b;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = weakReference != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) weakReference.get() : null;
        if (k0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f493889a, "pluginLayout is null!");
            return;
        }
        cl0.g gVar = new cl0.g(value);
        int optInt = gVar.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
        java.lang.String mo15082x48bce8a4 = gVar.mo15082x48bce8a4("appId");
        java.lang.String mo15082x48bce8a42 = gVar.mo15082x48bce8a4(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
        gVar.mo15082x48bce8a4("shopWindowId");
        java.lang.String mo15082x48bce8a43 = gVar.mo15082x48bce8a4("sceneNote");
        int optInt2 = gVar.optInt("shareMode");
        long optLong = gVar.optLong("productId");
        int optInt3 = gVar.optInt("usePushAnimation");
        boolean z18 = gVar.mo15080xc3ca103c(nd1.a2.f72910x24728b, 1) == 1;
        java.lang.String mo15083x48bce8a4 = gVar.mo15083x48bce8a4("mode", "");
        boolean z19 = gVar.optInt("autoFullScreenWhenTap") == 1;
        java.lang.String mo15083x48bce8a42 = gVar.mo15083x48bce8a4("entranceGMsgID", "");
        java.lang.String str = (java.lang.String) ((mm2.f6) k0Var.m57654xd7793f26().a(mm2.f6.class)).Q.get(mo15082x48bce8a4);
        boolean z27 = z19;
        if (str == null) {
            str = "";
        }
        java.lang.String str2 = (java.lang.String) ((mm2.f6) k0Var.m57654xd7793f26().a(mm2.f6.class)).R.get(mo15082x48bce8a4);
        if (str2 == null) {
            str2 = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CustomSubjectInfo customSubjectInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CustomSubjectInfo(str2, str);
        boolean optBoolean = gVar.optBoolean("ignoreNextShopShelfOrderHintBeforeReopen");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) this.f493890b.get();
        boolean z28 = (k0Var2 == null || (ga0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ga0) k0Var2.mo57682x2a5e9229(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ga0.class)) == null || ga0Var.w0() != 0) ? false : true;
        if (optBoolean && z28) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) this.f493890b.get();
            mm2.f6 f6Var = k0Var3 != null ? (mm2.f6) k0Var3.m57635xbba4bfc0(mm2.f6.class) : null;
            if (f6Var != null) {
                f6Var.Y6(true);
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f493889a, "showNavigationBar:" + z18);
        if (optInt != 0) {
            if (optInt != 1) {
                return;
            }
            ku5.u0 u0Var = ku5.t0.f394148d;
            st2.g2 g2Var = new st2.g2(optInt2, k0Var, optLong, mo15082x48bce8a4, mo15082x48bce8a42, mo15082x48bce8a43, optInt3, mo15083x48bce8a4, z18, z27, customSubjectInfo, this, mo15083x48bce8a42);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(g2Var, 250L, false);
            return;
        }
        if (zl2.r4.f555483a.w1() || ((mm2.c1) k0Var.m57654xd7793f26().a(mm2.c1.class)).T) {
            z17 = true;
            h2Var = this;
        } else {
            h2Var = this;
            z17 = false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var4 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(mo15082x48bce8a4, h2Var.f493891c) & z17 ? k0Var : null;
        if (k0Var4 != null) {
            qo0.b bVar = qo0.b.f446892h2;
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_SHOPPING_SOURCE_CLICK", true);
            k0Var4.mo46557x60d69242(bVar, bundle);
        }
    }
}
