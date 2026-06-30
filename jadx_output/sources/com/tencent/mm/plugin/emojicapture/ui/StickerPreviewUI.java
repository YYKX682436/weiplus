package com.tencent.mm.plugin.emojicapture.ui;

@db5.a(3)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/emojicapture/ui/StickerPreviewUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-emojicapture_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class StickerPreviewUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f98637g = 0;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f98638d = "MicroMsg.StickerPreviewUI";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f98639e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView f98640f;

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(-1, com.tencent.mm.R.anim.f477726n);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cvx;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        overridePendingTransition(com.tencent.mm.R.anim.f477725m, -1);
        super.onCreate(bundle);
        android.view.Window window = getWindow();
        if (window != null) {
            window.addFlags(134217728);
        }
        setActionbarColor(0);
        updateBackBtn(getDrawable(com.tencent.mm.R.raw.actionbar_icon_light_close));
        vj5.o.e(getWindow());
        setBackBtn(new y22.x(this));
        setMMTitle(com.tencent.mm.R.string.jk9);
        this.f98639e = getIntent().getStringExtra("sticker_url");
        di3.w.d();
        com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView stickerPreviewView = (com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView) findViewById(com.tencent.mm.R.id.nip);
        this.f98640f = stickerPreviewView;
        java.lang.String str = this.f98639e;
        if (str != null && stickerPreviewView != null) {
            stickerPreviewView.setStickerUrl(str);
        }
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
        if (j35.u.h(this, "android.permission.CAMERA")) {
            com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView stickerPreviewView2 = this.f98640f;
            if (stickerPreviewView2 != null) {
                at0.n.i(stickerPreviewView2.D, stickerPreviewView2.I, null, null, 6, null);
                return;
            }
            return;
        }
        com.tencent.mars.xlog.Log.i(this.f98638d, "initOnCreateAfterConnected: no permission");
        ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Zi(1001, new y22.w(this), "android.permission.CAMERA");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView stickerPreviewView = this.f98640f;
        if (stickerPreviewView != null) {
            u85.i.f425707a.f(stickerPreviewView.K);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView stickerPreviewView = this.f98640f;
        if (stickerPreviewView != null) {
            stickerPreviewView.D.k();
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mm.plugin.emojicapture.ui.preview.StickerPreviewView stickerPreviewView = this.f98640f;
        if (stickerPreviewView != null) {
            at0.n.i(stickerPreviewView.D, stickerPreviewView.I, null, null, 6, null);
        }
    }
}
