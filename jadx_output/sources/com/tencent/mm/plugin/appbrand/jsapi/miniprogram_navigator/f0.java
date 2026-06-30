package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

/* loaded from: classes7.dex */
public class f0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ km5.b f82226d;

    public f0(com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.h0 h0Var, km5.b bVar) {
        this.f82226d = bVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        this.f82226d.a(new java.lang.Exception("cancel"));
    }
}
