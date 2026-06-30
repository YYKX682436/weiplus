package hd1;

/* loaded from: classes7.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hd1.w f361950d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f361951e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361952f;

    public q(hd1.w wVar, yz5.l lVar, java.lang.String str) {
        this.f361950d = wVar;
        this.f361951e = lVar;
        this.f361952f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.nfc.tech.TagTechnology tagTechnology;
        java.lang.Object obj;
        android.nfc.Tag a17 = hd1.w.a(this.f361950d);
        yz5.l lVar = this.f361951e;
        if (a17 == null) {
            lVar.mo146xb9724478(new hd1.x(13013, "NFC tag has not been discovered"));
        }
        if (a17 == null) {
            return;
        }
        id1.d.f371992h.getClass();
        id1.d dVar = (id1.d) id1.d.f371993i.get(this.f361952f);
        if (dVar == null) {
            lVar.mo146xb9724478(new hd1.x(13014, "invalid tech"));
        }
        if (dVar == null) {
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
            lVar.mo146xb9724478(new hd1.y(java.lang.Boolean.valueOf(tagTechnology.isConnected())));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.NFCReadWriteManager", "check isConnected failed since " + e17);
            lVar.mo146xb9724478(new hd1.x(13017, "system internal error: " + e17.getMessage()));
        }
    }
}
