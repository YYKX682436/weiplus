package com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/SettingGroupAccountInfo;", "Ls24/e;", "Landroidx/appcompat/app/AppCompatActivity;", com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupAccountInfo */
/* loaded from: classes11.dex */
public final class C17516x8a590acc extends s24.e {

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f243406p;

    /* renamed from: q, reason: collision with root package name */
    public android.view.View f243407q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Integer f243408r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.Integer f243409s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Integer f243410t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C17516x8a590acc(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f243406p = "account_safe";
        rn3.i.Di().k(this);
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        if (bk0.a.g().c(com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC, 266257)) {
            this.f243410t = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.b8i);
        } else {
            this.f243410t = null;
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("VoiceprintEntry"), 0) == 1) {
            java.lang.Object m17 = gm0.j1.u().c().m(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOICEPRINT_SETTING_ACCOUNT_INFO_DOT_SHOW_BOOLEAN, java.lang.Boolean.FALSE);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m17, "null cannot be cast to non-null type kotlin.Boolean");
            if (!((java.lang.Boolean) m17).booleanValue()) {
                this.f243408r = null;
                this.f243409s = null;
            } else if ((gm0.j1.u().c().q(40, 0) & 131072) == 0) {
                this.f243408r = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30867xcad56011.f572034wv);
                this.f243409s = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.C30861xcebc809e.asx);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSettingItem", "show voiceprint dot");
            }
            w7();
        }
    }

    @Override // s24.f
    /* renamed from: A7, reason: from getter */
    public java.lang.String getF243406p() {
        return this.f243406p;
    }

    @Override // s24.f
    /* renamed from: B7, reason: from getter */
    public android.view.View getF243407q() {
        return this.f243407q;
    }

    @Override // s24.f
    /* renamed from: D7, reason: from getter */
    public java.lang.Integer getF243410t() {
        return this.f243410t;
    }

    @Override // s24.f
    /* renamed from: E7, reason: from getter */
    public java.lang.Integer getF243408r() {
        return this.f243408r;
    }

    @Override // s24.f
    /* renamed from: F7, reason: from getter */
    public java.lang.Integer getF243409s() {
        return this.f243409s;
    }

    @Override // s24.f
    public void G7(android.content.Context context, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        super.G7(context, intent);
        pf5.j0.a(intent, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.uic.b.class);
    }

    @Override // s24.f
    public void H7(android.view.View view) {
        this.f243407q = view;
    }

    @Override // s24.f
    public void I7(java.lang.Integer num) {
        this.f243410t = num;
    }

    @Override // s24.f
    public void J7(java.lang.Integer num) {
        this.f243408r = num;
    }

    @Override // s24.f
    public void K7(java.lang.Integer num) {
        this.f243409s = num;
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_AccountInfo";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17523x8c728888.class, com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17527x718322dd.class);
    }

    @Override // s24.e, s24.f, a24.i
    /* renamed from: clone */
    public java.lang.Object mo446x5a5dd5d() {
        return super.mo446x5a5dd5d();
    }

    @Override // a24.i
    public int d7() {
        return com.p314xaae8f345.mm.R.C30867xcad56011.f574552ip1;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17523x8c728888.class;
    }

    @Override // a24.i
    public int m7() {
        return 1;
    }

    @Override // s24.e, a24.i
    public void r7(android.content.Context context, android.view.View itemView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f243410t = null;
        this.f243409s = null;
        this.f243408r = null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(((com.p314xaae8f345.mm.p1006xc5476f33.p2468x38fea8.a) ((c25.e) gm0.j1.s(c25.e.class))).b().d("VoiceprintEntry"), 0) == 1 && (gm0.j1.u().c().q(40, 0) & 131072) == 0) {
            gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_VOICEPRINT_SETTING_ACCOUNT_INFO_DOT_SHOW_BOOLEAN, java.lang.Boolean.FALSE);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseSettingItem", "unset setting account info dot show");
        }
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a.g().i(com.p314xaae8f345.mm.p2621x8fb0427b.u3.NEW_BANDAGE_DATASOURCE_DEVICE_PROTECT_STRING_SYNC, 266257);
        rn3.i.Di().a(51);
        super.r7(context, itemView, i17);
    }

    @Override // s24.f, com.p314xaae8f345.mm.p1006xc5476f33.p1930x6e0a2cd8.p1931x633fb29.a
    public boolean y(boolean z17) {
        super.y(z17);
        w7();
        return true;
    }
}
