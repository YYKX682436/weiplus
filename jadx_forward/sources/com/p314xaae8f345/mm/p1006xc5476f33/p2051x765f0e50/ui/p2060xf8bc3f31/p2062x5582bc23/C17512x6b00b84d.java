package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/SettingButtonExitAccount;", "Ls24/d;", "Landroidx/appcompat/app/AppCompatActivity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonExitAccount */
/* loaded from: classes11.dex */
public final class C17512x6b00b84d extends s24.d {

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewGroup f243375g;

    /* renamed from: h, reason: collision with root package name */
    public final int f243376h;

    /* renamed from: i, reason: collision with root package name */
    public final int f243377i;

    /* renamed from: m, reason: collision with root package name */
    public final int f243378m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f243379n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f243380o;

    /* renamed from: p, reason: collision with root package name */
    public android.app.ProgressDialog f243381p;

    /* renamed from: q, reason: collision with root package name */
    public com.p314xaae8f345.mm.p944x882e457a.u0 f243382q;

    /* renamed from: r, reason: collision with root package name */
    public com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 f243383r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17512x6b00b84d(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f243376h = 5;
        this.f243377i = 6;
        this.f243378m = 7;
    }

    @Override // a24.i
    public java.lang.Integer Y6() {
        return 0;
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_ExitAccount";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17523x8c728888.class, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17513xe6a0fae1.class);
    }

    @Override // s24.d, a24.i
    /* renamed from: clone */
    public java.lang.Object mo446x5a5dd5d() {
        return super.mo446x5a5dd5d();
    }

    @Override // a24.i
    public int d7() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.gis;
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
    /* renamed from: q7 */
    public boolean getF243481p() {
        js.r0 r0Var = (js.r0) i95.n0.c(js.r0.class);
        java.lang.String r17 = c01.z1.r();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getUsernameFromUserInfo(...)");
        if (!((is.f) r0Var).bj(r17)) {
            js.r0 r0Var2 = (js.r0) i95.n0.c(js.r0.class);
            java.lang.String r18 = c01.z1.r();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r18, "getUsernameFromUserInfo(...)");
            if (!((is.f) r0Var2).Zi(r18)) {
                return false;
            }
        }
        return true;
    }

    @Override // a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        t7(m158354x19263085().getIntent());
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.enk, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) inflate;
        this.f243375g = viewGroup;
        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f568406mq3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        ((android.widget.CheckBox) findViewById).setChecked(true);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 1, 0, true);
        z2Var.m(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571880sg), context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.gis));
        z2Var.o(2);
        z2Var.v(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a0c));
        d24.l lVar = new d24.l(this, z2Var);
        d24.m mVar = new d24.m(this, z2Var);
        z2Var.D = lVar;
        z2Var.E = mVar;
        z2Var.j(this.f243375g);
        z2Var.C();
    }

    public final void x7(boolean z17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.c3.b("welcome_page_show");
        if (z17) {
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).i();
        } else {
            ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).getClass();
            com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.l0.f145034a.c(-1, null);
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5180xccb1ebb1 c5180xccb1ebb1 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5180xccb1ebb1();
        c5180xccb1ebb1.f135526g.f88523a = false;
        c5180xccb1ebb1.e();
        ((com.p314xaae8f345.mm.app.o7) f14.g.a()).getClass();
        com.p314xaae8f345.mm.ui.vb.e();
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) ((mo3.g) ((oo3.j) i95.n0.c(oo3.j.class))).f411940d).g();
        m158354x19263085().finish();
        if (k35.p.f385476a != null) {
            com.p314xaae8f345.mm.ui.vb.d(m80379x76847179(), z17, 2);
        }
    }

    public final void y7() {
        if (c01.z1.x()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSettingItem", "setPwdOrexit: skip QueryHasPasswd for ex-device, exit directly");
            x7(true);
            return;
        }
        com.p314xaae8f345.mm.p944x882e457a.r1 d17 = gm0.j1.d();
        d24.i iVar = new d24.i(this);
        this.f243382q = iVar;
        d17.a(255, iVar);
        com.p314xaae8f345.mm.p957x53236a1b.w0 w0Var = new com.p314xaae8f345.mm.p957x53236a1b.w0(2);
        w0Var.f152977f = 1;
        gm0.j1.d().g(w0Var);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.b4 b4Var = new com.p314xaae8f345.mm.sdk.p2603x2137b148.b4(android.os.Looper.getMainLooper(), (com.p314xaae8f345.mm.sdk.p2603x2137b148.a4) new d24.j(w0Var, this), false);
        this.f243383r = b4Var;
        b4Var.c(3000L, 3000L);
        this.f243381p = db5.e1.Q(m80379x76847179(), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.lbd), true, false, new d24.k(w0Var, this));
    }
}
