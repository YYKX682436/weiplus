package com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3012x633fb29;

/* renamed from: com.tencent.thumbplayer.adapter.strategy.model.TPStrategyConfig */
/* loaded from: classes16.dex */
public class C26158xb3cf3e31 {

    /* renamed from: decStrategy */
    int f50266x4f306995;

    /* renamed from: mIsExtPlayerList */
    boolean f50267x713fdee9;

    /* renamed from: mPlayerList */
    int[] f50268x591a5f6c;

    /* renamed from: playerStrategy */
    int f50269x90943174;

    public C26158xb3cf3e31(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26131x1fd6491d c26131x1fd6491d) {
        this.f50267x713fdee9 = false;
        this.f50266x4f306995 = 2;
        this.f50269x90943174 = 2;
        if (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26162x6ccbbe2.m100895x754755bf()) {
            this.f50269x90943174 = 4;
            this.f50266x4f306995 = 2;
        }
        if (c26131x1fd6491d == null) {
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 m100314xe432b557 = c26131x1fd6491d.m100314xe432b557(210);
        if (m100314xe432b557 != null && m100314xe432b557.m101078x73e47eb1() == 4) {
            this.f50268x591a5f6c = m100314xe432b557.m101075xbe427d15().f50736x72048ae0;
            this.f50267x713fdee9 = true;
            return;
        }
        com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 m100314xe432b5572 = c26131x1fd6491d.m100314xe432b557(202);
        if (m100314xe432b5572 != null && m100314xe432b5572.m101078x73e47eb1() == 2 && m100815x9761f278(m100314xe432b5572.m101073x73e0b5f3().f50734x6ac9171)) {
            this.f50269x90943174 = (int) m100314xe432b5572.m101073x73e0b5f3().f50734x6ac9171;
        }
        com.p314xaae8f345.p3006xb8ff1437.api.C26182x67c007f1 m100314xe432b5573 = c26131x1fd6491d.m100314xe432b557(203);
        if (m100314xe432b5573 != null && m100314xe432b5573.m101078x73e47eb1() == 2 && m100814x88bd9dcb(m100314xe432b5573.m101073x73e0b5f3().f50734x6ac9171)) {
            this.f50266x4f306995 = (int) m100314xe432b5573.m101073x73e0b5f3().f50734x6ac9171;
        }
        m100813xdfd1c6e8(this.f50269x90943174, this.f50266x4f306995);
    }

    /* renamed from: checkParamsIllegal */
    private void m100813xdfd1c6e8(int i17, int i18) {
        if (i17 == 3 && i18 == 3) {
            throw new java.lang.IllegalArgumentException("can not soft with systemplayer");
        }
    }

    /* renamed from: isDecStrategyVaild */
    private boolean m100814x88bd9dcb(long j17) {
        return j17 > 0 && j17 < 5;
    }

    /* renamed from: isPlayerStrategyVaild */
    private boolean m100815x9761f278(long j17) {
        return j17 > 0 && j17 < 5;
    }

    /* renamed from: getDecStrategy */
    public int m100816x2906b05f() {
        return this.f50266x4f306995;
    }

    /* renamed from: getPlayerList */
    public int[] m100817x6b291f15() {
        return this.f50268x591a5f6c;
    }

    /* renamed from: getPlayerStrategy */
    public int m100818x7f2bfe6a() {
        return this.f50269x90943174;
    }

    /* renamed from: isExtPlayerList */
    public boolean m100819xa191af16() {
        return this.f50267x713fdee9;
    }
}
