package com.tencent.mm.plugin.appbrand.jsapi.media;

/* loaded from: classes7.dex */
public class t2 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnCancelListener f82067d;

    public t2(com.tencent.mm.plugin.appbrand.jsapi.media.e3 e3Var, android.content.DialogInterface.OnCancelListener onCancelListener) {
        this.f82067d = onCancelListener;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public void onDismiss() {
        android.content.DialogInterface.OnCancelListener onCancelListener = this.f82067d;
        if (onCancelListener != null) {
            onCancelListener.onCancel(null);
        }
    }
}
