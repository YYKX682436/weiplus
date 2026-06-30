package sf3;

/* loaded from: classes12.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f488920a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f488921b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f488922c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f488923d;

    /* renamed from: e, reason: collision with root package name */
    public sf3.m f488924e;

    /* renamed from: f, reason: collision with root package name */
    public sf3.h f488925f;

    public g(java.util.Map pathMap, java.lang.String mediaId, java.lang.String previewPath, java.lang.String detectPath, sf3.m detectType, sf3.h loadStrategy, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        pathMap = (i17 & 1) != 0 ? kz5.q0.f395534d : pathMap;
        previewPath = (i17 & 4) != 0 ? "" : previewPath;
        detectPath = (i17 & 8) != 0 ? "" : detectPath;
        detectType = (i17 & 16) != 0 ? sf3.m.f488935d : detectType;
        loadStrategy = (i17 & 32) != 0 ? new sf3.b() : loadStrategy;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pathMap, "pathMap");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mediaId, "mediaId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(previewPath, "previewPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detectPath, "detectPath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(detectType, "detectType");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(loadStrategy, "loadStrategy");
        this.f488920a = pathMap;
        this.f488921b = mediaId;
        this.f488922c = previewPath;
        this.f488923d = detectPath;
        this.f488924e = detectType;
        this.f488925f = loadStrategy;
    }

    public final sf3.g a(sf3.m type) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(type, "type");
        sf3.g gVar = new sf3.g(this.f488920a, this.f488921b, this.f488922c, this.f488923d, null, this.f488925f, 16, null);
        java.lang.String str = (java.lang.String) gVar.f488920a.get(type);
        if (str == null) {
            str = "";
        }
        gVar.f488923d = str;
        gVar.f488924e = type;
        return gVar;
    }

    public final sf3.g b(sf3.m... args) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(args, "args");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        for (sf3.m mVar : args) {
            java.lang.String str = (java.lang.String) this.f488920a.get(mVar);
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && com.p314xaae8f345.mm.vfs.w6.j(str)) {
                return a(mVar);
            }
            sb6.append(mVar);
            sb6.append(":");
            sb6.append(str);
            sb6.append(",");
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ImageLoadParam", "detect error: " + ((java.lang.Object) sb6));
        return a(sf3.m.f488935d);
    }

    public final java.lang.String c() {
        if (this.f488924e == sf3.m.f488935d) {
            java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        }
        return this.f488923d;
    }
}
