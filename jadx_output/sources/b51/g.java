package b51;

/* loaded from: classes10.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b51.m f18016d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18017e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f18018f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f18019g;

    public g(b51.m mVar, java.lang.String str, java.lang.String str2, android.view.View view) {
        this.f18016d = mVar;
        this.f18017e = str;
        this.f18018f = str2;
        this.f18019g = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b51.m mVar = this.f18016d;
        java.lang.String str = this.f18017e;
        java.lang.String g17 = mVar.g(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[load-execute] tag:");
        java.lang.String str2 = this.f18018f;
        sb6.append(str2);
        sb6.append(", url:");
        sb6.append(str);
        sb6.append(", path:");
        sb6.append(g17);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str3 = mVar.f18041a;
        com.tencent.mars.xlog.Log.i(str3, sb7);
        c51.g gVar = new c51.g(new d51.b(this.f18017e, g17, this.f18019g, this.f18018f, mVar.f18045e), (b51.u) ((jz5.n) mVar.f18047g).getValue());
        if (b51.m.e(mVar, g17)) {
            gVar.e(new c51.b(g17));
            com.tencent.mars.xlog.Log.i(str3, "[load-return-cache] tag:" + str2 + ", url:" + str + ", path:" + g17);
            return;
        }
        pm0.v.X(new b51.f(mVar, this.f18019g));
        ((fp0.o) ((jz5.n) mVar.f18048h).getValue()).a(gVar);
        com.tencent.mars.xlog.Log.i(str3, "[load-return-async] tag:" + str2 + ", url:" + str + ", path:" + g17);
    }
}
