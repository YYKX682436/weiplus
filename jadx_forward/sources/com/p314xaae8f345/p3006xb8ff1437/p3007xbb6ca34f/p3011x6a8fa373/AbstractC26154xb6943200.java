package com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373;

/* renamed from: com.tencent.thumbplayer.adapter.strategy.TPBaseStrategy */
/* loaded from: classes16.dex */
public abstract class AbstractC26154xb6943200 implements com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.InterfaceC26153x611ccf18 {

    /* renamed from: tpStrategyConfig */
    protected com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3012x633fb29.C26158xb3cf3e31 f50263x21784231;

    public AbstractC26154xb6943200(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3012x633fb29.C26158xb3cf3e31 c26158xb3cf3e31) {
        this.f50263x21784231 = c26158xb3cf3e31;
    }

    /* renamed from: checkNeedDoRetry */
    public boolean mo100808xedda6d3f(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3012x633fb29.C26159xc61ed8a0 c26159xc61ed8a0) {
        return false;
    }

    /* renamed from: isSystemPlayerEnable */
    public boolean m100809xd940ca5d(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 c26130x49ae05) {
        if (com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26162x6ccbbe2.m100895x754755bf()) {
            return true;
        }
        return com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26162x6ccbbe2.m100894xd940ca5d() && com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26162x6ccbbe2.m100890x2e2f431e(c26130x49ae05);
    }

    /* renamed from: isThumbPlayerEnable */
    public boolean m100810x30cb20b0(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 c26130x49ae05) {
        return com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26162x6ccbbe2.m100895x754755bf() ? com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26162x6ccbbe2.m100896x30cb20b0() : com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26162x6ccbbe2.m100896x30cb20b0() && com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26162x6ccbbe2.m100891x9833969(c26130x49ae05);
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.InterfaceC26153x611ccf18
    /* renamed from: strategyForDec */
    public int[] mo100805xdc3a4bcc() {
        int m100816x2906b05f = this.f50263x21784231.m100816x2906b05f();
        if (m100816x2906b05f == 0) {
            return new int[]{102, 101};
        }
        if (m100816x2906b05f == 1) {
            return new int[]{102};
        }
        if (m100816x2906b05f == 2) {
            return new int[]{102, 101};
        }
        if (m100816x2906b05f == 3) {
            return new int[]{101};
        }
        if (m100816x2906b05f != 4) {
            return null;
        }
        return new int[]{101, 102};
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.InterfaceC26153x611ccf18
    /* renamed from: strategyForOpen */
    public int mo100806xab1457c0(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 c26130x49ae05) {
        int m100818x7f2bfe6a = this.f50263x21784231.m100818x7f2bfe6a();
        if (m100818x7f2bfe6a == 0) {
            if (m100810x30cb20b0(c26130x49ae05)) {
                return 2;
            }
            return com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26162x6ccbbe2.m100894xd940ca5d() ? 1 : 0;
        }
        if (m100818x7f2bfe6a == 1) {
            return m100810x30cb20b0(c26130x49ae05) ? 2 : 0;
        }
        if (m100818x7f2bfe6a == 2) {
            if (m100810x30cb20b0(c26130x49ae05)) {
                return 2;
            }
            return com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26162x6ccbbe2.m100894xd940ca5d() ? 1 : 0;
        }
        if (m100818x7f2bfe6a == 3) {
            return m100809xd940ca5d(c26130x49ae05) ? 1 : 0;
        }
        if (m100818x7f2bfe6a != 4) {
            return 0;
        }
        if (m100809xd940ca5d(c26130x49ae05)) {
            return 1;
        }
        return com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3013x6a710b1.C26162x6ccbbe2.m100896x30cb20b0() ? 2 : 0;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.InterfaceC26153x611ccf18
    /* renamed from: strategyForRetry */
    public int mo100807xb79c1ff2(com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.C26130x49ae05 c26130x49ae05, com.p314xaae8f345.p3006xb8ff1437.p3007xbb6ca34f.p3011x6a8fa373.p3012x633fb29.C26159xc61ed8a0 c26159xc61ed8a0) {
        int m100818x7f2bfe6a = this.f50263x21784231.m100818x7f2bfe6a();
        if (c26159xc61ed8a0 != null && c26159xc61ed8a0.m100823x6b2cfdb1() == 0) {
            return mo100806xab1457c0(c26130x49ae05);
        }
        if (!mo100808xedda6d3f(c26159xc61ed8a0)) {
            return 0;
        }
        if (m100818x7f2bfe6a != 0) {
            return m100818x7f2bfe6a != 2 ? (m100818x7f2bfe6a == 4 && c26159xc61ed8a0 != null && c26159xc61ed8a0.m100823x6b2cfdb1() == 1 && m100810x30cb20b0(c26130x49ae05)) ? 2 : 0 : (c26159xc61ed8a0 != null && c26159xc61ed8a0.m100823x6b2cfdb1() == 2 && m100809xd940ca5d(c26130x49ae05)) ? 1 : 0;
        }
        if (c26159xc61ed8a0 != null && c26159xc61ed8a0.m100823x6b2cfdb1() == 1) {
            return m100810x30cb20b0(c26130x49ae05) ? 2 : 0;
        }
        if (c26159xc61ed8a0 != null && c26159xc61ed8a0.m100823x6b2cfdb1() == 2 && m100809xd940ca5d(c26130x49ae05)) {
            return 1;
        }
        return 0;
    }
}
