package com.tencent.mm.app.plugin;

/* loaded from: classes9.dex */
public class s implements com.tencent.mm.pluginsdk.ui.span.o {

    /* renamed from: n, reason: collision with root package name */
    public static com.tencent.mm.app.plugin.s f53677n;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.app.plugin.URISpanHandlerSet f53680f;

    /* renamed from: g, reason: collision with root package name */
    public android.content.Context f53681g;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.r2 f53678d = new com.tencent.mm.sdk.platformtools.r2(128);

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f53679e = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: h, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f53682h = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f53683i = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArrayList f53684m = new java.util.concurrent.CopyOnWriteArrayList();

    public s() {
        this.f53681g = null;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        java.lang.System.currentTimeMillis();
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        this.f53681g = context;
        this.f53680f = new com.tencent.mm.app.plugin.URISpanHandlerSet(context);
        for (java.lang.Class<?> cls : com.tencent.mm.app.plugin.URISpanHandlerSet.class.getDeclaredClasses()) {
            if (cls != null && cls.getSuperclass() != null && cls.isAnnotationPresent(com.tencent.mm.app.plugin.g0.class) && cls.getSuperclass().getName().equals(com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler.class.getName())) {
                try {
                    com.tencent.mm.app.plugin.g0 g0Var = (com.tencent.mm.app.plugin.g0) cls.getAnnotation(com.tencent.mm.app.plugin.g0.class);
                    java.lang.reflect.Constructor<?> declaredConstructor = cls.getDeclaredConstructor(com.tencent.mm.app.plugin.URISpanHandlerSet.class);
                    if (declaredConstructor != null) {
                        com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler baseUriSpanHandler = (com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler) com.tencent.mm.app.plugin.URISpanHandlerSet.BaseUriSpanHandler.class.cast(declaredConstructor.newInstance(this.f53680f));
                        com.tencent.mm.app.plugin.URISpanHandlerSet.PRIORITY priority = g0Var.priority();
                        if (priority == com.tencent.mm.app.plugin.URISpanHandlerSet.PRIORITY.LOW) {
                            this.f53684m.add(baseUriSpanHandler);
                        } else if (priority == com.tencent.mm.app.plugin.URISpanHandlerSet.PRIORITY.NORMAL) {
                            this.f53683i.add(baseUriSpanHandler);
                        } else if (priority == com.tencent.mm.app.plugin.URISpanHandlerSet.PRIORITY.HIGH) {
                            this.f53682h.add(baseUriSpanHandler);
                        }
                    }
                } catch (java.lang.Error e17) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.URISpanHandler", e17, "", new java.lang.Object[0]);
                    e17.getMessage();
                } catch (java.lang.Exception e18) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.URISpanHandler", e18, "", new java.lang.Object[0]);
                    e18.getMessage();
                }
            }
        }
        this.f53683i.add(new com.tencent.mm.app.plugin.PocketMoneyUriSpanHandler());
        java.lang.System.currentTimeMillis();
    }

    public static com.tencent.mm.app.plugin.s f() {
        if (f53677n == null) {
            f53677n = new com.tencent.mm.app.plugin.s();
        }
        return f53677n;
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
    public final void c(r45.nx5 r38, com.tencent.mm.app.plugin.URISpanHandlerSet.TopicSpanHandler r39, android.view.View r40, r35.m3 r41, com.tencent.mm.pluginsdk.ui.span.z r42) {
        /*
            Method dump skipped, instructions count: 1448
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.app.plugin.s.c(r45.nx5, com.tencent.mm.app.plugin.URISpanHandlerSet$TopicSpanHandler, android.view.View, r35.m3, com.tencent.mm.pluginsdk.ui.span.z):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean h(android.content.Context r25, android.view.View r26, r35.m3 r27, com.tencent.mm.pluginsdk.ui.span.z r28) {
        /*
            Method dump skipped, instructions count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.app.plugin.s.h(android.content.Context, android.view.View, r35.m3, com.tencent.mm.pluginsdk.ui.span.z):boolean");
    }
}
