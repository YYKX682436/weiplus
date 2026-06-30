package com.google.gson.internal.bind;

/* loaded from: classes16.dex */
public abstract class e {
    public static final com.google.gson.w A;
    public static final com.google.gson.w B;
    public static final com.google.gson.v C;
    public static final com.google.gson.w D;
    public static final com.google.gson.w E;

    /* renamed from: a, reason: collision with root package name */
    public static final com.google.gson.w f44771a = new com.google.gson.internal.bind.TypeAdapters$32(java.lang.Class.class, new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$1
        @Override // com.google.gson.v
        public java.lang.Object b(jb.b bVar) {
            throw new java.lang.UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.google.gson.v
        public void c(jb.d dVar, java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((java.lang.Class) obj).getName() + ". Forgot to register a type adapter?");
        }
    }.a());

    /* renamed from: b, reason: collision with root package name */
    public static final com.google.gson.w f44772b = new com.google.gson.internal.bind.TypeAdapters$32(java.util.BitSet.class, new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$2
        /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
        
            if (r7.x() != 0) goto L20;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        
            r1 = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
        
            r1 = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
        
            if (java.lang.Integer.parseInt(r1) != 0) goto L20;
         */
        @Override // com.google.gson.v
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Object b(jb.b r7) {
            /*
                r6 = this;
                java.util.BitSet r0 = new java.util.BitSet
                r0.<init>()
                r7.a()
                jb.c r1 = r7.K()
                r2 = 0
                r3 = r2
            Le:
                jb.c r4 = jb.c.END_ARRAY
                if (r1 == r4) goto L6c
                int r4 = r1.ordinal()
                r5 = 5
                if (r4 == r5) goto L3f
                r5 = 6
                if (r4 == r5) goto L38
                r5 = 7
                if (r4 != r5) goto L24
                boolean r1 = r7.v()
                goto L4c
            L24:
                com.google.gson.r r7 = new com.google.gson.r
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "Invalid bitset value type: "
                r0.<init>(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r7.<init>(r0)
                throw r7
            L38:
                int r1 = r7.x()
                if (r1 == 0) goto L4b
                goto L49
            L3f:
                java.lang.String r1 = r7.I()
                int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.NumberFormatException -> L58
                if (r1 == 0) goto L4b
            L49:
                r1 = 1
                goto L4c
            L4b:
                r1 = r2
            L4c:
                if (r1 == 0) goto L51
                r0.set(r3)
            L51:
                int r3 = r3 + 1
                jb.c r1 = r7.K()
                goto Le
            L58:
                com.google.gson.r r7 = new com.google.gson.r
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r2 = "Error: Expecting: bitset number value (1, 0), Found: "
                r0.<init>(r2)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r7.<init>(r0)
                throw r7
            L6c:
                r7.i()
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.bind.TypeAdapters$2.b(jb.b):java.lang.Object");
        }

        @Override // com.google.gson.v
        public void c(jb.d dVar, java.lang.Object obj) {
            java.util.BitSet bitSet = (java.util.BitSet) obj;
            dVar.b();
            int length = bitSet.length();
            for (int i17 = 0; i17 < length; i17++) {
                dVar.w(bitSet.get(i17) ? 1L : 0L);
            }
            dVar.i();
        }
    }.a());

    /* renamed from: c, reason: collision with root package name */
    public static final com.google.gson.v f44773c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.google.gson.w f44774d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.google.gson.w f44775e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.google.gson.w f44776f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.google.gson.w f44777g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.google.gson.w f44778h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.google.gson.w f44779i;

    /* renamed from: j, reason: collision with root package name */
    public static final com.google.gson.w f44780j;

    /* renamed from: k, reason: collision with root package name */
    public static final com.google.gson.v f44781k;

    /* renamed from: l, reason: collision with root package name */
    public static final com.google.gson.v f44782l;

    /* renamed from: m, reason: collision with root package name */
    public static final com.google.gson.v f44783m;

    /* renamed from: n, reason: collision with root package name */
    public static final com.google.gson.w f44784n;

    /* renamed from: o, reason: collision with root package name */
    public static final com.google.gson.w f44785o;

    /* renamed from: p, reason: collision with root package name */
    public static final com.google.gson.v f44786p;

    /* renamed from: q, reason: collision with root package name */
    public static final com.google.gson.v f44787q;

    /* renamed from: r, reason: collision with root package name */
    public static final com.google.gson.w f44788r;

    /* renamed from: s, reason: collision with root package name */
    public static final com.google.gson.w f44789s;

    /* renamed from: t, reason: collision with root package name */
    public static final com.google.gson.w f44790t;

    /* renamed from: u, reason: collision with root package name */
    public static final com.google.gson.w f44791u;

    /* renamed from: v, reason: collision with root package name */
    public static final com.google.gson.w f44792v;

    /* renamed from: w, reason: collision with root package name */
    public static final com.google.gson.w f44793w;

    /* renamed from: x, reason: collision with root package name */
    public static final com.google.gson.w f44794x;

    /* renamed from: y, reason: collision with root package name */
    public static final com.google.gson.w f44795y;

    /* renamed from: z, reason: collision with root package name */
    public static final com.google.gson.w f44796z;

    static {
        com.google.gson.v vVar = new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$3
            @Override // com.google.gson.v
            public java.lang.Object b(jb.b bVar) {
                jb.c K = bVar.K();
                if (K != jb.c.NULL) {
                    return K == jb.c.STRING ? java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(bVar.I())) : java.lang.Boolean.valueOf(bVar.v());
                }
                bVar.D();
                return null;
            }

            @Override // com.google.gson.v
            public void c(jb.d dVar, java.lang.Object obj) {
                dVar.x((java.lang.Boolean) obj);
            }
        };
        f44773c = new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$4
            @Override // com.google.gson.v
            public java.lang.Object b(jb.b bVar) {
                if (bVar.K() != jb.c.NULL) {
                    return java.lang.Boolean.valueOf(bVar.I());
                }
                bVar.D();
                return null;
            }

            @Override // com.google.gson.v
            public void c(jb.d dVar, java.lang.Object obj) {
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                dVar.A(bool == null ? "null" : bool.toString());
            }
        };
        f44774d = new com.google.gson.internal.bind.TypeAdapters$33(java.lang.Boolean.TYPE, java.lang.Boolean.class, vVar);
        f44775e = new com.google.gson.internal.bind.TypeAdapters$33(java.lang.Byte.TYPE, java.lang.Byte.class, new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$5
            @Override // com.google.gson.v
            public java.lang.Object b(jb.b bVar) {
                if (bVar.K() == jb.c.NULL) {
                    bVar.D();
                    return null;
                }
                try {
                    return java.lang.Byte.valueOf((byte) bVar.x());
                } catch (java.lang.NumberFormatException e17) {
                    throw new com.google.gson.r(e17);
                }
            }

            @Override // com.google.gson.v
            public void c(jb.d dVar, java.lang.Object obj) {
                dVar.z((java.lang.Number) obj);
            }
        });
        f44776f = new com.google.gson.internal.bind.TypeAdapters$33(java.lang.Short.TYPE, java.lang.Short.class, new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$6
            @Override // com.google.gson.v
            public java.lang.Object b(jb.b bVar) {
                if (bVar.K() == jb.c.NULL) {
                    bVar.D();
                    return null;
                }
                try {
                    return java.lang.Short.valueOf((short) bVar.x());
                } catch (java.lang.NumberFormatException e17) {
                    throw new com.google.gson.r(e17);
                }
            }

            @Override // com.google.gson.v
            public void c(jb.d dVar, java.lang.Object obj) {
                dVar.z((java.lang.Number) obj);
            }
        });
        f44777g = new com.google.gson.internal.bind.TypeAdapters$33(java.lang.Integer.TYPE, java.lang.Integer.class, new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$7
            @Override // com.google.gson.v
            public java.lang.Object b(jb.b bVar) {
                if (bVar.K() == jb.c.NULL) {
                    bVar.D();
                    return null;
                }
                try {
                    return java.lang.Integer.valueOf(bVar.x());
                } catch (java.lang.NumberFormatException e17) {
                    throw new com.google.gson.r(e17);
                }
            }

            @Override // com.google.gson.v
            public void c(jb.d dVar, java.lang.Object obj) {
                dVar.z((java.lang.Number) obj);
            }
        });
        f44778h = new com.google.gson.internal.bind.TypeAdapters$32(java.util.concurrent.atomic.AtomicInteger.class, new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$8
            @Override // com.google.gson.v
            public java.lang.Object b(jb.b bVar) {
                try {
                    return new java.util.concurrent.atomic.AtomicInteger(bVar.x());
                } catch (java.lang.NumberFormatException e17) {
                    throw new com.google.gson.r(e17);
                }
            }

            @Override // com.google.gson.v
            public void c(jb.d dVar, java.lang.Object obj) {
                dVar.w(((java.util.concurrent.atomic.AtomicInteger) obj).get());
            }
        }.a());
        f44779i = new com.google.gson.internal.bind.TypeAdapters$32(java.util.concurrent.atomic.AtomicBoolean.class, new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$9
            @Override // com.google.gson.v
            public java.lang.Object b(jb.b bVar) {
                return new java.util.concurrent.atomic.AtomicBoolean(bVar.v());
            }

            @Override // com.google.gson.v
            public void c(jb.d dVar, java.lang.Object obj) {
                dVar.C(((java.util.concurrent.atomic.AtomicBoolean) obj).get());
            }
        }.a());
        f44780j = new com.google.gson.internal.bind.TypeAdapters$32(java.util.concurrent.atomic.AtomicIntegerArray.class, new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$10
            @Override // com.google.gson.v
            public java.lang.Object b(jb.b bVar) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                bVar.a();
                while (bVar.l()) {
                    try {
                        arrayList.add(java.lang.Integer.valueOf(bVar.x()));
                    } catch (java.lang.NumberFormatException e17) {
                        throw new com.google.gson.r(e17);
                    }
                }
                bVar.i();
                int size = arrayList.size();
                java.util.concurrent.atomic.AtomicIntegerArray atomicIntegerArray = new java.util.concurrent.atomic.AtomicIntegerArray(size);
                for (int i17 = 0; i17 < size; i17++) {
                    atomicIntegerArray.set(i17, ((java.lang.Integer) arrayList.get(i17)).intValue());
                }
                return atomicIntegerArray;
            }

            @Override // com.google.gson.v
            public void c(jb.d dVar, java.lang.Object obj) {
                dVar.b();
                int length = ((java.util.concurrent.atomic.AtomicIntegerArray) obj).length();
                for (int i17 = 0; i17 < length; i17++) {
                    dVar.w(r6.get(i17));
                }
                dVar.i();
            }
        }.a());
        f44781k = new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$11
            @Override // com.google.gson.v
            public java.lang.Object b(jb.b bVar) {
                if (bVar.K() == jb.c.NULL) {
                    bVar.D();
                    return null;
                }
                try {
                    return java.lang.Long.valueOf(bVar.z());
                } catch (java.lang.NumberFormatException e17) {
                    throw new com.google.gson.r(e17);
                }
            }

            @Override // com.google.gson.v
            public void c(jb.d dVar, java.lang.Object obj) {
                dVar.z((java.lang.Number) obj);
            }
        };
        f44782l = new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$12
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
                dVar.z((java.lang.Number) obj);
            }
        };
        f44783m = new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$13
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
                dVar.z((java.lang.Number) obj);
            }
        };
        f44784n = new com.google.gson.internal.bind.TypeAdapters$32(java.lang.Number.class, new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$14
            @Override // com.google.gson.v
            public java.lang.Object b(jb.b bVar) {
                jb.c K = bVar.K();
                int ordinal = K.ordinal();
                if (ordinal == 5 || ordinal == 6) {
                    return new com.google.gson.internal.u(bVar.I());
                }
                if (ordinal == 8) {
                    bVar.D();
                    return null;
                }
                throw new com.google.gson.r("Expecting number, got: " + K);
            }

            @Override // com.google.gson.v
            public void c(jb.d dVar, java.lang.Object obj) {
                dVar.z((java.lang.Number) obj);
            }
        });
        f44785o = new com.google.gson.internal.bind.TypeAdapters$33(java.lang.Character.TYPE, java.lang.Character.class, new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$15
            @Override // com.google.gson.v
            public java.lang.Object b(jb.b bVar) {
                if (bVar.K() == jb.c.NULL) {
                    bVar.D();
                    return null;
                }
                java.lang.String I = bVar.I();
                if (I.length() == 1) {
                    return java.lang.Character.valueOf(I.charAt(0));
                }
                throw new com.google.gson.r("Expecting character, got: ".concat(I));
            }

            @Override // com.google.gson.v
            public void c(jb.d dVar, java.lang.Object obj) {
                java.lang.Character ch6 = (java.lang.Character) obj;
                dVar.A(ch6 == null ? null : java.lang.String.valueOf(ch6));
            }
        });
        com.google.gson.v vVar2 = new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$16
            @Override // com.google.gson.v
            public java.lang.Object b(jb.b bVar) {
                jb.c K = bVar.K();
                if (K != jb.c.NULL) {
                    return K == jb.c.BOOLEAN ? java.lang.Boolean.toString(bVar.v()) : bVar.I();
                }
                bVar.D();
                return null;
            }

            @Override // com.google.gson.v
            public void c(jb.d dVar, java.lang.Object obj) {
                dVar.A((java.lang.String) obj);
            }
        };
        f44786p = new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$17
            @Override // com.google.gson.v
            public java.lang.Object b(jb.b bVar) {
                if (bVar.K() == jb.c.NULL) {
                    bVar.D();
                    return null;
                }
                try {
                    return new java.math.BigDecimal(bVar.I());
                } catch (java.lang.NumberFormatException e17) {
                    throw new com.google.gson.r(e17);
                }
            }

            @Override // com.google.gson.v
            public void c(jb.d dVar, java.lang.Object obj) {
                dVar.z((java.math.BigDecimal) obj);
            }
        };
        f44787q = new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$18
            @Override // com.google.gson.v
            public java.lang.Object b(jb.b bVar) {
                if (bVar.K() == jb.c.NULL) {
                    bVar.D();
                    return null;
                }
                try {
                    return new java.math.BigInteger(bVar.I());
                } catch (java.lang.NumberFormatException e17) {
                    throw new com.google.gson.r(e17);
                }
            }

            @Override // com.google.gson.v
            public void c(jb.d dVar, java.lang.Object obj) {
                dVar.z((java.math.BigInteger) obj);
            }
        };
        f44788r = new com.google.gson.internal.bind.TypeAdapters$32(java.lang.String.class, vVar2);
        f44789s = new com.google.gson.internal.bind.TypeAdapters$32(java.lang.StringBuilder.class, new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$19
            @Override // com.google.gson.v
            public java.lang.Object b(jb.b bVar) {
                if (bVar.K() != jb.c.NULL) {
                    return new java.lang.StringBuilder(bVar.I());
                }
                bVar.D();
                return null;
            }

            @Override // com.google.gson.v
            public void c(jb.d dVar, java.lang.Object obj) {
                java.lang.StringBuilder sb6 = (java.lang.StringBuilder) obj;
                dVar.A(sb6 == null ? null : sb6.toString());
            }
        });
        f44790t = new com.google.gson.internal.bind.TypeAdapters$32(java.lang.StringBuffer.class, new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$20
            @Override // com.google.gson.v
            public java.lang.Object b(jb.b bVar) {
                if (bVar.K() != jb.c.NULL) {
                    return new java.lang.StringBuffer(bVar.I());
                }
                bVar.D();
                return null;
            }

            @Override // com.google.gson.v
            public void c(jb.d dVar, java.lang.Object obj) {
                java.lang.StringBuffer stringBuffer = (java.lang.StringBuffer) obj;
                dVar.A(stringBuffer == null ? null : stringBuffer.toString());
            }
        });
        f44791u = new com.google.gson.internal.bind.TypeAdapters$32(java.net.URL.class, new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$21
            @Override // com.google.gson.v
            public java.lang.Object b(jb.b bVar) {
                if (bVar.K() == jb.c.NULL) {
                    bVar.D();
                    return null;
                }
                java.lang.String I = bVar.I();
                if ("null".equals(I)) {
                    return null;
                }
                return new java.net.URL(I);
            }

            @Override // com.google.gson.v
            public void c(jb.d dVar, java.lang.Object obj) {
                java.net.URL url = (java.net.URL) obj;
                dVar.A(url == null ? null : url.toExternalForm());
            }
        });
        f44792v = new com.google.gson.internal.bind.TypeAdapters$32(java.net.URI.class, new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$22
            @Override // com.google.gson.v
            public java.lang.Object b(jb.b bVar) {
                if (bVar.K() == jb.c.NULL) {
                    bVar.D();
                    return null;
                }
                try {
                    java.lang.String I = bVar.I();
                    if ("null".equals(I)) {
                        return null;
                    }
                    return new java.net.URI(I);
                } catch (java.net.URISyntaxException e17) {
                    throw new com.google.gson.m(e17);
                }
            }

            @Override // com.google.gson.v
            public void c(jb.d dVar, java.lang.Object obj) {
                java.net.URI uri = (java.net.URI) obj;
                dVar.A(uri == null ? null : uri.toASCIIString());
            }
        });
        final com.google.gson.v vVar3 = new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$23
            @Override // com.google.gson.v
            public java.lang.Object b(jb.b bVar) {
                if (bVar.K() != jb.c.NULL) {
                    return java.net.InetAddress.getByName(bVar.I());
                }
                bVar.D();
                return null;
            }

            @Override // com.google.gson.v
            public void c(jb.d dVar, java.lang.Object obj) {
                java.net.InetAddress inetAddress = (java.net.InetAddress) obj;
                dVar.A(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        final java.lang.Class<java.net.InetAddress> cls = java.net.InetAddress.class;
        f44793w = new com.google.gson.w() { // from class: com.google.gson.internal.bind.TypeAdapters$35
            @Override // com.google.gson.w
            public com.google.gson.v a(com.google.gson.i iVar, ib.a aVar) {
                final java.lang.Class<?> cls2 = aVar.f290021a;
                if (cls.isAssignableFrom(cls2)) {
                    return new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$35.1
                        @Override // com.google.gson.v
                        public java.lang.Object b(jb.b bVar) {
                            java.lang.Object b17 = vVar3.b(bVar);
                            if (b17 != null) {
                                java.lang.Class cls3 = cls2;
                                if (!cls3.isInstance(b17)) {
                                    throw new com.google.gson.r("Expected a " + cls3.getName() + " but was " + b17.getClass().getName());
                                }
                            }
                            return b17;
                        }

                        @Override // com.google.gson.v
                        public void c(jb.d dVar, java.lang.Object obj) {
                            vVar3.c(dVar, obj);
                        }
                    };
                }
                return null;
            }

            public java.lang.String toString() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + vVar3 + "]";
            }
        };
        f44794x = new com.google.gson.internal.bind.TypeAdapters$32(java.util.UUID.class, new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$24
            @Override // com.google.gson.v
            public java.lang.Object b(jb.b bVar) {
                if (bVar.K() != jb.c.NULL) {
                    return java.util.UUID.fromString(bVar.I());
                }
                bVar.D();
                return null;
            }

            @Override // com.google.gson.v
            public void c(jb.d dVar, java.lang.Object obj) {
                java.util.UUID uuid = (java.util.UUID) obj;
                dVar.A(uuid == null ? null : uuid.toString());
            }
        });
        f44795y = new com.google.gson.internal.bind.TypeAdapters$32(java.util.Currency.class, new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$25
            @Override // com.google.gson.v
            public java.lang.Object b(jb.b bVar) {
                return java.util.Currency.getInstance(bVar.I());
            }

            @Override // com.google.gson.v
            public void c(jb.d dVar, java.lang.Object obj) {
                dVar.A(((java.util.Currency) obj).getCurrencyCode());
            }
        }.a());
        f44796z = new com.google.gson.w() { // from class: com.google.gson.internal.bind.TypeAdapters$26
            @Override // com.google.gson.w
            public com.google.gson.v a(com.google.gson.i iVar, ib.a aVar) {
                if (aVar.f290021a != java.sql.Timestamp.class) {
                    return null;
                }
                iVar.getClass();
                final com.google.gson.v d17 = iVar.d(new ib.a(java.util.Date.class));
                return new com.google.gson.v(this) { // from class: com.google.gson.internal.bind.TypeAdapters$26.1
                    @Override // com.google.gson.v
                    public java.lang.Object b(jb.b bVar) {
                        java.util.Date date = (java.util.Date) d17.b(bVar);
                        if (date != null) {
                            return new java.sql.Timestamp(date.getTime());
                        }
                        return null;
                    }

                    @Override // com.google.gson.v
                    public void c(jb.d dVar, java.lang.Object obj) {
                        d17.c(dVar, (java.sql.Timestamp) obj);
                    }
                };
            }
        };
        final com.google.gson.v vVar4 = new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$27
            @Override // com.google.gson.v
            public java.lang.Object b(jb.b bVar) {
                if (bVar.K() == jb.c.NULL) {
                    bVar.D();
                    return null;
                }
                bVar.b();
                int i17 = 0;
                int i18 = 0;
                int i19 = 0;
                int i27 = 0;
                int i28 = 0;
                int i29 = 0;
                while (bVar.K() != jb.c.END_OBJECT) {
                    java.lang.String A2 = bVar.A();
                    int x17 = bVar.x();
                    if ("year".equals(A2)) {
                        i17 = x17;
                    } else if ("month".equals(A2)) {
                        i18 = x17;
                    } else if ("dayOfMonth".equals(A2)) {
                        i19 = x17;
                    } else if ("hourOfDay".equals(A2)) {
                        i27 = x17;
                    } else if ("minute".equals(A2)) {
                        i28 = x17;
                    } else if ("second".equals(A2)) {
                        i29 = x17;
                    }
                }
                bVar.j();
                return new java.util.GregorianCalendar(i17, i18, i19, i27, i28, i29);
            }

            @Override // com.google.gson.v
            public void c(jb.d dVar, java.lang.Object obj) {
                if (((java.util.Calendar) obj) == null) {
                    dVar.p();
                    return;
                }
                dVar.c();
                dVar.k("year");
                dVar.w(r4.get(1));
                dVar.k("month");
                dVar.w(r4.get(2));
                dVar.k("dayOfMonth");
                dVar.w(r4.get(5));
                dVar.k("hourOfDay");
                dVar.w(r4.get(11));
                dVar.k("minute");
                dVar.w(r4.get(12));
                dVar.k("second");
                dVar.w(r4.get(13));
                dVar.j();
            }
        };
        final java.lang.Class<java.util.Calendar> cls2 = java.util.Calendar.class;
        final java.lang.Class<java.util.GregorianCalendar> cls3 = java.util.GregorianCalendar.class;
        A = new com.google.gson.w() { // from class: com.google.gson.internal.bind.TypeAdapters$34
            @Override // com.google.gson.w
            public com.google.gson.v a(com.google.gson.i iVar, ib.a aVar) {
                java.lang.Class cls4 = aVar.f290021a;
                if (cls4 == cls2 || cls4 == cls3) {
                    return vVar4;
                }
                return null;
            }

            public java.lang.String toString() {
                return "Factory[type=" + cls2.getName() + "+" + cls3.getName() + ",adapter=" + vVar4 + "]";
            }
        };
        B = new com.google.gson.internal.bind.TypeAdapters$32(java.util.Locale.class, new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$28
            @Override // com.google.gson.v
            public java.lang.Object b(jb.b bVar) {
                if (bVar.K() == jb.c.NULL) {
                    bVar.D();
                    return null;
                }
                java.util.StringTokenizer stringTokenizer = new java.util.StringTokenizer(bVar.I(), "_");
                java.lang.String nextToken = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                java.lang.String nextToken2 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                java.lang.String nextToken3 = stringTokenizer.hasMoreElements() ? stringTokenizer.nextToken() : null;
                return (nextToken2 == null && nextToken3 == null) ? new java.util.Locale(nextToken) : nextToken3 == null ? new java.util.Locale(nextToken, nextToken2) : new java.util.Locale(nextToken, nextToken2, nextToken3);
            }

            @Override // com.google.gson.v
            public void c(jb.d dVar, java.lang.Object obj) {
                java.util.Locale locale = (java.util.Locale) obj;
                dVar.A(locale == null ? null : locale.toString());
            }
        });
        final com.google.gson.v vVar5 = new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$29
            @Override // com.google.gson.v
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public com.google.gson.l b(jb.b bVar) {
                int ordinal = bVar.K().ordinal();
                if (ordinal == 0) {
                    com.google.gson.k kVar = new com.google.gson.k();
                    bVar.a();
                    while (bVar.l()) {
                        ((java.util.ArrayList) kVar.f44839d).add(b(bVar));
                    }
                    bVar.i();
                    return kVar;
                }
                if (ordinal == 2) {
                    com.google.gson.o oVar = new com.google.gson.o();
                    bVar.b();
                    while (bVar.l()) {
                        oVar.f44841d.put(bVar.A(), b(bVar));
                    }
                    bVar.j();
                    return oVar;
                }
                if (ordinal == 5) {
                    return new com.google.gson.q(bVar.I());
                }
                if (ordinal == 6) {
                    return new com.google.gson.q(new com.google.gson.internal.u(bVar.I()));
                }
                if (ordinal == 7) {
                    return new com.google.gson.q(java.lang.Boolean.valueOf(bVar.v()));
                }
                if (ordinal != 8) {
                    throw new java.lang.IllegalArgumentException();
                }
                bVar.D();
                return com.google.gson.n.f44840d;
            }

            @Override // com.google.gson.v
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public void c(jb.d dVar, com.google.gson.l lVar) {
                if (lVar == null || (lVar instanceof com.google.gson.n)) {
                    dVar.p();
                    return;
                }
                boolean z17 = lVar instanceof com.google.gson.q;
                if (z17) {
                    if (!z17) {
                        throw new java.lang.IllegalStateException("Not a JSON Primitive: " + lVar);
                    }
                    com.google.gson.q qVar = (com.google.gson.q) lVar;
                    java.lang.Object obj = qVar.f44842d;
                    if (obj instanceof java.lang.Number) {
                        dVar.z(qVar.d());
                        return;
                    } else if (obj instanceof java.lang.Boolean) {
                        dVar.C(obj instanceof java.lang.Boolean ? ((java.lang.Boolean) obj).booleanValue() : java.lang.Boolean.parseBoolean(qVar.e()));
                        return;
                    } else {
                        dVar.A(qVar.e());
                        return;
                    }
                }
                boolean z18 = lVar instanceof com.google.gson.k;
                if (z18) {
                    dVar.b();
                    if (!z18) {
                        throw new java.lang.IllegalStateException("Not a JSON Array: " + lVar);
                    }
                    java.util.Iterator it = ((com.google.gson.k) lVar).iterator();
                    while (it.hasNext()) {
                        c(dVar, (com.google.gson.l) it.next());
                    }
                    dVar.i();
                    return;
                }
                boolean z19 = lVar instanceof com.google.gson.o;
                if (!z19) {
                    throw new java.lang.IllegalArgumentException("Couldn't write " + lVar.getClass());
                }
                dVar.c();
                if (!z19) {
                    throw new java.lang.IllegalStateException("Not a JSON Object: " + lVar);
                }
                com.google.gson.internal.c0 c0Var = ((com.google.gson.internal.x) ((com.google.gson.o) lVar).f44841d.entrySet()).f44826d;
                com.google.gson.internal.b0 b0Var = c0Var.f44805h.f44705g;
                int i17 = c0Var.f44804g;
                while (true) {
                    com.google.gson.internal.b0 b0Var2 = c0Var.f44805h;
                    if (!(b0Var != b0Var2)) {
                        dVar.j();
                        return;
                    }
                    if (b0Var == b0Var2) {
                        throw new java.util.NoSuchElementException();
                    }
                    if (c0Var.f44804g != i17) {
                        throw new java.util.ConcurrentModificationException();
                    }
                    com.google.gson.internal.b0 b0Var3 = b0Var.f44705g;
                    dVar.k((java.lang.String) b0Var.f44707i);
                    c(dVar, (com.google.gson.l) b0Var.f44708m);
                    b0Var = b0Var3;
                }
            }
        };
        C = vVar5;
        final java.lang.Class<com.google.gson.l> cls4 = com.google.gson.l.class;
        D = new com.google.gson.w() { // from class: com.google.gson.internal.bind.TypeAdapters$35
            @Override // com.google.gson.w
            public com.google.gson.v a(com.google.gson.i iVar, ib.a aVar) {
                final java.lang.Class cls22 = aVar.f290021a;
                if (cls4.isAssignableFrom(cls22)) {
                    return new com.google.gson.v() { // from class: com.google.gson.internal.bind.TypeAdapters$35.1
                        @Override // com.google.gson.v
                        public java.lang.Object b(jb.b bVar) {
                            java.lang.Object b17 = vVar5.b(bVar);
                            if (b17 != null) {
                                java.lang.Class cls32 = cls22;
                                if (!cls32.isInstance(b17)) {
                                    throw new com.google.gson.r("Expected a " + cls32.getName() + " but was " + b17.getClass().getName());
                                }
                            }
                            return b17;
                        }

                        @Override // com.google.gson.v
                        public void c(jb.d dVar, java.lang.Object obj) {
                            vVar5.c(dVar, obj);
                        }
                    };
                }
                return null;
            }

            public java.lang.String toString() {
                return "Factory[typeHierarchy=" + cls4.getName() + ",adapter=" + vVar5 + "]";
            }
        };
        E = new com.google.gson.w() { // from class: com.google.gson.internal.bind.TypeAdapters$30
            @Override // com.google.gson.w
            public com.google.gson.v a(com.google.gson.i iVar, ib.a aVar) {
                final java.lang.Class cls5 = aVar.f290021a;
                if (!java.lang.Enum.class.isAssignableFrom(cls5) || cls5 == java.lang.Enum.class) {
                    return null;
                }
                if (!cls5.isEnum()) {
                    cls5 = cls5.getSuperclass();
                }
                return new com.google.gson.v(cls5) { // from class: com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter

                    /* renamed from: a, reason: collision with root package name */
                    public final java.util.Map f44755a = new java.util.HashMap();

                    /* renamed from: b, reason: collision with root package name */
                    public final java.util.Map f44756b = new java.util.HashMap();

                    {
                        try {
                            for (java.lang.Enum r47 : (java.lang.Enum[]) cls5.getEnumConstants()) {
                                java.lang.String name = r47.name();
                                fb.b bVar = (fb.b) cls5.getField(name).getAnnotation(fb.b.class);
                                if (bVar != null) {
                                    name = bVar.value();
                                    for (java.lang.String str : bVar.alternate()) {
                                        this.f44755a.put(str, r47);
                                    }
                                }
                                this.f44755a.put(name, r47);
                                this.f44756b.put(r47, name);
                            }
                        } catch (java.lang.NoSuchFieldException e17) {
                            throw new java.lang.AssertionError(e17);
                        }
                    }

                    @Override // com.google.gson.v
                    public java.lang.Object b(jb.b bVar) {
                        if (bVar.K() == jb.c.NULL) {
                            bVar.D();
                            return null;
                        }
                        return (java.lang.Enum) ((java.util.HashMap) this.f44755a).get(bVar.I());
                    }

                    @Override // com.google.gson.v
                    public void c(jb.d dVar, java.lang.Object obj) {
                        java.lang.Enum r37 = (java.lang.Enum) obj;
                        dVar.A(r37 == null ? null : (java.lang.String) ((java.util.HashMap) this.f44756b).get(r37));
                    }
                };
            }
        };
    }

    public static com.google.gson.w a(java.lang.Class cls, com.google.gson.v vVar) {
        return new com.google.gson.internal.bind.TypeAdapters$32(cls, vVar);
    }

    public static com.google.gson.w b(java.lang.Class cls, java.lang.Class cls2, com.google.gson.v vVar) {
        return new com.google.gson.internal.bind.TypeAdapters$33(cls, cls2, vVar);
    }
}
