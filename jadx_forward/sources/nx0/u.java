package nx0;

/* loaded from: classes5.dex */
public final class u extends p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f422765d;

    /* renamed from: e, reason: collision with root package name */
    public final yo0.i f422766e;

    /* renamed from: f, reason: collision with root package name */
    public int f422767f;

    /* renamed from: g, reason: collision with root package name */
    public yz5.p f422768g;

    public u(java.util.List beautyItemList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(beautyItemList, "beautyItemList");
        this.f422765d = beautyItemList;
        yo0.f fVar = new yo0.f();
        fVar.f545611b = true;
        fVar.f545610a = true;
        this.f422766e = fVar.a();
        this.f422767f = -1;
        this.f422768g = nx0.t.f422759d;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemCount */
    public int mo1894x7e414b06() {
        return this.f422765d.size();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: getItemViewType */
    public int mo863xcdaf1228(int i17) {
        nx0.x xVar = (nx0.x) this.f422765d.get(i17);
        if (xVar instanceof nx0.w) {
            return 0;
        }
        if (xVar instanceof nx0.v) {
            return 1;
        }
        throw new jz5.j();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onBindViewHolder */
    public void mo864xe5e2e48d(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 holder, int i17) {
        java.lang.String string;
        int i18;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        nx0.x xVar = (nx0.x) this.f422765d.get(i17);
        if (xVar instanceof nx0.w) {
            nx0.w wVar = (nx0.w) xVar;
            string = wVar.a() ? holder.f3639x46306858.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mcm) : wVar.f422783c;
        } else {
            if (!(xVar instanceof nx0.v)) {
                throw new jz5.j();
            }
            string = holder.f3639x46306858.getResources().getString(((nx0.v) xVar).f422773b);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        android.view.View view = holder.f3639x46306858;
        if (xVar.f422791a) {
            string = view.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mck, string);
        }
        view.setContentDescription(string);
        if (!(holder instanceof nx0.p)) {
            if (holder instanceof nx0.o) {
                nx0.o oVar = (nx0.o) holder;
                oVar.f422715e.setBackground(i17 == this.f422767f ? k.a.a(holder.f3639x46306858.getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.ckg) : null);
                nx0.v vVar = (nx0.v) xVar;
                com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d = oVar.f422716f;
                c22628xfde5d61d.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ckf);
                c22628xfde5d61d.setImageResource(vVar.f422774c);
                c22628xfde5d61d.setOnClickListener(new nx0.s(this, i17, xVar));
                oVar.f422717g.setText(oVar.f422714d.getString(vVar.f422773b));
                android.view.View view2 = oVar.f422718h;
                i18 = (vVar.f422776e > vVar.f422775d ? 1 : (vVar.f422776e == vVar.f422775d ? 0 : -1)) == 0 ? 4 : 0;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Integer.valueOf(i18));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautyAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautyAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                return;
            }
            return;
        }
        nx0.p pVar = (nx0.p) holder;
        pVar.f422725d.setBackground(i17 == this.f422767f ? k.a.a(holder.f3639x46306858.getContext(), com.p314xaae8f345.mm.R.C30861xcebc809e.ckg) : null);
        nx0.w wVar2 = (nx0.w) xVar;
        pVar.f422727f.setText(wVar2.f422783c);
        boolean a17 = wVar2.a();
        android.widget.ProgressBar progressBar = pVar.f422729h;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22628xfde5d61d c22628xfde5d61d2 = pVar.f422726e;
        if (a17) {
            c22628xfde5d61d2.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.cl8);
            progressBar.setVisibility(8);
        } else {
            vo0.e eVar = vo0.e.f520000a;
            vo0.e.f520001b.c(wVar2.f422784d, c22628xfde5d61d2, this.f422766e);
            progressBar.setVisibility(wVar2.f422785e ? 0 : 8);
        }
        c22628xfde5d61d2.setOnClickListener(new nx0.r(this, i17, xVar));
        android.view.View view3 = pVar.f422728g;
        i18 = wVar2.f422791a ? 0 : 4;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
        arrayList2.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautyAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/mj_publisher/finder/shoot_composing/beautify/BeautyAdapter", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$ViewHolder;I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.f2
    /* renamed from: onCreateViewHolder */
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 mo865x9cc5cacc(android.view.ViewGroup parent, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        if (i17 == 1) {
            android.view.View inflate = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dwj, parent, false);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
            return new nx0.o(this, inflate);
        }
        android.view.View inflate2 = android.view.LayoutInflater.from(parent.getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dwi, parent, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate2);
        return new nx0.p(this, inflate2);
    }

    public final void x(boolean z17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.List list = this.f422765d;
        for (java.lang.Object obj : list) {
            if (((nx0.x) obj) instanceof nx0.w) {
                arrayList.add(obj);
            }
        }
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj2 : list) {
            if (((nx0.x) obj2) instanceof nx0.v) {
                arrayList2.add(obj2);
            }
        }
        int size2 = arrayList2.size();
        kz5.h0.B(list, nx0.q.f422733d);
        if (z17) {
            m8154xdb81fc7f(size, size2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0037 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[LOOP:0: B:8:0x0012->B:22:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean y() {
        /*
            r5 = this;
            java.util.List r0 = r5.f422765d
            boolean r1 = r0 instanceof java.util.Collection
            r2 = 0
            if (r1 == 0) goto Le
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Le
            goto L38
        Le:
            java.util.Iterator r0 = r0.iterator()
        L12:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r0.next()
            nx0.x r1 = (nx0.x) r1
            boolean r3 = r1 instanceof nx0.v
            r4 = 1
            if (r3 == 0) goto L34
            nx0.v r1 = (nx0.v) r1
            float r3 = r1.f422776e
            float r1 = r1.f422775d
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L2f
            r1 = r4
            goto L30
        L2f:
            r1 = r2
        L30:
            if (r1 != 0) goto L34
            r1 = r4
            goto L35
        L34:
            r1 = r2
        L35:
            if (r1 == 0) goto L12
            r2 = r4
        L38:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: nx0.u.y():boolean");
    }

    public final void z() {
        int i17 = 0;
        for (java.lang.Object obj : this.f422765d) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            nx0.x xVar = (nx0.x) obj;
            if ((xVar instanceof nx0.v) && xVar.f422791a) {
                xVar.f422791a = false;
                m8147xed6e4d18(i17);
            }
            i17 = i18;
        }
    }
}
