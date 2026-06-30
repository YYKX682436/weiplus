package com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7;

/* renamed from: com.tencent.thumbplayer.tmediacodec.pools.CodecWrapperManager */
/* loaded from: classes14.dex */
public final class C26501x8d192d30 implements com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7.InterfaceC26503x91644c26 {
    public static final java.lang.String TAG = "CodecWrapperManager";

    /* renamed from: mKeepCodecPool */
    private final com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7.C26502x27b62179 f54151xe7b143e0;

    /* renamed from: mRunningCodecPool */
    private final com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7.C26502x27b62179 f54152xd408fce0;

    public C26501x8d192d30() {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7.C26502x27b62179 c26502x27b62179 = new com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7.C26502x27b62179(2, "keep");
        this.f54151xe7b143e0 = c26502x27b62179;
        this.f54152xd408fce0 = new com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7.C26502x27b62179(Integer.MAX_VALUE, "running");
        c26502x27b62179.m103463xb165a19d(new com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7.InterfaceC26505xdd2c2bf7() { // from class: com.tencent.thumbplayer.tmediacodec.pools.CodecWrapperManager.2
            @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7.InterfaceC26505xdd2c2bf7
            /* renamed from: onErase */
            public void mo103453xaf8a6807(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411 abstractC26494xe34e9411) {
                if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
                    com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7.C26501x8d192d30.TAG, "onErase codecWrapper:" + abstractC26494xe34e9411);
                }
                abstractC26494xe34e9411.m103422x408b7293();
            }
        });
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7.InterfaceC26503x91644c26
    /* renamed from: clearAndReleaseAll */
    public void mo103445xcedb1c04() {
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.i(TAG, "clearAndReleaseAll");
        }
        this.f54152xd408fce0.mo103458x5a5b64d();
        this.f54151xe7b143e0.mo103458x5a5b64d();
    }

    /* renamed from: clearAndReleaseKeepPool */
    public void m103446xa76850be() {
        this.f54151xe7b143e0.mo103458x5a5b64d();
    }

    /* renamed from: getDumpInfo */
    public final java.lang.String m103447xfd563638() {
        return "runningPool:" + this.f54152xd408fce0 + " keepPool:" + this.f54151xe7b143e0;
    }

    /* renamed from: isKeepPoolFull */
    public boolean m103448x30b2edba() {
        return this.f54151xe7b143e0.mo103460xb9a2fed9();
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7.InterfaceC26503x91644c26
    /* renamed from: obtainCodecWrapper */
    public com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411 mo103449xeb868ce2(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26493xe13fc07c c26493xe13fc07c) {
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411 mo103461xc30520a5 = this.f54151xe7b143e0.mo103461xc30520a5(c26493xe13fc07c);
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(TAG, "obtainCodecWrapper codecWrapper:" + mo103461xc30520a5);
        }
        return mo103461xc30520a5;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7.InterfaceC26503x91644c26
    /* renamed from: removeFromRunning */
    public void mo103450xd8b47791(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411 abstractC26494xe34e9411) {
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(TAG, "removeFromRunning codecWrapper:" + abstractC26494xe34e9411);
        }
        this.f54152xd408fce0.mo103462xc84af884(abstractC26494xe34e9411);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7.InterfaceC26503x91644c26
    /* renamed from: transToKeep */
    public void mo103451x6a083968(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411 abstractC26494xe34e9411) {
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(TAG, "transTokeep codecWrapper:" + abstractC26494xe34e9411);
        }
        this.f54152xd408fce0.mo103462xc84af884(abstractC26494xe34e9411);
        this.f54151xe7b143e0.put(abstractC26494xe34e9411);
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3060xf5bc2045.InterfaceC26486x9cae4e5b m103415x71965dbb = abstractC26494xe34e9411.m103415x71965dbb();
        if (m103415x71965dbb != null) {
            m103415x71965dbb.mo103359xfa0aa1c5();
        }
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3063x65e6bd7.InterfaceC26503x91644c26
    /* renamed from: transToRunning */
    public void mo103452xa12918fc(final com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.AbstractC26494xe34e9411 abstractC26494xe34e9411) {
        if (com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.m103513xa25a73dd()) {
            com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26513x7b544bed.d(TAG, "transToRunning codecWrapper:" + abstractC26494xe34e9411);
        }
        this.f54151xe7b143e0.mo103462xc84af884(abstractC26494xe34e9411);
        this.f54152xd408fce0.put(abstractC26494xe34e9411);
        com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3068x36f002.C26517x68dfca23.m103556x2c27b08b(new java.lang.Runnable() { // from class: com.tencent.thumbplayer.tmediacodec.pools.CodecWrapperManager.1
            @Override // java.lang.Runnable
            public void run() {
                com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3060xf5bc2045.InterfaceC26486x9cae4e5b m103415x71965dbb = abstractC26494xe34e9411.m103415x71965dbb();
                if (m103415x71965dbb != null) {
                    m103415x71965dbb.mo103360x8107f777();
                }
            }
        });
    }
}
