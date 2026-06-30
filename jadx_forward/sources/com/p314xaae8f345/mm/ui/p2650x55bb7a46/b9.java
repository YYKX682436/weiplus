package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes9.dex */
public class b9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f280029d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f280030e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f280031f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f280032g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea f280033h;

    public b9(com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea, boolean z17, int i17, int i18, boolean z18) {
        this.f280033h = c21628xcedb13ea;
        this.f280029d = z17;
        this.f280030e = i17;
        this.f280031f = i18;
        this.f280032g = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f280029d;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = this.f280033h;
        if (z17 && c21628xcedb13ea.B.A5()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIFragment", "scrollToLastImpl: isAtBottom in post");
        } else {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f7.b(c21628xcedb13ea.f279802t, this.f280030e - 1, -this.f280031f, this.f280032g, false);
        }
    }
}
