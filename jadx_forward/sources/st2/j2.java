package st2;

/* loaded from: classes3.dex */
public final class j2 implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f493909a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f493910b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f493911c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f493912d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f493913e;

    public j2(android.content.Context context, java.lang.String appId, java.lang.String iconUrl, java.lang.String title) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iconUrl, "iconUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f493909a = appId;
        this.f493910b = iconUrl;
        this.f493911c = title;
        this.f493912d = "Finder.MiniProgramReceiverV2";
        this.f493913e = new java.lang.ref.WeakReference(context);
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f493912d, "onReceiveValue value" + str + ", outter appId:" + this.f493909a + '!');
        android.content.Context context = (android.content.Context) this.f493913e.get();
        if (context == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f493912d, "on receive value, context has been released");
            return;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return;
        }
        cl0.g gVar = new cl0.g(str);
        int optInt = gVar.optInt(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811);
        java.lang.String mo15082x48bce8a4 = gVar.mo15082x48bce8a4("appId");
        java.lang.String mo15082x48bce8a42 = gVar.mo15082x48bce8a4(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
        gVar.mo15082x48bce8a4("shopWindowId");
        java.lang.String mo15082x48bce8a43 = gVar.mo15082x48bce8a4("sceneNote");
        gVar.optInt("shareMode");
        gVar.optLong("productId");
        int optInt2 = gVar.optInt("usePushAnimation");
        boolean z17 = gVar.mo15080xc3ca103c(nd1.a2.f72910x24728b, 1) == 1;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CustomSubjectInfo customSubjectInfo = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1.CustomSubjectInfo(this.f493911c, this.f493910b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f493912d, "showNavigationBar:" + z17 + ",scene:" + optInt + '!');
        if (optInt != 1) {
            return;
        }
        ku5.u0 u0Var = ku5.t0.f394148d;
        st2.i2 i2Var = new st2.i2(context, mo15082x48bce8a4, mo15082x48bce8a42, mo15082x48bce8a43, optInt2, z17, customSubjectInfo, this);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(i2Var, 250L, false);
    }
}
