package hh1;

/* loaded from: classes.dex */
public final class b implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hh1.c f362986d;

    public b(hh1.c cVar) {
        this.f362986d = cVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        java.lang.String errMsg = (java.lang.String) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        hh1.c cVar = this.f362986d;
        if (intValue == 0) {
            cVar.s().mo146xb9724478(cVar.k());
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MBJsApiPostMessageToWeApp", "errCode: " + intValue + ", errMsg: " + errMsg);
            cVar.s().mo146xb9724478(cVar.j(lc3.x.f399469c, errMsg));
        }
        return jz5.f0.f384359a;
    }
}
