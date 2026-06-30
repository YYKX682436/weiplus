package com.tencent.mm.plugin.downloader.ui;

@db5.a(7)
/* loaded from: classes8.dex */
public class FileDownloadConfirmUI extends com.tencent.mm.ui.MMBaseActivity {

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.j0 f97219e = null;

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.tencent.mm.R.layout.a8u);
        if (fp.h.c(21)) {
            getWindow().setStatusBarColor(0);
        }
        long longExtra = getIntent().getLongExtra("extra_download_id", -1L);
        j02.a aVar = new j02.a(this, longExtra);
        j02.b bVar = new j02.b(this, longExtra);
        j02.c cVar = new j02.c(this);
        h02.a c17 = com.tencent.mm.plugin.downloader.model.m0.c(longExtra);
        com.tencent.mm.ui.widget.dialog.i0 i0Var = new com.tencent.mm.ui.widget.dialog.i0(this);
        i0Var.f211821b.f211709a = "";
        if (c17 == null || c17.field_fileType != 5) {
            i0Var.d(com.tencent.mm.R.string.ceg);
        } else {
            i0Var.d(com.tencent.mm.R.string.nhk);
            ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).nj(c17.field_extInfo, 11311002L, 2L, 1, null);
        }
        i0Var.f(com.tencent.mm.R.string.f490608zu);
        i0Var.f211821b.E = aVar;
        i0Var.e(com.tencent.mm.R.string.f490503wx);
        com.tencent.mm.ui.widget.dialog.a aVar2 = i0Var.f211821b;
        aVar2.F = bVar;
        aVar2.H = cVar;
        com.tencent.mm.ui.widget.dialog.j0 a17 = i0Var.a();
        this.f97219e = a17;
        a17.show();
        if (c17 != null) {
            g02.c cVar2 = new g02.c();
            cVar2.a(c17);
            g02.b.c(19, cVar2);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadConfirmUI", "Confirm Dialog");
    }

    @Override // androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FileDownloadConfirmUI", "onNewIntent");
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f97219e.dismiss();
    }
}
