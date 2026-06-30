package sp2;

/* loaded from: classes2.dex */
public final class q1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.res.Configuration f492720d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sp2.o2 f492721e;

    public q1(android.content.res.Configuration configuration, sp2.o2 o2Var) {
        this.f492720d = configuration;
        this.f492721e = o2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onConfigurationChanged postDelayed orientation: ");
        sb6.append(this.f492720d.orientation);
        sb6.append(" rv: ");
        sp2.o2 o2Var = this.f492721e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14595xffb7e034 c14595xffb7e034 = o2Var.f492672j;
        if (c14595xffb7e034 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
            throw null;
        }
        sb6.append(c14595xffb7e034.getWidth());
        sb6.append(" ui: ");
        com.p314xaae8f345.mm.ui.ah a17 = com.p314xaae8f345.mm.ui.bh.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        java.lang.System.nanoTime();
        boolean z17 = com.p314xaae8f345.mm.ui.bk.y() || com.p314xaae8f345.mm.ui.bk.Q() || com.p314xaae8f345.mm.ui.bk.A();
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        int i18 = a17.f278668a;
        if (!z17 && i18 > (i17 = a17.f278669b)) {
            i18 = i17;
        }
        sb6.append(i18);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveEntranceFragmentViewCallback", sb6.toString());
        int i19 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
        if (i19 >= i65.a.b(o2Var.f492654a, 600)) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14595xffb7e034 c14595xffb7e0342 = o2Var.f492672j;
            if (c14595xffb7e0342 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            java.lang.Integer valueOf = java.lang.Integer.valueOf(c14595xffb7e0342.getWidth());
            java.lang.Integer num = valueOf.intValue() > 0 ? valueOf : null;
            if (num != null) {
                i19 = num.intValue();
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1585xbb6ca34f.p1586x3305b9.C14542xcd9688c0 c14542xcd9688c0 = o2Var.f492686q;
        if (c14542xcd9688c0 != null) {
            c14542xcd9688c0.m58414x213e8414(i19);
        }
        up2.h hVar = o2Var.f492684p;
        if (hVar != null) {
            hVar.f295250v.clear();
        }
        up2.h hVar2 = o2Var.f492684p;
        if (hVar2 != null) {
            hVar2.m8146xced61ae5();
        }
    }
}
