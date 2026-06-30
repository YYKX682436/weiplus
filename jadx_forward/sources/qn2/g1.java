package qn2;

/* loaded from: classes3.dex */
public final class g1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qn2.l1 f446600d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.ce0 f446601e;

    public g1(qn2.l1 l1Var, r45.ce0 ce0Var) {
        this.f446600d = l1Var;
        this.f446601e = ce0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget$setProductInfoIfNeeded$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        l81.b1 b1Var = new l81.b1();
        r45.ce0 ce0Var = this.f446601e;
        java.lang.String str2 = "";
        if (ce0Var == null || (str = ce0Var.m75945x2fec8307(0)) == null) {
            str = "";
        }
        b1Var.f398547b = str;
        if (ce0Var != null && (m75945x2fec8307 = ce0Var.m75945x2fec8307(1)) != null) {
            str2 = m75945x2fec8307;
        }
        b1Var.f398555f = str2;
        b1Var.f398565k = 1205;
        float f17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).y;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getConfiguration().orientation == 2) {
            f17 = com.p314xaae8f345.mm.ui.bl.b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a).x;
        }
        b1Var.G = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11816x5915d2c1(true, (int) ((ae2.in.f85221a.h0() / 100.0f) * f17), null, false, null, false, null, k91.t2.f387301f, true, false, null, null, true, false, null, false, 0, null, 0, 0, 0, false, false, false, null, false, null, 0, false, null, true, 0, false, true, false, false, null, null, null, false, null, null, false, -1073746308, 2045, null);
        dk2.ah ahVar = new dk2.ah();
        ahVar.f314751n = false;
        ahVar.f314756s = true;
        b1Var.f398561i = ahVar;
        dk2.q4 q4Var = dk2.q4.f315471a;
        android.content.Context context = this.f446600d.f446625b.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        q4Var.n(context, this.f446600d.f446624a.S0(), b1Var, this.f446600d.f446624a.Y0());
        yj0.a.h(this, "com/tencent/mm/plugin/finder/lottery/card/VisitorLotteryCardRunningWidget$setProductInfoIfNeeded$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
