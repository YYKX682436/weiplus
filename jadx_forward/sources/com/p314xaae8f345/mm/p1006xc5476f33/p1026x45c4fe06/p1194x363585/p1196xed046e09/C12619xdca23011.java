package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09;

@j95.b(m140513x1e06fd29 = {com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.C11577xd02dca59.class, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.class})
/* renamed from: com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController */
/* loaded from: classes7.dex */
public class C12619xdca23011 extends i95.w implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1181xed046e09.InterfaceC12555xd3034a9a {
    private static final java.lang.String TAG = "MicroMsg.Predownload.AppBrandBatchPreloadController";

    /* renamed from: mBusinessScene */
    private int f35278x7feb493f = 0;

    /* renamed from: mIsGameEnv */
    private boolean f35279x4c7f7924 = false;

    /* renamed from: com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController$a */
    /* loaded from: classes7.dex */
    public static class a implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
        private a() {
        }

        @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
        /* renamed from: invoke */
        public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.C12619xdca23011.TAG, "IPC_PreloadNextGame.invoke()");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.u0.C().P(com.p314xaae8f345.p425x1ea3c036.sdk.p443xbebf4b5d.EnumC3941xa739ed99.f129160f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.f170360r);
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController$b */
    /* loaded from: classes7.dex */
    public static class b implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
        private b() {
        }

        @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
        /* renamed from: invoke */
        public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.C12619xdca23011.TaskParamsCallPredownload taskParamsCallPredownload = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.C12619xdca23011.TaskParamsCallPredownload) obj;
            if (taskParamsCallPredownload == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.C12619xdca23011.TAG, "invoke in mm, NULL data");
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.e(this, taskParamsCallPredownload));
                rVar.a(null);
            }
        }
    }

    /* renamed from: dealPreload */
    private void m52812xdb7977fd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.k kVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.C12621x86d62446 c12621x86d62446) {
        int ordinal = kVar.ordinal();
        if (ordinal == 0) {
            m52815xe2bb69e9(c12621x86d62446.f35286xd0ad84fb, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.EnumC12620x8725ea9c.LOW_LEVEL, true);
            return;
        }
        if (ordinal == 1) {
            m52815xe2bb69e9(c12621x86d62446.f35286xd0ad84fb, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.EnumC12620x8725ea9c.MIDDLE_LEVEL, true);
            m52814xe53770f5(c12621x86d62446);
        } else {
            if (ordinal != 2) {
                return;
            }
            m52815xe2bb69e9(c12621x86d62446.f35286xd0ad84fb, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.EnumC12620x8725ea9c.HIGH_LEVEL, true);
            m52813xaa384883(c12621x86d62446);
        }
    }

    /* renamed from: predownloadAllPackages */
    private void m52813xaa384883(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.C12621x86d62446 c12621x86d62446) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.C12619xdca23011.TaskParamsCallPredownload(c12621x86d62446.f35285x58b7f1c, c12621x86d62446.f35286xd0ad84fb, c12621x86d62446.f35288x346425, this.f35278x7feb493f, false, ""), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.C12619xdca23011.b.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.d(this));
    }

    /* renamed from: predownloadPlugins */
    private void m52814xe53770f5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.C12621x86d62446 c12621x86d62446) {
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.C12619xdca23011.TaskParamsCallPredownload(c12621x86d62446.f35285x58b7f1c, c12621x86d62446.f35286xd0ad84fb, c12621x86d62446.f35288x346425, this.f35278x7feb493f, true, ""), com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.C12619xdca23011.b.class, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.c(this));
    }

    /* renamed from: preloadMiniProgramEnv */
    private void m52815xe2bb69e9(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.EnumC12620x8725ea9c enumC12620x8725ea9c, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.NIL;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0 x0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.WAGAME;
        if (i17 == 1004) {
            x0Var = x0Var3;
        } else {
            if (i17 == 1000) {
                x0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.x0.WASERVICE;
            }
            x0Var = x0Var2;
        }
        if (!ha1.m.a() && this.f35279x4c7f7924 && x0Var == x0Var3) {
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.C12619xdca23011.a.class, null);
            return;
        }
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.b(x0Var)) {
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.m(x0Var)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "preloadMiniProgramEnv alreadyExist");
                return;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "preloadMiniProgramEnv fail internal error");
                return;
            }
        }
        boolean z18 = x0Var == x0Var3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.w wVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.x.f170682a;
        int i18 = z18 ? 1539 : 1144;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6 x6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.x6.f170365w;
        g0Var.A(i18, 49);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.r.j(x0Var, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.b(this, i18), z17, null, x6Var, 2);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1181xed046e09.InterfaceC12555xd3034a9a
    /* renamed from: preload */
    public java.lang.String mo52328xed046e09(org.json.JSONObject jSONObject, boolean z17) {
        int i17;
        float floatValue;
        float floatValue2;
        float floatValue3;
        this.f35279x4c7f7924 = z17;
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONObject.optString("openParams"));
            int optInt = jSONObject2.optInt("visitScene");
            this.f35278x7feb493f = jSONObject2.optInt("businessScene");
            int optInt2 = jSONObject2.optInt("innerScene");
            if (this.f35278x7feb493f == 0) {
                return "fail:mBusinessScene illegal";
            }
            org.json.JSONArray jSONArray = new org.json.JSONArray(jSONObject.optString("preloadList"));
            if (jSONArray.length() <= 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(TAG, "preloadList is empty");
                return "fail:preloadList is empty";
            }
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.j.f170665a == null) {
                synchronized (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.j.class) {
                    if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.j.f170665a == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.j.f170665a = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.j();
                    }
                }
            }
            java.util.Map a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.j.f170665a.a(this.f35278x7feb493f, optInt2);
            if ((a17 == null || a17.size() <= 0) && (i17 = this.f35278x7feb493f) != 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "predictRate null businessScene:%d,innerScene:%d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(optInt2));
                return "fail:mBusinessScene predictRate error!";
            }
            if (this.f35278x7feb493f == 1) {
                floatValue = 0.0f;
                if (a17 != null && a17.size() > 0) {
                    floatValue2 = ((java.lang.Float) a17.get(1)).floatValue();
                    floatValue3 = ((java.lang.Float) a17.get(2)).floatValue();
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "inner predictRate null businessScene:%d,innerScene:%d", java.lang.Integer.valueOf(this.f35278x7feb493f), java.lang.Integer.valueOf(optInt2));
                floatValue2 = 1.0f;
                floatValue3 = 1.0f;
            } else {
                floatValue = ((java.lang.Float) a17.get(0)).floatValue();
                floatValue2 = ((java.lang.Float) a17.get(1)).floatValue();
                floatValue3 = ((java.lang.Float) a17.get(2)).floatValue();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "mVisitScene:%d,mBusinessScene:%d,mInnerScene:%d,mLowLevelRate:%f,middleLevelRate:%f,highLevelRate:%f", java.lang.Integer.valueOf(optInt), java.lang.Integer.valueOf(this.f35278x7feb493f), java.lang.Integer.valueOf(optInt2), java.lang.Float.valueOf(floatValue), java.lang.Float.valueOf(floatValue2), java.lang.Float.valueOf(floatValue3));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i18 = 0; i18 < jSONArray.length(); i18++) {
                org.json.JSONObject optJSONObject = jSONArray.optJSONObject(i18);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.C12621x86d62446 c12621x86d62446 = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.C12621x86d62446();
                c12621x86d62446.f35287xe1eab24a = (float) optJSONObject.optDouble("openRate");
                c12621x86d62446.f35285x58b7f1c = optJSONObject.optString("appId");
                c12621x86d62446.f35286xd0ad84fb = optJSONObject.optInt("appType");
                c12621x86d62446.f35288x346425 = optJSONObject.optString(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714);
                com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7102xfce12a3a c7102xfce12a3a = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7102xfce12a3a();
                c7102xfce12a3a.f144172d = optInt;
                c7102xfce12a3a.f144173e = this.f35278x7feb493f;
                c7102xfce12a3a.f144174f = optInt2;
                c7102xfce12a3a.f144175g = c7102xfce12a3a.b("AppId", c12621x86d62446.f35285x58b7f1c, true);
                c7102xfce12a3a.f144176h = c12621x86d62446.f35286xd0ad84fb;
                c7102xfce12a3a.f144178j = c7102xfce12a3a.b("openRate", java.lang.String.valueOf(c12621x86d62446.f35287xe1eab24a), true);
                c7102xfce12a3a.f144177i = c7102xfce12a3a.b(com.p314xaae8f345.p347x615374d.p349x208df1fe.p358xd1075a44.p360x696c9db.C3365xfbc5fb5e.f13305x20d82714, c12621x86d62446.f35288x346425, true);
                c7102xfce12a3a.k();
                float f17 = c12621x86d62446.f35287xe1eab24a;
                if (f17 < floatValue) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "preloadAppInfo.openRate:%f < mLowLevelRate:%f", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(floatValue));
                } else {
                    arrayList.add(c12621x86d62446);
                }
            }
            if (arrayList.size() <= 0) {
                return "ok";
            }
            java.util.Collections.sort(arrayList, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.a(this));
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.C12621x86d62446 c12621x86d624462 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.C12621x86d62446) arrayList.get(0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(TAG, "high preloadAppInfo openRate:%f,appid:%s", java.lang.Float.valueOf(c12621x86d624462.f35287xe1eab24a), c12621x86d624462.f35285x58b7f1c);
            float f18 = c12621x86d624462.f35287xe1eab24a;
            if (f18 >= floatValue3) {
                m52812xdb7977fd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.k.HIGH_LEVEL, c12621x86d624462);
                return "ok";
            }
            if (f18 >= floatValue2) {
                m52812xdb7977fd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.k.MIDDLE_LEVEL, c12621x86d624462);
                return "ok";
            }
            m52812xdb7977fd(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.k.LOW_LEVEL, c12621x86d624462);
            return "ok";
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(TAG, "parse data error:%s", e17);
            return "fail:params error!";
        }
    }

    /* renamed from: com.tencent.mm.plugin.appbrand.task.preload.AppBrandBatchPreloadController$TaskParamsCallPredownload */
    /* loaded from: classes7.dex */
    public static class TaskParamsCallPredownload implements android.os.Parcelable {

        /* renamed from: CREATOR */
        public static final android.os.Parcelable.Creator<com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.C12619xdca23011.TaskParamsCallPredownload> f35280x681a0c0c = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.p1196xed046e09.f();

        /* renamed from: d, reason: collision with root package name */
        public final java.lang.String f170649d;

        /* renamed from: e, reason: collision with root package name */
        public final java.lang.String f170650e;

        /* renamed from: f, reason: collision with root package name */
        public final int f170651f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f170652g;

        /* renamed from: h, reason: collision with root package name */
        public final int f170653h;

        /* renamed from: i, reason: collision with root package name */
        public final java.lang.String f170654i;

        public TaskParamsCallPredownload(java.lang.String str, int i17, java.lang.String str2, int i18, boolean z17, java.lang.String str3) {
            this.f170649d = str;
            this.f170653h = i17;
            this.f170650e = str2;
            this.f170651f = i18;
            this.f170652g = z17;
            this.f170654i = str3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(android.os.Parcel parcel, int i17) {
            parcel.writeString(this.f170649d);
            parcel.writeInt(this.f170653h);
            parcel.writeString(this.f170650e);
            parcel.writeInt(this.f170651f);
            parcel.writeInt(this.f170652g ? 1 : 0);
            parcel.writeString(this.f170654i);
        }

        public TaskParamsCallPredownload(android.os.Parcel parcel) {
            this.f170649d = parcel.readString();
            this.f170653h = parcel.readInt();
            this.f170650e = parcel.readString();
            this.f170651f = parcel.readInt();
            this.f170652g = parcel.readInt() == 1;
            this.f170654i = parcel.readString();
        }
    }
}
