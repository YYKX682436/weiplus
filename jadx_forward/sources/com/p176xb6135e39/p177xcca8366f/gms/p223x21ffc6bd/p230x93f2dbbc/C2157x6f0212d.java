package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzabn */
/* loaded from: classes13.dex */
final class C2157x6f0212d implements java.security.PrivilegedExceptionAction<sun.misc.Unsafe> {
    @Override // java.security.PrivilegedExceptionAction
    public final /* synthetic */ sun.misc.Unsafe run() {
        for (java.lang.reflect.Field field : sun.misc.Unsafe.class.getDeclaredFields()) {
            field.setAccessible(true);
            java.lang.Object obj = field.get(null);
            if (sun.misc.Unsafe.class.isInstance(obj)) {
                return (sun.misc.Unsafe) sun.misc.Unsafe.class.cast(obj);
            }
        }
        return null;
    }
}
