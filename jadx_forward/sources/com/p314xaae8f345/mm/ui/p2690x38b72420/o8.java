package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public class o8 extends com.p314xaae8f345.mm.ui.p2690x38b72420.a5 implements l75.z0 {

    /* renamed from: n, reason: collision with root package name */
    public android.database.Cursor f288587n;

    /* renamed from: o, reason: collision with root package name */
    public android.database.Cursor f288588o;

    /* renamed from: p, reason: collision with root package name */
    public android.database.Cursor f288589p;

    /* renamed from: q, reason: collision with root package name */
    public int f288590q;

    /* renamed from: r, reason: collision with root package name */
    public int f288591r;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f288592s;

    /* renamed from: t, reason: collision with root package name */
    public final int f288593t;

    /* renamed from: u, reason: collision with root package name */
    public int f288594u;

    /* renamed from: v, reason: collision with root package name */
    public final java.util.Map f288595v;

    /* renamed from: w, reason: collision with root package name */
    public final java.util.Map f288596w;

    /* renamed from: x, reason: collision with root package name */
    public int f288597x;

    /* renamed from: y, reason: collision with root package name */
    public int f288598y;

    public o8(com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47, java.util.List list, boolean z17, boolean z18, boolean z19, int i17) {
        super(abstractActivityC22312xbd689c47, list, z17, z18);
        this.f288590q = -1;
        this.f288591r = -1;
        this.f288593t = 0;
        this.f288594u = 0;
        this.f288595v = new java.util.HashMap();
        this.f288596w = new java.util.HashMap();
        this.f288597x = 0;
        this.f288598y = 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentConversationAdapter", "create!");
        this.f288592s = z19;
        this.f288593t = i17;
        s();
    }

    @Override // l75.z0
    public void g(int i17, l75.a1 a1Var, java.lang.Object obj) {
        s();
        notifyDataSetChanged();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        android.database.Cursor cursor = this.f288589p;
        if (cursor != null) {
            return cursor.getCount() + this.f288594u;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RecentConversationAdapter", "getCount: dataCursor == null ");
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0126  */
    /* JADX WARN: Type inference failed for: r0v11, types: [com.tencent.mm.ui.contact.item.a, com.tencent.mm.ui.contact.item.c0, com.tencent.mm.ui.contact.item.d] */
    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int r9) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2690x38b72420.o8.j(int):com.tencent.mm.ui.contact.item.d");
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public void k() {
        h();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentConversationAdapter", "finish!");
        t();
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().e(this);
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public void s() {
        java.util.List d17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentConversationAdapter", "resetData");
        t();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f288598y = 0;
        int i17 = this.f288593t;
        if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(i17, 4)) {
            d17 = com.p314xaae8f345.mm.ui.p2690x38b72420.k3.c();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(d17)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
                java.util.List list = this.f288121m;
                l75.e0 e0Var = pp.a.f438897e2;
                this.f288588o = Di.t(d17, 3, list, null, this.f288120i, "");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentConversationAdapter", "resetData: recent forward control switch on");
            com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di2 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            java.util.List list2 = this.f288121m;
            l75.e0 e0Var2 = pp.a.f438897e2;
            this.f288587n = Di2.C(3, list2, null, this.f288120i, "");
        } else if (com.p314xaae8f345.mm.ui.p2690x38b72420.i5.d(i17, 16)) {
            d17 = com.p314xaae8f345.mm.ui.p2690x38b72420.k3.b();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(d17)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di3 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
                java.util.List list3 = this.f288121m;
                l75.e0 e0Var3 = pp.a.f438897e2;
                this.f288588o = Di3.t(d17, 5, list3, null, this.f288120i, "");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentConversationAdapter", "resetData: recent forward control switch on");
            com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di4 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            java.util.List list4 = this.f288121m;
            l75.e0 e0Var4 = pp.a.f438897e2;
            this.f288587n = Di4.C(5, list4, null, this.f288120i, "");
        } else {
            d17 = com.p314xaae8f345.mm.ui.p2690x38b72420.k3.d();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(d17)) {
                com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di5 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
                java.util.List list5 = this.f288121m;
                l75.e0 e0Var5 = pp.a.f438897e2;
                this.f288588o = Di5.t(d17, 1, list5, null, this.f288120i, "");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecentConversationAdapter", "resetData: recent forward control switch on");
            com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            java.util.List list6 = this.f288121m;
            l75.e0 e0Var6 = pp.a.f438897e2;
            this.f288587n = Di6.C(1, list6, null, this.f288120i, "");
        }
        int i18 = this.f288592s ? 2 : 0;
        this.f288594u = 0;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.L0(d17)) {
            int count = this.f288588o.getCount();
            this.f288598y = count;
            if (count > 0) {
                arrayList.add(this.f288588o);
                this.f288590q = 0 + i18;
                this.f288594u++;
            }
        }
        if (this.f288587n.getCount() > 0) {
            this.f288594u++;
            int i19 = this.f288590q;
            if (i19 == -1) {
                this.f288591r = i18 + 0;
            } else {
                this.f288591r = i19 + this.f288598y + 1;
            }
        } else {
            this.f288591r = this.f288609d.O3().getHeaderViewsCount();
        }
        arrayList.add(this.f288587n);
        this.f288589p = new android.database.MergeCursor((android.database.Cursor[]) arrayList.toArray(new android.database.Cursor[0]));
        h();
    }

    public final void t() {
        android.database.Cursor cursor = this.f288587n;
        if (cursor != null) {
            cursor.close();
            this.f288587n = null;
        }
        android.database.Cursor cursor2 = this.f288588o;
        if (cursor2 != null) {
            cursor2.close();
            this.f288588o = null;
        }
        android.database.Cursor cursor3 = this.f288589p;
        if (cursor3 != null) {
            cursor3.close();
            this.f288589p = null;
        }
    }
}
