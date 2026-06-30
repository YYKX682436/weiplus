package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class j5 implements rt1.b1, com.tencent.mm.plugin.appbrand.xc {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.y f79600a;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.jsapi.auth.w4 f79602c;

    /* renamed from: d, reason: collision with root package name */
    public rt1.z0 f79603d;

    /* renamed from: e, reason: collision with root package name */
    public ui1.z f79604e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.DialogInterface f79605f;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.auth.i5 f79608i;

    /* renamed from: b, reason: collision with root package name */
    public final kotlinx.coroutines.y0 f79601b = kotlinx.coroutines.z0.b();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f79606g = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.autogen.mmdata.rpt.WACarLicensePlateAuthLogStruct f79607h = new com.tencent.mm.autogen.mmdata.rpt.WACarLicensePlateAuthLogStruct();

    /* renamed from: j, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.auth.x4 f79609j = new com.tencent.mm.plugin.appbrand.jsapi.auth.x4(this);

    public j5(com.tencent.mm.plugin.appbrand.y yVar, com.tencent.mm.plugin.appbrand.jsapi.auth.v4 v4Var) {
        this.f79600a = yVar;
        this.f79608i = new com.tencent.mm.plugin.appbrand.jsapi.auth.i5(v4Var, this);
    }

    @Override // rt1.b1
    public kotlinx.coroutines.y0 a() {
        return this.f79601b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0, types: [kz5.p0] */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r15v2, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v1, types: [ui1.z] */
    @Override // rt1.b1
    public void b(com.tencent.mm.plugin.car_license_plate.api.entity.MMCarLicensePlateInfo mMCarLicensePlateInfo) {
        ?? r152;
        r45.pw6 pw6Var;
        java.util.ArrayList arrayList;
        if (this.f79606g.get()) {
            return;
        }
        android.content.DialogInterface dialogInterface = this.f79605f;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        this.f79605f = null;
        int i17 = 0;
        boolean z17 = (mMCarLicensePlateInfo == null || (arrayList = mMCarLicensePlateInfo.f94604d) == null || !(arrayList.isEmpty() ^ true)) ? false : true;
        com.tencent.mm.plugin.appbrand.jsapi.auth.w4 w4Var = this.f79602c;
        com.tencent.mm.autogen.mmdata.rpt.WACarLicensePlateAuthLogStruct wACarLicensePlateAuthLogStruct = this.f79607h;
        if (w4Var == null) {
            com.tencent.mm.plugin.appbrand.jsapi.auth.w4 w4Var2 = z17 ? com.tencent.mm.plugin.appbrand.jsapi.auth.w4.f79771d : com.tencent.mm.plugin.appbrand.jsapi.auth.w4.f79772e;
            this.f79602c = w4Var2;
            int ordinal = w4Var2.ordinal();
            if (ordinal == 0) {
                wACarLicensePlateAuthLogStruct.f61920h = 1L;
                wACarLicensePlateAuthLogStruct.f61922j = 1L;
            } else if (ordinal == 1) {
                wACarLicensePlateAuthLogStruct.f61920h = 2L;
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onRenderData, isNotEmpty:");
        sb6.append(z17);
        sb6.append(", settled displayMode:");
        com.tencent.mm.plugin.appbrand.jsapi.auth.w4 w4Var3 = this.f79602c;
        if (w4Var3 == null) {
            kotlin.jvm.internal.o.o("displayMode");
            throw null;
        }
        sb6.append(w4Var3);
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaCarLicensePlateChooserViewController", sb6.toString());
        com.tencent.mm.plugin.appbrand.jsapi.auth.w4 w4Var4 = com.tencent.mm.plugin.appbrand.jsapi.auth.w4.f79771d;
        com.tencent.mm.plugin.appbrand.jsapi.auth.w4 w4Var5 = this.f79602c;
        if (w4Var5 == null) {
            kotlin.jvm.internal.o.o("displayMode");
            throw null;
        }
        if (w4Var4 != w4Var5) {
            com.tencent.mm.plugin.appbrand.jsapi.auth.w4 w4Var6 = com.tencent.mm.plugin.appbrand.jsapi.auth.w4.f79772e;
            if (w4Var5 == null) {
                kotlin.jvm.internal.o.o("displayMode");
                throw null;
            }
            if (w4Var6 != w4Var5 || !z17) {
                if (w4Var5 == null) {
                    kotlin.jvm.internal.o.o("displayMode");
                    throw null;
                }
                if (w4Var6 != w4Var5 || z17) {
                    return;
                }
                h().f94624e = true;
                i(h(), new com.tencent.mm.plugin.appbrand.jsapi.auth.c5(this));
                return;
            }
        }
        h().f94624e = false;
        if (2 == wACarLicensePlateAuthLogStruct.f61922j) {
            wACarLicensePlateAuthLogStruct.f61922j = 3L;
        }
        if (!z17) {
            this.f79608i.a();
            return;
        }
        if (this.f79604e == null) {
            com.tencent.mm.plugin.appbrand.y yVar = this.f79600a;
            kotlin.jvm.internal.o.d(yVar);
            ui1.z a17 = ui1.w.a(yVar, new com.tencent.mm.plugin.appbrand.jsapi.auth.z4(this, yVar), null);
            this.f79604e = a17;
            a17.setAppBrandName(yVar.t3().E0().f305841d);
            a17.setIconUrl(yVar.t3().E0().f305843f);
            a17.setApplyWording(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.aqu));
            a17.setRequestDesc(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.aqv));
            pt1.b bVar = pt1.b.f358229a;
            bVar.getClass();
            f06.v[] vVarArr = pt1.b.f358230b;
            a17.setSimpleDetailDesc((java.lang.String) pt1.b.f358231c.b(bVar, vVarArr[0]));
            r45.i7 i7Var = (r45.i7) pt1.b.f358232d.b(bVar, vVarArr[1]);
            if (i7Var.f376773d) {
                java.lang.String str = i7Var.f376774e;
                if (!(str == null || str.length() == 0)) {
                    a17.o(true);
                    a17.setExplainOnClickListener(new com.tencent.mm.plugin.appbrand.jsapi.auth.a5(a17, yVar, i7Var));
                    a17.setFunctionButtonText(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490778ar0));
                    a17.setFunctionButtonTextColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f479308vo));
                    a17.setFunctionButtonOnClickListener(new com.tencent.mm.plugin.appbrand.jsapi.auth.b5(this));
                    a17.setPositiveButtonText(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f492400gh3));
                    a17.setNegativeButtonText(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.gii));
                    pw6Var = pt1.b.f358234f;
                    if (pw6Var != null && pw6Var.f383440d && !android.text.TextUtils.isEmpty(pw6Var.f383441e)) {
                        java.lang.String wording = pw6Var.f383441e;
                        kotlin.jvm.internal.o.f(wording, "wording");
                        a17.setUserAgreementCheckBoxWording(wording);
                        a17.setIExternalToolsHelper((com.tencent.mm.plugin.appbrand.jsapi.r1) yVar.q(com.tencent.mm.plugin.appbrand.jsapi.r1.class));
                    }
                    a17.r(yVar);
                }
            }
            a17.o(false);
            a17.setFunctionButtonText(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490778ar0));
            a17.setFunctionButtonTextColor(com.tencent.mm.sdk.platformtools.x2.a(com.tencent.mm.R.color.f479308vo));
            a17.setFunctionButtonOnClickListener(new com.tencent.mm.plugin.appbrand.jsapi.auth.b5(this));
            a17.setPositiveButtonText(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f492400gh3));
            a17.setNegativeButtonText(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.gii));
            pw6Var = pt1.b.f358234f;
            if (pw6Var != null) {
                java.lang.String wording2 = pw6Var.f383441e;
                kotlin.jvm.internal.o.f(wording2, "wording");
                a17.setUserAgreementCheckBoxWording(wording2);
                a17.setIExternalToolsHelper((com.tencent.mm.plugin.appbrand.jsapi.r1) yVar.q(com.tencent.mm.plugin.appbrand.jsapi.r1.class));
            }
            a17.r(yVar);
        }
        ?? r47 = this.f79604e;
        if (r47 == 0) {
            kotlin.jvm.internal.o.o("listHalfScreenDialog");
            throw null;
        }
        if (z17) {
            kotlin.jvm.internal.o.d(mMCarLicensePlateInfo);
            r152 = new java.util.ArrayList();
            int i18 = 0;
            for (java.lang.Object obj : mMCarLicensePlateInfo.f94604d) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                java.lang.String str2 = (java.lang.String) obj;
                r152.add(new fl1.h1(1, u46.l.t(str2, i17, 2) + (char) 183 + u46.l.t(str2, 2, str2.length()), "", "webapi_userplateinfo", null, kotlin.jvm.internal.o.b(mMCarLicensePlateInfo.f94605e, str2), "", i18));
                i18 = i19;
                i17 = 0;
            }
        } else {
            r152 = kz5.p0.f313996d;
        }
        r47.setSelectListItem(r152);
    }

    @Override // rt1.b1
    public void c(qt1.f exception) {
        kotlin.jvm.internal.o.g(exception, "exception");
        com.tencent.mars.xlog.Log.e("MicroMsg.WxaCarLicensePlateChooserViewController", "onRenderError(" + exception + ')');
        st1.g.b(exception);
        if ((exception.f366523g instanceof qt1.i) && this.f79602c == null) {
            this.f79608i.a();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    @Override // rt1.b1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.app.Activity d() {
        /*
            r3 = this;
            com.tencent.mm.plugin.appbrand.y r0 = r3.f79600a
            r1 = 0
            if (r0 == 0) goto La
            xi1.g r0 = r0.getWindowAndroid()
            goto Lb
        La:
            r0 = r1
        Lb:
            if (r0 != 0) goto Lf
        Ld:
            r0 = r1
            goto L24
        Lf:
            boolean r2 = r0 instanceof com.tencent.mm.plugin.appbrand.platform.window.activity.r0
            if (r2 == 0) goto L16
            com.tencent.mm.plugin.appbrand.platform.window.activity.r0 r0 = (com.tencent.mm.plugin.appbrand.platform.window.activity.r0) r0
            goto L24
        L16:
            boolean r2 = r0 instanceof xi1.q
            if (r2 == 0) goto Ld
            xi1.q r0 = (xi1.q) r0
            xi1.g r0 = r0.f454713d
            boolean r2 = r0 instanceof com.tencent.mm.plugin.appbrand.platform.window.activity.r0
            if (r2 == 0) goto Ld
            com.tencent.mm.plugin.appbrand.platform.window.activity.r0 r0 = (com.tencent.mm.plugin.appbrand.platform.window.activity.r0) r0
        L24:
            if (r0 == 0) goto L2c
            android.app.Activity r0 = r0.w()
            if (r0 != 0) goto L38
        L2c:
            com.tencent.mm.plugin.appbrand.y r0 = r3.f79600a
            if (r0 == 0) goto L34
            android.content.Context r1 = r0.getContext()
        L34:
            android.app.Activity r0 = q75.a.a(r1)
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.appbrand.jsapi.auth.j5.d():android.app.Activity");
    }

    @Override // rt1.b1
    public void e(rt1.a1 request) {
        kotlin.jvm.internal.o.g(request, "request");
        if (rt1.a1.f399384d == request) {
            com.tencent.mm.plugin.appbrand.y yVar = this.f79600a;
            com.tencent.mm.plugin.appbrand.AppBrandRuntime t37 = yVar != null ? yVar.t3() : null;
            if (t37 == null) {
                return;
            }
            ph1.l lVar = new ph1.l();
            lVar.f354337d = new com.tencent.mm.plugin.appbrand.jsapi.auth.d5(t37);
            lVar.b(t37, false);
            this.f79605f = lVar;
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.xc
    public void f(com.tencent.mm.plugin.appbrand.AppBrandRuntime appBrandRuntime, com.tencent.mm.plugin.appbrand.config.AppBrandInitConfig appBrandInitConfig) {
        if (appBrandRuntime != null) {
            appBrandRuntime.I.remove(this);
        }
        g(false);
    }

    public final void g(boolean z17) {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime t37;
        u81.h hVar;
        if (this.f79606g.getAndSet(true)) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WxaCarLicensePlateChooserViewController", "dismiss stack:" + android.util.Log.getStackTraceString(new java.lang.Throwable()));
        com.tencent.mm.plugin.appbrand.y yVar = this.f79600a;
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = yVar instanceof com.tencent.mm.plugin.appbrand.page.v5 ? (com.tencent.mm.plugin.appbrand.page.v5) yVar : null;
        if (v5Var != null) {
            v5Var.K(this.f79609j);
        }
        com.tencent.mm.plugin.appbrand.y yVar2 = this.f79600a;
        if (yVar2 != null && (t37 = yVar2.t3()) != null && (hVar = t37.N) != null) {
            hVar.c(this.f79609j);
        }
        this.f79606g.set(true);
        kotlinx.coroutines.z0.e(this.f79601b, null, 1, null);
        ui1.z zVar = this.f79604e;
        if (zVar != null) {
            if (zVar == null) {
                kotlin.jvm.internal.o.o("listHalfScreenDialog");
                throw null;
            }
            com.tencent.mm.plugin.appbrand.y yVar3 = this.f79600a;
            kotlin.jvm.internal.o.d(yVar3);
            zVar.p(yVar3);
        }
        android.content.DialogInterface dialogInterface = this.f79605f;
        if (dialogInterface != null) {
            dialogInterface.dismiss();
        }
        this.f79605f = null;
        this.f79600a = null;
        if (z17) {
            this.f79607h.k();
        }
    }

    public final com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel h() {
        rt1.z0 z0Var = this.f79603d;
        if (z0Var != null) {
            return ((rt1.p1) z0Var).b();
        }
        kotlin.jvm.internal.o.o("viewPresenter");
        throw null;
    }

    public final void i(com.tencent.mm.plugin.car_license_plate.ui.CarLicensePlateListViewContract$ViewModel carLicensePlateListViewContract$ViewModel, yz5.l lVar) {
        android.app.Activity d17 = d();
        if (d17 != null) {
            kotlinx.coroutines.l.d(this.f79601b, null, null, new com.tencent.mm.plugin.appbrand.jsapi.auth.f5(d17, carLicensePlateListViewContract$ViewModel, lVar, null), 3, null);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.WxaCarLicensePlateChooserViewController", "startListUI get NULL activity");
        if (lVar != null) {
            lVar.invoke(new android.app.Instrumentation.ActivityResult(0, null));
        }
    }
}
