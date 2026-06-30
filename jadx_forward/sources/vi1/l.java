package vi1;

/* loaded from: classes4.dex */
public final class l implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.r f518929a;

    public l(yz5.r rVar) {
        this.f518929a = rVar;
    }

    @Override // km5.e
    public final void a(java.lang.Object obj) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.FULL.CgiPhoneNumber", "getPhoneNumber fail");
        if (obj instanceof java.lang.Exception) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Luggage.FULL.CgiPhoneNumber", "CgiGetAllPhone " + ((java.lang.Exception) obj).getMessage());
        }
        yz5.r rVar = this.f518929a;
        if (rVar != null) {
            rVar.C(java.lang.Boolean.FALSE, "cgi fail", null, null);
        }
    }
}
