package ou3;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final ou3.j f430491a = new ou3.j();

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f430492b = com.p314xaae8f345.mm.vfs.q7.c("PublicResource") + "/professional/filter";

    public final void a(android.content.res.AssetManager assetManager, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfessionalRecordMaasFilterResManager", "copyAssets assetsPath:" + str + " localPath:" + str2);
        try {
            java.lang.String[] list = assetManager.list(str);
            if (list == null) {
                return;
            }
            if (!(list.length == 0)) {
                com.p314xaae8f345.mm.vfs.w6.u(str2);
                for (java.lang.String str3 : list) {
                    f430491a.a(assetManager, str + '/' + str3, str2 + '/' + str3);
                }
                return;
            }
            java.io.InputStream open = assetManager.open(str);
            try {
                java.io.OutputStream K = com.p314xaae8f345.mm.vfs.w6.K(str2, false);
                try {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(open);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(K);
                    vz5.a.b(open, K, 0, 2, null);
                    vz5.b.a(K, null);
                    vz5.b.a(open, null);
                } finally {
                }
            } finally {
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.ProfessionalRecordMaasFilterResManager", e17, "copyAssets", new java.lang.Object[0]);
        }
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.C16996x6c653a3a b(ou3.h type) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.C16996x6c653a3a c16996x6c653a3a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        int i17 = type.f430489d;
        ou3.h hVar = ou3.h.f430477e;
        if (i17 == 0) {
            return new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.C16996x6c653a3a(vt3.m.f521544e, i17, "", "", 0, 0.0f, 32, null);
        }
        ou3.h hVar2 = ou3.h.f430477e;
        java.lang.String str = f430492b;
        if (i17 == 1) {
            java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.htt);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            c16996x6c653a3a = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.C16996x6c653a3a(null, i17, string, str + "/ziran/live_filter_zr.astc", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2u), 0.0f, 33, null);
        } else {
            ou3.h hVar3 = ou3.h.f430477e;
            if (i17 == 2) {
                java.lang.String string2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.htk);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
                c16996x6c653a3a = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.C16996x6c653a3a(null, i17, string2, str + "/baixi/live_filter_bx.astc", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2l), 0.0f, 33, null);
            } else {
                ou3.h hVar4 = ou3.h.f430477e;
                if (i17 == 3) {
                    java.lang.String string3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hts);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
                    c16996x6c653a3a = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.C16996x6c653a3a(null, i17, string3, str + "/yuanqi/live_filter_yq.astc", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2t), 0.0f, 33, null);
                } else {
                    ou3.h hVar5 = ou3.h.f430477e;
                    if (i17 == 4) {
                        java.lang.String string4 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.htm);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string4, "getString(...)");
                        c16996x6c653a3a = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.C16996x6c653a3a(null, i17, string4, str + "/fennen/live_filter_fn.astc", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2n), 0.0f, 33, null);
                    } else {
                        ou3.h hVar6 = ou3.h.f430477e;
                        if (i17 == 5) {
                            java.lang.String string5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.htp);
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string5, "getString(...)");
                            c16996x6c653a3a = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.C16996x6c653a3a(null, i17, string5, str + "/qingche/live_filter_qc.astc", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2q), 0.0f, 33, null);
                        } else {
                            ou3.h hVar7 = ou3.h.f430477e;
                            if (i17 == 6) {
                                java.lang.String string6 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.htn);
                                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string6, "getString(...)");
                                c16996x6c653a3a = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.C16996x6c653a3a(null, i17, string6, str + "/luori/live_filter_lr.astc", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2o), 0.0f, 33, null);
                            } else {
                                ou3.h hVar8 = ou3.h.f430477e;
                                if (i17 == 7) {
                                    java.lang.String string7 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.htr);
                                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string7, "getString(...)");
                                    c16996x6c653a3a = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.C16996x6c653a3a(null, i17, string7, str + "/shensui/live_filter_ss.astc", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2s), 0.0f, 33, null);
                                } else {
                                    ou3.h hVar9 = ou3.h.f430477e;
                                    if (i17 == 8) {
                                        java.lang.String string8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.htq);
                                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string8, "getString(...)");
                                        c16996x6c653a3a = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.C16996x6c653a3a(null, i17, string8, str + "/qiuri/qiuri.astc", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2r), 0.0f, 33, null);
                                    } else {
                                        ou3.h hVar10 = ou3.h.f430477e;
                                        if (i17 == 9) {
                                            java.lang.String string9 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.hto);
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string9, "getString(...)");
                                            c16996x6c653a3a = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.C16996x6c653a3a(null, i17, string9, str + "/meishi/meishi.astc", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2p), 0.0f, 33, null);
                                        } else {
                                            java.lang.String string10 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.htl);
                                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string10, "getString(...)");
                                            c16996x6c653a3a = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.C16996x6c653a3a(null, i17, string10, str + "/fanchaleng/fanchaleng.astc", com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a2m), 0.0f, 33, null);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return c16996x6c653a3a;
    }
}
