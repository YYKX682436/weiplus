package com.p314xaae8f345.mm.app;

/* loaded from: classes12.dex */
public abstract class s4 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f135300a = {false};

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Thread.UncaughtExceptionHandler[] f135301b = {null};

    /* renamed from: c, reason: collision with root package name */
    public static final android.os.ParcelFileDescriptor[] f135302c = {null};

    /* renamed from: d, reason: collision with root package name */
    public static final android.os.ParcelFileDescriptor[] f135303d = {null};

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Thread.UncaughtExceptionHandler f135304e = new com.p314xaae8f345.mm.app.q4();

    public static void a() {
        fp.d0.o("wechatcrash");
        android.os.ParcelFileDescriptor[] parcelFileDescriptorArr = f135303d;
        synchronized (parcelFileDescriptorArr) {
            android.os.ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArr[0];
            android.os.ParcelFileDescriptor parcelFileDescriptor2 = rp.c.f479860b;
            if (parcelFileDescriptor2 != null && parcelFileDescriptor2 != parcelFileDescriptor) {
                throw new java.lang.IllegalArgumentException("Try to change dumpTo fd after first calling instance().");
            }
            rp.c.f479860b = parcelFileDescriptor;
            rp.b.f479859a.f479861a = new com.p314xaae8f345.mm.app.r4();
        }
    }

    public static void b(android.content.Context context, android.os.ParcelFileDescriptor parcelFileDescriptor, android.os.ParcelFileDescriptor parcelFileDescriptor2) {
        boolean[] zArr = f135300a;
        boolean z17 = true;
        if (!zArr[0]) {
            synchronized (zArr) {
                if (!zArr[0]) {
                    zArr[0] = true;
                    z17 = false;
                }
            }
        }
        if (z17) {
            return;
        }
        android.os.ParcelFileDescriptor[] parcelFileDescriptorArr = f135302c;
        synchronized (parcelFileDescriptorArr) {
            parcelFileDescriptorArr[0] = parcelFileDescriptor;
        }
        android.os.ParcelFileDescriptor[] parcelFileDescriptorArr2 = f135303d;
        synchronized (parcelFileDescriptorArr2) {
            parcelFileDescriptorArr2[0] = parcelFileDescriptor2;
        }
        java.lang.Thread.UncaughtExceptionHandler[] uncaughtExceptionHandlerArr = f135301b;
        if (uncaughtExceptionHandlerArr[0] == null) {
            synchronized (uncaughtExceptionHandlerArr) {
                if (uncaughtExceptionHandlerArr[0] == null) {
                    uncaughtExceptionHandlerArr[0] = java.lang.Thread.getDefaultUncaughtExceptionHandler();
                    java.lang.Thread.setDefaultUncaughtExceptionHandler(f135304e);
                }
            }
        }
        a();
        com.p314xaae8f345.mm.app.t4.f(context, parcelFileDescriptor);
    }
}
