package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class l3 extends com.tencent.mm.plugin.appbrand.jsapi.auth.n3 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f79627e;

    /* renamed from: f, reason: collision with root package name */
    public final jc1.d f79628f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(com.tencent.mm.plugin.appbrand.jsapi.auth.h4 sharedContext, java.lang.String str, jc1.d errInfo, org.json.JSONObject jSONObject, int i17, kotlin.jvm.internal.i iVar) {
        super(sharedContext, null);
        str = (i17 & 2) != 0 ? null : str;
        kotlin.jvm.internal.o.g(sharedContext, "sharedContext");
        kotlin.jvm.internal.o.g(errInfo, "errInfo");
        this.f79627e = str;
        this.f79628f = errInfo;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.auth.n3
    public void d() {
        com.tencent.mm.plugin.appbrand.jsapi.auth.h4 h4Var = this.f79539d;
        com.tencent.mm.plugin.appbrand.jsapi.ff ffVar = h4Var.f79571e;
        com.tencent.mm.plugin.appbrand.jsapi.auth.j4 j4Var = h4Var.f79570d;
        org.json.JSONObject jSONObject = ffVar.f81014c;
        java.lang.String str = this.f79627e;
        jc1.d dVar = this.f79628f;
        int i17 = ffVar.f81016e;
        com.tencent.mm.plugin.appbrand.jsapi.l lVar = ffVar.f81013b;
        if (jSONObject == null) {
            lVar.a(i17, j4Var.r(str, dVar, null));
        } else {
            lVar.a(i17, j4Var.r(str, dVar, jSONObject));
        }
    }
}
