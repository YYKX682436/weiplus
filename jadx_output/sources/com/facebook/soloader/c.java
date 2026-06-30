package com.facebook.soloader;

/* loaded from: classes13.dex */
public class c extends com.facebook.soloader.s {

    /* renamed from: h, reason: collision with root package name */
    public final int f44003h;

    public c(android.content.Context context, java.io.File file, java.lang.String str, int i17) {
        super(context, str, file, "^lib/([^/]+)/([^/]+\\.so)$");
        this.f44003h = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0045 A[Catch: all -> 0x008b, TRY_ENTER, TryCatch #1 {all -> 0x008b, blocks: (B:3:0x000d, B:27:0x0025, B:7:0x0031, B:9:0x003a, B:13:0x0045, B:15:0x004d, B:18:0x0058, B:20:0x0067, B:23:0x0072), top: B:2:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003a A[Catch: all -> 0x008b, TRY_LEAVE, TryCatch #1 {all -> 0x008b, blocks: (B:3:0x000d, B:27:0x0025, B:7:0x0031, B:9:0x003a, B:13:0x0045, B:15:0x004d, B:18:0x0058, B:20:0x0067, B:23:0x0072), top: B:2:0x000d }] */
    @Override // com.facebook.soloader.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public byte[] g() {
        /*
            r6 = this;
            android.content.Context r0 = r6.f44048c
            java.io.File r1 = r6.f44059f
            java.io.File r1 = r1.getCanonicalFile()
            android.os.Parcel r2 = android.os.Parcel.obtain()
            r3 = 2
            r2.writeByte(r3)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r4 = r1.getPath()     // Catch: java.lang.Throwable -> L8b
            r2.writeString(r4)     // Catch: java.lang.Throwable -> L8b
            long r4 = r1.lastModified()     // Catch: java.lang.Throwable -> L8b
            r2.writeLong(r4)     // Catch: java.lang.Throwable -> L8b
            android.content.pm.PackageManager r1 = r0.getPackageManager()     // Catch: java.lang.Throwable -> L8b
            r4 = 0
            if (r1 == 0) goto L30
            java.lang.String r5 = r0.getPackageName()     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L8b
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r5, r4)     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L8b
            int r1 = r1.versionCode     // Catch: java.lang.Throwable -> L30 java.lang.Throwable -> L8b
            goto L31
        L30:
            r1 = r4
        L31:
            r2.writeInt(r1)     // Catch: java.lang.Throwable -> L8b
            int r1 = r6.f44003h     // Catch: java.lang.Throwable -> L8b
            r5 = 1
            r1 = r1 & r5
            if (r1 != 0) goto L45
            r2.writeByte(r4)     // Catch: java.lang.Throwable -> L8b
            byte[] r0 = r2.marshall()     // Catch: java.lang.Throwable -> L8b
            r2.recycle()
            return r0
        L45:
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo()     // Catch: java.lang.Throwable -> L8b
            java.lang.String r0 = r0.nativeLibraryDir     // Catch: java.lang.Throwable -> L8b
            if (r0 != 0) goto L58
            r2.writeByte(r5)     // Catch: java.lang.Throwable -> L8b
            byte[] r0 = r2.marshall()     // Catch: java.lang.Throwable -> L8b
            r2.recycle()
            return r0
        L58:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L8b
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L8b
            java.io.File r0 = r1.getCanonicalFile()     // Catch: java.lang.Throwable -> L8b
            boolean r1 = r0.exists()     // Catch: java.lang.Throwable -> L8b
            if (r1 != 0) goto L72
            r2.writeByte(r5)     // Catch: java.lang.Throwable -> L8b
            byte[] r0 = r2.marshall()     // Catch: java.lang.Throwable -> L8b
            r2.recycle()
            return r0
        L72:
            r2.writeByte(r3)     // Catch: java.lang.Throwable -> L8b
            java.lang.String r1 = r0.getPath()     // Catch: java.lang.Throwable -> L8b
            r2.writeString(r1)     // Catch: java.lang.Throwable -> L8b
            long r0 = r0.lastModified()     // Catch: java.lang.Throwable -> L8b
            r2.writeLong(r0)     // Catch: java.lang.Throwable -> L8b
            byte[] r0 = r2.marshall()     // Catch: java.lang.Throwable -> L8b
            r2.recycle()
            return r0
        L8b:
            r0 = move-exception
            r2.recycle()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.c.g():byte[]");
    }

    @Override // com.facebook.soloader.m0
    public com.facebook.soloader.l0 j() {
        return new com.facebook.soloader.b(this, this);
    }
}
