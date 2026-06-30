package com.google.android.gms.dynamic;

/* loaded from: classes13.dex */
public final class ObjectWrapper<T> extends com.google.android.gms.dynamic.IObjectWrapper.Stub {
    private final java.lang.Object zza;

    private ObjectWrapper(java.lang.Object obj) {
        this.zza = obj;
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public static <T> T unwrap(com.google.android.gms.dynamic.IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper instanceof com.google.android.gms.dynamic.ObjectWrapper) {
            return (T) ((com.google.android.gms.dynamic.ObjectWrapper) iObjectWrapper).zza;
        }
        android.os.IBinder asBinder = iObjectWrapper.asBinder();
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
        com.google.android.gms.common.internal.Preconditions.checkNotNull(field);
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

    public static <T> com.google.android.gms.dynamic.IObjectWrapper wrap(T t17) {
        return new com.google.android.gms.dynamic.ObjectWrapper(t17);
    }
}
