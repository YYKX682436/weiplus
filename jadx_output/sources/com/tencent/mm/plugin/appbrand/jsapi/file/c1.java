package com.tencent.mm.plugin.appbrand.jsapi.file;

/* loaded from: classes7.dex */
public final class c1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader f81051d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.c0 f81052e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader iCommLibReader, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        super(1);
        this.f81051d = iCommLibReader;
        this.f81052e = c0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String obj2 = obj != null ? obj.toString() : null;
        if (!(obj2 == null || obj2.length() == 0)) {
            this.f81052e.evaluateJavascript(this.f81051d.M(obj2), null);
        }
        return jz5.f0.f302826a;
    }
}
