package bm2;

/* loaded from: classes3.dex */
public final class o1 extends in5.q0 {

    /* renamed from: t, reason: collision with root package name */
    public static final bm2.g1 f103710t = new bm2.g1(null);

    /* renamed from: h, reason: collision with root package name */
    public final we2.p f103711h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f103712i = "Finder.FinderLiveCommentAdapter";

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f103713m = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public yz5.q f103714n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.q f103715o;

    /* renamed from: p, reason: collision with root package name */
    public yz5.l f103716p;

    /* renamed from: q, reason: collision with root package name */
    public jz5.l f103717q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f103718r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f103719s;

    public o1(we2.p pVar) {
        this.f103711h = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // in5.q0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void y(bm2.h1 holder, int i17, java.util.List payloads) {
        yz5.l lVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(payloads, "payloads");
        android.content.Context context = holder.f3639x46306858.getContext();
        java.util.ArrayList arrayList = this.f103713m;
        java.lang.Object obj = arrayList.get(i17);
        java.lang.String str = this.f103712i;
        if (obj == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "commentList position:" + i17 + " is null, size = " + arrayList.size());
            android.view.View view = holder.f3639x46306858;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = holder.f3639x46306858;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22624x85d69039 c22624x85d69039 = holder.f103460e;
        android.view.ViewGroup.LayoutParams layoutParams = c22624x85d69039.getLayoutParams();
        layoutParams.width = -2;
        c22624x85d69039.setLayoutParams(layoutParams);
        holder.f3639x46306858.setTag(java.lang.Integer.valueOf(((dk2.zf) arrayList.get(i17)).mo124533xfb85f7b0()));
        if (payloads.isEmpty()) {
            f103710t.a(holder);
        }
        we2.p pVar = this.f103711h;
        if (context == null) {
            android.view.View view3 = holder.f3639x46306858;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "commentList position:" + i17 + " context is null");
        } else if (pVar != null) {
            java.lang.Object obj2 = arrayList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj2, "get(...)");
            pVar.a(context, holder, (dk2.zf) obj2, i17, payloads);
        }
        dk2.zf zfVar = (dk2.zf) kz5.n0.a0(arrayList, i17);
        holder.f3639x46306858.setClickable(true);
        java.lang.String str2 = null;
        if (pVar != null) {
            java.lang.Object obj3 = arrayList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj3, "get(...)");
            lVar = pVar.e((dk2.zf) obj3);
        } else {
            lVar = null;
        }
        if (lVar == null) {
            holder.f3639x46306858.setOnClickListener(null);
            holder.f3639x46306858.setOnLongClickListener(null);
            if (zfVar != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.me meVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.mg.f195028p0;
                if ((zfVar.mo124533xfb85f7b0() == 10018 || zfVar.mo124533xfb85f7b0() == 10019 || zfVar.mo124533xfb85f7b0() == 20040) == false) {
                    holder.f3639x46306858.setOnLongClickListener(new bm2.i1(this, holder, zfVar, i17));
                }
            }
            holder.f3639x46306858.setOnTouchListener(new bm2.j1(this, holder, zfVar, i17));
        } else {
            holder.f3639x46306858.setOnTouchListener(null);
            holder.f3639x46306858.setOnLongClickListener(null);
            holder.f3639x46306858.setOnClickListener(new bm2.k1(lVar));
        }
        holder.f103464i.setOnClickListener(new bm2.l1(zfVar, this, i17, holder));
        holder.f103465m.setOnClickListener(new bm2.m1(zfVar, this, i17, holder));
        if (zfVar != null) {
            if (context != null) {
                r45.xn1 r17 = zfVar.r();
                java.util.LinkedList<r45.yl1> m75941xfb821914 = r17 != null ? r17.m75941xfb821914(11) : null;
                if ((m75941xfb821914 == null || m75941xfb821914.isEmpty()) == true) {
                    str2 = "";
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    for (r45.yl1 yl1Var : m75941xfb821914) {
                        int m75939xb282bd08 = yl1Var.m75939xb282bd08(2);
                        int m75939xb282bd082 = yl1Var.m75939xb282bd08(0);
                        if (m75939xb282bd082 != 1) {
                            if (m75939xb282bd082 == 2 && m75939xb282bd08 > 0) {
                                sb6.append(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d6i, java.lang.Integer.valueOf(m75939xb282bd08)));
                            }
                        } else if (m75939xb282bd08 > 0) {
                            sb6.append(context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.dyp));
                            sb6.append(m75939xb282bd08);
                            sb6.append(" ");
                        }
                    }
                    str2 = sb6.toString();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str2, "toString(...)");
                }
            }
            c22624x85d69039.setTag(com.p314xaae8f345.mm.R.id.f565943e63, str2);
            zl2.r4 r4Var = zl2.r4.f555483a;
            c22624x85d69039.setTag(com.p314xaae8f345.mm.R.id.e66, zl2.r4.D0(r4Var, zfVar.a(), zfVar.k(), false, 4, null));
            c22624x85d69039.setTag(com.p314xaae8f345.mm.R.id.e69, zl2.r4.D0(r4Var, zfVar.u(), r4Var.X(zfVar), false, 4, null));
            int mo124533xfb85f7b0 = zfVar.mo124533xfb85f7b0();
            if (!(mo124533xfb85f7b0 == 20013 || mo124533xfb85f7b0 == 20035 || mo124533xfb85f7b0 == 20019 || mo124533xfb85f7b0 == 20020)) {
                c22624x85d69039.setTag(com.p314xaae8f345.mm.R.id.f565945e65, zfVar.j());
            }
            c22624x85d69039.setTag(com.p314xaae8f345.mm.R.id.e67, java.lang.Integer.valueOf(zfVar.mo124533xfb85f7b0()));
        }
    }

    public final void I(android.view.View view) {
        if (view instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i17 = 0; i17 < childCount; i17++) {
                android.view.View childAt = viewGroup.getChildAt(i17);
                if (childAt != null) {
                    childAt.animate().cancel();
                    childAt.hasTransientState();
                    I(childAt);
                }
            }
            view.animate().cancel();
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f103713m.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onViewDetachedFromWindow */
    public void mo8161x38c82990(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        bm2.h1 holder = (bm2.h1) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        super.mo8161x38c82990(holder);
        android.view.View itemView = holder.f3639x46306858;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
        I(itemView);
    }

    @Override // in5.q0
    public void x(in5.r0 r0Var, int i17) {
        bm2.h1 holder = (bm2.h1) r0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        y(holder, i17, new java.util.ArrayList());
    }

    @Override // in5.q0
    public in5.r0 z(android.view.ViewGroup viewGroup, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewGroup, "viewGroup");
        android.view.View inflate = android.view.View.inflate(viewGroup.getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.apg, null);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.topMargin = com.p314xaae8f345.mm.ui.zk.a(viewGroup.getContext(), 4);
        inflate.setLayoutParams(marginLayoutParams);
        boolean z17 = inflate instanceof android.view.ViewGroup;
        android.view.ViewGroup viewGroup2 = z17 ? (android.view.ViewGroup) inflate : null;
        if (viewGroup2 != null) {
            viewGroup2.setClipChildren(false);
        }
        android.view.ViewGroup viewGroup3 = z17 ? (android.view.ViewGroup) inflate : null;
        if (viewGroup3 != null) {
            viewGroup3.setClipToPadding(false);
        }
        return new bm2.h1(inflate);
    }
}
