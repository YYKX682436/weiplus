package com.p314xaae8f345.mm.p1006xc5476f33.p2023xe5c27cfa.ui.uic;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/repairer/ui/uic/RepairerUicStateDemo;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "ui-repairer_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.repairer.ui.uic.RepairerUicStateDemo */
/* loaded from: classes10.dex */
public final class ActivityC17183xd4e8a8bf extends com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf {
    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.cga;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        return kz5.z.D0(new java.lang.Class[]{ix3.v5.class, ix3.x5.class});
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        pf5.z zVar = pf5.z.f435481a;
        ix3.u5 uicState = ((ix3.v5) zVar.a(this).a(ix3.v5.class)).f377124d;
        ix3.w5 uicState2 = (ix3.w5) ((pf5.d) zVar.a(this).c(ix3.a.class)).h6();
        sf5.l lVar = new sf5.l();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uicState, "uicState");
        java.util.LinkedList linkedList = lVar.f489179a;
        linkedList.add(uicState);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uicState2, "uicState");
        linkedList.add(uicState2);
        sf5.k kVar = new sf5.k(lVar);
        kVar.f489178c = ix3.i4.f376982d;
        kVar.f489177b = ix3.j4.f377001d;
        p3325xe03a0797.p3326xc267989b.p3328x30012e.i2 a17 = kVar.a(getLifecycleAsyncScope(), 1);
        sf5.l lVar2 = new sf5.l();
        java.util.LinkedList linkedList2 = lVar2.f489179a;
        linkedList2.add(uicState);
        linkedList2.add(uicState2);
        sf5.k kVar2 = new sf5.k(lVar2);
        kVar2.f489178c = ix3.k4.f377007d;
        kVar2.f489177b = ix3.l4.f377023d;
        p3325xe03a0797.p3326xc267989b.y0 lifecycleScope = getLifecycleAsyncScope();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(lifecycleScope, "lifecycleScope");
        kVar2.f489171a.getClass();
        p3325xe03a0797.p3326xc267989b.p3328x30012e.j2 a18 = p3325xe03a0797.p3326xc267989b.p3328x30012e.i3.a(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82);
        p3325xe03a0797.p3326xc267989b.l.d(lifecycleScope, null, null, new sf5.g(kVar2, a18, null), 3, null);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stateTransform2.init=");
        p3325xe03a0797.p3326xc267989b.p3328x30012e.h3 h3Var = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) a18;
        sb6.append((java.lang.String) h3Var.mo144003x754a37bb());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("RepairerUicStateDemo", sb6.toString());
        p012xc85e97e9.p093xedfae76a.c1 a19 = zVar.a(this).a(um3.b.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a19, "get(...)");
        pf5.e.m158343xd39de650((pf5.e) a19, null, null, new ix3.f4(a17, h3Var, null), 3, null);
        findViewById(com.p314xaae8f345.mm.R.id.o2t).setOnClickListener(new ix3.g4(uicState));
        findViewById(com.p314xaae8f345.mm.R.id.b5d).setOnClickListener(new ix3.h4(this));
    }
}
