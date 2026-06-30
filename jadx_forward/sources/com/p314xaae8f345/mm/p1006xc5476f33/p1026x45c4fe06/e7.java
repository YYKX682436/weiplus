package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class e7 implements android.view.View.OnLayoutChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u65.a f159527d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f159528e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.d7 f159529f;

    public e7(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.d7 d7Var, u65.a aVar, long j17) {
        this.f159529f = d7Var;
        this.f159527d = aVar;
        this.f159528e = j17;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(android.view.View view, int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.d7 d7Var = this.f159529f;
        d7Var.f159101b.f156343s.removeOnLayoutChangeListener(this);
        if (this.f159527d.b()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 o6Var = d7Var.f159101b;
            java.lang.String view2 = view.toString();
            d7Var.getClass();
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            o6Var.K("ContentView first laid out %s, %s complete cost:%d", view2, "GameWaitForFirstViewLayout", java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - this.f159528e));
        }
    }
}
