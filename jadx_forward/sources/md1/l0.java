package md1;

/* loaded from: classes7.dex */
public class l0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f407295a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ md1.n0 f407296b;

    public l0(md1.n0 n0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var) {
        this.f407296b = n0Var;
        this.f407295a = c0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        java.util.Map map = (java.util.Map) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "on event callback!");
        map.put("errCode", 0);
        md1.f1 f1Var = this.f407296b.f407326p;
        f1Var.u(this.f407295a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.onVoIPChatStateChangedJsEvent", "hy: event callback");
        f1Var.t(map);
        f1Var.m();
    }
}
