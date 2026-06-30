package com.tencent.cso;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u001d\u001e\u001fJl\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\r\u001a\u00020\tH\u0082 ¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0082 J!\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0082 J\u0011\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0082 J\t\u0010\u001b\u001a\u00020\u000eH\u0082 J\t\u0010\u001c\u001a\u00020\u0018H\u0082 ¨\u0006 "}, d2 = {"Lcom/tencent/cso/CsoLoader;", "", "", "applicationPackagePath", "basePath", "version", "cacheScope", "", "cacheScopeExcludePaths", "", "cleanable", "appLoadPaths", "systemLoadPaths", "extractNativeLibs", "Ljz5/f0;", "nativeInitialize", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Z[Ljava/lang/String;[Ljava/lang/String;Z)V", com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME, "skipLoad", "skipDependencies", "Lcom/tencent/cso/CsoLoader$ExecuteResult;", "executeByName", com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "executeByPath", "", "nativePointer", "setLogEngineInternal", "preloadAllInternal", "approximateNeededSizeInternal", "sc/b", "ExecuteResult", "sc/c", "cso-loader_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class CsoLoader {

    /* renamed from: b, reason: collision with root package name */
    public static volatile boolean f45935b;

    /* renamed from: d, reason: collision with root package name */
    public static volatile yz5.a f45937d;

    /* renamed from: e, reason: collision with root package name */
    public static volatile yz5.a f45938e;

    /* renamed from: f, reason: collision with root package name */
    public static volatile yz5.a f45939f;

    /* renamed from: g, reason: collision with root package name */
    public static volatile yz5.p f45940g;

    /* renamed from: h, reason: collision with root package name */
    public static volatile yz5.q f45941h;

    /* renamed from: i, reason: collision with root package name */
    public static volatile yz5.p f45942i;

    /* renamed from: j, reason: collision with root package name */
    public static volatile yz5.q f45943j;

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.cso.CsoLoader f45934a = new com.tencent.cso.CsoLoader();

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.Object f45936c = new java.lang.Object();

    @kotlin.Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/cso/CsoLoader$ExecuteResult;", "", "cso-loader_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes11.dex */
    public static final /* data */ class ExecuteResult {

        /* renamed from: a, reason: collision with root package name */
        public final sc.b f45944a;

        /* renamed from: b, reason: collision with root package name */
        public final java.lang.String f45945b;

        public ExecuteResult(sc.b level, java.lang.String path) {
            kotlin.jvm.internal.o.g(level, "level");
            kotlin.jvm.internal.o.g(path, "path");
            this.f45944a = level;
            this.f45945b = path;
        }

        public static final com.tencent.cso.CsoLoader.ExecuteResult builder(int i17, java.lang.String path) {
            sc.b bVar;
            kotlin.jvm.internal.o.g(path, "path");
            if (i17 == 0) {
                bVar = sc.b.f405605d;
            } else if (i17 == 1) {
                bVar = sc.b.f405606e;
            } else if (i17 == 16) {
                bVar = sc.b.f405607f;
            } else if (i17 == 17) {
                bVar = sc.b.f405608g;
            } else {
                if (i17 != 32) {
                    throw new java.lang.IllegalArgumentException("Unknown level code: " + i17);
                }
                bVar = sc.b.f405609h;
            }
            return new com.tencent.cso.CsoLoader.ExecuteResult(bVar, path);
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.tencent.cso.CsoLoader.ExecuteResult)) {
                return false;
            }
            com.tencent.cso.CsoLoader.ExecuteResult executeResult = (com.tencent.cso.CsoLoader.ExecuteResult) obj;
            return this.f45944a == executeResult.f45944a && kotlin.jvm.internal.o.b(this.f45945b, executeResult.f45945b);
        }

        public int hashCode() {
            return (this.f45944a.hashCode() * 31) + this.f45945b.hashCode();
        }

        public java.lang.String toString() {
            return "ExecuteResult(level=" + this.f45944a + ", path=" + this.f45945b + ")";
        }
    }

    static {
        int i17 = com.tencent.cso.b.f45947a;
        sc.g gVar = sc.g.f405625d;
        f45940g = gVar;
        com.tencent.cso.a aVar = com.tencent.cso.a.f45946d;
        f45941h = aVar;
        f45942i = gVar;
        f45943j = aVar;
    }

    private final native long approximateNeededSizeInternal();

    public static final void e(java.lang.String name) {
        kotlin.jvm.internal.o.g(name, "name");
        yz5.p pVar = f45940g;
        sc.c cVar = sc.c.f405611d;
        if (((java.lang.Boolean) pVar.invoke(cVar, name)).booleanValue()) {
            com.tencent.cso.CsoLoader csoLoader = f45934a;
            csoLoader.c();
            java.lang.String mapLibraryName = java.lang.System.mapLibraryName(name);
            kotlin.jvm.internal.o.f(mapLibraryName, "mapLibraryName(...)");
            com.tencent.cso.CsoLoader.ExecuteResult executeByName = csoLoader.executeByName(mapLibraryName, false, false);
            ((com.tencent.cso.a) f45941h).invoke(cVar, name, executeByName);
            java.lang.String str = executeByName.f45945b;
        }
    }

    private final native com.tencent.cso.CsoLoader.ExecuteResult executeByName(java.lang.String name, boolean skipLoad, boolean skipDependencies);

    private final native com.tencent.cso.CsoLoader.ExecuteResult executeByPath(java.lang.String path, boolean skipLoad, boolean skipDependencies);

    public static final void f(java.lang.Runtime runtime, java.lang.String path) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        kotlin.jvm.internal.o.g(path, "path");
        h(path);
    }

    public static final void g(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        h(path);
    }

    public static final java.lang.String h(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        yz5.p pVar = f45942i;
        sc.c cVar = sc.c.f405611d;
        if (!((java.lang.Boolean) pVar.invoke(cVar, path)).booleanValue()) {
            return "<skipped>";
        }
        com.tencent.cso.CsoLoader csoLoader = f45934a;
        csoLoader.c();
        com.tencent.cso.CsoLoader.ExecuteResult executeByPath = csoLoader.executeByPath(path, false, false);
        ((com.tencent.cso.a) f45943j).invoke(cVar, path, executeByPath);
        return executeByPath.f45945b;
    }

    public static final java.lang.String i(java.lang.String path) {
        kotlin.jvm.internal.o.g(path, "path");
        yz5.p pVar = f45942i;
        sc.c cVar = sc.c.f405612e;
        if (!((java.lang.Boolean) pVar.invoke(cVar, path)).booleanValue()) {
            return "<skipped>";
        }
        com.tencent.cso.CsoLoader csoLoader = f45934a;
        csoLoader.c();
        com.tencent.cso.CsoLoader.ExecuteResult executeByPath = csoLoader.executeByPath(path, true, false);
        ((com.tencent.cso.a) f45943j).invoke(cVar, path, executeByPath);
        return executeByPath.f45945b;
    }

    private final native void nativeInitialize(java.lang.String applicationPackagePath, java.lang.String basePath, java.lang.String version, java.lang.String cacheScope, java.lang.String[] cacheScopeExcludePaths, boolean cleanable, java.lang.String[] appLoadPaths, java.lang.String[] systemLoadPaths, boolean extractNativeLibs);

    /* JADX INFO: Access modifiers changed from: private */
    public final native void preloadAllInternal();

    /* JADX INFO: Access modifiers changed from: private */
    public final native void setLogEngineInternal(long j17);

    public final void c() {
        if (f45935b) {
            return;
        }
        synchronized (f45936c) {
            if (f45935b) {
                return;
            }
            yz5.a aVar = f45937d;
            if (aVar == null) {
                throw new sc.a("Missing initialization before executing, please invoke CsoLoader.initialize first");
            }
            aVar.invoke();
        }
    }

    public final void d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String[] strArr, boolean z17, java.lang.String[] strArr2, java.lang.String[] strArr3, boolean z18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add("cso");
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/tencent/cso/CsoLoader", "initialize", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Z[Ljava/lang/String;[Ljava/lang/String;Z)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        java.lang.System.loadLibrary((java.lang.String) arrayList.get(0));
        yj0.a.f(obj, "com/tencent/cso/CsoLoader", "initialize", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Z[Ljava/lang/String;[Ljava/lang/String;Z)V", "java/lang/System_EXEC_", "loadLibrary", "(Ljava/lang/String;)V");
        yz5.a aVar = f45938e;
        if (aVar != null) {
            aVar.invoke();
        }
        nativeInitialize(str, str2, str3, str4, strArr, z17, strArr2, strArr3, z18);
        f45935b = true;
        yz5.a aVar2 = f45939f;
        if (aVar2 != null) {
            aVar2.invoke();
        }
    }
}
