package ig;

/* loaded from: classes16.dex */
public final class h extends com.p176xb6135e39.p283xc50a8b8b.q5 implements ig.j {

    /* renamed from: bitField0_ */
    private int f70005x961a12dc;

    /* renamed from: errorCode_ */
    private java.lang.Object f70006x5ff952ea;

    /* renamed from: errorMessage_ */
    private java.lang.Object f70007xaf45af60;

    /* renamed from: expands_ */
    private com.p176xb6135e39.p283xc50a8b8b.g7 f70008x8c6bae66;

    /* renamed from: keys_ */
    private com.p176xb6135e39.p283xc50a8b8b.g7 f70009x61390eb;

    /* renamed from: name_ */
    private java.lang.Object f70010x63bd734;

    /* renamed from: timeStamp_ */
    private long f70011x2f40e629;

    /* renamed from: values_ */
    private com.p176xb6135e39.p283xc50a8b8b.g7 f70012xdce077d;

    private h() {
        super(null);
        this.f70010x63bd734 = "";
        this.f70006x5ff952ea = "";
        this.f70007xaf45af60 = "";
        com.p176xb6135e39.p283xc50a8b8b.g7 g7Var = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
        this.f70009x61390eb = g7Var;
        this.f70012xdce077d = g7Var;
        this.f70008x8c6bae66 = g7Var;
        m135514x73fef578();
    }

    /* renamed from: ensureExpandsIsMutable */
    private void m135510xdeac39e1() {
        if ((this.f70005x961a12dc & 32) == 0) {
            this.f70008x8c6bae66 = new com.p176xb6135e39.p283xc50a8b8b.f7(this.f70008x8c6bae66);
            this.f70005x961a12dc |= 32;
        }
    }

    /* renamed from: ensureKeysIsMutable */
    private void m135511xbec80b6a() {
        if ((this.f70005x961a12dc & 8) == 0) {
            this.f70009x61390eb = new com.p176xb6135e39.p283xc50a8b8b.f7(this.f70009x61390eb);
            this.f70005x961a12dc |= 8;
        }
    }

    /* renamed from: ensureValuesIsMutable */
    private void m135512xb0db3f7c() {
        if ((this.f70005x961a12dc & 16) == 0) {
            this.f70012xdce077d = new com.p176xb6135e39.p283xc50a8b8b.f7(this.f70012xdce077d);
            this.f70005x961a12dc |= 16;
        }
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m135513xc1a58b65() {
        return ig.y0.f372819a;
    }

    /* renamed from: maybeForceBuilderInitialization */
    private void m135514x73fef578() {
        ig.i.m135582xbbd789f4();
    }

    /* renamed from: addAllExpands */
    public ig.h m135515x60eebb9(java.lang.Iterable<java.lang.String> iterable) {
        m135510xdeac39e1();
        com.p176xb6135e39.p283xc50a8b8b.e.m20622xab35b940((java.lang.Iterable) iterable, (java.util.List) this.f70008x8c6bae66);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: addAllKeys */
    public ig.h m135516x3b5abb54(java.lang.Iterable<java.lang.String> iterable) {
        m135511xbec80b6a();
        com.p176xb6135e39.p283xc50a8b8b.e.m20622xab35b940((java.lang.Iterable) iterable, (java.util.List) this.f70009x61390eb);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: addAllValues */
    public ig.h m135517xe2205282(java.lang.Iterable<java.lang.String> iterable) {
        m135512xb0db3f7c();
        com.p176xb6135e39.p283xc50a8b8b.e.m20622xab35b940((java.lang.Iterable) iterable, (java.util.List) this.f70012xdce077d);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: addExpands */
    public ig.h m135518x23b04d38(java.lang.String str) {
        str.getClass();
        m135510xdeac39e1();
        this.f70008x8c6bae66.add(str);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: addExpandsBytes */
    public ig.h m135519x72e20613(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        m135510xdeac39e1();
        this.f70008x8c6bae66.q(yVar);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: addKeys */
    public ig.h m135520xbb85e235(java.lang.String str) {
        str.getClass();
        m135511xbec80b6a();
        this.f70009x61390eb.add(str);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: addKeysBytes */
    public ig.h m135521xb5230736(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        m135511xbec80b6a();
        this.f70009x61390eb.q(yVar);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: addValues */
    public ig.h m135522x41d4523(java.lang.String str) {
        str.getClass();
        m135512xb0db3f7c();
        this.f70012xdce077d.add(str);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: addValuesBytes */
    public ig.h m135523x3fa4908(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        m135512xb0db3f7c();
        this.f70012xdce077d.q(yVar);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearErrorCode */
    public ig.h m135527xbf8ce048() {
        this.f70005x961a12dc &= -3;
        this.f70006x5ff952ea = ig.i.m135587x7c90cfc0().mo135542x130a215f();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearErrorMessage */
    public ig.h m135528xebb0ebcc() {
        this.f70005x961a12dc &= -5;
        this.f70007xaf45af60 = ig.i.m135587x7c90cfc0().mo135544xa8aa7f55();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearExpands */
    public ig.h m135529xb087960c() {
        this.f70008x8c6bae66 = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
        this.f70005x961a12dc &= -33;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearKeys */
    public ig.h m135531xb43b69e1() {
        this.f70009x61390eb = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
        this.f70005x961a12dc &= -9;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearName */
    public ig.h m135532xb43cb678() {
        this.f70005x961a12dc &= -2;
        this.f70010x63bd734 = ig.i.m135587x7c90cfc0().mo135554xfb82e301();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearTimeStamp */
    public ig.h m135535xad766929() {
        this.f70005x961a12dc &= -65;
        this.f70011x2f40e629 = 0L;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearValues */
    public ig.h m135536xa58f91cf() {
        this.f70012xdce077d = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
        this.f70005x961a12dc &= -17;
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return ig.y0.f372819a;
    }

    @Override // ig.j
    /* renamed from: getErrorCode */
    public java.lang.String mo135542x130a215f() {
        java.lang.Object obj = this.f70006x5ff952ea;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70006x5ff952ea = r17;
        }
        return r17;
    }

    @Override // ig.j
    /* renamed from: getErrorCodeBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135543x3919b24c() {
        java.lang.Object obj = this.f70006x5ff952ea;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70006x5ff952ea = h17;
        return h17;
    }

    @Override // ig.j
    /* renamed from: getErrorMessage */
    public java.lang.String mo135544xa8aa7f55() {
        java.lang.Object obj = this.f70007xaf45af60;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70007xaf45af60 = r17;
        }
        return r17;
    }

    @Override // ig.j
    /* renamed from: getErrorMessageBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135545x7df39e16() {
        java.lang.Object obj = this.f70007xaf45af60;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70007xaf45af60 = h17;
        return h17;
    }

    @Override // ig.j
    /* renamed from: getExpands */
    public java.lang.String mo135546xefc030e3(int i17) {
        return (java.lang.String) this.f70008x8c6bae66.get(i17);
    }

    @Override // ig.j
    /* renamed from: getExpandsBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135547x5814b548(int i17) {
        return this.f70008x8c6bae66.f(i17);
    }

    @Override // ig.j
    /* renamed from: getExpandsCount */
    public int mo135548x581e45ec() {
        return this.f70008x8c6bae66.size();
    }

    @Override // ig.j
    /* renamed from: getKeys */
    public java.lang.String mo135550xfb81966a(int i17) {
        return (java.lang.String) this.f70009x61390eb.get(i17);
    }

    @Override // ig.j
    /* renamed from: getKeysBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135551xbcc8ac21(int i17) {
        return this.f70009x61390eb.f(i17);
    }

    @Override // ig.j
    /* renamed from: getKeysCount */
    public int mo135552xbcd23cc5() {
        return this.f70009x61390eb.size();
    }

    @Override // ig.j
    /* renamed from: getName */
    public java.lang.String mo135554xfb82e301() {
        java.lang.Object obj = this.f70010x63bd734;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70010x63bd734 = r17;
        }
        return r17;
    }

    @Override // ig.j
    /* renamed from: getNameBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135555x4762a5ea() {
        java.lang.Object obj = this.f70010x63bd734;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70010x63bd734 = h17;
        return h17;
    }

    @Override // ig.j
    /* renamed from: getTimeStamp */
    public long mo135556xf3aa40() {
        return this.f70011x2f40e629;
    }

    @Override // ig.j
    /* renamed from: getValues */
    public java.lang.String mo135557x33fcc018(int i17) {
        return (java.lang.String) this.f70012xdce077d.get(i17);
    }

    @Override // ig.j
    /* renamed from: getValuesBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135558xb8ca5f33(int i17) {
        return this.f70012xdce077d.f(i17);
    }

    @Override // ig.j
    /* renamed from: getValuesCount */
    public int mo135559xb8d3efd7() {
        return this.f70012xdce077d.size();
    }

    @Override // ig.j
    /* renamed from: hasErrorCode */
    public boolean mo135561xd2df8a9b() {
        return (this.f70005x961a12dc & 2) != 0;
    }

    @Override // ig.j
    /* renamed from: hasErrorMessage */
    public boolean mo135562x8c8bbc99() {
        return (this.f70005x961a12dc & 4) != 0;
    }

    @Override // ig.j
    /* renamed from: hasName */
    public boolean mo135563x2987a445() {
        return (this.f70005x961a12dc & 1) != 0;
    }

    @Override // ig.j
    /* renamed from: hasTimeStamp */
    public boolean mo135564xc0c9137c() {
        return (this.f70005x961a12dc & 64) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = ig.y0.f372820b;
        j6Var.c(ig.i.class, ig.h.class);
        return j6Var;
    }

    /* renamed from: setErrorCode */
    public ig.h m135566x6f5de1d3(java.lang.String str) {
        str.getClass();
        this.f70005x961a12dc |= 2;
        this.f70006x5ff952ea = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setErrorCodeBytes */
    public ig.h m135567x1101a58(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70005x961a12dc |= 2;
        this.f70006x5ff952ea = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setErrorMessage */
    public ig.h m135568xdef37a61(java.lang.String str) {
        str.getClass();
        this.f70005x961a12dc |= 4;
        this.f70007xaf45af60 = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setErrorMessageBytes */
    public ig.h m135569x5989aa8a(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70005x961a12dc |= 4;
        this.f70007xaf45af60 = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setExpands */
    public ig.h m135570x63317e57(int i17, java.lang.String str) {
        str.getClass();
        m135510xdeac39e1();
        this.f70008x8c6bae66.set(i17, str);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setKeys */
    public ig.h m135571x764c5d76(int i17, java.lang.String str) {
        str.getClass();
        m135511xbec80b6a();
        this.f70009x61390eb.set(i17, str);
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setName */
    public ig.h m135572x764daa0d(java.lang.String str) {
        str.getClass();
        this.f70005x961a12dc |= 1;
        this.f70010x63bd734 = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setNameBytes */
    public ig.h m135573xa3b6665e(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70005x961a12dc |= 1;
        this.f70010x63bd734 = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setTimeStamp */
    public ig.h m135575x5d476ab4(long j17) {
        this.f70005x961a12dc |= 64;
        this.f70011x2f40e629 = j17;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setValues */
    public ig.h m135576x2731f424(int i17, java.lang.String str) {
        str.getClass();
        m135512xb0db3f7c();
        this.f70012xdce077d.set(i17, str);
        m20881x7bb163d5();
        return this;
    }

    @Override // ig.j
    /* renamed from: getExpandsList */
    public com.p176xb6135e39.p283xc50a8b8b.j9 mo135549xc0cb2c21() {
        return this.f70008x8c6bae66.b();
    }

    @Override // ig.j
    /* renamed from: getKeysList */
    public com.p176xb6135e39.p283xc50a8b8b.j9 mo135553x9ac07628() {
        return this.f70009x61390eb.b();
    }

    @Override // ig.j
    /* renamed from: getValuesList */
    public com.p176xb6135e39.p283xc50a8b8b.j9 mo135560x691318d6() {
        return this.f70012xdce077d.b();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: addRepeatedField */
    public ig.h mo20555x8e2f927f(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        super.mo20555x8e2f927f(b4Var, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public ig.i mo20556x59bc66e() {
        ig.i mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: buildPartial */
    public ig.i mo20557x85702333() {
        ig.i iVar = new ig.i(this);
        int i17 = this.f70005x961a12dc;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        ig.i.m135583xbbd79178(iVar, this.f70010x63bd734);
        if ((i17 & 2) != 0) {
            i18 |= 2;
        }
        ig.i.m135584xbbd79539(iVar, this.f70006x5ff952ea);
        if ((i17 & 4) != 0) {
            i18 |= 4;
        }
        ig.i.m135585xbbd798fa(iVar, this.f70007xaf45af60);
        if ((this.f70005x961a12dc & 8) != 0) {
            this.f70009x61390eb = this.f70009x61390eb.b();
            this.f70005x961a12dc &= -9;
        }
        ig.i.m135586xbbd79cbb(iVar, this.f70009x61390eb);
        if ((this.f70005x961a12dc & 16) != 0) {
            this.f70012xdce077d = this.f70012xdce077d.b();
            this.f70005x961a12dc &= -17;
        }
        ig.i.m135578xbf1857a1(iVar, this.f70012xdce077d);
        if ((this.f70005x961a12dc & 32) != 0) {
            this.f70008x8c6bae66 = this.f70008x8c6bae66.b();
            this.f70005x961a12dc &= -33;
        }
        ig.i.m135579xbf185b62(iVar, this.f70008x8c6bae66);
        if ((i17 & 64) != 0) {
            ig.i.m135580xbf185f23(iVar, this.f70011x2f40e629);
            i18 |= 8;
        }
        ig.i.m135581xbf1862e4(iVar, i18);
        m20880xaf619bdf();
        return iVar;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clearField, reason: merged with bridge method [inline-methods] */
    public ig.h m135454xd2ece2ad(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        super.m135454xd2ece2ad(b4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public ig.i mo20559x786693c3() {
        return ig.i.m135587x7c90cfc0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setField */
    public ig.h mo20563x52fa61b8(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        super.mo20563x52fa61b8(b4Var, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
    public ig.h m135474xe229305e(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, int i17, java.lang.Object obj) {
        super.m135474xe229305e(b4Var, i17, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setUnknownFields */
    public final ig.h mo20564x9f425a61(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        super.mo20564x9f425a61(waVar);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.h m135457xd36dfc70(com.p176xb6135e39.p283xc50a8b8b.g4 g4Var) {
        super.m135457xd36dfc70(g4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.a
    /* renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
    public final ig.h m135472xba8a5e4b(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        return (ig.h) super.m135472xba8a5e4b(waVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.h m135453x5a5b64d() {
        super.m135453x5a5b64d();
        this.f70010x63bd734 = "";
        int i17 = this.f70005x961a12dc & (-2);
        this.f70006x5ff952ea = "";
        this.f70007xaf45af60 = "";
        int i18 = i17 & (-3) & (-5);
        this.f70005x961a12dc = i18;
        com.p176xb6135e39.p283xc50a8b8b.g7 g7Var = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
        this.f70009x61390eb = g7Var;
        this.f70012xdce077d = g7Var;
        this.f70008x8c6bae66 = g7Var;
        this.f70011x2f40e629 = 0L;
        this.f70005x961a12dc = i18 & (-9) & (-17) & (-33) & (-65);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.h m135541x5a5dd5d() {
        return (ig.h) super.m135463x5a5dd5d();
    }

    private h(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        super(r5Var);
        this.f70010x63bd734 = "";
        this.f70006x5ff952ea = "";
        this.f70007xaf45af60 = "";
        com.p176xb6135e39.p283xc50a8b8b.g7 g7Var = com.p176xb6135e39.p283xc50a8b8b.f7.f126619f;
        this.f70009x61390eb = g7Var;
        this.f70012xdce077d = g7Var;
        this.f70008x8c6bae66 = g7Var;
        m135514x73fef578();
    }
}
