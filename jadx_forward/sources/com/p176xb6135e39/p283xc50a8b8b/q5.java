package com.p176xb6135e39.p283xc50a8b8b;

/* loaded from: classes16.dex */
public abstract class q5 extends com.p176xb6135e39.p283xc50a8b8b.a {

    /* renamed from: builderParent */
    private com.p176xb6135e39.p283xc50a8b8b.r5 f7878xf64a8425;

    /* renamed from: isClean */
    private boolean f7879x7a8e633f;

    /* renamed from: meAsParent */
    private com.p176xb6135e39.p283xc50a8b8b.p5 f7880x33eded34;

    /* renamed from: unknownFields */
    private com.p176xb6135e39.p283xc50a8b8b.wa f7881x4f0c37a3 = com.p176xb6135e39.p283xc50a8b8b.wa.f127184e;

    public q5(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        this.f7878xf64a8425 = r5Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: addRepeatedField */
    public com.p176xb6135e39.p283xc50a8b8b.q5 mo20555x8e2f927f(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        com.p176xb6135e39.p283xc50a8b8b.j6.b(mo20561xa6ad8e26(), b4Var).d(this, obj);
        return this;
    }

    public final java.util.Map b() {
        java.util.TreeMap treeMap = new java.util.TreeMap();
        java.util.List n17 = mo20561xa6ad8e26().f126773a.n();
        int i17 = 0;
        while (i17 < n17.size()) {
            com.p176xb6135e39.p283xc50a8b8b.b4 b4Var = (com.p176xb6135e39.p283xc50a8b8b.b4) n17.get(i17);
            com.p176xb6135e39.p283xc50a8b8b.g4 g4Var = b4Var.f126450p;
            if (g4Var != null) {
                i17 += g4Var.f126665i - 1;
                if (m20876x780c843(g4Var)) {
                    b4Var = m20871xe5a82802(g4Var);
                    treeMap.put(b4Var, mo20728x746c4744(b4Var));
                    i17++;
                } else {
                    i17++;
                }
            } else {
                if (b4Var.d1()) {
                    java.util.List list = (java.util.List) mo20728x746c4744(b4Var);
                    if (!list.isEmpty()) {
                        treeMap.put(b4Var, list);
                    }
                } else {
                    if (!mo20729x6ffae80(b4Var)) {
                    }
                    treeMap.put(b4Var, mo20728x746c4744(b4Var));
                }
                i17++;
            }
        }
        return treeMap;
    }

    /* renamed from: clear */
    public com.p176xb6135e39.p283xc50a8b8b.q5 mo20866x5a5b64d() {
        this.f7881x4f0c37a3 = com.p176xb6135e39.p283xc50a8b8b.wa.f127184e;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearField */
    public com.p176xb6135e39.p283xc50a8b8b.q5 mo20867xd2ece2ad(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        com.p176xb6135e39.p283xc50a8b8b.j6.b(mo20561xa6ad8e26(), b4Var).k(this);
        return this;
    }

    /* renamed from: clearOneof */
    public com.p176xb6135e39.p283xc50a8b8b.q5 mo20868xd36dfc70(com.p176xb6135e39.p283xc50a8b8b.g4 g4Var) {
        com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(com.p176xb6135e39.p283xc50a8b8b.j6.a(mo20561xa6ad8e26(), g4Var).f127215d, this, new java.lang.Object[0]);
        return this;
    }

    /* renamed from: clone */
    public com.p176xb6135e39.p283xc50a8b8b.q5 mo20869x5a5dd5d() {
        com.p176xb6135e39.p283xc50a8b8b.q5 q5Var = (com.p176xb6135e39.p283xc50a8b8b.q5) mo20559x786693c3().mo20596xab31548();
        q5Var.mo20527x60f45402(mo20557x85702333());
        return q5Var;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.p176xb6135e39.p283xc50a8b8b.a
    /* renamed from: dispose */
    public void mo20518x63a5261f() {
        this.f7878xf64a8425 = null;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getAllFields */
    public java.util.Map<com.p176xb6135e39.p283xc50a8b8b.b4, java.lang.Object> mo20727xcee5d904() {
        return java.util.Collections.unmodifiableMap(b());
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getField */
    public java.lang.Object mo20728x746c4744(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        java.lang.Object n17 = com.p176xb6135e39.p283xc50a8b8b.j6.b(mo20561xa6ad8e26(), b4Var).n(this);
        return b4Var.d1() ? java.util.Collections.unmodifiableList((java.util.List) n17) : n17;
    }

    /* renamed from: getFieldBuilder */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20870x76524bb7(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        return com.p176xb6135e39.p283xc50a8b8b.j6.b(mo20561xa6ad8e26(), b4Var).l(this);
    }

    /* renamed from: getOneofFieldDescriptor */
    public com.p176xb6135e39.p283xc50a8b8b.b4 m20871xe5a82802(com.p176xb6135e39.p283xc50a8b8b.g4 g4Var) {
        com.p176xb6135e39.p283xc50a8b8b.x5 a17 = com.p176xb6135e39.p283xc50a8b8b.j6.a(mo20561xa6ad8e26(), g4Var);
        com.p176xb6135e39.p283xc50a8b8b.b4 b4Var = a17.f127216e;
        if (b4Var != null) {
            if (!mo20729x6ffae80(b4Var)) {
                b4Var = null;
            }
            return b4Var;
        }
        int mo20656x276ffe3f = ((com.p176xb6135e39.p283xc50a8b8b.p6) com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(a17.f127214c, this, new java.lang.Object[0])).mo20656x276ffe3f();
        if (mo20656x276ffe3f > 0) {
            return a17.f127212a.m(mo20656x276ffe3f);
        }
        return null;
    }

    /* renamed from: getParentForChildren */
    public com.p176xb6135e39.p283xc50a8b8b.r5 m20872x3e6b6e28() {
        if (this.f7880x33eded34 == null) {
            this.f7880x33eded34 = new com.p176xb6135e39.p283xc50a8b8b.p5(this, null);
        }
        return this.f7880x33eded34;
    }

    /* renamed from: getRepeatedField */
    public java.lang.Object mo20873x4f52c9ea(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, int i17) {
        return com.p176xb6135e39.p283xc50a8b8b.j6.b(mo20561xa6ad8e26(), b4Var).g(this, i17);
    }

    /* renamed from: getRepeatedFieldBuilder */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20874x6178a251(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, int i17) {
        return com.p176xb6135e39.p283xc50a8b8b.j6.b(mo20561xa6ad8e26(), b4Var).i(this, i17);
    }

    /* renamed from: getRepeatedFieldCount */
    public int mo20875x5353945(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        return com.p176xb6135e39.p283xc50a8b8b.j6.b(mo20561xa6ad8e26(), b4Var).j(this);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7881x4f0c37a3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: hasField */
    public boolean mo20729x6ffae80(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        return com.p176xb6135e39.p283xc50a8b8b.j6.b(mo20561xa6ad8e26(), b4Var).h(this);
    }

    /* renamed from: hasOneof */
    public boolean m20876x780c843(com.p176xb6135e39.p283xc50a8b8b.g4 g4Var) {
        com.p176xb6135e39.p283xc50a8b8b.x5 a17 = com.p176xb6135e39.p283xc50a8b8b.j6.a(mo20561xa6ad8e26(), g4Var);
        com.p176xb6135e39.p283xc50a8b8b.b4 b4Var = a17.f127216e;
        if (b4Var != null) {
            return mo20729x6ffae80(b4Var);
        }
        return ((com.p176xb6135e39.p283xc50a8b8b.p6) com.p176xb6135e39.p283xc50a8b8b.l6.m20739xbf185b60(a17.f127214c, this, new java.lang.Object[0])).mo20656x276ffe3f() != 0;
    }

    /* renamed from: internalGetFieldAccessorTable */
    public abstract com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26();

    /* renamed from: internalGetMapField */
    public com.p176xb6135e39.p283xc50a8b8b.d8 mo20877xf53a7b77(int i17) {
        java.lang.String name = getClass().getName();
        throw new java.lang.RuntimeException(name.length() != 0 ? "No map fields found in ".concat(name) : new java.lang.String("No map fields found in "));
    }

    /* renamed from: internalGetMutableMapField */
    public com.p176xb6135e39.p283xc50a8b8b.d8 mo20878x45eb59ab(int i17) {
        java.lang.String name = getClass().getName();
        throw new java.lang.RuntimeException(name.length() != 0 ? "No map fields found in ".concat(name) : new java.lang.String("No map fields found in "));
    }

    /* renamed from: isClean */
    public boolean m20879x7a8e633f() {
        return this.f7879x7a8e633f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public boolean mo20562xf582434a() {
        for (com.p176xb6135e39.p283xc50a8b8b.b4 b4Var : mo20560x84bb647e().n()) {
            if (b4Var.s() && !mo20729x6ffae80(b4Var)) {
                return false;
            }
            if (b4Var.f126447m.f126392d == com.p176xb6135e39.p283xc50a8b8b.z3.MESSAGE) {
                if (b4Var.d1()) {
                    java.util.Iterator it = ((java.util.List) mo20728x746c4744(b4Var)).iterator();
                    while (it.hasNext()) {
                        if (!((com.p176xb6135e39.p283xc50a8b8b.k8) it.next()).mo20562xf582434a()) {
                            return false;
                        }
                    }
                } else if (mo20729x6ffae80(b4Var) && !((com.p176xb6135e39.p283xc50a8b8b.k8) mo20728x746c4744(b4Var)).mo20562xf582434a()) {
                    return false;
                }
            }
        }
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a
    /* renamed from: markClean */
    public void mo20522xc674f77c() {
        this.f7879x7a8e633f = true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.a
    /* renamed from: mergeUnknownFields */
    public com.p176xb6135e39.p283xc50a8b8b.q5 mo20547xba8a5e4b(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        com.p176xb6135e39.p283xc50a8b8b.wa waVar2 = this.f7881x4f0c37a3;
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        b17.f(waVar2);
        b17.f(waVar);
        return mo20564x9f425a61(b17.mo20556x59bc66e());
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: newBuilderForField */
    public com.p176xb6135e39.p283xc50a8b8b.j8 mo20722x4ae2dcac(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        return com.p176xb6135e39.p283xc50a8b8b.j6.b(mo20561xa6ad8e26(), b4Var).mo20575x3136c9db();
    }

    /* renamed from: onBuilt */
    public void m20880xaf619bdf() {
        if (this.f7878xf64a8425 != null) {
            mo20522xc674f77c();
        }
    }

    /* renamed from: onChanged */
    public final void m20881x7bb163d5() {
        com.p176xb6135e39.p283xc50a8b8b.r5 r5Var;
        if (!this.f7879x7a8e633f || (r5Var = this.f7878xf64a8425) == null) {
            return;
        }
        r5Var.a();
        this.f7879x7a8e633f = false;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setField */
    public com.p176xb6135e39.p283xc50a8b8b.q5 mo20563x52fa61b8(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        com.p176xb6135e39.p283xc50a8b8b.j6.b(mo20561xa6ad8e26(), b4Var).c(this, obj);
        return this;
    }

    /* renamed from: setRepeatedField */
    public com.p176xb6135e39.p283xc50a8b8b.q5 mo20882xe229305e(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, int i17, java.lang.Object obj) {
        com.p176xb6135e39.p283xc50a8b8b.j6.b(mo20561xa6ad8e26(), b4Var).f(this, i17, obj);
        return this;
    }

    /* renamed from: setUnknownFields */
    public com.p176xb6135e39.p283xc50a8b8b.q5 mo20564x9f425a61(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        this.f7881x4f0c37a3 = waVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setUnknownFieldsProto3 */
    public com.p176xb6135e39.p283xc50a8b8b.q5 m20883x30d1ad0c(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        this.f7881x4f0c37a3 = waVar;
        m20881x7bb163d5();
        return this;
    }
}
