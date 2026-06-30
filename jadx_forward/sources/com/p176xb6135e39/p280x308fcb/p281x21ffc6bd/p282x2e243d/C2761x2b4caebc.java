package com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d;

/* renamed from: com.google.gson.internal.bind.ArrayTypeAdapter */
/* loaded from: classes16.dex */
public final class C2761x2b4caebc<E> extends com.p176xb6135e39.p280x308fcb.v {

    /* renamed from: c, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.w f126243c = new com.p176xb6135e39.p280x308fcb.w() { // from class: com.google.gson.internal.bind.ArrayTypeAdapter.1
        @Override // com.p176xb6135e39.p280x308fcb.w
        public com.p176xb6135e39.p280x308fcb.v a(com.p176xb6135e39.p280x308fcb.i iVar, ib.a aVar) {
            java.lang.reflect.Type type = aVar.f371555b;
            boolean z17 = type instanceof java.lang.reflect.GenericArrayType;
            if (!z17 && (!(type instanceof java.lang.Class) || !((java.lang.Class) type).isArray())) {
                return null;
            }
            java.lang.reflect.Type genericComponentType = z17 ? ((java.lang.reflect.GenericArrayType) type).getGenericComponentType() : ((java.lang.Class) type).getComponentType();
            return new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2761x2b4caebc(iVar, iVar.d(new ib.a(genericComponentType)), com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.e(genericComponentType));
        }
    };

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f126244a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p176xb6135e39.p280x308fcb.v f126245b;

    public C2761x2b4caebc(com.p176xb6135e39.p280x308fcb.i iVar, com.p176xb6135e39.p280x308fcb.v vVar, java.lang.Class cls) {
        this.f126245b = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2771x76959876(iVar, vVar, cls);
        this.f126244a = cls;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.p176xb6135e39.p280x308fcb.v
    public java.lang.Object b(jb.b bVar) {
        if (bVar.K() == jb.c.NULL) {
            bVar.D();
            return null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        bVar.a();
        while (bVar.l()) {
            arrayList.add(this.f126245b.b(bVar));
        }
        bVar.i();
        int size = arrayList.size();
        java.lang.Object newInstance = java.lang.reflect.Array.newInstance((java.lang.Class<?>) this.f126244a, size);
        for (int i17 = 0; i17 < size; i17++) {
            java.lang.reflect.Array.set(newInstance, i17, arrayList.get(i17));
        }
        return newInstance;
    }

    @Override // com.p176xb6135e39.p280x308fcb.v
    public void c(jb.d dVar, java.lang.Object obj) {
        if (obj == null) {
            dVar.p();
            return;
        }
        dVar.b();
        int length = java.lang.reflect.Array.getLength(obj);
        for (int i17 = 0; i17 < length; i17++) {
            this.f126245b.c(dVar, java.lang.reflect.Array.get(obj, i17));
        }
        dVar.i();
    }
}
