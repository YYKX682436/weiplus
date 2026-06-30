package hd1;

/* loaded from: classes7.dex */
public final class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hd1.w f361943d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f361944e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361945f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361946g;

    public o(hd1.w wVar, yz5.l lVar, java.lang.String str, java.lang.String str2, id1.a aVar) {
        this.f361943d = wVar;
        this.f361944e = lVar;
        this.f361945f = str;
        this.f361946g = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.nfc.Tag a17 = hd1.w.a(this.f361943d);
        yz5.l lVar = this.f361944e;
        if (a17 == null) {
            lVar.mo146xb9724478(new hd1.x(13013, "NFC tag has not been discovered"));
        }
        if (a17 == null) {
            return;
        }
        id1.d.f371992h.getClass();
        id1.d dVar = (id1.d) id1.d.f371993i.get(this.f361945f);
        if (dVar == null) {
            lVar.mo146xb9724478(new hd1.x(13014, "invalid tech"));
        }
        if (dVar == null) {
            return;
        }
        hd1.e eVar = dVar.f372004f;
        if (eVar == null) {
            lVar.mo146xb9724478(new hd1.x(13024, "function not support"));
        } else {
            eVar.a(a17, this.f361946g, null, lVar);
        }
    }
}
