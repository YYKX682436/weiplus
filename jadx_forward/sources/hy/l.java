package hy;

/* loaded from: classes14.dex */
public final class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy.a0 f367273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367274e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f367275f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f367276g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367277h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f367278i;

    public l(hy.a0 a0Var, java.lang.String str, int i17, int i18, java.lang.String str2, java.lang.String str3) {
        this.f367273d = a0Var;
        this.f367274e = str;
        this.f367275f = i17;
        this.f367276g = i18;
        this.f367277h = str2;
        this.f367278i = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Iterator it = ((java.util.ArrayList) hy.a0.a(this.f367273d)).iterator();
        while (it.hasNext()) {
            ((wx.g1) it.next()).vf(this.f367274e, this.f367275f, this.f367276g, this.f367277h, this.f367278i);
        }
    }
}
