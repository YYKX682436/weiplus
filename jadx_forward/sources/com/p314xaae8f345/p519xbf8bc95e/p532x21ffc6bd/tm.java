package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class tm implements com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ba {

    /* renamed from: a, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr f133686a;

    public tm(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar) {
        this.f133686a = trVar;
    }

    @Override // com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.ba
    public final void a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.v vVar) {
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133686a;
        if (trVar == null) {
            return;
        }
        if (vVar != null) {
            trVar.a(((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) trVar.e_).f134045o.f132053t.a());
        }
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar2 = this.f133686a;
        android.os.Handler handler = trVar2.f133742x;
        if (handler == null || !handler.getLooper().getThread().isAlive()) {
            return;
        }
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e a17 = trVar2.a();
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e c26015xa89e978e = trVar2.f133743y;
        if (c26015xa89e978e == null || !c26015xa89e978e.m99379xb2c87fbf(a17)) {
            trVar2.f133742x.sendEmptyMessage(0);
            trVar2.f133743y = a17;
        }
    }
}
