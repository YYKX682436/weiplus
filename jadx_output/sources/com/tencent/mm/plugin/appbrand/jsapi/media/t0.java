package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.jsapi.l f82060a;

    /* renamed from: b, reason: collision with root package name */
    public final int f82061b;

    /* renamed from: c, reason: collision with root package name */
    public final int f82062c;

    /* renamed from: d, reason: collision with root package name */
    public final int f82063d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f82064e;

    /* renamed from: f, reason: collision with root package name */
    public final int f82065f;

    /* renamed from: g, reason: collision with root package name */
    public final int f82066g;

    public t0(com.tencent.mm.plugin.appbrand.jsapi.l mComponent, int i17, int i18, int i19, boolean z17, int i27, int i28) {
        kotlin.jvm.internal.o.g(mComponent, "mComponent");
        this.f82060a = mComponent;
        this.f82061b = i17;
        this.f82062c = i18;
        this.f82063d = i19;
        this.f82064e = z17;
        this.f82065f = java.lang.Math.min(java.lang.Math.max(i27, 1), 60);
        this.f82066g = java.lang.Math.min(java.lang.Math.max(i28, 1), 9);
    }

    public static final pq5.g a(com.tencent.mm.plugin.appbrand.jsapi.media.t0 t0Var) {
        t0Var.getClass();
        pq5.g h17 = pq5.h.a().h(new com.tencent.mm.plugin.appbrand.jsapi.media.d0(t0Var)).h(new com.tencent.mm.plugin.appbrand.jsapi.media.f0(t0Var));
        kotlin.jvm.internal.o.f(h17, "$ui(...)");
        return h17;
    }

    public static final pq5.g b(com.tencent.mm.plugin.appbrand.jsapi.media.t0 t0Var) {
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = t0Var.f82060a;
        if (!(com.tencent.mm.sdk.platformtools.t8.w(lVar.getContext()) > 200)) {
            dp.a.makeText(lVar.getContext(), lVar.getContext().getString(com.tencent.mm.R.string.f490079kb), 1).show();
        }
        kotlin.jvm.internal.c0 c0Var = new kotlin.jvm.internal.c0();
        c0Var.f310112d = true;
        pq5.g h17 = pq5.h.a().h(new com.tencent.mm.plugin.appbrand.jsapi.media.g0(c0Var, t0Var));
        h17.H(new com.tencent.mm.plugin.appbrand.jsapi.media.h0(t0Var, c0Var));
        pq5.g h18 = h17.h(new com.tencent.mm.plugin.appbrand.jsapi.media.k0(t0Var));
        kotlin.jvm.internal.o.f(h18, "$ui(...)");
        return h18;
    }
}
