package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class li implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.mi f290615d;

    public li(com.p314xaae8f345.mm.ui.mi miVar) {
        this.f290615d = miVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ik1.b0 b0Var = this.f290615d.f290678a.f278613q;
        if (b0Var != null && b0Var.f373357a != null) {
            this.f290615d.f290678a.f278609m.edit().putBoolean("room_add_blacklist", ((java.lang.Boolean) this.f290615d.f290678a.f278613q.f373357a).booleanValue()).commit();
        }
        ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f290615d.f290678a.f278603d).notifyDataSetChanged();
    }
}
