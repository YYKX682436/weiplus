package com.tencent.mm.plugin.appbrand.ipc;

/* loaded from: classes7.dex */
public class m implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f78419d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI f78420e;

    public m(com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI appBrandProcessProxyUI, com.tencent.mm.plugin.appbrand.ipc.AppBrandProcessProxyUI.AnonymousClass1 anonymousClass1) {
        this.f78420e = appBrandProcessProxyUI;
    }

    public final void a(int i17) {
        if (this.f78419d) {
            return;
        }
        this.f78419d = true;
        android.support.v4.os.ResultReceiver resultReceiver = (android.support.v4.os.ResultReceiver) this.f78420e.getIntent().getParcelableExtra("key_result_receiver");
        if (resultReceiver != null) {
            resultReceiver.b(i17, null);
        }
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        a(i17);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        a(-2);
        this.f78420e.T6(null);
    }
}
