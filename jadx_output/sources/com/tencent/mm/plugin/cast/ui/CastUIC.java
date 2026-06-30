package com.tencent.mm.plugin.cast.ui;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/cast/ui/CastUIC;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-recordvideo_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes5.dex */
public final class CastUIC extends com.tencent.mm.ui.MMActivity {

    /* renamed from: m, reason: collision with root package name */
    public static final /* synthetic */ int f95480m = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f95481d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f95482e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f95483f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f95484g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f95485h;

    /* renamed from: i, reason: collision with root package name */
    public final av1.f f95486i;

    public CastUIC() {
        jz5.i iVar = jz5.i.f302831f;
        this.f95481d = jz5.h.a(iVar, new av1.c(this));
        this.f95482e = jz5.h.a(iVar, new av1.d(this));
        this.f95483f = jz5.h.a(iVar, new av1.b(this));
        this.f95484g = jz5.h.a(iVar, new av1.g(this));
        this.f95485h = jz5.h.a(iVar, new av1.a(this));
        this.f95486i = new av1.f(this);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public android.view.View getLayoutView() {
        return new android.widget.FrameLayout(this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        setTheme(com.tencent.mm.R.style.f494395lx);
        o25.n1.f(this);
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        com.tencent.mars.xlog.Log.i((java.lang.String) this.f95485h.getValue(), "onCreate");
        android.view.View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        decorView.setSystemUiVisibility(1792);
        getWindow().setNavigationBarColor(0);
        getWindow().setStatusBarColor(0);
        hideTitleView();
        setLightNavigationbarIcon();
        cv3.i iVar = (cv3.i) this.f95481d.getValue();
        iVar.setCallback(this.f95486i);
        jz5.g gVar = this.f95484g;
        if (((com.tencent.mm.feature_api.recordvideo.INewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo) gVar.getValue()) != null) {
            com.tencent.mm.feature_api.recordvideo.INewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo iNewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo = (com.tencent.mm.feature_api.recordvideo.INewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo) gVar.getValue();
            kotlin.jvm.internal.o.d(iNewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo);
            com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = new com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo();
            audioCacheInfo.f155718o = 1;
            java.lang.String str = iNewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo.f67872d;
            java.lang.Integer h17 = r26.h0.h(str);
            audioCacheInfo.f155711e = h17 != null ? h17.intValue() : 0;
            int i17 = iNewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo.f67878m;
            if (i17 == 1) {
                r45.pg4 pg4Var = new r45.pg4();
                audioCacheInfo.A = pg4Var;
                pg4Var.f383018d = str;
            }
            java.lang.String str2 = iNewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo.f67874f;
            kotlin.jvm.internal.o.g(str2, "<set-?>");
            audioCacheInfo.f155723t = str2;
            audioCacheInfo.f155714h = new java.util.ArrayList(iNewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo.f67875g);
            audioCacheInfo.f155712f = iNewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo.f67873e;
            audioCacheInfo.f155720q = iNewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo.f67877i;
            java.lang.String str3 = iNewLifeMusicPanelFeatureApi$NewLifeSelectedMusicInfo.f67876h;
            kotlin.jvm.internal.o.g(str3, "<set-?>");
            audioCacheInfo.f155725v = str3;
            audioCacheInfo.I = i17;
            audioCacheInfo.f155717n = false;
            audioCacheInfo.f155716m = false;
            audioCacheInfo.f155721r = false;
            iVar.setLocalAudioList(kz5.b0.c(audioCacheInfo));
        }
        com.tencent.mm.plugin.recordvideo.ui.editor.contract.IAudioPanelView.setup$default(iVar, "", (java.util.ArrayList) this.f95482e.getValue(), 0L, 30L, true, null, false, 96, null);
        iVar.f222576i = new av1.e(this);
        iVar.setShow(true);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        com.tencent.mars.xlog.Log.i((java.lang.String) this.f95485h.getValue(), "onDestroy");
        super.onDestroy();
        ((cv3.i) this.f95481d.getValue()).destroy();
    }
}
