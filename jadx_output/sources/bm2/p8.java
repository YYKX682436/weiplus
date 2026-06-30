package bm2;

/* loaded from: classes10.dex */
public final class p8 extends androidx.recyclerview.widget.f2 implements bm2.x8 {

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f22231d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f22232e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f22233f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f22234g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f22235h;

    /* renamed from: i, reason: collision with root package name */
    public androidx.recyclerview.widget.RecyclerView f22236i;

    public p8(gk2.e liveData) {
        kotlin.jvm.internal.o.g(liveData, "liveData");
        this.f22231d = liveData;
        this.f22232e = new java.util.ArrayList();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Hk();
        this.f22235h = true;
        zl2.q4.f473933a.R("FinderLiveVisitorSingSongNewListAdapter");
    }

    @Override // bm2.x8
    public void b(boolean z17) {
        androidx.recyclerview.widget.RecyclerView recyclerView;
        java.util.ArrayList arrayList = this.f22232e;
        arrayList.clear();
        gk2.e eVar = this.f22231d;
        arrayList.addAll(((mm2.m6) eVar.a(mm2.m6.class)).f329249q.f234085a);
        mm2.j7 j7Var = (mm2.j7) ((mm2.m6) eVar.a(mm2.m6.class)).f329244i.getValue();
        java.lang.String str = j7Var != null ? j7Var.f329184b : null;
        if (z17) {
            notifyDataSetChanged();
        }
        int i17 = 0;
        if (str == null || str.length() == 0) {
            return;
        }
        java.util.Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else if (kotlin.jvm.internal.o.b(((r45.z22) it.next()).f391629f, str)) {
                break;
            } else {
                i17++;
            }
        }
        if (i17 >= 0 && (recyclerView = this.f22236i) != null) {
            recyclerView.post(new bm2.o8(this, i17));
        }
        ((mm2.m6) eVar.a(mm2.m6.class)).f329244i.postValue(null);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return this.f22232e.size();
    }

    @Override // bm2.x8
    public void m() {
        this.f22232e.clear();
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        bm2.m8 holder = (bm2.m8) k3Var;
        kotlin.jvm.internal.o.g(holder, "holder");
        fn2.c cVar = holder.f22120h;
        if (cVar != null) {
            cVar.a();
        }
        holder.f22120h = null;
        if (i17 >= 0) {
            java.util.ArrayList arrayList = this.f22232e;
            if (i17 >= arrayList.size()) {
                return;
            }
            java.lang.Object obj = arrayList.get(i17);
            kotlin.jvm.internal.o.f(obj, "get(...)");
            r45.z22 z22Var = (r45.z22) obj;
            r45.by1 by1Var = z22Var.f391631h;
            r45.ay1 ay1Var = by1Var != null ? by1Var.f371143d : null;
            holder.f22116d.A(ay1Var != null ? ay1Var.f370351e : null, ay1Var != null ? ay1Var.f370353g : null, ay1Var != null ? ay1Var.f370354h : 0, ay1Var != null ? ay1Var.f370355i : null, z22Var.f391628e);
            long j17 = z22Var.f391633m;
            android.widget.TextView textView = holder.f22117e;
            if (j17 > 0) {
                textView.setText(java.lang.String.valueOf(j17));
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            bm2.p8 p8Var = holder.f22121i;
            holder.f22118f.setOnClickListener(new bm2.l8(p8Var, z22Var));
            mm2.j6 j6Var = (mm2.j6) ((kotlinx.coroutines.flow.h3) ((mm2.m6) p8Var.f22231d.a(mm2.m6.class)).f329251s).getValue();
            holder.f22119g = j6Var instanceof mm2.h6 ? kotlin.jvm.internal.o.b(((mm2.h6) j6Var).f329113a.f391629f, z22Var.f391629f) ? bm2.n8.f22169e : bm2.n8.f22168d : j6Var instanceof mm2.i6 ? kotlin.jvm.internal.o.b(((mm2.i6) j6Var).f329141a.f391629f, z22Var.f391629f) ? bm2.n8.f22169e : bm2.n8.f22168d : bm2.n8.f22168d;
            com.tencent.mm.plugin.finder.live.widget.singlist.common.FinderLiveSongInfoView finderLiveSongInfoView = holder.f22116d;
            android.view.View f119781w = finderLiveSongInfoView.getF119781w();
            com.tencent.mm.view.MMPAGView auditionPlayingAnim = finderLiveSongInfoView.getAuditionPlayingAnim();
            android.widget.TextView a17 = finderLiveSongInfoView.getA();
            int ordinal = holder.f22119g.ordinal();
            if (ordinal == 0) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(f119781w, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorSingSongNewListAdapter$NewSongViewHolder", "updateUIByState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f119781w.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(f119781w, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorSingSongNewListAdapter$NewSongViewHolder", "updateUIByState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                auditionPlayingAnim.setVisibility(8);
                auditionPlayingAnim.n();
                a17.setTextColor(holder.itemView.getContext().getResources().getColor(com.tencent.mm.R.color.abw));
                return;
            }
            if (ordinal != 1) {
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(f119781w, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorSingSongNewListAdapter$NewSongViewHolder", "updateUIByState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f119781w.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(f119781w, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorSingSongNewListAdapter$NewSongViewHolder", "updateUIByState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (p8Var.f22235h) {
                auditionPlayingAnim.setVisibility(0);
                auditionPlayingAnim.g();
            }
            a17.setTextColor(holder.itemView.getContext().getResources().getColor(com.tencent.mm.R.color.f479206su));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup parent, int i17) {
        kotlin.jvm.internal.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.tencent.mm.R.layout.ecc, parent, false);
        kotlin.jvm.internal.o.d(inflate);
        return new bm2.m8(this, inflate);
    }

    public final void x(int i17) {
        if (i17 < 0 || i17 >= this.f22232e.size()) {
            return;
        }
        androidx.recyclerview.widget.RecyclerView recyclerView = this.f22236i;
        androidx.recyclerview.widget.k3 p07 = recyclerView != null ? recyclerView.p0(i17) : null;
        if (p07 instanceof bm2.m8) {
            bm2.m8 m8Var = (bm2.m8) p07;
            fn2.c cVar = m8Var.f22120h;
            if (cVar != null) {
                cVar.a();
            }
            m8Var.f22120h = null;
            fn2.d dVar = fn2.d.f264242a;
            android.view.View itemView = m8Var.itemView;
            kotlin.jvm.internal.o.f(itemView, "itemView");
            android.content.Context context = m8Var.itemView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            m8Var.f22120h = dVar.a(itemView, context);
        }
    }
}
