package com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59;

/* loaded from: classes12.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.k2 f148972a = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.k2();

    /* renamed from: b, reason: collision with root package name */
    public static final jz5.g f148973b = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.g2.f148955d);

    /* renamed from: c, reason: collision with root package name */
    public static final jz5.g f148974c = jz5.h.b(com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.i2.f148962d);

    public final com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f a(final java.lang.String stateName, final com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe statefulOwner) {
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f interfaceC10643xb9d7086f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stateName, "stateName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statefulOwner, "statefulOwner");
        synchronized (c()) {
            com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.k2 k2Var = f148972a;
            if (k2Var.c().containsKey(stateName)) {
                throw new java.lang.IllegalStateException("Already created: ".concat(stateName).toString());
            }
            interfaceC10643xb9d7086f = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f() { // from class: com.tencent.mm.feature.performance.adpf.IAdpfState$Companion$createCompositeState$1$1
                @Override // com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.l
                /* renamed from: active */
                public boolean mo40960xab2f7f06() {
                    return statefulOwner.mo40960xab2f7f06();
                }

                @Override // com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f
                /* renamed from: getName, reason: from getter */
                public java.lang.String getF28911xddfceb18() {
                    return stateName;
                }

                @Override // com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe
                /* renamed from: observeForever */
                public void mo40966xc74540ab(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k observer) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
                    statefulOwner.mo40966xc74540ab(observer);
                }

                @Override // com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe
                /* renamed from: observeWithLifecycle */
                public void mo40967x96d2e188(p012xc85e97e9.p093xedfae76a.y lifecycleOwner, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k observer) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleOwner, "lifecycleOwner");
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
                    statefulOwner.mo40967x96d2e188(lifecycleOwner, observer);
                }

                @Override // com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f, com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.InterfaceC4662x21f4acfe
                /* renamed from: removeObserver */
                public void mo40970xb5bdeb7a(com.p314xaae8f345.p552xbf8d97c1.p567xedfae76a.k observer) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(observer, "observer");
                    statefulOwner.mo40970xb5bdeb7a(observer);
                }
            };
            interfaceC10643xb9d7086f.mo40966xc74540ab(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.j2(interfaceC10643xb9d7086f));
            k2Var.c().put(stateName, interfaceC10643xb9d7086f);
        }
        return interfaceC10643xb9d7086f;
    }

    public final com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.IMutableAdpfState b(java.lang.String stateName) {
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.C10642x51390d8 c10642x51390d8;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stateName, "stateName");
        synchronized (c()) {
            com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.k2 k2Var = f148972a;
            if (k2Var.c().containsKey(stateName)) {
                throw new java.lang.IllegalStateException("Already created: ".concat(stateName).toString());
            }
            c10642x51390d8 = new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.C10642x51390d8(stateName);
            c10642x51390d8.mo40966xc74540ab(new com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.j2(c10642x51390d8));
            k2Var.c().put(stateName, c10642x51390d8);
        }
        return c10642x51390d8;
    }

    public final java.util.Map c() {
        return (java.util.Map) ((jz5.n) f148973b).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f.IMutableAdpfState d(java.lang.String stateName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stateName, "stateName");
        return e(stateName).m45071x8f8c4694();
    }

    public final com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f e(java.lang.String stateName) {
        com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f interfaceC10643xb9d7086f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stateName, "stateName");
        synchronized (c()) {
            java.lang.Object obj = f148972a.c().get(stateName);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
            interfaceC10643xb9d7086f = (com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.p759x2d9d59.InterfaceC10643xb9d7086f) obj;
        }
        return interfaceC10643xb9d7086f;
    }
}
