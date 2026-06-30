package m12;

/* loaded from: classes10.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ m12.i f404369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.nio.ByteBuffer f404370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.gif.a f404371f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.y0 f404372g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f404373h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f404374i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.q f404375m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(m12.i iVar, java.nio.ByteBuffer byteBuffer, com.p314xaae8f345.mm.p1006xc5476f33.gif.a aVar, p3325xe03a0797.p3326xc267989b.y0 y0Var, java.util.Set set, java.util.List list, p3325xe03a0797.p3326xc267989b.q qVar) {
        super(2);
        this.f404369d = iVar;
        this.f404370e = byteBuffer;
        this.f404371f = aVar;
        this.f404372g = y0Var;
        this.f404373h = set;
        this.f404374i = list;
        this.f404375m = qVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj2;
        if (bitmap != null) {
            m12.i iVar = this.f404369d;
            if (iVar.f404348a.width() != iVar.f404349b || iVar.f404348a.height() != iVar.f404350c) {
                android.graphics.Rect rect = iVar.f404348a;
                int i17 = rect.left;
                int i18 = rect.top;
                int width = rect.width();
                int width2 = bitmap.getWidth();
                android.graphics.Rect rect2 = iVar.f404348a;
                int i19 = width2 - rect2.left;
                if (width > i19) {
                    width = i19;
                }
                int height = rect2.height();
                int height2 = bitmap.getHeight() - iVar.f404348a.top;
                if (height > height2) {
                    height = height2;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(height));
                arrayList.add(java.lang.Integer.valueOf(width));
                arrayList.add(java.lang.Integer.valueOf(i18));
                arrayList.add(java.lang.Integer.valueOf(i17));
                arrayList.add(bitmap);
                java.lang.Object obj3 = new java.lang.Object();
                java.util.Collections.reverse(arrayList);
                yj0.a.d(obj3, arrayList.toArray(), "com/tencent/mm/plugin/emoji/editor/generator/VideoEmojiGenerator$generate$2$1$2", "invoke", "(JLandroid/graphics/Bitmap;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                android.graphics.Bitmap createBitmap = android.graphics.Bitmap.createBitmap((android.graphics.Bitmap) arrayList.get(0), ((java.lang.Integer) arrayList.get(1)).intValue(), ((java.lang.Integer) arrayList.get(2)).intValue(), ((java.lang.Integer) arrayList.get(3)).intValue(), ((java.lang.Integer) arrayList.get(4)).intValue());
                yj0.a.e(obj3, createBitmap, "com/tencent/mm/plugin/emoji/editor/generator/VideoEmojiGenerator$generate$2$1$2", "invoke", "(JLandroid/graphics/Bitmap;)V", "android/graphics/Bitmap_EXEC_", "createBitmap", "(Landroid/graphics/Bitmap;IIII)Landroid/graphics/Bitmap;");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(createBitmap);
                bitmap = createBitmap;
            }
            android.graphics.Bitmap bitmap2 = iVar.f404351d;
            if (bitmap2 != null) {
                new android.graphics.Canvas(bitmap).drawBitmap(bitmap2, 0.0f, 0.0f, (android.graphics.Paint) null);
            }
            java.nio.ByteBuffer byteBuffer = this.f404370e;
            byteBuffer.rewind();
            bitmap.copyPixelsToBuffer(byteBuffer);
            this.f404371f.a(byteBuffer.array(), -1L);
        }
        p3325xe03a0797.p3326xc267989b.y0 y0Var = this.f404372g;
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.l.d(y0Var, p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, null, new m12.f(this.f404373h, longValue, this.f404374i, this.f404375m, null), 2, null);
        return jz5.f0.f384359a;
    }
}
