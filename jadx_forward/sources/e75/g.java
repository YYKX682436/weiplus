package e75;

/* loaded from: classes12.dex */
public abstract class g {

    /* renamed from: Companion */
    public static final e75.b f69657x233c02ec = new e75.b(null);

    /* renamed from: DefaultThread */
    public static final java.lang.String f69658x6ab58b8b = "%DefaultThread%";

    /* renamed from: MainThread */
    public static final java.lang.String f69659x9393ed43 = "%MainThread%";

    /* renamed from: observerMap */
    private final java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.p314xaae8f345.mm.sdk.p2602x14c752d6.C20988xba34acb1> f69660x781e2a6 = new java.util.concurrent.ConcurrentHashMap<>(1);

    /* renamed from: createLifecycleBoundObserver$default */
    public static /* synthetic */ com.p314xaae8f345.mm.sdk.p2602x14c752d6.C20988xba34acb1 m127120xe4f85ee3(e75.g gVar, p012xc85e97e9.p093xedfae76a.y yVar, e75.a aVar, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createLifecycleBoundObserver");
        }
        if ((i17 & 4) != 0) {
            str = null;
        }
        return gVar.m127121xb7d2df46(yVar, aVar, str);
    }

    /* renamed from: createLifecycleBoundObserver */
    public com.p314xaae8f345.mm.sdk.p2602x14c752d6.C20988xba34acb1 m127121xb7d2df46(p012xc85e97e9.p093xedfae76a.y owner, e75.a observer, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(owner, "owner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        return new com.p314xaae8f345.mm.sdk.p2602x14c752d6.C20988xba34acb1(this, owner, observer, str);
    }

    /* renamed from: getLogTag */
    public abstract java.lang.String mo42857x23aed0ac();

    /* renamed from: hasObserver */
    public boolean m127122xc01c0f90() {
        boolean z17;
        synchronized (this.f69660x781e2a6) {
            z17 = !this.f69660x781e2a6.isEmpty();
        }
        return z17;
    }

    /* renamed from: notify */
    public void mo127123xc2079749(java.lang.Object event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        mo127124xc2079749(kz5.b0.c(event));
    }

    /* renamed from: notifyAny */
    public void m127125x715f39e3(java.lang.Object event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        mo127123xc2079749(event);
    }

    /* renamed from: observe */
    public void m127126x9d92d11c(p012xc85e97e9.p093xedfae76a.y lifecycleOwner, e75.a observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        synchronized (this.f69660x781e2a6) {
            com.p314xaae8f345.mm.sdk.p2602x14c752d6.C20988xba34acb1 c20988xba34acb1 = this.f69660x781e2a6.get(java.lang.Integer.valueOf(observer.hashCode()));
            if (c20988xba34acb1 != null) {
                p012xc85e97e9.p093xedfae76a.y yVar = c20988xba34acb1.f273938d;
                if (!(!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(yVar, lifecycleOwner))) {
                    yVar = null;
                }
                if (yVar != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(mo42857x23aed0ac(), "Cannot add the same observer with different lifecycles");
                    return;
                } else {
                    com.p314xaae8f345.mm.sdk.p2602x14c752d6.C20988xba34acb1 remove = this.f69660x781e2a6.remove(java.lang.Integer.valueOf(observer.hashCode()));
                    if (remove != null) {
                        d75.b.g(new e75.d(remove));
                    }
                }
            }
            com.p314xaae8f345.mm.sdk.p2602x14c752d6.C20988xba34acb1 m127120xe4f85ee3 = m127120xe4f85ee3(this, lifecycleOwner, observer, null, 4, null);
            d75.b.g(new e75.c(m127120xe4f85ee3, m127120xe4f85ee3.f273941g));
            this.f69660x781e2a6.put(java.lang.Integer.valueOf(observer.hashCode()), m127120xe4f85ee3);
            mo42857x23aed0ac();
            observer.hashCode();
        }
    }

    /* renamed from: removeObserver */
    public void mo127128xb5bdeb7a(e75.a observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        synchronized (this.f69660x781e2a6) {
            com.p314xaae8f345.mm.sdk.p2602x14c752d6.C20988xba34acb1 remove = this.f69660x781e2a6.remove(java.lang.Integer.valueOf(observer.hashCode()));
            if (remove != null) {
                d75.b.g(new e75.d(remove));
                mo42857x23aed0ac();
                observer.hashCode();
            }
        }
    }

    /* renamed from: uiObserve */
    public void m127129x5f6d8be8(p012xc85e97e9.p093xedfae76a.y lifecycleOwner, e75.a observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        m127127x9d92d11c(lifecycleOwner, f69659x9393ed43, observer);
    }

    /* renamed from: notify */
    public void mo127124xc2079749(java.util.List<java.lang.Object> eventList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventList, "eventList");
        try {
            if ((!this.f69660x781e2a6.isEmpty()) && (!eventList.isEmpty())) {
                java.util.concurrent.ConcurrentHashMap<java.lang.Integer, com.p314xaae8f345.mm.sdk.p2602x14c752d6.C20988xba34acb1> concurrentHashMap = this.f69660x781e2a6;
                java.util.ArrayList arrayList = new java.util.ArrayList(concurrentHashMap.size());
                java.util.Iterator<java.util.Map.Entry<java.lang.Integer, com.p314xaae8f345.mm.sdk.p2602x14c752d6.C20988xba34acb1>> it = concurrentHashMap.entrySet().iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                java.util.Iterator it6 = arrayList.iterator();
                while (it6.hasNext()) {
                    ((com.p314xaae8f345.mm.sdk.p2602x14c752d6.C20988xba34acb1) ((java.util.Map.Entry) it6.next()).getValue()).a(eventList);
                }
                mo42857x23aed0ac();
                arrayList.size();
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(mo42857x23aed0ac(), e17, "doNotify", new java.lang.Object[0]);
        }
    }

    /* renamed from: observe */
    public void m127127x9d92d11c(p012xc85e97e9.p093xedfae76a.y lifecycleOwner, java.lang.String threadTag, e75.a observer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(threadTag, "threadTag");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
        synchronized (this.f69660x781e2a6) {
            com.p314xaae8f345.mm.sdk.p2602x14c752d6.C20988xba34acb1 c20988xba34acb1 = this.f69660x781e2a6.get(java.lang.Integer.valueOf(observer.hashCode()));
            if (c20988xba34acb1 != null) {
                p012xc85e97e9.p093xedfae76a.y yVar = c20988xba34acb1.f273938d;
                if (!(!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(yVar, lifecycleOwner))) {
                    yVar = null;
                }
                if (yVar != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(mo42857x23aed0ac(), "Cannot add the same observer with different lifecycles");
                    return;
                } else {
                    com.p314xaae8f345.mm.sdk.p2602x14c752d6.C20988xba34acb1 remove = this.f69660x781e2a6.remove(java.lang.Integer.valueOf(observer.hashCode()));
                    if (remove != null) {
                        d75.b.g(new e75.d(remove));
                    }
                }
            }
            com.p314xaae8f345.mm.sdk.p2602x14c752d6.C20988xba34acb1 m127121xb7d2df46 = m127121xb7d2df46(lifecycleOwner, observer, threadTag);
            d75.b.g(new e75.c(m127121xb7d2df46, m127121xb7d2df46.f273941g));
            this.f69660x781e2a6.put(java.lang.Integer.valueOf(observer.hashCode()), m127121xb7d2df46);
            mo42857x23aed0ac();
            observer.hashCode();
        }
    }
}
