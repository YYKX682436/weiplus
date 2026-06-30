package com.tencent.mm.matrix;

/* loaded from: classes5.dex */
public final class g0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.matrix.g0 f68712d = new com.tencent.mm.matrix.g0();

    public g0() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        try {
            java.lang.reflect.Field declaredField = java.lang.Class.forName("android.common.OplusFeatureCache").getDeclaredField("mFeatureCache");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(null);
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            return (java.lang.Object[]) obj;
        } catch (java.lang.ClassNotFoundException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OppoLeakFixer", e17, "", new java.lang.Object[0]);
            return new java.lang.Object[0];
        } catch (java.lang.NoSuchFieldException e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.OppoLeakFixer", e18, "", new java.lang.Object[0]);
            return new java.lang.Object[0];
        }
    }
}
