package com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee;

@db5.a(m123858x6ac9171 = 7)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/ting/TingMembershipTransparentUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-ting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.ting.TingMembershipTransparentUI */
/* loaded from: classes11.dex */
public final class ActivityC18708x5ac0f042 extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f256158d = jz5.h.b(new rk4.n5(this));

    /* renamed from: e, reason: collision with root package name */
    public boolean f256159e;

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return -1;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.Set<java.lang.Class<? extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9>> mo43419xa59964ef = super.mo43419xa59964ef();
        if (mo43419xa59964ef != null) {
            return kz5.q1.i(mo43419xa59964ef, kz5.o1.c(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.j0.class));
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        this.f256159e = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMembershipTransparentUI", "onUserCancel");
        android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) ((jz5.n) this.f256158d).mo141623x754a37bb();
        if (resultReceiver != null) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putInt("key_result_status", com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC25194xb2d6bf0f.f45188x760d227a.ordinal());
            resultReceiver.send(0, bundle);
        }
        finish();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.p314xaae8f345.mm.api.C4990x83627a9 c4990x83627a9 = (com.p314xaae8f345.mm.api.C4990x83627a9) getIntent().getParcelableExtra("key_membership_request");
        if (c4990x83627a9 == null) {
            android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) ((jz5.n) this.f256158d).mo141623x754a37bb();
            if (resultReceiver != null) {
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putInt("key_result_status", com.p314xaae8f345.p2845xc516c4b6.p2882x3652ee.EnumC25194xb2d6bf0f.f45190x20cf1e.ordinal());
                resultReceiver.send(0, bundle2);
                return;
            }
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.j0 j0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.j0) pf5.z.f435481a.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.j0.class);
        rk4.m5 m5Var = new rk4.m5(this);
        j0Var.getClass();
        j0Var.Q6();
        gl4.z zVar = (gl4.z) ((jz5.n) j0Var.f256295d).mo141623x754a37bb();
        android.app.Activity context = j0Var.m80379x76847179();
        com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.h0 h0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.uic.h0(j0Var, c4990x83627a9, m5Var);
        zVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        bw5.a90 a90Var = null;
        if (!(context instanceof p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f)) {
            h0Var.a(new qk.ea(qk.ga.f445669f, null));
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMembershipHelper", "startMembershipSubscribe request: " + c4990x83627a9);
        bw5.w80 w80Var = c4990x83627a9.f134745e;
        if (w80Var != null) {
            zVar.e((p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f) context, c4990x83627a9, w80Var, h0Var);
            return;
        }
        if (c4990x83627a9.f134744d == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TingMembershipHelper", "startMembershipSubscribe fetchJoinInfo requestScene invalid");
            h0Var.a(new qk.ea(qk.ga.f445669f, null));
            return;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.f(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572001vx), true, 0, null);
        f17.show();
        java.lang.Integer num = c4990x83627a9.f134744d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(num);
        int intValue = num.intValue();
        gl4.y yVar = new gl4.y(f17, c4990x83627a9, zVar, context, h0Var);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("fetchMembershipJoinInfo requestScene: ");
        sb6.append(intValue);
        sb6.append('(');
        switch (intValue) {
            case 0:
                a90Var = bw5.a90.kMMListenMembershipSchemeGetRequestTypeDefault;
                break;
            case 1:
                a90Var = bw5.a90.kMMListenMembershipSchemeGetRequestTypeAutoPlayer;
                break;
            case 2:
                a90Var = bw5.a90.kMMListenMembershipSchemeGetRequestTypeDiscoverTopToast;
                break;
            case 3:
                a90Var = bw5.a90.kMMListenMembershipSchemeGetRequestTypeMembershipPage;
                break;
            case 4:
                a90Var = bw5.a90.kMMListenMembershipSchemeGetRequestTypeUserPageDiscover;
                break;
            case 5:
                a90Var = bw5.a90.kMMListenMembershipSchemeGetRequestTypeVipLimitFreeAuto;
                break;
            case 6:
                a90Var = bw5.a90.kMMListenMembershipSchemeGetRequestTypeTryWording;
                break;
            case 7:
                a90Var = bw5.a90.kMMListenMembershipSchemeGetRequestTypeVipLimitFreeAutoAD;
                break;
            case 8:
                a90Var = bw5.a90.kMMListenMembershipSchemeGetRequestTypeUserPageDiscoverTopToast;
                break;
            case 9:
                a90Var = bw5.a90.kMMListenMembershipSchemeGetRequestTypeVipLimitFreeAutoBindQQMusic;
                break;
            case 10:
                a90Var = bw5.a90.kMMListenMembershipSchemeGetRequestTypeUserPageDiscoverGoBindQQMusic;
                break;
            case 11:
                a90Var = bw5.a90.kMMListenMembershipSchemeGetRequestTypeBindQQMusicRecharge;
                break;
            case 12:
                a90Var = bw5.a90.kMMListenMembershipSchemeGetRequestTypeVipLimitFreeAutoQQMusicGreenVip;
                break;
            case 13:
                a90Var = bw5.a90.kMMListenMembershipSchemeGetRequestTypeVipLimitFreeIcon;
                break;
        }
        sb6.append(a90Var);
        sb6.append(')');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingMembershipHelper", sb6.toString());
        bw5.z80 z80Var = new bw5.z80();
        z80Var.f117390f = intValue;
        z80Var.f117392h[4] = true;
        jm4.c2 c2Var = (jm4.c2) ((jz5.n) zVar.f354432a).mo141623x754a37bb();
        if (c2Var != null) {
            gl4.e eVar = new gl4.e(yVar);
            byte[] mo14344x5f01b1f6 = z80Var.mo14344x5f01b1f6();
            jm4.x1 x1Var = new jm4.x1();
            x1Var.f381980m = eVar;
            long m105978x2737f10 = ((jm4.d2) c2Var).m105978x2737f10();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo14344x5f01b1f6);
            p3380x6a61f93.p3381xf512d0a5.C30485x21b88584.m169275x21b2b0f5(m105978x2737f10, mo14344x5f01b1f6, x1Var);
        }
    }
}
