package com.google.gson;

/* loaded from: classes16.dex */
public final class i {

    /* renamed from: k, reason: collision with root package name */
    public static final ib.a f44674k = new ib.a(java.lang.Object.class);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ThreadLocal f44675a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f44676b;

    /* renamed from: c, reason: collision with root package name */
    public final com.google.gson.internal.r f44677c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory f44678d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f44679e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f44680f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f44681g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f44682h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f44683i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f44684j;

    public i() {
        this(com.google.gson.internal.Excluder.f44685i, com.google.gson.g.f44672d, java.util.Collections.emptyMap(), false, false, false, true, false, false, false, com.google.gson.u.f44843d, null, 2, 2, java.util.Collections.emptyList(), java.util.Collections.emptyList(), java.util.Collections.emptyList());
    }

    public static void a(double d17) {
        if (java.lang.Double.isNaN(d17) || java.lang.Double.isInfinite(d17)) {
            throw new java.lang.IllegalArgumentException(d17 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
        }
    }

    public java.lang.Object b(java.lang.String str, java.lang.Class cls) {
        java.lang.Object c17 = c(str, cls);
        if (cls == java.lang.Integer.TYPE) {
            cls = java.lang.Integer.class;
        } else if (cls == java.lang.Float.TYPE) {
            cls = java.lang.Float.class;
        } else if (cls == java.lang.Byte.TYPE) {
            cls = java.lang.Byte.class;
        } else if (cls == java.lang.Double.TYPE) {
            cls = java.lang.Double.class;
        } else if (cls == java.lang.Long.TYPE) {
            cls = java.lang.Long.class;
        } else if (cls == java.lang.Character.TYPE) {
            cls = java.lang.Character.class;
        } else if (cls == java.lang.Boolean.TYPE) {
            cls = java.lang.Boolean.class;
        } else if (cls == java.lang.Short.TYPE) {
            cls = java.lang.Short.class;
        } else if (cls == java.lang.Void.TYPE) {
            cls = java.lang.Void.class;
        }
        return cls.cast(c17);
    }

    public java.lang.Object c(java.lang.String str, java.lang.reflect.Type type) {
        java.lang.Object obj = null;
        if (str == null) {
            return null;
        }
        jb.b bVar = new jb.b(new java.io.StringReader(str));
        boolean z17 = this.f44684j;
        boolean z18 = true;
        bVar.f298642e = true;
        try {
            try {
                try {
                    bVar.K();
                    z18 = false;
                    obj = d(new ib.a(type)).b(bVar);
                } finally {
                    bVar.f298642e = z17;
                }
            } catch (java.io.EOFException e17) {
                if (!z18) {
                    throw new com.google.gson.r(e17);
                }
            } catch (java.lang.AssertionError e18) {
                java.lang.AssertionError assertionError = new java.lang.AssertionError("AssertionError (GSON 2.8.6): " + e18.getMessage());
                assertionError.initCause(e18);
                throw assertionError;
            }
            if (obj != null) {
                try {
                    if (bVar.K() != jb.c.END_DOCUMENT) {
                        throw new com.google.gson.m("JSON document was not fully consumed.");
                    }
                } catch (jb.e e19) {
                    throw new com.google.gson.r(e19);
                } catch (java.io.IOException e27) {
                    throw new com.google.gson.m(e27);
                }
            }
            return obj;
        } catch (java.io.IOException e28) {
            throw new com.google.gson.r(e28);
        } catch (java.lang.IllegalStateException e29) {
            throw new com.google.gson.r(e29);
        }
    }

    public com.google.gson.v d(ib.a aVar) {
        boolean z17;
        java.util.Map map = this.f44676b;
        com.google.gson.v vVar = (com.google.gson.v) ((java.util.concurrent.ConcurrentHashMap) map).get(aVar == null ? f44674k : aVar);
        if (vVar != null) {
            return vVar;
        }
        java.lang.ThreadLocal threadLocal = this.f44675a;
        java.util.Map map2 = (java.util.Map) threadLocal.get();
        if (map2 == null) {
            map2 = new java.util.HashMap();
            threadLocal.set(map2);
            z17 = true;
        } else {
            z17 = false;
        }
        com.google.gson.Gson$FutureTypeAdapter gson$FutureTypeAdapter = (com.google.gson.Gson$FutureTypeAdapter) map2.get(aVar);
        if (gson$FutureTypeAdapter != null) {
            return gson$FutureTypeAdapter;
        }
        try {
            com.google.gson.Gson$FutureTypeAdapter gson$FutureTypeAdapter2 = new com.google.gson.Gson$FutureTypeAdapter();
            map2.put(aVar, gson$FutureTypeAdapter2);
            java.util.Iterator it = this.f44679e.iterator();
            while (it.hasNext()) {
                com.google.gson.v a17 = ((com.google.gson.w) it.next()).a(this, aVar);
                if (a17 != null) {
                    if (gson$FutureTypeAdapter2.f44670a != null) {
                        throw new java.lang.AssertionError();
                    }
                    gson$FutureTypeAdapter2.f44670a = a17;
                    ((java.util.concurrent.ConcurrentHashMap) map).put(aVar, a17);
                    return a17;
                }
            }
            throw new java.lang.IllegalArgumentException("GSON (2.8.6) cannot handle " + aVar);
        } finally {
            map2.remove(aVar);
            if (z17) {
                threadLocal.remove();
            }
        }
    }

    public com.google.gson.v e(com.google.gson.w wVar, ib.a aVar) {
        java.util.List<com.google.gson.w> list = this.f44679e;
        if (!list.contains(wVar)) {
            wVar = this.f44678d;
        }
        boolean z17 = false;
        for (com.google.gson.w wVar2 : list) {
            if (z17) {
                com.google.gson.v a17 = wVar2.a(this, aVar);
                if (a17 != null) {
                    return a17;
                }
            } else if (wVar2 == wVar) {
                z17 = true;
            }
        }
        throw new java.lang.IllegalArgumentException("GSON cannot serialize " + aVar);
    }

    public jb.d f(java.io.Writer writer) {
        if (this.f44681g) {
            writer.write(")]}'\n");
        }
        jb.d dVar = new jb.d(writer);
        if (this.f44683i) {
            dVar.f298672g = "  ";
            dVar.f298673h = ": ";
        }
        dVar.f298677o = this.f44680f;
        return dVar;
    }

    public java.lang.String g(java.lang.Object obj) {
        if (obj == null) {
            com.google.gson.l lVar = com.google.gson.n.f44840d;
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            try {
                h(lVar, f(stringWriter));
                return stringWriter.toString();
            } catch (java.io.IOException e17) {
                throw new com.google.gson.m(e17);
            }
        }
        java.lang.reflect.Type type = obj.getClass();
        java.io.StringWriter stringWriter2 = new java.io.StringWriter();
        try {
            i(obj, type, f(stringWriter2));
            return stringWriter2.toString();
        } catch (java.io.IOException e18) {
            throw new com.google.gson.m(e18);
        }
    }

    public void h(com.google.gson.l lVar, jb.d dVar) {
        boolean z17 = dVar.f298674i;
        dVar.f298674i = true;
        boolean z18 = dVar.f298675m;
        dVar.f298675m = this.f44682h;
        boolean z19 = dVar.f298677o;
        dVar.f298677o = this.f44680f;
        try {
            try {
                com.google.gson.internal.bind.e.C.c(dVar, lVar);
            } catch (java.io.IOException e17) {
                throw new com.google.gson.m(e17);
            } catch (java.lang.AssertionError e18) {
                java.lang.AssertionError assertionError = new java.lang.AssertionError("AssertionError (GSON 2.8.6): " + e18.getMessage());
                assertionError.initCause(e18);
                throw assertionError;
            }
        } finally {
            dVar.f298674i = z17;
            dVar.f298675m = z18;
            dVar.f298677o = z19;
        }
    }

    public void i(java.lang.Object obj, java.lang.reflect.Type type, jb.d dVar) {
        com.google.gson.v d17 = d(new ib.a(type));
        boolean z17 = dVar.f298674i;
        dVar.f298674i = true;
        boolean z18 = dVar.f298675m;
        dVar.f298675m = this.f44682h;
        boolean z19 = dVar.f298677o;
        dVar.f298677o = this.f44680f;
        try {
            try {
                d17.c(dVar, obj);
            } catch (java.io.IOException e17) {
                throw new com.google.gson.m(e17);
            } catch (java.lang.AssertionError e18) {
                java.lang.AssertionError assertionError = new java.lang.AssertionError("AssertionError (GSON 2.8.6): " + e18.getMessage());
                assertionError.initCause(e18);
                throw assertionError;
            }
        } finally {
            dVar.f298674i = z17;
            dVar.f298675m = z18;
            dVar.f298677o = z19;
        }
    }

    public java.lang.String toString() {
        return "{serializeNulls:" + this.f44680f + ",factories:" + this.f44679e + ",instanceCreators:" + this.f44677c + "}";
    }

    public i(com.google.gson.internal.Excluder excluder, com.google.gson.h hVar, java.util.Map map, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29, boolean z37, com.google.gson.u uVar, java.lang.String str, int i17, int i18, java.util.List list, java.util.List list2, java.util.List list3) {
        final com.google.gson.v vVar;
        com.google.gson.v vVar2;
        com.google.gson.v vVar3;
        this.f44675a = new java.lang.ThreadLocal();
        this.f44676b = new java.util.concurrent.ConcurrentHashMap();
        com.google.gson.internal.r rVar = new com.google.gson.internal.r(map);
        this.f44677c = rVar;
        this.f44680f = z17;
        this.f44681g = z19;
        this.f44682h = z27;
        this.f44683i = z28;
        this.f44684j = z29;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(com.google.gson.internal.bind.e.D);
        arrayList.add(com.google.gson.internal.bind.ObjectTypeAdapter.f44725b);
        arrayList.add(excluder);
        arrayList.addAll(list3);
        arrayList.add(com.google.gson.internal.bind.e.f44788r);
        arrayList.add(com.google.gson.internal.bind.e.f44777g);
        arrayList.add(com.google.gson.internal.bind.e.f44774d);
        arrayList.add(com.google.gson.internal.bind.e.f44775e);
        arrayList.add(com.google.gson.internal.bind.e.f44776f);
        if (uVar == com.google.gson.u.f44843d) {
            vVar = com.google.gson.internal.bind.e.f44781k;
        } else {
            vVar = new com.google.gson.v() { // from class: com.google.gson.Gson$3
                @Override // com.google.gson.v
                public java.lang.Object b(jb.b bVar) {
                    if (bVar.K() != jb.c.NULL) {
                        return java.lang.Long.valueOf(bVar.z());
                    }
                    bVar.D();
                    return null;
                }

                @Override // com.google.gson.v
                public void c(jb.d dVar, java.lang.Object obj) {
                    java.lang.Number number = (java.lang.Number) obj;
                    if (number == null) {
                        dVar.p();
                    } else {
                        dVar.A(number.toString());
                    }
                }
            };
        }
        arrayList.add(com.google.gson.internal.bind.e.b(java.lang.Long.TYPE, java.lang.Long.class, vVar));
        java.lang.Class cls = java.lang.Double.TYPE;
        if (z37) {
            vVar2 = com.google.gson.internal.bind.e.f44783m;
        } else {
            vVar2 = new com.google.gson.v(this) { // from class: com.google.gson.Gson$1
                @Override // com.google.gson.v
                public java.lang.Object b(jb.b bVar) {
                    if (bVar.K() != jb.c.NULL) {
                        return java.lang.Double.valueOf(bVar.w());
                    }
                    bVar.D();
                    return null;
                }

                @Override // com.google.gson.v
                public void c(jb.d dVar, java.lang.Object obj) {
                    java.lang.Number number = (java.lang.Number) obj;
                    if (number == null) {
                        dVar.p();
                    } else {
                        com.google.gson.i.a(number.doubleValue());
                        dVar.z(number);
                    }
                }
            };
        }
        arrayList.add(com.google.gson.internal.bind.e.b(cls, java.lang.Double.class, vVar2));
        java.lang.Class cls2 = java.lang.Float.TYPE;
        if (z37) {
            vVar3 = com.google.gson.internal.bind.e.f44782l;
        } else {
            vVar3 = new com.google.gson.v(this) { // from class: com.google.gson.Gson$2
                @Override // com.google.gson.v
                public java.lang.Object b(jb.b bVar) {
                    if (bVar.K() != jb.c.NULL) {
                        return java.lang.Float.valueOf((float) bVar.w());
                    }
                    bVar.D();
                    return null;
                }

                @Override // com.google.gson.v
                public void c(jb.d dVar, java.lang.Object obj) {
                    java.lang.Number number = (java.lang.Number) obj;
                    if (number == null) {
                        dVar.p();
                    } else {
                        com.google.gson.i.a(number.floatValue());
                        dVar.z(number);
                    }
                }
            };
        }
        arrayList.add(com.google.gson.internal.bind.e.b(cls2, java.lang.Float.class, vVar3));
        arrayList.add(com.google.gson.internal.bind.e.f44784n);
        arrayList.add(com.google.gson.internal.bind.e.f44778h);
        arrayList.add(com.google.gson.internal.bind.e.f44779i);
        arrayList.add(com.google.gson.internal.bind.e.a(java.util.concurrent.atomic.AtomicLong.class, new com.google.gson.TypeAdapter$1(new com.google.gson.v() { // from class: com.google.gson.Gson$4
            @Override // com.google.gson.v
            public java.lang.Object b(jb.b bVar) {
                return new java.util.concurrent.atomic.AtomicLong(((java.lang.Number) com.google.gson.v.this.b(bVar)).longValue());
            }

            @Override // com.google.gson.v
            public void c(jb.d dVar, java.lang.Object obj) {
                com.google.gson.v.this.c(dVar, java.lang.Long.valueOf(((java.util.concurrent.atomic.AtomicLong) obj).get()));
            }
        })));
        arrayList.add(com.google.gson.internal.bind.e.a(java.util.concurrent.atomic.AtomicLongArray.class, new com.google.gson.TypeAdapter$1(new com.google.gson.v() { // from class: com.google.gson.Gson$5
            @Override // com.google.gson.v
            public java.lang.Object b(jb.b bVar) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                bVar.a();
                while (bVar.l()) {
                    arrayList2.add(java.lang.Long.valueOf(((java.lang.Number) com.google.gson.v.this.b(bVar)).longValue()));
                }
                bVar.i();
                int size = arrayList2.size();
                java.util.concurrent.atomic.AtomicLongArray atomicLongArray = new java.util.concurrent.atomic.AtomicLongArray(size);
                for (int i19 = 0; i19 < size; i19++) {
                    atomicLongArray.set(i19, ((java.lang.Long) arrayList2.get(i19)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.google.gson.v
            public void c(jb.d dVar, java.lang.Object obj) {
                java.util.concurrent.atomic.AtomicLongArray atomicLongArray = (java.util.concurrent.atomic.AtomicLongArray) obj;
                dVar.b();
                int length = atomicLongArray.length();
                for (int i19 = 0; i19 < length; i19++) {
                    com.google.gson.v.this.c(dVar, java.lang.Long.valueOf(atomicLongArray.get(i19)));
                }
                dVar.i();
            }
        })));
        arrayList.add(com.google.gson.internal.bind.e.f44780j);
        arrayList.add(com.google.gson.internal.bind.e.f44785o);
        arrayList.add(com.google.gson.internal.bind.e.f44789s);
        arrayList.add(com.google.gson.internal.bind.e.f44790t);
        arrayList.add(com.google.gson.internal.bind.e.a(java.math.BigDecimal.class, com.google.gson.internal.bind.e.f44786p));
        arrayList.add(com.google.gson.internal.bind.e.a(java.math.BigInteger.class, com.google.gson.internal.bind.e.f44787q));
        arrayList.add(com.google.gson.internal.bind.e.f44791u);
        arrayList.add(com.google.gson.internal.bind.e.f44792v);
        arrayList.add(com.google.gson.internal.bind.e.f44794x);
        arrayList.add(com.google.gson.internal.bind.e.f44795y);
        arrayList.add(com.google.gson.internal.bind.e.B);
        arrayList.add(com.google.gson.internal.bind.e.f44793w);
        arrayList.add(com.google.gson.internal.bind.e.f44772b);
        arrayList.add(com.google.gson.internal.bind.DateTypeAdapter.f44716b);
        arrayList.add(com.google.gson.internal.bind.e.A);
        arrayList.add(com.google.gson.internal.bind.TimeTypeAdapter.f44736b);
        arrayList.add(com.google.gson.internal.bind.SqlDateTypeAdapter.f44734b);
        arrayList.add(com.google.gson.internal.bind.e.f44796z);
        arrayList.add(com.google.gson.internal.bind.ArrayTypeAdapter.f44710c);
        arrayList.add(com.google.gson.internal.bind.e.f44771a);
        arrayList.add(new com.google.gson.internal.bind.CollectionTypeAdapterFactory(rVar));
        arrayList.add(new com.google.gson.internal.bind.MapTypeAdapterFactory(rVar, z18));
        com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory jsonAdapterAnnotationTypeAdapterFactory = new com.google.gson.internal.bind.JsonAdapterAnnotationTypeAdapterFactory(rVar);
        this.f44678d = jsonAdapterAnnotationTypeAdapterFactory;
        arrayList.add(jsonAdapterAnnotationTypeAdapterFactory);
        arrayList.add(com.google.gson.internal.bind.e.E);
        arrayList.add(new com.google.gson.internal.bind.ReflectiveTypeAdapterFactory(rVar, hVar, excluder, jsonAdapterAnnotationTypeAdapterFactory));
        this.f44679e = java.util.Collections.unmodifiableList(arrayList);
    }
}
