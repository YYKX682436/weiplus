package com.p314xaae8f345.p3210x3857dc;

/* loaded from: classes13.dex */
public abstract class t {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f302123a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Map f302124b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.Map f302125c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public static zx5.l0 f302126d = null;

    public static java.lang.Integer a(java.util.HashMap hashMap, java.lang.String str) {
        java.lang.Integer num = null;
        if (hashMap == null) {
            by5.c4.c("FileReaderXWeb", "getIntegerFromParams params is null");
        } else {
            try {
                java.lang.Object obj = hashMap.get(str);
                if (obj instanceof java.lang.Integer) {
                    num = (java.lang.Integer) obj;
                } else {
                    by5.c4.c("FileReaderXWeb", "getIntegerFromParams value is not integer, key: " + str);
                }
            } catch (java.lang.Throwable th6) {
                by5.c4.d("FileReaderXWeb", "getIntegerFromParams error", th6);
            }
        }
        return num;
    }

    public static android.view.MotionEvent b(java.util.HashMap hashMap, java.lang.String str) {
        android.view.MotionEvent motionEvent = null;
        if (hashMap == null) {
            by5.c4.c("FileReaderXWeb", "getMotionEventFromParams params is null");
        } else {
            try {
                java.lang.Object obj = hashMap.get(str);
                if (obj instanceof android.view.MotionEvent) {
                    motionEvent = (android.view.MotionEvent) obj;
                } else {
                    by5.c4.c("FileReaderXWeb", "getMotionEventFromParams value is not motion event, key: " + str);
                }
            } catch (java.lang.Throwable th6) {
                by5.c4.d("FileReaderXWeb", "getMotionEventFromParams error", th6);
            }
        }
        return motionEvent;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:39|(1:41)(1:150)|42|(3:117|118|(1:120)(10:121|f1|46|47|48|(1:53)|114|55|(1:57)|(2:111|112)(8:60|(1:62)|(1:(1:65)(2:66|(1:68)))|69|(3:74|75|(1:77)(4:78|233|72|73))|71|72|73)))|44|45|46|47|48|(2:50|53)|114|55|(0)|(0)|111|112) */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x01b4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x01b5, code lost:
    
        by5.c4.d("CommandCfgPlugin", "getMaxDownloadCountWhenPluginError error", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x01b1, code lost:
    
        if (r0 >= 0) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void c(int r17, int r18, cy5.y r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, boolean r23, com.p314xaae8f345.p3210x3857dc.j r24, java.util.HashMap r25, com.p314xaae8f345.p3210x3857dc.q1 r26, android.app.Activity r27, android.view.ViewGroup r28, com.p314xaae8f345.p3210x3857dc.o1 r29, android.webkit.ValueCallback r30) {
        /*
            Method dump skipped, instructions count: 810
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3210x3857dc.t.c(int, int, cy5.y, java.lang.String, java.lang.String, java.lang.String, boolean, com.tencent.xweb.j, java.util.HashMap, com.tencent.xweb.q1, android.app.Activity, android.view.ViewGroup, com.tencent.xweb.o1, android.webkit.ValueCallback):void");
    }

    public static void d(java.lang.String str, java.lang.String str2) {
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
            by5.c4.c("FileReaderXWeb", "cleanTempFile error, invalid params");
            return;
        }
        java.util.Map map = f302124b;
        java.lang.String str3 = (java.lang.String) ((java.util.HashMap) map).get(str.concat(str2));
        if (str3 != null) {
            ((java.util.HashMap) map).remove(str.concat(str2));
            ((java.util.HashMap) f302125c).remove(str.concat(str3));
            by5.c4.f("FileReaderXWeb", "cleanTempFile, is uri, delay delete ".concat(str3));
            if (str3.isEmpty()) {
                return;
            }
            yu5.b.f547447a.e(new com.p314xaae8f345.p3210x3857dc.s(str3), 3000L);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:1|(1:3)(1:167)|4|(1:6)(1:166)|7|(3:9|(6:12|(2:20|(4:22|23|(5:25|26|27|(1:32)|37)|41)(2:42|36))|34|35|36|10)|47)|48|49|50|(19:58|(6:60|(5:65|(6:70|71|72|73|75|76)|157|158|76)|159|157|158|76)|161|162|(3:80|(4:83|(3:97|98|99)|100|81)|106)|107|(1:109)(1:156)|110|111|112|(8:117|118|(1:120)|121|(2:125|(2:126|(1:138)(4:128|(2:132|(2:136|137))|130|131)))(0)|139|(1:141)(1:151)|(2:143|(2:145|146)(2:148|149))(1:150))|153|118|(0)|121|(2:125|(3:126|(0)(0)|131))(0)|139|(0)(0)|(0)(0))|163|(0)|107|(0)(0)|110|111|112|(9:114|117|118|(0)|121|(0)(0)|139|(0)(0)|(0)(0))|153|118|(0)|121|(0)(0)|139|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x026f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0270, code lost:
    
        by5.c4.d("CommandCfgPlugin", "isXFilesHideBottomBar error", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b1, code lost:
    
        if (r0 == false) goto L41;
     */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0263 A[Catch: all -> 0x026f, TryCatch #3 {all -> 0x026f, blocks: (B:112:0x0256, B:114:0x0263, B:117:0x026a), top: B:111:0x0256 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0289 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x031c A[EDGE_INSN: B:138:0x031c->B:139:0x031c BREAK  A[LOOP:3: B:126:0x02af->B:131:0x0319], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:150:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:151:0x035a  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x014a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void e(cy5.y r26, java.lang.String r27, java.lang.String r28, java.lang.String r29, boolean r30, com.p314xaae8f345.p3210x3857dc.j r31, java.util.HashMap r32, com.p314xaae8f345.p3210x3857dc.q1 r33, android.app.Activity r34, android.view.ViewGroup r35, com.p314xaae8f345.p3210x3857dc.o1 r36, android.webkit.ValueCallback r37) {
        /*
            Method dump skipped, instructions count: 1007
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3210x3857dc.t.e(cy5.y, java.lang.String, java.lang.String, java.lang.String, boolean, com.tencent.xweb.j, java.util.HashMap, com.tencent.xweb.q1, android.app.Activity, android.view.ViewGroup, com.tencent.xweb.o1, android.webkit.ValueCallback):void");
    }

    public static void f(java.lang.String str, int i17, android.webkit.ValueCallback valueCallback, int i18, android.content.Context context, com.p314xaae8f345.p3210x3857dc.j jVar) {
        com.p314xaae8f345.p3210x3857dc.n.r(str, i17, i18, context, jVar);
        if (valueCallback != null) {
            valueCallback.onReceiveValue(java.lang.Integer.valueOf(i18));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void g(cy5.y r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, boolean r27, com.p314xaae8f345.p3210x3857dc.j r28, java.util.HashMap r29, com.p314xaae8f345.p3210x3857dc.q1 r30, android.app.Activity r31, android.view.ViewGroup r32, com.p314xaae8f345.p3210x3857dc.o1 r33, android.webkit.ValueCallback r34) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.p3210x3857dc.t.g(cy5.y, java.lang.String, java.lang.String, java.lang.String, boolean, com.tencent.xweb.j, java.util.HashMap, com.tencent.xweb.q1, android.app.Activity, android.view.ViewGroup, com.tencent.xweb.o1, android.webkit.ValueCallback):void");
    }
}
