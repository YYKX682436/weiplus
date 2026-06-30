package vg;

/* loaded from: classes16.dex */
public final class h extends com.p176xb6135e39.p283xc50a8b8b.l6 implements com.p176xb6135e39.p283xc50a8b8b.r8 {

    /* renamed from: DEFAULT_INSTANCE */
    private static final vg.h f77325xb3e828f3 = new vg.h();

    /* renamed from: PARSER */
    private static final com.p176xb6135e39.p283xc50a8b8b.e9 f77326x8c3e301f = new vg.f();

    /* renamed from: ROOT_TASK_ID_FIELD_NUMBER */
    public static final int f77327x6da1db75 = 3;

    /* renamed from: TASK_TIME_TRACE_FIELD_NUMBER */
    public static final int f77328x5cd62920 = 4;

    /* renamed from: TRACE_ID_FIELD_NUMBER */
    public static final int f77329xc18f03d8 = 1;

    /* renamed from: TRACE_NAME_FIELD_NUMBER */
    public static final int f77330x159fcee8 = 2;

    /* renamed from: serialVersionUID */
    private static final long f77331x3a3ed56c = 0;

    /* renamed from: memoizedIsInitialized */
    private byte f77332xf54bb1a0;

    /* renamed from: rootTaskId_ */
    private int f77333x9cfbf39d;

    /* renamed from: taskTimeTrace_ */
    private java.util.List<vg.d> f77334x1034184c;

    /* renamed from: traceId_ */
    private volatile java.lang.Object f77335x4bb6eb1f;

    /* renamed from: traceName_ */
    private volatile java.lang.Object f77336x39edf8ef;

    /* renamed from: getDefaultInstance */
    public static vg.h m171921x7c90cfc0() {
        return f77325xb3e828f3;
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m171922xc1a58b65() {
        return vg.i.f517977c;
    }

    /* renamed from: newBuilder */
    public static vg.g m171923x3136c9db() {
        return f77325xb3e828f3.mo20599xaaa148a0();
    }

    /* renamed from: parseDelimitedFrom */
    public static vg.h m171925x4a829d50(java.io.InputStream inputStream) {
        return (vg.h) com.p176xb6135e39.p283xc50a8b8b.l6.m20761xfaac9fdd(f77326x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static vg.h m171933x92b714fd(java.nio.ByteBuffer byteBuffer) {
        return (vg.h) f77326x8c3e301f.mo20640x92b714fd(byteBuffer);
    }

    /* renamed from: parser */
    public static com.p176xb6135e39.p283xc50a8b8b.e9 m171937xc4ab3c1f() {
        return f77326x8c3e301f;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: equals */
    public boolean mo20583xb2c87fbf(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vg.h)) {
            return super.mo20583xb2c87fbf(obj);
        }
        vg.h hVar = (vg.h) obj;
        return m171945xfe2df90a().equals(hVar.m171945xfe2df90a()) && m171947x2a9626ba().equals(hVar.m171947x2a9626ba()) && m171939x987a64f8() == hVar.m171939x987a64f8() && m171942xf184f0fb().equals(hVar.m171942xf184f0fb()) && this.f7874x4f0c37a3.m20941xb2c87fbf(hVar.f7874x4f0c37a3);
    }

    /* renamed from: getParserForType */
    public com.p176xb6135e39.p283xc50a8b8b.e9 m171938x7ea0ace() {
        return f77326x8c3e301f;
    }

    /* renamed from: getRootTaskId */
    public int m171939x987a64f8() {
        return this.f77333x9cfbf39d;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: getSerializedSize */
    public int mo20593x9d9c349b() {
        int i17 = this.f7867xd4e4d8eb;
        if (i17 != -1) {
            return i17;
        }
        int m20743x690e0f49 = !m171946xd190ed81().m20957x7aab3243() ? com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(1, this.f77335x4bb6eb1f) + 0 : 0;
        if (!m171948x1c91cdd1().m20957x7aab3243()) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.l6.m20743x690e0f49(2, this.f77336x39edf8ef);
        }
        int i18 = this.f77333x9cfbf39d;
        if (i18 != 0) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.q(3, i18);
        }
        for (int i19 = 0; i19 < this.f77334x1034184c.size(); i19++) {
            m20743x690e0f49 += com.p176xb6135e39.p283xc50a8b8b.k0.n(4, this.f77334x1034184c.get(i19));
        }
        int mo20593x9d9c349b = m20743x690e0f49 + this.f7874x4f0c37a3.mo20593x9d9c349b();
        this.f7867xd4e4d8eb = mo20593x9d9c349b;
        return mo20593x9d9c349b;
    }

    /* renamed from: getTaskTimeTrace */
    public vg.d m171940x318272bd(int i17) {
        return this.f77334x1034184c.get(i17);
    }

    /* renamed from: getTaskTimeTraceCount */
    public int m171941x3e9d1c52() {
        return this.f77334x1034184c.size();
    }

    /* renamed from: getTaskTimeTraceList */
    public java.util.List<vg.d> m171942xf184f0fb() {
        return this.f77334x1034184c;
    }

    /* renamed from: getTaskTimeTraceOrBuilder */
    public vg.e m171943xe3b715fb(int i17) {
        return this.f77334x1034184c.get(i17);
    }

    /* renamed from: getTaskTimeTraceOrBuilderList */
    public java.util.List<? extends vg.e> m171944x6619c539() {
        return this.f77334x1034184c;
    }

    /* renamed from: getTraceId */
    public java.lang.String m171945xfe2df90a() {
        java.lang.Object obj = this.f77335x4bb6eb1f;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.p176xb6135e39.p283xc50a8b8b.y) obj).r();
        this.f77335x4bb6eb1f = r17;
        return r17;
    }

    /* renamed from: getTraceIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y m171946xd190ed81() {
        java.lang.Object obj = this.f77335x4bb6eb1f;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f77335x4bb6eb1f = h17;
        return h17;
    }

    /* renamed from: getTraceName */
    public java.lang.String m171947x2a9626ba() {
        java.lang.Object obj = this.f77336x39edf8ef;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        java.lang.String r17 = ((com.p176xb6135e39.p283xc50a8b8b.y) obj).r();
        this.f77336x39edf8ef = r17;
        return r17;
    }

    /* renamed from: getTraceNameBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y m171948x1c91cdd1() {
        java.lang.Object obj = this.f77336x39edf8ef;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f77336x39edf8ef = h17;
        return h17;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getUnknownFields */
    public final com.p176xb6135e39.p283xc50a8b8b.wa mo20594xc6bf3ed() {
        return this.f7874x4f0c37a3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.c
    /* renamed from: hashCode */
    public int mo20587x8cdac1b() {
        int i17 = this.f7868x8a222005;
        if (i17 != 0) {
            return i17;
        }
        int hashCode = ((((((((((((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1110x6854fdf.l1.f34817x366c91de + m171922xc1a58b65().hashCode()) * 37) + 1) * 53) + m171945xfe2df90a().hashCode()) * 37) + 2) * 53) + m171947x2a9626ba().hashCode()) * 37) + 3) * 53) + m171939x987a64f8();
        if (m171941x3e9d1c52() > 0) {
            hashCode = (((hashCode * 37) + 4) * 53) + m171942xf184f0fb().hashCode();
        }
        int m20942x8cdac1b = (hashCode * 29) + this.f7874x4f0c37a3.m20942x8cdac1b();
        this.f7868x8a222005 = m20942x8cdac1b;
        return m20942x8cdac1b;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20595xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = vg.i.f517978d;
        j6Var.c(vg.h.class, vg.g.class);
        return j6Var;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.p8
    /* renamed from: isInitialized */
    public final boolean mo20562xf582434a() {
        byte b17 = this.f77332xf54bb1a0;
        if (b17 == 1) {
            return true;
        }
        if (b17 == 0) {
            return false;
        }
        this.f77332xf54bb1a0 = (byte) 1;
        return true;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newInstance */
    public java.lang.Object mo20598x6bff0255(com.p176xb6135e39.p283xc50a8b8b.k6 k6Var) {
        return new vg.h();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6, com.p176xb6135e39.p283xc50a8b8b.o8
    /* renamed from: writeTo */
    public void mo20600x5f8be6ba(com.p176xb6135e39.p283xc50a8b8b.k0 k0Var) {
        if (!m171946xd190ed81().m20957x7aab3243()) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 1, this.f77335x4bb6eb1f);
        }
        if (!m171948x1c91cdd1().m20957x7aab3243()) {
            com.p176xb6135e39.p283xc50a8b8b.l6.m20772x542d00d0(k0Var, 2, this.f77336x39edf8ef);
        }
        int i17 = this.f77333x9cfbf39d;
        if (i17 != 0) {
            k0Var.R(3, i17);
        }
        for (int i18 = 0; i18 < this.f77334x1034184c.size(); i18++) {
            k0Var.J(4, this.f77334x1034184c.get(i18));
        }
        this.f7874x4f0c37a3.mo20600x5f8be6ba(k0Var);
    }

    /* renamed from: newBuilder */
    public static vg.g m171924x3136c9db(vg.h hVar) {
        vg.g mo20599xaaa148a0 = f77325xb3e828f3.mo20599xaaa148a0();
        mo20599xaaa148a0.f(hVar);
        return mo20599xaaa148a0;
    }

    /* renamed from: parseFrom */
    public static vg.h m171934x92b714fd(java.nio.ByteBuffer byteBuffer, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (vg.h) f77326x8c3e301f.mo20641x92b714fd(byteBuffer, t4Var);
    }

    private h(com.p176xb6135e39.p283xc50a8b8b.q5 q5Var) {
        super(q5Var);
        this.f77332xf54bb1a0 = (byte) -1;
    }

    /* renamed from: parseDelimitedFrom */
    public static vg.h m171926x4a829d50(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (vg.h) com.p176xb6135e39.p283xc50a8b8b.l6.m20762xfaac9fdd(f77326x8c3e301f, inputStream, t4Var);
    }

    /* renamed from: parseFrom */
    public static vg.h m171929x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        return (vg.h) f77326x8c3e301f.mo20636x92b714fd(yVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public vg.h mo20559x786693c3() {
        return f77325xb3e828f3;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: toBuilder */
    public vg.g mo20599xaaa148a0() {
        if (this == f77325xb3e828f3) {
            return new vg.g(null);
        }
        vg.g gVar = new vg.g(null);
        gVar.f(this);
        return gVar;
    }

    /* renamed from: parseFrom */
    public static vg.h m171930x92b714fd(com.p176xb6135e39.p283xc50a8b8b.y yVar, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (vg.h) f77326x8c3e301f.mo20637x92b714fd(yVar, t4Var);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.o8, com.p176xb6135e39.p283xc50a8b8b.k8
    /* renamed from: newBuilderForType */
    public vg.g mo20596xab31548() {
        return m171923x3136c9db();
    }

    private h() {
        this.f77332xf54bb1a0 = (byte) -1;
        this.f77335x4bb6eb1f = "";
        this.f77336x39edf8ef = "";
        this.f77334x1034184c = java.util.Collections.emptyList();
    }

    /* renamed from: parseFrom */
    public static vg.h m171935x92b714fd(byte[] bArr) {
        return (vg.h) f77326x8c3e301f.mo20642x92b714fd(bArr);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.l6
    /* renamed from: newBuilderForType */
    public vg.g mo20597xab31548(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        return new vg.g(r5Var, null);
    }

    /* renamed from: parseFrom */
    public static vg.h m171936x92b714fd(byte[] bArr, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (vg.h) f77326x8c3e301f.mo20643x92b714fd(bArr, t4Var);
    }

    /* renamed from: parseFrom */
    public static vg.h m171931x92b714fd(java.io.InputStream inputStream) {
        return (vg.h) com.p176xb6135e39.p283xc50a8b8b.l6.m20765x10e48a10(f77326x8c3e301f, inputStream);
    }

    /* renamed from: parseFrom */
    public static vg.h m171932x92b714fd(java.io.InputStream inputStream, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (vg.h) com.p176xb6135e39.p283xc50a8b8b.l6.m20766x10e48a10(f77326x8c3e301f, inputStream, t4Var);
    }

    private h(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        this();
        t4Var.getClass();
        com.p176xb6135e39.p283xc50a8b8b.sa b17 = com.p176xb6135e39.p283xc50a8b8b.wa.b();
        boolean z17 = false;
        boolean z18 = false;
        while (!z17) {
            try {
                try {
                    try {
                        int F = d0Var.F();
                        if (F != 0) {
                            if (F == 10) {
                                this.f77335x4bb6eb1f = d0Var.E();
                            } else if (F == 18) {
                                this.f77336x39edf8ef = d0Var.E();
                            } else if (F == 24) {
                                this.f77333x9cfbf39d = d0Var.G();
                            } else if (F != 34) {
                                if (!mo20783x10621d23(d0Var, b17, t4Var, F)) {
                                }
                            } else {
                                if (!(z18 & true)) {
                                    this.f77334x1034184c = new java.util.ArrayList();
                                    z18 |= true;
                                }
                                this.f77334x1034184c.add((vg.d) d0Var.v(vg.d.m171893xc4ab3c1f(), t4Var));
                            }
                        }
                        z17 = true;
                    } catch (com.p176xb6135e39.p283xc50a8b8b.y6 e17) {
                        e17.f127272d = this;
                        throw e17;
                    }
                } catch (java.io.IOException e18) {
                    com.p176xb6135e39.p283xc50a8b8b.y6 y6Var = new com.p176xb6135e39.p283xc50a8b8b.y6(e18);
                    y6Var.f127272d = this;
                    throw y6Var;
                }
            } finally {
                if (z18 & true) {
                    this.f77334x1034184c = java.util.Collections.unmodifiableList(this.f77334x1034184c);
                }
                this.f7874x4f0c37a3 = b17.mo20556x59bc66e();
                mo20781x1ff81300();
            }
        }
    }

    /* renamed from: parseFrom */
    public static vg.h m171927x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var) {
        return (vg.h) com.p176xb6135e39.p283xc50a8b8b.l6.m20763x10e48a10(f77326x8c3e301f, d0Var);
    }

    /* renamed from: parseFrom */
    public static vg.h m171928x92b714fd(com.p176xb6135e39.p283xc50a8b8b.d0 d0Var, com.p176xb6135e39.p283xc50a8b8b.t4 t4Var) {
        return (vg.h) com.p176xb6135e39.p283xc50a8b8b.l6.m20764x10e48a10(f77326x8c3e301f, d0Var, t4Var);
    }
}
