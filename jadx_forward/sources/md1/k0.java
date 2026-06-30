package md1;

/* loaded from: classes7.dex */
public class k0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f407289a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ md1.n0 f407290b;

    public k0(md1.n0 n0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var) {
        this.f407290b = n0Var;
        this.f407289a = c0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "hy: on talk member changed! %s", arrayList);
        md1.n0 n0Var = this.f407290b;
        java.util.Map H = n0Var.H(arrayList);
        ((java.util.HashMap) H).put("errCode", 0);
        md1.e1 e1Var = n0Var.f407325o;
        e1Var.u(this.f407289a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.onVoIPChatMembersChangedJsEvent", "hy: speaker changed.");
        e1Var.t(H);
        e1Var.m();
    }
}
