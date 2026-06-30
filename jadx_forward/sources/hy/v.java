package hy;

/* loaded from: classes14.dex */
public final class v implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy.a0 f367295d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.j f367296e;

    public v(hy.a0 a0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.j jVar) {
        this.f367295d = a0Var;
        this.f367296e = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = ((java.util.ArrayList) hy.a0.a(this.f367295d)).iterator();
        while (it.hasNext()) {
            ((wx.g1) it.next()).J6(this.f367296e);
        }
    }
}
