package hd1;

/* loaded from: classes7.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hd1.w f361947d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f361948e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361949f;

    public p(hd1.w wVar, yz5.l lVar, java.lang.String str) {
        this.f361947d = wVar;
        this.f361948e = lVar;
        this.f361949f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.nfc.tech.TagTechnology tagTechnology;
        java.lang.Object obj;
        hd1.w wVar = this.f361947d;
        android.nfc.Tag a17 = hd1.w.a(wVar);
        yz5.l lVar = this.f361948e;
        if (a17 == null) {
            lVar.mo146xb9724478(new hd1.x(13013, "NFC tag has not been discovered"));
        }
        if (a17 == null) {
            return;
        }
        id1.d.f371992h.getClass();
        id1.d dVar = (id1.d) id1.d.f371993i.get(this.f361949f);
        if (dVar == null) {
            lVar.mo146xb9724478(new hd1.x(13014, "invalid tech"));
        }
        if (dVar == null) {
            return;
        }
        if (id1.d.f372000s == dVar) {
            lVar.mo146xb9724478(new hd1.x(13024, "function not support"));
            return;
        }
        try {
            obj = d56.b.i(dVar.f372003e).b("get", a17).f308165b;
        } catch (java.lang.Exception unused) {
            lVar.mo146xb9724478(new hd1.x(13015, "unavailable tech"));
            tagTechnology = null;
        }
        if (obj == null) {
            throw new java.lang.IllegalArgumentException("Required value was null.".toString());
        }
        tagTechnology = (android.nfc.tech.TagTechnology) obj;
        if (tagTechnology == null) {
            return;
        }
        try {
            java.lang.Integer num = (java.lang.Integer) d56.b.h(tagTechnology).b("getMaxTransceiveLength", new java.lang.Object[0]).f308165b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
            lVar.mo146xb9724478(new hd1.y(num));
        } catch (java.lang.Exception e17) {
            java.lang.Throwable b17 = hd1.w.b(wVar, e17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.NFCReadWriteManager", "getMaxTransceiveLength failed since " + b17);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("system internal error: ");
            sb6.append(b17 != null ? b17.getMessage() : null);
            lVar.mo146xb9724478(new hd1.x(13017, sb6.toString()));
        }
    }
}
