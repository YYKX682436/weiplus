package com.tencent.mm.mj_template.album_template.single_template;

@db5.a(com.tencent.mm.plugin.appbrand.jsapi.m9.CTRL_INDEX)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/mj_template/album_template/single_template/MaasAlbumTemplatePreviewUI;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "sy0/a", "sy0/b", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes4.dex */
public final class MaasAlbumTemplatePreviewUI extends com.tencent.mm.ui.MMComposeActivity {

    /* renamed from: g, reason: collision with root package name */
    public static final sy0.a f69756g = new sy0.a(null);

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f69757d = jz5.h.b(new sy0.d(this));

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f69758e = jz5.h.b(sy0.e.f413831d);

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f69759f = jz5.h.b(new sy0.c(this));

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f487947ca;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        java.lang.Class[] clsArr = new java.lang.Class[2];
        clsArr[0] = ((sy0.b) ((jz5.n) this.f69757d).getValue()) == sy0.b.f413826d ? mz0.x2.class : mz0.l2.class;
        clsArr[1] = pf5.a0.a(kotlin.jvm.internal.i0.a(dz0.l.class));
        return kz5.z.D0(clsArr);
    }

    @Override // com.tencent.mm.ui.MMComposeActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        com.tencent.mm.mj_template.api.MJTemplateSession mJTemplateSession;
        r45.rz6 rz6Var;
        o25.n1.f(this);
        i95.n0.c(uy0.h.class);
        super.onCreate(bundle);
        if (((sy0.b) ((jz5.n) this.f69757d).getValue()) == sy0.b.f413827e) {
            androidx.lifecycle.o mo133getLifecycle = mo133getLifecycle();
            java.lang.String str = (java.lang.String) ((jz5.n) this.f69758e).getValue();
            android.content.Intent intent = getIntent();
            kotlin.jvm.internal.o.f(intent, "getIntent(...)");
            com.tencent.mm.mj_template.report.MaasPageFinderReporter maasPageFinderReporter = new com.tencent.mm.mj_template.report.MaasPageFinderReporter(str, 133, "shoot_same_video", intent);
            com.tencent.mm.mj_template.api.MaasAlbumTemplateRequestParams maasAlbumTemplateRequestParams = (com.tencent.mm.mj_template.api.MaasAlbumTemplateRequestParams) ((jz5.n) this.f69759f).getValue();
            java.lang.String str2 = (maasAlbumTemplateRequestParams == null || (mJTemplateSession = maasAlbumTemplateRequestParams.f69774e) == null || (rz6Var = (r45.rz6) ((jz5.n) mJTemplateSession.f69767f).getValue()) == null) ? null : rz6Var.f385320d;
            if (str2 == null) {
                str2 = "";
            }
            maasPageFinderReporter.f69813o.put("templateId", str2);
            maasPageFinderReporter.a("activityid", getIntent().getLongExtra("key_topic_id", 0L));
            mo133getLifecycle.a(maasPageFinderReporter);
        }
        setSelfNavigationBarVisible(8);
        getWindow().addFlags(2097280);
        getWindow().setFlags(201327616, 201327616);
        ai3.d.f5107a = true;
        com.tencent.mm.ui.v9.d(this);
        getWindow().setFormat(-3);
        hideTitleView();
        setLightNavigationbarIcon();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.MaasAlbumTemplatePreviewUI);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ky0.h hVar = ky0.h.f313479a;
    }
}
