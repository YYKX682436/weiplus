package com.google.protobuf;

/* loaded from: classes16.dex */
public final class b4 extends com.google.protobuf.e4 implements java.lang.Comparable, com.google.protobuf.a5 {

    /* renamed from: s, reason: collision with root package name */
    public static final com.google.protobuf.ub[] f44907s = com.google.protobuf.ub.values();

    /* renamed from: d, reason: collision with root package name */
    public final int f44908d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.protobuf.u1 f44909e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f44910f;

    /* renamed from: g, reason: collision with root package name */
    public final com.google.protobuf.d4 f44911g;

    /* renamed from: h, reason: collision with root package name */
    public final com.google.protobuf.r3 f44912h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f44913i;

    /* renamed from: m, reason: collision with root package name */
    public com.google.protobuf.a4 f44914m;

    /* renamed from: n, reason: collision with root package name */
    public com.google.protobuf.r3 f44915n;

    /* renamed from: o, reason: collision with root package name */
    public com.google.protobuf.r3 f44916o;

    /* renamed from: p, reason: collision with root package name */
    public final com.google.protobuf.g4 f44917p;

    /* renamed from: q, reason: collision with root package name */
    public com.google.protobuf.x3 f44918q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.Object f44919r;

    static {
        if (com.google.protobuf.a4.values().length != com.google.protobuf.t1.values().length) {
            throw new java.lang.RuntimeException("descriptor.proto has a new declared type but Descriptors.java wasn't updated.");
        }
    }

    public b4(com.google.protobuf.u1 u1Var, com.google.protobuf.d4 d4Var, com.google.protobuf.r3 r3Var, int i17, boolean z17, com.google.protobuf.q3 q3Var) {
        super(null);
        this.f44908d = i17;
        this.f44909e = u1Var;
        this.f44910f = com.google.protobuf.i4.a(d4Var, r3Var, u1Var.getName());
        this.f44911g = d4Var;
        if (u1Var.m()) {
            u1Var.h();
        } else {
            java.lang.String name = u1Var.getName();
            int length = name.length();
            new java.lang.StringBuilder(length);
            boolean z18 = false;
            for (int i18 = 0; i18 < length; i18++) {
                if (name.charAt(i18) == '_') {
                    z18 = true;
                } else if (z18) {
                    z18 = false;
                }
            }
        }
        if (u1Var.p()) {
            this.f44914m = com.google.protobuf.a4.values()[(com.google.protobuf.t1.a(u1Var.f45565h) == null ? com.google.protobuf.t1.TYPE_DOUBLE : r11).f45533d - 1];
        }
        this.f44913i = u1Var.f45572r;
        if (this.f44909e.f45563f <= 0) {
            throw new com.google.protobuf.w3(this, "Field numbers must be positive integers.");
        }
        if (z17) {
            if (!u1Var.l()) {
                throw new com.google.protobuf.w3(this, "FieldDescriptorProto.extendee not set for extension field.");
            }
            this.f44915n = null;
            if (r3Var != null) {
                this.f44912h = r3Var;
            } else {
                this.f44912h = null;
            }
            if (u1Var.n()) {
                throw new com.google.protobuf.w3(this, "FieldDescriptorProto.oneof_index set for extension field.");
            }
            this.f44917p = null;
        } else {
            if (u1Var.l()) {
                throw new com.google.protobuf.w3(this, "FieldDescriptorProto.extendee set for non-extension field.");
            }
            this.f44915n = r3Var;
            if (u1Var.n()) {
                int i19 = u1Var.f45569o;
                if (i19 < 0 || i19 >= r3Var.f45466d.f()) {
                    java.lang.String valueOf = java.lang.String.valueOf(r3Var.getName());
                    throw new com.google.protobuf.w3(this, valueOf.length() != 0 ? "FieldDescriptorProto.oneof_index is out of range for type ".concat(valueOf) : new java.lang.String("FieldDescriptorProto.oneof_index is out of range for type "));
                }
                com.google.protobuf.g4 g4Var = (com.google.protobuf.g4) r3Var.p().get(u1Var.f45569o);
                this.f44917p = g4Var;
                g4Var.f45132i++;
            } else {
                this.f44917p = null;
            }
            this.f44912h = null;
        }
        d4Var.f45010m.b(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:47:0x0193. Please report as an issue. */
    public static void k(com.google.protobuf.b4 b4Var) {
        com.google.protobuf.u1 u1Var = b4Var.f44909e;
        boolean l17 = u1Var.l();
        com.google.protobuf.u3 u3Var = com.google.protobuf.u3.TYPES_ONLY;
        com.google.protobuf.d4 d4Var = b4Var.f44911g;
        if (l17) {
            com.google.protobuf.e4 e17 = d4Var.f45010m.e(u1Var.g(), b4Var, u3Var);
            if (!(e17 instanceof com.google.protobuf.r3)) {
                java.lang.String g17 = u1Var.g();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder(java.lang.String.valueOf(g17).length() + 25);
                sb6.append('\"');
                sb6.append(g17);
                sb6.append("\" is not a message type.");
                throw new com.google.protobuf.w3(b4Var, sb6.toString());
            }
            com.google.protobuf.r3 r3Var = (com.google.protobuf.r3) e17;
            b4Var.f44915n = r3Var;
            if (!r3Var.s(u1Var.f45563f)) {
                java.lang.String str = b4Var.f44915n.f45467e;
                int i17 = u1Var.f45563f;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder(java.lang.String.valueOf(str).length() + 55);
                sb7.append('\"');
                sb7.append(str);
                sb7.append("\" does not declare ");
                sb7.append(i17);
                sb7.append(" as an extension number.");
                throw new com.google.protobuf.w3(b4Var, sb7.toString());
            }
        }
        if (u1Var.q()) {
            com.google.protobuf.e4 e18 = d4Var.f45010m.e(u1Var.j(), b4Var, u3Var);
            if (!u1Var.p()) {
                if (e18 instanceof com.google.protobuf.r3) {
                    b4Var.f44914m = com.google.protobuf.a4.f44855g;
                } else {
                    if (!(e18 instanceof com.google.protobuf.x3)) {
                        java.lang.String j17 = u1Var.j();
                        java.lang.StringBuilder sb8 = new java.lang.StringBuilder(java.lang.String.valueOf(j17).length() + 17);
                        sb8.append('\"');
                        sb8.append(j17);
                        sb8.append("\" is not a type.");
                        throw new com.google.protobuf.w3(b4Var, sb8.toString());
                    }
                    b4Var.f44914m = com.google.protobuf.a4.f44857i;
                }
            }
            com.google.protobuf.z3 z3Var = b4Var.f44914m.f44859d;
            if (z3Var == com.google.protobuf.z3.MESSAGE) {
                if (!(e18 instanceof com.google.protobuf.r3)) {
                    java.lang.String j18 = u1Var.j();
                    java.lang.StringBuilder sb9 = new java.lang.StringBuilder(java.lang.String.valueOf(j18).length() + 25);
                    sb9.append('\"');
                    sb9.append(j18);
                    sb9.append("\" is not a message type.");
                    throw new com.google.protobuf.w3(b4Var, sb9.toString());
                }
                b4Var.f44916o = (com.google.protobuf.r3) e18;
                if (u1Var.k()) {
                    throw new com.google.protobuf.w3(b4Var, "Messages can't have default values.");
                }
            } else {
                if (z3Var != com.google.protobuf.z3.ENUM) {
                    throw new com.google.protobuf.w3(b4Var, "Field with primitive type has type_name.");
                }
                if (!(e18 instanceof com.google.protobuf.x3)) {
                    java.lang.String j19 = u1Var.j();
                    java.lang.StringBuilder sb10 = new java.lang.StringBuilder(java.lang.String.valueOf(j19).length() + 23);
                    sb10.append('\"');
                    sb10.append(j19);
                    sb10.append("\" is not an enum type.");
                    throw new com.google.protobuf.w3(b4Var, sb10.toString());
                }
                b4Var.f44918q = (com.google.protobuf.x3) e18;
            }
        } else {
            com.google.protobuf.z3 z3Var2 = b4Var.f44914m.f44859d;
            if (z3Var2 == com.google.protobuf.z3.MESSAGE || z3Var2 == com.google.protobuf.z3.ENUM) {
                throw new com.google.protobuf.w3(b4Var, "Field with message or enum type missing type_name.");
            }
        }
        if (u1Var.i().f45762g && !b4Var.r()) {
            throw new com.google.protobuf.w3(b4Var, "[packed = true] can only be specified for repeated primitive fields.");
        }
        if (u1Var.k()) {
            if (b4Var.d1()) {
                throw new com.google.protobuf.w3(b4Var, "Repeated fields cannot have default values.");
            }
            try {
                switch (b4Var.f44914m.ordinal()) {
                    case 0:
                        if (!u1Var.f().equals("inf")) {
                            if (!u1Var.f().equals("-inf")) {
                                if (!u1Var.f().equals("nan")) {
                                    b4Var.f44919r = java.lang.Double.valueOf(u1Var.f());
                                    break;
                                } else {
                                    b4Var.f44919r = java.lang.Double.valueOf(Double.NaN);
                                    break;
                                }
                            } else {
                                b4Var.f44919r = java.lang.Double.valueOf(Double.NEGATIVE_INFINITY);
                                break;
                            }
                        } else {
                            b4Var.f44919r = java.lang.Double.valueOf(Double.POSITIVE_INFINITY);
                            break;
                        }
                    case 1:
                        if (!u1Var.f().equals("inf")) {
                            if (!u1Var.f().equals("-inf")) {
                                if (!u1Var.f().equals("nan")) {
                                    b4Var.f44919r = java.lang.Float.valueOf(u1Var.f());
                                    break;
                                } else {
                                    b4Var.f44919r = java.lang.Float.valueOf(Float.NaN);
                                    break;
                                }
                            } else {
                                b4Var.f44919r = java.lang.Float.valueOf(Float.NEGATIVE_INFINITY);
                                break;
                            }
                        } else {
                            b4Var.f44919r = java.lang.Float.valueOf(Float.POSITIVE_INFINITY);
                            break;
                        }
                    case 2:
                    case 15:
                    case 17:
                        b4Var.f44919r = java.lang.Long.valueOf(com.google.protobuf.ia.b(u1Var.f(), true, true));
                        break;
                    case 3:
                    case 5:
                        b4Var.f44919r = java.lang.Long.valueOf(com.google.protobuf.ia.b(u1Var.f(), false, true));
                        break;
                    case 4:
                    case 14:
                    case 16:
                        b4Var.f44919r = java.lang.Integer.valueOf((int) com.google.protobuf.ia.b(u1Var.f(), true, false));
                        break;
                    case 6:
                    case 12:
                        b4Var.f44919r = java.lang.Integer.valueOf((int) com.google.protobuf.ia.b(u1Var.f(), false, false));
                        break;
                    case 7:
                        b4Var.f44919r = java.lang.Boolean.valueOf(u1Var.f());
                        break;
                    case 8:
                        b4Var.f44919r = u1Var.f();
                        break;
                    case 9:
                    case 10:
                        throw new com.google.protobuf.w3(b4Var, "Message type had default value.");
                    case 11:
                        try {
                            b4Var.f44919r = com.google.protobuf.ia.c(u1Var.f());
                            break;
                        } catch (com.google.protobuf.ea e19) {
                            java.lang.String valueOf = java.lang.String.valueOf(e19.getMessage());
                            com.google.protobuf.w3 w3Var = new com.google.protobuf.w3(b4Var, valueOf.length() != 0 ? "Couldn't parse default value: ".concat(valueOf) : new java.lang.String("Couldn't parse default value: "));
                            w3Var.initCause(e19);
                            throw w3Var;
                        }
                    case 13:
                        com.google.protobuf.y3 k17 = b4Var.f44918q.k(u1Var.f());
                        b4Var.f44919r = k17;
                        if (k17 == null) {
                            java.lang.String f17 = u1Var.f();
                            java.lang.StringBuilder sb11 = new java.lang.StringBuilder(java.lang.String.valueOf(f17).length() + 30);
                            sb11.append("Unknown enum default value: \"");
                            sb11.append(f17);
                            sb11.append('\"');
                            throw new com.google.protobuf.w3(b4Var, sb11.toString());
                        }
                        break;
                }
            } catch (java.lang.NumberFormatException e27) {
                java.lang.String f18 = u1Var.f();
                java.lang.StringBuilder sb12 = new java.lang.StringBuilder(java.lang.String.valueOf(f18).length() + 33);
                sb12.append("Could not parse default value: \"");
                sb12.append(f18);
                sb12.append('\"');
                com.google.protobuf.w3 w3Var2 = new com.google.protobuf.w3(b4Var, sb12.toString());
                w3Var2.initCause(e27);
                throw w3Var2;
            }
        } else if (b4Var.d1()) {
            b4Var.f44919r = java.util.Collections.emptyList();
        } else {
            int ordinal = b4Var.f44914m.f44859d.ordinal();
            if (ordinal == 7) {
                b4Var.f44919r = java.util.Collections.unmodifiableList(java.util.Arrays.asList(b4Var.f44918q.f45675g)).get(0);
            } else if (ordinal != 8) {
                b4Var.f44919r = b4Var.f44914m.f44859d.f45786d;
            } else {
                b4Var.f44919r = null;
            }
        }
        if (!b4Var.o()) {
            com.google.protobuf.v3 v3Var = d4Var.f45010m;
            v3Var.getClass();
            com.google.protobuf.s3 s3Var = new com.google.protobuf.s3(b4Var.f44915n, u1Var.f45563f);
            java.util.HashMap hashMap = (java.util.HashMap) v3Var.f45608d;
            com.google.protobuf.b4 b4Var2 = (com.google.protobuf.b4) hashMap.put(s3Var, b4Var);
            if (b4Var2 != null) {
                hashMap.put(s3Var, b4Var2);
                int i18 = u1Var.f45563f;
                java.lang.String str2 = b4Var.f44915n.f45467e;
                java.lang.String name = b4Var2.getName();
                java.lang.StringBuilder sb13 = new java.lang.StringBuilder(java.lang.String.valueOf(str2).length() + 65 + java.lang.String.valueOf(name).length());
                sb13.append("Field number ");
                sb13.append(i18);
                sb13.append(" has already been used in \"");
                sb13.append(str2);
                sb13.append("\" by field \"");
                sb13.append(name);
                sb13.append("\".");
                throw new com.google.protobuf.w3(b4Var, sb13.toString());
            }
        }
        com.google.protobuf.r3 r3Var2 = b4Var.f44915n;
        if (r3Var2 == null || !r3Var2.r().f45226f) {
            return;
        }
        if (!b4Var.o()) {
            throw new com.google.protobuf.w3(b4Var, "MessageSets cannot have fields, only extensions.");
        }
        com.google.protobuf.s1 a17 = com.google.protobuf.s1.a(b4Var.f44909e.f45564g);
        if (a17 == null) {
            a17 = com.google.protobuf.s1.LABEL_OPTIONAL;
        }
        if (!(a17 == com.google.protobuf.s1.LABEL_OPTIONAL) || b4Var.f44914m != com.google.protobuf.a4.f44855g) {
            throw new com.google.protobuf.w3(b4Var, "Extensions of MessageSets must be optional messages.");
        }
    }

    @Override // com.google.protobuf.a5
    public boolean C1() {
        if (!r()) {
            return false;
        }
        com.google.protobuf.c4 m17 = this.f44911g.m();
        com.google.protobuf.c4 c4Var = com.google.protobuf.c4.PROTO2;
        com.google.protobuf.u1 u1Var = this.f44909e;
        return m17 == c4Var ? u1Var.i().f45762g : !u1Var.i().k() || u1Var.i().f45762g;
    }

    @Override // com.google.protobuf.a5
    public com.google.protobuf.ub P() {
        return f44907s[this.f44914m.ordinal()];
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        com.google.protobuf.b4 b4Var = (com.google.protobuf.b4) obj;
        if (b4Var.f44915n == this.f44915n) {
            return this.f44909e.f45563f - b4Var.f44909e.f45563f;
        }
        throw new java.lang.IllegalArgumentException("FieldDescriptors can only be compared to other FieldDescriptors for fields of the same message type.");
    }

    @Override // com.google.protobuf.a5
    public boolean d1() {
        com.google.protobuf.s1 a17 = com.google.protobuf.s1.a(this.f44909e.f45564g);
        if (a17 == null) {
            a17 = com.google.protobuf.s1.LABEL_OPTIONAL;
        }
        return a17 == com.google.protobuf.s1.LABEL_REPEATED;
    }

    @Override // com.google.protobuf.e4
    public java.lang.String getName() {
        return this.f44909e.getName();
    }

    @Override // com.google.protobuf.a5
    public int getNumber() {
        return this.f44909e.f45563f;
    }

    @Override // com.google.protobuf.e4
    public com.google.protobuf.d4 h() {
        return this.f44911g;
    }

    @Override // com.google.protobuf.e4
    public java.lang.String i() {
        return this.f44910f;
    }

    @Override // com.google.protobuf.e4
    public com.google.protobuf.k8 j() {
        return this.f44909e;
    }

    public java.lang.Object l() {
        if (this.f44914m.f44859d != com.google.protobuf.z3.MESSAGE) {
            return this.f44919r;
        }
        throw new java.lang.UnsupportedOperationException("FieldDescriptor.getDefaultValue() called on an embedded message field.");
    }

    public com.google.protobuf.x3 m() {
        if (this.f44914m.f44859d == com.google.protobuf.z3.ENUM) {
            return this.f44918q;
        }
        throw new java.lang.UnsupportedOperationException(java.lang.String.format("This field is not of enum type. (%s)", this.f44910f));
    }

    public com.google.protobuf.r3 n() {
        if (this.f44914m.f44859d == com.google.protobuf.z3.MESSAGE) {
            return this.f44916o;
        }
        throw new java.lang.UnsupportedOperationException(java.lang.String.format("This field is not of message type. (%s)", this.f44910f));
    }

    public boolean o() {
        return this.f44909e.l();
    }

    public boolean p() {
        return this.f44914m == com.google.protobuf.a4.f44855g && d1() && n().r().f45229i;
    }

    @Override // com.google.protobuf.a5
    public com.google.protobuf.n8 q(com.google.protobuf.n8 n8Var, com.google.protobuf.o8 o8Var) {
        return ((com.google.protobuf.j8) n8Var).mergeFrom((com.google.protobuf.k8) o8Var);
    }

    public boolean r() {
        return d1() && P().h();
    }

    public boolean s() {
        com.google.protobuf.s1 a17 = com.google.protobuf.s1.a(this.f44909e.f45564g);
        if (a17 == null) {
            a17 = com.google.protobuf.s1.LABEL_OPTIONAL;
        }
        return a17 == com.google.protobuf.s1.LABEL_REQUIRED;
    }

    public boolean t() {
        if (this.f44914m != com.google.protobuf.a4.f44853e) {
            return false;
        }
        if (this.f44915n.r().f45229i) {
            return true;
        }
        com.google.protobuf.d4 d4Var = this.f44911g;
        if (d4Var.m() == com.google.protobuf.c4.PROTO3) {
            return true;
        }
        return d4Var.f45004d.f().f45107m;
    }

    public java.lang.String toString() {
        return this.f44910f;
    }

    @Override // com.google.protobuf.a5
    public com.google.protobuf.vb u0() {
        return P().f45597d;
    }
}
