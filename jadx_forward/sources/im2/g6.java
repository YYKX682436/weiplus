package im2;

/* loaded from: classes3.dex */
public final class g6 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ im2.h6 f373880d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.fl1 f373881e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa f373882f;

    public g6(im2.h6 h6Var, r45.fl1 fl1Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa) {
        this.f373880d = h6Var;
        this.f373881e = fl1Var;
        this.f373882f = c19782x23db1cfa;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        int i17;
        r45.nw1 nw1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveVisitorAfterPagePlugin$updateFollowButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        im2.h6 h6Var = this.f373880d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d abstractC20980x9b9ad01d = h6Var.M;
        if (abstractC20980x9b9ad01d != null) {
            abstractC20980x9b9ad01d.mo48813x58998cd();
        }
        h6Var.H = true;
        boolean z17 = h6Var.Y().f492187i;
        r45.fl1 fl1Var = this.f373881e;
        if (!z17) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = this.f373882f;
            h6Var.I = c19782x23db1cfa.m76197x6c03c64c();
            h6Var.f373893J = fl1Var.m75933x41a8a7f2(2);
            int i18 = (fl1Var.m75939xb282bd08(0) == 1 || fl1Var.m75939xb282bd08(0) == 3) ? 1 : 0;
            if (i18 != 0) {
                boolean m75933x41a8a7f2 = fl1Var.m75933x41a8a7f2(2);
                if (h6Var.N == null) {
                    android.view.View view2 = h6Var.f195201d;
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(view2.getContext(), 1, true);
                    k0Var.q(view2.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572822cn3), 17);
                    k0Var.f293405n = new im2.c5(h6Var);
                    k0Var.f293414s = new im2.d5(h6Var, c19782x23db1cfa, m75933x41a8a7f2);
                    k0Var.f293387d = new im2.e5(h6Var);
                    k0Var.f293393g = new im2.f5(h6Var);
                    h6Var.N = k0Var;
                }
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var2 = h6Var.N;
                if (k0Var2 != null && !k0Var2.i()) {
                    k0Var2.v();
                }
            } else {
                im2.h6.f(h6Var, true, c19782x23db1cfa, fl1Var.m75933x41a8a7f2(2));
            }
            i17 = i18 ^ 1;
        } else {
            if (fl1Var.m75939xb282bd08(1) == 1) {
                yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveVisitorAfterPagePlugin$updateFollowButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                return;
            }
            h6Var.I = h6Var.Y().f492188j;
            h6Var.f373893J = false;
            android.content.Context context = h6Var.f195201d.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.lang.String str = h6Var.Y().f492188j;
            h6Var.getClass();
            java.lang.Long l17 = null;
            if ((str.length() > 0) == false) {
                str = null;
            }
            if (str != null) {
                o25.a aVar = new o25.a();
                aVar.f423997b = com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54461xcc044630;
                aVar.f424001f = 0;
                aVar.f424002g = false;
                r45.l71 l71Var = h6Var.E;
                if (l71Var != null && (nw1Var = (r45.nw1) l71Var.m75936x14adae67(1)) != null) {
                    l17 = java.lang.Long.valueOf(nw1Var.m75942xfb822ef2(0));
                }
                aVar.f423998c = java.lang.String.valueOf(l17);
                aVar.f424003h = true;
                ((r35.o) ((r35.p) ((o25.o1) i95.n0.c(o25.o1.class))).Ai(context, str, com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54461xcc044630, true, new im2.h5(h6Var, str), aVar)).f();
            }
            i17 = 1;
        }
        ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
        h6Var.Y().f492192n.m75942xfb822ef2(0);
        long j17 = h6Var.Y().f492181c;
        int i19 = !h6Var.Y().f492187i ? 1 : 0;
        r0Var.getClass();
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("is_focus", java.lang.String.valueOf(i17));
        hashMap.put("is_finder", java.lang.String.valueOf(i19));
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.K1, hashMap, null, null, null, null, false, 124, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("HABBYGE-MALI.HellLiveVisitorReoprter", "report23059, liveid = " + ((java.lang.String) hashMap.get("liveid")) + ", feedid = " + ((java.lang.String) hashMap.get("feedid")) + ", is_focus = " + ((java.lang.String) hashMap.get("is_focus")) + ", is_finder = " + ((java.lang.String) hashMap.get("is_finder")));
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveVisitorAfterPagePlugin$updateFollowButton$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
