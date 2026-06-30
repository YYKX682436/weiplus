package com.google.gson.internal.bind;

/* loaded from: classes16.dex */
public final class MapTypeAdapterFactory implements com.google.gson.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.google.gson.internal.r f44719d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f44720e;

    /* loaded from: classes16.dex */
    public final class Adapter<K, V> extends com.google.gson.v {

        /* renamed from: a, reason: collision with root package name */
        public final com.google.gson.v f44721a;

        /* renamed from: b, reason: collision with root package name */
        public final com.google.gson.v f44722b;

        /* renamed from: c, reason: collision with root package name */
        public final com.google.gson.internal.d0 f44723c;

        public Adapter(com.google.gson.i iVar, java.lang.reflect.Type type, com.google.gson.v vVar, java.lang.reflect.Type type2, com.google.gson.v vVar2, com.google.gson.internal.d0 d0Var) {
            this.f44721a = new com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper(iVar, vVar, type);
            this.f44722b = new com.google.gson.internal.bind.TypeAdapterRuntimeTypeWrapper(iVar, vVar2, type2);
            this.f44723c = d0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.gson.v
        public java.lang.Object b(jb.b bVar) {
            jb.c K = bVar.K();
            if (K == jb.c.NULL) {
                bVar.D();
                return null;
            }
            java.util.Map map = (java.util.Map) this.f44723c.a();
            jb.c cVar = jb.c.BEGIN_ARRAY;
            com.google.gson.v vVar = this.f44722b;
            com.google.gson.v vVar2 = this.f44721a;
            if (K == cVar) {
                bVar.a();
                while (bVar.l()) {
                    bVar.a();
                    java.lang.Object b17 = vVar2.b(bVar);
                    if (map.put(b17, vVar.b(bVar)) != null) {
                        throw new com.google.gson.r("duplicate key: " + b17);
                    }
                    bVar.i();
                }
                bVar.i();
            } else {
                bVar.b();
                while (bVar.l()) {
                    ((jb.a) com.google.gson.internal.t.f44824a).getClass();
                    int i17 = bVar.f298648n;
                    if (i17 == 0) {
                        i17 = bVar.f();
                    }
                    if (i17 == 13) {
                        bVar.f298648n = 9;
                    } else if (i17 == 12) {
                        bVar.f298648n = 8;
                    } else {
                        if (i17 != 14) {
                            throw new java.lang.IllegalStateException("Expected a name but was " + bVar.K() + bVar.q());
                        }
                        bVar.f298648n = 10;
                    }
                    java.lang.Object b18 = vVar2.b(bVar);
                    if (map.put(b18, vVar.b(bVar)) != null) {
                        throw new com.google.gson.r("duplicate key: " + b18);
                    }
                }
                bVar.j();
            }
            return map;
        }

        @Override // com.google.gson.v
        public void c(jb.d dVar, java.lang.Object obj) {
            java.lang.String str;
            java.util.Map map = (java.util.Map) obj;
            if (map == null) {
                dVar.p();
                return;
            }
            boolean z17 = com.google.gson.internal.bind.MapTypeAdapterFactory.this.f44720e;
            com.google.gson.v vVar = this.f44722b;
            if (!z17) {
                dVar.c();
                for (java.util.Map.Entry<K, V> entry : map.entrySet()) {
                    dVar.k(java.lang.String.valueOf(entry.getKey()));
                    vVar.c(dVar, entry.getValue());
                }
                dVar.j();
                return;
            }
            java.util.ArrayList arrayList = new java.util.ArrayList(map.size());
            java.util.ArrayList arrayList2 = new java.util.ArrayList(map.size());
            int i17 = 0;
            boolean z18 = false;
            for (java.util.Map.Entry<K, V> entry2 : map.entrySet()) {
                com.google.gson.v vVar2 = this.f44721a;
                K key = entry2.getKey();
                vVar2.getClass();
                try {
                    com.google.gson.internal.bind.b bVar = new com.google.gson.internal.bind.b();
                    vVar2.c(bVar, key);
                    java.util.List list = bVar.f44759r;
                    if (!((java.util.ArrayList) list).isEmpty()) {
                        throw new java.lang.IllegalStateException("Expected one JSON element but was " + list);
                    }
                    com.google.gson.l lVar = bVar.f44761t;
                    arrayList.add(lVar);
                    arrayList2.add(entry2.getValue());
                    lVar.getClass();
                    z18 |= (lVar instanceof com.google.gson.k) || (lVar instanceof com.google.gson.o);
                } catch (java.io.IOException e17) {
                    throw new com.google.gson.m(e17);
                }
            }
            if (z18) {
                dVar.b();
                int size = arrayList.size();
                while (i17 < size) {
                    dVar.b();
                    com.google.gson.internal.bind.e.C.c(dVar, (com.google.gson.l) arrayList.get(i17));
                    vVar.c(dVar, arrayList2.get(i17));
                    dVar.i();
                    i17++;
                }
                dVar.i();
                return;
            }
            dVar.c();
            int size2 = arrayList.size();
            while (i17 < size2) {
                com.google.gson.l lVar2 = (com.google.gson.l) arrayList.get(i17);
                lVar2.getClass();
                boolean z19 = lVar2 instanceof com.google.gson.q;
                if (z19) {
                    if (!z19) {
                        throw new java.lang.IllegalStateException("Not a JSON Primitive: " + lVar2);
                    }
                    com.google.gson.q qVar = (com.google.gson.q) lVar2;
                    java.lang.Object obj2 = qVar.f44842d;
                    if (obj2 instanceof java.lang.Number) {
                        str = java.lang.String.valueOf(qVar.d());
                    } else if (obj2 instanceof java.lang.Boolean) {
                        str = java.lang.Boolean.toString(obj2 instanceof java.lang.Boolean ? ((java.lang.Boolean) obj2).booleanValue() : java.lang.Boolean.parseBoolean(qVar.e()));
                    } else {
                        if (!(obj2 instanceof java.lang.String)) {
                            throw new java.lang.AssertionError();
                        }
                        str = qVar.e();
                    }
                } else {
                    if (!(lVar2 instanceof com.google.gson.n)) {
                        throw new java.lang.AssertionError();
                    }
                    str = "null";
                }
                dVar.k(str);
                vVar.c(dVar, arrayList2.get(i17));
                i17++;
            }
            dVar.j();
        }
    }

    public MapTypeAdapterFactory(com.google.gson.internal.r rVar, boolean z17) {
        this.f44719d = rVar;
        this.f44720e = z17;
    }

    @Override // com.google.gson.w
    public com.google.gson.v a(com.google.gson.i iVar, ib.a aVar) {
        java.lang.reflect.Type[] actualTypeArguments;
        java.lang.reflect.Type type = aVar.f290022b;
        if (!java.util.Map.class.isAssignableFrom(aVar.f290021a)) {
            return null;
        }
        java.lang.Class e17 = com.google.gson.internal.e.e(type);
        if (type == java.util.Properties.class) {
            actualTypeArguments = new java.lang.reflect.Type[]{java.lang.String.class, java.lang.String.class};
        } else {
            java.lang.reflect.Type f17 = com.google.gson.internal.e.f(type, e17, java.util.Map.class);
            actualTypeArguments = f17 instanceof java.lang.reflect.ParameterizedType ? ((java.lang.reflect.ParameterizedType) f17).getActualTypeArguments() : new java.lang.reflect.Type[]{java.lang.Object.class, java.lang.Object.class};
        }
        java.lang.reflect.Type type2 = actualTypeArguments[0];
        return new com.google.gson.internal.bind.MapTypeAdapterFactory.Adapter(iVar, actualTypeArguments[0], (type2 == java.lang.Boolean.TYPE || type2 == java.lang.Boolean.class) ? com.google.gson.internal.bind.e.f44773c : iVar.d(new ib.a(type2)), actualTypeArguments[1], iVar.d(new ib.a(actualTypeArguments[1])), this.f44719d.a(aVar));
    }
}
