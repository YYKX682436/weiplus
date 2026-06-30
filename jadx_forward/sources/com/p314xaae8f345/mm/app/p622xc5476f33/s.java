package com.p314xaae8f345.mm.app.p622xc5476f33;

/* loaded from: classes9.dex */
public class s implements com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.o {

    /* renamed from: n, reason: collision with root package name */
    public static com.p314xaae8f345.mm.app.p622xc5476f33.s f135210n;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e f135213f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Context f135214g;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 f135211d = new com.p314xaae8f345.mm.sdk.p2603x2137b148.r2(128);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f135212e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f135215h = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f135216i = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f135217m = new java.util.concurrent.CopyOnWriteArrayList();

    public s() {
        this.f135214g = null;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        java.lang.System.currentTimeMillis();
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        this.f135214g = context;
        this.f135213f = new com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e(context);
        for (java.lang.Class<?> cls : com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.class.getDeclaredClasses()) {
            if (cls != null && cls.getSuperclass() != null && cls.isAnnotationPresent(com.p314xaae8f345.mm.app.p622xc5476f33.g0.class) && cls.getSuperclass().getName().equals(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler.class.getName())) {
                try {
                    com.p314xaae8f345.mm.app.p622xc5476f33.g0 g0Var = (com.p314xaae8f345.mm.app.p622xc5476f33.g0) cls.getAnnotation(com.p314xaae8f345.mm.app.p622xc5476f33.g0.class);
                    java.lang.reflect.Constructor<?> declaredConstructor = cls.getDeclaredConstructor(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.class);
                    if (declaredConstructor != null) {
                        com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler baseUriSpanHandler = (com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler) com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.BaseUriSpanHandler.class.cast(declaredConstructor.newInstance(this.f135213f));
                        com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.PRIORITY m43050xba8879a4 = g0Var.m43050xba8879a4();
                        if (m43050xba8879a4 == com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.PRIORITY.LOW) {
                            this.f135217m.add(baseUriSpanHandler);
                        } else if (m43050xba8879a4 == com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.PRIORITY.NORMAL) {
                            this.f135216i.add(baseUriSpanHandler);
                        } else if (m43050xba8879a4 == com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.PRIORITY.HIGH) {
                            this.f135215h.add(baseUriSpanHandler);
                        }
                    }
                } catch (java.lang.Error e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.URISpanHandler", e17, "", new java.lang.Object[0]);
                    e17.getMessage();
                } catch (java.lang.Exception e18) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.URISpanHandler", e18, "", new java.lang.Object[0]);
                    e18.getMessage();
                }
            }
        }
        this.f135216i.add(new com.p314xaae8f345.mm.app.p622xc5476f33.C5081x849a42de());
        java.lang.System.currentTimeMillis();
    }

    public static com.p314xaae8f345.mm.app.p622xc5476f33.s f() {
        if (f135210n == null) {
            f135210n = new com.p314xaae8f345.mm.app.p622xc5476f33.s();
        }
        return f135210n;
    }

    public final boolean b(int[] iArr, int i17) {
        for (int i18 : iArr) {
            if (i18 == i17) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0518  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0514  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(r45.nx5 r38, com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.TopicSpanHandler r39, android.view.View r40, r35.m3 r41, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z r42) {
        /*
            Method dump skipped, instructions count: 1448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.app.p622xc5476f33.s.c(r45.nx5, com.tencent.mm.app.plugin.URISpanHandlerSet$TopicSpanHandler, android.view.View, r35.m3, com.tencent.mm.pluginsdk.ui.span.z):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean h(android.content.Context r25, android.view.View r26, r35.m3 r27, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.z r28) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.app.p622xc5476f33.s.h(android.content.Context, android.view.View, r35.m3, com.tencent.mm.pluginsdk.ui.span.z):boolean");
    }
}
