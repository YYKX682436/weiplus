package tj1;

/* loaded from: classes7.dex */
public final class h implements p000.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 f501228a;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 e9Var) {
        this.f501228a = e9Var;
    }

    public void a(android.os.Bundle bundle) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bundle, "bundle");
        java.lang.String translateLanguage = bundle.getString("newLanguageCode");
        java.lang.String string = bundle.getString(com.p314xaae8f345.p362xadfe2b3.p372x8fb0427b.C3712x3ed8a441.f14354xe2e3e984, "");
        boolean z17 = false;
        try {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
            i17 = java.lang.Integer.parseInt(string);
        } catch (java.lang.NumberFormatException unused) {
            i17 = 0;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandTranslateLogicWC", "sessionId:" + string + " newLanguageCode: " + translateLanguage + " type:" + i17);
        if (translateLanguage != null) {
            if (translateLanguage.length() > 0) {
                z17 = true;
            }
        }
        if (z17) {
            tj1.p pVar = new tj1.p();
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 service = this.f501228a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(translateLanguage, "translateLanguage");
            java.util.HashMap hashMap = new java.util.HashMap(1);
            hashMap.put("translateLanguage", translateLanguage);
            hashMap.put("type", java.lang.Integer.valueOf(i17));
            pVar.t(hashMap);
            pVar.u(service);
            pVar.m();
        }
    }
}
