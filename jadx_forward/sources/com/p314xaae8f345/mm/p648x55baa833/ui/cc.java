package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class cc extends android.widget.BaseAdapter {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f145618d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.a3 f145619e;

    /* renamed from: f, reason: collision with root package name */
    public final android.content.Context f145620f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f145621g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.List f145622h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final vg3.x3 f145623i = (vg3.x3) gm0.j1.s(vg3.x3.class);

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10365x4886147c f145624m;

    public cc(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10365x4886147c activityC10365x4886147c, android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var, java.lang.String str, java.util.List list, java.lang.String str2) {
        this.f145624m = activityC10365x4886147c;
        this.f145619e = a3Var;
        this.f145618d = str;
        this.f145620f = context;
        ((py.a) ((qy.i) i95.n0.c(qy.i.class))).getClass();
        d(c01.v1.m(str));
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public com.p314xaae8f345.mm.p648x55baa833.ui.yb getItem(int i17) {
        return (com.p314xaae8f345.mm.p648x55baa833.ui.yb) this.f145622h.get(i17);
    }

    public void c(java.lang.String str) {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var;
        java.lang.String str2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            this.f145622h = this.f145621g;
        } else {
            for (com.p314xaae8f345.mm.p648x55baa833.ui.yb ybVar : this.f145621g) {
                if (ybVar != null && (z3Var = ybVar.f146225b) != null && ybVar.f146224a == 1) {
                    if (z3Var.w0() == null || !z3Var.w0().toUpperCase().contains(str.toUpperCase())) {
                        java.lang.String d17 = z3Var.d1();
                        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = this.f145619e;
                        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10365x4886147c.U6(a3Var, d17)) && com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10365x4886147c.U6(a3Var, z3Var.d1()).contains(str)) {
                            arrayList.add(ybVar);
                        } else if (z3Var.f2() != null && z3Var.f2().toUpperCase().contains(str.toUpperCase())) {
                            arrayList.add(ybVar);
                        } else if (z3Var.T0() != null && z3Var.T0().toUpperCase().contains(str.toUpperCase())) {
                            arrayList.add(ybVar);
                        } else if (z3Var.t0() != null && z3Var.t0().contains(str)) {
                            arrayList.add(ybVar);
                        } else if (z3Var.d1() != null && z3Var.d1().contains(str)) {
                            arrayList.add(ybVar);
                        } else if (!z3Var.r2()) {
                            com.p314xaae8f345.mm.p2621x8fb0427b.ya z07 = ((com.p314xaae8f345.mm.p2621x8fb0427b.ab) ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).mj()).z0(z3Var.d1());
                            if (z07 != null && (str2 = z07.f66692x4854b29d) != null && str2.toUpperCase().contains(str.toUpperCase())) {
                                arrayList.add(ybVar);
                            }
                        }
                    } else {
                        arrayList.add(ybVar);
                    }
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SeeRoomMemberUI", "[setMemberListBySearch]");
            this.f145622h = arrayList;
        }
        notifyDataSetChanged();
    }

    public void d(java.util.List list) {
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var;
        if (list == null) {
            return;
        }
        this.f145622h.clear();
        int i17 = 0;
        while (true) {
            int size = list.size();
            a3Var = this.f145619e;
            if (i17 >= size) {
                break;
            }
            com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) this.f145623i).Bi().n((java.lang.String) list.get(i17), true);
            if (a3Var.L0(n17.d1())) {
                this.f145622h.add(new com.p314xaae8f345.mm.p648x55baa833.ui.yb(1, n17, 3));
            } else if (a3Var.G0(n17.d1())) {
                this.f145622h.add(new com.p314xaae8f345.mm.p648x55baa833.ui.yb(1, n17, 2));
            } else {
                this.f145622h.add(new com.p314xaae8f345.mm.p648x55baa833.ui.yb(1, n17, 1));
            }
            i17++;
        }
        java.util.Collections.sort(this.f145622h, new com.p314xaae8f345.mm.p648x55baa833.ui.zb(this));
        this.f145622h.add(new com.p314xaae8f345.mm.p648x55baa833.ui.yb(2, null));
        if (a3Var.P0()) {
            this.f145622h.add(new com.p314xaae8f345.mm.p648x55baa833.ui.yb(3, null));
        }
        this.f145621g = this.f145622h;
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f145622h.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i17) {
        return i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d9  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View getView(int r10, android.view.View r11, android.view.ViewGroup r12) {
        /*
            Method dump skipped, instructions count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p648x55baa833.ui.cc.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
