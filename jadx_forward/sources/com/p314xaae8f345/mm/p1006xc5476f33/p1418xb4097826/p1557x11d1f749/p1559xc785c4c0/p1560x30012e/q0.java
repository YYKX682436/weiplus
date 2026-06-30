package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1557x11d1f749.p1559xc785c4c0.p1560x30012e;

/* loaded from: classes10.dex */
public final class q0 implements p012xc85e97e9.p093xedfae76a.y {

    /* renamed from: d, reason: collision with root package name */
    public boolean f202524d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f202525e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f202527g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f202529i;

    /* renamed from: f, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.b0 f202526f = new p012xc85e97e9.p093xedfae76a.b0(this, true);

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f202528h = new java.util.ArrayList();

    public final synchronized void a(yz5.a event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (this.f202527g) {
            event.mo152xb9724478();
        } else {
            ((java.util.ArrayList) this.f202528h).add(event);
        }
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return this.f202526f;
    }
}
