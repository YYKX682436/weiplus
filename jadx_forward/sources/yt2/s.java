package yt2;

/* loaded from: classes.dex */
public final class s implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f546856d;

    public s(android.graphics.Bitmap bitmap) {
        this.f546856d = bitmap;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.graphics.Bitmap bitmap = this.f546856d;
        if (bitmap.isRecycled()) {
            return;
        }
        try {
            bitmap.recycle();
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.SubsidyPriceCrossFade", "recycle snapshot failed: " + th6.getMessage());
        }
    }
}
