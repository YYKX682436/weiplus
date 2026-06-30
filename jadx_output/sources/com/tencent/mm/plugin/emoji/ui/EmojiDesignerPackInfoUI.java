package com.tencent.mm.plugin.emoji.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/EmojiDesignerPackInfoUI;", "Lcom/tencent/mm/ui/vas/VASActivity;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes15.dex */
public final class EmojiDesignerPackInfoUI extends com.tencent.mm.ui.vas.VASActivity {

    /* renamed from: f, reason: collision with root package name */
    public i22.b0 f97746f;

    /* renamed from: h, reason: collision with root package name */
    public int f97748h;

    /* renamed from: m, reason: collision with root package name */
    public boolean f97750m;

    /* renamed from: o, reason: collision with root package name */
    public int f97752o;

    /* renamed from: q, reason: collision with root package name */
    public i12.e f97754q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.Map f97755r;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f97744d = "MicroMsg.EmojiDesignerPackInfoUI";

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f97745e = jz5.h.b(new com.tencent.mm.plugin.emoji.ui.y0(this));

    /* renamed from: g, reason: collision with root package name */
    public final int f97747g = 69;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f97749i = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f97751n = "";

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.wechat.aff.emoticon.i f97753p = new com.tencent.wechat.aff.emoticon.i();

    public final java.util.Map U6() {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.HashMap hashMap2 = new java.util.HashMap();
        iy1.c cVar = iy1.c.MainUI;
        hashMap2.put("page_id", 50103);
        hashMap2.put("page_name", "FinderProfileEmoticonTabAll");
        hashMap.put("cur_page", hashMap2);
        hashMap.put("designer_uin", java.lang.Integer.valueOf(this.f97748h));
        hashMap.put("emoticon_sessionid", this.f97751n);
        hashMap.put("emoticon_enter_scene", java.lang.Integer.valueOf(this.f97752o));
        return hashMap;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bvl;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        i22.b0 b0Var = this.f97746f;
        if (b0Var != null) {
            b0Var.a(i17, i18, intent);
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.util.Map linkedHashMap;
        java.lang.String str;
        android.content.Intent intent;
        super.onCreate(bundle);
        setMMTitle(getContext().getString(com.tencent.mm.R.string.f491119c05));
        setActionbarColor(getColor(com.tencent.mm.R.color.aaw));
        this.f97748h = getIntent().getIntExtra("uin", 0);
        java.lang.String stringExtra = getIntent().getStringExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME);
        if (stringExtra == null) {
            stringExtra = this.f97749i;
        }
        this.f97749i = stringExtra;
        this.f97750m = getIntent().getBooleanExtra("needStaticsInfo", false);
        try {
            androidx.appcompat.app.AppCompatActivity context = getContext();
            if (!(context instanceof android.app.Activity)) {
                context = null;
            }
            if (context == null || (intent = context.getIntent()) == null || (str = intent.getStringExtra("key_biz_passthrough_info")) == null) {
                str = "{}";
            }
            linkedHashMap = d75.b.e(new org.json.JSONObject(str), com.tencent.mm.plugin.emoji.ui.s0.f98183d);
        } catch (java.lang.Exception unused) {
            linkedHashMap = new java.util.LinkedHashMap();
        }
        this.f97755r = linkedHashMap;
        java.lang.Object obj = linkedHashMap.get("sdkRequestID");
        java.lang.String str2 = obj instanceof java.lang.String ? (java.lang.String) obj : null;
        if (str2 == null) {
            str2 = java.lang.String.valueOf(java.lang.System.currentTimeMillis());
        }
        this.f97751n = str2;
        java.util.Map map = this.f97755r;
        if (map == null) {
            kotlin.jvm.internal.o.o("passthroughInfo");
            throw null;
        }
        java.lang.Object obj2 = map.get("emoticonEnterScene");
        java.lang.Integer num = obj2 instanceof java.lang.Integer ? (java.lang.Integer) obj2 : null;
        int intValue = num != null ? num.intValue() : 0;
        this.f97752o = intValue;
        i12.e eVar = new i12.e(this.f97749i, this.f97751n, intValue, this.f97750m);
        this.f97754q = eVar;
        eVar.f287210h = new com.tencent.mm.plugin.emoji.ui.x0(this);
        i22.b0 b0Var = new i22.b0();
        this.f97746f = b0Var;
        b0Var.f287934c = getContext();
        i22.b0 b0Var2 = this.f97746f;
        if (b0Var2 != null) {
            b0Var2.f287937f = this.f97747g;
        }
        jz5.g gVar = this.f97745e;
        ((androidx.recyclerview.widget.RecyclerView) ((jz5.n) gVar).getValue()).setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) ((jz5.n) gVar).getValue();
        i12.e eVar2 = this.f97754q;
        if (eVar2 == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        recyclerView.setAdapter(eVar2);
        com.tencent.mm.plugin.emoji.ui.w0 w0Var = new com.tencent.mm.plugin.emoji.ui.w0(this);
        int i17 = this.f97748h;
        com.tencent.wechat.aff.emoticon.i iVar = this.f97753p;
        iVar.d(i17);
        iVar.f216645b = this.f97750m;
        com.tencent.mm.plugin.emoji.ui.v3.model.EmojiDesignerPackForFinderPageSource emojiDesignerPackForFinderPageSource = new com.tencent.mm.plugin.emoji.ui.v3.model.EmojiDesignerPackForFinderPageSource(iVar, w0Var);
        emojiDesignerPackForFinderPageSource.a();
        i12.e eVar3 = this.f97754q;
        if (eVar3 == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        eVar3.f287211i = new com.tencent.mm.plugin.emoji.ui.t0(emojiDesignerPackForFinderPageSource);
        com.tencent.mm.plugin.emoji.model.q.f97591c.c();
        setBackBtn(new com.tencent.mm.plugin.emoji.ui.u0(this));
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f97753p.c();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("page_out", this, U6(), 10, false);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).yj("page_in", this, U6(), 10, false);
    }
}
