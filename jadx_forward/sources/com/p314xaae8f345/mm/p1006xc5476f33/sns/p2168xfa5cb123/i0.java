package com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123;

/* loaded from: classes4.dex */
public final class i0 {
    public i0(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public final void a(java.lang.String userName, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addContactTypeList", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        g().put(userName, java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addContactTypeList", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
    }

    public final void b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addFinderFeedId", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        if (str == null || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "")) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addFinderFeedId", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            return;
        }
        dx1.f fVar = dx1.g.f326022a;
        java.lang.Object d17 = fVar.d("SnsPublishProcess", "source_");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d17, 5L) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d17, 14L) || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(d17, 15L)) {
            fVar.i("SnsPublishProcess", "finderFeedid", str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addFinderFeedId", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
    }

    public final void c(int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addTraceFromUIAction", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        int i18 = i17 != 14 ? i17 != 17 ? -1 : 8 : 7;
        if (i18 != -1 && i18 == 8) {
            dx1.f fVar = dx1.g.f326022a;
            java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
            bx1.u uVar = bx1.u.f117844f;
            fVar.j("SnsPublishProcess", "actionTrace_", valueOf, uVar);
            fVar.j("SnsPublishProcess", "actionTrace_", 5, uVar);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addTraceFromUIAction", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
    }

    public final void d(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doReport", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        if (str != null) {
            i(str, com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.c0.f246375d);
        }
        dx1.f fVar = dx1.g.f326022a;
        if (((dx1.c) dx1.g.f326023b.get("SnsPublishProcess")) == null) {
            java.lang.String d17 = p3321xbce91901.jvm.p3324x21ffc6bd.i0.a(com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6904x501fa7cd.class).d();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(d17);
            fVar.g("SnsPublishProcess", d17);
            java.lang.String l17 = ca4.z0.l();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
            fVar.i("SnsPublishProcess", "sessionid_", l17);
            nu3.i.f421751a.n("moment_sessionid_", l17);
        }
        java.util.Iterator it = g().entrySet().iterator();
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) ((java.util.Map.Entry) it.next()).getValue()).intValue();
            if (intValue == 1) {
                i17++;
            } else if (intValue == 2) {
                i18++;
            } else if (intValue == 3) {
                i19++;
            }
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("singlechat", i17);
        jSONObject.put("groupchat", i18);
        jSONObject.put("contact", i19);
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        java.lang.String u17 = r26.i0.u(jSONObject2, ',', ';', false, 4, null);
        dx1.f fVar2 = dx1.g.f326022a;
        fVar2.i("SnsPublishProcess", "withFriendInfo", u17);
        dx1.f.b(fVar2, "SnsPublishProcess", false, false, 6, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doReport", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
    }

    public final void e(java.util.ArrayList imageList) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("firstIntoEditPage", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(imageList, "imageList");
        dx1.f fVar = dx1.g.f326022a;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getCaptureCount", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        int i17 = 0;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(imageList)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCaptureCount", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        } else {
            java.util.Iterator it = imageList.iterator();
            while (it.hasNext()) {
                if (com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.j0.f246394a.j((java.lang.String) it.next())) {
                    i17++;
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getCaptureCount", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        }
        fVar.i("SnsPublishProcess", "firstEditPageShotMedia", java.lang.Integer.valueOf(i17));
        dx1.g.f326022a.i("SnsPublishProcess", "firstEditPageMedia", java.lang.Integer.valueOf(imageList.size()));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("firstIntoEditPage", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
    }

    public final void f(android.app.Activity activity) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("fromPage", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        dx1.g.f326022a.i("SnsPublishProcess", "fromPage", java.lang.Integer.valueOf(activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2186x72ce5378.ActivityC18203x35bf69b5 ? 1 : activity instanceof com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.ActivityC18141xfedff17 ? 2 : 0));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("fromPage", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
    }

    public final java.util.HashMap g() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getContactTypeList", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getContactTypeList$cp", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport");
        java.util.HashMap hashMap = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.j0.f246396c;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getContactTypeList$cp", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getContactTypeList", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        return hashMap;
    }

    public final java.lang.String h() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMusicInfo", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getMusicInfoString", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$getMusicInfoString$cp", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport");
        java.lang.String str = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.j0.f246397d;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$getMusicInfoString$cp", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMusicInfoString", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        if (str.length() == 0) {
            str = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getMusicInfo", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        return str;
    }

    public final void i(java.lang.String id6, yz5.l callback) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getSecData", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Bi(16, id6, wa4.q.class, new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.d0(id6, callback));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getSecData", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
    }

    public final boolean j(java.lang.String path) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isCameraPic", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        boolean B = r26.n0.B(path, "photoEdited_", false);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isCameraPic", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        return B;
    }

    public final void k(java.lang.String userName) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeContactTypeList", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        g().remove(userName);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeContactTypeList", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
    }

    public final void l(org.json.JSONObject list) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setContactTypeListJSON", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        g().clear();
        java.util.Iterator<java.lang.String> keys = list.keys();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keys, "keys(...)");
        while (keys.hasNext()) {
            java.lang.String next = keys.next();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.j0.f246394a.g().put(next, java.lang.Integer.valueOf(list.getInt(next)));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setContactTypeListJSON", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
    }

    public final void m(java.util.List paths) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMediaSource", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paths, "paths");
        dx1.g.f326022a.q("SnsPublishProcess", "mediaMD5_", new com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.g0(paths));
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMediaSource", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
    }

    public final void n(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMusicInfo", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "str");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMusicInfoString", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$setMusicInfoString$cp", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.j0.f246397d = str;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$setMusicInfoString$cp", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMusicInfoString", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMusicInfo", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
    }

    public final void o(int i17, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29, boolean z37, boolean z38, boolean z39, boolean z47, boolean z48, boolean z49) {
        long j17;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSource", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        if (z38) {
            j17 = 12;
        } else if (z37) {
            j17 = 9;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isDraft", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$isDraft$cp", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport");
            boolean z57 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2168xfa5cb123.j0.f246395b;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$isDraft$cp", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isDraft", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
            if (z57) {
                j17 = 4;
            } else {
                j17 = 7;
                if (!z29) {
                    if (z19) {
                        j17 = 6;
                    } else if (z17) {
                        j17 = 1;
                    } else if (z18) {
                        j17 = 2;
                    } else if (i17 == 9 || i17 == 8) {
                        j17 = 3;
                    } else if (z49) {
                        j17 = 16;
                    } else if (i17 != 14 || z27) {
                        j17 = 5;
                        if (!z28) {
                            if (z39) {
                                j17 = 13;
                            } else if (z47) {
                                j17 = 14;
                            } else if (z48) {
                                j17 = 15;
                            }
                        }
                    }
                }
            }
        }
        dx1.f fVar = dx1.g.f326022a;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(fVar.d("SnsPublishProcess", "source_"), 10L)) {
            fVar.i("SnsPublishProcess", "source_", java.lang.Long.valueOf(j17));
        }
        if (!z19) {
            g().clear();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSource", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
    }

    public final void p(wa4.q obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateWithSave", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj, "obj");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("update", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReportKt");
        ((q04.r) ((xs.j1) i95.n0.c(xs.j1.class))).Vi(16, obj.f525808d, obj, null);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("update", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReportKt");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateWithSave", "com.tencent.mm.plugin.sns.statistics.SnsPublishProcessReport$Companion");
    }
}
