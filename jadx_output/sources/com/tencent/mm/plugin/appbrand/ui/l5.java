package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes7.dex */
public class l5 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f89846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.k2 f89847e;

    public l5(android.content.Context context, com.tencent.mm.ui.widget.dialog.k2 k2Var) {
        this.f89846d = context;
        this.f89847e = k2Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        android.app.Activity a17 = q75.a.a(this.f89846d);
        if (a17 != null) {
            a17.finish();
        }
        this.f89847e.setOnCancelListener(null);
    }
}
