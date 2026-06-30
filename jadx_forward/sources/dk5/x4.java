package dk5;

/* loaded from: classes9.dex */
public class x4 implements dn.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f316524d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 f316525e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f316526f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a f316527g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 f316528h;

    public x4(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99 activityC22573x19a79d99, java.lang.String str, com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504, java.util.List list, com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.a aVar) {
        this.f316528h = activityC22573x19a79d99;
        this.f316524d = str;
        this.f316525e = c11286x34a5504;
        this.f316526f = list;
        this.f316527g = aVar;
    }

    @Override // dn.k
    public void O(java.lang.String str, java.io.ByteArrayOutputStream byteArrayOutputStream) {
    }

    @Override // dn.k
    public int r4(java.lang.String str, int i17, dn.g gVar, dn.h hVar, boolean z17) {
        java.lang.String str2 = this.f316524d;
        if (i17 == 0 && hVar != null && hVar.f69553xb5f54fe9 == 0) {
            android.graphics.Bitmap bitmap = null;
            try {
                if (com.p314xaae8f345.mm.vfs.w6.j(str2)) {
                    java.io.InputStream E = com.p314xaae8f345.mm.vfs.w6.E(str2);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(E);
                    java.lang.Object obj = new java.lang.Object();
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(obj, arrayList.toArray(), "com/tencent/mm/ui/transmit/SendAppMessageWrapperUI$17", "callback", "(Ljava/lang/String;ILcom/tencent/mm/cdn/keep_ProgressInfo;Lcom/tencent/mm/cdn/keep_SceneResult;Z)I", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                    android.graphics.Bitmap decodeStream = android.graphics.BitmapFactory.decodeStream((java.io.InputStream) arrayList.get(0));
                    yj0.a.e(obj, decodeStream, "com/tencent/mm/ui/transmit/SendAppMessageWrapperUI$17", "callback", "(Ljava/lang/String;ILcom/tencent/mm/cdn/keep_ProgressInfo;Lcom/tencent/mm/cdn/keep_SceneResult;Z)I", "android/graphics/BitmapFactory_EXEC_", "decodeStream", "(Ljava/io/InputStream;)Landroid/graphics/Bitmap;");
                    bitmap = decodeStream;
                }
            } catch (java.io.FileNotFoundException unused) {
            }
            com.p314xaae8f345.mm.p987xb4b579b0.p993xdb1a6fb8.C11286x34a5504 c11286x34a5504 = this.f316525e;
            if (bitmap != null) {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                bitmap.compress(android.graphics.Bitmap.CompressFormat.JPEG, 100, byteArrayOutputStream);
                c11286x34a5504.f33128x4f3b3aa0 = byteArrayOutputStream.toByteArray();
            }
            int i18 = com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22573x19a79d99.B;
            this.f316528h.h7(this.f316526f, c11286x34a5504, this.f316527g);
        }
        return 0;
    }

    @Override // dn.k
    public byte[] w(java.lang.String str, byte[] bArr) {
        return new byte[0];
    }
}
