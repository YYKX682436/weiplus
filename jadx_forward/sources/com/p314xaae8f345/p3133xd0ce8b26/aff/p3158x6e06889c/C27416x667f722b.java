package com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c;

/* renamed from: com.tencent.wechat.aff.newlife.FinderObjectAsyncLoadInfo */
/* loaded from: classes2.dex */
public class C27416x667f722b extends com.p314xaae8f345.mm.p2495xc50a8b8b.f {

    /* renamed from: DEFAULT_INSTANCE */
    private static final com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27416x667f722b f59973xb3e828f3 = new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27416x667f722b();

    /* renamed from: object_id */
    public long f59975xa736921b = 0;

    /* renamed from: feed_jump_info */
    public java.util.LinkedList<com.p314xaae8f345.mm.p2495xc50a8b8b.g> f59974x1a8e88be = new java.util.LinkedList<>();

    /* renamed from: create */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27416x667f722b m114931xaf65a0fc() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27416x667f722b();
    }

    /* renamed from: getDefaultInstance */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27416x667f722b m114932x7c90cfc0() {
        return f59973xb3e828f3;
    }

    /* renamed from: newBuilder */
    public static com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27416x667f722b m114933x3136c9db() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27416x667f722b();
    }

    /* renamed from: addAllElementFeedJumpInfo */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27416x667f722b m114934x9affb176(java.util.Collection<com.p314xaae8f345.mm.p2495xc50a8b8b.g> collection) {
        this.f59974x1a8e88be.addAll(collection);
        return this;
    }

    /* renamed from: addAllElementFeed_jump_info */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27416x667f722b m114935x6700697a(java.util.Collection<com.p314xaae8f345.mm.p2495xc50a8b8b.g> collection) {
        this.f59974x1a8e88be.addAll(collection);
        return this;
    }

    /* renamed from: addElementFeedJumpInfo */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27416x667f722b m114936x4797cc75(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59974x1a8e88be.add(gVar);
        return this;
    }

    /* renamed from: addElementFeed_jump_info */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27416x667f722b m114937x4dfdc0b9(com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar) {
        this.f59974x1a8e88be.add(gVar);
        return this;
    }

    /* renamed from: build */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27416x667f722b m114938x59bc66e() {
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: compareContent */
    public boolean mo516x5c5a33d4(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        if (fVar == null || !(fVar instanceof com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27416x667f722b)) {
            return false;
        }
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27416x667f722b c27416x667f722b = (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27416x667f722b) fVar;
        return n51.f.a(java.lang.Long.valueOf(this.f59975xa736921b), java.lang.Long.valueOf(c27416x667f722b.f59975xa736921b)) && n51.f.a(this.f59974x1a8e88be, c27416x667f722b.f59974x1a8e88be);
    }

    /* renamed from: getFeedJumpInfo */
    public java.util.LinkedList<com.p314xaae8f345.mm.p2495xc50a8b8b.g> m114939x70476430() {
        return this.f59974x1a8e88be;
    }

    /* renamed from: getFeed_jump_info */
    public java.util.LinkedList<com.p314xaae8f345.mm.p2495xc50a8b8b.g> m114940x92655b4() {
        return this.f59974x1a8e88be;
    }

    /* renamed from: getObjectId */
    public long m114941x813f1630() {
        return this.f59975xa736921b;
    }

    /* renamed from: getObject_id */
    public long m114942xa6a40365() {
        return this.f59975xa736921b;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27416x667f722b m114943x60f45402(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar) {
        mo11468x92b714fd(fVar.m75960xfb7e5820());
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: newInstance */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11467x6bff0255() {
        return new com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27416x667f722b();
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    public final int op(int i17, java.lang.Object... objArr) {
        if (i17 == 0) {
            g36.f fVar = (g36.f) objArr[0];
            fVar.h(1, this.f59975xa736921b);
            fVar.g(12, 6, this.f59974x1a8e88be);
            return 0;
        }
        if (i17 == 1) {
            return b36.f.h(1, this.f59975xa736921b) + 0 + b36.f.g(12, 6, this.f59974x1a8e88be);
        }
        if (i17 == 2) {
            this.f59974x1a8e88be.clear();
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
            this.f59975xa736921b = aVar2.i(intValue);
            return 0;
        }
        if (intValue != 12) {
            return -1;
        }
        this.f59974x1a8e88be.add(aVar2.d(intValue));
        return 0;
    }

    /* renamed from: setFeedJumpInfo */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27416x667f722b m114945xa6905f3c(java.util.LinkedList<com.p314xaae8f345.mm.p2495xc50a8b8b.g> linkedList) {
        this.f59974x1a8e88be = linkedList;
        return this;
    }

    /* renamed from: setFeed_jump_info */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27416x667f722b m114946xd11cbdc0(java.util.LinkedList<com.p314xaae8f345.mm.p2495xc50a8b8b.g> linkedList) {
        this.f59974x1a8e88be = linkedList;
        return this;
    }

    /* renamed from: setObjectId */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27416x667f722b m114947x7bf7773c(long j17) {
        this.f59975xa736921b = j17;
        return this;
    }

    /* renamed from: setObject_id */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27416x667f722b m114948x2f7c3d9(long j17) {
        this.f59975xa736921b = j17;
        return this;
    }

    /* renamed from: mergeFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27416x667f722b m114944x60f45402(byte[] bArr) {
        mo11468x92b714fd(bArr);
        return this;
    }

    @Override // com.p314xaae8f345.mm.p2495xc50a8b8b.f
    /* renamed from: parseFrom */
    public com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27416x667f722b mo11468x92b714fd(byte[] bArr) {
        return (com.p314xaae8f345.p3133xd0ce8b26.aff.p3158x6e06889c.C27416x667f722b) super.mo11468x92b714fd(bArr);
    }
}
