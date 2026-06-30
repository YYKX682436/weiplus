package hd2;

/* loaded from: classes2.dex */
public final class j0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14135xb71edba3 f362019d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f362020e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f362021f;

    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14135xb71edba3 c14135xb71edba3, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, android.content.Context context) {
        this.f362019d = c14135xb71edba3;
        this.f362020e = c19786x6a1e2862;
        this.f362021f = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        jz5.f0 f0Var;
        java.lang.String m75945x2fec8307;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$onAbnormalAccount$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        zy2.fa nk6 = ((c61.l7) i95.n0.c(c61.l7.class)).nk();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14135xb71edba3 c14135xb71edba3 = this.f362019d;
        nk6.y("PersonalCenterBanEntry", c14135xb71edba3.f191586q);
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f362020e;
        if (c19786x6a1e2862 != null) {
            xc2.y2.i(xc2.y2.f534876a, this.f362021f, new xc2.p0(c19786x6a1e2862), 0, null, 12, null);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            m92.b j37 = g92.a.j3(g92.b.f351302e, c14135xb71edba3.f191586q, false, 2, null);
            if (j37 == null || (m75945x2fec8307 = j37.u0().m75945x2fec8307(32)) == null) {
                f0Var2 = null;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.UIComponentFragment", "[handleJumpError] jumpJson=".concat(m75945x2fec8307));
                qd2.q qVar = new qd2.q();
                android.content.Context context = view.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
                qd2.q.e(qVar, (com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) context, 0, m75945x2fec8307, 0, 8, null);
            }
            if (f0Var2 == null) {
                c14135xb71edba3.t0(this.f362021f);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$onAbnormalAccount$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
