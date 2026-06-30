package io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42;

/* renamed from: io.flutter.embedding.engine.FlutterEngineGroupCache */
/* loaded from: classes11.dex */
public class C28585x56710841 {

    /* renamed from: instance */
    private static volatile io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28585x56710841 f70857x21169495;

    /* renamed from: cachedEngineGroups */
    private final java.util.Map<java.lang.String, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1> f70858xc10078f8 = new java.util.HashMap();

    /* renamed from: getInstance */
    public static io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28585x56710841 m137552x9cf0d20b() {
        if (f70857x21169495 == null) {
            synchronized (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28585x56710841.class) {
                if (f70857x21169495 == null) {
                    f70857x21169495 = new io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28585x56710841();
                }
            }
        }
        return f70857x21169495;
    }

    /* renamed from: clear */
    public void m137553x5a5b64d() {
        this.f70858xc10078f8.clear();
    }

    /* renamed from: contains */
    public boolean m137554xde2d761f(java.lang.String str) {
        return this.f70858xc10078f8.containsKey(str);
    }

    public io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1 get(java.lang.String str) {
        return this.f70858xc10078f8.get(str);
    }

    public void put(java.lang.String str, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.C28584x3d6c67c1 c28584x3d6c67c1) {
        if (c28584x3d6c67c1 != null) {
            this.f70858xc10078f8.put(str, c28584x3d6c67c1);
        } else {
            this.f70858xc10078f8.remove(str);
        }
    }

    /* renamed from: remove */
    public void m137555xc84af884(java.lang.String str) {
        put(str, null);
    }
}
