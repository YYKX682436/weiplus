package h53;

/* loaded from: classes7.dex */
public class n implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h53.p f360595a;

    public n(h53.p pVar) {
        this.f360595a = pVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.s
    public void a(java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LuggageGameJsRuntimeImpl", "handleException, message : %s\n, stackTrace : %s", str, str2);
        java.lang.String format = java.lang.String.format("try {WxGameJsCoreBridge.invokeError(\"%s\");} catch(e) {console.log(e);}", u46.k.a("exception : " + str + " ; stack : " + str2));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LuggageGameJsRuntimeImpl", "handleException, js = %s", format);
        this.f360595a.mo32260x738236e6(format, null);
    }
}
