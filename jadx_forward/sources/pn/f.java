package pn;

/* loaded from: classes11.dex */
public final class f implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pn.m f438456d;

    public f(pn.m mVar) {
        this.f438456d = mVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        pn.m mVar = this.f438456d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = mVar.f438463a;
        java.lang.String str = mVar.f438464b;
        if (abstractActivityC21394xb3d2c0cf == null) {
            mVar.getClass();
            return;
        }
        if (mVar.f()) {
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", mVar.d(com.p314xaae8f345.mm.R.C30867xcad56011.f572373b00, com.p314xaae8f345.mm.sdk.p2603x2137b148.m2.d()));
            intent.putExtra("geta8key_username", c01.z1.r());
            intent.putExtra("showShare", false);
            j45.l.j(abstractActivityC21394xb3d2c0cf, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, null);
        }
    }
}
