package ut2;

/* loaded from: classes3.dex */
public final class l0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ut2.m0 f512517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.xv f512518e;

    public l0(ut2.m0 m0Var, bw5.xv xvVar) {
        this.f512517d = m0Var;
        this.f512518e = xvVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        hg2.l lVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingAnchorManageHeaderHolder$createDynamicButtons$3$buttonContainer$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ut2.q0 q0Var = this.f512517d.f512528d;
        if (q0Var != null) {
            bw5.xv buttonInfo = this.f512518e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buttonInfo, "buttonInfo");
            int i17 = buttonInfo.f116804d;
            boolean z17 = false;
            st2.h1 h1Var = ((st2.m) q0Var).f493927a;
            if (i17 == 2) {
                h1Var.c();
                if (h1Var.x()) {
                    ((ml2.r0) i95.n0.c(ml2.r0.class)).sj(2, 6, 0);
                }
            } else if (i17 == 3) {
                h1Var.u();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l lVar2 = h1Var.f493870h;
                if (lVar2 != null && (lVar = (hg2.l) lVar2.U0(hg2.l.class)) != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.d(lVar, null, null, new hg2.k(lVar, null), 3, null);
                }
            } else {
                boolean[] zArr = buttonInfo.f116809i;
                if (i17 == 1) {
                    r45.dv1 dv1Var = ((mm2.f6) h1Var.f493868f.a(mm2.f6.class)).P;
                    com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = dv1Var != null ? (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862) dv1Var.m75936x14adae67(35) : null;
                    android.view.ViewGroup viewGroup = h1Var.f493866d;
                    if (c19786x6a1e2862 != null) {
                        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
                        android.content.Context context = viewGroup.getContext();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                        r45.ac4 ac4Var = new r45.ac4();
                        ac4Var.set(1, c19786x6a1e2862);
                        ((c61.p2) ybVar).Bi(context, ac4Var, null, null);
                    } else {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveShoppingListPlugin", "jump manage native");
                        z17 = true;
                    }
                    if (z17) {
                        android.content.Context context2 = viewGroup.getContext();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                        pq.a aVar = new pq.a(context2);
                        i95.m c17 = i95.n0.c(pq.q.class);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                        pq.q qVar = (pq.q) c17;
                        bw5.x7 x7Var = zArr[4] ? buttonInfo.f116807g : new bw5.x7();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(x7Var, "getJumpInfo(...)");
                        pq.q.Lb(qVar, aVar, x7Var, null, 4, null);
                    }
                } else {
                    android.content.Context context3 = h1Var.f493866d.getContext();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context3, "getContext(...)");
                    pq.a aVar2 = new pq.a(context3);
                    i95.m c18 = i95.n0.c(pq.q.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
                    pq.q qVar2 = (pq.q) c18;
                    bw5.x7 x7Var2 = zArr[4] ? buttonInfo.f116807g : new bw5.x7();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(x7Var2, "getJumpInfo(...)");
                    pq.q.Lb(qVar2, aVar2, x7Var2, null, 4, null);
                }
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/shopping/holder/FinderLiveShoppingAnchorManageHeaderHolder$createDynamicButtons$3$buttonContainer$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
