package com.p314xaae8f345.p3210x3857dc;

/* loaded from: classes13.dex */
public abstract class r1 {
    public static void a(java.lang.String str, java.lang.String str2) {
        try {
            if (com.p314xaae8f345.p3210x3857dc.t.f302126d != null) {
                by5.c4.f("FileReaderXWeb", "finishReadFile pre updater exist, cancel it");
                cy5.t tVar = ((cy5.p) com.p314xaae8f345.p3210x3857dc.t.f302126d).f306428c;
                if (tVar != null) {
                    tVar.o(4, -1);
                }
                com.p314xaae8f345.p3210x3857dc.t.f302126d = null;
            }
            java.util.Map map = com.p314xaae8f345.p3210x3857dc.t.f302123a;
            java.lang.String str3 = (java.lang.String) ((java.util.HashMap) map).get(str + str2);
            if (str3 == null) {
                return;
            }
            ((java.util.HashMap) map).remove(str + str2);
            cy5.h d17 = cy5.m.d(str3);
            if (d17 instanceof cy5.y) {
                by5.c4.f("FileReaderXWeb", "finishReadFile ".concat(str3));
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("file_path", str2);
                hashMap.put("token", str);
                ((cy5.y) d17).x(hashMap);
            } else {
                by5.c4.c("FileReaderXWeb", "finishReadFile unknown plugin: ".concat(str3));
            }
            com.p314xaae8f345.p3210x3857dc.t.d(str, str2);
        } catch (java.lang.Throwable th6) {
            by5.c4.d("FileReaderXWeb", "finishReadFile error", th6);
        }
    }

    public static com.p314xaae8f345.p3210x3857dc.p1 b(java.lang.String str, java.lang.String str2) {
        java.util.Map map = com.p314xaae8f345.p3210x3857dc.t.f302123a;
        com.p314xaae8f345.p3210x3857dc.p1 p1Var = null;
        if (str != null) {
            try {
            } catch (java.lang.Throwable th6) {
                by5.c4.d("FileReaderXWeb", "getViewStatus error", th6);
            }
            if (!str.isEmpty() && str2 != null && !str2.isEmpty()) {
                java.lang.String str3 = (java.lang.String) ((java.util.HashMap) com.p314xaae8f345.p3210x3857dc.t.f302123a).get(str.concat(str2));
                if (str3 == null) {
                    by5.c4.c("FileReaderXWeb", "getViewStatus error, not reading");
                } else {
                    cy5.h d17 = cy5.m.d(str3);
                    if (d17 instanceof cy5.y) {
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("token", str);
                        p1Var = ((cy5.y) d17).E(hashMap);
                    } else {
                        by5.c4.c("FileReaderXWeb", "getViewStatus error, unknown plugin: ".concat(str3));
                    }
                }
                return p1Var;
            }
        }
        by5.c4.c("FileReaderXWeb", "getViewStatus error, invalid param");
        return p1Var;
    }

    public static boolean c(java.lang.String str, boolean z17, boolean z18, int i17) {
        java.util.Map map = com.p314xaae8f345.p3210x3857dc.t.f302123a;
        if (z17 && com.p314xaae8f345.p3210x3857dc.g.a(str)) {
            by5.c4.f("FileReaderXWeb", "isPluginAvailable recent crashed");
            return false;
        }
        cy5.h g17 = com.p314xaae8f345.p3210x3857dc.n.g(str);
        if (!(g17 instanceof cy5.y)) {
            by5.c4.f("FileReaderXWeb", "isPluginAvailable unSupport format" + str);
            return false;
        }
        cy5.y yVar = (cy5.y) g17;
        int f17 = yVar.f(true);
        int C = yVar.C(i17);
        if (f17 <= 0 || f17 < C) {
            by5.c4.f("FileReaderXWeb", "isPluginAvailable no available version, depends on canExplicitInstall");
            if (com.p314xaae8f345.p3210x3857dc.n.a(yVar, z18, C) <= 0) {
                return false;
            }
        } else {
            by5.c4.f("FileReaderXWeb", "isPluginAvailable has available version");
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0105  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void d(java.lang.String r14, java.lang.String r15, java.lang.String r16, boolean r17, java.util.HashMap r18, com.p314xaae8f345.p3210x3857dc.q1 r19, android.app.Activity r20, android.view.ViewGroup r21, com.p314xaae8f345.p3210x3857dc.o1 r22, android.webkit.ValueCallback r23) {
        /*
            Method dump skipped, instructions count: 463
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3210x3857dc.r1.d(java.lang.String, java.lang.String, java.lang.String, boolean, java.util.HashMap, com.tencent.xweb.q1, android.app.Activity, android.view.ViewGroup, com.tencent.xweb.o1, android.webkit.ValueCallback):void");
    }

    public static boolean e(java.lang.String str, java.lang.String str2, int i17) {
        java.util.Map map = com.p314xaae8f345.p3210x3857dc.t.f302123a;
        boolean z17 = false;
        if (str != null) {
            try {
            } catch (java.lang.Throwable th6) {
                by5.c4.d("FileReaderXWeb", "requestThumbnail error", th6);
            }
            if (!str.isEmpty() && str2 != null && !str2.isEmpty() && i17 >= 0) {
                java.lang.String str3 = (java.lang.String) ((java.util.HashMap) com.p314xaae8f345.p3210x3857dc.t.f302123a).get(str.concat(str2));
                if (str3 == null) {
                    by5.c4.c("FileReaderXWeb", "requestThumbnail error, not reading");
                } else {
                    cy5.h d17 = cy5.m.d(str3);
                    if (d17 instanceof cy5.y) {
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("token", str);
                        hashMap.put("thumbnail_index", java.lang.Integer.valueOf(i17));
                        z17 = ((cy5.y) d17).I(hashMap);
                    } else {
                        by5.c4.c("FileReaderXWeb", "requestThumbnail error, unknown plugin: ".concat(str3));
                    }
                }
                return z17;
            }
        }
        by5.c4.c("FileReaderXWeb", "requestThumbnail error, invalid param");
        return z17;
    }

    public static boolean f(java.lang.String str, java.lang.String str2, int i17, float f17, int i18, int i19) {
        java.util.Map map = com.p314xaae8f345.p3210x3857dc.t.f302123a;
        boolean z17 = false;
        if (str != null) {
            try {
            } catch (java.lang.Throwable th6) {
                by5.c4.d("FileReaderXWeb", "setViewToStatus error", th6);
            }
            if (!str.isEmpty() && str2 != null && !str2.isEmpty()) {
                java.lang.String str3 = (java.lang.String) ((java.util.HashMap) com.p314xaae8f345.p3210x3857dc.t.f302123a).get(str.concat(str2));
                if (str3 == null) {
                    by5.c4.c("FileReaderXWeb", "setViewToStatus error, not reading");
                } else {
                    cy5.h d17 = cy5.m.d(str3);
                    if (d17 instanceof cy5.y) {
                        java.util.HashMap hashMap = new java.util.HashMap();
                        hashMap.put("token", str);
                        hashMap.put("set_index", java.lang.Integer.valueOf(i17));
                        hashMap.put("set_zoom", java.lang.Float.valueOf(f17));
                        hashMap.put("set_x", java.lang.Integer.valueOf(i18));
                        hashMap.put("set_y", java.lang.Integer.valueOf(i19));
                        z17 = ((cy5.y) d17).K(hashMap);
                    } else {
                        by5.c4.c("FileReaderXWeb", "setViewToStatus error, unknown plugin: ".concat(str3));
                    }
                }
                return z17;
            }
        }
        by5.c4.c("FileReaderXWeb", "setViewToStatus error, invalid param");
        return z17;
    }
}
