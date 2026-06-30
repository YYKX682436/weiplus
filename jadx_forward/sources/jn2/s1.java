package jn2;

/* loaded from: classes10.dex */
public final class s1 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1548x1e28afad.p1549xaf3f29eb.C14424xe21e01a f382228d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 f382229e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 f382230f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 f382231g;

    /* renamed from: h, reason: collision with root package name */
    public jn2.t1 f382232h;

    /* renamed from: i, reason: collision with root package name */
    public fn2.c f382233i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ jn2.z1 f382234m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(jn2.z1 z1Var, android.view.View itemView) {
        super(itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f382234m = z1Var;
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.sdt);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1548x1e28afad.p1549xaf3f29eb.C14424xe21e01a c14424xe21e01a = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1548x1e28afad.p1549xaf3f29eb.C14424xe21e01a) findViewById;
        this.f382228d = c14424xe21e01a;
        this.f382229e = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) itemView.findViewById(com.p314xaae8f345.mm.R.id.sdq);
        this.f382230f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) itemView.findViewById(com.p314xaae8f345.mm.R.id.sds);
        this.f382231g = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4) itemView.findViewById(com.p314xaae8f345.mm.R.id.sdr);
        this.f382232h = jn2.t1.f382237d;
        c14424xe21e01a.B();
    }

    public final void i(jn2.t1 state, boolean z17) {
        boolean z18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        if (this.f382232h != state || z17) {
            this.f382232h = state;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1548x1e28afad.p1549xaf3f29eb.C14424xe21e01a c14424xe21e01a = this.f382228d;
            android.view.View f201314w = c14424xe21e01a.getF201314w();
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b mo10749x89e0979c = c14424xe21e01a.mo10749x89e0979c();
            int ordinal = state.ordinal();
            if (ordinal == 0 || ordinal == 1) {
                z18 = true;
                mo10749x89e0979c.setVisibility(8);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(f201314w, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanelAdapter$SingSongViewHolder", "updatePlayingAnimByState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanelAdapter$ViewHolderState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f201314w.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(f201314w, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanelAdapter$SingSongViewHolder", "updatePlayingAnimByState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanelAdapter$ViewHolderState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo10749x89e0979c.n();
            } else if (ordinal != 2) {
                z18 = true;
            } else {
                mo10749x89e0979c.setVisibility(0);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(0);
                java.util.Collections.reverse(arrayList2);
                z18 = true;
                yj0.a.d(f201314w, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanelAdapter$SingSongViewHolder", "updatePlayingAnimByState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanelAdapter$ViewHolderState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f201314w.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(f201314w, "com/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanelAdapter$SingSongViewHolder", "updatePlayingAnimByState", "(Lcom/tencent/mm/plugin/finder/live/widget/singlist/panel/FinderLiveAnchorSingSongListPanelAdapter$ViewHolderState;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo10749x89e0979c.g();
            }
            jn2.t1 t1Var = this.f382232h;
            android.widget.TextView a17 = c14424xe21e01a.getA();
            int ordinal2 = t1Var.ordinal();
            jn2.z1 z1Var = this.f382234m;
            if (ordinal2 == 0 || ordinal2 == z18) {
                a17.setTextColor(z1Var.f382299e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abw));
            } else if (ordinal2 == 2) {
                a17.setTextColor(z1Var.f382299e.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su));
            }
            int ordinal3 = this.f382232h.ordinal();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c0 = this.f382230f;
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0 c22661xa3a2b3c02 = this.f382229e;
            if (ordinal3 == 0) {
                if (c22661xa3a2b3c02 != null) {
                    c22661xa3a2b3c02.setVisibility(0);
                }
                if (c22661xa3a2b3c02 != null) {
                    c22661xa3a2b3c02.setEnabled(z18);
                }
                if (c22661xa3a2b3c0 != null) {
                    c22661xa3a2b3c0.setVisibility(8);
                }
            } else if (ordinal3 == z18) {
                if (c22661xa3a2b3c02 != null) {
                    c22661xa3a2b3c02.setVisibility(8);
                }
                if (c22661xa3a2b3c0 != null) {
                    c22661xa3a2b3c0.setVisibility(8);
                }
            } else if (ordinal3 == 2) {
                if (c22661xa3a2b3c02 != null) {
                    c22661xa3a2b3c02.setVisibility(8);
                }
                if (c22661xa3a2b3c0 != null) {
                    c22661xa3a2b3c0.setVisibility(0);
                }
                if (c22661xa3a2b3c0 != null) {
                    c22661xa3a2b3c0.setEnabled(z18);
                }
            }
            int ordinal4 = this.f382232h.ordinal();
            com.p314xaae8f345.mm.ui.p2747xd1075a44.C22627xa933f8e4 c22627xa933f8e4 = this.f382231g;
            if (ordinal4 != 0) {
                if (ordinal4 == z18) {
                    if (c22627xa933f8e4 == null) {
                        return;
                    }
                    c22627xa933f8e4.setVisibility(0);
                    return;
                } else if (ordinal4 != 2) {
                    return;
                }
            }
            if (c22627xa933f8e4 == null) {
                return;
            }
            c22627xa933f8e4.setVisibility(8);
        }
    }
}
