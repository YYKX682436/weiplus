package com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826;

/* renamed from: com.tencent.wechat.aff.finder.FinderObjectWrap */
/* loaded from: classes2.dex */
public class C27307xceb4510f extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f f59616xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f();

    /* renamed from: finder_object */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f59620xbcbcd178 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.f273688b;
    public java.lang.String tid = "";

    /* renamed from: commentScene */
    public bw5.os0 f59617x2ebb5d6d = bw5.os0.MMFinder_GetComment_Scene_NotKnown;

    /* renamed from: feed_source */
    public long f59619x330e91dc = 0;

    /* renamed from: func_flag */
    public int f59621xf675b007 = 0;

    /* renamed from: expired_time */
    public long f59618x55ae13a7 = 0;

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f m112790xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f m112791x7c90cfc0() {
        return f59616xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f m112792x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f();
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f m112793x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f c27307xceb4510f = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f) fVar;
        return n51.f.a(this.f59620xbcbcd178, c27307xceb4510f.f59620xbcbcd178) && n51.f.a(this.tid, c27307xceb4510f.tid) && n51.f.a(this.f59617x2ebb5d6d, c27307xceb4510f.f59617x2ebb5d6d) && n51.f.a(java.lang.Long.valueOf(this.f59619x330e91dc), java.lang.Long.valueOf(c27307xceb4510f.f59619x330e91dc)) && n51.f.a(java.lang.Integer.valueOf(this.f59621xf675b007), java.lang.Integer.valueOf(c27307xceb4510f.f59621xf675b007)) && n51.f.a(java.lang.Long.valueOf(this.f59618x55ae13a7), java.lang.Long.valueOf(c27307xceb4510f.f59618x55ae13a7));
    }

    /* renamed from: getCommentScene */
    public bw5.os0 m112794x8fadefe3() {
        return this.f59617x2ebb5d6d;
    }

    /* renamed from: getExpiredTime */
    public long m112795xd4529a5c() {
        return this.f59618x55ae13a7;
    }

    /* renamed from: getExpired_time */
    public long m112796xb6a0a61d() {
        return this.f59618x55ae13a7;
    }

    /* renamed from: getFeedSource */
    public long m112797xfc3ec34f() {
        return this.f59619x330e91dc;
    }

    /* renamed from: getFeed_source */
    public long m112798xce4d8a6() {
        return this.f59619x330e91dc;
    }

    /* renamed from: getFinderObject */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m112799x7c94657b() {
        return this.f59620xbcbcd178;
    }

    /* renamed from: getFinder_object */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g m112800x7a1c8dc2() {
        return this.f59620xbcbcd178;
    }

    /* renamed from: getFuncFlag */
    public int m112801xce14d1c6() {
        return this.f59621xf675b007;
    }

    /* renamed from: getFunc_flag */
    public int m112802xf5e32151() {
        return this.f59621xf675b007;
    }

    /* renamed from: getTid */
    public java.lang.String m112803xb5887159() {
        return this.tid;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f m112804x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f59620xbcbcd178;
            if (gVar != null) {
                fVar.b(1, gVar);
            }
            java.lang.String str = this.tid;
            if (str != null) {
                fVar.j(2, str);
            }
            fVar.e(3, this.f59617x2ebb5d6d.f112918d);
            fVar.h(4, this.f59619x330e91dc);
            fVar.e(5, this.f59621xf675b007);
            fVar.h(6, this.f59618x55ae13a7);
            return 0;
        }
        if (i17 == 1) {
            com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar2 = this.f59620xbcbcd178;
            int b17 = gVar2 != null ? 0 + b36.f.b(1, gVar2) : 0;
            java.lang.String str2 = this.tid;
            if (str2 != null) {
                b17 += b36.f.j(2, str2);
            }
            return b17 + b36.f.e(3, this.f59617x2ebb5d6d.f112918d) + b36.f.h(4, this.f59619x330e91dc) + b36.f.e(5, this.f59621xf675b007) + b36.f.h(6, this.f59618x55ae13a7);
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
        switch (intValue) {
            case 1:
                this.f59620xbcbcd178 = aVar2.d(intValue);
                return 0;
            case 2:
                this.tid = aVar2.k(intValue);
                return 0;
            case 3:
                this.f59617x2ebb5d6d = bw5.os0.i(aVar2.g(intValue));
                return 0;
            case 4:
                this.f59619x330e91dc = aVar2.i(intValue);
                return 0;
            case 5:
                this.f59621xf675b007 = aVar2.g(intValue);
                return 0;
            case 6:
                this.f59618x55ae13a7 = aVar2.i(intValue);
                return 0;
            default:
                return -1;
        }
    }

    /* renamed from: setCommentScene */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f m112806xc5f6eaef(bw5.os0 os0Var) {
        this.f59617x2ebb5d6d = os0Var;
        return this;
    }

    /* renamed from: setExpiredTime */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f m112807x6ab80dd0(long j17) {
        this.f59618x55ae13a7 = j17;
        return this;
    }

    /* renamed from: setExpired_time */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f m112808xece9a129(long j17) {
        this.f59618x55ae13a7 = j17;
        return this;
    }

    /* renamed from: setFeedSource */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f m112809x2a63115b(long j17) {
        this.f59619x330e91dc = j17;
        return this;
    }

    /* renamed from: setFeed_source */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f m112810xa34a4c1a(long j17) {
        this.f59619x330e91dc = j17;
        return this;
    }

    /* renamed from: setFinderObject */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f m112811xb2dd6087(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59620xbcbcd178 = gVar;
        return this;
    }

    /* renamed from: setFinder_object */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f m112812xcf2f436(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59620xbcbcd178 = gVar;
        return this;
    }

    /* renamed from: setFuncFlag */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f m112813xc8cd32d2(int i17) {
        this.f59621xf675b007 = i17;
        return this;
    }

    /* renamed from: setFunc_flag */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f m112814x5236e1c5(int i17) {
        this.f59621xf675b007 = i17;
        return this;
    }

    /* renamed from: setTid */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f m112815xca0298cd(java.lang.String str) {
        this.tid = str;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f m112805x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27307xceb4510f) super.mo11468x92b714fd(bArr);
    }
}
