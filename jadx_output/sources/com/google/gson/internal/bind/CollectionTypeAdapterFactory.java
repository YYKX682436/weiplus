package com.google.gson.internal.bind;

/* loaded from: classes16.dex */
public final class CollectionTypeAdapterFactory implements com.google.gson.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.google.gson.internal.r f44713d;

    /* loaded from: classes16.dex */
    public static final class Adapter<E> extends com.google.gson.v {

        /* renamed from: a, reason: collision with root package name */
        public final com.google.gson.v f44714a;

        /* renamed from: b, reason: collision with root package name */
        public final com.google.gson.internal.d0 f44715b;

        public Adapter(com.google.gson.i iVar, java.lang.reflect.Type type, com.google.gson.v vVar, com.google.gson.internal.d0 d0Var) {
            this.f44714a = new com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper(iVar, vVar, type);
            this.f44715b = d0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.v
        public java.lang.Object b(jb.b bVar) {
            if (bVar.K() == jb.c.NULL) {
                bVar.D();
                return null;
            }
            java.util.Collection collection = (java.util.Collection) this.f44715b.a();
            bVar.a();
            while (bVar.l()) {
                collection.add(this.f44714a.b(bVar));
            }
            bVar.i();
            return collection;
        }

        @Override // com.google.gson.v
        public void c(jb.d dVar, java.lang.Object obj) {
            java.util.Collection collection = (java.util.Collection) obj;
            if (collection == null) {
                dVar.p();
                return;
            }
            dVar.b();
            java.util.Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f44714a.c(dVar, it.next());
            }
            dVar.i();
        }
    }

    public CollectionTypeAdapterFactory(com.google.gson.internal.r rVar) {
        this.f44713d = rVar;
    }

    @Override // com.google.gson.w
    public com.google.gson.v a(com.google.gson.i iVar, ib.a aVar) {
        java.lang.reflect.Type type = aVar.f290022b;
        java.lang.Class cls = aVar.f290021a;
        if (!java.util.Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        java.lang.reflect.Type f17 = com.google.gson.internal.e.f(type, cls, java.util.Collection.class);
        if (f17 instanceof java.lang.reflect.WildcardType) {
            f17 = ((java.lang.reflect.WildcardType) f17).getUpperBounds()[0];
        }
        java.lang.Class cls2 = f17 instanceof java.lang.reflect.ParameterizedType ? ((java.lang.reflect.ParameterizedType) f17).getActualTypeArguments()[0] : java.lang.Object.class;
        return new com.google.gson.internal.bind.CollectionTypeAdapterFactory.Adapter(iVar, cls2, iVar.d(new ib.a(cls2)), this.f44713d.a(aVar));
    }
}
