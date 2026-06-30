package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class z4 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sh1.f f67055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f67056e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(sh1.f fVar, int i17) {
        super(2);
        this.f67055d = fVar;
        this.f67056e = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String event = (java.lang.String) obj;
        java.lang.String params = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(event, "event");
        kotlin.jvm.internal.o.g(params, "params");
        this.f67055d.a(this.f67056e, event, params);
        return jz5.f0.f302826a;
    }
}
