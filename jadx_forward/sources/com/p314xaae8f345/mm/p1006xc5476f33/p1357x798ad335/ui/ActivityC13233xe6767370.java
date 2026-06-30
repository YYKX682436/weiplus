package com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.ui;

@db5.a(m123858x6ac9171 = 7)
/* renamed from: com.tencent.mm.plugin.downloader.ui.FileDownloadConfirmUI */
/* loaded from: classes8.dex */
public class ActivityC13233xe6767370 extends com.p314xaae8f345.mm.ui.ActivityC21397xf0b6eac0 {

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 f178752e = null;

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setContentView(com.p314xaae8f345.mm.R.C30864xbddafb2a.a8u);
        if (fp.h.c(21)) {
            getWindow().setStatusBarColor(0);
        }
        long longExtra = getIntent().getLongExtra("extra_download_id", -1L);
        j02.a aVar = new j02.a(this, longExtra);
        j02.b bVar = new j02.b(this, longExtra);
        j02.c cVar = new j02.c(this);
        h02.a c17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.m0.c(longExtra);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0(this);
        i0Var.f293354b.f293242a = "";
        if (c17 == null || c17.f68421xf1ebe47b != 5) {
            i0Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.ceg);
        } else {
            i0Var.d(com.p314xaae8f345.mm.R.C30867xcad56011.nhk);
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p0) ((m33.l1) i95.n0.c(m33.l1.class))).nj(c17.f68417x26b3182a, 11311002L, 2L, 1, null);
        }
        i0Var.f(com.p314xaae8f345.mm.R.C30867xcad56011.f572141zu);
        i0Var.f293354b.E = aVar;
        i0Var.e(com.p314xaae8f345.mm.R.C30867xcad56011.f572036wx);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.a aVar2 = i0Var.f293354b;
        aVar2.F = bVar;
        aVar2.H = cVar;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 a17 = i0Var.a();
        this.f178752e = a17;
        a17.show();
        if (c17 != null) {
            g02.c cVar2 = new g02.c();
            cVar2.a(c17);
            g02.b.c(19, cVar2);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadConfirmUI", "Confirm Dialog");
    }

    @Override // p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FileDownloadConfirmUI", "onNewIntent");
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onStop() {
        super.onStop();
        this.f178752e.dismiss();
    }
}
