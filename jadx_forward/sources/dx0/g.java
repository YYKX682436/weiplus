package dx0;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final ex0.a0 f325967a;

    /* renamed from: b, reason: collision with root package name */
    public final android.util.Size f325968b;

    /* renamed from: c, reason: collision with root package name */
    public final dx0.a f325969c;

    /* renamed from: d, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f325970d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f325971e;

    public g(ex0.a0 timelineVM, android.util.Size thumbnailSize, dx0.a coverThumbnailProviderCallback, p3325xe03a0797.p3326xc267989b.y0 mainScope) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(timelineVM, "timelineVM");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(thumbnailSize, "thumbnailSize");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverThumbnailProviderCallback, "coverThumbnailProviderCallback");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mainScope, "mainScope");
        this.f325967a = timelineVM;
        this.f325968b = thumbnailSize;
        this.f325969c = coverThumbnailProviderCallback;
        this.f325970d = mainScope;
        this.f325971e = new java.util.concurrent.ConcurrentHashMap();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(4:18|(1:20)(5:21|(1:23)(1:34)|24|(1:26)(1:33)|(2:28|(2:30|(1:32))))|12|13)|11|12|13))|36|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(dx0.g r8, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 r9, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof dx0.d
            if (r0 == 0) goto L16
            r0 = r10
            dx0.d r0 = (dx0.d) r0
            int r1 = r0.f325960f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f325960f = r1
            goto L1b
        L16:
            dx0.d r0 = new dx0.d
            r0.<init>(r8, r10)
        L1b:
            java.lang.Object r10 = r0.f325958d
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f325960f
            jz5.f0 r3 = jz5.f0.f384359a
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)     // Catch: java.lang.Exception -> L42
            goto L42
        L2c:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L34:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            ex0.a0 r10 = r8.f325967a
            com.tencent.maas.moviecomposing.o0 r2 = r10.p(r9)
            if (r2 == 0) goto L44
            r8.b(r9)
        L42:
            r1 = r3
            goto L85
        L44:
            ex0.v r10 = r10.f338630g
            ex0.r r10 = r10.g(r9)
            r2 = 0
            if (r10 == 0) goto L50
            com.tencent.maas.moviecomposing.segments.Segment r10 = r10.f338700a
            goto L51
        L50:
            r10 = r2
        L51:
            boolean r5 = r10 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3
            if (r5 == 0) goto L58
            com.tencent.maas.moviecomposing.segments.ClipSegment r10 = (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) r10
            goto L59
        L58:
            r10 = r2
        L59:
            if (r10 != 0) goto L5c
            goto L42
        L5c:
            ug.m r5 = ug.m.ImageClip
            ug.m r6 = ug.m.VideoClip
            ug.m r7 = ug.m.MovieClip
            ug.m[] r5 = new ug.m[]{r5, r6, r7}
            ug.m r6 = r10.C()
            java.lang.String r7 = "getSegmentType(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r7)
            boolean r5 = kz5.z.G(r5, r6)
            if (r5 != 0) goto L76
            goto L42
        L76:
            kotlinx.coroutines.p0 r5 = p3325xe03a0797.p3326xc267989b.q1.f392103c     // Catch: java.lang.Exception -> L42
            dx0.e r6 = new dx0.e     // Catch: java.lang.Exception -> L42
            r6.<init>(r10, r8, r9, r2)     // Catch: java.lang.Exception -> L42
            r0.f325960f = r4     // Catch: java.lang.Exception -> L42
            java.lang.Object r8 = p3325xe03a0797.p3326xc267989b.l.g(r5, r6, r0)     // Catch: java.lang.Exception -> L42
            if (r8 != r1) goto L42
        L85:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dx0.g.a(dx0.g, com.tencent.maas.base.MJID, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void b(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        com.p314xaae8f345.p457x3304c6.p479x4179489f.o0 p17 = this.f325967a.p(segmentID);
        if (p17 == null) {
            p3325xe03a0797.p3326xc267989b.l.d(this.f325970d, null, null, new dx0.b(this, segmentID, null), 3, null);
        } else {
            p17.d(e(segmentID), new dx0.c(this, segmentID));
        }
    }

    public final android.graphics.Bitmap c(android.graphics.Bitmap bitmap) {
        android.util.Size size = this.f325968b;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (height == 0 || width == 0) {
            return null;
        }
        try {
            int width2 = (width - size.getWidth()) / 2;
            if (width2 < 0) {
                width2 = 0;
            }
            int height2 = (height - size.getHeight()) / 2;
            if (height2 < 0) {
                height2 = 0;
            }
            int width3 = size.getWidth();
            int height3 = size.getHeight();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(height3));
            arrayList.add(java.lang.Integer.valueOf(width3));
            arrayList.add(java.lang.Integer.valueOf(height2));
            arrayList.add(java.lang.Integer.valueOf(width2));
            arrayList.add(bitmap);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/timeline/thumbnail/MJCoverThumbnailProvider", "getCenterCropBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
            yj0.a.e(obj, createBitmap, "com/tencent/mm/mj_publisher/finder/movie_composing/timeline/thumbnail/MJCoverThumbnailProvider", "getCenterCropBitmap", "(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap;", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
            return createBitmap;
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MJCoverThumbnailProvider", "getCenterCropBitmap: ", e17);
            return null;
        }
    }

    public final dx0.p d(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        if (this.f325967a.h(segmentID)) {
            return (dx0.p) this.f325971e.get(segmentID);
        }
        return null;
    }

    public final com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 e(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78) {
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 m17;
        com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553 c4129xdee64553 = new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.f16098x2ccb95b5, com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(1.0d));
        ex0.r K = this.f325967a.K(c3971x241f78);
        return K == null ? c4129xdee64553 : (K.f338702c == ug.m.ImageClip || (m17 = K.m()) == null) ? c4129xdee64553 : new com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4129xdee64553(m17.m34009x8082fb99(), com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a.m33969x7905b775(1.0d));
    }

    public final void f(com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID) {
        java.lang.String str;
        ug.m mVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = this.f325971e;
        if (concurrentHashMap.containsKey(segmentID)) {
            dx0.p pVar = (dx0.p) concurrentHashMap.get(segmentID);
            if ((pVar != null ? pVar.f326000a : null) != null) {
                return;
            }
        }
        ex0.a0 a0Var = this.f325967a;
        ex0.r K = a0Var.K(segmentID);
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = K != null ? K.f338700a : null;
        com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) c4190xd8dd3713 : null;
        if (c4181x2248e1a3 != null) {
            com.p314xaae8f345.p457x3304c6.p479x4179489f.C4167x88133861 D = c4181x2248e1a3.D();
            str = D != null ? com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3.E0(c4181x2248e1a3, D) : "";
        } else {
            str = null;
        }
        java.lang.String str2 = str != null ? str : "";
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str2);
        java.lang.String str3 = a17.f294812f;
        if (str3 != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
        if (!m17.a() ? false : m17.f294799a.F(m17.f294800b)) {
            ex0.r K2 = a0Var.K(segmentID);
            if (K2 == null || (mVar = K2.f338702c) == null) {
                mVar = ug.m.None;
            }
            if (mVar == ug.m.MovieClip || mVar == ug.m.VideoClip) {
                if (str2.length() > 0) {
                    p3325xe03a0797.p3326xc267989b.l.d(this.f325970d, p3325xe03a0797.p3326xc267989b.q1.f392103c, null, new dx0.f(this, segmentID, str2, null), 2, null);
                }
            }
        }
    }
}
