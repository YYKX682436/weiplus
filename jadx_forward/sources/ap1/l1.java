package ap1;

/* loaded from: classes5.dex */
public final class l1 implements com.p314xaae8f345.mm.ui.p2690x38b72420.l4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ap1.p1 f94231d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ap1.p1 f94232e;

    public l1(ap1.p1 p1Var, ap1.p1 p1Var2) {
        this.f94231d = p1Var;
        this.f94232e = p1Var2;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public android.widget.ListView O3() {
        em.c4 c4Var = this.f94232e.f94256e;
        if (c4Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("uiBinding");
            throw null;
        }
        android.widget.ListView d17 = c4Var.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(d17, "getSearchResultLv(...)");
        return d17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public java.lang.String W5(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return "";
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    /* renamed from: getActivity */
    public android.app.Activity mo8774x19263085() {
        return this.f94231d.m158354x19263085();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean p5(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.l4
    public boolean t4(com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d dVar) {
        ap1.c2 c2Var;
        java.lang.String str = dVar != null ? dVar.f288383s : null;
        if (str == null) {
            return false;
        }
        ap1.p1 p1Var = this.f94232e;
        j75.f fVar = p1Var.f94258g;
        if (fVar == null) {
            fVar = p1Var.Q6();
            p1Var.f94258g = fVar;
        }
        if (fVar == null || (c2Var = (ap1.c2) fVar.mo140437x75286adb()) == null) {
            return false;
        }
        return c2Var.d(str);
    }
}
