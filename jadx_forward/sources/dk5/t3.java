package dk5;

/* loaded from: classes9.dex */
public class t3 implements com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ot0.q f316447a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 f316448b;

    public t3(com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93, ot0.q qVar) {
        this.f316448b = activityC22571x51759e93;
        this.f316447a = qVar;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i
    public void a() {
        ot0.q qVar = this.f316447a;
        int i17 = qVar.f430199i;
        if (i17 == 92 || i17 == 76) {
            return;
        }
        java.lang.String wi6 = ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).wi(qVar.f430207k, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
        java.lang.String wi7 = ((kt.e) ((lt.m0) i95.n0.c(lt.m0.class))).wi(qVar.f430211l, com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7);
        com.p314xaae8f345.mm.ui.p2741x4c58d2b0.ActivityC22571x51759e93 activityC22571x51759e93 = this.f316448b;
        if (!com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40085xe877826c(activityC22571x51759e93.mo55332x76847179()) ? wi6 == null || wi6.length() <= 0 : wi7 != null && wi7.length() > 0) {
            wi6 = wi7;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", wi6);
        intent.putExtra("showShare", false);
        j45.l.j(activityC22571x51759e93.mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent, null);
    }
}
