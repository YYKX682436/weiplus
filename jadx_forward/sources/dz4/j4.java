package dz4;

/* loaded from: classes12.dex */
public final class j4 implements al5.g3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2446xd2ae381c.ActivityC19514xd811c390 f326848d;

    public j4(com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.p2446xd2ae381c.ActivityC19514xd811c390 activityC19514xd811c390) {
        this.f326848d = activityC19514xd811c390;
    }

    @Override // al5.g3
    public void R(int i17, int i18, int i19, int i27, float f17) {
    }

    @Override // al5.g3
    public boolean a(android.view.MotionEvent event) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        return false;
    }

    @Override // al5.g3
    public int b(boolean z17) {
        return 1;
    }

    @Override // al5.g3
    public void c(int i17, int i18) {
        dz4.j0 j0Var;
        com.p314xaae8f345.p3133xd0ce8b26.aff.p3166xd0d3a7c0.i iVar;
        ih0.p wi6 = ((dz4.s1) ((ih0.r) i95.n0.c(ih0.r.class))).wi(this.f326848d.f269645u);
        if (wi6 == null || (j0Var = (dz4.j0) ((jz5.n) ((ez4.u) wi6).f339480f).mo141623x754a37bb()) == null || (iVar = j0Var.f326843b) == null) {
            return;
        }
        iVar.p0();
    }

    @Override // al5.g3
    public boolean d(android.view.MotionEvent ev6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ev6, "ev");
        return false;
    }

    @Override // al5.g3
    public boolean d0() {
        return false;
    }

    @Override // al5.g3
    public int e() {
        return 0;
    }

    @Override // al5.g3
    /* renamed from: enableSwipeBack */
    public boolean mo2163xd71108fe() {
        return true;
    }
}
