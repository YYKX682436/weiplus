package aw4;

/* renamed from: aw4.m$$a */
/* loaded from: classes8.dex */
public final /* synthetic */ class RunnableC1287x321854 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e f96433d;

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.p2401x48fb3bf9.AbstractC19224x1fe3df6e abstractC19224x1fe3df6e = this.f96433d;
        android.graphics.Bitmap bitmap = abstractC19224x1fe3df6e.H;
        if (bitmap != null) {
            bitmap.recycle();
            abstractC19224x1fe3df6e.H = null;
            abstractC19224x1fe3df6e.invalidate();
        }
    }
}
