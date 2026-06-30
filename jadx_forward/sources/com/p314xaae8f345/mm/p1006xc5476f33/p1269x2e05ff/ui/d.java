package com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui;

/* loaded from: classes14.dex */
public class d implements mp1.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n f174816a;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar) {
        this.f174816a = nVar;
    }

    @Override // mp1.e
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c12886x91aa2b6d);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/ui/FloatBallContainer$2", "com/tencent/mm/plugin/ball/listener/OnFloatMenuViewListener", "onFloatMenuItemClicked", "(Lcom/tencent/mm/plugin/ball/model/BallInfo;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", "onFloatMenuItemClicked");
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = this.f174816a;
        nVar.f174861m.a(3);
        nVar.f174852d.c(new com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.c(this, c12886x91aa2b6d));
        yj0.a.h(this, "com/tencent/mm/plugin/ball/ui/FloatBallContainer$2", "com/tencent/mm/plugin/ball/listener/OnFloatMenuViewListener", "onFloatMenuItemClicked", "(Lcom/tencent/mm/plugin/ball/model/BallInfo;)V");
    }

    @Override // mp1.e
    public void b(com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.p1273x633fb29.C12886x91aa2b6d c12886x91aa2b6d, int i17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c12886x91aa2b6d);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/ball/ui/FloatBallContainer$2", "com/tencent/mm/plugin/ball/listener/OnFloatMenuViewListener", "onFloatMenuItemRemoved", "(Lcom/tencent/mm/plugin/ball/model/BallInfo;I)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FloatBallContainer", "onFloatMenuItemRemoved");
        c12886x91aa2b6d.M.f174623m = 9;
        com.p314xaae8f345.mm.p1006xc5476f33.p1269x2e05ff.ui.n nVar = this.f174816a;
        nVar.f174850b.U(c12886x91aa2b6d);
        if (!c12886x91aa2b6d.I && nVar.f174863o) {
            nVar.f174861m.a(4);
            nVar.f174852d.m54204x3fd48dc4(true);
            nVar.i();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/ball/ui/FloatBallContainer$2", "com/tencent/mm/plugin/ball/listener/OnFloatMenuViewListener", "onFloatMenuItemRemoved", "(Lcom/tencent/mm/plugin/ball/model/BallInfo;I)V");
    }
}
