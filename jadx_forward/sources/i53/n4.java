package i53;

/* loaded from: classes8.dex */
public class n4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f370211d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.SoftReference f370212e;

    public n4(java.lang.String str, java.lang.ref.SoftReference softReference) {
        this.f370211d = str;
        this.f370212e = softReference;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.ref.SoftReference softReference;
        android.widget.ImageView imageView;
        jt0.i iVar = (jt0.i) i53.o4.f370219a;
        java.lang.String str = this.f370211d;
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) iVar.i(str);
        if (bitmap == null || bitmap.isRecycled()) {
            android.graphics.Bitmap createVideoThumbnail = android.media.ThumbnailUtils.createVideoThumbnail(str, 2);
            if (createVideoThumbnail == null || createVideoThumbnail.isRecycled()) {
                bitmap = null;
            } else {
                bitmap = android.media.ThumbnailUtils.extractThumbnail(createVideoThumbnail, 537, 402, 2);
                java.lang.Object[] objArr = new java.lang.Object[1];
                objArr[0] = java.lang.Boolean.valueOf(((android.graphics.Bitmap) iVar.put(str, bitmap)) == null);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SimpleVideoAnalyzer", "createVideoThumbail, too big size = %b", objArr);
            }
        }
        if (bitmap == null || bitmap.isRecycled() || (softReference = this.f370212e) == null || (imageView = (android.widget.ImageView) softReference.get()) == null) {
            return;
        }
        com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new i53.m4(this, imageView, bitmap));
    }
}
