package com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d;

/* renamed from: com.google.gson.internal.bind.MapTypeAdapterFactory */
/* loaded from: classes16.dex */
public final class C2765x73f65ef1 implements com.p176xb6135e39.p280x308fcb.w {

    /* renamed from: d, reason: collision with root package name */
    public final com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.r f126252d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f126253e;

    /* renamed from: com.google.gson.internal.bind.MapTypeAdapterFactory$Adapter */
    /* loaded from: classes16.dex */
    public final class Adapter<K, V> extends com.p176xb6135e39.p280x308fcb.v {

        /* renamed from: a, reason: collision with root package name */
        public final com.p176xb6135e39.p280x308fcb.v f126254a;

        /* renamed from: b, reason: collision with root package name */
        public final com.p176xb6135e39.p280x308fcb.v f126255b;

        /* renamed from: c, reason: collision with root package name */
        public final com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.d0 f126256c;

        public Adapter(com.p176xb6135e39.p280x308fcb.i iVar, java.lang.reflect.Type type, com.p176xb6135e39.p280x308fcb.v vVar, java.lang.reflect.Type type2, com.p176xb6135e39.p280x308fcb.v vVar2, com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.d0 d0Var) {
            this.f126254a = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2771x76959876(iVar, vVar, type);
            this.f126255b = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2771x76959876(iVar, vVar2, type2);
            this.f126256c = d0Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.p176xb6135e39.p280x308fcb.v
        public java.lang.Object b(jb.b bVar) {
            jb.c K = bVar.K();
            if (K == jb.c.NULL) {
                bVar.D();
                return null;
            }
            java.util.Map map = (java.util.Map) this.f126256c.a();
            jb.c cVar = jb.c.BEGIN_ARRAY;
            com.p176xb6135e39.p280x308fcb.v vVar = this.f126255b;
            com.p176xb6135e39.p280x308fcb.v vVar2 = this.f126254a;
            if (K == cVar) {
                bVar.a();
                while (bVar.l()) {
                    bVar.a();
                    java.lang.Object b17 = vVar2.b(bVar);
                    if (map.put(b17, vVar.b(bVar)) != null) {
                        throw new com.p176xb6135e39.p280x308fcb.r("duplicate key: " + b17);
                    }
                    bVar.i();
                }
                bVar.i();
            } else {
                bVar.b();
                while (bVar.l()) {
                    ((jb.a) com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.t.f126357a).getClass();
                    int i17 = bVar.f380181n;
                    if (i17 == 0) {
                        i17 = bVar.f();
                    }
                    if (i17 == 13) {
                        bVar.f380181n = 9;
                    } else if (i17 == 12) {
                        bVar.f380181n = 8;
                    } else {
                        if (i17 != 14) {
                            throw new java.lang.IllegalStateException("Expected a name but was " + bVar.K() + bVar.q());
                        }
                        bVar.f380181n = 10;
                    }
                    java.lang.Object b18 = vVar2.b(bVar);
                    if (map.put(b18, vVar.b(bVar)) != null) {
                        throw new com.p176xb6135e39.p280x308fcb.r("duplicate key: " + b18);
                    }
                }
                bVar.j();
            }
            return map;
        }

        @Override // com.p176xb6135e39.p280x308fcb.v
        public void c(jb.d dVar, java.lang.Object obj) {
            java.lang.String str;
            java.util.Map map = (java.util.Map) obj;
            if (map == null) {
                dVar.p();
                return;
            }
            boolean z17 = com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2765x73f65ef1.this.f126253e;
            com.p176xb6135e39.p280x308fcb.v vVar = this.f126255b;
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
                com.p176xb6135e39.p280x308fcb.v vVar2 = this.f126254a;
                K key = entry2.getKey();
                vVar2.getClass();
                try {
                    com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.b bVar = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.b();
                    vVar2.c(bVar, key);
                    java.util.List list = bVar.f126292r;
                    if (!((java.util.ArrayList) list).isEmpty()) {
                        throw new java.lang.IllegalStateException("Expected one JSON element but was " + list);
                    }
                    com.p176xb6135e39.p280x308fcb.l lVar = bVar.f126294t;
                    arrayList.add(lVar);
                    arrayList2.add(entry2.getValue());
                    lVar.getClass();
                    z18 |= (lVar instanceof com.p176xb6135e39.p280x308fcb.k) || (lVar instanceof com.p176xb6135e39.p280x308fcb.o);
                } catch (java.io.IOException e17) {
                    throw new com.p176xb6135e39.p280x308fcb.m(e17);
                }
            }
            if (z18) {
                dVar.b();
                int size = arrayList.size();
                while (i17 < size) {
                    dVar.b();
                    com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.C.c(dVar, (com.p176xb6135e39.p280x308fcb.l) arrayList.get(i17));
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
                com.p176xb6135e39.p280x308fcb.l lVar2 = (com.p176xb6135e39.p280x308fcb.l) arrayList.get(i17);
                lVar2.getClass();
                boolean z19 = lVar2 instanceof com.p176xb6135e39.p280x308fcb.q;
                if (z19) {
                    if (!z19) {
                        throw new java.lang.IllegalStateException("Not a JSON Primitive: " + lVar2);
                    }
                    com.p176xb6135e39.p280x308fcb.q qVar = (com.p176xb6135e39.p280x308fcb.q) lVar2;
                    java.lang.Object obj2 = qVar.f126375d;
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
                    if (!(lVar2 instanceof com.p176xb6135e39.p280x308fcb.n)) {
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

    public C2765x73f65ef1(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.r rVar, boolean z17) {
        this.f126252d = rVar;
        this.f126253e = z17;
    }

    @Override // com.p176xb6135e39.p280x308fcb.w
    public com.p176xb6135e39.p280x308fcb.v a(com.p176xb6135e39.p280x308fcb.i iVar, ib.a aVar) {
        java.lang.reflect.Type[] actualTypeArguments;
        java.lang.reflect.Type type = aVar.f371555b;
        if (!java.util.Map.class.isAssignableFrom(aVar.f371554a)) {
            return null;
        }
        java.lang.Class e17 = com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.e(type);
        if (type == java.util.Properties.class) {
            actualTypeArguments = new java.lang.reflect.Type[]{java.lang.String.class, java.lang.String.class};
        } else {
            java.lang.reflect.Type f17 = com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.e.f(type, e17, java.util.Map.class);
            actualTypeArguments = f17 instanceof java.lang.reflect.ParameterizedType ? ((java.lang.reflect.ParameterizedType) f17).getActualTypeArguments() : new java.lang.reflect.Type[]{java.lang.Object.class, java.lang.Object.class};
        }
        java.lang.reflect.Type type2 = actualTypeArguments[0];
        return new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2765x73f65ef1.Adapter(iVar, actualTypeArguments[0], (type2 == java.lang.Boolean.TYPE || type2 == java.lang.Boolean.class) ? com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.f126306c : iVar.d(new ib.a(type2)), actualTypeArguments[1], iVar.d(new ib.a(actualTypeArguments[1])), this.f126252d.a(aVar));
    }
}
