package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class e1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f92585d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.p1 f92586e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f92587f;

    public e1(java.lang.String str, com.tencent.mm.plugin.backup.roambackup.p1 p1Var, java.lang.String str2) {
        this.f92585d = str;
        this.f92586e = p1Var;
        this.f92587f = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            java.lang.String str = this.f92585d;
            switch (str.hashCode()) {
                case -1371794205:
                    if (str.equals("roamLiteStartRestore")) {
                        com.tencent.mars.xlog.Log.i(this.f92586e.f92673d, "roamLiteStartRestore notify from pc");
                        long optLong = new org.json.JSONObject(this.f92587f).optLong("packageId", -1L);
                        if (!this.f92586e.Ui()) {
                            com.tencent.mm.plugin.backup.roambackup.p1.wi(this.f92586e, optLong, false);
                            return;
                        }
                        java.util.Map l17 = kz5.c1.l(new jz5.l("packageId", java.lang.Long.valueOf(optLong)));
                        com.tencent.mm.plugin.backup.roambackup.p1 p1Var = this.f92586e;
                        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
                        kotlin.jvm.internal.o.f(context, "getContext(...)");
                        p1Var.aj(context, l17, mv.b0.f331480h);
                        return;
                    }
                    return;
                case -1337781043:
                    if (str.equals("roamLiteStartBackup")) {
                        com.tencent.mars.xlog.Log.i(this.f92586e.f92673d, "roamLiteStartBackup notify from pc");
                        long optLong2 = new org.json.JSONObject(this.f92587f).optLong("packageId", -1L);
                        if (!this.f92586e.Ui()) {
                            com.tencent.mm.plugin.backup.roambackup.p1.wi(this.f92586e, optLong2, true);
                            return;
                        }
                        java.util.Map l18 = kz5.c1.l(new jz5.l("packageId", java.lang.Long.valueOf(optLong2)), new jz5.l("start", 1));
                        com.tencent.mm.plugin.backup.roambackup.p1 p1Var2 = this.f92586e;
                        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                        kotlin.jvm.internal.o.f(context2, "getContext(...)");
                        p1Var2.aj(context2, l18, mv.b0.f331479g);
                        return;
                    }
                    return;
                case -1010292387:
                    if (str.equals("roamLiteNewPackage")) {
                        org.json.JSONObject jSONObject = new org.json.JSONObject(this.f92587f);
                        java.lang.String optString = jSONObject.optString("deviceId");
                        java.lang.String optString2 = jSONObject.optString("deviceName");
                        int optInt = jSONObject.optInt("deviceType", po1.g.f357309g.h());
                        java.lang.String optString3 = jSONObject.optString(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, "");
                        if (this.f92586e.Ui()) {
                            java.util.Map l19 = kz5.c1.l(new jz5.l("deviceName", optString2), new jz5.l("deviceType", java.lang.Integer.valueOf(optInt)), new jz5.l("deviceId", optString), new jz5.l(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, optString3));
                            com.tencent.mm.plugin.backup.roambackup.p1 p1Var3 = this.f92586e;
                            android.content.Context context3 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                            kotlin.jvm.internal.o.f(context3, "getContext(...)");
                            p1Var3.aj(context3, l19, mv.b0.f331478f);
                            return;
                        }
                        com.tencent.mm.plugin.backup.roambackup.d1 d1Var = new com.tencent.mm.plugin.backup.roambackup.d1(this.f92586e, optString3);
                        kotlin.jvm.internal.o.d(optString);
                        if (!(optString.length() == 0)) {
                            kotlin.jvm.internal.o.d(optString2);
                            if (!(optString2.length() == 0)) {
                                po1.g a17 = po1.g.f357306d.a(optInt);
                                if (a17 == po1.g.f357311i) {
                                    com.tencent.mars.xlog.Log.w(this.f92586e.f92673d, "Unsupported deviceType=" + optInt);
                                    d1Var.invoke();
                                    return;
                                }
                                android.content.Intent intent = new android.content.Intent(com.tencent.mm.sdk.platformtools.x2.f193071a, (java.lang.Class<?>) com.tencent.mm.plugin.backup.roambackup.roamlite.CreateRoamLitePkgUI.class);
                                intent.addFlags(268435456);
                                java.lang.String jSONObject2 = new org.json.JSONObject().put("deviceId", optString).put("deviceType", a17.h()).put("deviceNickname", optString2).put("deviceRemark", "").put("devicePath", "").put("deviceUUID", "").put("uriPath", "").toString();
                                kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
                                intent.putExtra("deviceInfo", jSONObject2);
                                intent.putExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_SESSION_ID, optString3);
                                android.content.Context context4 = com.tencent.mm.sdk.platformtools.x2.f193071a;
                                java.util.ArrayList arrayList = new java.util.ArrayList();
                                arrayList.add(intent);
                                java.util.Collections.reverse(arrayList);
                                yj0.a.d(context4, arrayList.toArray(), "com/tencent/mm/plugin/backup/roambackup/RoamBackupFeatureService$handleStatusNotify$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                context4.startActivity((android.content.Intent) arrayList.get(0));
                                yj0.a.f(context4, "com/tencent/mm/plugin/backup/roambackup/RoamBackupFeatureService$handleStatusNotify$1", "run", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                return;
                            }
                        }
                        com.tencent.mars.xlog.Log.w(this.f92586e.f92673d, "Fail to get device info from args=" + this.f92587f);
                        d1Var.invoke();
                        return;
                    }
                    return;
                case 641948856:
                    if (str.equals("PCNetworkResult") && this.f92586e.Ui()) {
                        com.tencent.mars.xlog.Log.i(this.f92586e.f92673d, "receive PCNetworkResult: " + this.f92587f);
                        org.json.JSONObject jSONObject3 = new org.json.JSONObject(this.f92587f);
                        com.tencent.mm.plugin.backup.roambackup.p1 p1Var4 = this.f92586e;
                        java.lang.String optString4 = jSONObject3.optString("wifiName");
                        kotlin.jvm.internal.o.f(optString4, "optString(...)");
                        p1Var4.f92678i = optString4;
                        return;
                    }
                    return;
                case 1274520009:
                    if (str.equals("autoBindResult") && this.f92586e.Ui()) {
                        org.json.JSONObject jSONObject4 = new org.json.JSONObject(this.f92587f);
                        jz5.l lVar = (jz5.l) this.f92586e.f92674e.remove(jSONObject4.optString("bindId", ""));
                        if (lVar != null) {
                            nf.e.f(new com.tencent.mm.plugin.backup.roambackup.z0(lVar, jSONObject4));
                            return;
                        }
                        return;
                    }
                    return;
                case 2029468804:
                    if (str.equals("roamLiteStopAllBackupRestore")) {
                        com.tencent.mars.xlog.Log.i(this.f92586e.f92673d, "roamLiteStopAllBackupRestore notify from pc");
                        if (this.f92586e.Ui()) {
                            ((ku5.t0) ku5.t0.f312615d).B(com.tencent.mm.plugin.backup.roambackup.b1.f92575d);
                            return;
                        }
                        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.backup.roambackup.roamlite.CreateRoamLitePkgUI.f92696s;
                        java.lang.ref.WeakReference weakReference2 = com.tencent.mm.plugin.backup.roambackup.roamlite.CreateRoamLitePkgUI.f92696s;
                        com.tencent.mm.plugin.backup.roambackup.roamlite.CreateRoamLitePkgUI createRoamLitePkgUI = weakReference2 != null ? (com.tencent.mm.plugin.backup.roambackup.roamlite.CreateRoamLitePkgUI) weakReference2.get() : null;
                        if (createRoamLitePkgUI != null) {
                            createRoamLitePkgUI.finish();
                        }
                        java.util.ArrayList arrayList2 = new java.util.ArrayList();
                        int b17 = qo1.j1.f365523a.b(new com.tencent.mm.plugin.backup.roambackup.c1(arrayList2));
                        java.util.Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            ((qo1.f0) it.next()).stop();
                        }
                        com.tencent.mars.xlog.Log.i(this.f92586e.f92673d, "[handleStatusNotify] enterRunningCount=" + b17);
                        if (b17 == 0) {
                            java.lang.ref.WeakReference weakReference3 = com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI.f92712o;
                            com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI roamLiteTaskDetailUI = weakReference3 != null ? (com.tencent.mm.plugin.backup.roambackup.roamlite.RoamLiteTaskDetailUI) weakReference3.get() : null;
                            if (roamLiteTaskDetailUI != null) {
                                roamLiteTaskDetailUI.finish();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                default:
                    return;
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(this.f92586e.f92673d, e17, "Fail to parse JsonObj from args=" + this.f92587f + '.', new java.lang.Object[0]);
        }
    }
}
