package com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f;

/* renamed from: com.google.android.gms.dynamic.ObjectWrapper */
/* loaded from: classes13.dex */
public final class BinderC2031xbeed5434<T> extends com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2029x272bd28b.Stub {
    private final java.lang.Object zza;

    private BinderC2031xbeed5434(java.lang.Object obj) {
        this.zza = obj;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    /* renamed from: unwrap */
    public static <T> T m18683xcdecea63(com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2029x272bd28b interfaceC2029x272bd28b) {
        if (interfaceC2029x272bd28b instanceof com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2031xbeed5434) {
            return (T) ((com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2031xbeed5434) interfaceC2029x272bd28b).zza;
        }
        android.os.IBinder asBinder = interfaceC2029x272bd28b.asBinder();
        java.lang.reflect.Field[] declaredFields = asBinder.getClass().getDeclaredFields();
        java.lang.reflect.Field field = null;
        int i17 = 0;
        for (java.lang.reflect.Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i17++;
                field = field2;
            }
        }
        if (i17 != 1) {
            throw new java.lang.IllegalArgumentException("Unexpected number of IObjectWrapper declared fields: " + declaredFields.length);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(field);
        if (field.isAccessible()) {
            throw new java.lang.IllegalArgumentException("IObjectWrapper declared field not private!");
        }
        field.setAccessible(true);
        try {
            return (T) field.get(asBinder);
        } catch (java.lang.IllegalAccessException e17) {
            throw new java.lang.IllegalArgumentException("Could not access the field in remoteBinder.", e17);
        } catch (java.lang.NullPointerException e18) {
            throw new java.lang.IllegalArgumentException("Binder object is null.", e18);
        }
    }

    /* renamed from: wrap */
    public static <T> com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.InterfaceC2029x272bd28b m18684x37d04a(T t17) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p221x7ea5603f.BinderC2031xbeed5434(t17);
    }
}
