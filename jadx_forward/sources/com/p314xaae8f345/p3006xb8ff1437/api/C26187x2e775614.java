package com.p314xaae8f345.p3006xb8ff1437.api;

/* renamed from: com.tencent.thumbplayer.api.TPPlayerState */
/* loaded from: classes16.dex */
public class C26187x2e775614 {

    /* renamed from: COMPLETE */
    public static final int f50911xaeb2139 = 7;

    /* renamed from: ERROR */
    public static final int f50912x3f2d9e8 = 10;

    /* renamed from: IDLE */
    public static final int f50913x2237d4 = 1;

    /* renamed from: INDEX */
    public static final int f50914x42930b2 = 0;

    /* renamed from: INITIALIZED */
    public static final int f50915xc9e13ab4 = 2;

    /* renamed from: NS_STATES */
    private static final android.util.SparseArray<java.lang.String> f50916xeac1dbc;

    /* renamed from: PAUSE */
    public static final int f50917x4862dd6 = 6;

    /* renamed from: PREPARED */
    public static final int f50918xe261843d = 4;

    /* renamed from: PREPARING */
    public static final int f50919x69cf13e4 = 3;

    /* renamed from: RELEASED */
    public static final int f50920xdc9c93d = 11;

    /* renamed from: START */
    public static final int f50921x4b8cc42 = 5;

    /* renamed from: STOPPED */
    public static final int f50922xba7b1dad = 9;

    /* renamed from: STOPPING */
    public static final int f50923x94e8a874 = 8;

    /* renamed from: mStateChangeListener */
    private com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnStateChangeListener f50928x9dc559c8;

    /* renamed from: mCurState */
    private int f50924x459b61be = 1;

    /* renamed from: mPreState */
    private int f50927xd728f73b = 1;

    /* renamed from: mLastState */
    private int f50926xf20eb9ae = 1;

    /* renamed from: mInnerPlayState */
    private int f50925x31bc5d4 = 1;

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* renamed from: com.tencent.thumbplayer.api.TPPlayerState$STATE */
    /* loaded from: classes6.dex */
    public @interface STATE {
    }

    static {
        android.util.SparseArray<java.lang.String> sparseArray = new android.util.SparseArray<>();
        f50916xeac1dbc = sparseArray;
        sparseArray.put(1, "IDLE");
        sparseArray.put(2, "INITIALIZED");
        sparseArray.put(3, "PREPARING");
        sparseArray.put(4, "PREPARED");
        sparseArray.put(5, "START");
        sparseArray.put(6, "PAUSE");
        sparseArray.put(7, "COMPLETE");
        sparseArray.put(8, "STOPPING");
        sparseArray.put(9, "STOPPED");
        sparseArray.put(10, "ERROR");
        sparseArray.put(11, "RELEASED");
    }

    /* renamed from: changeState */
    public synchronized void m101143x9cb98ec1(int i17) {
        int i18 = this.f50924x459b61be;
        if (i18 != i17) {
            this.f50927xd728f73b = i18;
            this.f50924x459b61be = i17;
            com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnStateChangeListener iOnStateChangeListener = this.f50928x9dc559c8;
            if (iOnStateChangeListener != null) {
                iOnStateChangeListener.mo100410x4799dc42(i18, i17);
            }
        }
    }

    /* renamed from: innerPlayState */
    public synchronized int m101144xfc68bc07() {
        return this.f50925x31bc5d4;
    }

    public synchronized boolean is(int i17) {
        return this.f50924x459b61be == i17;
    }

    /* renamed from: lastState */
    public synchronized int m101145x77576f9b() {
        return this.f50926xf20eb9ae;
    }

    /* renamed from: preState */
    public synchronized int m101146xb22b4fae() {
        return this.f50927xd728f73b;
    }

    /* renamed from: setInnerPlayStateState */
    public synchronized void m101147xadb2108(int i17) {
        if (this.f50925x31bc5d4 != i17) {
            this.f50925x31bc5d4 = i17;
        }
    }

    /* renamed from: setLastState */
    public synchronized void m101148xd318a159(int i17) {
        if (this.f50926xf20eb9ae != i17) {
            this.f50926xf20eb9ae = i17;
        }
    }

    /* renamed from: setOnPlayerStateChangeListener */
    public void m101149xa23b7bf3(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3008xc53e9ae1.C26140x8d94158b.IOnStateChangeListener iOnStateChangeListener) {
        this.f50928x9dc559c8 = iOnStateChangeListener;
    }

    /* renamed from: state */
    public synchronized int m101150x68ac491() {
        return this.f50924x459b61be;
    }

    /* renamed from: toString */
    public synchronized java.lang.String m101151x9616526c() {
        android.util.SparseArray<java.lang.String> sparseArray;
        sparseArray = f50916xeac1dbc;
        return "state[ cur : " + sparseArray.get(this.f50924x459b61be) + " , pre : " + sparseArray.get(this.f50927xd728f73b) + " , last : " + sparseArray.get(this.f50926xf20eb9ae) + " , inner play : " + sparseArray.get(this.f50925x31bc5d4) + " ]";
    }
}
