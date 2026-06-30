package com.tencent.mm.plugin.appbrand.menu;

/* loaded from: classes7.dex */
public class h0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicBoolean f85956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f85957e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.t9 f85958f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f85959g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f85960h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f85961i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f85962m;

    public h0(com.tencent.mm.plugin.appbrand.menu.j0 j0Var, java.util.concurrent.atomic.AtomicBoolean atomicBoolean, android.content.Context context, com.tencent.mm.plugin.appbrand.t9 t9Var, int i17, int i18, int i19, boolean z17) {
        this.f85956d = atomicBoolean;
        this.f85957e = context;
        this.f85958f = t9Var;
        this.f85959g = i17;
        this.f85960h = i18;
        this.f85961i = i19;
        this.f85962m = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f85959g;
        android.content.Context context = this.f85957e;
        com.tencent.mm.plugin.appbrand.t9 t9Var = this.f85958f;
        boolean a17 = com.tencent.mm.plugin.appbrand.u9.a(context, t9Var, i17, false);
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f85956d;
        atomicBoolean.set(a17);
        if (atomicBoolean.get()) {
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(443L, 1L, 1L, false);
        }
        if (context == null || !atomicBoolean.get()) {
            return;
        }
        ae0.h hVar = (ae0.h) i95.n0.c(ae0.h.class);
        android.content.Context context2 = this.f85957e;
        int i18 = this.f85960h;
        int i19 = this.f85961i;
        boolean z17 = this.f85962m;
        java.lang.String str = t9Var.f88975d;
        ((zd0.e) hVar).getClass();
        xp1.d.h(context2, i18, i19, z17, str, true);
    }
}
