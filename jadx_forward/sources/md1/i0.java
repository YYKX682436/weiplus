package md1;

/* loaded from: classes7.dex */
public class i0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f407277a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ md1.n0 f407278b;

    public i0(md1.n0 n0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var) {
        this.f407278b = n0Var;
        this.f407277a = c0Var;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1328xe6a90d55.p1329xee789c1d.p1330x7643c6b5.b
    public void a(int i17, int i18, java.lang.String str, java.lang.Object obj) {
        java.util.ArrayList arrayList = (java.util.ArrayList) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.JsApiJoin1v1VoIPChat", "hy: on room member changed! %s", arrayList);
        md1.n0 n0Var = this.f407278b;
        if (arrayList != null) {
            n0Var.f407334x = java.lang.Math.max(n0Var.f407334x, arrayList.size());
        }
        java.util.Map H = n0Var.H(arrayList);
        ((java.util.HashMap) H).put("errCode", 0);
        md1.d1 d1Var = n0Var.f407323m;
        d1Var.u(this.f407277a);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenVoice.onVoIPChatMembersChangedJsEvent", "hy: dispatch member change");
        d1Var.t(H);
        d1Var.m();
    }
}
