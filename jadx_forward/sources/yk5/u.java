package yk5;

/* loaded from: classes11.dex */
public class u extends com.p314xaae8f345.mm.ui.z9 implements com.p314xaae8f345.mm.p944x882e457a.u0 {
    public bb5.e A;
    public boolean B;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String[] f544438o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f544439p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f544440q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f544441r;

    /* renamed from: s, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 f544442s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.LinkedList f544443t;

    /* renamed from: u, reason: collision with root package name */
    public final android.content.Context f544444u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.List f544445v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f544446w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f544447x;

    /* renamed from: y, reason: collision with root package name */
    public final int f544448y;

    /* renamed from: z, reason: collision with root package name */
    public bb5.g f544449z;

    public u(android.content.Context context, int i17) {
        super(context, new com.p314xaae8f345.mm.p2621x8fb0427b.z3());
        this.f544441r = false;
        this.f544442s = null;
        this.f544443t = new java.util.LinkedList();
        this.f544445v = null;
        this.f544446w = true;
        this.f544447x = false;
        this.f544448y = 1;
        this.f544449z = new bb5.g(15, new yk5.l(this));
        this.A = null;
        this.B = false;
        this.f544444u = context;
        this.f544448y = i17;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        this.f544442s = z3Var;
        z3Var.X1("_find_more_public_contact_");
        this.f544442s.U2();
        this.f544440q = "@micromsg.with.all.biz.qq.com";
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public java.lang.Object d(java.lang.Object obj, android.database.Cursor cursor) {
        com.p314xaae8f345.mm.p2621x8fb0427b.e8 q17 = c01.d9.b().q();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = com.p314xaae8f345.mm.p2621x8fb0427b.z3.M2;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 L = ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) q17).L(cursor.getString(cursor.getColumnIndex(dm.i4.f66875xa013b0d5)));
        if (L != null) {
            return L;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        z3Var.mo9015xbf5d97fd(cursor);
        ((com.p314xaae8f345.mm.p2621x8fb0427b.k4) c01.d9.b().q()).s0(z3Var, false);
        return z3Var;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i17) {
        if (this.f544448y == 2) {
            return 2;
        }
        return v(i17) ? 1 : 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r18, android.view.View r19, android.view.ViewGroup r20) {
        /*
            Method dump skipped, instructions count: 839
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yk5.u.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return 3;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i17) {
        if (!v(i17)) {
            return true;
        }
        java.util.LinkedList linkedList = this.f544443t;
        return !(linkedList == null || linkedList.size() == 0) || this.f544446w;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public int m() {
        if (this.f544441r) {
            return (this.f544442s.u2() ? 0 : this.f544443t.size()) + 1;
        }
        return 0;
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void o() {
        c();
        x(new yk5.q(this, false));
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        if (m1Var.mo808xfb85f7b0() != 106) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.SearchResultAdapter", "error type");
            return;
        }
        this.B = false;
        if (com.p314xaae8f345.mm.ui.pc.a(this.f544444u, i17, i18, str, 7)) {
            this.f544446w = false;
            return;
        }
        if (i17 == 4 && i18 == -4) {
            x(new yk5.s(this));
        } else if (i17 == 0 && i18 == 0) {
            x(new yk5.j(this, m1Var));
        } else {
            x(new yk5.i(this));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.z9
    public void q() {
        x(new yk5.q(this, false));
    }

    @Override // com.p314xaae8f345.mm.ui.z9, android.widget.Adapter
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p2621x8fb0427b.z3 getItem(int i17) {
        return p(i17) ? (com.p314xaae8f345.mm.p2621x8fb0427b.z3) this.f294140d : (com.p314xaae8f345.mm.p2621x8fb0427b.z3) super.getItem(i17);
    }

    public r45.gw5 u(int i17) {
        try {
            this.f544443t.size();
            l();
            return (r45.gw5) this.f544443t.get((i17 - l()) - 1);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SearchResultAdapter", e17, "", new java.lang.Object[0]);
            return null;
        }
    }

    public boolean v(int i17) {
        int l17;
        return this.f544441r && i17 == (l17 = l()) && i17 < l17 + m();
    }

    public boolean w(java.lang.String str) {
        java.util.List list = this.f544445v;
        if (list == null || str == null) {
            return true;
        }
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((java.lang.String) it.next()).equals(str)) {
                return false;
            }
        }
        return true;
    }

    public final void x(java.lang.Runnable runnable) {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new yk5.k(this, runnable));
        } else {
            runnable.run();
            notifyDataSetChanged();
        }
    }

    public void y(boolean z17) {
        this.f544447x = z17;
        if (z17) {
            this.f544442s.U2();
        }
    }
}
