package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/BaseMusicMvUI;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mv.ui.BaseMusicMvUI */
/* loaded from: classes10.dex */
public abstract class AbstractActivityC16647x3a7d7dd1 extends com.p314xaae8f345.mm.p1006xc5476f33.p2050x75681b7b.ui.AbstractActivityC17353x8d7a560a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f232391d = "MicroMsg.Mv.BaseMusicMvUI";

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getForceOrientation */
    public int mo44431x663c095b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.Set<java.lang.Class<? extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9>> mo43419xa59964ef = super.mo43419xa59964ef();
        if (mo43419xa59964ef != null) {
            return kz5.q1.i(mo43419xa59964ef, kz5.o1.c(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16675x98ed1ad5.class));
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        r45.bt4 bt4Var;
        super.onCreate(bundle);
        ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Zi(this, new o04.e(r45.bt4.class, 7, true));
        r45.bt4 bt4Var2 = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(this, 7, r45.bt4.class);
        java.lang.String str = this.f232391d;
        if (bt4Var2 != null && (bt4Var = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ni(this, 1, 7, r45.bt4.class)) != null) {
            bt4Var2.f452569d = bt4Var.f452569d;
            bt4Var2.f452570e = bt4Var.f452570e;
            bt4Var2.f452571f = bt4Var.f452571f;
            bt4Var2.f452572g = bt4Var.f452572g;
            bt4Var2.f452574i = bt4Var.f452574i;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "init mv page scene:" + bt4Var.f452569d + " contextId:" + bt4Var.f452570e + " finderCommentScene:" + bt4Var.f452571f + " finderContextId:" + bt4Var.f452574i);
        }
        byte[] byteArrayExtra = getIntent().getByteArrayExtra("key_mv_report_data");
        if (byteArrayExtra != null) {
            try {
                r45.bt4 bt4Var3 = new r45.bt4();
                bt4Var3.mo11468x92b714fd(byteArrayExtra);
                r45.bt4 bt4Var4 = (r45.bt4) ((md0.e) ((nd0.e) i95.n0.c(nd0.e.class))).Ui(this, 7, r45.bt4.class);
                if (bt4Var4 != null) {
                    bt4Var4.f452569d = bt4Var3.f452569d;
                    bt4Var4.f452570e = bt4Var3.f452570e;
                    bt4Var4.f452571f = bt4Var3.f452571f;
                    bt4Var4.f452572g = bt4Var4.f452572g;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "init mv page report data from intent, " + bt4Var3.f452569d + ' ' + bt4Var3.f452570e + ' ' + bt4Var3.f452571f);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str, e17, e17.getMessage(), new java.lang.Object[0]);
            }
        }
    }
}
