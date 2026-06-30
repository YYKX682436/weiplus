package k02;

/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final k02.s f384635a = new k02.s();

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r10v0 com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper, still in use, count: 2, list:
          (r10v0 com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper) from 0x0125: MOVE (r29v1 com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper) = (r10v0 com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper)
          (r10v0 com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper) from 0x0120: MOVE (r29v3 com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper) = (r10v0 com.tencent.mm.plugin.downloader.model.CloudGameAppInfoWrapper)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:80)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:56)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    public static final void a(android.content.Context r28, vz.w1 r29, c02.e r30, java.lang.String r31, java.lang.String r32, java.lang.String r33, int r34) {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k02.s.a(android.content.Context, vz.w1, c02.e, java.lang.String, java.lang.String, java.lang.String, int):void");
    }

    public static final void b(android.content.Context context, java.lang.String appId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("GameDetainManager", "gamelog.download, downloader , detain, appId = ".concat(appId));
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        c02.n nVar = new c02.n();
        nVar.f119142d = 2;
        nVar.f119144f = appId;
        lVar.f152197a = nVar;
        lVar.f152198b = new c02.o();
        lVar.f152199c = "/cgi-bin/mmgame-bin/getcloudgameretainconf";
        lVar.f152200d = 4568;
        com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.h0.a(lVar.a(), new k02.r(appId, i17));
    }

    public final void c(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("ActID", str3);
        jSONObject.put("appid", str2);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        java.lang.Object[] objArr = new java.lang.Object[8];
        objArr[0] = java.lang.Integer.valueOf(com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40093xb9aa8b5f(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 0 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40077x31713d(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 4 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40076x31711e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 3 : com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40075x3170ff(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a) ? 2 : 1);
        objArr[1] = 16;
        objArr[2] = 1601;
        objArr[3] = 1;
        objArr[4] = java.lang.Long.valueOf(j17);
        objArr[5] = str;
        objArr[6] = "";
        objArr[7] = java.net.URLEncoder.encode(jSONObject2, com.p314xaae8f345.p3085x8ea91595.p3100xc50a8e98.C26737xe7fcda6e.f56575x346c99d6);
        g0Var.d(16099, objArr);
    }
}
