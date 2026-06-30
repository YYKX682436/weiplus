package com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d;

/* renamed from: com.google.gson.internal.bind.CollectionTypeAdapterFactory */
/* loaded from: classes16.dex */
public final class C2762x63851ff3 implements com.p176xb6135e39.p280x308fcb.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.r f126246d;

    /* renamed from: com.google.gson.internal.bind.CollectionTypeAdapterFactory$Adapter */
    /* loaded from: classes16.dex */
    public static final class Adapter<E> extends com.p176xb6135e39.p280x308fcb.v {

        /* renamed from: a, reason: collision with root package name */
        public final com.p176xb6135e39.p280x308fcb.v f126247a;

        /* renamed from: b, reason: collision with root package name */
        public final com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.d0 f126248b;

        public Adapter(com.p176xb6135e39.p280x308fcb.i iVar, java.lang.reflect.Type type, com.p176xb6135e39.p280x308fcb.v vVar, com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.d0 d0Var) {
            this.f126247a = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2771x76959876(iVar, vVar, type);
            this.f126248b = d0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p176xb6135e39.p280x308fcb.v
        public java.lang.Object b(jb.b bVar) {
            if (bVar.K() == jb.c.NULL) {
                bVar.D();
                return null;
            }
            java.util.Collection collection = (java.util.Collection) this.f126248b.a();
            bVar.a();
            while (bVar.l()) {
                collection.add(this.f126247a.b(bVar));
            }
            bVar.i();
            return collection;
        }

        @Override // com.p176xb6135e39.p280x308fcb.v
        public void c(jb.d dVar, java.lang.Object obj) {
            java.util.Collection collection = (java.util.Collection) obj;
            if (collection == null) {
                dVar.p();
                return;
            }
            dVar.b();
            java.util.Iterator<E> it = collection.iterator();
            while (it.hasNext()) {
                this.f126247a.c(dVar, it.next());
            }
            dVar.i();
        }
    }

    public C2762x63851ff3(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.r rVar) {
        this.f126246d = rVar;
    }

    @Override // com.p176xb6135e39.p280x308fcb.w
    public com.p176xb6135e39.p280x308fcb.v a(com.p176xb6135e39.p280x308fcb.i iVar, ib.a aVar) {
        java.lang.reflect.Type type = aVar.f371555b;
        java.lang.Class cls = aVar.f371554a;
        if (!java.util.Collection.class.isAssignableFrom(cls)) {
            return null;
        }
        java.lang.reflect.Type f17 = com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.f(type, cls, java.util.Collection.class);
        if (f17 instanceof java.lang.reflect.WildcardType) {
            f17 = ((java.lang.reflect.WildcardType) f17).getUpperBounds()[0];
        }
        java.lang.Class cls2 = f17 instanceof java.lang.reflect.ParameterizedType ? ((java.lang.reflect.ParameterizedType) f17).getActualTypeArguments()[0] : java.lang.Object.class;
        return new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2762x63851ff3.Adapter(iVar, cls2, iVar.d(new ib.a(cls2)), this.f126246d.a(aVar));
    }
}
