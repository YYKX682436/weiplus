package bm2;

/* loaded from: classes11.dex */
public final class o5 extends com.p314xaae8f345.mm.ui.p2690x38b72420.a5 {

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f103722n;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f103723o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f103724p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.List f103725q;

    /* renamed from: r, reason: collision with root package name */
    public android.database.Cursor f103726r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f103727s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o5(com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 abstractActivityC22312xbd689c47, java.util.List list, boolean z17, boolean z18, java.util.List forbidChosenContactList, java.util.List outChosenContactList, boolean z19, java.util.List allowSelectContactList) {
        super(abstractActivityC22312xbd689c47, list, z17, true);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forbidChosenContactList, "forbidChosenContactList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(outChosenContactList, "outChosenContactList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(allowSelectContactList, "allowSelectContactList");
        this.f103722n = forbidChosenContactList;
        this.f103723o = outChosenContactList;
        this.f103724p = z19;
        this.f103725q = allowSelectContactList;
        this.f103727s = new java.util.ArrayList();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveMultiChatRoomAdapter", "create!");
        s();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((java.util.ArrayList) this.f103727s).size();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        java.lang.String str = (java.lang.String) ((java.util.ArrayList) this.f103727s).get(i17);
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 L = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(str);
        if (L == null) {
            L = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(str);
        }
        bm2.r5 r5Var = new bm2.r5(i17);
        r5Var.f(L);
        r5Var.f288369e = this.f288611f;
        if (kz5.n0.O(this.f103722n, str) || kz5.n0.O(this.f103723o, str)) {
            r5Var.F = true;
        }
        return r5Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public void s() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveMultiChatRoomAdapter", "resetData");
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        java.util.List list = this.f288121m;
        l75.e0 e0Var = pp.a.f438897e2;
        this.f103726r = Di.C(1, list, null, this.f288120i, "");
        h();
        android.database.Cursor cursor = this.f103726r;
        if (cursor != null) {
            while (cursor.moveToNext()) {
                java.lang.String string = cursor.getString(cursor.getColumnIndex(dm.i4.f66875xa013b0d5));
                java.util.List list2 = this.f103727s;
                if (!list2.contains(string)) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
                    boolean z17 = false;
                    if (!this.f103724p || this.f103725q.contains(string)) {
                        java.lang.String[] HELPER = c01.e2.f118665p;
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(HELPER, "HELPER");
                        int length = HELPER.length;
                        int i17 = 0;
                        while (true) {
                            if (i17 < length) {
                                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(string, HELPER[i17])) {
                                    break;
                                } else {
                                    i17++;
                                }
                            } else if (!com.p314xaae8f345.mm.p2621x8fb0427b.z3.q4(string) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.p4(string) && !com.p314xaae8f345.mm.p2621x8fb0427b.z3.m4(string)) {
                                z17 = !c01.e2.G(string);
                            }
                        }
                    }
                    if (z17) {
                        list2.add(string);
                    }
                }
            }
        }
    }
}
