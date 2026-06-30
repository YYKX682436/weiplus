package com.google.protobuf;

/* loaded from: classes16.dex */
public class g6 implements com.google.protobuf.v5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Class f45135a;

    /* renamed from: b, reason: collision with root package name */
    public final com.google.protobuf.b4 f45136b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f45137c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f45138d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.protobuf.e6 f45139e;

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (r12.f44917p == null) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public g6(com.google.protobuf.b4 r12, java.lang.String r13, java.lang.Class r14, java.lang.Class r15, java.lang.String r16) {
        /*
            r11 = this;
            r0 = r11
            r9 = r12
            r11.<init>()
            com.google.protobuf.g4 r1 = r9.f44917p
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L1d
            com.google.protobuf.b4[] r1 = r1.f45133m
            int r4 = r1.length
            if (r4 != r2) goto L18
            r1 = r1[r3]
            boolean r1 = r1.f44913i
            if (r1 == 0) goto L18
            r1 = r2
            goto L19
        L18:
            r1 = r3
        L19:
            if (r1 != 0) goto L1d
            r7 = r2
            goto L1e
        L1d:
            r7 = r3
        L1e:
            r0.f45137c = r7
            com.google.protobuf.d4 r1 = r9.f44911g
            com.google.protobuf.c4 r4 = r1.m()
            com.google.protobuf.c4 r5 = com.google.protobuf.c4.PROTO2
            if (r4 == r5) goto L60
            boolean r4 = r9.f44913i
            if (r4 != 0) goto L50
            com.google.protobuf.c4 r1 = r1.m()
            if (r1 != r5) goto L4e
            com.google.protobuf.u1 r1 = r9.f44909e
            int r1 = r1.f45564g
            com.google.protobuf.s1 r1 = com.google.protobuf.s1.a(r1)
            if (r1 != 0) goto L40
            com.google.protobuf.s1 r1 = com.google.protobuf.s1.LABEL_OPTIONAL
        L40:
            com.google.protobuf.s1 r4 = com.google.protobuf.s1.LABEL_OPTIONAL
            if (r1 != r4) goto L46
            r1 = r2
            goto L47
        L46:
            r1 = r3
        L47:
            if (r1 == 0) goto L4e
            com.google.protobuf.g4 r1 = r9.f44917p
            if (r1 != 0) goto L4e
            goto L50
        L4e:
            r1 = r3
            goto L51
        L50:
            r1 = r2
        L51:
            if (r1 != 0) goto L60
            if (r7 != 0) goto L5e
            com.google.protobuf.a4 r1 = r9.f44914m
            com.google.protobuf.z3 r1 = r1.f44859d
            com.google.protobuf.z3 r4 = com.google.protobuf.z3.MESSAGE
            if (r1 != r4) goto L5e
            goto L60
        L5e:
            r8 = r3
            goto L61
        L60:
            r8 = r2
        L61:
            r0.f45138d = r8
            com.google.protobuf.f6 r10 = new com.google.protobuf.f6
            r1 = r10
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            r0.f45136b = r9
            java.lang.reflect.Method r1 = r10.f45078a
            java.lang.Class r1 = r1.getReturnType()
            r0.f45135a = r1
            r0.f45139e = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.protobuf.g6.<init>(com.google.protobuf.b4, java.lang.String, java.lang.Class, java.lang.Class, java.lang.String):void");
    }

    @Override // com.google.protobuf.v5
    public java.lang.Object a(com.google.protobuf.l6 l6Var) {
        return m(l6Var);
    }

    @Override // com.google.protobuf.v5
    public int b(com.google.protobuf.l6 l6Var) {
        throw new java.lang.UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
    }

    @Override // com.google.protobuf.v5
    public void c(com.google.protobuf.q5 q5Var, java.lang.Object obj) {
        com.google.protobuf.l6.access$1100(((com.google.protobuf.f6) this.f45139e).f45080c, q5Var, new java.lang.Object[]{obj});
    }

    @Override // com.google.protobuf.v5
    public void d(com.google.protobuf.q5 q5Var, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("addRepeatedField() called on a singular field.");
    }

    @Override // com.google.protobuf.v5
    public boolean e(com.google.protobuf.l6 l6Var) {
        boolean z17 = this.f45138d;
        com.google.protobuf.e6 e6Var = this.f45139e;
        if (z17) {
            return ((java.lang.Boolean) com.google.protobuf.l6.access$1100(((com.google.protobuf.f6) e6Var).f45081d, l6Var, new java.lang.Object[0])).booleanValue();
        }
        boolean z18 = this.f45137c;
        com.google.protobuf.b4 b4Var = this.f45136b;
        if (z18) {
            return ((com.google.protobuf.p6) com.google.protobuf.l6.access$1100(((com.google.protobuf.f6) e6Var).f45084g, l6Var, new java.lang.Object[0])).getNumber() == b4Var.f44909e.f45563f;
        }
        return !m(l6Var).equals(b4Var.l());
    }

    @Override // com.google.protobuf.v5
    public void f(com.google.protobuf.q5 q5Var, int i17, java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("setRepeatedField() called on a singular field.");
    }

    @Override // com.google.protobuf.v5
    public java.lang.Object g(com.google.protobuf.q5 q5Var, int i17) {
        throw new java.lang.UnsupportedOperationException("getRepeatedField() called on a singular field.");
    }

    @Override // com.google.protobuf.v5
    public boolean h(com.google.protobuf.q5 q5Var) {
        boolean z17 = this.f45138d;
        com.google.protobuf.e6 e6Var = this.f45139e;
        if (z17) {
            return ((java.lang.Boolean) com.google.protobuf.l6.access$1100(((com.google.protobuf.f6) e6Var).f45082e, q5Var, new java.lang.Object[0])).booleanValue();
        }
        boolean z18 = this.f45137c;
        com.google.protobuf.b4 b4Var = this.f45136b;
        if (z18) {
            return ((com.google.protobuf.p6) com.google.protobuf.l6.access$1100(((com.google.protobuf.f6) e6Var).f45085h, q5Var, new java.lang.Object[0])).getNumber() == b4Var.f44909e.f45563f;
        }
        return !n(q5Var).equals(b4Var.l());
    }

    @Override // com.google.protobuf.v5
    public com.google.protobuf.j8 i(com.google.protobuf.q5 q5Var, int i17) {
        throw new java.lang.UnsupportedOperationException("getRepeatedFieldBuilder() called on a non-Message type.");
    }

    @Override // com.google.protobuf.v5
    public int j(com.google.protobuf.q5 q5Var) {
        throw new java.lang.UnsupportedOperationException("getRepeatedFieldSize() called on a singular field.");
    }

    @Override // com.google.protobuf.v5
    public void k(com.google.protobuf.q5 q5Var) {
        com.google.protobuf.l6.access$1100(((com.google.protobuf.f6) this.f45139e).f45083f, q5Var, new java.lang.Object[0]);
    }

    @Override // com.google.protobuf.v5
    public com.google.protobuf.j8 l(com.google.protobuf.q5 q5Var) {
        throw new java.lang.UnsupportedOperationException("getFieldBuilder() called on a non-Message type.");
    }

    @Override // com.google.protobuf.v5
    public java.lang.Object m(com.google.protobuf.l6 l6Var) {
        return com.google.protobuf.l6.access$1100(((com.google.protobuf.f6) this.f45139e).f45078a, l6Var, new java.lang.Object[0]);
    }

    @Override // com.google.protobuf.v5
    public java.lang.Object n(com.google.protobuf.q5 q5Var) {
        return com.google.protobuf.l6.access$1100(((com.google.protobuf.f6) this.f45139e).f45079b, q5Var, new java.lang.Object[0]);
    }

    @Override // com.google.protobuf.v5
    public com.google.protobuf.j8 newBuilder() {
        throw new java.lang.UnsupportedOperationException("newBuilderForField() called on a non-Message type.");
    }

    @Override // com.google.protobuf.v5
    public java.lang.Object o(com.google.protobuf.l6 l6Var, int i17) {
        throw new java.lang.UnsupportedOperationException("getRepeatedField() called on a singular field.");
    }
}
