package ql0;

/* loaded from: classes13.dex */
public final class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ql0.l f446003d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f446004e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.Boolean f446005f;

    public h(ql0.l lVar, java.lang.String str, java.lang.Boolean bool) {
        this.f446003d = lVar;
        this.f446004e = str;
        this.f446005f = bool;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ql0.l lVar = this.f446003d;
        lVar.getClass();
        java.lang.String str = this.f446004e;
        hl0.e eVar = new hl0.e("LiveHomeRedDot", str);
        eVar.f363591f = java.lang.System.currentTimeMillis();
        eVar.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(lVar.f446026d, "discoverLiveHomeDataPrepare " + str);
        if (wm.a.a()) {
            lVar.getClass();
            ((vm.b) ((xs.x0) i95.n0.c(xs.x0.class))).m134976x2690a4ac();
            boolean isEmpty = android.text.TextUtils.isEmpty(str);
            java.lang.Boolean bool = this.f446005f;
            if (isEmpty) {
                new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27152xcefa0e70().m111196x8546288e(java.util.Optional.of(java.lang.Boolean.valueOf(bool != null ? bool.booleanValue() : false)));
            } else {
                new com.p314xaae8f345.p3133xd0ce8b26.aff.p3136x2e7b0d.C27154x8e8487a().m111218x8546288e(str, java.util.Optional.of(java.lang.Boolean.valueOf(bool != null ? bool.booleanValue() : false)));
            }
        }
    }
}
