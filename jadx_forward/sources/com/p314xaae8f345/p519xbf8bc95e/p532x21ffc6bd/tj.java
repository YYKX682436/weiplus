package com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd;

/* loaded from: classes13.dex */
public final class tj extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    static final int f133176a = 0;

    /* renamed from: b, reason: collision with root package name */
    static final int f133177b = 1;

    /* renamed from: c, reason: collision with root package name */
    static final int f133178c = 2;

    /* renamed from: d, reason: collision with root package name */
    private final com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr f133179d;

    public tj(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar, android.os.Looper looper) {
        super(looper);
        this.f133179d = trVar;
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.a(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.X, trVar.f130551f);
    }

    @Override // android.os.Handler
    public final void handleMessage(android.os.Message message) {
        M m17;
        com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26015xa89e978e a17;
        super.handleMessage(message);
        com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.tr trVar = this.f133179d;
        if (trVar == null || (m17 = trVar.e_) == 0 || !((com.p314xaae8f345.p519xbf8bc95e.p541xcf19e143.C4430xc2040f9) m17).a() || (a17 = trVar.a()) == null) {
            return;
        }
        if (message.what == 2) {
            trVar.am();
            com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.lb.c(com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.la.X, trVar.f130551f);
        }
        int i17 = message.what;
        if (i17 == 0) {
            trVar.mo36952x21a09eb4(a17);
        } else if (i17 == 1) {
            trVar.f133803ap = true;
            com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.p2990x633fb29.C26086x3c4a5e4 c26086x3c4a5e4 = trVar.f133798ak;
            if (c26086x3c4a5e4 != null && trVar.f133799al) {
                c26086x3c4a5e4.mo99979x348be498();
            }
            trVar.mo36953xd9f3cf46(a17);
        }
        trVar.ag();
    }
}
