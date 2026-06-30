package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class r2 implements com.tencent.mm.ui.widget.dialog.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnCancelListener f82022a;

    public r2(com.tencent.mm.plugin.appbrand.jsapi.media.e3 e3Var, android.content.DialogInterface.OnCancelListener onCancelListener) {
        this.f82022a = onCancelListener;
    }

    @Override // com.tencent.mm.ui.widget.dialog.b1
    public void a() {
        android.content.DialogInterface.OnCancelListener onCancelListener = this.f82022a;
        if (onCancelListener != null) {
            onCancelListener.onCancel(null);
        }
    }
}
