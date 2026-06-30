package com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/magicbrush/jsapi/base/d;", "Lcom/tencent/mm/ipcinvoker/j;", "Lcom/tencent/mm/plugin/magicbrush/jsapi/base/RequestType;", "Lcom/tencent/mm/plugin/magicbrush/jsapi/base/CallbackType;", "<init>", "()V", "mb-jsapi_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
public abstract class d implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p794xb0fa9b5e.r f229580d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f229581e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f229582f;

    /* renamed from: g, reason: collision with root package name */
    public lc3.c0 f229583g;

    public final synchronized void a(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        if (this.f229581e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.SimpleMainProcessTask", "hy: task already released!");
            return;
        }
        this.f229581e = true;
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f229580d;
        if (rVar != null) {
            rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1.AbstractC16436x886bcd3f.FinalCallback(new com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10756x2a5d7b2d(data.toString())));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCallback");
            throw null;
        }
    }

    public final synchronized void b(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1833x2e06d1.C16422xf998446d event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.mm.p794xb0fa9b5e.r rVar = this.f229580d;
        if (rVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mCallback");
            throw null;
        }
        rVar.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1.AbstractC16436x886bcd3f.Event(event));
    }

    public abstract void c(lc3.a0 a0Var);

    public final lc3.a0 d(int i17, java.lang.String str) {
        lc3.c0 c0Var = this.f229583g;
        if (c0Var != null) {
            return c0Var.h(i17, str);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFakeJsApi");
        throw null;
    }

    public final lc3.a0 e() {
        lc3.c0 c0Var = this.f229583g;
        if (c0Var != null) {
            return c0Var.k();
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mFakeJsApi");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    public void mo8834xb9724478(java.lang.Object obj, com.p314xaae8f345.mm.p794xb0fa9b5e.r callback) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1.C16437xa7f6be49 data = (com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1838x60b7c31.p1839x2e06d1.C16437xa7f6be49) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.String value = data.f229577d.f149939d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value, "value");
        this.f229582f = value;
        java.lang.String value2 = data.f229578e.f149939d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(value2, "value");
        lc3.a0 a0Var = new lc3.a0(value2);
        this.f229580d = callback;
        this.f229583g = new fd3.d(this);
        c(a0Var);
    }
}
