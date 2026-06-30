package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class e7 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u65.a f77994d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f77995e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.d7 f77996f;

    public e7(com.tencent.mm.plugin.appbrand.d7 d7Var, u65.a aVar, long j17) {
        this.f77996f = d7Var;
        this.f77994d = aVar;
        this.f77995e = j17;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.tencent.mm.plugin.appbrand.d7 d7Var = this.f77996f;
        d7Var.f77568b.f74810s.removeOnLayoutChangeListener(this);
        if (this.f77994d.b()) {
            com.tencent.mm.plugin.appbrand.o6 o6Var = d7Var.f77568b;
            java.lang.String view2 = view.toString();
            d7Var.getClass();
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            o6Var.K("ContentView first laid out %s, %s complete cost:%d", view2, "GameWaitForFirstViewLayout", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - this.f77995e));
        }
    }
}
