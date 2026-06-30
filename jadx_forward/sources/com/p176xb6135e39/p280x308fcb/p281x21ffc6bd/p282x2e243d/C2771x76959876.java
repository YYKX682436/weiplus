package com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper */
/* loaded from: classes16.dex */
public final class C2771x76959876<T> extends com.p176xb6135e39.p280x308fcb.v {

    /* renamed from: a, reason: collision with root package name */
    public final com.p176xb6135e39.p280x308fcb.i f126272a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p176xb6135e39.p280x308fcb.v f126273b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Type f126274c;

    public C2771x76959876(com.p176xb6135e39.p280x308fcb.i iVar, com.p176xb6135e39.p280x308fcb.v vVar, java.lang.reflect.Type type) {
        this.f126272a = iVar;
        this.f126273b = vVar;
        this.f126274c = type;
    }

    @Override // com.p176xb6135e39.p280x308fcb.v
    public java.lang.Object b(jb.b bVar) {
        return this.f126273b.b(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.Type] */
    @Override // com.p176xb6135e39.p280x308fcb.v
    public void c(jb.d dVar, java.lang.Object obj) {
        ?? r07 = this.f126274c;
        java.lang.Class<?> cls = (obj == null || !(r07 == java.lang.Object.class || (r07 instanceof java.lang.reflect.TypeVariable) || (r07 instanceof java.lang.Class))) ? r07 : obj.getClass();
        com.p176xb6135e39.p280x308fcb.v vVar = this.f126273b;
        if (cls != r07) {
            com.p176xb6135e39.p280x308fcb.v d17 = this.f126272a.d(new ib.a(cls));
            if (!(d17 instanceof com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2767x51f16110.Adapter) || (vVar instanceof com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2767x51f16110.Adapter)) {
                vVar = d17;
            }
        }
        vVar.c(dVar, obj);
    }
}
