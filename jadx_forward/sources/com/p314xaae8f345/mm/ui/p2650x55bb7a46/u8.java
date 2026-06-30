package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes5.dex */
public class u8 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f284271d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea f284272e;

    public u8(com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea) {
        this.f284272e = c21628xcedb13ea;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        sb5.s0 s0Var;
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.C19666xfd6e2f33 c19666xfd6e2f33;
        java.lang.String str = com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea.M;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.C21628xcedb13ea c21628xcedb13ea = this.f284272e;
        c21628xcedb13ea.getClass();
        if (motionEvent.getAction() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIFragment", "onTouch: touch down");
            this.f284271d = true;
        } else if (motionEvent.getAction() == 1) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ChattingUIFragment", "onTouch: touch up");
            this.f284271d = false;
        }
        if (this.f284271d && c21628xcedb13ea.D && (s0Var = (sb5.s0) c21628xcedb13ea.f279685f.f542241c.a(sb5.s0.class)) != null && (c19666xfd6e2f33 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.jb) s0Var).f280796e) != null) {
            c19666xfd6e2f33.w0(true);
        }
        return false;
    }
}
