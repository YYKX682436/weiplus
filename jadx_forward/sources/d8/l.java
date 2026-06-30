package d8;

/* loaded from: classes7.dex */
public class l {

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.Object f308438f = new java.lang.Object();

    /* renamed from: a, reason: collision with root package name */
    public com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.EnumC1595xee8a129 f308439a = null;

    /* renamed from: b, reason: collision with root package name */
    public com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.InterfaceC1596x8c44c2d8 f308440b = new d8.j();

    /* renamed from: c, reason: collision with root package name */
    public e8.d f308441c;

    /* renamed from: d, reason: collision with root package name */
    public final e8.a f308442d;

    /* renamed from: e, reason: collision with root package name */
    public final d8.i f308443e;

    public l(d8.i iVar, e8.a aVar) {
        this.f308443e = iVar;
        this.f308442d = aVar;
    }

    public f8.d a(java.io.InputStream inputStream) {
        java.util.Map map = i8.c.f371040a;
        android.graphics.BitmapFactory.Options options = new android.graphics.BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        if (!inputStream.markSupported()) {
            inputStream = inputStream instanceof java.io.FileInputStream ? new i8.b((java.io.FileInputStream) inputStream) : new java.io.BufferedInputStream(inputStream);
        }
        inputStream.mark(8388608);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(options);
        arrayList.add(null);
        arrayList.add(inputStream);
        java.lang.Object obj = new java.lang.Object();
        java.util.Collections.reverse(arrayList);
        yj0.a.d(obj, arrayList.toArray(), "com/github/henryye/nativeiv/util/FormatUtil", "getImageInfo", "(Ljava/io/InputStream;)Lcom/github/henryye/nativeiv/bitmap/PictureInfo;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        yj0.a.e(obj, android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList.get(0), (android.graphics.Rect) arrayList.get(1), (android.graphics.BitmapFactory.Options) arrayList.get(2)), "com/github/henryye/nativeiv/util/FormatUtil", "getImageInfo", "(Ljava/io/InputStream;)Lcom/github/henryye/nativeiv/bitmap/PictureInfo;", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;Landroid/graphics/Rect;Landroid/graphics/BitmapFactory$Options;)Landroid/graphics/Bitmap;");
        f8.c cVar = (f8.c) ((java.util.HashMap) i8.c.f371040a).get(options.outMimeType);
        f8.c cVar2 = f8.c.UNKNOWN;
        if (cVar == null) {
            cVar = cVar2;
        }
        try {
            inputStream.reset();
            cVar2 = cVar;
        } catch (java.io.IOException e17) {
            g8.g.c("Ni.FormatUtil", e17, "hy: the given stream is markable, but still reset error. should not forward", new java.lang.Object[0]);
        }
        f8.d dVar = new f8.d();
        dVar.f341605a = cVar2;
        dVar.f341607c = options.outHeight;
        dVar.f341606b = options.outWidth;
        return dVar;
    }

    public void b(f8.b bVar) {
        com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.InterfaceC1596x8c44c2d8 interfaceC1596x8c44c2d8;
        com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.EnumC1595xee8a129 enumC1595xee8a129 = com.p171xb5c11be3.p172x30254a24.p173x79eeb384.p174xad38f12f.EnumC1595xee8a129.Legacy;
        synchronized (f308438f) {
            if (this.f308440b.mo17131xfb85f7b0() == enumC1595xee8a129 && (interfaceC1596x8c44c2d8 = this.f308440b) != null) {
                interfaceC1596x8c44c2d8.mo17133x408b7293();
            }
            d8.i iVar = this.f308443e;
            int hashCode = hashCode();
            android.util.SparseArray sparseArray = iVar.f308437b;
            java.util.Map map = (java.util.Map) sparseArray.get(hashCode);
            if (map == null) {
                map = new java.util.HashMap(2);
            }
            map.put(enumC1595xee8a129, bVar);
            sparseArray.append(hashCode, map);
        }
    }
}
