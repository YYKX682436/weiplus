package ig;

/* loaded from: classes16.dex */
public final class v extends com.p176xb6135e39.p283xc50a8b8b.q5 implements ig.x {

    /* renamed from: bitField0_ */
    private int f70225x961a12dc;

    /* renamed from: musicActionsBuilder_ */
    private com.p176xb6135e39.p283xc50a8b8b.p9 f70226x72257f5c;

    /* renamed from: musicActions_ */
    private java.util.List<ig.s> f70227x1e703447;

    /* renamed from: previewDurationMs_ */
    private long f70228xed4f205d;

    /* renamed from: previewTemplateId_ */
    private java.lang.Object f70229x73485ee2;

    /* renamed from: previewTemplateSourceType_ */
    private int f70230x26ed8348;

    private v() {
        super(null);
        this.f70229x73485ee2 = "";
        this.f70230x26ed8348 = 0;
        this.f70227x1e703447 = java.util.Collections.emptyList();
        m136219x73fef578();
    }

    /* renamed from: ensureMusicActionsIsMutable */
    private void m136216xd83410c6() {
        if ((this.f70225x961a12dc & 8) == 0) {
            this.f70227x1e703447 = new java.util.ArrayList(this.f70227x1e703447);
            this.f70225x961a12dc |= 8;
        }
    }

    /* renamed from: getDescriptor */
    public static final com.p176xb6135e39.p283xc50a8b8b.r3 m136217xc1a58b65() {
        return ig.y0.f372825g;
    }

    /* renamed from: getMusicActionsFieldBuilder */
    private com.p176xb6135e39.p283xc50a8b8b.p9 m136218x27b769ef() {
        if (this.f70226x72257f5c == null) {
            this.f70226x72257f5c = new com.p176xb6135e39.p283xc50a8b8b.p9(this.f70227x1e703447, (this.f70225x961a12dc & 8) != 0, m20872x3e6b6e28(), m20879x7a8e633f());
            this.f70227x1e703447 = null;
        }
        return this.f70226x72257f5c;
    }

    /* renamed from: maybeForceBuilderInitialization */
    private void m136219x73fef578() {
        boolean z17;
        z17 = com.p176xb6135e39.p283xc50a8b8b.l6.f7872x2df6253a;
        if (z17) {
            m136218x27b769ef();
        }
    }

    /* renamed from: addAllMusicActions */
    public ig.v m136220x83adc78(java.lang.Iterable<? extends ig.s> iterable) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70226x72257f5c;
        if (p9Var == null) {
            m136216xd83410c6();
            com.p176xb6135e39.p283xc50a8b8b.e.m20622xab35b940((java.lang.Iterable) iterable, (java.util.List) this.f70227x1e703447);
            m20881x7bb163d5();
        } else {
            p9Var.b(iterable);
        }
        return this;
    }

    /* renamed from: addMusicActions */
    public ig.v m136224xa6059259(ig.s sVar) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70226x72257f5c;
        if (p9Var == null) {
            sVar.getClass();
            m136216xd83410c6();
            this.f70227x1e703447.add(sVar);
            m20881x7bb163d5();
        } else {
            p9Var.f(sVar);
        }
        return this;
    }

    /* renamed from: addMusicActionsBuilder */
    public ig.r m136225x74374f02() {
        return (ig.r) m136218x27b769ef().d(ig.s.m136149x7c90cfc0());
    }

    /* renamed from: clearMusicActions */
    public ig.v m136231xce3eae05() {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70226x72257f5c;
        if (p9Var == null) {
            this.f70227x1e703447 = java.util.Collections.emptyList();
            this.f70225x961a12dc &= -9;
            m20881x7bb163d5();
        } else {
            p9Var.h();
        }
        return this;
    }

    /* renamed from: clearPreviewDurationMs */
    public ig.v m136234x3ad03575() {
        this.f70225x961a12dc &= -5;
        this.f70228xed4f205d = 0L;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearPreviewTemplateId */
    public ig.v m136235x3f229250() {
        this.f70225x961a12dc &= -2;
        this.f70229x73485ee2 = ig.w.m136469x7c90cfc0().mo136250x77f4cc67();
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: clearPreviewTemplateSourceType */
    public ig.v m136236xfab9662a() {
        this.f70225x961a12dc &= -3;
        this.f70230x26ed8348 = 0;
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.j8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDescriptorForType */
    public com.p176xb6135e39.p283xc50a8b8b.r3 mo20560x84bb647e() {
        return ig.y0.f372825g;
    }

    @Override // ig.x
    /* renamed from: getMusicActions */
    public ig.s mo136242x8b38418e(int i17) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70226x72257f5c;
        return p9Var == null ? this.f70227x1e703447.get(i17) : (ig.s) p9Var.m(i17, false);
    }

    /* renamed from: getMusicActionsBuilder */
    public ig.r m136243x22100a2d(int i17) {
        return (ig.r) m136218x27b769ef().k(i17);
    }

    /* renamed from: getMusicActionsBuilderList */
    public java.util.List<ig.r> m136244x2999506b() {
        com.p176xb6135e39.p283xc50a8b8b.p9 m136218x27b769ef = m136218x27b769ef();
        if (m136218x27b769ef.f126948g == null) {
            m136218x27b769ef.f126948g = new com.p176xb6135e39.p283xc50a8b8b.m9(m136218x27b769ef);
        }
        return m136218x27b769ef.f126948g;
    }

    @Override // ig.x
    /* renamed from: getMusicActionsCount */
    public int mo136245x98fce821() {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70226x72257f5c;
        return p9Var == null ? this.f70227x1e703447.size() : p9Var.l();
    }

    @Override // ig.x
    /* renamed from: getMusicActionsList */
    public java.util.List<ig.s> mo136246xcb24ef4c() {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70226x72257f5c;
        if (p9Var == null) {
            return java.util.Collections.unmodifiableList(this.f70227x1e703447);
        }
        if (p9Var.f126947f == null) {
            p9Var.f126947f = new com.p176xb6135e39.p283xc50a8b8b.n9(p9Var);
        }
        return p9Var.f126947f;
    }

    @Override // ig.x
    /* renamed from: getMusicActionsOrBuilder */
    public ig.t mo136247x2e9e624a(int i17) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70226x72257f5c;
        return p9Var == null ? this.f70227x1e703447.get(i17) : (ig.t) p9Var.n(i17);
    }

    @Override // ig.x
    /* renamed from: getMusicActionsOrBuilderList */
    public java.util.List<? extends ig.t> mo136248x18d45208() {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70226x72257f5c;
        if (p9Var == null) {
            return java.util.Collections.unmodifiableList(this.f70227x1e703447);
        }
        if (p9Var.f126949h == null) {
            p9Var.f126949h = new com.p176xb6135e39.p283xc50a8b8b.o9(p9Var);
        }
        return p9Var.f126949h;
    }

    @Override // ig.x
    /* renamed from: getPreviewDurationMs */
    public long mo136249x73a26f8c() {
        return this.f70228xed4f205d;
    }

    @Override // ig.x
    /* renamed from: getPreviewTemplateId */
    public java.lang.String mo136250x77f4cc67() {
        java.lang.Object obj = this.f70229x73485ee2;
        if (obj instanceof java.lang.String) {
            return (java.lang.String) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y yVar = (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        java.lang.String r17 = yVar.r();
        if (yVar.l()) {
            this.f70229x73485ee2 = r17;
        }
        return r17;
    }

    @Override // ig.x
    /* renamed from: getPreviewTemplateIdBytes */
    public com.p176xb6135e39.p283xc50a8b8b.y mo136251x30c8ac44() {
        java.lang.Object obj = this.f70229x73485ee2;
        if (!(obj instanceof java.lang.String)) {
            return (com.p176xb6135e39.p283xc50a8b8b.y) obj;
        }
        com.p176xb6135e39.p283xc50a8b8b.y h17 = com.p176xb6135e39.p283xc50a8b8b.y.h((java.lang.String) obj);
        this.f70229x73485ee2 = h17;
        return h17;
    }

    @Override // ig.x
    /* renamed from: getPreviewTemplateSourceType */
    public ig.c0 mo136252x14d79941() {
        ig.c0 a17 = ig.c0.a(this.f70230x26ed8348);
        return a17 == null ? ig.c0.UNKNOWN : a17;
    }

    @Override // ig.x
    /* renamed from: hasPreviewDurationMs */
    public boolean mo136253x6008dcc8() {
        return (this.f70225x961a12dc & 4) != 0;
    }

    @Override // ig.x
    /* renamed from: hasPreviewTemplateId */
    public boolean mo136254x645b39a3() {
        return (this.f70225x961a12dc & 1) != 0;
    }

    @Override // ig.x
    /* renamed from: hasPreviewTemplateSourceType */
    public boolean mo136255x1e8b0a7d() {
        return (this.f70225x961a12dc & 2) != 0;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: internalGetFieldAccessorTable */
    public com.p176xb6135e39.p283xc50a8b8b.j6 mo20561xa6ad8e26() {
        com.p176xb6135e39.p283xc50a8b8b.j6 j6Var = ig.y0.f372826h;
        j6Var.c(ig.w.class, ig.v.class);
        return j6Var;
    }

    /* renamed from: removeMusicActions */
    public ig.v m136257xc73755bc(int i17) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70226x72257f5c;
        if (p9Var == null) {
            m136216xd83410c6();
            this.f70227x1e703447.remove(i17);
            m20881x7bb163d5();
        } else {
            p9Var.r(i17);
        }
        return this;
    }

    /* renamed from: setMusicActions */
    public ig.v m136259xc1813c9a(int i17, ig.s sVar) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70226x72257f5c;
        if (p9Var == null) {
            sVar.getClass();
            m136216xd83410c6();
            this.f70227x1e703447.set(i17, sVar);
            m20881x7bb163d5();
        } else {
            p9Var.s(i17, sVar);
        }
        return this;
    }

    /* renamed from: setPreviewDurationMs */
    public ig.v m136260x4f387c00(long j17) {
        this.f70225x961a12dc |= 4;
        this.f70228xed4f205d = j17;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setPreviewTemplateId */
    public ig.v m136261x538ad8db(java.lang.String str) {
        str.getClass();
        this.f70225x961a12dc |= 1;
        this.f70229x73485ee2 = str;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setPreviewTemplateIdBytes */
    public ig.v m136262x630c4850(com.p176xb6135e39.p283xc50a8b8b.y yVar) {
        yVar.getClass();
        this.f70225x961a12dc |= 1;
        this.f70229x73485ee2 = yVar;
        m20881x7bb163d5();
        return this;
    }

    /* renamed from: setPreviewTemplateSourceType */
    public ig.v m136263x5ea3f1b5(ig.c0 c0Var) {
        c0Var.getClass();
        this.f70225x961a12dc |= 2;
        this.f70230x26ed8348 = c0Var.f372807d;
        m20881x7bb163d5();
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: addRepeatedField */
    public ig.v mo20555x8e2f927f(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        super.mo20555x8e2f927f(b4Var, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: build */
    public ig.w mo20556x59bc66e() {
        ig.w mo20557x85702333 = mo20557x85702333();
        if (mo20557x85702333.mo20562xf582434a()) {
            return mo20557x85702333;
        }
        throw com.p176xb6135e39.p283xc50a8b8b.a.m20517xb3590f03((com.p176xb6135e39.p283xc50a8b8b.k8) mo20557x85702333);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.n8, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: buildPartial */
    public ig.w mo20557x85702333() {
        ig.w wVar = new ig.w(this);
        int i17 = this.f70225x961a12dc;
        int i18 = (i17 & 1) != 0 ? 1 : 0;
        wVar.f70281x73485ee2 = this.f70229x73485ee2;
        if ((i17 & 2) != 0) {
            i18 |= 2;
        }
        wVar.f70282x26ed8348 = this.f70230x26ed8348;
        if ((i17 & 4) != 0) {
            wVar.f70280xed4f205d = this.f70228xed4f205d;
            i18 |= 4;
        }
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70226x72257f5c;
        if (p9Var == null) {
            if ((this.f70225x961a12dc & 8) != 0) {
                this.f70227x1e703447 = java.util.Collections.unmodifiableList(this.f70227x1e703447);
                this.f70225x961a12dc &= -9;
            }
            wVar.f70279x1e703447 = this.f70227x1e703447;
        } else {
            wVar.f70279x1e703447 = p9Var.g();
        }
        wVar.f70278x961a12dc = i18;
        m20880xaf619bdf();
        return wVar;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clearField, reason: merged with bridge method [inline-methods] */
    public ig.v m136230xd2ece2ad(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var) {
        super.m136230xd2ece2ad(b4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.p8, com.p176xb6135e39.p283xc50a8b8b.r8
    /* renamed from: getDefaultInstanceForType */
    public ig.w mo20559x786693c3() {
        return ig.w.m136469x7c90cfc0();
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setField */
    public ig.v mo20563x52fa61b8(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, java.lang.Object obj) {
        super.mo20563x52fa61b8(b4Var, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: setRepeatedField, reason: merged with bridge method [inline-methods] */
    public ig.v m136264xe229305e(com.p176xb6135e39.p283xc50a8b8b.b4 b4Var, int i17, java.lang.Object obj) {
        super.m136264xe229305e(b4Var, i17, obj);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.j8
    /* renamed from: setUnknownFields */
    public final ig.v mo20564x9f425a61(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        super.mo20564x9f425a61(waVar);
        return this;
    }

    /* renamed from: addMusicActionsBuilder */
    public ig.r m136226x74374f02(int i17) {
        return (ig.r) m136218x27b769ef().c(i17, ig.s.m136149x7c90cfc0());
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clearOneof, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.v m136233xd36dfc70(com.p176xb6135e39.p283xc50a8b8b.g4 g4Var) {
        super.m136233xd36dfc70(g4Var);
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5, com.p176xb6135e39.p283xc50a8b8b.a
    /* renamed from: mergeUnknownFields, reason: merged with bridge method [inline-methods] */
    public final ig.v m136256xba8a5e4b(com.p176xb6135e39.p283xc50a8b8b.wa waVar) {
        return (ig.v) super.m136256xba8a5e4b(waVar);
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clear, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.v m136229x5a5b64d() {
        super.m136229x5a5b64d();
        this.f70229x73485ee2 = "";
        int i17 = this.f70225x961a12dc & (-2);
        this.f70230x26ed8348 = 0;
        this.f70228xed4f205d = 0L;
        this.f70225x961a12dc = i17 & (-3) & (-5);
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70226x72257f5c;
        if (p9Var == null) {
            this.f70227x1e703447 = java.util.Collections.emptyList();
            this.f70225x961a12dc &= -9;
        } else {
            p9Var.h();
        }
        return this;
    }

    /* renamed from: addMusicActions */
    public ig.v m136222xa6059259(int i17, ig.s sVar) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70226x72257f5c;
        if (p9Var == null) {
            sVar.getClass();
            m136216xd83410c6();
            this.f70227x1e703447.add(i17, sVar);
            m20881x7bb163d5();
        } else {
            p9Var.e(i17, sVar);
        }
        return this;
    }

    @Override // com.p176xb6135e39.p283xc50a8b8b.q5
    /* renamed from: clone, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public ig.v m136241x5a5dd5d() {
        return (ig.v) super.m136241x5a5dd5d();
    }

    /* renamed from: setMusicActions */
    public ig.v m136258xc1813c9a(int i17, ig.r rVar) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70226x72257f5c;
        if (p9Var == null) {
            m136216xd83410c6();
            this.f70227x1e703447.set(i17, rVar.mo20556x59bc66e());
            m20881x7bb163d5();
        } else {
            p9Var.s(i17, rVar.mo20556x59bc66e());
        }
        return this;
    }

    private v(com.p176xb6135e39.p283xc50a8b8b.r5 r5Var) {
        super(r5Var);
        this.f70229x73485ee2 = "";
        this.f70230x26ed8348 = 0;
        this.f70227x1e703447 = java.util.Collections.emptyList();
        m136219x73fef578();
    }

    /* renamed from: addMusicActions */
    public ig.v m136223xa6059259(ig.r rVar) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70226x72257f5c;
        if (p9Var == null) {
            m136216xd83410c6();
            this.f70227x1e703447.add(rVar.mo20556x59bc66e());
            m20881x7bb163d5();
        } else {
            p9Var.f(rVar.mo20556x59bc66e());
        }
        return this;
    }

    /* renamed from: addMusicActions */
    public ig.v m136221xa6059259(int i17, ig.r rVar) {
        com.p176xb6135e39.p283xc50a8b8b.p9 p9Var = this.f70226x72257f5c;
        if (p9Var == null) {
            m136216xd83410c6();
            this.f70227x1e703447.add(i17, rVar.mo20556x59bc66e());
            m20881x7bb163d5();
        } else {
            p9Var.e(i17, rVar.mo20556x59bc66e());
        }
        return this;
    }
}
