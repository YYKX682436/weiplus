package hy;

/* loaded from: classes14.dex */
public final class j implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy.a0 f367271d;

    public j(hy.a0 a0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.t1 t1Var) {
        this.f367271d = a0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = ((java.util.ArrayList) hy.a0.a(this.f367271d)).iterator();
        while (it.hasNext()) {
            ((wx.g1) it.next()).getClass();
        }
    }
}
