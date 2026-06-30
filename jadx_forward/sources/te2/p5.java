package te2;

/* loaded from: classes3.dex */
public final class p5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ te2.p8 f499836d;

    public p5(te2.p8 p8Var) {
        this.f499836d = p8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initBottomArea$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ya2.g gVar = ya2.h.f542017a;
        te2.p8 p8Var = this.f499836d;
        ya2.b2 b17 = gVar.b(xy2.c.e(p8Var.m80379x76847179()));
        if (b17 != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa i17 = ya2.d.i(b17);
            i95.m c17 = i95.n0.c(c61.ub.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            c61.ub ubVar = (c61.ub) c17;
            android.app.Activity m80379x76847179 = p8Var.m80379x76847179();
            r45.l32 l32Var = p8Var.Z;
            c61.ub.A3(ubVar, m80379x76847179, null, i17, 1012, false, null, l32Var != null ? (r45.h32) l32Var.m75936x14adae67(1) : null, false, null, null, na1.e.f72905x366c91de, null);
            p8Var.m158354x19263085().finish();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/component/FinderLiveNoticeQRCodeUIC$initBottomArea$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
