package com.tencent.mm.plugin.appbrand.screenshot;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/screenshot/RecordScreenshotTakeReactor$ScreenshotMoveInfo;", "kotlin.jvm.PlatformType", "passedInfo", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<anonymous parameter 1>", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/screenshot/RecordScreenshotTakeReactor$ScreenshotMoveInfo;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class g1<InputType, ResultType> implements com.tencent.mm.ipcinvoker.j {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.appbrand.screenshot.g1 f88487d = new com.tencent.mm.plugin.appbrand.screenshot.g1();

    @Override // com.tencent.mm.ipcinvoker.j
    public void invoke(java.lang.Object obj, com.tencent.mm.ipcinvoker.r rVar) {
        boolean z17;
        com.tencent.mm.vfs.x1 m17;
        com.tencent.mm.plugin.appbrand.screenshot.RecordScreenshotTakeReactor$ScreenshotMoveInfo recordScreenshotTakeReactor$ScreenshotMoveInfo = (com.tencent.mm.plugin.appbrand.screenshot.RecordScreenshotTakeReactor$ScreenshotMoveInfo) obj;
        if (recordScreenshotTakeReactor$ScreenshotMoveInfo == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.RecordScreenshotTakeReactor#Main", "onScreenshotMove, passedInfo is null");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.RecordScreenshotTakeReactor#Main", "onScreenshotMove, passedInfo: " + recordScreenshotTakeReactor$ScreenshotMoveInfo);
        java.lang.String str = recordScreenshotTakeReactor$ScreenshotMoveInfo.f88462e;
        com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(str);
        boolean z18 = false;
        java.lang.String str2 = a17.f213279f;
        if (str2 != null) {
            java.lang.String l17 = com.tencent.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
            }
        }
        com.tencent.mm.vfs.z2 m18 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
        long j17 = (m18.a() && (m17 = m18.f213266a.m(m18.f213267b)) != null) ? m17.f213235e : 0L;
        java.lang.String p17 = com.tencent.mm.vfs.w6.p(str);
        if (p17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.RecordScreenshotTakeReactor#Main", "onScreenshotMove, screenshotMd5 is null");
            return;
        }
        com.tencent.mm.plugin.appbrand.screenshot.z zVar = com.tencent.mm.plugin.appbrand.screenshot.a0.f88464e;
        java.lang.String oldScreenshotPath = recordScreenshotTakeReactor$ScreenshotMoveInfo.f88461d;
        kotlin.jvm.internal.o.g(oldScreenshotPath, "oldScreenshotPath");
        com.tencent.mm.plugin.appbrand.screenshot.a0 a18 = zVar.a();
        if (a18 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrandScreenshotInfoStorage", "updateOnScreenshotMove, storage is null");
        } else {
            l75.k0 db6 = a18.f88466d;
            kotlin.jvm.internal.o.g(db6, "db");
            com.tencent.mm.plugin.appbrand.utils.k4 k4Var = new com.tencent.mm.plugin.appbrand.utils.k4(db6, db6.b(), null);
            try {
                com.tencent.mm.plugin.appbrand.screenshot.AppBrandScreenshotInfo y07 = a18.y0(oldScreenshotPath);
                if (y07 == null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandScreenshotInfoStorage", "updateOnScreenshotMove, query for " + oldScreenshotPath + " fail");
                    z17 = false;
                } else {
                    z17 = false;
                    if (a18.delete(y07, new java.lang.String[0])) {
                        y07.field_screenshotPath = str;
                        y07.field_screenshotLastModified = j17;
                        y07.field_screenshotMd5 = p17;
                        boolean insert = a18.insert(y07);
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateOnScreenshotMove, insert for ");
                        sb6.append(str);
                        sb6.append(' ');
                        sb6.append(insert ? ya.b.SUCCESS : "fail");
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandScreenshotInfoStorage", sb6.toString());
                        z18 = insert;
                        wz5.a.a(k4Var, null);
                    } else {
                        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandScreenshotInfoStorage", "updateOnScreenshotMove, delete for " + oldScreenshotPath + " fail");
                    }
                }
                z18 = z17;
                wz5.a.a(k4Var, null);
            } catch (java.lang.Throwable th6) {
                try {
                    throw th6;
                } catch (java.lang.Throwable th7) {
                    wz5.a.a(k4Var, th6);
                    throw th7;
                }
            }
        }
        if (z18) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.RecordScreenshotTakeReactor#Main", "onScreenshotMove, update passedInfo fail");
    }
}
