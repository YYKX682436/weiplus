package com.tencent.mm.plugin.appbrand.app;

/* loaded from: classes7.dex */
public final class b implements java.util.function.Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f75019a;

    public b(android.app.Activity activity) {
        this.f75019a = activity;
    }

    @Override // java.util.function.Predicate
    public boolean test(java.lang.Object obj) {
        cf.a it = (cf.a) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return kotlin.jvm.internal.o.b((android.app.Activity) it.f40816b.get(), this.f75019a);
    }
}
