package com.tencent.mm.plugin.appbrand.jsapi;

/* loaded from: classes7.dex */
public abstract class h {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f81264d;

    public h() {
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
    }

    public final java.lang.String k() {
        java.lang.reflect.Field field;
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.f81264d)) {
            try {
                java.lang.Class<?> cls = getClass();
                try {
                    try {
                        field = (java.lang.reflect.Field) d56.b.a(cls.getField("NAME"));
                    } catch (java.lang.NoSuchFieldException e17) {
                        java.lang.Class<?> cls2 = cls;
                        do {
                            try {
                                field = (java.lang.reflect.Field) d56.b.a(cls2.getDeclaredField("NAME"));
                            } catch (java.lang.NoSuchFieldException unused) {
                                cls2 = cls2.getSuperclass();
                            }
                        } while (cls2 != null);
                        throw new d56.c(e17);
                    }
                    this.f81264d = (java.lang.String) new d56.b(field.getType(), field.get(cls)).f226632b;
                } catch (java.lang.Exception e18) {
                    throw new d56.c(e18);
                }
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.BaseJsApi", "getName exp = %s", com.tencent.mm.sdk.platformtools.z3.c(e19));
            }
        }
        return this.f81264d;
    }
}
