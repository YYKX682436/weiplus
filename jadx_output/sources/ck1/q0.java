package ck1;

/* loaded from: classes4.dex */
public final class q0 extends androidx.lifecycle.h1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.privacy.revoke.AppBrandUserInfoRevokePage f42366b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f42367c;

    public q0(com.tencent.mm.plugin.appbrand.ui.privacy.revoke.AppBrandUserInfoRevokePage appBrandUserInfoRevokePage, java.lang.String str) {
        this.f42366b = appBrandUserInfoRevokePage;
        this.f42367c = str;
    }

    @Override // androidx.lifecycle.h1, androidx.lifecycle.f1
    public androidx.lifecycle.c1 a(java.lang.Class modelClass) {
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        if (kotlin.jvm.internal.o.b(ck1.s0.class, modelClass)) {
            return new ck1.s0(this.f42366b, this.f42367c, null);
        }
        androidx.lifecycle.c1 a17 = super.a(modelClass);
        kotlin.jvm.internal.o.f(a17, "create(...)");
        return a17;
    }
}
