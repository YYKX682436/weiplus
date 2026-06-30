package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/EmojiDesignerPackInfoUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(m168215x6ac9171 = 0)
/* renamed from: com.tencent.mm.plugin.emoji.ui.EmojiDesignerPackInfoUI */
/* loaded from: classes15.dex */
public final class ActivityC13303x3d472b4c extends com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37 {

    /* renamed from: f, reason: collision with root package name */
    public i22.b0 f179279f;

    /* renamed from: h, reason: collision with root package name */
    public int f179281h;

    /* renamed from: m, reason: collision with root package name */
    public boolean f179283m;

    /* renamed from: o, reason: collision with root package name */
    public int f179285o;

    /* renamed from: q, reason: collision with root package name */
    public i12.e f179287q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.Map f179288r;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f179277d = "MicroMsg.EmojiDesignerPackInfoUI";

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f179278e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.y0(this));

    /* renamed from: g, reason: collision with root package name */
    public final int f179280g = 69;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f179282i = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f179284n = "";

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.i f179286p = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.i();

    public final java.util.Map U6() {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        iy1.c cVar = iy1.c.MainUI;
        hashMap2.put("page_id", 50103);
        hashMap2.put("page_name", "FinderProfileEmoticonTabAll");
        hashMap.put("cur_page", hashMap2);
        hashMap.put("designer_uin", java.lang.Integer.valueOf(this.f179281h));
        hashMap.put("emoticon_sessionid", this.f179284n);
        hashMap.put("emoticon_enter_scene", java.lang.Integer.valueOf(this.f179285o));
        return hashMap;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.bvl;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        i22.b0 b0Var = this.f179279f;
        if (b0Var != null) {
            b0Var.a(i17, i18, intent);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.Map linkedHashMap;
        java.lang.String str;
        android.content.Intent intent;
        super.onCreate(bundle);
        mo54450xbf7c1df6(mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572652c05));
        mo64405x4dab7448(getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        this.f179281h = getIntent().getIntExtra("uin", 0);
        java.lang.String stringExtra = getIntent().getStringExtra(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.PlayerStep.f54571xe817953d);
        if (stringExtra == null) {
            stringExtra = this.f179282i;
        }
        this.f179282i = stringExtra;
        this.f179283m = getIntent().getBooleanExtra("needStaticsInfo", false);
        try {
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
            if (!(mo55332x76847179 instanceof android.app.Activity)) {
                mo55332x76847179 = null;
            }
            if (mo55332x76847179 == null || (intent = mo55332x76847179.getIntent()) == null || (str = intent.getStringExtra("key_biz_passthrough_info")) == null) {
                str = "{}";
            }
            linkedHashMap = d75.b.e(new org.json.JSONObject(str), com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.s0.f179716d);
        } catch (java.lang.Exception unused) {
            linkedHashMap = new java.util.LinkedHashMap();
        }
        this.f179288r = linkedHashMap;
        java.lang.Object obj = linkedHashMap.get("sdkRequestID");
        java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str2 == null) {
            str2 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        }
        this.f179284n = str2;
        java.util.Map map = this.f179288r;
        if (map == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("passthroughInfo");
            throw null;
        }
        java.lang.Object obj2 = map.get("emoticonEnterScene");
        java.lang.Integer num = obj2 instanceof java.lang.Integer ? (java.lang.Integer) obj2 : null;
        int intValue = num != null ? num.intValue() : 0;
        this.f179285o = intValue;
        i12.e eVar = new i12.e(this.f179282i, this.f179284n, intValue, this.f179283m);
        this.f179287q = eVar;
        eVar.f368743h = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.x0(this);
        i22.b0 b0Var = new i22.b0();
        this.f179279f = b0Var;
        b0Var.f369467c = mo55332x76847179();
        i22.b0 b0Var2 = this.f179279f;
        if (b0Var2 != null) {
            b0Var2.f369470f = this.f179280g;
        }
        jz5.g gVar = this.f179278e;
        ((p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) ((jz5.n) gVar).mo141623x754a37bb()).mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(mo55332x76847179()));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) ((jz5.n) gVar).mo141623x754a37bb();
        i12.e eVar2 = this.f179287q;
        if (eVar2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        c1163xf1deaba4.mo7960x6cab2c8d(eVar2);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.w0 w0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.w0(this);
        int i17 = this.f179281h;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3140x45dbbe86.i iVar = this.f179286p;
        iVar.d(i17);
        iVar.f298178b = this.f179283m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1374x633fb29.C13371xf8f2bef c13371xf8f2bef = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.p1374x633fb29.C13371xf8f2bef(iVar, w0Var);
        c13371xf8f2bef.a();
        i12.e eVar3 = this.f179287q;
        if (eVar3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("adapter");
            throw null;
        }
        eVar3.f368744i = new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.t0(c13371xf8f2bef);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.q.f179124c.c();
        mo54448x9c8c0d33(new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.u0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f179286p.c();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("page_out", this, U6(), 10, false);
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("page_in", this, U6(), 10, false);
    }
}
