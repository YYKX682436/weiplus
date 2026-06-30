package bm2;

/* loaded from: classes3.dex */
public final class o1 extends in5.q0 {

    /* renamed from: t, reason: collision with root package name */
    public static final bm2.g1 f22177t = new bm2.g1(null);

    /* renamed from: h, reason: collision with root package name */
    public final we2.p f22178h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f22179i = "Finder.FinderLiveCommentAdapter";

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f22180m = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public yz5.q f22181n;

    /* renamed from: o, reason: collision with root package name */
    public yz5.q f22182o;

    /* renamed from: p, reason: collision with root package name */
    public yz5.l f22183p;

    /* renamed from: q, reason: collision with root package name */
    public jz5.l f22184q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f22185r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f22186s;

    public o1(we2.p pVar) {
        this.f22178h = pVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // in5.q0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void y(bm2.h1 holder, int i17, java.util.List payloads) {
        yz5.l lVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        android.content.Context context = holder.itemView.getContext();
        java.util.ArrayList arrayList = this.f22180m;
        java.lang.Object obj = arrayList.get(i17);
        java.lang.String str = this.f22179i;
        if (obj == null) {
            com.tencent.mars.xlog.Log.i(str, "commentList position:" + i17 + " is null, size = " + arrayList.size());
            android.view.View view = holder.itemView;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View view2 = holder.itemView;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList3.add(0);
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view2, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view2.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        com.tencent.mm.ui.widget.MMNeat7extView mMNeat7extView = holder.f21927e;
        android.view.ViewGroup.LayoutParams layoutParams = mMNeat7extView.getLayoutParams();
        layoutParams.width = -2;
        mMNeat7extView.setLayoutParams(layoutParams);
        holder.itemView.setTag(java.lang.Integer.valueOf(((dk2.zf) arrayList.get(i17)).getType()));
        if (payloads.isEmpty()) {
            f22177t.a(holder);
        }
        we2.p pVar = this.f22178h;
        if (context == null) {
            android.view.View view3 = holder.itemView;
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view3, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter", "_onBindViewHolder", "(Lcom/tencent/mm/plugin/finder/live/view/adapter/FinderLiveCommentAdapter$LiveCommentItemHolder;ILjava/util/List;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            com.tencent.mars.xlog.Log.i(str, "commentList position:" + i17 + " context is null");
        } else if (pVar != null) {
            java.lang.Object obj2 = arrayList.get(i17);
            kotlin.jvm.internal.o.f(obj2, "get(...)");
            pVar.a(context, holder, (dk2.zf) obj2, i17, payloads);
        }
        dk2.zf zfVar = (dk2.zf) kz5.n0.a0(arrayList, i17);
        holder.itemView.setClickable(true);
        java.lang.String str2 = null;
        if (pVar != null) {
            java.lang.Object obj3 = arrayList.get(i17);
            kotlin.jvm.internal.o.f(obj3, "get(...)");
            lVar = pVar.e((dk2.zf) obj3);
        } else {
            lVar = null;
        }
        if (lVar == null) {
            holder.itemView.setOnClickListener(null);
            holder.itemView.setOnLongClickListener(null);
            if (zfVar != null) {
                com.tencent.mm.plugin.finder.live.plugin.me meVar = com.tencent.mm.plugin.finder.live.plugin.mg.f113495p0;
                if ((zfVar.getType() == 10018 || zfVar.getType() == 10019 || zfVar.getType() == 20040) == false) {
                    holder.itemView.setOnLongClickListener(new bm2.i1(this, holder, zfVar, i17));
                }
            }
            holder.itemView.setOnTouchListener(new bm2.j1(this, holder, zfVar, i17));
        } else {
            holder.itemView.setOnTouchListener(null);
            holder.itemView.setOnLongClickListener(null);
            holder.itemView.setOnClickListener(new bm2.k1(lVar));
        }
        holder.f21931i.setOnClickListener(new bm2.l1(zfVar, this, i17, holder));
        holder.f21932m.setOnClickListener(new bm2.m1(zfVar, this, i17, holder));
        if (zfVar != null) {
            if (context != null) {
                r45.xn1 r17 = zfVar.r();
                java.util.LinkedList<r45.yl1> list = r17 != null ? r17.getList(11) : null;
                if ((list == null || list.isEmpty()) == true) {
                    str2 = "";
                } else {
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
                    for (r45.yl1 yl1Var : list) {
                        int integer = yl1Var.getInteger(2);
                        int integer2 = yl1Var.getInteger(0);
                        if (integer2 != 1) {
                            if (integer2 == 2 && integer > 0) {
                                sb6.append(context.getResources().getString(com.tencent.mm.R.string.d6i, java.lang.Integer.valueOf(integer)));
                            }
                        } else if (integer > 0) {
                            sb6.append(context.getResources().getString(com.tencent.mm.R.string.dyp));
                            sb6.append(integer);
                            sb6.append(" ");
                        }
                    }
                    str2 = sb6.toString();
                    kotlin.jvm.internal.o.f(str2, "toString(...)");
                }
            }
            mMNeat7extView.setTag(com.tencent.mm.R.id.f484410e63, str2);
            zl2.r4 r4Var = zl2.r4.f473950a;
            mMNeat7extView.setTag(com.tencent.mm.R.id.e66, zl2.r4.D0(r4Var, zfVar.a(), zfVar.k(), false, 4, null));
            mMNeat7extView.setTag(com.tencent.mm.R.id.e69, zl2.r4.D0(r4Var, zfVar.u(), r4Var.X(zfVar), false, 4, null));
            int type = zfVar.getType();
            if (!(type == 20013 || type == 20035 || type == 20019 || type == 20020)) {
                mMNeat7extView.setTag(com.tencent.mm.R.id.f484412e65, zfVar.j());
            }
            mMNeat7extView.setTag(com.tencent.mm.R.id.e67, java.lang.Integer.valueOf(zfVar.getType()));
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

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f22180m.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onViewDetachedFromWindow(androidx.recyclerview.widget.k3 k3Var) {
        bm2.h1 holder = (bm2.h1) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        android.view.View itemView = holder.itemView;
        kotlin.jvm.internal.o.f(itemView, "itemView");
        I(itemView);
    }

    @Override // in5.q0
    public void x(in5.r0 r0Var, int i17) {
        bm2.h1 holder = (bm2.h1) r0Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        y(holder, i17, new java.util.ArrayList());
    }

    @Override // in5.q0
    public in5.r0 z(android.view.ViewGroup viewGroup, int i17) {
        kotlin.jvm.internal.o.g(viewGroup, "viewGroup");
        android.view.View inflate = android.view.View.inflate(viewGroup.getContext(), com.tencent.mm.R.layout.apg, null);
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = new android.view.ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.topMargin = com.tencent.mm.ui.zk.a(viewGroup.getContext(), 4);
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
