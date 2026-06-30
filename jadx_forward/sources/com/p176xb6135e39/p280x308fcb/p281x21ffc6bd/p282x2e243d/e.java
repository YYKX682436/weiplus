package com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d;

/* loaded from: classes16.dex */
public abstract class e {
    public static final com.p176xb6135e39.p280x308fcb.w A;
    public static final com.p176xb6135e39.p280x308fcb.w B;
    public static final com.p176xb6135e39.p280x308fcb.v C;
    public static final com.p176xb6135e39.p280x308fcb.w D;
    public static final com.p176xb6135e39.p280x308fcb.w E;

    /* renamed from: a, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.w f126304a = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2797x26972045(java.lang.Class.class, new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$1
        @Override // com.p176xb6135e39.p280x308fcb.v
        public java.lang.Object b(jb.b bVar) {
            throw new java.lang.UnsupportedOperationException("Attempted to deserialize a java.lang.Class. Forgot to register a type adapter?");
        }

        @Override // com.p176xb6135e39.p280x308fcb.v
        public void c(jb.d dVar, java.lang.Object obj) {
            throw new java.lang.UnsupportedOperationException("Attempted to serialize java.lang.Class: " + ((java.lang.Class) obj).getName() + ". Forgot to register a type adapter?");
        }
    }.a());

    /* renamed from: b, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.w f126305b = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2797x26972045(java.util.BitSet.class, new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$2
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
        @Override // com.p176xb6135e39.p280x308fcb.v
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
            throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2783x32cb118c.b(jb.b):java.lang.Object");
        }

        @Override // com.p176xb6135e39.p280x308fcb.v
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
    public static final com.p176xb6135e39.p280x308fcb.v f126306c;

    /* renamed from: d, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.w f126307d;

    /* renamed from: e, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.w f126308e;

    /* renamed from: f, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.w f126309f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.w f126310g;

    /* renamed from: h, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.w f126311h;

    /* renamed from: i, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.w f126312i;

    /* renamed from: j, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.w f126313j;

    /* renamed from: k, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.v f126314k;

    /* renamed from: l, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.v f126315l;

    /* renamed from: m, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.v f126316m;

    /* renamed from: n, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.w f126317n;

    /* renamed from: o, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.w f126318o;

    /* renamed from: p, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.v f126319p;

    /* renamed from: q, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.v f126320q;

    /* renamed from: r, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.w f126321r;

    /* renamed from: s, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.w f126322s;

    /* renamed from: t, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.w f126323t;

    /* renamed from: u, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.w f126324u;

    /* renamed from: v, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.w f126325v;

    /* renamed from: w, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.w f126326w;

    /* renamed from: x, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.w f126327x;

    /* renamed from: y, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.w f126328y;

    /* renamed from: z, reason: collision with root package name */
    public static final com.p176xb6135e39.p280x308fcb.w f126329z;

    static {
        com.p176xb6135e39.p280x308fcb.v vVar = new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$3
            @Override // com.p176xb6135e39.p280x308fcb.v
            public java.lang.Object b(jb.b bVar) {
                jb.c K = bVar.K();
                if (K != jb.c.NULL) {
                    return K == jb.c.STRING ? java.lang.Boolean.valueOf(java.lang.Boolean.parseBoolean(bVar.I())) : java.lang.Boolean.valueOf(bVar.v());
                }
                bVar.D();
                return null;
            }

            @Override // com.p176xb6135e39.p280x308fcb.v
            public void c(jb.d dVar, java.lang.Object obj) {
                dVar.x((java.lang.Boolean) obj);
            }
        };
        f126306c = new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$4
            @Override // com.p176xb6135e39.p280x308fcb.v
            public java.lang.Object b(jb.b bVar) {
                if (bVar.K() != jb.c.NULL) {
                    return java.lang.Boolean.valueOf(bVar.I());
                }
                bVar.D();
                return null;
            }

            @Override // com.p176xb6135e39.p280x308fcb.v
            public void c(jb.d dVar, java.lang.Object obj) {
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                dVar.A(bool == null ? "null" : bool.toString());
            }
        };
        f126307d = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2798x26972046(java.lang.Boolean.TYPE, java.lang.Boolean.class, vVar);
        f126308e = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2798x26972046(java.lang.Byte.TYPE, java.lang.Byte.class, new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$5
            @Override // com.p176xb6135e39.p280x308fcb.v
            public java.lang.Object b(jb.b bVar) {
                if (bVar.K() == jb.c.NULL) {
                    bVar.D();
                    return null;
                }
                try {
                    return java.lang.Byte.valueOf((byte) bVar.x());
                } catch (java.lang.NumberFormatException e17) {
                    throw new com.p176xb6135e39.p280x308fcb.r(e17);
                }
            }

            @Override // com.p176xb6135e39.p280x308fcb.v
            public void c(jb.d dVar, java.lang.Object obj) {
                dVar.z((java.lang.Number) obj);
            }
        });
        f126309f = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2798x26972046(java.lang.Short.TYPE, java.lang.Short.class, new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$6
            @Override // com.p176xb6135e39.p280x308fcb.v
            public java.lang.Object b(jb.b bVar) {
                if (bVar.K() == jb.c.NULL) {
                    bVar.D();
                    return null;
                }
                try {
                    return java.lang.Short.valueOf((short) bVar.x());
                } catch (java.lang.NumberFormatException e17) {
                    throw new com.p176xb6135e39.p280x308fcb.r(e17);
                }
            }

            @Override // com.p176xb6135e39.p280x308fcb.v
            public void c(jb.d dVar, java.lang.Object obj) {
                dVar.z((java.lang.Number) obj);
            }
        });
        f126310g = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2798x26972046(java.lang.Integer.TYPE, java.lang.Integer.class, new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$7
            @Override // com.p176xb6135e39.p280x308fcb.v
            public java.lang.Object b(jb.b bVar) {
                if (bVar.K() == jb.c.NULL) {
                    bVar.D();
                    return null;
                }
                try {
                    return java.lang.Integer.valueOf(bVar.x());
                } catch (java.lang.NumberFormatException e17) {
                    throw new com.p176xb6135e39.p280x308fcb.r(e17);
                }
            }

            @Override // com.p176xb6135e39.p280x308fcb.v
            public void c(jb.d dVar, java.lang.Object obj) {
                dVar.z((java.lang.Number) obj);
            }
        });
        f126311h = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2797x26972045(java.util.concurrent.atomic.AtomicInteger.class, new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$8
            @Override // com.p176xb6135e39.p280x308fcb.v
            public java.lang.Object b(jb.b bVar) {
                try {
                    return new java.util.concurrent.atomic.AtomicInteger(bVar.x());
                } catch (java.lang.NumberFormatException e17) {
                    throw new com.p176xb6135e39.p280x308fcb.r(e17);
                }
            }

            @Override // com.p176xb6135e39.p280x308fcb.v
            public void c(jb.d dVar, java.lang.Object obj) {
                dVar.w(((java.util.concurrent.atomic.AtomicInteger) obj).get());
            }
        }.a());
        f126312i = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2797x26972045(java.util.concurrent.atomic.AtomicBoolean.class, new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$9
            @Override // com.p176xb6135e39.p280x308fcb.v
            public java.lang.Object b(jb.b bVar) {
                return new java.util.concurrent.atomic.AtomicBoolean(bVar.v());
            }

            @Override // com.p176xb6135e39.p280x308fcb.v
            public void c(jb.d dVar, java.lang.Object obj) {
                dVar.C(((java.util.concurrent.atomic.AtomicBoolean) obj).get());
            }
        }.a());
        f126313j = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2797x26972045(java.util.concurrent.atomic.AtomicIntegerArray.class, new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$10
            @Override // com.p176xb6135e39.p280x308fcb.v
            public java.lang.Object b(jb.b bVar) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                bVar.a();
                while (bVar.l()) {
                    try {
                        arrayList.add(java.lang.Integer.valueOf(bVar.x()));
                    } catch (java.lang.NumberFormatException e17) {
                        throw new com.p176xb6135e39.p280x308fcb.r(e17);
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

            @Override // com.p176xb6135e39.p280x308fcb.v
            public void c(jb.d dVar, java.lang.Object obj) {
                dVar.b();
                int length = ((java.util.concurrent.atomic.AtomicIntegerArray) obj).length();
                for (int i17 = 0; i17 < length; i17++) {
                    dVar.w(r6.get(i17));
                }
                dVar.i();
            }
        }.a());
        f126314k = new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$11
            @Override // com.p176xb6135e39.p280x308fcb.v
            public java.lang.Object b(jb.b bVar) {
                if (bVar.K() == jb.c.NULL) {
                    bVar.D();
                    return null;
                }
                try {
                    return java.lang.Long.valueOf(bVar.z());
                } catch (java.lang.NumberFormatException e17) {
                    throw new com.p176xb6135e39.p280x308fcb.r(e17);
                }
            }

            @Override // com.p176xb6135e39.p280x308fcb.v
            public void c(jb.d dVar, java.lang.Object obj) {
                dVar.z((java.lang.Number) obj);
            }
        };
        f126315l = new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$12
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
                dVar.z((java.lang.Number) obj);
            }
        };
        f126316m = new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$13
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
                dVar.z((java.lang.Number) obj);
            }
        };
        f126317n = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2797x26972045(java.lang.Number.class, new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$14
            @Override // com.p176xb6135e39.p280x308fcb.v
            public java.lang.Object b(jb.b bVar) {
                jb.c K = bVar.K();
                int ordinal = K.ordinal();
                if (ordinal == 5 || ordinal == 6) {
                    return new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.u(bVar.I());
                }
                if (ordinal == 8) {
                    bVar.D();
                    return null;
                }
                throw new com.p176xb6135e39.p280x308fcb.r("Expecting number, got: " + K);
            }

            @Override // com.p176xb6135e39.p280x308fcb.v
            public void c(jb.d dVar, java.lang.Object obj) {
                dVar.z((java.lang.Number) obj);
            }
        });
        f126318o = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2798x26972046(java.lang.Character.TYPE, java.lang.Character.class, new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$15
            @Override // com.p176xb6135e39.p280x308fcb.v
            public java.lang.Object b(jb.b bVar) {
                if (bVar.K() == jb.c.NULL) {
                    bVar.D();
                    return null;
                }
                java.lang.String I = bVar.I();
                if (I.length() == 1) {
                    return java.lang.Character.valueOf(I.charAt(0));
                }
                throw new com.p176xb6135e39.p280x308fcb.r("Expecting character, got: ".concat(I));
            }

            @Override // com.p176xb6135e39.p280x308fcb.v
            public void c(jb.d dVar, java.lang.Object obj) {
                java.lang.Character ch6 = (java.lang.Character) obj;
                dVar.A(ch6 == null ? null : java.lang.String.valueOf(ch6));
            }
        });
        com.p176xb6135e39.p280x308fcb.v vVar2 = new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$16
            @Override // com.p176xb6135e39.p280x308fcb.v
            public java.lang.Object b(jb.b bVar) {
                jb.c K = bVar.K();
                if (K != jb.c.NULL) {
                    return K == jb.c.BOOLEAN ? java.lang.Boolean.toString(bVar.v()) : bVar.I();
                }
                bVar.D();
                return null;
            }

            @Override // com.p176xb6135e39.p280x308fcb.v
            public void c(jb.d dVar, java.lang.Object obj) {
                dVar.A((java.lang.String) obj);
            }
        };
        f126319p = new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$17
            @Override // com.p176xb6135e39.p280x308fcb.v
            public java.lang.Object b(jb.b bVar) {
                if (bVar.K() == jb.c.NULL) {
                    bVar.D();
                    return null;
                }
                try {
                    return new java.math.BigDecimal(bVar.I());
                } catch (java.lang.NumberFormatException e17) {
                    throw new com.p176xb6135e39.p280x308fcb.r(e17);
                }
            }

            @Override // com.p176xb6135e39.p280x308fcb.v
            public void c(jb.d dVar, java.lang.Object obj) {
                dVar.z((java.math.BigDecimal) obj);
            }
        };
        f126320q = new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$18
            @Override // com.p176xb6135e39.p280x308fcb.v
            public java.lang.Object b(jb.b bVar) {
                if (bVar.K() == jb.c.NULL) {
                    bVar.D();
                    return null;
                }
                try {
                    return new java.math.BigInteger(bVar.I());
                } catch (java.lang.NumberFormatException e17) {
                    throw new com.p176xb6135e39.p280x308fcb.r(e17);
                }
            }

            @Override // com.p176xb6135e39.p280x308fcb.v
            public void c(jb.d dVar, java.lang.Object obj) {
                dVar.z((java.math.BigInteger) obj);
            }
        };
        f126321r = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2797x26972045(java.lang.String.class, vVar2);
        f126322s = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2797x26972045(java.lang.StringBuilder.class, new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$19
            @Override // com.p176xb6135e39.p280x308fcb.v
            public java.lang.Object b(jb.b bVar) {
                if (bVar.K() != jb.c.NULL) {
                    return new java.lang.StringBuilder(bVar.I());
                }
                bVar.D();
                return null;
            }

            @Override // com.p176xb6135e39.p280x308fcb.v
            public void c(jb.d dVar, java.lang.Object obj) {
                java.lang.StringBuilder sb6 = (java.lang.StringBuilder) obj;
                dVar.A(sb6 == null ? null : sb6.toString());
            }
        });
        f126323t = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2797x26972045(java.lang.StringBuffer.class, new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$20
            @Override // com.p176xb6135e39.p280x308fcb.v
            public java.lang.Object b(jb.b bVar) {
                if (bVar.K() != jb.c.NULL) {
                    return new java.lang.StringBuffer(bVar.I());
                }
                bVar.D();
                return null;
            }

            @Override // com.p176xb6135e39.p280x308fcb.v
            public void c(jb.d dVar, java.lang.Object obj) {
                java.lang.StringBuffer stringBuffer = (java.lang.StringBuffer) obj;
                dVar.A(stringBuffer == null ? null : stringBuffer.toString());
            }
        });
        f126324u = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2797x26972045(java.net.URL.class, new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$21
            @Override // com.p176xb6135e39.p280x308fcb.v
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

            @Override // com.p176xb6135e39.p280x308fcb.v
            public void c(jb.d dVar, java.lang.Object obj) {
                java.net.URL url = (java.net.URL) obj;
                dVar.A(url == null ? null : url.toExternalForm());
            }
        });
        f126325v = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2797x26972045(java.net.URI.class, new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$22
            @Override // com.p176xb6135e39.p280x308fcb.v
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
                    throw new com.p176xb6135e39.p280x308fcb.m(e17);
                }
            }

            @Override // com.p176xb6135e39.p280x308fcb.v
            public void c(jb.d dVar, java.lang.Object obj) {
                java.net.URI uri = (java.net.URI) obj;
                dVar.A(uri == null ? null : uri.toASCIIString());
            }
        });
        final com.p176xb6135e39.p280x308fcb.v vVar3 = new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$23
            @Override // com.p176xb6135e39.p280x308fcb.v
            public java.lang.Object b(jb.b bVar) {
                if (bVar.K() != jb.c.NULL) {
                    return java.net.InetAddress.getByName(bVar.I());
                }
                bVar.D();
                return null;
            }

            @Override // com.p176xb6135e39.p280x308fcb.v
            public void c(jb.d dVar, java.lang.Object obj) {
                java.net.InetAddress inetAddress = (java.net.InetAddress) obj;
                dVar.A(inetAddress == null ? null : inetAddress.getHostAddress());
            }
        };
        final java.lang.Class<java.net.InetAddress> cls = java.net.InetAddress.class;
        f126326w = new com.p176xb6135e39.p280x308fcb.w() { // from class: com.google.gson.internal.bind.TypeAdapters$35
            @Override // com.p176xb6135e39.p280x308fcb.w
            public com.p176xb6135e39.p280x308fcb.v a(com.p176xb6135e39.p280x308fcb.i iVar, ib.a aVar) {
                final java.lang.Class<?> cls2 = aVar.f371554a;
                if (cls.isAssignableFrom(cls2)) {
                    return new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$35.1
                        @Override // com.p176xb6135e39.p280x308fcb.v
                        public java.lang.Object b(jb.b bVar) {
                            java.lang.Object b17 = vVar3.b(bVar);
                            if (b17 != null) {
                                java.lang.Class cls3 = cls2;
                                if (!cls3.isInstance(b17)) {
                                    throw new com.p176xb6135e39.p280x308fcb.r("Expected a " + cls3.getName() + " but was " + b17.getClass().getName());
                                }
                            }
                            return b17;
                        }

                        @Override // com.p176xb6135e39.p280x308fcb.v
                        public void c(jb.d dVar, java.lang.Object obj) {
                            vVar3.c(dVar, obj);
                        }
                    };
                }
                return null;
            }

            /* renamed from: toString */
            public java.lang.String m20488x9616526c() {
                return "Factory[typeHierarchy=" + cls.getName() + ",adapter=" + vVar3 + "]";
            }
        };
        f126327x = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2797x26972045(java.util.UUID.class, new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$24
            @Override // com.p176xb6135e39.p280x308fcb.v
            public java.lang.Object b(jb.b bVar) {
                if (bVar.K() != jb.c.NULL) {
                    return java.util.UUID.fromString(bVar.I());
                }
                bVar.D();
                return null;
            }

            @Override // com.p176xb6135e39.p280x308fcb.v
            public void c(jb.d dVar, java.lang.Object obj) {
                java.util.UUID uuid = (java.util.UUID) obj;
                dVar.A(uuid == null ? null : uuid.toString());
            }
        });
        f126328y = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2797x26972045(java.util.Currency.class, new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$25
            @Override // com.p176xb6135e39.p280x308fcb.v
            public java.lang.Object b(jb.b bVar) {
                return java.util.Currency.getInstance(bVar.I());
            }

            @Override // com.p176xb6135e39.p280x308fcb.v
            public void c(jb.d dVar, java.lang.Object obj) {
                dVar.A(((java.util.Currency) obj).getCurrencyCode());
            }
        }.a());
        f126329z = new com.p176xb6135e39.p280x308fcb.w() { // from class: com.google.gson.internal.bind.TypeAdapters$26
            @Override // com.p176xb6135e39.p280x308fcb.w
            public com.p176xb6135e39.p280x308fcb.v a(com.p176xb6135e39.p280x308fcb.i iVar, ib.a aVar) {
                if (aVar.f371554a != java.sql.Timestamp.class) {
                    return null;
                }
                iVar.getClass();
                final com.p176xb6135e39.p280x308fcb.v d17 = iVar.d(new ib.a(java.util.Date.class));
                return new com.p176xb6135e39.p280x308fcb.v(this) { // from class: com.google.gson.internal.bind.TypeAdapters$26.1
                    @Override // com.p176xb6135e39.p280x308fcb.v
                    public java.lang.Object b(jb.b bVar) {
                        java.util.Date date = (java.util.Date) d17.b(bVar);
                        if (date != null) {
                            return new java.sql.Timestamp(date.getTime());
                        }
                        return null;
                    }

                    @Override // com.p176xb6135e39.p280x308fcb.v
                    public void c(jb.d dVar, java.lang.Object obj) {
                        d17.c(dVar, (java.sql.Timestamp) obj);
                    }
                };
            }
        };
        final com.p176xb6135e39.p280x308fcb.v vVar4 = new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$27
            @Override // com.p176xb6135e39.p280x308fcb.v
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

            @Override // com.p176xb6135e39.p280x308fcb.v
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
        A = new com.p176xb6135e39.p280x308fcb.w() { // from class: com.google.gson.internal.bind.TypeAdapters$34
            @Override // com.p176xb6135e39.p280x308fcb.w
            public com.p176xb6135e39.p280x308fcb.v a(com.p176xb6135e39.p280x308fcb.i iVar, ib.a aVar) {
                java.lang.Class cls4 = aVar.f371554a;
                if (cls4 == cls2 || cls4 == cls3) {
                    return vVar4;
                }
                return null;
            }

            /* renamed from: toString */
            public java.lang.String m20487x9616526c() {
                return "Factory[type=" + cls2.getName() + "+" + cls3.getName() + ",adapter=" + vVar4 + "]";
            }
        };
        B = new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2797x26972045(java.util.Locale.class, new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$28
            @Override // com.p176xb6135e39.p280x308fcb.v
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

            @Override // com.p176xb6135e39.p280x308fcb.v
            public void c(jb.d dVar, java.lang.Object obj) {
                java.util.Locale locale = (java.util.Locale) obj;
                dVar.A(locale == null ? null : locale.toString());
            }
        });
        final com.p176xb6135e39.p280x308fcb.v vVar5 = new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$29
            @Override // com.p176xb6135e39.p280x308fcb.v
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public com.p176xb6135e39.p280x308fcb.l b(jb.b bVar) {
                int ordinal = bVar.K().ordinal();
                if (ordinal == 0) {
                    com.p176xb6135e39.p280x308fcb.k kVar = new com.p176xb6135e39.p280x308fcb.k();
                    bVar.a();
                    while (bVar.l()) {
                        ((java.util.ArrayList) kVar.f126372d).add(b(bVar));
                    }
                    bVar.i();
                    return kVar;
                }
                if (ordinal == 2) {
                    com.p176xb6135e39.p280x308fcb.o oVar = new com.p176xb6135e39.p280x308fcb.o();
                    bVar.b();
                    while (bVar.l()) {
                        oVar.f126374d.put(bVar.A(), b(bVar));
                    }
                    bVar.j();
                    return oVar;
                }
                if (ordinal == 5) {
                    return new com.p176xb6135e39.p280x308fcb.q(bVar.I());
                }
                if (ordinal == 6) {
                    return new com.p176xb6135e39.p280x308fcb.q(new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.u(bVar.I()));
                }
                if (ordinal == 7) {
                    return new com.p176xb6135e39.p280x308fcb.q(java.lang.Boolean.valueOf(bVar.v()));
                }
                if (ordinal != 8) {
                    throw new java.lang.IllegalArgumentException();
                }
                bVar.D();
                return com.p176xb6135e39.p280x308fcb.n.f126373d;
            }

            @Override // com.p176xb6135e39.p280x308fcb.v
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public void c(jb.d dVar, com.p176xb6135e39.p280x308fcb.l lVar) {
                if (lVar == null || (lVar instanceof com.p176xb6135e39.p280x308fcb.n)) {
                    dVar.p();
                    return;
                }
                boolean z17 = lVar instanceof com.p176xb6135e39.p280x308fcb.q;
                if (z17) {
                    if (!z17) {
                        throw new java.lang.IllegalStateException("Not a JSON Primitive: " + lVar);
                    }
                    com.p176xb6135e39.p280x308fcb.q qVar = (com.p176xb6135e39.p280x308fcb.q) lVar;
                    java.lang.Object obj = qVar.f126375d;
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
                boolean z18 = lVar instanceof com.p176xb6135e39.p280x308fcb.k;
                if (z18) {
                    dVar.b();
                    if (!z18) {
                        throw new java.lang.IllegalStateException("Not a JSON Array: " + lVar);
                    }
                    java.util.Iterator it = ((com.p176xb6135e39.p280x308fcb.k) lVar).iterator();
                    while (it.hasNext()) {
                        c(dVar, (com.p176xb6135e39.p280x308fcb.l) it.next());
                    }
                    dVar.i();
                    return;
                }
                boolean z19 = lVar instanceof com.p176xb6135e39.p280x308fcb.o;
                if (!z19) {
                    throw new java.lang.IllegalArgumentException("Couldn't write " + lVar.getClass());
                }
                dVar.c();
                if (!z19) {
                    throw new java.lang.IllegalStateException("Not a JSON Object: " + lVar);
                }
                com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.c0 c0Var = ((com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.x) ((com.p176xb6135e39.p280x308fcb.o) lVar).f126374d.entrySet()).f126359d;
                com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var = c0Var.f126338h.f126238g;
                int i17 = c0Var.f126337g;
                while (true) {
                    com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var2 = c0Var.f126338h;
                    if (!(b0Var != b0Var2)) {
                        dVar.j();
                        return;
                    }
                    if (b0Var == b0Var2) {
                        throw new java.util.NoSuchElementException();
                    }
                    if (c0Var.f126337g != i17) {
                        throw new java.util.ConcurrentModificationException();
                    }
                    com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.b0 b0Var3 = b0Var.f126238g;
                    dVar.k((java.lang.String) b0Var.f126240i);
                    c(dVar, (com.p176xb6135e39.p280x308fcb.l) b0Var.f126241m);
                    b0Var = b0Var3;
                }
            }
        };
        C = vVar5;
        final java.lang.Class<com.p176xb6135e39.p280x308fcb.l> cls4 = com.p176xb6135e39.p280x308fcb.l.class;
        D = new com.p176xb6135e39.p280x308fcb.w() { // from class: com.google.gson.internal.bind.TypeAdapters$35
            @Override // com.p176xb6135e39.p280x308fcb.w
            public com.p176xb6135e39.p280x308fcb.v a(com.p176xb6135e39.p280x308fcb.i iVar, ib.a aVar) {
                final java.lang.Class cls22 = aVar.f371554a;
                if (cls4.isAssignableFrom(cls22)) {
                    return new com.p176xb6135e39.p280x308fcb.v() { // from class: com.google.gson.internal.bind.TypeAdapters$35.1
                        @Override // com.p176xb6135e39.p280x308fcb.v
                        public java.lang.Object b(jb.b bVar) {
                            java.lang.Object b17 = vVar5.b(bVar);
                            if (b17 != null) {
                                java.lang.Class cls32 = cls22;
                                if (!cls32.isInstance(b17)) {
                                    throw new com.p176xb6135e39.p280x308fcb.r("Expected a " + cls32.getName() + " but was " + b17.getClass().getName());
                                }
                            }
                            return b17;
                        }

                        @Override // com.p176xb6135e39.p280x308fcb.v
                        public void c(jb.d dVar, java.lang.Object obj) {
                            vVar5.c(dVar, obj);
                        }
                    };
                }
                return null;
            }

            /* renamed from: toString */
            public java.lang.String m20488x9616526c() {
                return "Factory[typeHierarchy=" + cls4.getName() + ",adapter=" + vVar5 + "]";
            }
        };
        E = new com.p176xb6135e39.p280x308fcb.w() { // from class: com.google.gson.internal.bind.TypeAdapters$30
            @Override // com.p176xb6135e39.p280x308fcb.w
            public com.p176xb6135e39.p280x308fcb.v a(com.p176xb6135e39.p280x308fcb.i iVar, ib.a aVar) {
                final java.lang.Class cls5 = aVar.f371554a;
                if (!java.lang.Enum.class.isAssignableFrom(cls5) || cls5 == java.lang.Enum.class) {
                    return null;
                }
                if (!cls5.isEnum()) {
                    cls5 = cls5.getSuperclass();
                }
                return new com.p176xb6135e39.p280x308fcb.v(cls5) { // from class: com.google.gson.internal.bind.TypeAdapters$EnumTypeAdapter

                    /* renamed from: a, reason: collision with root package name */
                    public final java.util.Map f126288a = new java.util.HashMap();

                    /* renamed from: b, reason: collision with root package name */
                    public final java.util.Map f126289b = new java.util.HashMap();

                    {
                        try {
                            for (java.lang.Enum r47 : (java.lang.Enum[]) cls5.getEnumConstants()) {
                                java.lang.String name = r47.name();
                                fb.b bVar = (fb.b) cls5.getField(name).getAnnotation(fb.b.class);
                                if (bVar != null) {
                                    name = bVar.m129291x6ac9171();
                                    for (java.lang.String str : bVar.m129290xac13407a()) {
                                        this.f126288a.put(str, r47);
                                    }
                                }
                                this.f126288a.put(name, r47);
                                this.f126289b.put(r47, name);
                            }
                        } catch (java.lang.NoSuchFieldException e17) {
                            throw new java.lang.AssertionError(e17);
                        }
                    }

                    @Override // com.p176xb6135e39.p280x308fcb.v
                    public java.lang.Object b(jb.b bVar) {
                        if (bVar.K() == jb.c.NULL) {
                            bVar.D();
                            return null;
                        }
                        return (java.lang.Enum) ((java.util.HashMap) this.f126288a).get(bVar.I());
                    }

                    @Override // com.p176xb6135e39.p280x308fcb.v
                    public void c(jb.d dVar, java.lang.Object obj) {
                        java.lang.Enum r37 = (java.lang.Enum) obj;
                        dVar.A(r37 == null ? null : (java.lang.String) ((java.util.HashMap) this.f126289b).get(r37));
                    }
                };
            }
        };
    }

    public static com.p176xb6135e39.p280x308fcb.w a(java.lang.Class cls, com.p176xb6135e39.p280x308fcb.v vVar) {
        return new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2797x26972045(cls, vVar);
    }

    public static com.p176xb6135e39.p280x308fcb.w b(java.lang.Class cls, java.lang.Class cls2, com.p176xb6135e39.p280x308fcb.v vVar) {
        return new com.p176xb6135e39.p280x308fcb.p281x21ffc6bd.p282x2e243d.C2798x26972046(cls, cls2, vVar);
    }
}
