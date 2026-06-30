package bm2;

/* loaded from: classes3.dex */
public final class m extends in5.q0 {

    /* renamed from: h, reason: collision with root package name */
    public final gk2.e f22074h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f22075i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.ArrayList f22076m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f22077n;

    /* renamed from: o, reason: collision with root package name */
    public final dk2.vg f22078o;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.ArrayList f22079p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.q f22080q;

    /* renamed from: r, reason: collision with root package name */
    public yz5.q f22081r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f22082s;

    public m(gk2.e liveData) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        this.f22074h = liveData;
        this.f22075i = "FinderLiveAnchorMusicAdapter";
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f22076m = arrayList;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        this.f22077n = arrayList2;
        dk2.vg vgVar = new dk2.vg(new r45.d22(), 0, 0, 1, false, 0L, 48, null);
        this.f22078o = vgVar;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        this.f22079p = arrayList3;
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Hk();
        this.f22082s = true;
        zl2.q4.f473933a.R("FinderLiveAnchorMusicAdapter");
        arrayList2.add(vgVar);
        arrayList3.addAll(((mm2.c1) liveData.a(mm2.c1.class)).Z6().f233877f);
        arrayList.addAll(arrayList2);
        arrayList.addAll(arrayList3);
    }

    @Override // in5.q0
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public void x(bm2.g holder, int i17) {
        kotlin.jvm.internal.o.g(holder, "holder");
        if (!(holder instanceof bm2.i)) {
            if (holder instanceof bm2.h) {
                int size = this.f22079p.size();
                android.widget.TextView textView = ((bm2.h) holder).f21922e;
                kotlin.jvm.internal.o.f(textView, "<get-musicCount>(...)");
                com.tencent.mm.ui.fk.a(textView);
                textView.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.d4q, java.lang.Integer.valueOf(size)));
                return;
            }
            return;
        }
        bm2.i iVar = (bm2.i) holder;
        java.lang.Object obj = this.f22076m.get(i17);
        kotlin.jvm.internal.o.f(obj, "get(...)");
        dk2.vg vgVar = (dk2.vg) obj;
        android.content.res.Resources resources = iVar.itemView.getContext().getResources();
        java.lang.String string = vgVar.f234254a.getString(2);
        no0.l lVar = no0.m.f338730a;
        r45.d22 d22Var = vgVar.f234254a;
        java.lang.String string2 = resources.getString(com.tencent.mm.R.string.d4r, string, lVar.b(d22Var.getInteger(12), ":"));
        kotlin.jvm.internal.o.f(string2, "getString(...)");
        mn2.d1 d1Var = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue());
        mn2.q3 q3Var = new mn2.q3(d22Var.getString(4), com.tencent.mm.plugin.finder.storage.y90.f128356f);
        yo0.f fVar = new yo0.f();
        fVar.f464083g = com.tencent.mm.R.drawable.co_;
        wo0.c b17 = d1Var.b(q3Var, fVar.a());
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = iVar.f21957f;
        kotlin.jvm.internal.o.f(mMRoundCornerImageView, "<get-musicCover>(...)");
        ((wo0.b) b17).b(mMRoundCornerImageView, true);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.lang.String string3 = d22Var.getString(1);
        android.widget.TextView textView2 = iVar.f21958g;
        float textSize = textView2.getTextSize();
        ((ke0.e) xVar).getClass();
        textView2.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context, string3, textSize));
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        android.widget.TextView textView3 = iVar.f21959h;
        float textSize2 = textView3.getTextSize();
        ((ke0.e) xVar2).getClass();
        textView3.setText(com.tencent.mm.pluginsdk.ui.span.c0.j(context2, string2, textSize2));
        com.tencent.mm.view.MMPAGView mMPAGView = iVar.f21956e;
        if (mMPAGView != null) {
            boolean z17 = this.f22082s && vgVar.f234255b == 1;
            if (iVar.f21962n || !z17) {
                android.view.View view = iVar.f21961m;
                kotlin.jvm.internal.o.f(view, "<get-playingBg>(...)");
                I(mMPAGView, view, vgVar.f234255b);
            } else {
                kotlinx.coroutines.y0 y0Var = iVar.f293120d;
                if (y0Var != null) {
                    kotlinx.coroutines.l.d(y0Var, null, null, new bm2.j(mMPAGView, iVar, this, vgVar, null), 3, null);
                }
            }
        }
        int i18 = vgVar.f234255b;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = iVar.f21960i;
        if (i18 == 1) {
            weImageView.setVisibility(0);
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_pause);
        } else if (i18 != 2) {
            weImageView.setVisibility(8);
        } else {
            weImageView.setVisibility(0);
            weImageView.setImageResource(com.tencent.mm.R.raw.icons_filled_play);
        }
        iVar.itemView.setOnClickListener(new bm2.k(this, i17, vgVar));
        iVar.itemView.setOnLongClickListener(new bm2.l(this, i17, vgVar));
    }

    public final void I(com.tencent.mm.view.MMPAGView mMPAGView, android.view.View view, int i17) {
        boolean z17 = this.f22082s;
        if (i17 == 1) {
            if (!z17) {
                mMPAGView.setVisibility(8);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            mMPAGView.setVisibility(0);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
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
            yj0.a.d(view, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        if (!z17) {
            mMPAGView.setVisibility(8);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
            arrayList4.add(8);
            java.util.Collections.reverse(arrayList4);
            yj0.a.d(view, arrayList4.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal5 = zj0.c.f473285a;
        arrayList5.add(0);
        java.util.Collections.reverse(arrayList5);
        yj0.a.d(view, arrayList5.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveAnchorMusicAdapter", "setPagViewState", "(Lcom/tencent/mm/view/MMPAGView;Landroid/view/View;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mMPAGView.n();
        mMPAGView.setProgress(0.0d);
        mMPAGView.setVisibility(0);
    }

    public final void b(boolean z17) {
        java.util.ArrayList arrayList = this.f22077n;
        arrayList.clear();
        arrayList.add(this.f22078o);
        java.util.ArrayList arrayList2 = this.f22079p;
        arrayList2.clear();
        arrayList2.addAll(((mm2.c1) this.f22074h.a(mm2.c1.class)).Z6().f233877f);
        java.util.ArrayList arrayList3 = this.f22076m;
        arrayList3.clear();
        arrayList3.addAll(arrayList);
        arrayList3.addAll(arrayList2);
        if (z17) {
            notifyDataSetChanged();
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f22076m.size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((dk2.vg) this.f22076m.get(i17)).f234257d;
    }

    @Override // in5.q0
    public void y(in5.r0 r0Var, int i17, java.util.List payloads) {
        bm2.g holder = (bm2.g) r0Var;
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
            return new bm2.h(this, inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.amj, parent, false);
        kotlin.jvm.internal.o.d(inflate2);
        return new bm2.i(this, inflate2);
    }
}
