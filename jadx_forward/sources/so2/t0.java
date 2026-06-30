package so2;

/* loaded from: classes2.dex */
public final class t0 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.w2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so2.u0 f492136d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.s0 f492137e;

    public t0(so2.u0 u0Var, so2.s0 s0Var) {
        this.f492136d = u0Var;
        this.f492137e = s0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrollStateChanged */
    public void mo481x4d79408f(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, int i17) {
        java.lang.String str;
        boolean z17;
        boolean z18;
        yz5.p pVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(recyclerView);
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/model/FinderFastScrollHelper$attachRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        so2.u0 u0Var = this.f492136d;
        if ((u0Var.f492153b.f492105f && i17 != 0) || !hc2.e.a()) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/model/FinderFastScrollHelper$attachRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            return;
        }
        yz5.l lVar = u0Var.f492162k;
        if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(i17));
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = recyclerView.getLayoutManager();
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de) layoutManager : null;
        if (c1162x665295de == null) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/model/FinderFastScrollHelper$attachRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V");
            return;
        }
        int y17 = c1162x665295de.y();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = currentTimeMillis - u0Var.f492157f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder(recyclerView + " state=" + i17 + ",pos=" + y17 + "(lastPos=" + u0Var.f492158g + "),before time=" + u0Var.f492157f + " curTime=" + currentTimeMillis + ",duration=" + j17 + ",fastScrollCnt=" + u0Var.f492155d + " continueFastScrollCnt=" + u0Var.f492154c + ';');
        if (y17 == -1 || y17 == u0Var.f492158g) {
            str = "onScrollStateChanged";
        } else {
            str = "onScrollStateChanged";
            boolean z19 = true;
            if (j17 <= u0Var.f492153b.f492100a) {
                so2.s0 s0Var = this.f492137e;
                if (s0Var == null) {
                    z17 = true;
                } else {
                    z17 = s0Var.a(recyclerView, y17);
                    sb6.append("itemValid=" + z17 + ',');
                }
                if (z17) {
                    u0Var.f492155d++;
                    u0Var.f492154c++;
                    if (y17 > u0Var.f492158g) {
                        int i18 = u0Var.f492156e + 1;
                        u0Var.f492156e = i18;
                        int i19 = u0Var.f492153b.f492103d;
                        if (i19 != -1 && i18 >= i19) {
                            yz5.l lVar2 = u0Var.f492161j;
                            if (lVar2 != null) {
                                lVar2.mo146xb9724478(java.lang.Boolean.TRUE);
                            }
                            if (u0Var.f492153b.f492104e) {
                                u0Var.f492156e = 0;
                            }
                        }
                    } else {
                        u0Var.f492156e = 0;
                    }
                }
            } else {
                u0Var.f492154c = 0;
                u0Var.f492156e = 0;
                z17 = false;
            }
            sb6.append("hitFastScroll=" + z17 + ",after fastScrollCnt=" + u0Var.f492155d + " continueFastScrollCnt=" + u0Var.f492154c + " consecutiveUpwardFastSlipCnt:" + u0Var.f492156e + ';');
            u0Var.f492157f = currentTimeMillis;
            so2.r0 r0Var = u0Var.f492153b;
            int i27 = r0Var.f492101b;
            if (i27 == -1 || u0Var.f492155d < i27) {
                z18 = false;
            } else {
                if (r0Var.f492104e) {
                    u0Var.f492155d = 0;
                }
                z18 = true;
            }
            int i28 = r0Var.f492102c;
            if (i28 == -1 || u0Var.f492154c < i28) {
                z19 = false;
            } else if (r0Var.f492104e) {
                u0Var.f492154c = 0;
            }
            if ((z18 || z19) && (pVar = u0Var.f492160i) != null) {
                pVar.mo149xb9724478(java.lang.Boolean.valueOf(z18), java.lang.Boolean.valueOf(z19));
            }
            sb6.append("amountToFastScrollCnt=" + z18 + ",amountToContinueFastScrollCnt=" + z19);
            if (y17 != u0Var.f492158g) {
                u0Var.b("lastPos from " + u0Var.f492158g + " to " + y17);
            }
            u0Var.f492158g = y17;
        }
        java.lang.String sb7 = sb6.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(sb7, "toString(...)");
        u0Var.b(sb7);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/model/FinderFastScrollHelper$attachRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", str, "(Landroidx/recyclerview/widget/RecyclerView;I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.w2
    /* renamed from: onScrolled */
    public void mo482x8d21972b(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4, int i17, int i18) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(c1163xf1deaba4);
        arrayList.add(java.lang.Integer.valueOf(i17));
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/model/FinderFastScrollHelper$attachRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/model/FinderFastScrollHelper$attachRecyclerView$1", "androidx/recyclerview/widget/RecyclerView$OnScrollListener", "onScrolled", "(Landroidx/recyclerview/widget/RecyclerView;II)V");
    }
}
