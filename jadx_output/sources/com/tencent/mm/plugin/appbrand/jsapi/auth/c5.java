package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class c5 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.j5 f79427d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5(com.tencent.mm.plugin.appbrand.jsapi.auth.j5 j5Var) {
        super(1);
        this.f79427d = j5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.app.Instrumentation.ActivityResult it = (android.app.Instrumentation.ActivityResult) obj;
        kotlin.jvm.internal.o.g(it, "it");
        int resultCode = it.getResultCode();
        android.content.Intent resultData = it.getResultData();
        com.tencent.mm.plugin.appbrand.jsapi.auth.j5 j5Var = this.f79427d;
        if (resultCode == -1) {
            java.util.List stringArrayListExtra = resultData != null ? resultData.getStringArrayListExtra("RESULT_KEY_UPDATED_LIST") : null;
            if (stringArrayListExtra == null) {
                stringArrayListExtra = kz5.p0.f313996d;
            }
            if (stringArrayListExtra.isEmpty()) {
                j5Var.f79607h.f61921i = 2L;
                j5Var.f79608i.a();
            } else {
                j5Var.f79602c = com.tencent.mm.plugin.appbrand.jsapi.auth.w4.f79771d;
                j5Var.f79607h.f61921i = 1L;
                j5Var.h().b(stringArrayListExtra);
                j5Var.b(j5Var.h().f94623d);
            }
        } else {
            j5Var.f79608i.a();
        }
        return jz5.f0.f302826a;
    }
}
