package hy;

/* loaded from: classes14.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy.a0 f367283d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.u f367284e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367285f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ byte[] f367286g;

    public p(hy.a0 a0Var, com.p314xaae8f345.p3133xd0ce8b26.aff.p3137x2c0e0b6f.u uVar, java.lang.String str, byte[] bArr) {
        this.f367283d = a0Var;
        this.f367284e = uVar;
        this.f367285f = str;
        this.f367286g = bArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = ((java.util.ArrayList) hy.a0.a(this.f367283d)).iterator();
        while (it.hasNext()) {
            ((wx.g1) it.next()).lb(this.f367284e, this.f367285f, this.f367286g);
        }
    }
}
