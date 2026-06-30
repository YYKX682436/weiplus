package m95;

/* loaded from: classes13.dex */
public class d extends m95.b {

    /* renamed from: i, reason: collision with root package name */
    public final m95.c f406622i;

    public d(android.graphics.Picture picture, int i17) {
        super(picture != null ? picture.getWidth() : 0, picture != null ? picture.getHeight() : 0, 1.0f, i17);
        this.f406622i = new m95.c(picture, i17);
        this.f406612b.set(0, 0, this.f406617g, this.f406618h);
    }

    public void c() {
        m95.c cVar = this.f406622i;
        android.graphics.Bitmap bitmap = cVar.f406620b;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        n95.d.b("MicroMsg.SVGPictureDrawable", "recycle bitmap:%s", cVar.f406620b.toString());
        cVar.f406620b.recycle();
        cVar.f406620b = null;
    }

    public void d() {
        int i17;
        m95.c cVar = this.f406622i;
        android.graphics.Picture picture = cVar.f406619a;
        int i18 = this.f406611a;
        if (picture == null) {
            n95.d.a("MicroMsg.SVGPictureDrawable", "Must not go here! %s", java.lang.Integer.valueOf(i18));
            return;
        }
        long nanoTime = java.lang.System.nanoTime();
        android.graphics.Bitmap bitmap = cVar.f406620b;
        if (bitmap == null || bitmap.isRecycled()) {
            int i19 = this.f406617g;
            if (i19 > 2048 || (i17 = this.f406618h) > 2048) {
                n95.d.a("MicroMsg.SVGPictureDrawable", "This drawable is too big. %s", java.lang.Integer.valueOf(i18));
                return;
            }
            if (i19 <= 0 || i17 <= 0) {
                n95.d.a("MicroMsg.SVGPictureDrawable", "width and height must > 0.", new java.lang.Object[0]);
                return;
            }
            android.graphics.Bitmap.Config config = android.graphics.Bitmap.Config.ARGB_8888;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(config);
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            arrayList.add(java.lang.Integer.valueOf(i19));
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/svg/graphics/SVGPictureDrawable", "makeDrawingCache", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap(((java.lang.Integer) arrayList.get(0)).intValue(), ((java.lang.Integer) arrayList.get(1)).intValue(), (android.graphics.Bitmap.Config) arrayList.get(2));
            yj0.a.e(obj, createBitmap, "com/tencent/mm/svg/graphics/SVGPictureDrawable", "makeDrawingCache", "()V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;");
            android.graphics.Canvas canvas = new android.graphics.Canvas(createBitmap);
            cVar.f406619a.draw(canvas);
            cVar.f406620b = createBitmap;
            long nanoTime2 = (java.lang.System.nanoTime() - nanoTime) / 1000;
            a(canvas);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0081 A[Catch: all -> 0x001a, TryCatch #0 {all -> 0x001a, blocks: (B:3:0x0006, B:5:0x000c, B:6:0x0010, B:9:0x0018, B:13:0x001e, B:14:0x001f, B:16:0x0020, B:20:0x0033, B:22:0x0039, B:24:0x003f, B:26:0x0045, B:28:0x007c, B:30:0x0081, B:32:0x0088, B:34:0x008c, B:35:0x0099, B:38:0x0049, B:40:0x004f, B:42:0x0056, B:45:0x005d, B:47:0x0061, B:48:0x006e, B:49:0x0078, B:8:0x0011), top: B:2:0x0006, inners: #1 }] */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r15) {
        /*
            r14 = this;
            long r0 = java.lang.System.nanoTime()
            r2 = 1000(0x3e8, double:4.94E-321)
            android.view.View r4 = r14.b()     // Catch: java.lang.Throwable -> L1a
            if (r4 != 0) goto L20
            android.view.View r4 = m95.a.b(r14)     // Catch: java.lang.Throwable -> L1a
            monitor-enter(r14)     // Catch: java.lang.Throwable -> L1a
            java.lang.ref.WeakReference r5 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> L1d
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L1d
            r14.f406616f = r5     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L1a
            goto L20
        L1a:
            r4 = move-exception
            goto Lae
        L1d:
            r4 = move-exception
            monitor-exit(r14)     // Catch: java.lang.Throwable -> L1a
            throw r4     // Catch: java.lang.Throwable -> L1a
        L20:
            r5 = 30
            boolean r5 = fp.h.c(r5)     // Catch: java.lang.Throwable -> L1a
            android.graphics.Rect r6 = r14.f406612b
            m95.c r7 = r14.f406622i
            android.graphics.Paint r8 = r14.f406614d
            r9 = 119(0x77, float:1.67E-43)
            r10 = 0
            if (r5 == 0) goto L49
            if (r4 == 0) goto L49
            int r5 = r4.getLayerType()     // Catch: java.lang.Throwable -> L1a
            if (r5 == 0) goto L49
            boolean r5 = wo.w0.q()     // Catch: java.lang.Throwable -> L1a
            if (r5 == 0) goto L49
            boolean r5 = m95.a.i()     // Catch: java.lang.Throwable -> L1a
            if (r5 == 0) goto L49
            r14.c()     // Catch: java.lang.Throwable -> L1a
            goto L7b
        L49:
            boolean r5 = r15.isHardwareAccelerated()     // Catch: java.lang.Throwable -> L1a
            if (r5 == 0) goto L78
            r14.d()     // Catch: java.lang.Throwable -> L1a
            android.graphics.Bitmap r5 = r7.f406620b     // Catch: java.lang.Throwable -> L1a
            if (r5 == 0) goto L7b
            boolean r5 = r5.isRecycled()     // Catch: java.lang.Throwable -> L1a
            if (r5 == 0) goto L5d
            goto L7b
        L5d:
            boolean r5 = r14.f406613c     // Catch: java.lang.Throwable -> L1a
            if (r5 == 0) goto L6e
            android.graphics.Rect r5 = r14.getBounds()     // Catch: java.lang.Throwable -> L1a
            android.graphics.Rect r11 = r14.f406612b     // Catch: java.lang.Throwable -> L1a
            int r12 = r14.f406617g     // Catch: java.lang.Throwable -> L1a
            int r13 = r14.f406618h     // Catch: java.lang.Throwable -> L1a
            android.view.Gravity.apply(r9, r12, r13, r5, r11)     // Catch: java.lang.Throwable -> L1a
        L6e:
            r14.f406613c = r10     // Catch: java.lang.Throwable -> L1a
            android.graphics.Bitmap r5 = r7.f406620b     // Catch: java.lang.Throwable -> L1a
            r11 = 0
            r15.drawBitmap(r5, r11, r6, r8)     // Catch: java.lang.Throwable -> L1a
            r5 = 1
            goto L7c
        L78:
            r14.c()     // Catch: java.lang.Throwable -> L1a
        L7b:
            r5 = r10
        L7c:
            m95.a.h(r4, r8)     // Catch: java.lang.Throwable -> L1a
            if (r5 != 0) goto La4
            r15.isHardwareAccelerated()     // Catch: java.lang.Throwable -> L1a
            android.graphics.Picture r4 = r7.f406619a     // Catch: java.lang.Throwable -> L1a
            if (r4 == 0) goto La4
            boolean r5 = r14.f406613c     // Catch: java.lang.Throwable -> L1a
            if (r5 == 0) goto L99
            android.graphics.Rect r5 = r14.getBounds()     // Catch: java.lang.Throwable -> L1a
            android.graphics.Rect r7 = r14.f406612b     // Catch: java.lang.Throwable -> L1a
            int r8 = r14.f406617g     // Catch: java.lang.Throwable -> L1a
            int r11 = r14.f406618h     // Catch: java.lang.Throwable -> L1a
            android.view.Gravity.apply(r9, r8, r11, r5, r7)     // Catch: java.lang.Throwable -> L1a
        L99:
            r14.f406613c = r10     // Catch: java.lang.Throwable -> L1a
            r15.save()     // Catch: java.lang.Throwable -> L1a
            r15.drawPicture(r4, r6)     // Catch: java.lang.Throwable -> L1a
            r15.restore()     // Catch: java.lang.Throwable -> L1a
        La4:
            long r4 = java.lang.System.nanoTime()
            long r4 = r4 - r0
            long r4 = r4 / r2
            r14.a(r15)
            return
        Lae:
            long r5 = java.lang.System.nanoTime()
            long r5 = r5 - r0
            long r5 = r5 / r2
            r14.a(r15)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: m95.d.draw(android.graphics.Canvas):void");
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
        return this.f406622i;
    }
}
