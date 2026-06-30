package md1;

/* loaded from: classes7.dex */
public class n implements com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f407302a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ md1.s f407303b;

    public n(md1.s sVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var) {
        this.f407303b = sVar;
        this.f407302a = c0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat", "hy: on room member changed! %s", arrayList);
        md1.s sVar = this.f407303b;
        if (arrayList != null) {
            sVar.f407334x = java.lang.Math.max(sVar.f407334x, arrayList.size());
        }
        java.util.Map H = sVar.H(arrayList);
        ((java.util.HashMap) H).put("errCode", 0);
        md1.d1 d1Var = sVar.f407323m;
        d1Var.u(this.f407302a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.onVoIPChatMembersChangedJsEvent", "hy: dispatch member change");
        d1Var.t(H);
        d1Var.m();
    }
}
