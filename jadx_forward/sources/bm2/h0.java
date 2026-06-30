package bm2;

/* loaded from: classes3.dex */
public final class h0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.z42 f103456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f103457e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 f103458f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ bm2.v0 f103459g;

    public h0(r45.z42 z42Var, android.content.Context context, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862, bm2.v0 v0Var) {
        this.f103456d = z42Var;
        this.f103457e = context;
        this.f103458f = c19786x6a1e2862;
        this.f103459g = v0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        gk2.e q57;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$28", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.z42 z42Var = this.f103456d;
        if (z42Var.m75939xb282bd08(1) == 15) {
            dk2.ef efVar = dk2.ef.f314905a;
            gk2.e eVar = dk2.ef.I;
            if (eVar != null) {
                wt2.a aVar = this.f103459g.f103901n;
                boolean z17 = false;
                if (aVar != null && (q57 = aVar.q5()) != null && ((mm2.c1) q57.a(mm2.c1.class)).S) {
                    z17 = true;
                }
                bf2.c.b(bf2.c.f101131a, eVar, z17 ? 8 : 6, 11, null, 0, 24, null);
            }
        }
        int m75939xb282bd08 = z42Var.m75939xb282bd08(1);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 info = this.f103458f;
        android.content.Context context = this.f103457e;
        if (m75939xb282bd08 == 15) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
            r45.l34 l34Var = new r45.l34();
            l34Var.set(4, java.lang.Float.valueOf(0.65f));
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
            xc2.y2 y2Var = xc2.y2.f534876a;
            xc2.p0 p0Var = new xc2.p0(info);
            p0Var.f534771c = l34Var;
            xc2.y2.i(y2Var, context, p0Var, 0, null, 8, null);
        } else {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
            xc2.y2 y2Var2 = xc2.y2.f534876a;
            xc2.p0 p0Var2 = new xc2.p0(info);
            p0Var2.f534785n = 0;
            xc2.y2.i(y2Var2, context, p0Var2, 0, null, 8, null);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorPromoteInfoAdapter$onBindViewHolder$1$28", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
