package com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd;

/* loaded from: classes11.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yq5.c f296455d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.d f296456e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(yq5.c cVar, com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.d dVar) {
        super(0);
        this.f296455d = cVar;
        this.f296456e = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        yq5.c cVar = this.f296455d;
        if (cVar != null) {
            return cVar;
        }
        com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.d dVar = this.f296456e;
        yq5.f fVar = dVar.f296462e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fVar, "<this>");
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(((yq5.b) fVar).f546122a);
        java.lang.String str = a17.f294812f;
        if (str != null) {
            java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
            if (!str.equals(l17)) {
                a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
            }
        }
        java.io.InputStream D = com.p314xaae8f345.mm.vfs.w6.D(a17, com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null));
        try {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(options);
            arrayList.add(null);
            arrayList.add(D);
            java.lang.Object obj = new java.lang.Object();
            java.util.Collections.reverse(arrayList);
            yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/zoomimage/subsampling/internal/DecodesKt", "decodeImageInfo", "(Lcom/tencent/mm/zoomimage/subsampling/ImageSource;)Lcom/tencent/mm/zoomimage/subsampling/ImageInfo;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            yj0.a.e(obj, android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList.get(0), (android.graphics.Rect) arrayList.get(1), (android.graphics.BitmapFactory.Options) arrayList.get(2)), "com/tencent/mm/zoomimage/subsampling/internal/DecodesKt", "decodeImageInfo", "(Lcom/tencent/mm/zoomimage/subsampling/ImageSource;)Lcom/tencent/mm/zoomimage/subsampling/ImageInfo;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
            vz5.b.a(D, null);
            java.lang.String str2 = options.outMimeType;
            if (str2 == null) {
                str2 = "";
            }
            yq5.c cVar2 = new yq5.c(zq5.h.a(options.outWidth, options.outHeight), str2, null);
            com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.e eVar = (com.p314xaae8f345.mm.p2830x630df168.p2831xc0404e27.p2832x21ffc6bd.e) ((jz5.n) dVar.f296463f).mo141623x754a37bb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eVar, "<this>");
            long d17 = zq5.h.d(cVar2.f546124a, eVar.f296472c);
            java.lang.String mimeType = cVar2.f546125b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mimeType, "mimeType");
            return new yq5.c(d17, mimeType, null);
        } catch (java.lang.Throwable th6) {
            try {
                throw th6;
            } catch (java.lang.Throwable th7) {
                vz5.b.a(D, th6);
                throw th7;
            }
        }
    }
}
