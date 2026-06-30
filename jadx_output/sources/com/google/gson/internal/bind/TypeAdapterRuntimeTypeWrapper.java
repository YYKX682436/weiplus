package com.google.gson.internal.bind;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes16.dex */
public final class TypeAdapterRuntimeTypeWrapper<T> extends com.google.gson.v {

    /* renamed from: a, reason: collision with root package name */
    public final com.google.gson.i f44739a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.gson.v f44740b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.reflect.Type f44741c;

    public TypeAdapterRuntimeTypeWrapper(com.google.gson.i iVar, com.google.gson.v vVar, java.lang.reflect.Type type) {
        this.f44739a = iVar;
        this.f44740b = vVar;
        this.f44741c = type;
    }

    @Override // com.google.gson.v
    public java.lang.Object b(jb.b bVar) {
        return this.f44740b.b(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.reflect.Type] */
    @Override // com.google.gson.v
    public void c(jb.d dVar, java.lang.Object obj) {
        ?? r07 = this.f44741c;
        java.lang.Class<?> cls = (obj == null || !(r07 == java.lang.Object.class || (r07 instanceof java.lang.reflect.TypeVariable) || (r07 instanceof java.lang.Class))) ? r07 : obj.getClass();
        com.google.gson.v vVar = this.f44740b;
        if (cls != r07) {
            com.google.gson.v d17 = this.f44739a.d(new ib.a(cls));
            if (!(d17 instanceof com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter) || (vVar instanceof com.google.gson.internal.bind.ReflectiveTypeAdapterFactory.Adapter)) {
                vVar = d17;
            }
        }
        vVar.c(dVar, obj);
    }
}
