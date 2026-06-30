package qs3;

/* loaded from: classes15.dex */
public final class i implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16945xe78973e5 f447884d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.oi5 f447885e;

    public i(com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16945xe78973e5 c16945xe78973e5, r45.oi5 oi5Var) {
        this.f447884d = c16945xe78973e5;
        this.f447885e = oi5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        qs3.e eVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/radar/ui/RadarMemberView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16945xe78973e5 c16945xe78973e5 = this.f447884d;
        if (c16945xe78973e5.getState() == null || (eVar = c16945xe78973e5.f236520v) == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/radar/ui/RadarMemberView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (eVar != null) {
            ps3.e state = c16945xe78973e5.getState();
            qs3.w0 w0Var = (qs3.w0) eVar;
            r45.oi5 member = this.f447885e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(member, "member");
            java.lang.String str = member.f463816d;
            if (str == null && (str = member.f463820h) == null) {
                str = "";
            }
            int i17 = state == null ? -1 : qs3.r0.f447917a[state.ordinal()];
            com.p314xaae8f345.mm.p1006xc5476f33.p1975x6741306.ui.C16953xeaa414a7 c16953xeaa414a7 = w0Var.f447937a;
            if (i17 == 1) {
                ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).Ai(c16953xeaa414a7.getContext(), new qs3.t0(c16953xeaa414a7, str, member, state));
            } else if (i17 == 2) {
                ((ms.a) ((ns.k) i95.n0.c(ns.k.class))).Ai(c16953xeaa414a7.getContext(), new qs3.v0(c16953xeaa414a7, str, member, state));
            }
        }
        c16945xe78973e5.c();
        yj0.a.h(this, "com/tencent/mm/plugin/radar/ui/RadarMemberView$initView$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
