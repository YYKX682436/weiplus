package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/SettingButtonSwitchAccount;", "Ls24/d;", "Landroidx/appcompat/app/AppCompatActivity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonSwitchAccount */
/* loaded from: classes.dex */
public final class C17514x4d9e05f7 extends s24.d {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17514x4d9e05f7(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // a24.i
    public java.lang.Integer Y6() {
        return 0;
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_SwitchAccount";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17523x8c728888.class, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17515x2a7e6ad1.class);
    }

    @Override // s24.d, a24.i
    /* renamed from: clone */
    public java.lang.Object mo446x5a5dd5d() {
        return super.mo446x5a5dd5d();
    }

    @Override // a24.i
    public int d7() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.iyv;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17523x8c728888.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF243505p() {
        return 1;
    }

    @Override // a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        t7(m158354x19263085().getIntent());
        c01.uc ucVar = c01.uc.f119047c;
        if (((java.util.HashSet) ucVar.d()).size() > 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14978, 1, 6, ucVar.f(), ucVar.e(), wo.w0.k());
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(14978, 0, 6, ucVar.f(), ucVar.e(), wo.w0.k());
        }
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
        java.lang.String r17 = c01.z1.r();
        if ((r17 != null ? r26.i0.y(r17, "wxid", false) : false) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c01.z1.c()) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) && !c01.z1.x() && ((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) != 0) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
            u1Var.g(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574578is3));
            u1Var.n(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574577is2));
            u1Var.l(new u24.b(context));
            u1Var.a(true);
            u1Var.q(false);
            return;
        }
        if (((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) != 0 && c01.z1.t() && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c01.z1.c()) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            db5.e1.C(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.giw), null, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bln), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), true, new u24.a(context), null);
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
        com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SETTING_SWITCH_ACCOUNT_FIRST_CLICK_BOOLEAN_SYNC;
        if (!c17.o(u3Var, true)) {
            u24.c.f505651a.a(context);
        } else {
            gm0.j1.u().c().x(u3Var, java.lang.Boolean.FALSE);
            db5.e1.E(context, context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iyx), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iyy), context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571988vj), false, new d24.s0(context));
        }
    }
}
