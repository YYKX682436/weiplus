package com.p314xaae8f345.mm.ui;

/* loaded from: classes8.dex */
public class k9 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f290570d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.C21392x1bd9268c f290571e;

    public k9(com.p314xaae8f345.mm.ui.C21392x1bd9268c c21392x1bd9268c, int i17) {
        this.f290571e = c21392x1bd9268c;
        this.f290570d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/LiveBizSessionTipsBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.ui.C21392x1bd9268c c21392x1bd9268c = this.f290571e;
        yb5.d dVar = c21392x1bd9268c.f278400e;
        if (dVar != null) {
            c21392x1bd9268c.f278401f = dVar.x();
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0 b0Var = com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270730a;
        java.lang.String e17 = b0Var.e(c21392x1bd9268c.f278401f);
        java.lang.String str = c21392x1bd9268c.f278401f;
        int o17 = str == null ? 0 : com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.b0.f270732c.o("live_scene-".concat(str), 0);
        int i17 = com.p314xaae8f345.mm.p2621x8fb0427b.c2.f275336a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.d(23044, 2, c21392x1bd9268c.f278401f, java.lang.Integer.valueOf(this.f290570d), java.lang.Integer.valueOf(i17), e17, java.lang.Integer.valueOf(o17), 0, "");
        b0Var.q(c21392x1bd9268c.f278400e.g(), c21392x1bd9268c.f278401f, e17, null, 4, o17, null, null, null, null, null, null, null);
        g0Var.d(15721, c21392x1bd9268c.f278401f, 0L, 26, java.lang.Integer.valueOf((int) (java.lang.System.currentTimeMillis() / 1000)), java.lang.Integer.valueOf(com.p314xaae8f345.mm.p2621x8fb0427b.c2.f275336a));
        yj0.a.h(this, "com/tencent/mm/ui/LiveBizSessionTipsBar$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
