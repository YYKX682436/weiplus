package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002*\u0010\u0005\u001a&\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004 \u0001*\u0012\u0012\f\u0012\n \u0001*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/tencent/mm/plugin/appbrand/screenshot/RecordScreenshotTakeReactor$ScreenshotMoveInfo;", "kotlin.jvm.PlatformType", "passedInfo", "Lcom/tencent/mm/ipcinvoker/r;", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "<anonymous parameter 1>", "Ljz5/f0;", "invoke", "(Lcom/tencent/mm/plugin/appbrand/screenshot/RecordScreenshotTakeReactor$ScreenshotMoveInfo;Lcom/tencent/mm/ipcinvoker/r;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes7.dex */
final class g1<InputType, ResultType> implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.g1 f170020d = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.g1();

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        boolean z17;
        com.p314xaae8f345.mm.vfs.x1 m17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.C12571xabc5a085 c12571xabc5a085 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.C12571xabc5a085) obj;
        if (c12571xabc5a085 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.RecordScreenshotTakeReactor#Main", "onScreenshotMove, passedInfo is null");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.RecordScreenshotTakeReactor#Main", "onScreenshotMove, passedInfo: " + c12571xabc5a085);
        java.lang.String str = c12571xabc5a085.f169995e;
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
        boolean z18 = false;
        java.lang.String str2 = a17.f294812f;
        if (str2 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
            if (!str2.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        long j17 = (m18.a() && (m17 = m18.f294799a.m(m18.f294800b)) != null) ? m17.f294768e : 0L;
        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(str);
        if (p17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.RecordScreenshotTakeReactor#Main", "onScreenshotMove, screenshotMd5 is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.z zVar = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.a0.f169997e;
        java.lang.String oldScreenshotPath = c12571xabc5a085.f169994d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(oldScreenshotPath, "oldScreenshotPath");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.a0 a18 = zVar.a();
        if (a18 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrandScreenshotInfoStorage", "updateOnScreenshotMove, storage is null");
        } else {
            l75.k0 db6 = a18.f169999d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(db6, "db");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k4 k4Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.k4(db6, db6.b(), null);
            try {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566.C12570xcc3b76da y07 = a18.y0(oldScreenshotPath);
                if (y07 == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandScreenshotInfoStorage", "updateOnScreenshotMove, query for " + oldScreenshotPath + " fail");
                    z17 = false;
                } else {
                    z17 = false;
                    if (a18.mo9951xb06685ab(y07, new java.lang.String[0])) {
                        y07.f66474x90a2b490 = str;
                        y07.f66472x127cb8ea = j17;
                        y07.f66473xe3a21bb3 = p17;
                        boolean mo880xb970c2b9 = a18.mo880xb970c2b9(y07);
                        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateOnScreenshotMove, insert for ");
                        sb6.append(str);
                        sb6.append(' ');
                        sb6.append(mo880xb970c2b9 ? ya.b.f77504xbb80cbe3 : "fail");
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandScreenshotInfoStorage", sb6.toString());
                        z18 = mo880xb970c2b9;
                        wz5.a.a(k4Var, null);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandScreenshotInfoStorage", "updateOnScreenshotMove, delete for " + oldScreenshotPath + " fail");
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
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.RecordScreenshotTakeReactor#Main", "onScreenshotMove, update passedInfo fail");
    }
}
