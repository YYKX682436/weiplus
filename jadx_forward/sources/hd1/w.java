package hd1;

/* loaded from: classes7.dex */
public final class w {

    /* renamed from: c, reason: collision with root package name */
    public static final hd1.l f361968c = new hd1.l(null);

    /* renamed from: d, reason: collision with root package name */
    public static final java.util.Map f361969d = new java.util.concurrent.ConcurrentHashMap();

    /* renamed from: e, reason: collision with root package name */
    public static final hd1.j f361970e = new hd1.k();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f361971a;

    /* renamed from: b, reason: collision with root package name */
    public final hd1.d f361972b;

    public w(java.lang.String appId, hd1.d nfcDiscoverable) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nfcDiscoverable, "nfcDiscoverable");
        this.f361971a = appId;
        this.f361972b = nfcDiscoverable;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(appId, new hd1.i(this));
    }

    public static final android.nfc.Tag a(hd1.w wVar) {
        return ((hd1.h) wVar.f361972b).f361935i;
    }

    public static final java.lang.Throwable b(hd1.w wVar, java.lang.Throwable th6) {
        wVar.getClass();
        if (!(th6 instanceof d56.c)) {
            return th6;
        }
        java.lang.Throwable cause = th6.getCause();
        if (cause != null) {
            return cause.getCause();
        }
        return null;
    }

    public final void c(java.util.ArrayList filters) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filters, "filters");
        hd1.h hVar = (hd1.h) this.f361972b;
        hVar.getClass();
        if (filters.size() == 0) {
            return;
        }
        hVar.f361933g = 0;
        java.util.Iterator it = filters.iterator();
        while (it.hasNext()) {
            id1.d dVar = (id1.d) it.next();
            if (dVar == id1.d.f371995n) {
                hVar.f361933g |= 1;
            } else if (dVar == id1.d.f371996o) {
                hVar.f361933g |= 2;
            } else if (dVar == id1.d.f371998q) {
                hVar.f361933g |= 4;
            } else if (dVar == id1.d.f371999r) {
                hVar.f361933g |= 8;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.NFCDiscoverableReaderModeImpl", "setNFCFilters, unsupported %s", dVar.f372002d);
            }
        }
    }

    public final void d(android.nfc.NdefMessage message, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        message.toString();
        ((ku5.t0) ku5.t0.f394148d).h(new hd1.v(this, callback, message), "NFC-IO");
    }
}
