package zo1;

/* loaded from: classes5.dex */
public final class q3 implements com.p314xaae8f345.mm.ui.p2690x38b72420.l4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 f556281d;

    public q3(com.p314xaae8f345.mm.p1006xc5476f33.p1251xacc075c2.p1258xa17a322b.ui.pkg.ActivityC12872x8baa24f8 activityC12872x8baa24f8) {
        this.f556281d = activityC12872x8baa24f8;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public android.widget.ListView O3() {
        android.widget.ListView listView = this.f556281d.f174381e;
        if (listView != null) {
            return listView;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("searchResultLv");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public java.lang.String W5(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return "";
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    /* renamed from: getActivity */
    public android.app.Activity mo8774x19263085() {
        return this.f556281d;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean p5(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean t4(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        wo1.v vVar;
        if (dVar == null || (vVar = this.f556281d.f174394u) == null) {
            return false;
        }
        return vVar.m174241x17bd99e5(dVar.f288383s);
    }
}
