package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes3.dex */
public final class z4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sh1.f f148588d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f148589e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(sh1.f fVar, int i17) {
        super(2);
        this.f148588d = fVar;
        this.f148589e = i17;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String event = (java.lang.String) obj;
        java.lang.String params = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(params, "params");
        this.f148588d.a(this.f148589e, event, params);
        return jz5.f0.f384359a;
    }
}
