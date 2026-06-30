package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.NewLifeFeedJumpInfo */
/* loaded from: classes8.dex */
public class C27441xb9eab076 extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076 f60171xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076();

    /* renamed from: feed_id */
    public java.lang.String f60172xc5d33f5c = "";

    /* renamed from: jump_infos */
    public java.util.LinkedList<com.p314xaae8f345.mm.p2495xc50a8b8b.g> f60173xf1612e34 = new java.util.LinkedList<>();

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076 m115777xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076 m115778x7c90cfc0() {
        return f60171xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076 m115779x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076();
    }

    /* renamed from: addAllElementJumpInfos */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076 m115780x3ff953bb(java.util.Collection<com.p314xaae8f345.mm.p2495xc50a8b8b.g> collection) {
        this.f60173xf1612e34.addAll(collection);
        return this;
    }

    /* renamed from: addAllElementJump_infos */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076 m115781xe478ccf0(java.util.Collection<com.p314xaae8f345.mm.p2495xc50a8b8b.g> collection) {
        this.f60173xf1612e34.addAll(collection);
        return this;
    }

    /* renamed from: addElementJumpInfos */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076 m115782xebc4311c(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f60173xf1612e34.add(gVar);
        return this;
    }

    /* renamed from: addElementJump_infos */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076 m115783xb2099baf(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f60173xf1612e34.add(gVar);
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076 m115784x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076 c27441xb9eab076 = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076) fVar;
        return n51.f.a(this.f60172xc5d33f5c, c27441xb9eab076.f60172xc5d33f5c) && n51.f.a(this.f60173xf1612e34, c27441xb9eab076.f60173xf1612e34);
    }

    /* renamed from: getFeedId */
    public java.lang.String m115785x18e4224f() {
        return this.f60172xc5d33f5c;
    }

    /* renamed from: getFeed_id */
    public java.lang.String m115786x3a07b26() {
        return this.f60172xc5d33f5c;
    }

    /* renamed from: getJumpInfos */
    public java.util.LinkedList<com.p314xaae8f345.mm.p2495xc50a8b8b.g> m115787x270b2b41() {
        return this.f60173xf1612e34;
    }

    /* renamed from: getJump_infos */
    public java.util.LinkedList<com.p314xaae8f345.mm.p2495xc50a8b8b.g> m115788xdfa1e62a() {
        return this.f60173xf1612e34;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076 m115789x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            java.lang.String str = this.f60172xc5d33f5c;
            if (str != null) {
                fVar.j(1, str);
            }
            fVar.g(2, 6, this.f60173xf1612e34);
            return 0;
        }
        if (i17 == 1) {
            java.lang.String str2 = this.f60172xc5d33f5c;
            return (str2 != null ? 0 + b36.f.j(1, str2) : 0) + b36.f.g(2, 6, this.f60173xf1612e34);
        }
        if (i17 == 2) {
            this.f60173xf1612e34.clear();
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
            this.f60172xc5d33f5c = aVar2.k(intValue);
            return 0;
        }
        if (intValue != 2) {
            return -1;
        }
        this.f60173xf1612e34.add(aVar2.d(intValue));
        return 0;
    }

    /* renamed from: setFeedId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076 m115791xc19565b(java.lang.String str) {
        this.f60172xc5d33f5c = str;
        return this;
    }

    /* renamed from: setFeed_id */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076 m115792x7711c89a(java.lang.String str) {
        this.f60172xc5d33f5c = str;
        return this;
    }

    /* renamed from: setJumpInfos */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076 m115793x835eebb5(java.util.LinkedList<com.p314xaae8f345.mm.p2495xc50a8b8b.g> linkedList) {
        this.f60173xf1612e34 = linkedList;
        return this;
    }

    /* renamed from: setJump_infos */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076 m115794xdc63436(java.util.LinkedList<com.p314xaae8f345.mm.p2495xc50a8b8b.g> linkedList) {
        this.f60173xf1612e34 = linkedList;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076 m115790x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076 mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27441xb9eab076) super.mo11468x92b714fd(bArr);
    }
}
