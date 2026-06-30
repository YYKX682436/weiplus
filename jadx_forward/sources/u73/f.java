package u73;

/* loaded from: classes9.dex */
public class f implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u73.g f506656d;

    public f(u73.g gVar) {
        this.f506656d = gVar;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        u73.g gVar = this.f506656d;
        r45.wk4 wk4Var = (r45.wk4) gVar.f506658e.f456127d.get(i17);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(wk4Var.f470764f)) {
            return;
        }
        if (!wk4Var.f470764f.equals("weixin://wcpay/honeypay/unbind") || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(gVar.f506659f) || gVar.f506660g == null) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.V(gVar.f506657d, wk4Var.f470764f, false);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HoneyPayUtil", "go to unbind");
        android.content.Intent intent = new android.content.Intent(gVar.f506657d, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16100x8f3665d6.class);
        intent.putExtra("key_scene", 3);
        intent.putExtra("key_card_no", gVar.f506659f);
        try {
            intent.putExtra("key_toke_mess", gVar.f506660g.mo14344x5f01b1f6());
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.HoneyPayUtil", e17, "", new java.lang.Object[0]);
        }
        gVar.f506657d.startActivityForResult(intent, gVar.f506661h);
    }
}
