package hd1;

/* loaded from: classes7.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hd1.w f361953d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f361954e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f361955f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f361956g;

    public r(hd1.w wVar, yz5.l lVar, java.lang.String str, int i17) {
        this.f361953d = wVar;
        this.f361954e = lVar;
        this.f361955f = str;
        this.f361956g = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z17;
        android.nfc.tech.TagTechnology tagTechnology;
        java.lang.Object obj;
        hd1.w wVar = this.f361953d;
        android.nfc.Tag a17 = hd1.w.a(wVar);
        yz5.l lVar = this.f361954e;
        if (a17 == null) {
            lVar.mo146xb9724478(new hd1.x(13013, "NFC tag has not been discovered"));
        }
        if (a17 == null) {
            return;
        }
        id1.d.f371992h.getClass();
        id1.d dVar = (id1.d) id1.d.f371993i.get(this.f361955f);
        if (dVar == null) {
            lVar.mo146xb9724478(new hd1.x(13014, "invalid tech"));
        }
        if (dVar == null) {
            return;
        }
        java.lang.Class[] clsArr = {java.lang.Integer.TYPE};
        id1.c cVar = new id1.c("setTimeout", clsArr);
        android.util.ArrayMap arrayMap = dVar.f372005g;
        java.lang.Boolean bool = (java.lang.Boolean) arrayMap.get(cVar);
        java.lang.String str = dVar.f372003e;
        if (bool == null) {
            try {
                java.lang.Class.forName(str).getDeclaredMethod("setTimeout", (java.lang.Class[]) java.util.Arrays.copyOf(clsArr, 1));
                z17 = true;
            } catch (java.lang.Exception e17) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get ");
                sb6.append(str);
                sb6.append(".setTimeout(");
                java.lang.String arrays = java.util.Arrays.toString(clsArr);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(arrays, "toString(...)");
                sb6.append(arrays);
                sb6.append(") failed since ");
                sb6.append(e17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.NFCTech", sb6.toString());
                z17 = false;
            }
            bool = java.lang.Boolean.valueOf(z17);
            arrayMap.put(cVar, java.lang.Boolean.valueOf(bool.booleanValue()));
        }
        if (!bool.booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.NFCReadWriteManager", "setTimeout, " + dVar.f372002d + ".setTimeout is not supported");
            lVar.mo146xb9724478(new hd1.x(13024, "function not support"));
            return;
        }
        try {
            obj = d56.b.i(str).b("get", a17).f308165b;
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
            d56.b.h(tagTechnology).b("setTimeout", java.lang.Integer.valueOf(this.f361956g));
            lVar.mo146xb9724478(new hd1.y(jz5.f0.f384359a));
        } catch (java.lang.Exception e18) {
            java.lang.Throwable b17 = hd1.w.b(wVar, e18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AppBrand.NFCReadWriteManager", "setTimeout failed since " + b17);
            java.lang.StringBuilder sb7 = new java.lang.StringBuilder("system internal error: ");
            sb7.append(b17 != null ? b17.getMessage() : null);
            lVar.mo146xb9724478(new hd1.x(13017, sb7.toString()));
        }
    }
}
