package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.FinderSyncClientStatus */
/* loaded from: classes4.dex */
public class C27424xe3f1263e extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27424xe3f1263e f60040xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27424xe3f1263e();

    /* renamed from: hasDiscoveryReddot */
    public boolean f60043xddbd82ee = false;

    /* renamed from: reddot_session */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27454x3a51e83e f60045xf6ea486f = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27454x3a51e83e.m116221x7c90cfc0();

    /* renamed from: finder_newlife_prefetch_info */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27414x7b291ffb f60041x6bf8d03a = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27414x7b291ffb.m114880x7c90cfc0();

    /* renamed from: finder_reddot_freq_info */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27422xd8cb464 f60042xf9a580a7 = com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27422xd8cb464.m115167x7c90cfc0();

    /* renamed from: is_in_flow */
    public boolean f60044xccfb05f3 = false;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27424xe3f1263e m115233xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27424xe3f1263e();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27424xe3f1263e m115234x7c90cfc0() {
        return f60040xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27424xe3f1263e m115235x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27424xe3f1263e();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27424xe3f1263e m115236x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27424xe3f1263e)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27424xe3f1263e c27424xe3f1263e = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27424xe3f1263e) fVar;
        return n51.f.a(java.lang.Boolean.valueOf(this.f60043xddbd82ee), java.lang.Boolean.valueOf(c27424xe3f1263e.f60043xddbd82ee)) && n51.f.a(this.f60045xf6ea486f, c27424xe3f1263e.f60045xf6ea486f) && n51.f.a(this.f60041x6bf8d03a, c27424xe3f1263e.f60041x6bf8d03a) && n51.f.a(this.f60042xf9a580a7, c27424xe3f1263e.f60042xf9a580a7) && n51.f.a(java.lang.Boolean.valueOf(this.f60044xccfb05f3), java.lang.Boolean.valueOf(c27424xe3f1263e.f60044xccfb05f3));
    }

    /* renamed from: getFinderNewlifePrefetchInfo */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27414x7b291ffb m115237x4f41945() {
        return this.f60041x6bf8d03a;
    }

    /* renamed from: getFinderReddotFreqInfo */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27422xd8cb464 m115238xaf933cba() {
        return this.f60042xf9a580a7;
    }

    /* renamed from: getFinder_newlife_prefetch_info */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27414x7b291ffb m115239xb7d3b6b0() {
        return this.f60041x6bf8d03a;
    }

    /* renamed from: getFinder_reddot_freq_info */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27422xd8cb464 m115240xc9a5e871() {
        return this.f60042xf9a580a7;
    }

    /* renamed from: getHasDiscoveryReddot */
    public boolean m115241xf119e4e4() {
        return this.f60043xddbd82ee;
    }

    /* renamed from: getIsInFlow */
    public boolean m115242x5d639733() {
        return this.f60044xccfb05f3;
    }

    /* renamed from: getIs_in_flow */
    public boolean m115243xbb3bbde9() {
        return this.f60044xccfb05f3;
    }

    /* renamed from: getReddotSession */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27454x3a51e83e m115244xc81274a8() {
        return this.f60045xf6ea486f;
    }

    /* renamed from: getReddot_session */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27454x3a51e83e m115245xe5821565() {
        return this.f60045xf6ea486f;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27424xe3f1263e m115246x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27424xe3f1263e();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.a(1, this.f60043xddbd82ee);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27454x3a51e83e c27454x3a51e83e = this.f60045xf6ea486f;
            if (c27454x3a51e83e != null) {
                fVar.i(4, c27454x3a51e83e.mo75928xcd1e8d8());
                this.f60045xf6ea486f.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27414x7b291ffb c27414x7b291ffb = this.f60041x6bf8d03a;
            if (c27414x7b291ffb != null) {
                fVar.i(9, c27414x7b291ffb.mo75928xcd1e8d8());
                this.f60041x6bf8d03a.mo75956x3d5d1f78(fVar);
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27422xd8cb464 c27422xd8cb464 = this.f60042xf9a580a7;
            if (c27422xd8cb464 != null) {
                fVar.i(12, c27422xd8cb464.mo75928xcd1e8d8());
                this.f60042xf9a580a7.mo75956x3d5d1f78(fVar);
            }
            fVar.a(13, this.f60044xccfb05f3);
            return 0;
        }
        if (i17 == 1) {
            int a17 = b36.f.a(1, this.f60043xddbd82ee) + 0;
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27454x3a51e83e c27454x3a51e83e2 = this.f60045xf6ea486f;
            if (c27454x3a51e83e2 != null) {
                a17 += b36.f.i(4, c27454x3a51e83e2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27414x7b291ffb c27414x7b291ffb2 = this.f60041x6bf8d03a;
            if (c27414x7b291ffb2 != null) {
                a17 += b36.f.i(9, c27414x7b291ffb2.mo75928xcd1e8d8());
            }
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27422xd8cb464 c27422xd8cb4642 = this.f60042xf9a580a7;
            if (c27422xd8cb4642 != null) {
                a17 += b36.f.i(12, c27422xd8cb4642.mo75928xcd1e8d8());
            }
            return a17 + b36.f.a(13, this.f60044xccfb05f3);
        }
        if (i17 == 2) {
            c36.a aVar = new c36.a((byte[]) objArr[0], com.p314xaae8f345.mm.p2495xc50a8b8b.f.f38879xd1e823a);
            for (int m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar); m75958x5767edba > 0; m75958x5767edba = com.p314xaae8f345.mm.p2495xc50a8b8b.f.m75958x5767edba(aVar)) {
                if (!super.mo75949x4476b383(aVar, this, m75958x5767edba)) {
                    aVar.b();
                }
            }
            return 0;
        }
        if (i17 != 3) {
            return -1;
        }
        c36.a aVar2 = (c36.a) objArr[0];
        int intValue = ((java.lang.Integer) objArr[2]).intValue();
        if (intValue == 1) {
            this.f60043xddbd82ee = aVar2.c(intValue);
            return 0;
        }
        if (intValue == 4) {
            java.util.LinkedList j17 = aVar2.j(intValue);
            int size = j17.size();
            for (int i18 = 0; i18 < size; i18++) {
                byte[] bArr = (byte[]) j17.get(i18);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27454x3a51e83e c27454x3a51e83e3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27454x3a51e83e();
                if (bArr != null && bArr.length > 0) {
                    c27454x3a51e83e3.mo11468x92b714fd(bArr);
                }
                this.f60045xf6ea486f = c27454x3a51e83e3;
            }
            return 0;
        }
        if (intValue == 9) {
            java.util.LinkedList j18 = aVar2.j(intValue);
            int size2 = j18.size();
            for (int i19 = 0; i19 < size2; i19++) {
                byte[] bArr2 = (byte[]) j18.get(i19);
                com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27414x7b291ffb c27414x7b291ffb3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27414x7b291ffb();
                if (bArr2 != null && bArr2.length > 0) {
                    c27414x7b291ffb3.mo11468x92b714fd(bArr2);
                }
                this.f60041x6bf8d03a = c27414x7b291ffb3;
            }
            return 0;
        }
        if (intValue != 12) {
            if (intValue != 13) {
                return -1;
            }
            this.f60044xccfb05f3 = aVar2.c(intValue);
            return 0;
        }
        java.util.LinkedList j19 = aVar2.j(intValue);
        int size3 = j19.size();
        for (int i27 = 0; i27 < size3; i27++) {
            byte[] bArr3 = (byte[]) j19.get(i27);
            com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27422xd8cb464 c27422xd8cb4643 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27422xd8cb464();
            if (bArr3 != null && bArr3.length > 0) {
                c27422xd8cb4643.mo11468x92b714fd(bArr3);
            }
            this.f60042xf9a580a7 = c27422xd8cb4643;
        }
        return 0;
    }

    /* renamed from: setFinderNewlifePrefetchInfo */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27424xe3f1263e m115248x4ec071b9(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27414x7b291ffb c27414x7b291ffb) {
        this.f60041x6bf8d03a = c27414x7b291ffb;
        return this;
    }

    /* renamed from: setFinderReddotFreqInfo */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27424xe3f1263e m115249x29e66bc6(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27422xd8cb464 c27422xd8cb464) {
        this.f60042xf9a580a7 = c27422xd8cb464;
        return this;
    }

    /* renamed from: setFinder_newlife_prefetch_info */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27424xe3f1263e m115250xb2bd19bc(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27414x7b291ffb c27414x7b291ffb) {
        this.f60041x6bf8d03a = c27414x7b291ffb;
        return this;
    }

    /* renamed from: setFinder_reddot_freq_info */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27424xe3f1263e m115251xdfd5cde5(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27422xd8cb464 c27422xd8cb464) {
        this.f60042xf9a580a7 = c27422xd8cb464;
        return this;
    }

    /* renamed from: setHasDiscoveryReddot */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27424xe3f1263e m115252x884566f0(boolean z17) {
        this.f60043xddbd82ee = z17;
        return this;
    }

    /* renamed from: setIsInFlow */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27424xe3f1263e m115253x581bf83f(boolean z17) {
        this.f60044xccfb05f3 = z17;
        return this;
    }

    /* renamed from: setIs_in_flow */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27424xe3f1263e m115254xe9600bf5(boolean z17) {
        this.f60044xccfb05f3 = z17;
        return this;
    }

    /* renamed from: setReddotSession */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27424xe3f1263e m115255x5ae8db1c(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27454x3a51e83e c27454x3a51e83e) {
        this.f60045xf6ea486f = c27454x3a51e83e;
        return this;
    }

    /* renamed from: setReddot_session */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27424xe3f1263e m115256xad787d71(com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27454x3a51e83e c27454x3a51e83e) {
        this.f60045xf6ea486f = c27454x3a51e83e;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27424xe3f1263e m115247x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27424xe3f1263e mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27424xe3f1263e) super.mo11468x92b714fd(bArr);
    }
}
