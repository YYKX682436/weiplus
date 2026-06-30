package v73;

/* loaded from: classes8.dex */
public class m1 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r73.b f515246a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16106x38110247 f515247b;

    public m1(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16106x38110247 activityC16106x38110247, r73.b bVar) {
        this.f515247b = activityC16106x38110247;
        this.f515246a = bVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r73.b bVar = this.f515246a;
        try {
            r45.tw4 tw4Var = bVar.f474697r.f451161o;
            java.lang.String encodeToString = tw4Var != null ? android.util.Base64.encodeToString(tw4Var.mo14344x5f01b1f6(), 2) : "";
            com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16106x38110247 activityC16106x38110247 = this.f515247b;
            r45.a10 a10Var = bVar.f474697r;
            com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16106x38110247.V6(activityC16106x38110247, a10Var.f451156g, a10Var.f451155f, a10Var.f451157h, a10Var.f451158i, bVar.f474698s, a10Var.f451159m, a10Var.f451160n, encodeToString);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.HoneyPaySelectCardTypeUI", e17, "", new java.lang.Object[0]);
        }
    }
}
