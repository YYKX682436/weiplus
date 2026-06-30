package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public class hm {

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f131311b = "hm";

    /* renamed from: c, reason: collision with root package name */
    private static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hm f131312c;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map<com.tencent.mapsdk.internal.hm.b, com.tencent.mapsdk.internal.hm.a> f131313a = new java.util.concurrent.ConcurrentHashMap();

    /* loaded from: classes13.dex */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public java.lang.String f131314a;

        /* renamed from: b, reason: collision with root package name */
        public com.tencent.mapsdk.internal.hm.b f131315b;

        /* renamed from: c, reason: collision with root package name */
        public java.lang.String f131316c;

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f131317d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f131318e;

        /* renamed from: f, reason: collision with root package name */
        public com.tencent.mapsdk.internal.hm.c f131319f = com.tencent.mapsdk.internal.hm.c.IDLE;

        public a(com.tencent.mapsdk.internal.hm.b bVar, java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.f131315b = bVar;
            this.f131316c = str;
            this.f131318e = str2;
            this.f131317d = str3;
        }

        /* renamed from: toString */
        public final java.lang.String m36772x9616526c() {
            return "DynamicLibrary{md5='" + this.f131314a + "', libName=" + this.f131315b + ", path='" + this.f131316c + "', abi='" + this.f131317d + "', version='" + this.f131318e + "', status=" + this.f131319f + '}';
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

    public static com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hm a() {
        if (f131312c == null) {
            f131312c = new com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.hm();
        }
        return f131312c;
    }

    private com.tencent.mapsdk.internal.hm.a b(com.tencent.mapsdk.internal.hm.b bVar) {
        return this.f131313a.get(bVar);
    }

    public final void a(com.tencent.mapsdk.internal.hm.b bVar, java.lang.String path, java.lang.String str, java.lang.String str2) {
        com.tencent.mapsdk.internal.hm.a aVar = new com.tencent.mapsdk.internal.hm.a(bVar, path, str, str2);
        this.f131313a.put(bVar, aVar);
        java.io.File file = new java.io.File(path);
        if (!android.text.TextUtils.isEmpty(path) && file.exists() && file.canRead()) {
            aVar.f131319f = com.tencent.mapsdk.internal.hm.c.TRY_LOAD;
            try {
                aVar.f131314a = com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lh.a(file);
                com.p314xaae8f345.cso.C2941xefde02d2 c2941xefde02d2 = com.p314xaae8f345.cso.C2941xefde02d2.f127467a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
                com.p314xaae8f345.cso.C2941xefde02d2.h(path);
                java.util.Objects.toString(bVar);
                aVar.m36772x9616526c();
                aVar.f131319f = com.tencent.mapsdk.internal.hm.c.SUCCESS;
                return;
            } catch (java.lang.Throwable th6) {
                aVar.f131319f = com.tencent.mapsdk.internal.hm.c.ERROR;
                throw new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2987x584fd04f.C25974x28d98c08("预加载[" + bVar + "] 路径为 " + path + "，加载失败！Lib: " + aVar, th6);
            }
        }
        aVar.f131319f = com.tencent.mapsdk.internal.hm.c.NOT_FOUND;
        throw new com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2987x584fd04f.C25974x28d98c08("预加载[" + bVar + "] 路径不合法：" + path);
    }

    private boolean a(com.tencent.mapsdk.internal.hm.b bVar) {
        com.tencent.mapsdk.internal.hm.a aVar = this.f131313a.get(bVar);
        return aVar != null && aVar.f131319f == com.tencent.mapsdk.internal.hm.c.SUCCESS;
    }
}
