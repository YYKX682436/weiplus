package com.tencent.mm.mj_publisher.finder.movie_composing;

@db5.a(4099)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/mj_publisher/finder/movie_composing/MovieComposingUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes5.dex */
public final class MovieComposingUI extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity {
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
        return com.tencent.mm.R.layout.db9;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{gx0.w8.class, gx0.p9.class, du0.b1.class, gx0.bh.class, gx0.bf.class, gx0.gf.class, gx0.kh.class, du0.t0.class, du0.i0.class, rv0.n1.class, rv0.z6.class, du0.v0.class, tv0.j0.class, iv0.w.class, gx0.x4.class, gx0.sc.class, gx0.c9.class, gx0.y3.class, gx0.f4.class, gx0.b4.class, gx0.kc.class, gx0.dd.class, gx0.m4.class, gx0.ac.class, gx0.u0.class, gx0.h0.class, gx0.h1.class, gx0.u2.class, gx0.r1.class, gx0.mc.class, gx0.w9.class});
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
        ((yy0.m0) ((pp0.h0) i95.n0.c(pp0.h0.class))).mj();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        pp0.l0 l0Var = (pp0.l0) i95.n0.c(pp0.l0.class);
        cy1.a aVar = (cy1.a) ((cy1.a) rVar).ak(this, iy1.c.MJPublisherMovieComposingUI);
        aVar.gk(this, ((yy0.m7) l0Var).Ai());
        aVar.Tj(this, 12, 6, false);
        i95.m c18 = i95.n0.c(w40.e.class);
        kotlin.jvm.internal.o.f(c18, "getService(...)");
        w40.e.fh((w40.e) c18, "andr_MJ_Edit_Video_Expose", null, 2, null);
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
