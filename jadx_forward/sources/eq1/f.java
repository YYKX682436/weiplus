package eq1;

/* loaded from: classes8.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f337335d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f337336e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f337337f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f337338g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f337339h;

    public f(android.widget.ImageView imageView, android.graphics.Bitmap bitmap, java.lang.String str, int i17, int i18) {
        this.f337335d = imageView;
        this.f337336e = bitmap;
        this.f337337f = str;
        this.f337338g = i17;
        this.f337339h = i18;
    }

    @Override // java.lang.Runnable
    public final void run() {
        eq1.h hVar = eq1.h.f337345a;
        android.widget.ImageView bgIv = this.f337335d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bgIv, "bgIv");
        android.graphics.Bitmap bitmap = this.f337336e;
        if (bitmap != null) {
            java.lang.String str = this.f337337f;
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                bgIv.setScaleType(android.widget.ImageView.ScaleType.MATRIX);
                android.graphics.Matrix matrix = new android.graphics.Matrix();
                float width = this.f337338g / bitmap.getWidth();
                float height = this.f337339h / bitmap.getHeight();
                if (width <= height) {
                    width = height;
                }
                matrix.setScale(width, width, 0.0f, 0.0f);
                bgIv.setImageMatrix(matrix);
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                byte[] bytes = str.getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
                sb6.append(kk.k.g(bytes));
                sb6.append("_biz_chat_blur");
                java.lang.String sb7 = sb6.toString();
                android.graphics.Bitmap e17 = n11.a.b().e(sb7);
                if (e17 != null) {
                    bgIv.setImageBitmap(e17);
                    return;
                }
                uq5.y g17 = new com.p314xaae8f345.mm.p2825x7e128009.p2827xb226b991.C22979xbb268bc().g(uq5.k.BlurEffect);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(g17, "null cannot be cast to non-null type com.tencent.mm.xeffect.effect.BlurEffect");
                uq5.b bVar = (uq5.b) g17;
                bVar.d(20.0f);
                bVar.e(1.0f);
                um5.d dVar = new um5.d();
                dVar.b(bitmap);
                int width2 = (int) (bitmap.getWidth() * 1.2d);
                dVar.f510674b = width2;
                dVar.f510675c = (int) (bitmap.getHeight() * 1.2d);
                dVar.f510677e.f510726b.c(bVar);
                dVar.a(new eq1.b(str, bgIv, sb7));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizChatUtil", "imageData.bitmap == null || coverUrl == null");
    }
}
