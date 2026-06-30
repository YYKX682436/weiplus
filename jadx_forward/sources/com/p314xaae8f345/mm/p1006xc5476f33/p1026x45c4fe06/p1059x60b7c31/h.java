package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31;

/* loaded from: classes7.dex */
public abstract class h {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f162797d;

    public h() {
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
    }

    public final java.lang.String k() {
        java.lang.reflect.Field field;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f162797d)) {
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
                    this.f162797d = (java.lang.String) new d56.b(field.getType(), field.get(cls)).f308165b;
                } catch (java.lang.Exception e18) {
                    throw new d56.c(e18);
                }
            } catch (java.lang.Exception e19) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.BaseJsApi", "getName exp = %s", com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.c(e19));
            }
        }
        return this.f162797d;
    }
}
