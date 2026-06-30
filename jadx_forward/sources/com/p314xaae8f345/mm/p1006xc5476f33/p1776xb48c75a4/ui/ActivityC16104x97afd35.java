package com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui;

@db5.a(m123858x6ac9171 = 3)
/* renamed from: com.tencent.mm.plugin.honey_pay.ui.HoneyPayProxyUI */
/* loaded from: classes9.dex */
public class ActivityC16104x97afd35 extends com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.AbstractActivityC16095x9d29d312 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f223895h = 0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f223896f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f223897g;

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.AbstractActivityC16095x9d29d312
    public void U6() {
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.AbstractActivityC16095x9d29d312, com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        m83090x14f40144(2876);
        m83090x14f40144(2613);
        this.f223896f = getIntent().getBooleanExtra("key_is_payer", false);
        this.f223897g = getIntent().getStringExtra("key_card_no");
        java.lang.Object[] objArr = {java.lang.Boolean.valueOf(this.f223896f)};
        java.lang.String str = this.f223793d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "is payer: %s", objArr);
        if (u73.h.g()) {
            finish();
            com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
            if (!this.f223896f) {
                m27539xaf65a0fc.mo27566xe4673800("card_id", this.f223897g);
                ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("honeyPayReceiverUseCase", m27539xaf65a0fc, new v73.e1(this));
                return;
            } else {
                m27539xaf65a0fc.mo27566xe4673800("card_no", this.f223897g);
                m27539xaf65a0fc.mo27557xc5c55e60("request_source_type", 2);
                ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("HoneyPayPayerDetailUseCase", m27539xaf65a0fc, new v73.d1(this));
                return;
            }
        }
        if (!this.f223896f) {
            r73.m mVar = new r73.m(this.f223897g);
            mVar.K(this);
            m83099x5406100e(mVar, true);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "do qry payer detail");
            r73.l lVar = new r73.l(this.f223897g);
            lVar.K(this);
            m83099x5406100e(lVar, true);
        }
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        m83121xf6ff5b27(2876);
        m83121xf6ff5b27(2613);
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onProgressFinish */
    public boolean mo63464xa6efccdf() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.AbstractActivityC22902xe37969e
    /* renamed from: onSceneEnd */
    public boolean mo48630x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var instanceof r73.l) {
            r73.l lVar = (r73.l) m1Var;
            lVar.O(new v73.b1(this, lVar));
            return true;
        }
        if (!(m1Var instanceof r73.m)) {
            return true;
        }
        r73.m mVar = (r73.m) m1Var;
        mVar.O(new v73.c1(this, mVar));
        return true;
    }
}
