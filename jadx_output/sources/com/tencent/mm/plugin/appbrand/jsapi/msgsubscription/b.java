package com.tencent.mm.plugin.appbrand.jsapi.msgsubscription;

/* loaded from: classes9.dex */
public final class b implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o31.b f82321a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o31.e f82322b;

    public b(o31.b bVar, o31.e eVar) {
        this.f82321a = bVar;
        this.f82322b = eVar;
    }

    @Override // km5.e
    public final void a(java.lang.Object obj) {
        java.lang.String obj2 = obj != null ? obj.toString() : null;
        o31.b bVar = this.f82321a;
        if (bVar != null) {
            ((f31.f) bVar).b(1, -1, obj2, this.f82322b);
        }
    }
}
