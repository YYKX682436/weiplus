package com.google.android.gms.common.images;

/* loaded from: classes13.dex */
final class zaa implements java.lang.Runnable {
    private byte _hellAccFlag_;
    final /* synthetic */ com.google.android.gms.common.images.ImageManager zaa;
    private final android.net.Uri zab;
    private final android.os.ParcelFileDescriptor zac;

    public zaa(com.google.android.gms.common.images.ImageManager imageManager, android.net.Uri uri, android.os.ParcelFileDescriptor parcelFileDescriptor) {
        this.zaa = imageManager;
        this.zab = uri;
        this.zac = parcelFileDescriptor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Handler handler;
        com.google.android.gms.common.internal.Asserts.checkNotMainThread("LoadBitmapFromDiskRunnable can't be executed in the main thread");
        android.os.ParcelFileDescriptor parcelFileDescriptor = this.zac;
        android.graphics.Bitmap bitmap = null;
        boolean z17 = false;
        if (parcelFileDescriptor != null) {
            try {
                java.io.FileDescriptor fileDescriptor = parcelFileDescriptor.getFileDescriptor();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(fileDescriptor);
                java.lang.Object obj = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj, arrayList.toArray(), "com/google/android/gms/common/images/zaa", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeFileDescriptor", "(Ljava/io/FileDescriptor;)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap decodeFileDescriptor = android.graphics.BitmapFactory.decodeFileDescriptor((java.io.FileDescriptor) arrayList.get(0));
                yj0.a.e(obj, decodeFileDescriptor, "com/google/android/gms/common/images/zaa", "run", "()V", "android/graphics/BitmapFactory_EXEC_", "decodeFileDescriptor", "(Ljava/io/FileDescriptor;)Landroid/graphics/Bitmap;");
                bitmap = decodeFileDescriptor;
            } catch (java.lang.OutOfMemoryError unused) {
                "OOM while loading bitmap for uri: ".concat(java.lang.String.valueOf(this.zab));
                z17 = true;
            }
            try {
                this.zac.close();
            } catch (java.io.IOException unused2) {
            }
        }
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        com.google.android.gms.common.images.ImageManager imageManager = this.zaa;
        android.net.Uri uri = this.zab;
        handler = imageManager.zae;
        handler.post(new com.google.android.gms.common.images.zac(imageManager, uri, bitmap, z17, countDownLatch));
        try {
            countDownLatch.await();
        } catch (java.lang.InterruptedException unused3) {
            "Latch interrupted while posting ".concat(java.lang.String.valueOf(this.zab));
        }
    }
}
