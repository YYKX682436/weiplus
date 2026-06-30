package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf;

/* loaded from: classes9.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.s f147534a = new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.s();

    public final java.lang.String a(java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.C10564x1d74f9a1(userName, 0), com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.q.class);
        java.lang.String str = c10756x2a5d7b2d != null ? c10756x2a5d7b2d.f149939d : null;
        return str == null ? "" : str;
    }

    public final void b(android.content.Context context, org.json.JSONObject jSONObject, org.json.JSONObject jSONObject2, java.util.List list, com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.t callback, boolean z17) {
        java.util.ArrayList arrayList;
        boolean z18;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        boolean z19 = true;
        if (list != null) {
            arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            z18 = false;
            while (it.hasNext()) {
                java.lang.String encryptUserName = (java.lang.String) it.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(encryptUserName, "encryptUserName");
                com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d c10756x2a5d7b2d = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d) com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.C10564x1d74f9a1(encryptUserName, 1), com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.q.class);
                java.lang.String str2 = c10756x2a5d7b2d != null ? c10756x2a5d7b2d.f149939d : null;
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
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3135xb0941fd.a.f297578b.c(com.p314xaae8f345.p3133xd0ce8b26.mm.p3168xb0941fd.n1.EcsShareUserNameDecryptFail, 2);
            ((t00.m2) callback).a("Failed to decrypt userName");
            return;
        }
        if (jSONObject == null) {
            ((t00.m2) callback).a("params is null");
            return;
        }
        int optInt = jSONObject.optInt("ecsSharMsgType");
        u20.a[] aVarArr = u20.a.f505388d;
        if (optInt == 1) {
            if (jSONObject2 == null) {
                ((t00.m2) callback).a("config is null");
                return;
            }
            u20.y yVar = new u20.y(jSONObject2, jSONObject, arrayList, callback);
            u20.q qVar = yVar.f505486d;
            if (qVar == null) {
                return;
            }
            ((java.util.ArrayList) yVar.f505488f).clear();
            w05.h hVar = qVar.f505466o;
            if (!(hVar != null && hVar.B())) {
                yVar.f(context);
                return;
            }
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ecs_bulkbuy_appmsg_signature_enable_android, 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsShareToContactLogicWAAPPMsg", "enableSign: " + Ni);
            if (!(Ni > 0)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsShareToContactLogicWAAPPMsg", "bulk buy sign is not enabled, skip get bulk buy share info");
                yVar.f(context);
                return;
            }
            bw5.we0 we0Var = new bw5.we0();
            java.lang.String str3 = qVar.f505461j;
            we0Var.f116208h = str3 != null ? str3 : "";
            boolean[] zArr = we0Var.f116209i;
            zArr[6] = true;
            w05.h hVar2 = qVar.f505466o;
            we0Var.f116204d = hVar2 != null ? hVar2.y() : null;
            zArr[2] = true;
            w05.h hVar3 = qVar.f505466o;
            we0Var.f116205e = hVar3 != null ? hVar3.j() : 0L;
            zArr[3] = true;
            w05.h hVar4 = qVar.f505466o;
            we0Var.f116206f = hVar4 != null ? hVar4.l() : 0L;
            zArr[4] = true;
            we0Var.f116207g = 1L;
            zArr[5] = true;
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = we0Var;
            lVar.f152198b = new bw5.xe0();
            lVar.f152199c = "/cgi-bin/mmbiz-bin/mmec_getbulkbuyshareinfo";
            lVar.f152200d = 21104;
            ((h80.i) ((com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x) i95.n0.c(com.p314xaae8f345.mm.p794xb0fa9b5e.p798xe185c061.x.class))).wi(lVar.a(), new u20.r(yVar, context));
            return;
        }
        if (optInt == 2) {
            if (jSONObject2 == null) {
                ((t00.m2) callback).a("config is null");
                return;
            }
            u20.m mVar = new u20.m(jSONObject2, jSONObject, arrayList, callback);
            if (mVar.f505441d == null) {
                return;
            }
            p3325xe03a0797.p3326xc267989b.l.d(mVar.f505392c, null, null, new u20.l(mVar, context, z17, null), 3, null);
            return;
        }
        if (optInt == 3) {
            u20.p pVar = new u20.p(jSONObject, arrayList, callback);
            if (pVar.f505451d == null) {
                return;
            }
            p3325xe03a0797.p3326xc267989b.l.d(pVar.f505392c, null, null, new u20.o(context, pVar, (arrayList == null || (str = (java.lang.String) kz5.n0.a0(arrayList, 0)) == null) ? "" : str, z17, null), 3, null);
            return;
        }
        if (optInt != 4) {
            ((t00.m2) callback).a("ecsSharMsgType is invalid");
            return;
        }
        u20.i iVar = new u20.i(jSONObject, jSONObject2, arrayList, callback);
        u20.d dVar = iVar.f505414d;
        if (dVar == null) {
            com.p314xaae8f345.mm.p689xc5a27af6.ecs.p739x6854fdf.t tVar = iVar.f505391b;
            if (tVar != null) {
                ((t00.m2) tVar).a("Failed to init model");
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("share, imageUrl: ");
        java.lang.String str4 = dVar.f505393a;
        sb6.append(str4);
        sb6.append(", inputPath: ");
        java.lang.String str5 = iVar.f505416f;
        sb6.append(str5);
        sb6.append(", outputPath: ");
        java.lang.String str6 = iVar.f505417g;
        sb6.append(str6);
        sb6.append(", compressType: ");
        sb6.append(dVar.f505394b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsShareToContactLogicImage", sb6.toString());
        ((java.util.ArrayList) iVar.f505415e).clear();
        if (str4 == null || str4.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("EcsShareToContactLogicImage", "share, both imageUrl and inputPath are empty");
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("EcsShareToContactLogicImage", "downloadAndProcessImage, outputPath is empty, cannot download");
            iVar.b("outputPath is not allocated");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsShareToContactLogicImage", "downloadAndProcessImage, downloading url: " + str4 + " to outputPath: " + str6);
        l01.d0.f396294a.p(str4, null, new u20.e(str4, iVar, context));
    }
}
