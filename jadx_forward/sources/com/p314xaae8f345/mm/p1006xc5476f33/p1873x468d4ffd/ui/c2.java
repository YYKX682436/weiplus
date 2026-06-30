package com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui;

/* loaded from: classes10.dex */
public class c2 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.e2 f230833d;

    public c2(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.e2 e2Var) {
        this.f230833d = e2Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.a4
    /* renamed from: onTimerExpired */
    public boolean mo322xdd48fb9f() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.e2 e2Var = this.f230833d;
        long j17 = e2Var.f230849d;
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        float elapsedRealtime = ((((float) (android.os.SystemClock.elapsedRealtime() - j17)) / e2Var.f230851f) * 100.0f) + e2Var.f230847b;
        e2Var.f230850e = elapsedRealtime;
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.d2 d2Var = e2Var.f230853h;
        if (d2Var != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.w wVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.w) d2Var;
            if (elapsedRealtime <= 100.0f) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.C16550xff5236a c16550xff5236a = wVar.f230971a;
                c16550xff5236a.f230716q = elapsedRealtime;
                if (c16550xff5236a.f230723x != null) {
                    java.util.ArrayList arrayList = c16550xff5236a.f230725z;
                    arrayList.clear();
                    arrayList.addAll(c16550xff5236a.f230724y);
                    arrayList.add(java.lang.Float.valueOf(c16550xff5236a.f230716q));
                    c16550xff5236a.f230723x.b(arrayList);
                }
                c16550xff5236a.invalidate();
            }
        }
        if (!e2Var.f230852g) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProgressHandlerAnimator", "isStart is false now");
            return false;
        }
        float f17 = e2Var.f230850e;
        if (f17 < e2Var.f230848c) {
            return true;
        }
        e2Var.f230852g = false;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProgressHandlerAnimator", "reach end, currentValue: %s, end: %s, callback: %s", java.lang.Float.valueOf(f17), java.lang.Float.valueOf(e2Var.f230848c), e2Var.f230853h);
        com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.d2 d2Var2 = e2Var.f230853h;
        if (d2Var2 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.w wVar2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.w) d2Var2;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMSightCircularProgressBar", "onAnimationEnd %b", java.lang.Boolean.valueOf(wVar2.f230971a.A));
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.ui.v(wVar2));
        }
        return false;
    }
}
