package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420;

/* loaded from: classes12.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f134240d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(android.app.Activity activity) {
        super(1);
        this.f134240d = activity;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.WeakHashMap receiver = (java.util.WeakHashMap) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(receiver, "$receiver");
        receiver.remove(this.f134240d);
        if (receiver.isEmpty()) {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4661x636abfbb interfaceC4661x636abfbb = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.f0.f134264m;
            if (interfaceC4661x636abfbb == null) {
                throw new java.lang.NullPointerException("null cannot be cast to non-null type com.tencent.matrix.lifecycle.owners.ProcessUILifecycleOwner.AsyncOwner");
            }
            ((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p568xc42a6420.C4676xc0db27ef) interfaceC4661x636abfbb).m41056xdb3189ea();
        }
        return jz5.f0.f384359a;
    }
}
