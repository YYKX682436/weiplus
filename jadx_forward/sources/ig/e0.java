package ig;

/* loaded from: classes16.dex */
public final class e0 extends com.p176xb6135e39.p283xc50a8b8b.q5 implements ig.g0 {

    /* renamed from: bitField0_ */
    private int f69995x961a12dc;

    /* renamed from: keys_ */
    private com.p176xb6135e39.p283xc50a8b8b.g7 f69996x61390eb;

    /* renamed from: values_ */
    private com.p176xb6135e39.p283xc50a8b8b.g7 f69997xdce077d;

    private e0() {
        super(null);
        com.p176xb6135e39.p283xc50a8b8b.g7 g7Var = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
        this.f69996x61390eb = g7Var;
        this.f69997xdce077d = g7Var;
        m135444x73fef578();
    }

    /* renamed from: ensureKeysIsMutable */
    private void m135441xbec80b6a() {
        if ((this.f69995x961a12dc & 1) == 0) {
            this.f69996x61390eb = new com.p176xb6135e39.p283xc50a8b8b.f7(this.f69996x61390eb);
            this.f69995x961a12dc |= 1;
        }
    }

    /* renamed from: ensureValuesIsMutable */
    private void m135442xb0db3f7c() {
        if ((this.f69995x961a12dc & 2) == 0) {
            this.f69997xdce077d = new com.p176xb6135e39.p283xc50a8b8b.f7(this.f69997xdce077d);
            this.f69995x961a12dc |= 2;
        }
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m135443xc1a58b65() {
        return ig.y0.f372831m;
    }

    /* renamed from: maybeForceBuilderInitialization */
    private void m135444x73fef578() {
        ig.f0.m135483x23f31491();
    }

    /* renamed from: addAllKeys */
    public ig.e0 m135445x3b5abb54(java.lang.Iterable<java.lang.String> iterable) {
        m135441xbec80b6a();
        com.p176xb6135e39.p283xc50a8b8b.e.m20622xab35b940((java.lang.Iterable) iterable, (java.util.List) this.f69996x61390eb);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: addAllValues */
    public ig.e0 m135446xe2205282(java.lang.Iterable<java.lang.String> iterable) {
        m135442xb0db3f7c();
        com.p176xb6135e39.p283xc50a8b8b.e.m20622xab35b940((java.lang.Iterable) iterable, (java.util.List) this.f69997xdce077d);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: addKeys */
    public ig.e0 m135447xbb85e235(java.lang.String str) {
        str.getClass();
        m135441xbec80b6a();
        this.f69996x61390eb.add(str);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: addKeysBytes */
    public ig.e0 m135448xb5230736(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        m135441xbec80b6a();
        this.f69996x61390eb.q(yVar);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: addValues */
    public ig.e0 m135449x41d4523(java.lang.String str) {
        str.getClass();
        m135442xb0db3f7c();
        this.f69997xdce077d.add(str);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: addValuesBytes */
    public ig.e0 m135450x3fa4908(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        m135442xb0db3f7c();
        this.f69997xdce077d.q(yVar);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearKeys */
    public ig.e0 m135455xb43b69e1() {
        this.f69996x61390eb = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
        this.f69995x961a12dc &= -2;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearValues */
    public ig.e0 m135458xa58f91cf() {
        this.f69997xdce077d = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
        this.f69995x961a12dc &= -3;
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return ig.y0.f372831m;
    }

    @Override // ig.g0
    /* renamed from: getKeys */
    public java.lang.String mo135464xfb81966a(int i17) {
        return (java.lang.String) this.f69996x61390eb.get(i17);
    }

    @Override // ig.g0
    /* renamed from: getKeysBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135465xbcc8ac21(int i17) {
        return this.f69996x61390eb.f(i17);
    }

    @Override // ig.g0
    /* renamed from: getKeysCount */
    public int mo135466xbcd23cc5() {
        return this.f69996x61390eb.size();
    }

    @Override // ig.g0
    /* renamed from: getValues */
    public java.lang.String mo135468x33fcc018(int i17) {
        return (java.lang.String) this.f69997xdce077d.get(i17);
    }

    @Override // ig.g0
    /* renamed from: getValuesBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135469xb8ca5f33(int i17) {
        return this.f69997xdce077d.f(i17);
    }

    @Override // ig.g0
    /* renamed from: getValuesCount */
    public int mo135470xb8d3efd7() {
        return this.f69997xdce077d.size();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = ig.y0.f372832n;
        j6Var.c(ig.f0.class, ig.e0.class);
        return j6Var;
    }

    /* renamed from: setKeys */
    public ig.e0 m135473x764c5d76(int i17, java.lang.String str) {
        str.getClass();
        m135441xbec80b6a();
        this.f69996x61390eb.set(i17, str);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setValues */
    public ig.e0 m135475x2731f424(int i17, java.lang.String str) {
        str.getClass();
        m135442xb0db3f7c();
        this.f69997xdce077d.set(i17, str);
        m20881x7bb163d5();
        return this;
    }

    @Override // ig.g0
    /* renamed from: getKeysList */
    public com.p176xb6135e39.p283xc50a8b8b.j9 mo135467x9ac07628() {
        return this.f69996x61390eb.b();
    }

    @Override // ig.g0
    /* renamed from: getValuesList */
    public com.p176xb6135e39.p283xc50a8b8b.j9 mo135471x691318d6() {
        return this.f69997xdce077d.b();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: addRepeatedField */
    public ig.e0 mo20555x8e2f927f(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        super.mo20555x8e2f927f(b4Var, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public ig.f0 mo20556x59bc66e() {
        ig.f0 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: buildPartial */
    public ig.f0 mo20557x85702333() {
        ig.f0 f0Var = new ig.f0(this);
        if ((this.f69995x961a12dc & 1) != 0) {
            this.f69996x61390eb = this.f69996x61390eb.b();
            this.f69995x961a12dc &= -2;
        }
        ig.f0.m135484x23f31c15(f0Var, this.f69996x61390eb);
        if ((this.f69995x961a12dc & 2) != 0) {
            this.f69997xdce077d = this.f69997xdce077d.b();
            this.f69995x961a12dc &= -3;
        }
        ig.f0.m135485x23f31fd6(f0Var, this.f69997xdce077d);
        m20880xaf619bdf();
        return f0Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clearField, reason: merged with bridge method [inline-methods] */
    public ig.e0 m135530xd2ece2ad(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        super.m135530xd2ece2ad(b4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public ig.f0 mo20559x786693c3() {
        return ig.f0.m135486x7c90cfc0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setField */
    public ig.e0 mo20563x52fa61b8(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        super.mo20563x52fa61b8(b4Var, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
    public ig.e0 m135574xe229305e(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, int i17, java.lang.Object obj) {
        super.m135574xe229305e(b4Var, i17, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setUnknownFields */
    public final ig.e0 mo20564x9f425a61(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        super.mo20564x9f425a61(waVar);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.e0 m135534xd36dfc70(com.p176xb6135e39.p283xc50a8b8b.g4 g4Var) {
        super.m135534xd36dfc70(g4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.a
    /* renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
    public final ig.e0 m135565xba8a5e4b(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        return (ig.e0) super.m135565xba8a5e4b(waVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.e0 m135526x5a5b64d() {
        super.m135526x5a5b64d();
        com.p176xb6135e39.p283xc50a8b8b.g7 g7Var = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
        this.f69996x61390eb = g7Var;
        int i17 = this.f69995x961a12dc & (-2);
        this.f69997xdce077d = g7Var;
        this.f69995x961a12dc = i17 & (-3);
        return this;
    }

    private e0(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        super(r5Var);
        com.p176xb6135e39.p283xc50a8b8b.g7 g7Var = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
        this.f69996x61390eb = g7Var;
        this.f69997xdce077d = g7Var;
        m135444x73fef578();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.e0 m135463x5a5dd5d() {
        return (ig.e0) super.m135541x5a5dd5d();
    }
}
