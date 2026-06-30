package b51;

/* loaded from: classes10.dex */
public final class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b51.m f99549d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99550e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99551f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f99552g;

    public g(b51.m mVar, java.lang.String str, java.lang.String str2, android.view.View view) {
        this.f99549d = mVar;
        this.f99550e = str;
        this.f99551f = str2;
        this.f99552g = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        b51.m mVar = this.f99549d;
        java.lang.String str = this.f99550e;
        java.lang.String g17 = mVar.g(str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[load-execute] tag:");
        java.lang.String str2 = this.f99551f;
        sb6.append(str2);
        sb6.append(", url:");
        sb6.append(str);
        sb6.append(", path:");
        sb6.append(g17);
        java.lang.String sb7 = sb6.toString();
        java.lang.String str3 = mVar.f99574a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, sb7);
        c51.g gVar = new c51.g(new d51.b(this.f99550e, g17, this.f99552g, this.f99551f, mVar.f99578e), (b51.u) ((jz5.n) mVar.f99580g).mo141623x754a37bb());
        if (b51.m.e(mVar, g17)) {
            gVar.e(new c51.b(g17));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "[load-return-cache] tag:" + str2 + ", url:" + str + ", path:" + g17);
            return;
        }
        pm0.v.X(new b51.f(mVar, this.f99552g));
        ((fp0.o) ((jz5.n) mVar.f99581h).mo141623x754a37bb()).a(gVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "[load-return-async] tag:" + str2 + ", url:" + str + ", path:" + g17);
    }
}
