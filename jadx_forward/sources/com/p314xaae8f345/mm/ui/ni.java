package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class ni implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f290958d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.oi f290959e;

    public ni(com.p314xaae8f345.mm.ui.oi oiVar, boolean z17) {
        this.f290959e = oiVar;
        this.f290958d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f290959e.f291011a.f278613q.f373357a = java.lang.Boolean.valueOf(this.f290958d);
        this.f290959e.f291011a.f278609m.edit().putBoolean("room_add_blacklist", this.f290958d).commit();
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f290959e.f291011a.f278603d).notifyDataSetChanged();
    }
}
