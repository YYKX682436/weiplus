package uw0;

/* loaded from: classes5.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ uw0.x f513151d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tw0.b f513152e;

    public w(uw0.x xVar, tw0.b bVar) {
        this.f513151d = xVar;
        this.f513152e = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.View m170643xc24d69b7;
        uw0.x xVar = this.f513151d;
        m170643xc24d69b7 = xVar.m170643xc24d69b7();
        if (m170643xc24d69b7.isAttachedToWindow()) {
            xVar.W(this.f513152e);
        }
    }
}
