package com.tencent.mm.mj_publisher.finder.image_composing;

@db5.a(4099)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/image_composing/ImageComposingUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes5.dex */
public final class ImageComposingUI extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity {
    @Override // com.tencent.mm.ui.component.UIComponentActivity
    public boolean enableLazyInitUIC() {
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.dyc;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{nu0.b4.class, nu0.d4.class, du0.i0.class, du0.b1.class, du0.t0.class, du0.v0.class, nu0.b1.class, nu0.k4.class, nu0.c4.class, nu0.r0.class, nu0.u0.class, nu0.s0.class, nu0.i4.class, nu0.o4.class, nu0.w0.class, nu0.g.class, nu0.f.class, nu0.s.class, nu0.p.class, nu0.j4.class, nu0.i.class});
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        supportRequestWindowFeature(1);
        getWindow().clearFlags(67108864);
        getWindow().clearFlags(134217728);
        getWindow().addFlags(Integer.MIN_VALUE);
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            getWindow().setNavigationBarContrastEnforced(false);
        }
        ug5.x.e(getWindow(), -16777216);
        getWindow().getDecorView().setSystemUiVisibility(1792);
        super.onCreate(bundle);
        if (bundle == null) {
            i95.m c17 = i95.n0.c(w40.e.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            w40.e.eh((w40.e) c17, "MCImport", "MJShootComposing", null, 0, 12, null);
        }
        setSelfNavigationBarVisible(8);
        getController().G0(0);
        getController().E0(0);
        setIsDarkActionbarBg(true);
        setLightNavigationbarIcon();
        int h17 = com.tencent.mm.ui.bl.h(this);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.q8o);
        findViewById.setPadding(0, h17, 0, 0);
        com.tencent.mm.ui.a4.g(findViewById, true);
        i95.m c18 = i95.n0.c(pp0.h0.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        ((yy0.m0) ((pp0.h0) c18)).mj();
        i95.m c19 = i95.n0.c(pp0.l0.class);
        kotlin.jvm.internal.o.f(c19, "getService(...)");
        java.util.Map Ai = ((yy0.m7) ((pp0.l0) c19)).Ai();
        i95.m c27 = i95.n0.c(dy1.r.class);
        kotlin.jvm.internal.o.f(c27, "getService(...)");
        iy1.c cVar = iy1.c.MJPublisherImageComposingUI;
        cy1.a aVar = (cy1.a) ((dy1.r) c27);
        cy1.a aVar2 = (cy1.a) aVar.ak(this, cVar);
        aVar2.gk(this, Ai);
        aVar2.Tj(this, 12, 6, false);
        i95.m c28 = i95.n0.c(w40.e.class);
        kotlin.jvm.internal.o.f(c28, "getService(...)");
        w40.e eVar = (w40.e) c28;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = (com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider) getIntent().getParcelableExtra("KEY_PARAMS_CONFIG");
        android.os.Bundle bundle2 = recordConfigProvider != null ? recordConfigProvider.M : null;
        cy1.a aVar3 = (cy1.a) aVar.ak(this, cVar);
        aVar3.Rj(this, iy1.a.Finder);
        aVar3.Tj(this, 12, 1, false);
        aVar3.gk(this, bundle2 != null ? zt0.a.a(bundle2) : null);
        w40.e.fh(eVar, "andr_MJ_Edit_Video_Expose", null, 2, null);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        getWindow().clearFlags(128);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        getWindow().addFlags(128);
    }
}
