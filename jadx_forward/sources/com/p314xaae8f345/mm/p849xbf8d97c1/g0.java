package com.p314xaae8f345.mm.p849xbf8d97c1;

/* loaded from: classes5.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p849xbf8d97c1.g0 f150245d = new com.p314xaae8f345.mm.p849xbf8d97c1.g0();

    public g0() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        try {
            java.lang.reflect.Field declaredField = java.lang.Class.forName("android.common.OplusFeatureCache").getDeclaredField("mFeatureCache");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            return (java.lang.Object[]) obj;
        } catch (java.lang.ClassNotFoundException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OppoLeakFixer", e17, "", new java.lang.Object[0]);
            return new java.lang.Object[0];
        } catch (java.lang.NoSuchFieldException e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.OppoLeakFixer", e18, "", new java.lang.Object[0]);
            return new java.lang.Object[0];
        }
    }
}
