package com.tencent.mm.feature.performance.adpf;

/* loaded from: classes12.dex */
public final class z extends ph.f {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f67517b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f67518c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f67519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f67520e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(yz5.l lVar, yz5.l lVar2, yz5.l lVar3, yz5.l lVar4) {
        super(true);
        this.f67517b = lVar;
        this.f67518c = lVar2;
        this.f67519d = lVar3;
        this.f67520e = lVar4;
    }

    @Override // ph.f, ph.g
    public boolean a(ph.c batteryState, int i17) {
        kotlin.jvm.internal.o.g(batteryState, "batteryState");
        this.f67517b.invoke(java.lang.Integer.valueOf(i17));
        this.f67518c.invoke(java.lang.Boolean.valueOf(batteryState.d()));
        return !this.f354263a;
    }

    @Override // ph.f, ph.g
    public boolean c(ph.c batteryState, int i17) {
        kotlin.jvm.internal.o.g(batteryState, "batteryState");
        this.f67519d.invoke(java.lang.Integer.valueOf(i17));
        this.f67518c.invoke(java.lang.Boolean.valueOf(batteryState.d()));
        return !this.f354263a;
    }

    @Override // ph.f, ph.g
    public boolean f(ph.c batteryState, java.lang.String event) {
        kotlin.jvm.internal.o.g(batteryState, "batteryState");
        kotlin.jvm.internal.o.g(event, "event");
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (kotlin.jvm.internal.o.b(event, wh.e1.a(context))) {
            this.f67520e.invoke(java.lang.Boolean.valueOf(batteryState.c()));
        }
        this.f67518c.invoke(java.lang.Boolean.valueOf(batteryState.d()));
        return super.f(batteryState, event);
    }
}
