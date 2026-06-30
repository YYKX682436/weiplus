package hy;

/* loaded from: classes14.dex */
public final class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy.a0 f367291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w f367292e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f367293f;

    public t(hy.a0 a0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.w wVar, int i17) {
        this.f367291d = a0Var;
        this.f367292e = wVar;
        this.f367293f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = ((java.util.ArrayList) hy.a0.a(this.f367291d)).iterator();
        while (it.hasNext()) {
            ((wx.g1) it.next()).V5(this.f367292e, this.f367293f);
        }
    }
}
