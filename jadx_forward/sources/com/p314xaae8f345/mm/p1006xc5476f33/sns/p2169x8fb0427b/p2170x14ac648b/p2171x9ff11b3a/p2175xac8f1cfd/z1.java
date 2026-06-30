package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd;

/* loaded from: classes4.dex */
public class z1 extends com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2 {
    public static final java.util.HashMap I = new java.util.HashMap();
    public final db4.a B;
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 C;
    public final com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.y1 D;
    public java.lang.String E;
    public final java.lang.String F;
    public final java.lang.String G;
    public final java.lang.String H;

    public z1(android.content.Context context, db4.a aVar, android.view.ViewGroup viewGroup) {
        super(context, aVar, viewGroup);
        this.E = "0";
        this.B = aVar;
        if (aVar.f309807z1 != null) {
            this.f246919t.b("appointmentId", aVar.f309807z1.f484079a + "");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ADAppointment.AdLandingPageAppointmentBtnComp", "appointmentInfo==null");
            this.f246919t.b("appointmentId", "");
        }
        this.F = aVar.M;
        this.G = aVar.I;
        this.H = aVar.N;
        this.D = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.y1(context, this, aVar.f309807z1.f484079a);
    }

    public static void h0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z1 z1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        z1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doCancelReport", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            ab4.n0 u17 = z1Var.u();
            jSONObject.put("snsid", u17.j());
            jSONObject.put("uxinfo", u17.o());
            jSONObject.put(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54548xbbf10811, u17.l());
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            s34.a aVar = z1Var.B.f309807z1;
            jSONObject2.put("appointmentId", aVar == null ? 0L : aVar.f484079a);
            jSONObject.put("extInfo", jSONObject2);
            ca4.m0.a("canvas_ad_appointment_cancel_action", jSONObject.toString());
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ADAppointment.AdLandingPageAppointmentBtnComp", "doCancelReport, exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doCancelReport", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$200", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
    }

    public static void i0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z1 z1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        z1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showSuccHalfDialog", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        db4.a aVar = z1Var.B;
        if (aVar.f309807z1 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showSuccHalfDialog", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        } else {
            try {
                ab4.n0 u17 = z1Var.u();
                java.lang.String o17 = u17.o();
                boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
                if (o17 == null) {
                    o17 = "";
                }
                new c84.c(z1Var.f246582d, 2).h(u17.j(), o17, aVar.f309807z1, z1Var.E);
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ADAppointment.AdLandingPageAppointmentBtnComp", "showSuccHalfDialog exp=" + th6.toString());
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showSuccHalfDialog", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$400", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void j0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z1 r5, int r6, boolean r7) {
        /*
            java.lang.String r0 = "access$500"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r0, r1)
            r5.getClass()
            java.lang.String r2 = "showResultToast"
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(r2, r1)
            db4.a r3 = r5.B
            s34.a r3 = r3.f309807z1
            if (r3 != 0) goto L1a
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r1)
            goto L5c
        L1a:
            if (r6 != 0) goto L21
            if (r7 != 0) goto L2c
            java.lang.String r6 = r3.f484089k
            goto L2e
        L21:
            r4 = 1
            if (r6 != r4) goto L2c
            if (r7 == 0) goto L29
            java.lang.String r6 = r3.f484090l
            goto L2e
        L29:
            java.lang.String r6 = r3.f484091m
            goto L2e
        L2c:
            java.lang.String r6 = ""
        L2e:
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 != 0) goto L59
            android.content.Context r5 = r5.f246582d
            if (r7 == 0) goto L3c
            db5.t7.h(r5, r6)     // Catch: java.lang.Throwable -> L40
            goto L59
        L3c:
            db5.t7.g(r5, r6)     // Catch: java.lang.Throwable -> L40
            goto L59
        L40:
            r5 = move-exception
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "showResultToast, exp="
            r6.<init>(r7)
            java.lang.String r5 = r5.toString()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "ADAppointment.AdLandingPageAppointmentBtnComp"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r6, r5)
        L59:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r2, r1)
        L5c:
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z1.j0(com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.z1, int, boolean):void");
    }

    public static void l0(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z1 z1Var, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        z1Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onAppointmentStatusChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        db4.a aVar = z1Var.B;
        if (aVar.f309807z1 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAppointmentStatusChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ADAppointment.AdLandingPageAppointmentBtnComp", "onStatusChange, old=" + z1Var.E + ", new=" + str);
            z1Var.E = str;
            z1Var.q0();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69997x6c093c4c(z1Var.u().j(), l44.d.e(aVar.f309807z1.f484079a), str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onAppointmentStatusChange", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$600", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2
    public void Y() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        db4.a aVar = this.B;
        if (aVar.f309807z1 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ADAppointment.AdLandingPageAppointmentBtnComp", "onBtnClick, status=" + this.E);
        boolean equals = "0".equals(this.E);
        android.content.Context context = this.f246582d;
        if (equals) {
            ab4.n0 u17 = u();
            s34.a aVar2 = aVar.f309807z1;
            boolean z17 = (aVar2.f484094p != 1 || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar2.f484096r) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f309807z1.f484095q)) ? false : true;
            java.lang.String m69867x92bb0121 = z17 ? com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69867x92bb0121() : "";
            if (z17 && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(m69867x92bb0121) && (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("requestPhoneNumberInHfScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
                eb4.d dVar = eb4.d.f332417a;
                s34.a aVar3 = aVar.f309807z1;
                dVar.a((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, m69867x92bb0121, aVar3.f484095q, aVar3.f484096r, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.u1(this, u17, m69867x92bb0121));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("requestPhoneNumberInHfScreen", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
            } else {
                n0(u17.o(), aVar.f309807z1.f484079a, 0);
            }
            this.f246919t.a("opType", 0L);
        } else if ("1".equals(this.E)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showCancelSheet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
            if (aVar.f309807z1 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showCancelSheet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
            } else {
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(context, 1, false);
                k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.v1(this);
                k0Var.X1 = true;
                k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.w1(this);
                k0Var.v();
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showCancelSheet", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
            }
            this.f246919t.a("opType", 1L);
        }
        P();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onBtnClick", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.z2, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.a2
    public void k() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        super.k();
        db4.a aVar = this.B;
        s34.a aVar2 = aVar.f309807z1;
        if (aVar2 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ADAppointment.AdLandingPageAppointmentBtnComp", "fillItem,appointmentInfo==null");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
            return;
        }
        long j17 = aVar2.f484079a;
        ab4.n0 u17 = u();
        java.lang.String j18 = u17.j();
        l44.d.e(j17);
        java.lang.String d17 = l44.d.d(j18, aVar.f309807z1);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ADAppointment.AdLandingPageAppointmentBtnComp", "fillItem, snsId=" + j18 + ", cacheStatus=" + d17);
        this.E = d17;
        q0();
        if (!"1000".equals(this.E)) {
            java.util.HashMap hashMap = I;
            long longValue = hashMap.containsKey(java.lang.Long.valueOf(j17)) ? ((java.lang.Long) hashMap.get(java.lang.Long.valueOf(j17))).longValue() : 0L;
            if (longValue == 0 || java.lang.System.currentTimeMillis() - longValue > 30000) {
                n0(u17.o(), j17, 2);
                hashMap.put(java.lang.Long.valueOf(j17), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fillItem", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
    }

    public void m0() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hideLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        try {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var = this.C;
            if (u3Var != null && u3Var.isShowing()) {
                this.C.dismiss();
            }
            android.content.Context context = this.f246582d;
            if (context instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.p2170x14ac648b.p2171x9ff11b3a.p2175xac8f1cfd.ka.f((com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18007x6d5e9773) context);
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ADAppointment.AdLandingPageAppointmentBtnComp", "showLoading exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hideLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
    }

    public final void n0(java.lang.String str, long j17, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sendAppointmentReq", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        o0(str, j17, i17, "");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendAppointmentReq", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
    }

    public final void o0(java.lang.String str, long j17, int i17, java.lang.String str2) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("sendAppointmentReq", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ADAppointment.AdLandingPageAppointmentBtnComp", "sendAppointmentReq, opType=" + i17 + ", id=" + j17 + ", uxInfo=" + str);
        if (android.text.TextUtils.isEmpty(str) || j17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendAppointmentReq", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
            return;
        }
        if (i17 == 0) {
            p0();
        } else if (i17 == 1) {
            p0();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.BinderC17870x451d307e.m69779x9cf0d20b().m69995xf8a91a27(str, j17, i17, str2, this.D);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("sendAppointmentReq", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
    }

    public void p0() {
        android.content.Context context = this.f246582d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("showLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        try {
            java.lang.String string = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572137zq);
            if (this.C == null) {
                this.C = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.c(context, string, true, 0, null);
            }
            if (!this.C.isShowing()) {
                this.C.show();
            }
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ADAppointment.AdLandingPageAppointmentBtnComp", "showLoading exp=" + th6.toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("showLoading", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
    }

    public void q0() {
        android.widget.Button button;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateBtnUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
        db4.a aVar = this.B;
        if (aVar.f309807z1 == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBtnUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ADAppointment.AdLandingPageAppointmentBtnComp", "updateBtnUI, status=" + this.E);
        android.widget.Button button2 = this.f247392v;
        if (button2 != null) {
            button2.setEnabled(true);
        }
        boolean equals = "0".equals(this.E);
        java.lang.String str = this.H;
        java.lang.String str2 = this.G;
        java.lang.String str3 = this.F;
        if (equals) {
            aVar.M = str3;
            aVar.I = str2;
            aVar.N = str;
        } else {
            int A1 = (int) (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.A1("0.6") * 255.0d);
            if (!android.text.TextUtils.isEmpty(str3)) {
                X().M = java.lang.String.format("#%02x%s", java.lang.Integer.valueOf(A1), str3.substring(1));
            }
            if (!android.text.TextUtils.isEmpty(str2)) {
                X().I = java.lang.String.format("#%02x%s", java.lang.Integer.valueOf(A1), str2.substring(1));
            }
            if (!android.text.TextUtils.isEmpty(str)) {
                X().N = java.lang.String.format("#%02x%s", java.lang.Integer.valueOf(A1), str.substring(1));
            }
            if ("1000".equals(this.E) && (button = this.f247392v) != null) {
                button.setEnabled(false);
            }
        }
        b0();
        if ("1".equals(this.E)) {
            this.f247392v.setText(aVar.f309807z1.f484087i);
        } else if ("1000".equals(this.E)) {
            this.f247392v.setText(aVar.f309807z1.f484093o);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateBtnUI", "com.tencent.mm.plugin.sns.storage.AdLandingPagesStorage.AdLandingPageComponent.component.AdLandingPageAppointmentBtnComp");
    }
}
