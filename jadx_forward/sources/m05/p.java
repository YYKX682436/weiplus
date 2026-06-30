package m05;

/* loaded from: classes9.dex */
public class p extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f404116d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f404117e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f404118f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f404116d = new java.util.HashMap();
        this.f404117e = new java.util.HashMap();
        this.f404118f = new java.util.HashMap();
    }

    public static /* synthetic */ void S6(m05.p pVar, m05.n nVar, java.lang.String str, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: triggerReport");
        }
        if ((i17 & 2) != 0) {
            str = "";
        }
        pVar.R6(nVar, str);
    }

    public final void O6(java.lang.String key, n05.a options) {
        wu5.b bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(options, "options");
        java.util.HashMap hashMap = this.f404117e;
        n05.a aVar = (n05.a) hashMap.get(key);
        if (aVar != null) {
            java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f404118f.get(aVar.f415460e.toString());
            if (weakReference != null && (bVar = (wu5.b) weakReference.get()) != null) {
                bVar.c(false);
            }
        }
        hashMap.put(key, options);
    }

    public final void P6(m05.n reportEvent, n05.a options) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reportEvent, "reportEvent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(options, "options");
        java.util.HashMap hashMap = this.f404116d;
        java.util.ArrayList arrayList = (java.util.ArrayList) hashMap.get(reportEvent);
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
            hashMap.put(reportEvent, arrayList);
        }
        arrayList.add(options);
    }

    public final void Q6(java.lang.String key) {
        wu5.b bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) this.f404118f.remove(key);
        if (weakReference == null || (bVar = (wu5.b) weakReference.get()) == null) {
            return;
        }
        bVar.c(false);
    }

    public final void R6(m05.n event, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        switch (event.ordinal()) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                java.util.ArrayList arrayList = (java.util.ArrayList) this.f404116d.get(event);
                if (arrayList == null) {
                    return;
                }
                pm0.v.b0(arrayList, new m05.o(event, this));
                return;
            case 6:
                if (str != null) {
                    java.util.HashMap hashMap = this.f404117e;
                    n05.a aVar = (n05.a) hashMap.get(str);
                    if (aVar == null) {
                        return;
                    }
                    ((nh0.i) ((ph0.i) i95.n0.c(ph0.i.class))).wi(aVar);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        S6(this, m05.n.f404110d, null, 2, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onFinished */
    public void mo13982x7cf2e371() {
        super.mo13982x7cf2e371();
        java.util.HashMap hashMap = this.f404118f;
        java.util.Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            wu5.b bVar = (wu5.b) ((java.lang.ref.WeakReference) ((java.util.Map.Entry) it.next()).getValue()).get();
            if (bVar != null) {
                bVar.c(false);
            }
        }
        hashMap.clear();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        java.util.HashMap hashMap = this.f404118f;
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            java.util.Objects.toString(((java.lang.ref.WeakReference) entry.getValue()).get());
            wu5.b bVar = (wu5.b) ((java.lang.ref.WeakReference) entry.getValue()).get();
            if (bVar != null) {
                bVar.c(false);
            }
        }
        hashMap.clear();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        S6(this, m05.n.f404112f, null, 2, null);
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        super.mo2286xb05099c3();
        S6(this, m05.n.f404111e, null, 2, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 fragment) {
        super(fragment);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        this.f404116d = new java.util.HashMap();
        this.f404117e = new java.util.HashMap();
        this.f404118f = new java.util.HashMap();
    }
}
