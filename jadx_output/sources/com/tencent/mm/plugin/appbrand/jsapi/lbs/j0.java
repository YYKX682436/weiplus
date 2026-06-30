package com.tencent.mm.plugin.appbrand.jsapi.lbs;

/* loaded from: classes13.dex */
public class j0 implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.e9 f81430d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f81431e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.y1 f81432f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.lbs.v0 f81433g;

    public j0(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0 v0Var, com.tencent.mm.plugin.appbrand.e9 e9Var, int i17, com.tencent.mm.ui.widget.dialog.y1 y1Var) {
        this.f81433g = v0Var;
        this.f81430d = e9Var;
        this.f81431e = i17;
        this.f81432f = y1Var;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.tencent.mm.plugin.appbrand.jsapi.lbs.v0 v0Var = this.f81433g;
        com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.E(v0Var, this.f81430d, this.f81431e, v0Var.o("cancel"));
        this.f81432f.q();
        v0Var.f81503t = false;
    }
}
