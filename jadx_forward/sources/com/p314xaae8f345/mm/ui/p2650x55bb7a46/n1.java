package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes11.dex */
public class n1 extends yb5.n {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b f283526d;

    public n1(com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b) {
        this.f283526d = abstractC21611x7536149b;
    }

    @Override // yb5.n
    public void a() {
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.AbstractC21611x7536149b abstractC21611x7536149b = this.f283526d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BaseChattingUIFragment", "[doDestroy] activity:%s isPreLoaded:%b", abstractC21611x7536149b.f279684e, java.lang.Boolean.valueOf(abstractC21611x7536149b.f279688i));
        if (abstractC21611x7536149b.J0(16) && !abstractC21611x7536149b.J0(8)) {
            throw new java.lang.RuntimeException(java.lang.String.format("[doDestroy] never doPause, activity:%s isPreLoaded:%b isForeground:%b isFinishing:%b isNeverCreate:%b", abstractC21611x7536149b.f279684e, java.lang.Boolean.valueOf(abstractC21611x7536149b.f279688i), java.lang.Boolean.valueOf(abstractC21611x7536149b.f279685f.f542247i), java.lang.Boolean.valueOf(abstractC21611x7536149b.m78397x697ca065()), java.lang.Boolean.valueOf(abstractC21611x7536149b.J0(2))));
        }
        yb5.d dVar = abstractC21611x7536149b.f279685f;
        dVar.f542247i = false;
        dVar.P(false);
        yb5.d dVar2 = abstractC21611x7536149b.f279685f;
        dVar2.f542261w = false;
        dVar2.V(false);
        abstractC21611x7536149b.f279693q = 0;
    }
}
