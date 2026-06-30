package com.p176xb6135e39.p280x308fcb;

/* loaded from: classes16.dex */
public final class i {

    /* renamed from: k, reason: collision with root package name */
    public static final ib.a f126207k = new ib.a(java.lang.Object.class);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ThreadLocal f126208a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f126209b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.r f126210c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2764xb8562aeb f126211d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f126212e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f126213f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f126214g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f126215h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f126216i;

    /* renamed from: j, reason: collision with root package name */
    public final boolean f126217j;

    public i() {
        this(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.C2760x7ab541f8.f126218i, com.p176xb6135e39.p280x308fcb.g.f126205d, java.util.Collections.emptyMap(), false, false, false, true, false, false, false, com.p176xb6135e39.p280x308fcb.u.f126376d, null, 2, 2, java.util.Collections.emptyList(), java.util.Collections.emptyList(), java.util.Collections.emptyList());
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
        boolean z17 = this.f126217j;
        boolean z18 = true;
        bVar.f380175e = true;
        try {
            try {
                try {
                    bVar.K();
                    z18 = false;
                    obj = d(new ib.a(type)).b(bVar);
                } finally {
                    bVar.f380175e = z17;
                }
            } catch (java.io.EOFException e17) {
                if (!z18) {
                    throw new com.p176xb6135e39.p280x308fcb.r(e17);
                }
            } catch (java.lang.AssertionError e18) {
                java.lang.AssertionError assertionError = new java.lang.AssertionError("AssertionError (GSON 2.8.6): " + e18.getMessage());
                assertionError.initCause(e18);
                throw assertionError;
            }
            if (obj != null) {
                try {
                    if (bVar.K() != jb.c.END_DOCUMENT) {
                        throw new com.p176xb6135e39.p280x308fcb.m("JSON document was not fully consumed.");
                    }
                } catch (jb.e e19) {
                    throw new com.p176xb6135e39.p280x308fcb.r(e19);
                } catch (java.io.IOException e27) {
                    throw new com.p176xb6135e39.p280x308fcb.m(e27);
                }
            }
            return obj;
        } catch (java.io.IOException e28) {
            throw new com.p176xb6135e39.p280x308fcb.r(e28);
        } catch (java.lang.IllegalStateException e29) {
            throw new com.p176xb6135e39.p280x308fcb.r(e29);
        }
    }

    public com.p176xb6135e39.p280x308fcb.v d(ib.a aVar) {
        boolean z17;
        java.util.Map map = this.f126209b;
        com.p176xb6135e39.p280x308fcb.v vVar = (com.p176xb6135e39.p280x308fcb.v) ((java.util.concurrent.ConcurrentHashMap) map).get(aVar == null ? f126207k : aVar);
        if (vVar != null) {
            return vVar;
        }
        java.lang.ThreadLocal threadLocal = this.f126208a;
        java.util.Map map2 = (java.util.Map) threadLocal.get();
        if (map2 == null) {
            map2 = new java.util.HashMap();
            threadLocal.set(map2);
            z17 = true;
        } else {
            z17 = false;
        }
        com.p176xb6135e39.p280x308fcb.C2758xc35f459 c2758xc35f459 = (com.p176xb6135e39.p280x308fcb.C2758xc35f459) map2.get(aVar);
        if (c2758xc35f459 != null) {
            return c2758xc35f459;
        }
        try {
            com.p176xb6135e39.p280x308fcb.C2758xc35f459 c2758xc35f4592 = new com.p176xb6135e39.p280x308fcb.C2758xc35f459();
            map2.put(aVar, c2758xc35f4592);
            java.util.Iterator it = this.f126212e.iterator();
            while (it.hasNext()) {
                com.p176xb6135e39.p280x308fcb.v a17 = ((com.p176xb6135e39.p280x308fcb.w) it.next()).a(this, aVar);
                if (a17 != null) {
                    if (c2758xc35f4592.f126203a != null) {
                        throw new java.lang.AssertionError();
                    }
                    c2758xc35f4592.f126203a = a17;
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

    public com.p176xb6135e39.p280x308fcb.v e(com.p176xb6135e39.p280x308fcb.w wVar, ib.a aVar) {
        java.util.List<com.p176xb6135e39.p280x308fcb.w> list = this.f126212e;
        if (!list.contains(wVar)) {
            wVar = this.f126211d;
        }
        boolean z17 = false;
        for (com.p176xb6135e39.p280x308fcb.w wVar2 : list) {
            if (z17) {
                com.p176xb6135e39.p280x308fcb.v a17 = wVar2.a(this, aVar);
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
        if (this.f126214g) {
            writer.write(")]}'\n");
        }
        jb.d dVar = new jb.d(writer);
        if (this.f126216i) {
            dVar.f380205g = "  ";
            dVar.f380206h = ": ";
        }
        dVar.f380210o = this.f126213f;
        return dVar;
    }

    public java.lang.String g(java.lang.Object obj) {
        if (obj == null) {
            com.p176xb6135e39.p280x308fcb.l lVar = com.p176xb6135e39.p280x308fcb.n.f126373d;
            java.io.StringWriter stringWriter = new java.io.StringWriter();
            try {
                h(lVar, f(stringWriter));
                return stringWriter.toString();
            } catch (java.io.IOException e17) {
                throw new com.p176xb6135e39.p280x308fcb.m(e17);
            }
        }
        java.lang.reflect.Type type = obj.getClass();
        java.io.StringWriter stringWriter2 = new java.io.StringWriter();
        try {
            i(obj, type, f(stringWriter2));
            return stringWriter2.toString();
        } catch (java.io.IOException e18) {
            throw new com.p176xb6135e39.p280x308fcb.m(e18);
        }
    }

    public void h(com.p176xb6135e39.p280x308fcb.l lVar, jb.d dVar) {
        boolean z17 = dVar.f380207i;
        dVar.f380207i = true;
        boolean z18 = dVar.f380208m;
        dVar.f380208m = this.f126215h;
        boolean z19 = dVar.f380210o;
        dVar.f380210o = this.f126213f;
        try {
            try {
                com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.C.c(dVar, lVar);
            } catch (java.io.IOException e17) {
                throw new com.p176xb6135e39.p280x308fcb.m(e17);
            } catch (java.lang.AssertionError e18) {
                java.lang.AssertionError assertionError = new java.lang.AssertionError("AssertionError (GSON 2.8.6): " + e18.getMessage());
                assertionError.initCause(e18);
                throw assertionError;
            }
        } finally {
            dVar.f380207i = z17;
            dVar.f380208m = z18;
            dVar.f380210o = z19;
        }
    }

    public void i(java.lang.Object obj, java.lang.reflect.Type type, jb.d dVar) {
        com.p176xb6135e39.p280x308fcb.v d17 = d(new ib.a(type));
        boolean z17 = dVar.f380207i;
        dVar.f380207i = true;
        boolean z18 = dVar.f380208m;
        dVar.f380208m = this.f126215h;
        boolean z19 = dVar.f380210o;
        dVar.f380210o = this.f126213f;
        try {
            try {
                d17.c(dVar, obj);
            } catch (java.io.IOException e17) {
                throw new com.p176xb6135e39.p280x308fcb.m(e17);
            } catch (java.lang.AssertionError e18) {
                java.lang.AssertionError assertionError = new java.lang.AssertionError("AssertionError (GSON 2.8.6): " + e18.getMessage());
                assertionError.initCause(e18);
                throw assertionError;
            }
        } finally {
            dVar.f380207i = z17;
            dVar.f380208m = z18;
            dVar.f380210o = z19;
        }
    }

    /* renamed from: toString */
    public java.lang.String m20473x9616526c() {
        return "{serializeNulls:" + this.f126213f + ",factories:" + this.f126212e + ",instanceCreators:" + this.f126210c + "}";
    }

    public i(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.C2760x7ab541f8 c2760x7ab541f8, com.p176xb6135e39.p280x308fcb.h hVar, java.util.Map map, boolean z17, boolean z18, boolean z19, boolean z27, boolean z28, boolean z29, boolean z37, com.p176xb6135e39.p280x308fcb.u uVar, java.lang.String str, int i17, int i18, java.util.List list, java.util.List list2, java.util.List list3) {
        final com.p176xb6135e39.p280x308fcb.v vVar;
        com.p176xb6135e39.p280x308fcb.v vVar2;
        com.p176xb6135e39.p280x308fcb.v vVar3;
        this.f126208a = new java.lang.ThreadLocal();
        this.f126209b = new java.util.concurrent.ConcurrentHashMap();
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.r rVar = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.r(map);
        this.f126210c = rVar;
        this.f126213f = z17;
        this.f126214g = z19;
        this.f126215h = z27;
        this.f126216i = z28;
        this.f126217j = z29;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.D);
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2766x92f50dd6.f126258b);
        arrayList.add(c2760x7ab541f8);
        arrayList.addAll(list3);
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.f126321r);
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.f126310g);
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.f126307d);
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.f126308e);
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.f126309f);
        if (uVar == com.p176xb6135e39.p280x308fcb.u.f126376d) {
            vVar = com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.f126314k;
        } else {
            vVar = new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.Gson$3
                @Override // com.p176xb6135e39.p280x308fcb.v
                public java.lang.Object b(jb.b bVar) {
                    if (bVar.K() != jb.c.NULL) {
                        return java.lang.Long.valueOf(bVar.z());
                    }
                    bVar.D();
                    return null;
                }

                @Override // com.p176xb6135e39.p280x308fcb.v
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
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.b(java.lang.Long.TYPE, java.lang.Long.class, vVar));
        java.lang.Class cls = java.lang.Double.TYPE;
        if (z37) {
            vVar2 = com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.f126316m;
        } else {
            vVar2 = new com.p176xb6135e39.p280x308fcb.v(this) { // from class: com.google.gson.Gson$1
                @Override // com.p176xb6135e39.p280x308fcb.v
                public java.lang.Object b(jb.b bVar) {
                    if (bVar.K() != jb.c.NULL) {
                        return java.lang.Double.valueOf(bVar.w());
                    }
                    bVar.D();
                    return null;
                }

                @Override // com.p176xb6135e39.p280x308fcb.v
                public void c(jb.d dVar, java.lang.Object obj) {
                    java.lang.Number number = (java.lang.Number) obj;
                    if (number == null) {
                        dVar.p();
                    } else {
                        com.p176xb6135e39.p280x308fcb.i.a(number.doubleValue());
                        dVar.z(number);
                    }
                }
            };
        }
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.b(cls, java.lang.Double.class, vVar2));
        java.lang.Class cls2 = java.lang.Float.TYPE;
        if (z37) {
            vVar3 = com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.f126315l;
        } else {
            vVar3 = new com.p176xb6135e39.p280x308fcb.v(this) { // from class: com.google.gson.Gson$2
                @Override // com.p176xb6135e39.p280x308fcb.v
                public java.lang.Object b(jb.b bVar) {
                    if (bVar.K() != jb.c.NULL) {
                        return java.lang.Float.valueOf((float) bVar.w());
                    }
                    bVar.D();
                    return null;
                }

                @Override // com.p176xb6135e39.p280x308fcb.v
                public void c(jb.d dVar, java.lang.Object obj) {
                    java.lang.Number number = (java.lang.Number) obj;
                    if (number == null) {
                        dVar.p();
                    } else {
                        com.p176xb6135e39.p280x308fcb.i.a(number.floatValue());
                        dVar.z(number);
                    }
                }
            };
        }
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.b(cls2, java.lang.Float.class, vVar3));
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.f126317n);
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.f126311h);
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.f126312i);
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.a(java.util.concurrent.atomic.AtomicLong.class, new com.p176xb6135e39.p280x308fcb.C2759x754051e2(new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.Gson$4
            @Override // com.p176xb6135e39.p280x308fcb.v
            public java.lang.Object b(jb.b bVar) {
                return new java.util.concurrent.atomic.AtomicLong(((java.lang.Number) com.p176xb6135e39.p280x308fcb.v.this.b(bVar)).longValue());
            }

            @Override // com.p176xb6135e39.p280x308fcb.v
            public void c(jb.d dVar, java.lang.Object obj) {
                com.p176xb6135e39.p280x308fcb.v.this.c(dVar, java.lang.Long.valueOf(((java.util.concurrent.atomic.AtomicLong) obj).get()));
            }
        })));
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.a(java.util.concurrent.atomic.AtomicLongArray.class, new com.p176xb6135e39.p280x308fcb.C2759x754051e2(new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.Gson$5
            @Override // com.p176xb6135e39.p280x308fcb.v
            public java.lang.Object b(jb.b bVar) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                bVar.a();
                while (bVar.l()) {
                    arrayList2.add(java.lang.Long.valueOf(((java.lang.Number) com.p176xb6135e39.p280x308fcb.v.this.b(bVar)).longValue()));
                }
                bVar.i();
                int size = arrayList2.size();
                java.util.concurrent.atomic.AtomicLongArray atomicLongArray = new java.util.concurrent.atomic.AtomicLongArray(size);
                for (int i19 = 0; i19 < size; i19++) {
                    atomicLongArray.set(i19, ((java.lang.Long) arrayList2.get(i19)).longValue());
                }
                return atomicLongArray;
            }

            @Override // com.p176xb6135e39.p280x308fcb.v
            public void c(jb.d dVar, java.lang.Object obj) {
                java.util.concurrent.atomic.AtomicLongArray atomicLongArray = (java.util.concurrent.atomic.AtomicLongArray) obj;
                dVar.b();
                int length = atomicLongArray.length();
                for (int i19 = 0; i19 < length; i19++) {
                    com.p176xb6135e39.p280x308fcb.v.this.c(dVar, java.lang.Long.valueOf(atomicLongArray.get(i19)));
                }
                dVar.i();
            }
        })));
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.f126313j);
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.f126318o);
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.f126322s);
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.f126323t);
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.a(java.math.BigDecimal.class, com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.f126319p));
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.a(java.math.BigInteger.class, com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.f126320q));
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.f126324u);
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.f126325v);
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.f126327x);
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.f126328y);
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.B);
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.f126326w);
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.f126305b);
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2763xd9f46e07.f126249b);
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.A);
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2769x1043188.f126269b);
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2768x59c55699.f126267b);
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.f126329z);
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2761x2b4caebc.f126243c);
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.f126304a);
        arrayList.add(new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2762x63851ff3(rVar));
        arrayList.add(new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2765x73f65ef1(rVar, z18));
        com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2764xb8562aeb c2764xb8562aeb = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2764xb8562aeb(rVar);
        this.f126211d = c2764xb8562aeb;
        arrayList.add(c2764xb8562aeb);
        arrayList.add(com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.e.E);
        arrayList.add(new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2767x51f16110(rVar, hVar, c2760x7ab541f8, c2764xb8562aeb));
        this.f126212e = java.util.Collections.unmodifiableList(arrayList);
    }
}
