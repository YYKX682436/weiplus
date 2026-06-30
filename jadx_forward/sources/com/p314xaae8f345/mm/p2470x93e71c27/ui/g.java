package com.p314xaae8f345.mm.p2470x93e71c27.ui;

/* loaded from: classes4.dex */
public class g implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e f272369d;

    public g(com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e abstractC19633xb84f839e) {
        this.f272369d = abstractC19633xb84f839e;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.AbstractC19633xb84f839e abstractC19633xb84f839e = this.f272369d;
        if (abstractC19633xb84f839e.C <= 0) {
            return false;
        }
        if (!abstractC19633xb84f839e.mo61531xc00617a4()) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(abstractC19633xb84f839e.f271272e, "%s reset error count ", abstractC19633xb84f839e.N());
        abstractC19633xb84f839e.C = 0;
        abstractC19633xb84f839e.H(600L, abstractC19633xb84f839e.mo48229xc9e6d95a() + 91, 1L, false);
        return false;
    }
}
