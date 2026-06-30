package bm2;

/* loaded from: classes10.dex */
public final class p8 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 implements bm2.x8 {

    /* renamed from: d, reason: collision with root package name */
    public final gk2.e f103764d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f103765e;

    /* renamed from: f, reason: collision with root package name */
    public yz5.l f103766f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.l f103767g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f103768h;

    /* renamed from: i, reason: collision with root package name */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 f103769i;

    public p8(gk2.e liveData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveData, "liveData");
        this.f103764d = liveData;
        this.f103765e = new java.util.ArrayList();
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Hk();
        this.f103768h = true;
        zl2.q4.f555466a.R("FinderLiveVisitorSingSongNewListAdapter");
    }

    @Override // bm2.x8
    public void b(boolean z17) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4;
        java.util.ArrayList arrayList = this.f103765e;
        arrayList.clear();
        gk2.e eVar = this.f103764d;
        arrayList.addAll(((mm2.m6) eVar.a(mm2.m6.class)).f410782q.f315618a);
        mm2.j7 j7Var = (mm2.j7) ((mm2.m6) eVar.a(mm2.m6.class)).f410777i.mo3195x754a37bb();
        java.lang.String str = j7Var != null ? j7Var.f410717b : null;
        if (z17) {
            m8146xced61ae5();
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
            } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.z22) it.next()).f473162f, str)) {
                break;
            } else {
                i17++;
            }
        }
        if (i17 >= 0 && (c1163xf1deaba4 = this.f103769i) != null) {
            c1163xf1deaba4.post(new bm2.o8(this, i17));
        }
        ((mm2.m6) eVar.a(mm2.m6.class)).f410777i.mo7808x76db6cb1(null);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f103765e.size();
    }

    @Override // bm2.x8
    public void m() {
        this.f103765e.clear();
        m8146xced61ae5();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var, int i17) {
        bm2.m8 holder = (bm2.m8) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        fn2.c cVar = holder.f103653h;
        if (cVar != null) {
            cVar.a();
        }
        holder.f103653h = null;
        if (i17 >= 0) {
            java.util.ArrayList arrayList = this.f103765e;
            if (i17 >= arrayList.size()) {
                return;
            }
            java.lang.Object obj = arrayList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            r45.z22 z22Var = (r45.z22) obj;
            r45.by1 by1Var = z22Var.f473164h;
            r45.ay1 ay1Var = by1Var != null ? by1Var.f452676d : null;
            holder.f103649d.A(ay1Var != null ? ay1Var.f451884e : null, ay1Var != null ? ay1Var.f451886g : null, ay1Var != null ? ay1Var.f451887h : 0, ay1Var != null ? ay1Var.f451888i : null, z22Var.f473161e);
            long j17 = z22Var.f473166m;
            android.widget.TextView textView = holder.f103650e;
            if (j17 > 0) {
                textView.setText(java.lang.String.valueOf(j17));
                textView.setVisibility(0);
            } else {
                textView.setVisibility(8);
            }
            bm2.p8 p8Var = holder.f103654i;
            holder.f103651f.setOnClickListener(new bm2.l8(p8Var, z22Var));
            mm2.j6 j6Var = (mm2.j6) ((p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) ((mm2.m6) p8Var.f103764d.a(mm2.m6.class)).f410784s).mo144003x754a37bb();
            holder.f103652g = j6Var instanceof mm2.h6 ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mm2.h6) j6Var).f410646a.f473162f, z22Var.f473162f) ? bm2.n8.f103702e : bm2.n8.f103701d : j6Var instanceof mm2.i6 ? p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((mm2.i6) j6Var).f410674a.f473162f, z22Var.f473162f) ? bm2.n8.f103702e : bm2.n8.f103701d : bm2.n8.f103701d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.p1548x1e28afad.p1549xaf3f29eb.C14424xe21e01a c14424xe21e01a = holder.f103649d;
            android.view.View f201314w = c14424xe21e01a.getF201314w();
            com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b mo10749x89e0979c = c14424xe21e01a.mo10749x89e0979c();
            android.widget.TextView a17 = c14424xe21e01a.getA();
            int ordinal = holder.f103652g.ordinal();
            if (ordinal == 0) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(f201314w, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorSingSongNewListAdapter$NewSongViewHolder", "updateUIByState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                f201314w.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(f201314w, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorSingSongNewListAdapter$NewSongViewHolder", "updateUIByState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                mo10749x89e0979c.setVisibility(8);
                mo10749x89e0979c.n();
                a17.setTextColor(holder.f3639x46306858.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.abw));
                return;
            }
            if (ordinal != 1) {
                return;
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(f201314w, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorSingSongNewListAdapter$NewSongViewHolder", "updateUIByState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            f201314w.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(f201314w, "com/tencent/mm/plugin/finder/live/view/adapter/FinderLiveVisitorSingSongNewListAdapter$NewSongViewHolder", "updateUIByState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            if (p8Var.f103768h) {
                mo10749x89e0979c.setVisibility(0);
                mo10749x89e0979c.g();
            }
            a17.setTextColor(holder.f3639x46306858.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560739su));
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ecc, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
        return new bm2.m8(this, inflate);
    }

    public final void x(int i17) {
        if (i17 < 0 || i17 >= this.f103765e.size()) {
            return;
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = this.f103769i;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 p07 = c1163xf1deaba4 != null ? c1163xf1deaba4.p0(i17) : null;
        if (p07 instanceof bm2.m8) {
            bm2.m8 m8Var = (bm2.m8) p07;
            fn2.c cVar = m8Var.f103653h;
            if (cVar != null) {
                cVar.a();
            }
            m8Var.f103653h = null;
            fn2.d dVar = fn2.d.f345775a;
            android.view.View itemView = m8Var.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            android.content.Context context = m8Var.f3639x46306858.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            m8Var.f103653h = dVar.a(itemView, context);
        }
    }
}
