package com.google.gson.internal.bind;

/* loaded from: classes16.dex */
public final class ArrayTypeAdapter<E> extends com.google.gson.v {

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.gson.w f44710c = new com.google.gson.w() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.google.gson.w
        public com.google.gson.v a(com.google.gson.i iVar, ib.a aVar) {
            java.lang.reflect.Type type = aVar.f290022b;
            boolean z17 = type instanceof java.lang.reflect.GenericArrayType;
            if (!z17 && (!(type instanceof java.lang.Class) || !((java.lang.Class) type).isArray())) {
                return null;
            }
            java.lang.reflect.Type genericComponentType = z17 ? ((java.lang.reflect.GenericArrayType) type).getGenericComponentType() : ((java.lang.Class) type).getComponentType();
            return new com.google.gson.internal.bind.ArrayTypeAdapter(iVar, iVar.d(new ib.a(genericComponentType)), com.google.gson.internal.e.e(genericComponentType));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f44711a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.gson.v f44712b;

    public ArrayTypeAdapter(com.google.gson.i iVar, com.google.gson.v vVar, java.lang.Class cls) {
        this.f44712b = new com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper(iVar, vVar, cls);
        this.f44711a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.gson.v
    public java.lang.Object b(jb.b bVar) {
        if (bVar.K() == jb.c.NULL) {
            bVar.D();
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        bVar.a();
        while (bVar.l()) {
            arrayList.add(this.f44712b.b(bVar));
        }
        bVar.i();
        int size = arrayList.size();
        java.lang.Object newInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.f44711a, size);
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.reflect.Array.set(newInstance, i17, arrayList.get(i17));
        }
        return newInstance;
    }

    @Override // com.google.gson.v
    public void c(jb.d dVar, java.lang.Object obj) {
        if (obj == null) {
            dVar.p();
            return;
        }
        dVar.b();
        int length = java.lang.reflect.Array.getLength(obj);
        for (int i17 = 0; i17 < length; i17++) {
            this.f44712b.c(dVar, java.lang.reflect.Array.get(obj, i17));
        }
        dVar.i();
    }
}
