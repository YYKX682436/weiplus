package com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emoji/ui/EmoticonCustomCreateDirectFinderUI;", "Lcom/tencent/mm/ui/MMBaseActivity;", "<init>", "()V", "plugin-emoji_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.emoji.ui.EmoticonCustomCreateDirectFinderUI */
/* loaded from: classes5.dex */
public final class ActivityC13321xc8d9d4b6 extends com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0 {

    /* renamed from: e, reason: collision with root package name */
    public long f179387e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f179388f = "";

    /* renamed from: g, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f179389g = p3325xe03a0797.p3326xc267989b.z0.b();

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 f179390h;

    /* renamed from: i, reason: collision with root package name */
    public android.content.Context f179391i;

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f179387e = getIntent().getLongExtra("feedId", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("nonceId");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f179388f = stringExtra;
        this.f179391i = this;
        int i17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4.f293323n;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4 e4Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.e4(this);
        e4Var.f293313g = 2;
        e4Var.f293309c = getString(com.p314xaae8f345.mm.R.C30867xcad56011.ldg);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.f4 c17 = e4Var.c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "show(...)");
        this.f179390h = c17;
        p3325xe03a0797.p3326xc267989b.l.d(this.f179389g, null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.t3(this, null), 3, null);
    }

    @Override // com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        p3325xe03a0797.p3326xc267989b.z0.e(this.f179389g, null, 1, null);
    }
}
