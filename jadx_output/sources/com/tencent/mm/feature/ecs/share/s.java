package com.tencent.mm.feature.ecs.share;

/* loaded from: classes9.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.feature.ecs.share.s f66001a = new com.tencent.mm.feature.ecs.share.s();

    public final java.lang.String a(java.lang.String userName) {
        kotlin.jvm.internal.o.g(userName, "userName");
        com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.feature.ecs.share.EcsShareMgr$TaskParams(userName, 0), com.tencent.mm.feature.ecs.share.q.class);
        java.lang.String str = iPCString != null ? iPCString.f68406d : null;
        return str == null ? "" : str;
    }

    public final void b(android.content.Context context, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.util.List list, com.tencent.mm.feature.ecs.share.t callback, boolean z17) {
        java.util.ArrayList arrayList;
        boolean z18;
        java.lang.String str;
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(callback, "callback");
        boolean z19 = true;
        if (list != null) {
            arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            z18 = false;
            while (it.hasNext()) {
                java.lang.String encryptUserName = (java.lang.String) it.next();
                kotlin.jvm.internal.o.g(encryptUserName, "encryptUserName");
                com.tencent.mm.ipcinvoker.type.IPCString iPCString = (com.tencent.mm.ipcinvoker.type.IPCString) com.tencent.mm.ipcinvoker.extension.l.b(com.tencent.mm.sdk.platformtools.w9.f193053a, new com.tencent.mm.feature.ecs.share.EcsShareMgr$TaskParams(encryptUserName, 1), com.tencent.mm.feature.ecs.share.q.class);
                java.lang.String str2 = iPCString != null ? iPCString.f68406d : null;
                if (str2 == null || str2.length() == 0) {
                    z18 = true;
                }
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
        } else {
            arrayList = null;
            z18 = false;
        }
        if (z18) {
            com.tencent.wechat.aff.brand_service.a.f216045b.c(com.tencent.wechat.mm.brand_service.n1.EcsShareUserNameDecryptFail, 2);
            ((t00.m2) callback).a("Failed to decrypt userName");
            return;
        }
        if (jSONObject == null) {
            ((t00.m2) callback).a("params is null");
            return;
        }
        int optInt = jSONObject.optInt("ecsSharMsgType");
        u20.a[] aVarArr = u20.a.f423855d;
        if (optInt == 1) {
            if (jSONObject2 == null) {
                ((t00.m2) callback).a("config is null");
                return;
            }
            u20.y yVar = new u20.y(jSONObject2, jSONObject, arrayList, callback);
            u20.q qVar = yVar.f423953d;
            if (qVar == null) {
                return;
            }
            ((java.util.ArrayList) yVar.f423955f).clear();
            w05.h hVar = qVar.f423933o;
            if (!(hVar != null && hVar.B())) {
                yVar.f(context);
                return;
            }
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ecs_bulkbuy_appmsg_signature_enable_android, 0);
            com.tencent.mars.xlog.Log.i("EcsShareToContactLogicWAAPPMsg", "enableSign: " + Ni);
            if (!(Ni > 0)) {
                com.tencent.mars.xlog.Log.i("EcsShareToContactLogicWAAPPMsg", "bulk buy sign is not enabled, skip get bulk buy share info");
                yVar.f(context);
                return;
            }
            bw5.we0 we0Var = new bw5.we0();
            java.lang.String str3 = qVar.f423928j;
            we0Var.f34675h = str3 != null ? str3 : "";
            boolean[] zArr = we0Var.f34676i;
            zArr[6] = true;
            w05.h hVar2 = qVar.f423933o;
            we0Var.f34671d = hVar2 != null ? hVar2.y() : null;
            zArr[2] = true;
            w05.h hVar3 = qVar.f423933o;
            we0Var.f34672e = hVar3 != null ? hVar3.j() : 0L;
            zArr[3] = true;
            w05.h hVar4 = qVar.f423933o;
            we0Var.f34673f = hVar4 != null ? hVar4.l() : 0L;
            zArr[4] = true;
            we0Var.f34674g = 1L;
            zArr[5] = true;
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = we0Var;
            lVar.f70665b = new bw5.xe0();
            lVar.f70666c = "/cgi-bin/mmbiz-bin/mmec_getbulkbuyshareinfo";
            lVar.f70667d = 21104;
            ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(lVar.a(), new u20.r(yVar, context));
            return;
        }
        if (optInt == 2) {
            if (jSONObject2 == null) {
                ((t00.m2) callback).a("config is null");
                return;
            }
            u20.m mVar = new u20.m(jSONObject2, jSONObject, arrayList, callback);
            if (mVar.f423908d == null) {
                return;
            }
            kotlinx.coroutines.l.d(mVar.f423859c, null, null, new u20.l(mVar, context, z17, null), 3, null);
            return;
        }
        if (optInt == 3) {
            u20.p pVar = new u20.p(jSONObject, arrayList, callback);
            if (pVar.f423918d == null) {
                return;
            }
            kotlinx.coroutines.l.d(pVar.f423859c, null, null, new u20.o(context, pVar, (arrayList == null || (str = (java.lang.String) kz5.n0.a0(arrayList, 0)) == null) ? "" : str, z17, null), 3, null);
            return;
        }
        if (optInt != 4) {
            ((t00.m2) callback).a("ecsSharMsgType is invalid");
            return;
        }
        u20.i iVar = new u20.i(jSONObject, jSONObject2, arrayList, callback);
        u20.d dVar = iVar.f423881d;
        if (dVar == null) {
            com.tencent.mm.feature.ecs.share.t tVar = iVar.f423858b;
            if (tVar != null) {
                ((t00.m2) tVar).a("Failed to init model");
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("share, imageUrl: ");
        java.lang.String str4 = dVar.f423860a;
        sb6.append(str4);
        sb6.append(", inputPath: ");
        java.lang.String str5 = iVar.f423883f;
        sb6.append(str5);
        sb6.append(", outputPath: ");
        java.lang.String str6 = iVar.f423884g;
        sb6.append(str6);
        sb6.append(", compressType: ");
        sb6.append(dVar.f423861b);
        com.tencent.mars.xlog.Log.i("EcsShareToContactLogicImage", sb6.toString());
        ((java.util.ArrayList) iVar.f423882e).clear();
        if (str4 == null || str4.length() == 0) {
            com.tencent.mars.xlog.Log.w("EcsShareToContactLogicImage", "share, both imageUrl and inputPath are empty");
            iVar.b("Failed to get image path");
            return;
        }
        if (!r26.i0.A(str4, "http://", false, 2, null) && !r26.i0.y(str4, "https://", false)) {
            iVar.e(context, str5);
            return;
        }
        if (str6 != null && str6.length() != 0) {
            z19 = false;
        }
        if (z19) {
            com.tencent.mars.xlog.Log.w("EcsShareToContactLogicImage", "downloadAndProcessImage, outputPath is empty, cannot download");
            iVar.b("outputPath is not allocated");
            return;
        }
        com.tencent.mars.xlog.Log.i("EcsShareToContactLogicImage", "downloadAndProcessImage, downloading url: " + str4 + " to outputPath: " + str6);
        l01.d0.f314761a.p(str4, null, new u20.e(str4, iVar, context));
    }
}
