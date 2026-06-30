package com.tencent.mm.app;

/* loaded from: classes12.dex */
public abstract class s4 {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean[] f53767a = {false};

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.Thread.UncaughtExceptionHandler[] f53768b = {null};

    /* renamed from: c, reason: collision with root package name */
    public static final android.os.ParcelFileDescriptor[] f53769c = {null};

    /* renamed from: d, reason: collision with root package name */
    public static final android.os.ParcelFileDescriptor[] f53770d = {null};

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.Thread.UncaughtExceptionHandler f53771e = new com.tencent.mm.app.q4();

    public static void a() {
        fp.d0.o("wechatcrash");
        android.os.ParcelFileDescriptor[] parcelFileDescriptorArr = f53770d;
        synchronized (parcelFileDescriptorArr) {
            android.os.ParcelFileDescriptor parcelFileDescriptor = parcelFileDescriptorArr[0];
            android.os.ParcelFileDescriptor parcelFileDescriptor2 = rp.c.f398327b;
            if (parcelFileDescriptor2 != null && parcelFileDescriptor2 != parcelFileDescriptor) {
                throw new java.lang.IllegalArgumentException("Try to change dumpTo fd after first calling instance().");
            }
            rp.c.f398327b = parcelFileDescriptor;
            rp.b.f398326a.f398328a = new com.tencent.mm.app.r4();
        }
    }

    public static void b(android.content.Context context, android.os.ParcelFileDescriptor parcelFileDescriptor, android.os.ParcelFileDescriptor parcelFileDescriptor2) {
        boolean[] zArr = f53767a;
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
        android.os.ParcelFileDescriptor[] parcelFileDescriptorArr = f53769c;
        synchronized (parcelFileDescriptorArr) {
            parcelFileDescriptorArr[0] = parcelFileDescriptor;
        }
        android.os.ParcelFileDescriptor[] parcelFileDescriptorArr2 = f53770d;
        synchronized (parcelFileDescriptorArr2) {
            parcelFileDescriptorArr2[0] = parcelFileDescriptor2;
        }
        java.lang.Thread.UncaughtExceptionHandler[] uncaughtExceptionHandlerArr = f53768b;
        if (uncaughtExceptionHandlerArr[0] == null) {
            synchronized (uncaughtExceptionHandlerArr) {
                if (uncaughtExceptionHandlerArr[0] == null) {
                    uncaughtExceptionHandlerArr[0] = java.lang.Thread.getDefaultUncaughtExceptionHandler();
                    java.lang.Thread.setDefaultUncaughtExceptionHandler(f53771e);
                }
            }
        }
        a();
        com.tencent.mm.app.t4.f(context, parcelFileDescriptor);
    }
}
