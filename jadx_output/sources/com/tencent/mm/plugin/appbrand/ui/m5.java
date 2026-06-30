package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class m5 implements android.content.DialogInterface.OnShowListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k2 f89863d;

    public m5(com.tencent.mm.ui.widget.dialog.k2 k2Var) {
        this.f89863d = k2Var;
    }

    @Override // android.content.DialogInterface.OnShowListener
    public void onShow(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.ui.widget.dialog.k2 k2Var = this.f89863d;
        if (k2Var.getWindow() != null) {
            k2Var.getWindow().setDimAmount(0.0f);
        }
    }
}
