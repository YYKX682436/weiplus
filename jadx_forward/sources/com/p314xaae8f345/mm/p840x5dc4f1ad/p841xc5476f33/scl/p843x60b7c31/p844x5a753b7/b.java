package com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p844x5a753b7;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/magicbrush/plugin/scl/jsapi/cover/b;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/magicbrush/plugin/scl/jsapi/cover/MBJsApiOperateCanvasFirstSnapshot$IPCData;", "Ljz5/f0;", "<init>", "()V", "mb-plugin-scl-impl_release"}, k = 1, mv = {1, 9, 0})
@mk0.a
/* loaded from: classes7.dex */
final class b implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar) {
        qq0.j jVar;
        java.lang.String str;
        iq0.e eVar;
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p844x5a753b7.C10862x9d0f83b6 c10862x9d0f83b6 = (com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p843x60b7c31.p844x5a753b7.C10862x9d0f83b6) obj;
        if (c10862x9d0f83b6 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBJsApiOperateCanvasFirstSnapshot", "null data");
            return;
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject(c10862x9d0f83b6.f150188e);
        java.lang.String optString = jSONObject.optString("frameSetId");
        java.lang.String str2 = c10862x9d0f83b6.f150187d;
        jz5.f0 f0Var = null;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "removeCoverView")) {
            gq0.r rVar2 = (gq0.r) i95.n0.c(gq0.r.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
            fq0.x Ai = ((fq0.z) rVar2).Ai(optString);
            if (Ai != null) {
                ym5.a1.f(new fq0.t(Ai));
                f0Var = jz5.f0.f384359a;
            }
            if (f0Var == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBJsApiOperateCanvasFirstSnapshot", "cannot find frameset for ".concat(optString));
                return;
            }
            return;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, "finishSnapshot")) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBJsApiOperateCanvasFirstSnapshot", "unknown action " + str2);
            return;
        }
        java.lang.String optString2 = jSONObject.optString("bizName");
        qq0.i iVar = (qq0.i) i95.n0.c(qq0.i.class);
        java.lang.String optString3 = jSONObject.optString("bizName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString3, "optString(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        java.lang.String wi6 = ((qq0.m) iVar).wi(optString3, optString);
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(com.p314xaae8f345.mm.vfs.z7.a(wi6));
        if (r6Var.m()) {
            r6Var.l();
            gk0.k kVar = new gk0.k(com.p314xaae8f345.mm.ui.bk.g(), com.p314xaae8f345.mm.ui.bk.f());
            kVar.f353970h = android.graphics.Bitmap.Config.ARGB_8888;
            java.lang.String Bi = ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Bi(new gk0.h(wi6), kVar);
            i95.m c17 = i95.n0.c(gk0.n0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            g75.z zVar = new g75.z();
            zVar.l("Common_ImageKey", Bi);
            zVar.l("Common_TempFolder", ((h83.g) ((gk0.n0) c17)).Vi());
            zVar.l("Common_ImageViewRef", new d75.c(null));
            zVar.l("Common_TargetPath", "");
            zVar.l("Common_BitmapOptions", kVar);
            jz5.g gVar = h83.g.f361086d;
            zVar.l("Common_ImageViewRefMap", (java.util.HashMap) ((jz5.n) h83.g.f361086d).mo141623x754a37bb());
            zVar.l("Common_ForceRefresh", java.lang.Boolean.TRUE);
            zVar.l("Common_StartTimestamp", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
            zVar.l("Common_TargetPath", wi6);
            gk0.j.b(((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Ri(), zVar, null, 2, null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBJsApiOperateCanvasFirstSnapshot", "force refresh local cover: ".concat(wi6));
        }
        java.lang.String str3 = c10862x9d0f83b6.f150190g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MBJsApiOperateCanvasFirstSnapshot", "rename ret: " + com.p314xaae8f345.mm.vfs.w6.x(str3, wi6, true) + ", src: " + str3 + ", dst: " + wi6);
        qq0.i iVar2 = (qq0.i) i95.n0.c(qq0.i.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
        qq0.m mVar = (qq0.m) iVar2;
        mVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicSclStartupCoverService", "finishCover instanceName:" + optString2 + " frameSetId:" + optString);
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = mVar.f447434f;
        if (concurrentHashMap == null || (jVar = (qq0.j) concurrentHashMap.get(optString2)) == null) {
            return;
        }
        hq0.b0 b0Var = (hq0.b0) jVar;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onStartUpCoverReady frameSetId:");
        sb6.append(optString);
        sb6.append(", preloadingMap.count:");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap2 = b0Var.F;
        sb6.append(concurrentHashMap2.size());
        java.lang.String sb7 = sb6.toString();
        java.lang.String str4 = b0Var.f364504y;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, sb7);
        jc3.j0 j0Var = b0Var.f364528g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(j0Var);
        java.lang.String str5 = vq0.b.c(((rc3.w0) j0Var).f475620e) + '-' + optString;
        mq0.e0 e0Var = (mq0.e0) i95.n0.c(mq0.e0.class);
        java.lang.String str6 = b0Var.f364503x.f375167a;
        hq0.j jVar2 = (hq0.j) concurrentHashMap2.get(str5);
        if (jVar2 == null || (eVar = jVar2.f364541a) == null || (str = eVar.f375190a) == null) {
            str = "";
        }
        ((mq0.v0) e0Var).wi("preloadCover", "endFromScl", optString, str6, str, vq0.a.b(optString), "");
        concurrentHashMap2.remove(str5);
        if (concurrentHashMap2.isEmpty() && b0Var.I && !b0Var.f364538t) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "preload cover all finish, auto destroy biz and biz not active");
            b0Var.mo123041x5cd39ffa();
        }
    }
}
