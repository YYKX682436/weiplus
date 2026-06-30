package ns4;

/* loaded from: classes8.dex */
public final class n0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ns4.p0 f421129d;

    public n0(ns4.p0 p0Var) {
        this.f421129d = p0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1534x373aa5.k0 Y0;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinCustomAmountInputDialog$bindAction$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ns4.p0 p0Var = this.f421129d;
        p0Var.a();
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = p0Var.f421146f;
        if (viewOnFocusChangeListenerC22907xe18534c2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("inputArea");
            throw null;
        }
        java.lang.String m83183xfb85ada3 = viewOnFocusChangeListenerC22907xe18534c2.m83183xfb85ada3();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m83183xfb85ada3, "getText(...)");
        long j17 = os4.h.j(m83183xfb85ada3, com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C27997xfdbbeb01.f62845xa1e463a0);
        ns4.s sVar = ((ns4.i) p0Var.f421142b.f421165c).f421076a;
        sVar.f421180l = true;
        js4.j jVar = sVar.f421181m;
        if (jVar != null) {
            jVar.a(sVar, java.lang.Boolean.FALSE);
        }
        js4.e eVar = sVar.f421182n;
        if (eVar != null && (Y0 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.yk) eVar).f196740a.Y0()) != null) {
            Y0.m57637x66268092();
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = sVar.f421171c;
        if (y1Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mBottomSheet");
            throw null;
        }
        y1Var.q();
        ((q30.k) ((r30.p) i95.n0.c(r30.p.class))).Ai();
        ms4.h hVar = sVar.f421173e;
        hVar.getClass();
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f context = sVar.f421169a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RechargeProductsDialogViewModel", "directRecharge, amount: " + j17);
        hVar.f412564g.mo7808x76db6cb1(java.lang.Boolean.TRUE);
        ms4.e eVar2 = new ms4.e(hVar);
        js4.n nVar = new js4.n();
        r45.js3 js3Var = (r45.js3) hVar.f412565h.mo3195x754a37bb();
        if (js3Var != null) {
            nVar.f383081f = js3Var.f459622h.f457525e.f459212d;
            nVar.f383080e = js3Var.f459621g;
        }
        nVar.f383083h = j17;
        nVar.f383076a = hVar.f412561d.f383076a;
        java.lang.String str = hVar.f412570p;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mSceneSessionID");
            throw null;
        }
        nVar.f383078c = str;
        nVar.f383079d = eVar2;
        nVar.f383082g = js4.m.DIRECT_CHARGE;
        ((ms4.z) ((js4.i) gm0.j1.s(js4.i.class))).d((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, nVar);
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinCustomAmountInputDialog$bindAction$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
