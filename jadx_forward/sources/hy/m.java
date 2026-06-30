package hy;

/* loaded from: classes14.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy.a0 f367279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.b3 f367280e;

    public m(hy.a0 a0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.b3 b3Var) {
        this.f367279d = a0Var;
        this.f367280e = b3Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = ((java.util.ArrayList) hy.a0.a(this.f367279d)).iterator();
        while (it.hasNext()) {
            ((wx.g1) it.next()).c6(this.f367280e);
        }
    }
}
