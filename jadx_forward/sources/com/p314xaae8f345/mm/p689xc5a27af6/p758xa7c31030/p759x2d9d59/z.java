package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59;

/* loaded from: classes12.dex */
public final class z extends ph.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f149050b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f149051c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f149052d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f149053e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(yz5.l lVar, yz5.l lVar2, yz5.l lVar3, yz5.l lVar4) {
        super(true);
        this.f149050b = lVar;
        this.f149051c = lVar2;
        this.f149052d = lVar3;
        this.f149053e = lVar4;
    }

    @Override // ph.f, ph.g
    public boolean a(ph.c batteryState, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(batteryState, "batteryState");
        this.f149050b.mo146xb9724478(java.lang.Integer.valueOf(i17));
        this.f149051c.mo146xb9724478(java.lang.Boolean.valueOf(batteryState.d()));
        return !this.f435796a;
    }

    @Override // ph.f, ph.g
    public boolean c(ph.c batteryState, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(batteryState, "batteryState");
        this.f149052d.mo146xb9724478(java.lang.Integer.valueOf(i17));
        this.f149051c.mo146xb9724478(java.lang.Boolean.valueOf(batteryState.d()));
        return !this.f435796a;
    }

    @Override // ph.f, ph.g
    public boolean f(ph.c batteryState, java.lang.String event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(batteryState, "batteryState");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(event, wh.e1.a(context))) {
            this.f149053e.mo146xb9724478(java.lang.Boolean.valueOf(batteryState.c()));
        }
        this.f149051c.mo146xb9724478(java.lang.Boolean.valueOf(batteryState.d()));
        return super.f(batteryState, event);
    }
}
