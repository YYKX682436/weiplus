package com.tencent.mapsdk.internal;

/* loaded from: classes13.dex */
public class hm {

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f49778b = "hm";

    /* renamed from: c, reason: collision with root package name */
    private static com.tencent.mapsdk.internal.hm f49779c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map<com.tencent.mapsdk.internal.hm.b, com.tencent.mapsdk.internal.hm.a> f49780a = new java.util.concurrent.ConcurrentHashMap();

    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.String f49781a;

        /* renamed from: b, reason: collision with root package name */
        public com.tencent.mapsdk.internal.hm.b f49782b;

        /* renamed from: c, reason: collision with root package name */
        public java.lang.String f49783c;

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f49784d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f49785e;

        /* renamed from: f, reason: collision with root package name */
        public com.tencent.mapsdk.internal.hm.c f49786f = com.tencent.mapsdk.internal.hm.c.IDLE;

        public a(com.tencent.mapsdk.internal.hm.b bVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.f49782b = bVar;
            this.f49783c = str;
            this.f49785e = str2;
            this.f49784d = str3;
        }

        public final java.lang.String toString() {
            return "DynamicLibrary{md5='" + this.f49781a + "', libName=" + this.f49782b + ", path='" + this.f49783c + "', abi='" + this.f49784d + "', version='" + this.f49785e + "', status=" + this.f49786f + '}';
        }
    }

    /* loaded from: classes6.dex */
    public enum b {
        MAP_ENGINE,
        MAP_VIS
    }

    /* loaded from: classes6.dex */
    public enum c {
        IDLE,
        TRY_LOAD,
        SUCCESS,
        NOT_FOUND,
        ERROR
    }

    private hm() {
    }

    public static com.tencent.mapsdk.internal.hm a() {
        if (f49779c == null) {
            f49779c = new com.tencent.mapsdk.internal.hm();
        }
        return f49779c;
    }

    private com.tencent.mapsdk.internal.hm.a b(com.tencent.mapsdk.internal.hm.b bVar) {
        return this.f49780a.get(bVar);
    }

    public final void a(com.tencent.mapsdk.internal.hm.b bVar, java.lang.String path, java.lang.String str, java.lang.String str2) {
        com.tencent.mapsdk.internal.hm.a aVar = new com.tencent.mapsdk.internal.hm.a(bVar, path, str, str2);
        this.f49780a.put(bVar, aVar);
        java.io.File file = new java.io.File(path);
        if (!android.text.TextUtils.isEmpty(path) && file.exists() && file.canRead()) {
            aVar.f49786f = com.tencent.mapsdk.internal.hm.c.TRY_LOAD;
            try {
                aVar.f49781a = com.tencent.mapsdk.internal.lh.a(file);
                com.tencent.cso.CsoLoader csoLoader = com.tencent.cso.CsoLoader.f45934a;
                kotlin.jvm.internal.o.g(path, "path");
                com.tencent.cso.CsoLoader.h(path);
                java.util.Objects.toString(bVar);
                aVar.toString();
                aVar.f49786f = com.tencent.mapsdk.internal.hm.c.SUCCESS;
                return;
            } catch (java.lang.Throwable th6) {
                aVar.f49786f = com.tencent.mapsdk.internal.hm.c.ERROR;
                throw new com.tencent.tencentmap.mapsdk.maps.exception.InvalidLibraryExceptions("预加载[" + bVar + "] 路径为 " + path + "，加载失败！Lib: " + aVar, th6);
            }
        }
        aVar.f49786f = com.tencent.mapsdk.internal.hm.c.NOT_FOUND;
        throw new com.tencent.tencentmap.mapsdk.maps.exception.InvalidLibraryExceptions("预加载[" + bVar + "] 路径不合法：" + path);
    }

    private boolean a(com.tencent.mapsdk.internal.hm.b bVar) {
        com.tencent.mapsdk.internal.hm.a aVar = this.f49780a.get(bVar);
        return aVar != null && aVar.f49786f == com.tencent.mapsdk.internal.hm.c.SUCCESS;
    }
}
