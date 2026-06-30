package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1483xac8f1cfd;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/component/LuckyMoneyResultReceiev;", "Landroid/os/ResultReceiver;", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.component.LuckyMoneyResultReceiev */
/* loaded from: classes3.dex */
public final class ResultReceiverC14188xdcc3e210 extends android.os.ResultReceiver {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f193097d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.ref.WeakReference f193098e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.ref.WeakReference f193099f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ResultReceiverC14188xdcc3e210(te2.c4 presenter, android.os.Handler handler) {
        super(handler);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(presenter, "presenter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        this.f193097d = "LuckyMoneyResultReceiev";
        this.f193098e = new java.lang.ref.WeakReference(presenter);
    }

    @Override // android.os.ResultReceiver
    public void onReceiveResult(int i17, android.os.Bundle bundle) {
        super.onReceiveResult(i17, bundle);
        te2.c4 c4Var = (te2.c4) this.f193098e.get();
        java.lang.ref.WeakReference weakReference = this.f193099f;
        te2.z3 z3Var = weakReference != null ? (te2.z3) weakReference.get() : null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f193097d, "openLuckyMoney presenter:" + c4Var + ",LuckyMoneyShowInfo:" + z3Var + ", result:" + i17);
        if (c4Var == null || z3Var == null) {
            return;
        }
        if (i17 != -1) {
            if (i17 != 1) {
                return;
            }
            c4Var.h(z3Var);
            return;
        }
        qo0.c cVar = c4Var.f499454e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 k0Var = cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0) cVar : null;
        java.lang.Object context = k0Var != null ? k0Var.getContext() : null;
        gk2.e eVar = c4Var.f499453d;
        pq5.g l17 = new ek2.v2(((mm2.e1) eVar.a(mm2.e1.class)).f410521r.m75942xfb822ef2(0), ((mm2.e1) eVar.a(mm2.e1.class)).f410516m, ((mm2.e1) eVar.a(mm2.e1.class)).f410525v, ((mm2.e1) eVar.a(mm2.e1.class)).f410518o, z3Var.f500089a.m75945x2fec8307(0)).l();
        if (context != null && (context instanceof com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf)) {
            l17.f((im5.b) context);
        }
        c4Var.h(z3Var);
    }
}
