package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui;

@db5.a(m123858x6ac9171 = 32)
@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/mv/ui/MusicMvMainUI;", "Lcom/tencent/mm/plugin/mv/ui/BaseMusicMvUI;", "<init>", "()V", "plugin-mv_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.mv.ui.MusicMvMainUI */
/* loaded from: classes10.dex */
public final class ActivityC16649xd6b36a3b extends com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.AbstractActivityC16647x3a7d7dd1 {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f232393h = 0;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f232394e = "MicroMsg.Mv.MusicMvMainUI";

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.C16651xaac2888b f232395f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d f232396g;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.mv.ui.MusicMvMainUI$musicPlayEventListener$1] */
    public ActivityC16649xd6b36a3b() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f232395f = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4>(a0Var) { // from class: com.tencent.mm.plugin.mv.ui.MusicMvMainUI$musicPlayEventListener$1
            {
                this.f39173x3fe91575 = -1155728636;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 c5722xb16ab0f4) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5722xb16ab0f4 event = c5722xb16ab0f4;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                am.jk jkVar = event.f136045g;
                java.lang.Integer valueOf = jkVar != null ? java.lang.Integer.valueOf(jkVar.f88569b) : null;
                if (valueOf == null || valueOf.intValue() != 4) {
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16649xd6b36a3b.this.f232394e, "musicPlayEventListener error");
                il4.l lVar = il4.l.f373675a;
                return false;
            }
        };
        this.f232396g = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5721xb5961bd5>(a0Var) { // from class: com.tencent.mm.plugin.mv.ui.MusicMvMainUI$musicCheckErrorListener$1
            {
                this.f39173x3fe91575 = -1443570203;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5721xb5961bd5 c5721xb5961bd5) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5721xb5961bd5 event = c5721xb5961bd5;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16649xd6b36a3b activityC16649xd6b36a3b = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.ActivityC16649xd6b36a3b.this;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC16649xd6b36a3b.f232394e, "musicCheckErrorListener check error");
                if (event.f136044g.f88489a == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(activityC16649xd6b36a3b.f232394e, "musicCheckErrorListener, must has error.");
                    return false;
                }
                il4.l lVar = il4.l.f373675a;
                return false;
            }
        };
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570856c52;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.AbstractActivityC16647x3a7d7dd1, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        java.util.Set mo43419xa59964ef = super.mo43419xa59964ef();
        if (mo43419xa59964ef != null) {
            return kz5.q1.i(mo43419xa59964ef, kz5.z.D0(new java.lang.Class[]{com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.n0.class, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.q7.class, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16677x5944b67e.class, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.e1.class, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.d0.class, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.C16668xffb9dd68.class, dv2.f2.class, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.t0.class, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.s1.class, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.k0.class, com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic.y0.class}));
        }
        return null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.AbstractActivityC16647x3a7d7dd1, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (!(kl3.t.f390376g != null)) {
            finish();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f232394e, "MusicPlayerManager is not init!");
            return;
        }
        tl3.a.f501830b = "2.0";
        ka0.h0 h0Var = (ka0.h0) i95.n0.c(ka0.h0.class);
        android.os.Bundle extras = getIntent().getExtras();
        ((ja0.c0) h0Var).getClass();
        ll3.q0.f(extras);
        if (getIntent().getStringExtra("key_mv_thumb_path") == null) {
            ka0.h0 h0Var2 = (ka0.h0) i95.n0.c(ka0.h0.class);
            java.lang.String stringExtra = getIntent().getStringExtra("key_mv_album_cover_url");
            ((ja0.c0) h0Var2).getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GlobalMusicFloatBallManager", "updateCurrentMusicCover %s", stringExtra);
            ll3.b1.f400674b.v0(stringExtra, true);
        }
        m78531x8f8cf1fb();
        android.view.View decorView = getWindow().getDecorView();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(1280);
        mo64405x4dab7448(mo55332x76847179().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.a9e));
        mo78530x8b45058f();
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: onCreateBeforeSetContentView */
    public void mo48758x6c4bab6() {
        m78563x4e0f6657(false);
        super.mo48758x6c4bab6();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        tl3.a.f501830b = "1.0";
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f232394e, "onNewIntent");
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onPause() {
        super.onPause();
        mo48814x2efc64();
        this.f232396g.mo48814x2efc64();
    }

    @Override // com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onResume() {
        super.onResume();
        mo48813x58998cd();
        this.f232396g.mo48813x58998cd();
    }
}
