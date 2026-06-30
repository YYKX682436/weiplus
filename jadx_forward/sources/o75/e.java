package o75;

/* loaded from: classes11.dex */
public final class e extends e75.g implements a75.b {

    /* renamed from: a, reason: collision with root package name */
    public final jz5.g f425126a = jz5.h.b(new o75.d(this));

    @Override // e75.g
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void mo127123xc2079749(o75.c event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.p2601xd7508997.C20986xc7dbdd04 c20986xc7dbdd04 = (com.p314xaae8f345.mm.sdk.p2600x5c6729a.p2601xd7508997.C20986xc7dbdd04) ((jz5.n) this.f425126a).mo141623x754a37bb();
        c20986xc7dbdd04.getClass();
        c20986xc7dbdd04.a().mo50308x2936bf5f(c20986xc7dbdd04.a().mo50291x733c63a2(1, 1, 0, event));
    }

    @Override // e75.g
    /* renamed from: getLogTag */
    public java.lang.String mo42857x23aed0ac() {
        return "MicroMsg.Mvvm.StorageObserverOwner@" + hashCode();
    }

    @Override // a75.b
    /* renamed from: handleEvent */
    public void mo788x5797ad52(java.util.List eventList) {
        o75.c cVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventList, "eventList");
        if (eventList.size() == 1) {
            cVar = (o75.c) eventList.get(0);
        } else {
            if (com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1) {
                mo42857x23aed0ac();
                java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(eventList, 10));
                java.util.Iterator it = eventList.iterator();
                while (it.hasNext()) {
                    arrayList.add(((o75.c) it.next()).f425121b);
                }
                arrayList.toString();
            }
            o75.b bVar = o75.b.f425114b;
            o75.c cVar2 = new o75.c(o75.b.f425118f, "BATCH_PENDING_KEY", mo42857x23aed0ac());
            cVar2.f425124e = new java.util.HashMap();
            java.util.Iterator it6 = eventList.iterator();
            while (it6.hasNext()) {
                o75.c cVar3 = (o75.c) it6.next();
                java.util.HashMap hashMap = cVar2.f425124e;
                if (hashMap != null) {
                }
            }
            cVar = cVar2;
        }
        super.mo127124xc2079749(kz5.b0.c(cVar));
    }

    @Override // e75.g
    /* renamed from: notify */
    public void mo127124xc2079749(java.util.List eventList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventList, "eventList");
        o75.b bVar = o75.b.f425114b;
        o75.c cVar = new o75.c(o75.b.f425118f, "BATCH_PENDING_KEY", mo42857x23aed0ac());
        cVar.f425124e = new java.util.HashMap();
        java.util.Iterator it = eventList.iterator();
        while (it.hasNext()) {
            o75.c cVar2 = (o75.c) it.next();
            java.util.HashMap hashMap = cVar.f425124e;
            if (hashMap != null) {
            }
        }
        mo127123xc2079749(cVar);
    }
}
