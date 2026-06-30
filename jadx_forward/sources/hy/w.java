package hy;

/* loaded from: classes14.dex */
public final class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy.a0 f367297d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.j f367298e;

    public w(hy.a0 a0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.j jVar) {
        this.f367297d = a0Var;
        this.f367298e = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = ((java.util.ArrayList) hy.a0.a(this.f367297d)).iterator();
        while (it.hasNext()) {
            ((wx.g1) it.next()).Yb(this.f367298e);
        }
    }
}
