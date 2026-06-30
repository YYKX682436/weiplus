package ck5;

/* loaded from: classes10.dex */
public class c extends ck5.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f42549a;

    /* renamed from: b, reason: collision with root package name */
    public int f42550b = 104857600;

    /* renamed from: c, reason: collision with root package name */
    public int f42551c = 2048;

    /* renamed from: d, reason: collision with root package name */
    public int f42552d = 2048;

    /* renamed from: e, reason: collision with root package name */
    public int f42553e = 0;

    /* renamed from: f, reason: collision with root package name */
    public ck5.b f42554f;

    public c(java.lang.String str) {
        this.f42549a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(ck5.b r7) {
        /*
            r6 = this;
            r6.f42554f = r7
            java.lang.String r0 = "MicroMsg.ImageBoundaryCheck"
            if (r7 != 0) goto Lc
            java.lang.String r7 = "dz[callback is null]"
            com.tencent.mars.xlog.Log.w(r0, r7)
            goto L63
        Lc:
            java.lang.String r7 = r6.f42549a
            boolean r1 = com.tencent.mm.sdk.platformtools.t8.K0(r7)
            if (r1 == 0) goto L19
            java.lang.String r1 = "dz[check image but path is null or nil]"
            com.tencent.mars.xlog.Log.w(r0, r1)
        L19:
            long r1 = com.tencent.mm.vfs.w6.k(r7)
            int r1 = (int) r1
            r6.f42553e = r1
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r2 = 1
            r1.inJustDecodeBounds = r2
            com.tencent.mm.graphics.e.d(r7, r1)
            int r7 = r1.outWidth
            int r1 = r1.outHeight
            int r3 = r6.f42553e
            int r4 = r6.f42550b
            r5 = 0
            if (r3 > r4) goto L40
            if (r3 >= 0) goto L3a
            r3 = r2
            goto L3b
        L3a:
            r3 = r5
        L3b:
            if (r3 == 0) goto L3e
            goto L40
        L3e:
            r3 = r2
            goto L41
        L40:
            r3 = r5
        L41:
            int r4 = r6.f42551c
            if (r7 > r4) goto L49
            int r7 = r6.f42552d
            if (r1 <= r7) goto L4a
        L49:
            r3 = r5
        L4a:
            if (r3 == 0) goto L52
            java.lang.String r7 = "dz[status ok]"
            com.tencent.mars.xlog.Log.i(r0, r7)
            goto L53
        L52:
            r5 = r2
        L53:
            if (r5 == 0) goto L5e
            if (r5 == r2) goto L58
            goto L63
        L58:
            ck5.b r7 = r6.f42554f
            r7.a()
            goto L63
        L5e:
            ck5.b r7 = r6.f42554f
            r7.b(r6)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ck5.c.a(ck5.b):void");
    }
}
