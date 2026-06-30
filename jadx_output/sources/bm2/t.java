package bm2;

/* loaded from: classes3.dex */
public final class t extends in5.q0 {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f22296h = "FinderLiveAnchorMusicEditAdapter";

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f22297i = new java.util.ArrayList();

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f22298m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f22299n;

    /* renamed from: o, reason: collision with root package name */
    public final dk2.vg f22300o;

    /* renamed from: p, reason: collision with root package name */
    public dk2.vg f22301p;

    /* renamed from: q, reason: collision with root package name */
    public dk2.vg f22302q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.q f22303r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f22304s;

    public t() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f22298m = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f22299n = arrayList2;
        dk2.vg vgVar = new dk2.vg(new r45.d22(), 0, 0, 1, false, 0L, 48, null);
        this.f22300o = vgVar;
        this.f22302q = this.f22301p;
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Hk();
        this.f22304s = true;
        zl2.q4.f473933a.R("FinderLiveAnchorMusicEditAdapter");
        arrayList2.add(vgVar);
        arrayList.addAll(arrayList2);
    }

    @Override // in5.q0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void x(bm2.n holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        if (!(holder instanceof bm2.p)) {
            if (holder instanceof bm2.o) {
                bm2.o oVar = (bm2.o) holder;
                int size = ((java.util.ArrayList) this.f22297i).size();
                android.widget.TextView textView = oVar.f22171e;
                kotlin.jvm.internal.o.f(textView, "<get-musicCount>(...)");
                com.tencent.mm.ui.fk.a(textView);
                textView.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d4q, java.lang.Integer.valueOf(size)));
                android.view.View view = oVar.f22172f;
                kotlin.jvm.internal.o.f(view, "<get-divider>(...)");
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                android.view.ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof android.view.ViewGroup.MarginLayoutParams ? (android.view.ViewGroup.MarginLayoutParams) layoutParams : null;
                if (marginLayoutParams != null) {
                    marginLayoutParams.leftMargin = (int) view.getResources().getDimension(com.tencent.mm.R.dimen.f479718db);
                }
                view.setLayoutParams(layoutParams);
                return;
            }
            return;
        }
        bm2.p pVar = (bm2.p) holder;
        java.lang.Object obj = this.f22298m.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        dk2.vg vgVar = (dk2.vg) obj;
        boolean z17 = false;
        pVar.f22209e.setChecked(vgVar.f234258e);
        android.content.res.Resources resources = pVar.itemView.getContext().getResources();
        r45.d22 d22Var = vgVar.f234254a;
        java.lang.String string = resources.getString(com.tencent.mm.R.string.d4r, d22Var.getString(2), no0.m.f338730a.b(d22Var.getInteger(12), ":"));
        kotlin.jvm.internal.o.f(string, "getString(...)");
        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
        mn2.q3 q3Var = new mn2.q3(d22Var.getString(4), com.tencent.mm.plugin.finder.storage.y90.f128356f);
        yo0.f fVar = new yo0.f();
        fVar.f464083g = com.tencent.mm.R.drawable.co_;
        wo0.c b17 = d1Var.b(q3Var, fVar.a());
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = pVar.f22211g;
        kotlin.jvm.internal.o.f(mMRoundCornerImageView, "<get-musicCover>(...)");
        ((wo0.b) b17).b(mMRoundCornerImageView, true);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String string2 = d22Var.getString(1);
        android.widget.TextView textView2 = pVar.f22212h;
        float textSize = textView2.getTextSize();
        ((ke0.e) xVar).getClass();
        textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, string2, textSize));
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.widget.TextView textView3 = pVar.f22213i;
        float textSize2 = textView3.getTextSize();
        ((ke0.e) xVar2).getClass();
        textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context2, string, textSize2));
        com.tencent.mm.view.MMPAGView mMPAGView = pVar.f22210f;
        if (mMPAGView != null) {
            if (this.f22304s && vgVar.f234255b == 1) {
                z17 = true;
            }
            if (pVar.f22215n || !z17) {
                android.view.View view2 = pVar.f22214m;
                kotlin.jvm.internal.o.f(view2, "<get-playingBg>(...)");
                J(mMPAGView, view2, vgVar.f234255b);
            } else {
                kotlinx.coroutines.y0 y0Var = pVar.f293120d;
                if (y0Var != null) {
                    kotlinx.coroutines.l.d(y0Var, null, null, new bm2.r(mMPAGView, pVar, this, vgVar, null), 3, null);
                }
            }
        }
        pVar.itemView.setOnClickListener(new bm2.s(this, pVar, i17, vgVar));
    }

    public final void I(java.util.ArrayList arrayList, java.lang.String str) {
        if (zl2.q4.f473933a.E()) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder(str + "(MusicList):");
            if (arrayList != null) {
                int i17 = 0;
                for (java.lang.Object obj : arrayList) {
                    int i18 = i17 + 1;
                    if (i17 < 0) {
                        kz5.c0.p();
                        throw null;
                    }
                    sb6.append("[" + i17 + ',' + ((dk2.vg) obj) + ']');
                    i17 = i18;
                }
            }
            com.tencent.mars.xlog.Log.i(this.f22296h, sb6.toString());
        }
    }

    public final void J(com.tencent.mm.view.MMPAGView mMPAGView, android.view.View view, int i17) {
        boolean z17 = this.f22304s;
        if (i17 == 1) {
            if (!z17) {
                mMPAGView.setVisibility(8);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicEditAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicEditAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            mMPAGView.setVisibility(0);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicEditAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicEditAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (mMPAGView.f()) {
                return;
            }
            mMPAGView.g();
            return;
        }
        if (i17 != 2) {
            if (z17) {
                mMPAGView.n();
            }
            mMPAGView.setVisibility(8);
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicEditAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicEditAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (!z17) {
            mMPAGView.setVisibility(8);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicEditAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicEditAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicEditAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicEditAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mMPAGView.n();
        mMPAGView.setProgress(0.0d);
        mMPAGView.setVisibility(0);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        int size = this.f22298m.size();
        zl2.r4.f473950a.M2(this.f22296h, "getItemCount " + size);
        return size;
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((dk2.vg) this.f22298m.get(i17)).f234257d;
    }

    @Override // in5.q0
    public void y(in5.r0 r0Var, int i17, java.util.List payloads) {
        bm2.n holder = (bm2.n) r0Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(payloads, "payloads");
        x(holder, i17);
    }

    @Override // in5.q0
    public in5.r0 z(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.amc, parent, false);
            kotlin.jvm.internal.o.d(inflate);
            return new bm2.o(this, inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.amf, parent, false);
        kotlin.jvm.internal.o.d(inflate2);
        return new bm2.p(this, inflate2);
    }
}
