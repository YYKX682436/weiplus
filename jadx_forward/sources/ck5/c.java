package ck5;

/* loaded from: classes10.dex */
public class c extends ck5.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f124082a;

    /* renamed from: b, reason: collision with root package name */
    public int f124083b = 104857600;

    /* renamed from: c, reason: collision with root package name */
    public int f124084c = 2048;

    /* renamed from: d, reason: collision with root package name */
    public int f124085d = 2048;

    /* renamed from: e, reason: collision with root package name */
    public int f124086e = 0;

    /* renamed from: f, reason: collision with root package name */
    public ck5.b f124087f;

    public c(java.lang.String str) {
        this.f124082a = str;
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
            r6.f124087f = r7
            java.lang.String r0 = "MicroMsg.ImageBoundaryCheck"
            if (r7 != 0) goto Lc
            java.lang.String r7 = "dz[callback is null]"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r7)
            goto L63
        Lc:
            java.lang.String r7 = r6.f124082a
            boolean r1 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r7)
            if (r1 == 0) goto L19
            java.lang.String r1 = "dz[check image but path is null or nil]"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r1)
        L19:
            long r1 = com.p314xaae8f345.mm.vfs.w6.k(r7)
            int r1 = (int) r1
            r6.f124086e = r1
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options
            r1.<init>()
            r2 = 1
            r1.inJustDecodeBounds = r2
            com.p314xaae8f345.mm.p786x600aa8b.e.d(r7, r1)
            int r7 = r1.outWidth
            int r1 = r1.outHeight
            int r3 = r6.f124086e
            int r4 = r6.f124083b
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
            int r4 = r6.f124084c
            if (r7 > r4) goto L49
            int r7 = r6.f124085d
            if (r1 <= r7) goto L4a
        L49:
            r3 = r5
        L4a:
            if (r3 == 0) goto L52
            java.lang.String r7 = "dz[status ok]"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r7)
            goto L53
        L52:
            r5 = r2
        L53:
            if (r5 == 0) goto L5e
            if (r5 == r2) goto L58
            goto L63
        L58:
            ck5.b r7 = r6.f124087f
            r7.a()
            goto L63
        L5e:
            ck5.b r7 = r6.f124087f
            r7.b(r6)
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ck5.c.a(ck5.b):void");
    }
}
