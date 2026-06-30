package hd1;

/* loaded from: classes7.dex */
public final class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hd1.w f361940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f361941e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361942f;

    public n(hd1.w wVar, yz5.l lVar, java.lang.String str) {
        this.f361940d = wVar;
        this.f361941e = lVar;
        this.f361942f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.nfc.tech.TagTechnology tagTechnology;
        java.lang.Object obj;
        hd1.w wVar = this.f361940d;
        android.nfc.Tag a17 = hd1.w.a(wVar);
        yz5.l lVar = this.f361941e;
        if (a17 == null) {
            lVar.mo146xb9724478(new hd1.x(13013, "NFC tag has not been discovered"));
        }
        if (a17 == null) {
            return;
        }
        id1.d.f371992h.getClass();
        id1.d dVar = (id1.d) id1.d.f371993i.get(this.f361942f);
        if (dVar == null) {
            lVar.mo146xb9724478(new hd1.x(13014, "invalid tech"));
        }
        if (dVar == null) {
            return;
        }
        hd1.d dVar2 = wVar.f361972b;
        if (((hd1.b) dVar2).f361920c.contains(dVar)) {
            lVar.mo146xb9724478(new hd1.x(13022, "Tech already connected"));
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
            tagTechnology.connect();
            ((hd1.b) dVar2).f361920c.add(dVar);
            lVar.mo146xb9724478(new hd1.y(jz5.f0.f384359a));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.NFCReadWriteManager", "connect failed since " + e17);
            lVar.mo146xb9724478(new hd1.x(13017, "system internal error: " + e17.getMessage()));
        }
    }
}
