package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes5.dex */
public class t1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f181206d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f181207e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.u1 f181208f;

    public t1(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.u1 u1Var, int i17, int i18) {
        this.f181208f = u1Var;
        this.f181206d = i17;
        this.f181207e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17 = this.f181207e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.u1 u1Var = this.f181208f;
        int i18 = this.f181206d;
        if (i18 == 0 && (i17 == 0 || i17 == 4)) {
            u1Var.f181220a.U6(2);
            return;
        }
        if (i17 != 4) {
            u1Var.f181220a.U6(4);
        } else if (i18 == 90000) {
            u1Var.f181220a.U6(3);
        } else {
            u1Var.f181220a.U6(5);
        }
    }
}
