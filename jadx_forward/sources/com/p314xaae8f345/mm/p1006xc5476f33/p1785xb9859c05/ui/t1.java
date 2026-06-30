package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui;

/* loaded from: classes13.dex */
public class t1 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16135x36fae7ec f224543a;

    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16135x36fae7ec c16135x36fae7ec) {
        this.f224543a = c16135x36fae7ec;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        if (message.what != 1) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16135x36fae7ec c16135x36fae7ec = this.f224543a;
        double d17 = c16135x36fae7ec.f224143d;
        if ((d17 <= 0.0d || c16135x36fae7ec.f224145f >= c16135x36fae7ec.f224146g) && (d17 >= 0.0d || c16135x36fae7ec.f224145f <= c16135x36fae7ec.f224146g)) {
            c16135x36fae7ec.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16135x36fae7ec.a(c16135x36fae7ec, c16135x36fae7ec.f224146g);
            return;
        }
        c16135x36fae7ec.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.ui.C16135x36fae7ec.a(c16135x36fae7ec, c16135x36fae7ec.f224145f);
        c16135x36fae7ec.f224145f += c16135x36fae7ec.f224143d;
        c16135x36fae7ec.f224152p.mo50307xb9e94560(1, c16135x36fae7ec.f224148i);
    }
}
