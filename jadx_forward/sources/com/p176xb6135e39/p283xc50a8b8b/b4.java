package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public final class b4 extends com.p176xb6135e39.p283xc50a8b8b.e4 implements java.lang.Comparable, com.p176xb6135e39.p283xc50a8b8b.a5 {

    /* renamed from: s, reason: collision with root package name */
    public static final com.p176xb6135e39.p283xc50a8b8b.ub[] f126440s = com.p176xb6135e39.p283xc50a8b8b.ub.m20928xcee59d22();

    /* renamed from: d, reason: collision with root package name */
    public final int f126441d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.u1 f126442e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f126443f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.d4 f126444g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.r3 f126445h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f126446i;

    /* renamed from: m, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.a4 f126447m;

    /* renamed from: n, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.r3 f126448n;

    /* renamed from: o, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.r3 f126449o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p176xb6135e39.p283xc50a8b8b.g4 f126450p;

    /* renamed from: q, reason: collision with root package name */
    public com.p176xb6135e39.p283xc50a8b8b.x3 f126451q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Object f126452r;

    static {
        if (com.p176xb6135e39.p283xc50a8b8b.a4.m20552xcee59d22().length != com.p176xb6135e39.p283xc50a8b8b.t1.m20911xcee59d22().length) {
            throw new java.lang.RuntimeException("descriptor.proto has a new declared type but Descriptors.java wasn't updated.");
        }
    }

    public b4(com.p176xb6135e39.p283xc50a8b8b.u1 u1Var, com.p176xb6135e39.p283xc50a8b8b.d4 d4Var, com.p176xb6135e39.p283xc50a8b8b.r3 r3Var, int i17, boolean z17, com.p176xb6135e39.p283xc50a8b8b.q3 q3Var) {
        super(null);
        this.f126441d = i17;
        this.f126442e = u1Var;
        this.f126443f = com.p176xb6135e39.p283xc50a8b8b.i4.a(d4Var, r3Var, u1Var.m20916xfb82e301());
        this.f126444g = d4Var;
        if (u1Var.m()) {
            u1Var.h();
        } else {
            java.lang.String m20916xfb82e301 = u1Var.m20916xfb82e301();
            int length = m20916xfb82e301.length();
            new java.lang.StringBuilder(length);
            boolean z18 = false;
            for (int i18 = 0; i18 < length; i18++) {
                if (m20916xfb82e301.charAt(i18) == '_') {
                    z18 = true;
                } else if (z18) {
                    z18 = false;
                }
            }
        }
        if (u1Var.p()) {
            this.f126447m = com.p176xb6135e39.p283xc50a8b8b.a4.m20552xcee59d22()[(com.p176xb6135e39.p283xc50a8b8b.t1.a(u1Var.f127098h) == null ? com.p176xb6135e39.p283xc50a8b8b.t1.TYPE_DOUBLE : r11).f127066d - 1];
        }
        this.f126446i = u1Var.f127105r;
        if (this.f126442e.f127096f <= 0) {
            throw new com.p176xb6135e39.p283xc50a8b8b.w3(this, "Field numbers must be positive integers.");
        }
        if (z17) {
            if (!u1Var.l()) {
                throw new com.p176xb6135e39.p283xc50a8b8b.w3(this, "FieldDescriptorProto.extendee not set for extension field.");
            }
            this.f126448n = null;
            if (r3Var != null) {
                this.f126445h = r3Var;
            } else {
                this.f126445h = null;
            }
            if (u1Var.n()) {
                throw new com.p176xb6135e39.p283xc50a8b8b.w3(this, "FieldDescriptorProto.oneof_index set for extension field.");
            }
            this.f126450p = null;
        } else {
            if (u1Var.l()) {
                throw new com.p176xb6135e39.p283xc50a8b8b.w3(this, "FieldDescriptorProto.extendee set for non-extension field.");
            }
            this.f126448n = r3Var;
            if (u1Var.n()) {
                int i19 = u1Var.f127102o;
                if (i19 < 0 || i19 >= r3Var.f126999d.f()) {
                    java.lang.String valueOf = java.lang.String.valueOf(r3Var.mo20569xfb82e301());
                    throw new com.p176xb6135e39.p283xc50a8b8b.w3(this, valueOf.length() != 0 ? "FieldDescriptorProto.oneof_index is out of range for type ".concat(valueOf) : new java.lang.String("FieldDescriptorProto.oneof_index is out of range for type "));
                }
                com.p176xb6135e39.p283xc50a8b8b.g4 g4Var = (com.p176xb6135e39.p283xc50a8b8b.g4) r3Var.p().get(u1Var.f127102o);
                this.f126450p = g4Var;
                g4Var.f126665i++;
            } else {
                this.f126450p = null;
            }
            this.f126445h = null;
        }
        d4Var.f126543m.b(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x0193. Please report as an issue. */
    public static void k(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        com.p176xb6135e39.p283xc50a8b8b.u1 u1Var = b4Var.f126442e;
        boolean l17 = u1Var.l();
        com.p176xb6135e39.p283xc50a8b8b.u3 u3Var = com.p176xb6135e39.p283xc50a8b8b.u3.TYPES_ONLY;
        com.p176xb6135e39.p283xc50a8b8b.d4 d4Var = b4Var.f126444g;
        if (l17) {
            com.p176xb6135e39.p283xc50a8b8b.e4 e17 = d4Var.f126543m.e(u1Var.g(), b4Var, u3Var);
            if (!(e17 instanceof com.p176xb6135e39.p283xc50a8b8b.r3)) {
                java.lang.String g17 = u1Var.g();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(g17).length() + 25);
                sb6.append('\"');
                sb6.append(g17);
                sb6.append("\" is not a message type.");
                throw new com.p176xb6135e39.p283xc50a8b8b.w3(b4Var, sb6.toString());
            }
            com.p176xb6135e39.p283xc50a8b8b.r3 r3Var = (com.p176xb6135e39.p283xc50a8b8b.r3) e17;
            b4Var.f126448n = r3Var;
            if (!r3Var.s(u1Var.f127096f)) {
                java.lang.String str = b4Var.f126448n.f127000e;
                int i17 = u1Var.f127096f;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 55);
                sb7.append('\"');
                sb7.append(str);
                sb7.append("\" does not declare ");
                sb7.append(i17);
                sb7.append(" as an extension number.");
                throw new com.p176xb6135e39.p283xc50a8b8b.w3(b4Var, sb7.toString());
            }
        }
        if (u1Var.q()) {
            com.p176xb6135e39.p283xc50a8b8b.e4 e18 = d4Var.f126543m.e(u1Var.j(), b4Var, u3Var);
            if (!u1Var.p()) {
                if (e18 instanceof com.p176xb6135e39.p283xc50a8b8b.r3) {
                    b4Var.f126447m = com.p176xb6135e39.p283xc50a8b8b.a4.f126388g;
                } else {
                    if (!(e18 instanceof com.p176xb6135e39.p283xc50a8b8b.x3)) {
                        java.lang.String j17 = u1Var.j();
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(java.lang.String.valueOf(j17).length() + 17);
                        sb8.append('\"');
                        sb8.append(j17);
                        sb8.append("\" is not a type.");
                        throw new com.p176xb6135e39.p283xc50a8b8b.w3(b4Var, sb8.toString());
                    }
                    b4Var.f126447m = com.p176xb6135e39.p283xc50a8b8b.a4.f126390i;
                }
            }
            com.p176xb6135e39.p283xc50a8b8b.z3 z3Var = b4Var.f126447m.f126392d;
            if (z3Var == com.p176xb6135e39.p283xc50a8b8b.z3.MESSAGE) {
                if (!(e18 instanceof com.p176xb6135e39.p283xc50a8b8b.r3)) {
                    java.lang.String j18 = u1Var.j();
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder(java.lang.String.valueOf(j18).length() + 25);
                    sb9.append('\"');
                    sb9.append(j18);
                    sb9.append("\" is not a message type.");
                    throw new com.p176xb6135e39.p283xc50a8b8b.w3(b4Var, sb9.toString());
                }
                b4Var.f126449o = (com.p176xb6135e39.p283xc50a8b8b.r3) e18;
                if (u1Var.k()) {
                    throw new com.p176xb6135e39.p283xc50a8b8b.w3(b4Var, "Messages can't have default values.");
                }
            } else {
                if (z3Var != com.p176xb6135e39.p283xc50a8b8b.z3.ENUM) {
                    throw new com.p176xb6135e39.p283xc50a8b8b.w3(b4Var, "Field with primitive type has type_name.");
                }
                if (!(e18 instanceof com.p176xb6135e39.p283xc50a8b8b.x3)) {
                    java.lang.String j19 = u1Var.j();
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder(java.lang.String.valueOf(j19).length() + 23);
                    sb10.append('\"');
                    sb10.append(j19);
                    sb10.append("\" is not an enum type.");
                    throw new com.p176xb6135e39.p283xc50a8b8b.w3(b4Var, sb10.toString());
                }
                b4Var.f126451q = (com.p176xb6135e39.p283xc50a8b8b.x3) e18;
            }
        } else {
            com.p176xb6135e39.p283xc50a8b8b.z3 z3Var2 = b4Var.f126447m.f126392d;
            if (z3Var2 == com.p176xb6135e39.p283xc50a8b8b.z3.MESSAGE || z3Var2 == com.p176xb6135e39.p283xc50a8b8b.z3.ENUM) {
                throw new com.p176xb6135e39.p283xc50a8b8b.w3(b4Var, "Field with message or enum type missing type_name.");
            }
        }
        if (u1Var.i().f127295g && !b4Var.r()) {
            throw new com.p176xb6135e39.p283xc50a8b8b.w3(b4Var, "[packed = true] can only be specified for repeated primitive fields.");
        }
        if (u1Var.k()) {
            if (b4Var.d1()) {
                throw new com.p176xb6135e39.p283xc50a8b8b.w3(b4Var, "Repeated fields cannot have default values.");
            }
            try {
                switch (b4Var.f126447m.ordinal()) {
                    case 0:
                        if (!u1Var.f().equals("inf")) {
                            if (!u1Var.f().equals("-inf")) {
                                if (!u1Var.f().equals("nan")) {
                                    b4Var.f126452r = java.lang.Double.valueOf(u1Var.f());
                                    break;
                                } else {
                                    b4Var.f126452r = java.lang.Double.valueOf(Double.NaN);
                                    break;
                                }
                            } else {
                                b4Var.f126452r = java.lang.Double.valueOf(Double.NEGATIVE_INFINITY);
                                break;
                            }
                        } else {
                            b4Var.f126452r = java.lang.Double.valueOf(Double.POSITIVE_INFINITY);
                            break;
                        }
                    case 1:
                        if (!u1Var.f().equals("inf")) {
                            if (!u1Var.f().equals("-inf")) {
                                if (!u1Var.f().equals("nan")) {
                                    b4Var.f126452r = java.lang.Float.valueOf(u1Var.f());
                                    break;
                                } else {
                                    b4Var.f126452r = java.lang.Float.valueOf(Float.NaN);
                                    break;
                                }
                            } else {
                                b4Var.f126452r = java.lang.Float.valueOf(Float.NEGATIVE_INFINITY);
                                break;
                            }
                        } else {
                            b4Var.f126452r = java.lang.Float.valueOf(Float.POSITIVE_INFINITY);
                            break;
                        }
                    case 2:
                    case 15:
                    case 17:
                        b4Var.f126452r = java.lang.Long.valueOf(com.p176xb6135e39.p283xc50a8b8b.ia.b(u1Var.f(), true, true));
                        break;
                    case 3:
                    case 5:
                        b4Var.f126452r = java.lang.Long.valueOf(com.p176xb6135e39.p283xc50a8b8b.ia.b(u1Var.f(), false, true));
                        break;
                    case 4:
                    case 14:
                    case 16:
                        b4Var.f126452r = java.lang.Integer.valueOf((int) com.p176xb6135e39.p283xc50a8b8b.ia.b(u1Var.f(), true, false));
                        break;
                    case 6:
                    case 12:
                        b4Var.f126452r = java.lang.Integer.valueOf((int) com.p176xb6135e39.p283xc50a8b8b.ia.b(u1Var.f(), false, false));
                        break;
                    case 7:
                        b4Var.f126452r = java.lang.Boolean.valueOf(u1Var.f());
                        break;
                    case 8:
                        b4Var.f126452r = u1Var.f();
                        break;
                    case 9:
                    case 10:
                        throw new com.p176xb6135e39.p283xc50a8b8b.w3(b4Var, "Message type had default value.");
                    case 11:
                        try {
                            b4Var.f126452r = com.p176xb6135e39.p283xc50a8b8b.ia.c(u1Var.f());
                            break;
                        } catch (com.p176xb6135e39.p283xc50a8b8b.ea e19) {
                            java.lang.String valueOf = java.lang.String.valueOf(e19.getMessage());
                            com.p176xb6135e39.p283xc50a8b8b.w3 w3Var = new com.p176xb6135e39.p283xc50a8b8b.w3(b4Var, valueOf.length() != 0 ? "Couldn't parse default value: ".concat(valueOf) : new java.lang.String("Couldn't parse default value: "));
                            w3Var.initCause(e19);
                            throw w3Var;
                        }
                    case 13:
                        com.p176xb6135e39.p283xc50a8b8b.y3 k17 = b4Var.f126451q.k(u1Var.f());
                        b4Var.f126452r = k17;
                        if (k17 == null) {
                            java.lang.String f17 = u1Var.f();
                            java.lang.StringBuilder sb11 = new java.lang.StringBuilder(java.lang.String.valueOf(f17).length() + 30);
                            sb11.append("Unknown enum default value: \"");
                            sb11.append(f17);
                            sb11.append('\"');
                            throw new com.p176xb6135e39.p283xc50a8b8b.w3(b4Var, sb11.toString());
                        }
                        break;
                }
            } catch (java.lang.NumberFormatException e27) {
                java.lang.String f18 = u1Var.f();
                java.lang.StringBuilder sb12 = new java.lang.StringBuilder(java.lang.String.valueOf(f18).length() + 33);
                sb12.append("Could not parse default value: \"");
                sb12.append(f18);
                sb12.append('\"');
                com.p176xb6135e39.p283xc50a8b8b.w3 w3Var2 = new com.p176xb6135e39.p283xc50a8b8b.w3(b4Var, sb12.toString());
                w3Var2.initCause(e27);
                throw w3Var2;
            }
        } else if (b4Var.d1()) {
            b4Var.f126452r = java.util.Collections.emptyList();
        } else {
            int ordinal = b4Var.f126447m.f126392d.ordinal();
            if (ordinal == 7) {
                b4Var.f126452r = java.util.Collections.unmodifiableList(java.util.Arrays.asList(b4Var.f126451q.f127208g)).get(0);
            } else if (ordinal != 8) {
                b4Var.f126452r = b4Var.f126447m.f126392d.f127319d;
            } else {
                b4Var.f126452r = null;
            }
        }
        if (!b4Var.o()) {
            com.p176xb6135e39.p283xc50a8b8b.v3 v3Var = d4Var.f126543m;
            v3Var.getClass();
            com.p176xb6135e39.p283xc50a8b8b.s3 s3Var = new com.p176xb6135e39.p283xc50a8b8b.s3(b4Var.f126448n, u1Var.f127096f);
            java.util.HashMap hashMap = (java.util.HashMap) v3Var.f127141d;
            com.p176xb6135e39.p283xc50a8b8b.b4 b4Var2 = (com.p176xb6135e39.p283xc50a8b8b.b4) hashMap.put(s3Var, b4Var);
            if (b4Var2 != null) {
                hashMap.put(s3Var, b4Var2);
                int i18 = u1Var.f127096f;
                java.lang.String str2 = b4Var.f126448n.f127000e;
                java.lang.String mo20569xfb82e301 = b4Var2.mo20569xfb82e301();
                java.lang.StringBuilder sb13 = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 65 + java.lang.String.valueOf(mo20569xfb82e301).length());
                sb13.append("Field number ");
                sb13.append(i18);
                sb13.append(" has already been used in \"");
                sb13.append(str2);
                sb13.append("\" by field \"");
                sb13.append(mo20569xfb82e301);
                sb13.append("\".");
                throw new com.p176xb6135e39.p283xc50a8b8b.w3(b4Var, sb13.toString());
            }
        }
        com.p176xb6135e39.p283xc50a8b8b.r3 r3Var2 = b4Var.f126448n;
        if (r3Var2 == null || !r3Var2.r().f126759f) {
            return;
        }
        if (!b4Var.o()) {
            throw new com.p176xb6135e39.p283xc50a8b8b.w3(b4Var, "MessageSets cannot have fields, only extensions.");
        }
        com.p176xb6135e39.p283xc50a8b8b.s1 a17 = com.p176xb6135e39.p283xc50a8b8b.s1.a(b4Var.f126442e.f127097g);
        if (a17 == null) {
            a17 = com.p176xb6135e39.p283xc50a8b8b.s1.LABEL_OPTIONAL;
        }
        if (!(a17 == com.p176xb6135e39.p283xc50a8b8b.s1.LABEL_OPTIONAL) || b4Var.f126447m != com.p176xb6135e39.p283xc50a8b8b.a4.f126388g) {
            throw new com.p176xb6135e39.p283xc50a8b8b.w3(b4Var, "Extensions of MessageSets must be optional messages.");
        }
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a5
    public boolean C1() {
        if (!r()) {
            return false;
        }
        com.p176xb6135e39.p283xc50a8b8b.c4 m17 = this.f126444g.m();
        com.p176xb6135e39.p283xc50a8b8b.c4 c4Var = com.p176xb6135e39.p283xc50a8b8b.c4.PROTO2;
        com.p176xb6135e39.p283xc50a8b8b.u1 u1Var = this.f126442e;
        return m17 == c4Var ? u1Var.i().f127295g : !u1Var.i().k() || u1Var.i().f127295g;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a5
    public com.p176xb6135e39.p283xc50a8b8b.ub P() {
        return f126440s[this.f126447m.ordinal()];
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.p176xb6135e39.p283xc50a8b8b.b4 b4Var = (com.p176xb6135e39.p283xc50a8b8b.b4) obj;
        if (b4Var.f126448n == this.f126448n) {
            return this.f126442e.f127096f - b4Var.f126442e.f127096f;
        }
        throw new java.lang.IllegalArgumentException("FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type.");
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a5
    public boolean d1() {
        com.p176xb6135e39.p283xc50a8b8b.s1 a17 = com.p176xb6135e39.p283xc50a8b8b.s1.a(this.f126442e.f127097g);
        if (a17 == null) {
            a17 = com.p176xb6135e39.p283xc50a8b8b.s1.LABEL_OPTIONAL;
        }
        return a17 == com.p176xb6135e39.p283xc50a8b8b.s1.LABEL_REPEATED;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e4
    /* renamed from: getName */
    public java.lang.String mo20569xfb82e301() {
        return this.f126442e.m20916xfb82e301();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a5
    /* renamed from: getNumber */
    public int mo20553x276ffe3f() {
        return this.f126442e.f127096f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e4
    public com.p176xb6135e39.p283xc50a8b8b.d4 h() {
        return this.f126444g;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e4
    public java.lang.String i() {
        return this.f126443f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.e4
    public com.p176xb6135e39.p283xc50a8b8b.k8 j() {
        return this.f126442e;
    }

    public java.lang.Object l() {
        if (this.f126447m.f126392d != com.p176xb6135e39.p283xc50a8b8b.z3.MESSAGE) {
            return this.f126452r;
        }
        throw new java.lang.UnsupportedOperationException("FieldDescriptor.getDefaultValue() called on an embedded message field.");
    }

    public com.p176xb6135e39.p283xc50a8b8b.x3 m() {
        if (this.f126447m.f126392d == com.p176xb6135e39.p283xc50a8b8b.z3.ENUM) {
            return this.f126451q;
        }
        throw new java.lang.UnsupportedOperationException(java.lang.String.format("This field is not of enum type. (%s)", this.f126443f));
    }

    public com.p176xb6135e39.p283xc50a8b8b.r3 n() {
        if (this.f126447m.f126392d == com.p176xb6135e39.p283xc50a8b8b.z3.MESSAGE) {
            return this.f126449o;
        }
        throw new java.lang.UnsupportedOperationException(java.lang.String.format("This field is not of message type. (%s)", this.f126443f));
    }

    public boolean o() {
        return this.f126442e.l();
    }

    public boolean p() {
        return this.f126447m == com.p176xb6135e39.p283xc50a8b8b.a4.f126388g && d1() && n().r().f126762i;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a5
    public com.p176xb6135e39.p283xc50a8b8b.n8 q(com.p176xb6135e39.p283xc50a8b8b.n8 n8Var, com.p176xb6135e39.p283xc50a8b8b.o8 o8Var) {
        return ((com.p176xb6135e39.p283xc50a8b8b.j8) n8Var).mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) o8Var);
    }

    public boolean r() {
        return d1() && P().h();
    }

    public boolean s() {
        com.p176xb6135e39.p283xc50a8b8b.s1 a17 = com.p176xb6135e39.p283xc50a8b8b.s1.a(this.f126442e.f127097g);
        if (a17 == null) {
            a17 = com.p176xb6135e39.p283xc50a8b8b.s1.LABEL_OPTIONAL;
        }
        return a17 == com.p176xb6135e39.p283xc50a8b8b.s1.LABEL_REQUIRED;
    }

    public boolean t() {
        if (this.f126447m != com.p176xb6135e39.p283xc50a8b8b.a4.f126386e) {
            return false;
        }
        if (this.f126448n.r().f126762i) {
            return true;
        }
        com.p176xb6135e39.p283xc50a8b8b.d4 d4Var = this.f126444g;
        if (d4Var.m() == com.p176xb6135e39.p283xc50a8b8b.c4.PROTO3) {
            return true;
        }
        return d4Var.f126537d.f().f126640m;
    }

    /* renamed from: toString */
    public java.lang.String m20570x9616526c() {
        return this.f126443f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a5
    public com.p176xb6135e39.p283xc50a8b8b.vb u0() {
        return P().f127130d;
    }
}
