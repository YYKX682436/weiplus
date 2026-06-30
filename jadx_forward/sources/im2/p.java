package im2;

/* loaded from: classes3.dex */
public final class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.q f374010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.cz1 f374011e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f374012f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f374013g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f374014h;

    public p(im2.q qVar, r45.cz1 cz1Var, long j17, r45.qt2 qt2Var, java.lang.String str) {
        this.f374010d = qVar;
        this.f374011e = cz1Var;
        this.f374012f = j17;
        this.f374013g = qt2Var;
        this.f374014h = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveLotteryDetailUIC$onCreate$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.G().r()).intValue() <= 0) {
            db5.t7.m123883x26a183b(view.getContext(), view.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.cn9), 0).show();
            yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveLotteryDetailUIC$onCreate$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        r45.zy1 zy1Var = new r45.zy1();
        zy1Var.set(0, this.f374014h);
        zy1Var.set(5, java.lang.Boolean.FALSE);
        c61.ub ubVar = (c61.ub) i95.n0.c(c61.ub.class);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = this.f374010d.m158354x19263085();
        r45.cz1 cz1Var = this.f374011e;
        r45.j55 j55Var = (r45.j55) cz1Var.m75936x14adae67(11);
        int m75939xb282bd08 = j55Var != null ? j55Var.m75939xb282bd08(0) : 0;
        java.lang.String m75945x2fec8307 = cz1Var.m75945x2fec8307(0);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) ubVar).Vi(m158354x19263085, m75939xb282bd08, zy1Var, m75945x2fec8307, this.f374012f, this.f374013g, false);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ml2.r0.ek((ml2.r0) c17, ml2.p4.f409336q, "", null, 0, null, 28, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveLotteryDetailUIC$onCreate$2$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
