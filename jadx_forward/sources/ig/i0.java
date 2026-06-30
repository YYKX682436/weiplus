package ig;

/* loaded from: classes16.dex */
public final class i0 extends com.p176xb6135e39.p283xc50a8b8b.q5 implements ig.k0 {

    /* renamed from: bitField0_ */
    private int f70031x961a12dc;

    /* renamed from: detailsBuilder_ */
    private com.p176xb6135e39.p283xc50a8b8b.t9 f70032x9dfff886;

    /* renamed from: details_ */
    private ig.f0 f70033x3e45565d;

    /* renamed from: enterScene_ */
    private int f70034x26d6a4b;

    /* renamed from: entryType_ */
    private java.lang.Object f70035x8a42d713;

    /* renamed from: eventName_ */
    private java.lang.Object f70036x39b404ba;

    /* renamed from: maasVersion_ */
    private java.lang.Object f70037x6965c16d;

    /* renamed from: metricsType_ */
    private int f70038x9618a962;

    /* renamed from: postId_ */
    private java.lang.Object f70039xe8ae41e4;

    /* renamed from: sessionId_ */
    private java.lang.Object f70040x630d8c2e;

    private i0() {
        super(null);
        this.f70038x9618a962 = 0;
        this.f70040x630d8c2e = "";
        this.f70035x8a42d713 = "";
        this.f70037x6965c16d = "";
        this.f70036x39b404ba = "";
        this.f70039xe8ae41e4 = "";
        m135607x73fef578();
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m135605xc1a58b65() {
        return ig.y0.f372839u;
    }

    /* renamed from: getDetailsFieldBuilder */
    private com.p176xb6135e39.p283xc50a8b8b.t9 m135606xaa20896d() {
        if (this.f70032x9dfff886 == null) {
            this.f70032x9dfff886 = new com.p176xb6135e39.p283xc50a8b8b.t9(mo135627x9aa62e0c(), m20872x3e6b6e28(), m20879x7a8e633f());
            this.f70033x3e45565d = null;
        }
        return this.f70032x9dfff886;
    }

    /* renamed from: maybeForceBuilderInitialization */
    private void m135607x73fef578() {
        boolean z17;
        z17 = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
        if (z17) {
            m135606xaa20896d();
        }
    }

    /* renamed from: clearDetails */
    public ig.i0 m135611x5b6d9335() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70032x9dfff886;
        if (t9Var == null) {
            this.f70033x3e45565d = null;
            m20881x7bb163d5();
        } else {
            t9Var.c();
        }
        this.f70031x961a12dc &= -33;
        return this;
    }

    /* renamed from: clearEnterScene */
    public ig.i0 m135612xa09d7ec1() {
        this.f70031x961a12dc &= -65;
        this.f70034x26d6a4b = 0;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearEntryType */
    public ig.i0 m135613x8f5db2ff() {
        this.f70031x961a12dc &= -5;
        this.f70035x8a42d713 = ig.j0.m135684x7c90cfc0().mo135631xe2daf416();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearEventName */
    public ig.i0 m135614xadccb478() {
        this.f70031x961a12dc &= -17;
        this.f70036x39b404ba = ig.j0.m135684x7c90cfc0().mo135633x149f58f();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearMaasVersion */
    public ig.i0 m135616xb61bd4a5() {
        this.f70031x961a12dc &= -9;
        this.f70037x6965c16d = ig.j0.m135684x7c90cfc0().mo135635x1f4d2bfc();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearMetricsType */
    public ig.i0 m135617xa219a10() {
        this.f70031x961a12dc &= -2;
        this.f70038x9618a962 = 0;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearPostId */
    public ig.i0 m135620x9c1aee88() {
        this.f70031x961a12dc &= -129;
        this.f70039xe8ae41e4 = ig.j0.m135684x7c90cfc0().mo135638x2a881cd1();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearSessionId */
    public ig.i0 m135621xd02a6e84() {
        this.f70031x961a12dc &= -3;
        this.f70040x630d8c2e = ig.j0.m135684x7c90cfc0().mo135640x23a7af9b();
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return ig.y0.f372839u;
    }

    @Override // ig.k0
    /* renamed from: getDetails */
    public ig.f0 mo135627x9aa62e0c() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70032x9dfff886;
        if (t9Var != null) {
            return (ig.f0) t9Var.e();
        }
        ig.f0 f0Var = this.f70033x3e45565d;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    /* renamed from: getDetailsBuilder */
    public ig.e0 m135628x434b3ef() {
        this.f70031x961a12dc |= 32;
        m20881x7bb163d5();
        return (ig.e0) m135606xaa20896d().d();
    }

    @Override // ig.k0
    /* renamed from: getDetailsOrBuilder */
    public ig.g0 mo135629x1a3fa38c() {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70032x9dfff886;
        if (t9Var != null) {
            return (ig.g0) t9Var.f();
        }
        ig.f0 f0Var = this.f70033x3e45565d;
        return f0Var == null ? ig.f0.m135486x7c90cfc0() : f0Var;
    }

    @Override // ig.k0
    /* renamed from: getEnterScene */
    public int mo135630xbcc8608a() {
        return this.f70034x26d6a4b;
    }

    @Override // ig.k0
    /* renamed from: getEntryType */
    public java.lang.String mo135631xe2daf416() {
        java.lang.Object obj = this.f70035x8a42d713;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70035x8a42d713 = r17;
        }
        return r17;
    }

    @Override // ig.k0
    /* renamed from: getEntryTypeBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135632x5d42f9f5() {
        java.lang.Object obj = this.f70035x8a42d713;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70035x8a42d713 = h17;
        return h17;
    }

    @Override // ig.k0
    /* renamed from: getEventName */
    public java.lang.String mo135633x149f58f() {
        java.lang.Object obj = this.f70036x39b404ba;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70036x39b404ba = r17;
        }
        return r17;
    }

    @Override // ig.k0
    /* renamed from: getEventNameBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135634x6f86fc1c() {
        java.lang.Object obj = this.f70036x39b404ba;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70036x39b404ba = h17;
        return h17;
    }

    @Override // ig.k0
    /* renamed from: getMaasVersion */
    public java.lang.String mo135635x1f4d2bfc() {
        java.lang.Object obj = this.f70037x6965c16d;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70037x6965c16d = r17;
        }
        return r17;
    }

    @Override // ig.k0
    /* renamed from: getMaasVersionBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135636x7b15c1cf() {
        java.lang.Object obj = this.f70037x6965c16d;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70037x6965c16d = h17;
        return h17;
    }

    @Override // ig.k0
    /* renamed from: getMetricsType */
    public com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57 mo135637x7352f167() {
        com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57 m32407xdce0328 = com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57.m32407xdce0328(this.f70038x9618a962);
        return m32407xdce0328 == null ? com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57.nPublisherMetricsTypeSession : m32407xdce0328;
    }

    @Override // ig.k0
    /* renamed from: getPostId */
    public java.lang.String mo135638x2a881cd1() {
        java.lang.Object obj = this.f70039xe8ae41e4;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70039xe8ae41e4 = r17;
        }
        return r17;
    }

    @Override // ig.k0
    /* renamed from: getPostIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135639x5aa90e1a() {
        java.lang.Object obj = this.f70039xe8ae41e4;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70039xe8ae41e4 = h17;
        return h17;
    }

    @Override // ig.k0
    /* renamed from: getSessionId */
    public java.lang.String mo135640x23a7af9b() {
        java.lang.Object obj = this.f70040x630d8c2e;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70040x630d8c2e = r17;
        }
        return r17;
    }

    @Override // ig.k0
    /* renamed from: getSessionIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo135641xb927a990() {
        java.lang.Object obj = this.f70040x630d8c2e;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70040x630d8c2e = h17;
        return h17;
    }

    @Override // ig.k0
    /* renamed from: hasDetails */
    public boolean mo135642xd5fcb648() {
        return (this.f70031x961a12dc & 32) != 0;
    }

    @Override // ig.k0
    /* renamed from: hasEnterScene */
    public boolean mo135643xf7a01ece() {
        return (this.f70031x961a12dc & 64) != 0;
    }

    @Override // ig.k0
    /* renamed from: hasEntryType */
    public boolean mo135644xa2b05d52() {
        return (this.f70031x961a12dc & 4) != 0;
    }

    @Override // ig.k0
    /* renamed from: hasEventName */
    public boolean mo135645xc11f5ecb() {
        return (this.f70031x961a12dc & 16) != 0;
    }

    @Override // ig.k0
    /* renamed from: hasMaasVersion */
    public boolean mo135646x3f6d3638() {
        return (this.f70031x961a12dc & 8) != 0;
    }

    @Override // ig.k0
    /* renamed from: hasMetricsType */
    public boolean mo135647x9372fba3() {
        return (this.f70031x961a12dc & 1) != 0;
    }

    @Override // ig.k0
    /* renamed from: hasPostId */
    public boolean mo135648xea619d15() {
        return (this.f70031x961a12dc & 128) != 0;
    }

    @Override // ig.k0
    /* renamed from: hasSessionId */
    public boolean mo135649xe37d18d7() {
        return (this.f70031x961a12dc & 2) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = ig.y0.f372840v;
        j6Var.c(ig.j0.class, ig.i0.class);
        return j6Var;
    }

    /* renamed from: mergeDetails */
    public ig.i0 m135650x310336ea(ig.f0 f0Var) {
        ig.f0 f0Var2;
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70032x9dfff886;
        if (t9Var == null) {
            if ((this.f70031x961a12dc & 32) == 0 || (f0Var2 = this.f70033x3e45565d) == null || f0Var2 == ig.f0.m135486x7c90cfc0()) {
                this.f70033x3e45565d = f0Var;
            } else {
                this.f70033x3e45565d = ((ig.e0) ig.f0.m135489x3136c9db(this.f70033x3e45565d).mo20527x60f45402((com.p176xb6135e39.p283xc50a8b8b.k8) f0Var)).mo20557x85702333();
            }
            m20881x7bb163d5();
        } else {
            t9Var.g(f0Var);
        }
        this.f70031x961a12dc |= 32;
        return this;
    }

    /* renamed from: setDetails */
    public ig.i0 m135653xe177b80(ig.f0 f0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70032x9dfff886;
        if (t9Var == null) {
            f0Var.getClass();
            this.f70033x3e45565d = f0Var;
            m20881x7bb163d5();
        } else {
            t9Var.i(f0Var);
        }
        this.f70031x961a12dc |= 32;
        return this;
    }

    /* renamed from: setEnterScene */
    public ig.i0 m135654xeaecae96(int i17) {
        this.f70031x961a12dc |= 64;
        this.f70034x26d6a4b = i17;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setEntryType */
    public ig.i0 m135655x3f2eb48a(java.lang.String str) {
        str.getClass();
        this.f70031x961a12dc |= 4;
        this.f70035x8a42d713 = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setEntryTypeBytes */
    public ig.i0 m135656x25396201(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70031x961a12dc |= 4;
        this.f70035x8a42d713 = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setEventName */
    public ig.i0 m135657x5d9db603(java.lang.String str) {
        str.getClass();
        this.f70031x961a12dc |= 16;
        this.f70036x39b404ba = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setEventNameBytes */
    public ig.i0 m135658x377d6428(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70031x961a12dc |= 16;
        this.f70036x39b404ba = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setMaasVersion */
    public ig.i0 m135659xb5b29f70(java.lang.String str) {
        str.getClass();
        this.f70031x961a12dc |= 8;
        this.f70037x6965c16d = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setMaasVersionBytes */
    public ig.i0 m135660x1f1256db(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70031x961a12dc |= 8;
        this.f70037x6965c16d = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setMetricsType */
    public ig.i0 m135661x9b864db(com.p314xaae8f345.p457x3304c6.p458x9b169b86.EnumC3969x8364de57 enumC3969x8364de57) {
        enumC3969x8364de57.getClass();
        this.f70031x961a12dc |= 1;
        this.f70038x9618a962 = enumC3969x8364de57.mo20656x276ffe3f();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setPostId */
    public ig.i0 m135662x1dbd50dd(java.lang.String str) {
        str.getClass();
        this.f70031x961a12dc |= 128;
        this.f70039xe8ae41e4 = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setPostIdBytes */
    public ig.i0 m135663xf10e818e(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70031x961a12dc |= 128;
        this.f70039xe8ae41e4 = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setSessionId */
    public ig.i0 m135665x7ffb700f(java.lang.String str) {
        str.getClass();
        this.f70031x961a12dc |= 2;
        this.f70040x630d8c2e = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setSessionIdBytes */
    public ig.i0 m135666x811e119c(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70031x961a12dc |= 2;
        this.f70040x630d8c2e = yVar;
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: addRepeatedField */
    public ig.i0 mo20555x8e2f927f(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        super.mo20555x8e2f927f(b4Var, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public ig.j0 mo20556x59bc66e() {
        ig.j0 mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: buildPartial */
    public ig.j0 mo20557x85702333() {
        ig.j0 j0Var = new ig.j0(this);
        int i17 = this.f70031x961a12dc;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        j0Var.f70058x9618a962 = this.f70038x9618a962;
        if ((i17 & 2) != 0) {
            i18 |= 2;
        }
        j0Var.f70060x630d8c2e = this.f70040x630d8c2e;
        if ((i17 & 4) != 0) {
            i18 |= 4;
        }
        j0Var.f70055x8a42d713 = this.f70035x8a42d713;
        if ((i17 & 8) != 0) {
            i18 |= 8;
        }
        j0Var.f70057x6965c16d = this.f70037x6965c16d;
        if ((i17 & 16) != 0) {
            i18 |= 16;
        }
        j0Var.f70056x39b404ba = this.f70036x39b404ba;
        if ((i17 & 32) != 0) {
            com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70032x9dfff886;
            if (t9Var == null) {
                j0Var.f70053x3e45565d = this.f70033x3e45565d;
            } else {
                j0Var.f70053x3e45565d = (ig.f0) t9Var.b();
            }
            i18 |= 32;
        }
        if ((i17 & 64) != 0) {
            j0Var.f70054x26d6a4b = this.f70034x26d6a4b;
            i18 |= 64;
        }
        if ((i17 & 128) != 0) {
            i18 |= 128;
        }
        j0Var.f70059xe8ae41e4 = this.f70039xe8ae41e4;
        j0Var.f70052x961a12dc = i18;
        m20880xaf619bdf();
        return j0Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clearField, reason: merged with bridge method [inline-methods] */
    public ig.i0 m136284xd2ece2ad(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        super.m136284xd2ece2ad(b4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public ig.j0 mo20559x786693c3() {
        return ig.j0.m135684x7c90cfc0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setField */
    public ig.i0 mo20563x52fa61b8(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        super.mo20563x52fa61b8(b4Var, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
    public ig.i0 m136434xe229305e(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, int i17, java.lang.Object obj) {
        super.m136434xe229305e(b4Var, i17, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setUnknownFields */
    public final ig.i0 mo20564x9f425a61(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        super.mo20564x9f425a61(waVar);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.i0 m136293xd36dfc70(com.p176xb6135e39.p283xc50a8b8b.g4 g4Var) {
        super.m136293xd36dfc70(g4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.a
    /* renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
    public final ig.i0 m136413xba8a5e4b(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        return (ig.i0) super.m136413xba8a5e4b(waVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.i0 m136279x5a5b64d() {
        super.m136279x5a5b64d();
        this.f70038x9618a962 = 0;
        int i17 = this.f70031x961a12dc & (-2);
        this.f70040x630d8c2e = "";
        this.f70035x8a42d713 = "";
        this.f70037x6965c16d = "";
        this.f70036x39b404ba = "";
        this.f70031x961a12dc = i17 & (-3) & (-5) & (-9) & (-17);
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70032x9dfff886;
        if (t9Var == null) {
            this.f70033x3e45565d = null;
        } else {
            t9Var.c();
        }
        int i18 = this.f70031x961a12dc & (-33);
        this.f70034x26d6a4b = 0;
        this.f70039xe8ae41e4 = "";
        this.f70031x961a12dc = i18 & (-65) & (-129);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.i0 m135626x5a5dd5d() {
        return (ig.i0) super.m136316x5a5dd5d();
    }

    /* renamed from: setDetails */
    public ig.i0 m135652xe177b80(ig.e0 e0Var) {
        com.p176xb6135e39.p283xc50a8b8b.t9 t9Var = this.f70032x9dfff886;
        if (t9Var == null) {
            this.f70033x3e45565d = e0Var.mo20556x59bc66e();
            m20881x7bb163d5();
        } else {
            t9Var.i(e0Var.mo20556x59bc66e());
        }
        this.f70031x961a12dc |= 32;
        return this;
    }

    private i0(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        super(r5Var);
        this.f70038x9618a962 = 0;
        this.f70040x630d8c2e = "";
        this.f70035x8a42d713 = "";
        this.f70037x6965c16d = "";
        this.f70036x39b404ba = "";
        this.f70039xe8ae41e4 = "";
        m135607x73fef578();
    }
}
