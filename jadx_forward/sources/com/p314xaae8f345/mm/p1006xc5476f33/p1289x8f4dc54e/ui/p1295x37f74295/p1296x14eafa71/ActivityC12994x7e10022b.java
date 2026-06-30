package com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1295x37f74295.p1296x14eafa71;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/brandservice/ui/personalcenter/recentread/BizPCRecentReadUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-brandservice_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.brandservice.ui.personalcenter.recentread.BizPCRecentReadUI */
/* loaded from: classes3.dex */
public final class ActivityC12994x7e10022b extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f175595h = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f175597e;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f175596d = "MicroMsg.BizPCRecentReadUI";

    /* renamed from: f, reason: collision with root package name */
    public final xr1.d f175598f = new xr1.d();

    /* renamed from: g, reason: collision with root package name */
    public final xr1.m f175599g = new xr1.m();

    public final void T6(r45.ip3 ip3Var, boolean z17, yz5.a aVar) {
        if (ip3Var != null) {
            p3325xe03a0797.p3326xc267989b.l.d(v65.m.b(this), null, null, new vr1.e0(this, ip3Var, z17, aVar, null), 3, null);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f175596d, "oldSettingResp == null");
            db5.t7.g(mo55332x76847179(), getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572281am4));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f569753kx;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.Set<java.lang.Class<? extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9>> mo43419xa59964ef = super.mo43419xa59964ef();
        if (mo43419xa59964ef != null) {
            return kz5.q1.i(mo43419xa59964ef, kz5.z.D0(new java.lang.Class[]{vr1.o.class, vr1.b0.class}));
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f175596d, "onCreate");
        this.f175597e = getIntent().getLongExtra("biz_time_line_line_session_id", 0L);
        mo54450xbf7c1df6(getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.als));
        mo78530x8b45058f();
        mo54448x9c8c0d33(new vr1.c0(this));
        ul5.k m78511x9f88d943 = m78511x9f88d943();
        if (m78511x9f88d943 != null) {
            m78511x9f88d943.mo82162xa5089f5c(getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560024c));
        }
        m78478x84f07bce(0, com.p314xaae8f345.mm.R.C30867xcad56011.f571345cf, com.p314xaae8f345.mm.R.raw.f80193xebd790ad, new vr1.d0(this));
    }
}
