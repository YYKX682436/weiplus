package md1;

/* loaded from: classes7.dex */
public class p implements com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f407310a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ md1.s f407311b;

    public p(md1.s sVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var) {
        this.f407311b = sVar;
        this.f407310a = c0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: on talk member changed! %s", arrayList);
        md1.s sVar = this.f407311b;
        java.util.Map H = sVar.H(arrayList);
        ((java.util.HashMap) H).put("errCode", 0);
        md1.e1 e1Var = sVar.f407325o;
        e1Var.u(this.f407310a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.onVoIPChatMembersChangedJsEvent", "hy: speaker changed.");
        e1Var.t(H);
        e1Var.m();
    }
}
