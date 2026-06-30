package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes9.dex */
public class t6 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public boolean f90226a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.AppBrandProcessShareMessageProxyUI f90227b;

    public t6(com.tencent.mm.plugin.appbrand.ui.AppBrandProcessShareMessageProxyUI appBrandProcessShareMessageProxyUI) {
        this.f90227b = appBrandProcessShareMessageProxyUI;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            b(-1, str);
        } else {
            b(-2, null);
        }
    }

    public final void b(int i17, java.lang.String str) {
        android.os.Bundle bundle;
        if (this.f90226a) {
            return;
        }
        this.f90226a = true;
        android.os.ResultReceiver resultReceiver = (android.os.ResultReceiver) this.f90227b.getIntent().getParcelableExtra("key_result_receiver");
        if (resultReceiver != null) {
            if (com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                bundle = null;
            } else {
                bundle = new android.os.Bundle();
                bundle.putString(com.tencent.youtu.sdkkitframework.common.StateEvent.Name.MESSAGE, str);
            }
            resultReceiver.send(i17, bundle);
        }
    }
}
