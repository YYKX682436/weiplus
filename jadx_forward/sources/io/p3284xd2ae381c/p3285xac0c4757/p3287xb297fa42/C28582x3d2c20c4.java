package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42;

/* renamed from: io.flutter.embedding.engine.FlutterEngineCache */
/* loaded from: classes11.dex */
public class C28582x3d2c20c4 {

    /* renamed from: instance */
    private static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28582x3d2c20c4 f70813x21169495;

    /* renamed from: cachedEngines */
    private final java.util.Map<java.lang.String, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e> f70814xfd77aef = new java.util.HashMap();

    /* renamed from: getInstance */
    public static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28582x3d2c20c4 m137465x9cf0d20b() {
        if (f70813x21169495 == null) {
            f70813x21169495 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28582x3d2c20c4();
        }
        return f70813x21169495;
    }

    /* renamed from: clear */
    public void m137466x5a5b64d() {
        this.f70814xfd77aef.clear();
    }

    /* renamed from: contains */
    public boolean m137467xde2d761f(java.lang.String str) {
        return this.f70814xfd77aef.containsKey(str);
    }

    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e get(java.lang.String str) {
        return this.f70814xfd77aef.get(str);
    }

    public void put(java.lang.String str, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28580x69eec95e c28580x69eec95e) {
        if (c28580x69eec95e != null) {
            this.f70814xfd77aef.put(str, c28580x69eec95e);
        } else {
            this.f70814xfd77aef.remove(str);
        }
    }

    /* renamed from: remove */
    public void m137468xc84af884(java.lang.String str) {
        put(str, null);
    }
}
