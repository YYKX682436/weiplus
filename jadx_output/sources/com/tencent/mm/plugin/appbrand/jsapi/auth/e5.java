package com.tencent.mm.plugin.appbrand.jsapi.auth;

/* loaded from: classes7.dex */
public final class e5 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f79450d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Instrumentation.ActivityResult f79451e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(yz5.l lVar, android.app.Instrumentation.ActivityResult activityResult) {
        super(0);
        this.f79450d = lVar;
        this.f79451e = activityResult;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        yz5.l lVar = this.f79450d;
        if (lVar != null) {
            lVar.invoke(this.f79451e);
        }
        return jz5.f0.f302826a;
    }
}
