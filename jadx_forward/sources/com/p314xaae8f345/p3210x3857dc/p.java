package com.p314xaae8f345.p3210x3857dc;

/* loaded from: classes13.dex */
public class p implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3210x3857dc.o1 f301903a;

    public p(com.p314xaae8f345.p3210x3857dc.o1 o1Var) {
        this.f301903a = o1Var;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        java.lang.Object obj2;
        android.util.Pair pair = (android.util.Pair) obj;
        if (pair != null && (obj2 = pair.first) != null) {
            java.lang.Object obj3 = pair.second;
            if (obj3 instanceof java.util.HashMap) {
                try {
                    java.util.HashMap hashMap = (java.util.HashMap) obj3;
                    java.lang.String str = null;
                    r3 = null;
                    r3 = null;
                    java.lang.Float f17 = null;
                    r3 = null;
                    r3 = null;
                    android.graphics.Bitmap bitmap = null;
                    str = null;
                    str = null;
                    if ("ac_onViewStatusChange".equals(obj2)) {
                        java.lang.Integer a17 = com.p314xaae8f345.p3210x3857dc.t.a(hashMap, "ac_viewIndex");
                        if (a17 == null) {
                            by5.c4.c("FileReaderXWeb", "actionCallback " + ((java.lang.String) pair.first) + ", viewIndex is null");
                            return;
                        }
                        if (hashMap == null) {
                            by5.c4.c("FileReaderXWeb", "getFloatFromParams params is null");
                        } else {
                            try {
                                java.lang.Object obj4 = hashMap.get("ac_viewZoom");
                                if (obj4 instanceof java.lang.Float) {
                                    f17 = (java.lang.Float) obj4;
                                } else {
                                    by5.c4.c("FileReaderXWeb", "getFloatFromParams value is not float, key: ac_viewZoom");
                                }
                            } catch (java.lang.Throwable th6) {
                                by5.c4.d("FileReaderXWeb", "getFloatFromParams error", th6);
                            }
                        }
                        if (f17 == null) {
                            by5.c4.c("FileReaderXWeb", "actionCallback " + ((java.lang.String) pair.first) + ", viewZoom is null");
                            return;
                        }
                        java.lang.Integer a18 = com.p314xaae8f345.p3210x3857dc.t.a(hashMap, "ac_curWidth");
                        if (a18 == null) {
                            by5.c4.c("FileReaderXWeb", "actionCallback " + ((java.lang.String) pair.first) + ", viewCurWidth is null");
                            return;
                        }
                        java.lang.Integer a19 = com.p314xaae8f345.p3210x3857dc.t.a(hashMap, "ac_curHeight");
                        if (a19 == null) {
                            by5.c4.c("FileReaderXWeb", "actionCallback " + ((java.lang.String) pair.first) + ", viewCurHeight is null");
                            return;
                        }
                        java.lang.Integer a27 = com.p314xaae8f345.p3210x3857dc.t.a(hashMap, "ac_viewTransX");
                        if (a27 == null) {
                            by5.c4.c("FileReaderXWeb", "actionCallback " + ((java.lang.String) pair.first) + ", viewTransX is null");
                            return;
                        }
                        java.lang.Integer a28 = com.p314xaae8f345.p3210x3857dc.t.a(hashMap, "ac_viewTransY");
                        if (a28 != null) {
                            this.f301903a.g(a17.intValue(), f17.floatValue(), a18.intValue(), a19.intValue(), a27.intValue(), a28.intValue());
                            return;
                        }
                        by5.c4.c("FileReaderXWeb", "actionCallback " + ((java.lang.String) pair.first) + ", viewTransY is null");
                        return;
                    }
                    boolean equals = "ac_onPageCountUpdate".equals(pair.first);
                    com.p314xaae8f345.p3210x3857dc.o1 o1Var = this.f301903a;
                    if (equals) {
                        java.lang.Integer a29 = com.p314xaae8f345.p3210x3857dc.t.a(hashMap, "ac_totalCount");
                        if (a29 != null) {
                            o1Var.e(a29.intValue());
                            return;
                        }
                        by5.c4.c("FileReaderXWeb", "actionCallback " + ((java.lang.String) pair.first) + ", totalCount is null");
                        return;
                    }
                    if ("ac_onPageChange".equals(pair.first)) {
                        java.lang.Integer a37 = com.p314xaae8f345.p3210x3857dc.t.a(hashMap, "ac_pageIndex");
                        if (a37 == null) {
                            by5.c4.c("FileReaderXWeb", "actionCallback " + ((java.lang.String) pair.first) + ", pageIndex is null");
                            return;
                        }
                        java.lang.Integer a38 = com.p314xaae8f345.p3210x3857dc.t.a(hashMap, "ac_pageWidth");
                        if (a38 == null) {
                            by5.c4.c("FileReaderXWeb", "actionCallback " + ((java.lang.String) pair.first) + ", pageWidth is null");
                            return;
                        }
                        java.lang.Integer a39 = com.p314xaae8f345.p3210x3857dc.t.a(hashMap, "ac_pageHeight");
                        if (a39 != null) {
                            o1Var.f(a37.intValue(), a38.intValue(), a39.intValue());
                            return;
                        }
                        by5.c4.c("FileReaderXWeb", "actionCallback " + ((java.lang.String) pair.first) + ", pageHeight is null");
                        return;
                    }
                    if ("ac_onThumbnailLoad".equals(pair.first)) {
                        java.lang.Integer a47 = com.p314xaae8f345.p3210x3857dc.t.a(hashMap, "ac_pageIndex");
                        if (hashMap == null) {
                            by5.c4.c("FileReaderXWeb", "getBitmapFromParams params is null");
                        } else {
                            try {
                                java.lang.Object obj5 = hashMap.get("ac_thumbnail");
                                if (obj5 instanceof android.graphics.Bitmap) {
                                    bitmap = (android.graphics.Bitmap) obj5;
                                } else {
                                    by5.c4.c("FileReaderXWeb", "getBitmapFromParams value is not bitmap, key: ac_thumbnail");
                                }
                            } catch (java.lang.Throwable th7) {
                                by5.c4.d("FileReaderXWeb", "getBitmapFromParams error", th7);
                            }
                        }
                        if (a47 != null && bitmap != null) {
                            o1Var.d(a47.intValue(), bitmap);
                            return;
                        }
                        by5.c4.c("FileReaderXWeb", "actionCallback " + ((java.lang.String) pair.first) + ", pageIndex/thumbnail is null");
                        return;
                    }
                    if ("ac_onSingleTap".equals(pair.first)) {
                        android.view.MotionEvent b17 = com.p314xaae8f345.p3210x3857dc.t.b(hashMap, "ac_motionEvent");
                        if (b17 != null) {
                            o1Var.h(b17);
                            return;
                        }
                        by5.c4.c("FileReaderXWeb", "actionCallback " + ((java.lang.String) pair.first) + ", motion event is null");
                        return;
                    }
                    if ("ac_onDoubleTap".equals(pair.first)) {
                        android.view.MotionEvent b18 = com.p314xaae8f345.p3210x3857dc.t.b(hashMap, "ac_motionEvent");
                        if (b18 != null) {
                            o1Var.mo56908xce1d2af3(b18);
                            return;
                        }
                        by5.c4.c("FileReaderXWeb", "actionCallback " + ((java.lang.String) pair.first) + ", motion event is null");
                        return;
                    }
                    if (!"ac_onGeneralCallback".equals(pair.first)) {
                        if ("ac_onReachEnd".equals(pair.first)) {
                            o1Var.i();
                            return;
                        }
                        if ("ac_onUserOperated".equals(pair.first)) {
                            o1Var.c();
                            return;
                        } else {
                            if ("ac_onUserCancel".equals(pair.first)) {
                                o1Var.a();
                                return;
                            }
                            by5.c4.c("FileReaderXWeb", "actionCallback unknown value: " + ((java.lang.String) pair.first));
                            return;
                        }
                    }
                    if (hashMap == null) {
                        by5.c4.c("FileReaderXWeb", "getStringFromParams params is null");
                    } else {
                        try {
                            java.lang.Object obj6 = hashMap.get("ac_generalCallbackName");
                            if (obj6 instanceof java.lang.String) {
                                str = (java.lang.String) obj6;
                            } else {
                                by5.c4.c("FileReaderXWeb", "getStringFromParams value is not string, key: ac_generalCallbackName");
                            }
                        } catch (java.lang.Throwable th8) {
                            by5.c4.d("FileReaderXWeb", "getStringFromParams error", th8);
                        }
                    }
                    if (str != null) {
                        o1Var.b(str, hashMap);
                        return;
                    }
                    by5.c4.c("FileReaderXWeb", "actionCallback " + ((java.lang.String) pair.first) + ", general callback name is null");
                    return;
                } catch (java.lang.Throwable unused) {
                    by5.c4.c("FileReaderXWeb", "actionCallback onReceiveValue error, hashMap invalid");
                    return;
                }
            }
        }
        by5.c4.c("FileReaderXWeb", "actionCallback onReceiveValue error, value invalid");
    }
}
