package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd;

/* loaded from: classes9.dex */
public final class q0 implements a75.a {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.Map f281265a;

    public q0(com.p314xaae8f345.mm.p2621x8fb0427b.f9 msgInfo, android.view.View itemView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msgInfo, "msgInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f281265a = kz5.c1.l(new jz5.l(msgInfo, itemView));
    }

    @Override // a75.a
    /* renamed from: getKey */
    public java.lang.String get_key() {
        return "RecordEvent";
    }

    @Override // a75.a
    /* renamed from: mergeEvent */
    public a75.a mo787xbd89c142(a75.a newEvent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newEvent, "newEvent");
        if (newEvent instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q0) {
            this.f281265a.putAll(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.q0) newEvent).f281265a);
        }
        return this;
    }
}
