package com.tencent.mm.mj_template.album_template.multi_template;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/mj_template/album_template/multi_template/MaasAlbumMultiTemplatePreviewUI;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "plugin-mj-template_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes5.dex */
public final class MaasAlbumMultiTemplatePreviewUI extends com.tencent.mm.ui.MMComposeActivity {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ int f69753f = 0;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f69754d = jz5.h.b(qy0.g0.f367589d);

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f69755e = jz5.h.b(new qy0.f0(this));

    public final com.tencent.mm.mj_template.report.MaasPageFinderReporter T6() {
        return (com.tencent.mm.mj_template.report.MaasPageFinderReporter) ((jz5.n) this.f69755e).getValue();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f487941c4;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{qy0.d0.class, pf5.a0.a(kotlin.jvm.internal.i0.a(dz0.l.class))});
    }

    @Override // com.tencent.mm.ui.MMComposeActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        o25.n1.f(this);
        super.onCreate(bundle);
        mo133getLifecycle().a(T6());
        setSelfNavigationBarVisible(8);
        getWindow().addFlags(2097280);
        getWindow().setFlags(201327616, 201327616);
        ai3.d.f5107a = true;
        com.tencent.mm.ui.v9.d(this);
        getWindow().setFormat(-3);
        hideTitleView();
        setLightNavigationbarIcon();
        qy0.d0 d0Var = (qy0.d0) pf5.z.f353948a.a(this).e(qy0.d0.class);
        if (d0Var != null) {
            d0Var.f367583y.f70101s = new qy0.e0(this);
        }
    }
}
