package d7;

/* loaded from: classes13.dex */
public class c implements t6.o {

    /* renamed from: b, reason: collision with root package name */
    public static final t6.k f308322b = t6.k.a("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionQuality", 90);

    /* renamed from: c, reason: collision with root package name */
    public static final t6.k f308323c = new t6.k("com.bumptech.glide.load.resource.bitmap.BitmapEncoder.CompressionFormat", null, t6.k.f497501e);

    /* renamed from: a, reason: collision with root package name */
    public final x6.b f308324a;

    public c(x6.b bVar) {
        this.f308324a = bVar;
    }

    @Override // t6.o
    public t6.c a(t6.l lVar) {
        return t6.c.TRANSFORMED;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006b  */
    @Override // t6.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(java.lang.Object r9, java.io.File r10, t6.l r11) {
        /*
            r8 = this;
            w6.z0 r9 = (w6.z0) r9
            java.lang.String r0 = "BitmapEncoder"
            java.lang.Object r9 = r9.get()
            android.graphics.Bitmap r9 = (android.graphics.Bitmap) r9
            t6.k r1 = d7.c.f308323c
            java.lang.Object r2 = r11.c(r1)
            android.graphics.Bitmap$CompressFormat r2 = (android.graphics.Bitmap.CompressFormat) r2
            if (r2 == 0) goto L15
            goto L20
        L15:
            boolean r2 = r9.hasAlpha()
            if (r2 == 0) goto L1e
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG
            goto L20
        L1e:
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.JPEG
        L20:
            r9.getWidth()
            r9.getHeight()
            int r3 = q7.j.f441834b
            long r3 = android.os.SystemClock.elapsedRealtimeNanos()
            t6.k r5 = d7.c.f308322b
            java.lang.Object r5 = r11.c(r5)
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            r6 = 0
            java.io.FileOutputStream r7 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            r7.<init>(r10)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            x6.b r10 = r8.f308324a
            if (r10 == 0) goto L4c
            u6.c r6 = new u6.c     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4a
            r6.<init>(r7, r10)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L4a
            goto L4d
        L48:
            r9 = move-exception
            goto L80
        L4a:
            r6 = r7
            goto L5a
        L4c:
            r6 = r7
        L4d:
            r9.compress(r2, r5, r6)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            r6.close()     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a
            r6.close()     // Catch: java.io.IOException -> L56 java.lang.Throwable -> L86
        L56:
            r10 = 1
            goto L64
        L58:
            r9 = move-exception
            goto L7f
        L5a:
            r10 = 3
            android.util.Log.isLoggable(r0, r10)     // Catch: java.lang.Throwable -> L58
            if (r6 == 0) goto L63
            r6.close()     // Catch: java.io.IOException -> L63 java.lang.Throwable -> L86
        L63:
            r10 = 0
        L64:
            r5 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r5)
            if (r0 == 0) goto L7e
            java.util.Objects.toString(r2)
            q7.p.c(r9)
            q7.j.a(r3)
            java.lang.Object r11 = r11.c(r1)
            java.util.Objects.toString(r11)
            r9.hasAlpha()
        L7e:
            return r10
        L7f:
            r7 = r6
        L80:
            if (r7 == 0) goto L88
            r7.close()     // Catch: java.lang.Throwable -> L86 java.io.IOException -> L88
            goto L88
        L86:
            r9 = move-exception
            throw r9
        L88:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: d7.c.b(java.lang.Object, java.io.File, t6.l):boolean");
    }
}
