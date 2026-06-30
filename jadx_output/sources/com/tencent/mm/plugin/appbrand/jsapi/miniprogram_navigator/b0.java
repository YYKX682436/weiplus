package com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator;

/* loaded from: classes7.dex */
public class b0 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g f82195a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ze.n f82196b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ik1.b0 f82197c;

    public b0(com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.i0 i0Var, com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g gVar, ze.n nVar, ik1.b0 b0Var) {
        this.f82195a = gVar;
        this.f82196b = nVar;
        this.f82197c = b0Var;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        java.lang.String obj2;
        com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.g gVar = this.f82195a;
        if (gVar != null) {
            boolean z17 = false;
            if (obj instanceof java.lang.Exception) {
                obj2 = ((java.lang.Exception) obj).getMessage();
            } else if (com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.e.IGNORE == obj) {
                obj2 = "ok";
                z17 = true;
            } else {
                obj2 = com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.e.CANCEL == obj ? "cancel" : obj == null ? com.tencent.map.sdk.comps.vis.VisualLayer.OnLayerStatusChangedListener.LayerStatusMsg.MSG_ERR_INTERNAL_ERROR : obj.toString();
            }
            gVar.a(z17, obj2);
        }
        this.f82196b.m(new com.tencent.mm.plugin.appbrand.jsapi.miniprogram_navigator.a0(this));
    }
}
