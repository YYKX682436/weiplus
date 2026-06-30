package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final /* synthetic */ class l1 implements fl1.j2, kotlin.jvm.internal.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.auth.y f79625a;

    public l1(com.tencent.mm.plugin.appbrand.jsapi.auth.y yVar) {
        this.f79625a = yVar;
    }

    @Override // fl1.j2
    public final void a() {
        this.f79625a.f79789c = true;
    }

    @Override // kotlin.jvm.internal.j
    public final jz5.b b() {
        return new kotlin.jvm.internal.m(0, this.f79625a, com.tencent.mm.plugin.appbrand.jsapi.auth.y.class, "markHadTriggerUserUserAgreementAlert", "markHadTriggerUserUserAgreementAlert()V", 0);
    }

    public final boolean equals(java.lang.Object obj) {
        if ((obj instanceof fl1.j2) && (obj instanceof kotlin.jvm.internal.j)) {
            return kotlin.jvm.internal.o.b(b(), ((kotlin.jvm.internal.j) obj).b());
        }
        return false;
    }

    public final int hashCode() {
        return b().hashCode();
    }
}
