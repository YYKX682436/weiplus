package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes3.dex */
public final class m1 implements com.tencent.mm.ui.widget.dialog.c1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.DialogInterface.OnDismissListener f102379d;

    public m1(android.content.DialogInterface.OnDismissListener onDismissListener) {
        this.f102379d = onDismissListener;
    }

    @Override // com.tencent.mm.ui.widget.dialog.c1
    public final void onDismiss() {
        android.content.DialogInterface.OnDismissListener onDismissListener = this.f102379d;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(null);
        }
    }
}
