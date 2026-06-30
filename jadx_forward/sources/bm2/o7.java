package bm2;

/* loaded from: classes11.dex */
public final class o7 extends com.p314xaae8f345.mm.ui.p2690x38b72420.a5 {

    /* renamed from: n, reason: collision with root package name */
    public final java.util.ArrayList f103738n;

    /* renamed from: o, reason: collision with root package name */
    public android.database.Cursor f103739o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o7(com.p314xaae8f345.mm.ui.p2690x38b72420.AbstractActivityC22312xbd689c47 selectContactUI, java.util.List list, boolean z17, boolean z18) {
        super(selectContactUI, list, z17, z18);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectContactUI, "selectContactUI");
        this.f103738n = new java.util.ArrayList();
        s();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f103738n.size();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        java.lang.Object obj = this.f103738n.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        java.lang.String str = (java.lang.String) obj;
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 L = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().L(str);
        if (L == null) {
            L = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(str);
        }
        bm2.r5 r5Var = new bm2.r5(i17);
        r5Var.f(L);
        r5Var.f288369e = this.f288611f;
        return r5Var;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.a5
    public void s() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderLiveRoomAdapter", "resetData");
        android.database.Cursor cursor = this.f103739o;
        if (cursor != null) {
            if (cursor != null) {
                cursor.close();
            }
            this.f103739o = null;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.m4 Di = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
        java.util.List list = this.f288121m;
        l75.e0 e0Var = pp.a.f438897e2;
        android.database.Cursor C = Di.C(5, list, null, this.f288120i, "");
        this.f103739o = C;
        if (C != null) {
            while (C.moveToNext()) {
                java.lang.String string = C.getString(C.getColumnIndex(dm.i4.f66875xa013b0d5));
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                java.util.ArrayList arrayList = this.f103738n;
                if (!arrayList.contains(string)) {
                    arrayList.add(string);
                }
            }
            C.close();
        }
    }
}
