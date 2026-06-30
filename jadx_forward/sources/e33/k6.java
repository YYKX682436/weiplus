package e33;

/* loaded from: classes10.dex */
public final class k6 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.ref.WeakReference f328845d;

    public k6(android.widget.ImageView imageView) {
        this.f328845d = new java.lang.ref.WeakReference(imageView);
    }

    @Override // java.lang.Runnable
    public void run() {
        android.widget.ImageView imageView = (android.widget.ImageView) this.f328845d.get();
        android.graphics.drawable.Drawable drawable = imageView == null ? null : imageView.getDrawable();
        if (!(drawable instanceof e33.m6)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.ThumbDrawable", "[tomys] ownerView is null or not a ThumbDrawable, ignore this task.");
            return;
        }
        e33.m6 m6Var = (e33.m6) drawable;
        java.lang.String str = m6Var.f328900d;
        m6Var.f328898b = t23.p0.h().g(m6Var.f328900d, m6Var.f328901e, m6Var.f328902f, m6Var.f328905i, m6Var.f328906j);
        android.graphics.Bitmap bitmap = m6Var.f328898b;
        if (bitmap == null || bitmap.isRecycled()) {
            t23.p0.h().a(new e33.l6(m6Var.f328897a, j33.d0.d(m6Var.f328900d, m6Var.f328905i, m6Var.f328904h)));
            t23.p0.h().f(m6Var.f328900d, m6Var.f328903g, m6Var.f328901e, m6Var.f328902f, m6Var.f328905i, m6Var.f328904h, m6Var.f328906j);
        }
        m6Var.invalidateSelf();
    }
}
