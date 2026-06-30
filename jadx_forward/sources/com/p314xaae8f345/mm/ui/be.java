package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class be implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f279412d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f279413e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21407xddef161a f279414f;

    public be(com.p314xaae8f345.mm.ui.C21407xddef161a c21407xddef161a, java.lang.String str, int i17) {
        this.f279414f = c21407xddef161a;
        this.f279412d = str;
        this.f279413e = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.C21407xddef161a c21407xddef161a = this.f279414f;
        c21407xddef161a.f278448f.setText(this.f279412d);
        c21407xddef161a.f278448f.setBackgroundResource(this.f279413e);
        c21407xddef161a.m78771x330196a5();
        la5.b.f399133a.d(c21407xddef161a, c21407xddef161a.m78770xfb85ada3(), c21407xddef161a.m78771x330196a5(), c21407xddef161a.f278449g);
    }
}
