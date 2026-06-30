package com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7;

/* renamed from: com.tencent.thumbplayer.tmediacodec.pools.CodecWrapperPool */
/* loaded from: classes14.dex */
public final class C26502x27b62179 implements com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7.InterfaceC26504x260c3c<com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c> {
    public static final java.lang.String TAG = "CodecWrapperPool";

    /* renamed from: mActionCallback */
    private com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7.InterfaceC26505xdd2c2bf7 f54156x18a7668;

    /* renamed from: mCapacity */
    private final int f54157x20f2bc47;

    /* renamed from: mName */
    private final java.lang.String f54158x624f098;

    /* renamed from: storeSet */
    private final java.util.concurrent.CopyOnWriteArraySet<com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411> f54159x665993c1 = new java.util.concurrent.CopyOnWriteArraySet<>();

    public C26502x27b62179(int i17, java.lang.String str) {
        this.f54157x20f2bc47 = i17;
        this.f54158x624f098 = str;
    }

    /* renamed from: getFirstCodecWrapper */
    private com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411 m103454xf62b0db7() {
        java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411> it = this.f54159x665993c1.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    /* renamed from: getRemoveItem */
    private com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411 m103455x2fb6bdad(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411 abstractC26494xe34e9411) {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411 m103457x4064f8e2;
        return (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.C26484x826be92b.m103296x9cf0d20b().m103307x63bd5790().f54203x9676d300 != com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26510xed50b8a6.EraseType.SAME || (m103457x4064f8e2 = m103457x4064f8e2(abstractC26494xe34e9411, this.f54159x665993c1.iterator())) == null) ? m103454xf62b0db7() : m103457x4064f8e2;
    }

    /* renamed from: pickSuitableCodecWrapper */
    private final com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411 m103456xec1644e5(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c c26493xe13fc07c) {
        java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411> it = this.f54159x665993c1.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411 next = it.next();
            if (!next.f54117x7dcc7fc8 && next.mo103361xf7b91884(c26493xe13fc07c) != com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3066x6762674.C26509xdf1d2322.ReuseType.KEEP_CODEC_RESULT_NO) {
                return next;
            }
            next.m103424xd8193525();
            if (next.m103421x8b2ac375()) {
                mo103462xc84af884(next);
            }
        }
        return null;
    }

    /* renamed from: replaceSameTypeCodec */
    private com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411 m103457x4064f8e2(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411 abstractC26494xe34e9411, java.util.Iterator it) {
        while (it.hasNext()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411 abstractC26494xe34e94112 = (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411) it.next();
            if (android.text.TextUtils.equals(abstractC26494xe34e9411.m103417xbc67750b(), abstractC26494xe34e94112.m103417xbc67750b())) {
                return abstractC26494xe34e94112;
            }
        }
        return null;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7.InterfaceC26504x260c3c
    /* renamed from: clear */
    public void mo103458x5a5b64d() {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.i(TAG, "CodecWrapperPool clear:" + this.f54159x665993c1);
        java.util.Iterator<com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411> it = this.f54159x665993c1.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411 next = it.next();
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7.InterfaceC26505xdd2c2bf7 interfaceC26505xdd2c2bf7 = this.f54156x18a7668;
            if (interfaceC26505xdd2c2bf7 != null) {
                interfaceC26505xdd2c2bf7.mo103453xaf8a6807(next);
            }
        }
        this.f54159x665993c1.clear();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7.InterfaceC26504x260c3c
    /* renamed from: isEmpty */
    public boolean mo103459x7aab3243() {
        return this.f54159x665993c1.isEmpty();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7.InterfaceC26504x260c3c
    /* renamed from: isFull */
    public boolean mo103460xb9a2fed9() {
        return this.f54159x665993c1.size() == this.f54157x20f2bc47;
    }

    /* renamed from: setActionCallback */
    public final void m103463xb165a19d(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7.InterfaceC26505xdd2c2bf7 interfaceC26505xdd2c2bf7) {
        this.f54156x18a7668 = interfaceC26505xdd2c2bf7;
    }

    /* renamed from: toString */
    public java.lang.String m103464x9616526c() {
        return "size:" + this.f54159x665993c1.size() + " elements:" + this.f54159x665993c1;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7.InterfaceC26504x260c3c
    /* renamed from: obtain, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411 mo103461xc30520a5(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c c26493xe13fc07c) {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411 m103456xec1644e5 = m103456xec1644e5(c26493xe13fc07c);
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(TAG, "obtain codecWrapper:" + m103456xec1644e5);
        }
        if (m103456xec1644e5 == null) {
            return null;
        }
        this.f54159x665993c1.remove(m103456xec1644e5);
        return m103456xec1644e5;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7.InterfaceC26504x260c3c
    public void put(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411 abstractC26494xe34e9411) {
        if (mo103460xb9a2fed9()) {
            mo103462xc84af884(m103455x2fb6bdad(abstractC26494xe34e9411));
        }
        this.f54159x665993c1.add(abstractC26494xe34e9411);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7.InterfaceC26504x260c3c
    /* renamed from: remove, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo103462xc84af884(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411 abstractC26494xe34e9411) {
        if (this.f54159x665993c1.remove(abstractC26494xe34e9411)) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7.InterfaceC26505xdd2c2bf7 interfaceC26505xdd2c2bf7 = this.f54156x18a7668;
            if (interfaceC26505xdd2c2bf7 != null) {
                interfaceC26505xdd2c2bf7.mo103453xaf8a6807(abstractC26494xe34e9411);
                return;
            }
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.w(TAG, "pool:" + this.f54158x624f098 + " remove " + abstractC26494xe34e9411 + " not found");
    }
}
