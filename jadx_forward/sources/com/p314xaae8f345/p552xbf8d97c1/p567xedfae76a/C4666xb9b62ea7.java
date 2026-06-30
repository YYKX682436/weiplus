package com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ \u0010\u0006\u001a\u00020\u0004*\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0006\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0004J\b\u0010\u0010\u001a\u00020\u0004H\u0004R\u0016\u0010\u0012\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lcom/tencent/matrix/lifecycle/StatefulOwner;", "Lcom/tencent/matrix/lifecycle/IStatefulOwner;", "Lkotlin/Function1;", "Lcom/tencent/matrix/lifecycle/k;", "Ljz5/f0;", "observer", "invokeAsync", "dispatchStateChanged", "", "active", "observeForever", "Landroidx/lifecycle/y;", "lifecycleOwner", "observeWithLifecycle", "removeObserver", "turnOn", "turnOff", "Lcom/tencent/matrix/lifecycle/x0;", "state", "Lcom/tencent/matrix/lifecycle/x0;", "Ljava/util/concurrent/ConcurrentHashMap;", "Lcom/tencent/matrix/lifecycle/r0;", "observerMap", "Ljava/util/concurrent/ConcurrentHashMap;", "async", "Z", "getAsync", "()Z", "<init>", "(Z)V", "matrix-android-lib_release"}, k = 1, mv = {1, 4, 2})
/* renamed from: com.tencent.matrix.lifecycle.StatefulOwner */
/* loaded from: classes12.dex */
public class C4666xb9b62ea7 implements com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe {
    private final boolean async;
    private final java.util.concurrent.ConcurrentHashMap<com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.r0> observerMap;
    private volatile com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.x0 state;

    public C4666xb9b62ea7() {
        this(false, 1, null);
    }

    /* renamed from: dispatchStateChanged */
    private final void m40989x1bced27d() {
        if (!this.async) {
            for (java.util.Map.Entry<com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.r0> entry : this.observerMap.entrySet()) {
                yz5.l lVar = this.state.f134441d;
                if (lVar != null) {
                }
            }
            return;
        }
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.x0 x0Var = this.state;
        for (java.util.Map.Entry<com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.r0> entry2 : this.observerMap.entrySet()) {
            yz5.l lVar2 = x0Var.f134441d;
            if (lVar2 != null) {
                m40990x37e7d8e4(lVar2, entry2.getKey());
            }
        }
    }

    /* renamed from: invokeAsync */
    private final void m40990x37e7d8e4(yz5.l lVar, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k kVar) {
        if ((kVar instanceof com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.j) && ((com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.j) kVar).mo40995xca01fdf4()) {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.q0.f134318f.a().post(new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.y0(lVar, kVar));
        } else {
            com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.p pVar = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.q0.f134313a;
            ((java.util.concurrent.Executor) com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.q0.f134316d.mo141623x754a37bb()).execute(new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.z0(lVar, kVar));
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.l
    /* renamed from: active */
    public boolean mo40960xab2f7f06() {
        return this.state == com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.x0.ON;
    }

    public final boolean getAsync() {
        return this.async;
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe
    /* renamed from: observeForever */
    public synchronized void mo40966xc74540ab(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.r0 r0Var = this.observerMap.get(observer);
        if (r0Var == null) {
            this.observerMap.put(observer, new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.r0(observer, this));
            if (this.async) {
                yz5.l lVar = this.state.f134441d;
                if (lVar != null) {
                    m40990x37e7d8e4(lVar, observer);
                }
            } else {
                yz5.l lVar2 = this.state.f134441d;
                if (lVar2 != null) {
                }
            }
        } else if (r0Var instanceof com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4659xab1fd685) {
            throw new java.lang.IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe
    /* renamed from: observeWithLifecycle */
    public synchronized void mo40967x96d2e188(p012xc85e97e9.p093xedfae76a.y lifecycleOwner, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.r0 r0Var = this.observerMap.get(observer);
        if (r0Var == null) {
            this.observerMap.put(observer, new com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.C4659xab1fd685(lifecycleOwner, this, observer));
            if (this.async) {
                yz5.l lVar = this.state.f134441d;
                if (lVar != null) {
                    m40990x37e7d8e4(lVar, observer);
                }
            } else {
                yz5.l lVar2 = this.state.f134441d;
                if (lVar2 != null) {
                }
            }
        } else if (r0Var.a(lifecycleOwner)) {
            throw new java.lang.IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
    }

    @Override // com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe
    /* renamed from: removeObserver */
    public synchronized void mo40970xb5bdeb7a(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        this.observerMap.remove(observer);
    }

    /* renamed from: turnOff */
    public final synchronized void m40992xc67387b2() {
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.x0 x0Var = this.state;
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.x0 x0Var2 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.x0.OFF;
        if (x0Var == x0Var2) {
            return;
        }
        this.state = x0Var2;
        m40989x1bced27d();
    }

    /* renamed from: turnOn */
    public final synchronized void m40993xcc985f3c() {
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.x0 x0Var = this.state;
        com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.x0 x0Var2 = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.x0.ON;
        if (x0Var == x0Var2) {
            return;
        }
        this.state = x0Var2;
        m40989x1bced27d();
    }

    public C4666xb9b62ea7(boolean z17) {
        this.async = z17;
        this.state = com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.x0.INIT;
        this.observerMap = new java.util.concurrent.ConcurrentHashMap<>();
    }

    public /* synthetic */ C4666xb9b62ea7(boolean z17, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? true : z17);
    }
}
