package zo1;

/* loaded from: classes11.dex */
public final class d3 extends com.p314xaae8f345.mm.ui.p2690x38b72420.o4 implements rd0.z0 {

    /* renamed from: m, reason: collision with root package name */
    public final rd0.a1 f556114m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(com.p314xaae8f345.mm.ui.p2690x38b72420.l4 selectContactUI, rd0.b1 resultFilter) {
        super(selectContactUI, true, 14);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selectContactUI, "selectContactUI");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultFilter, "resultFilter");
        ((rd0.j1) i95.n0.c(rd0.j1.class)).getClass();
        qd0.n0 n0Var = new qd0.n0(this, kn1.k.s());
        n0Var.f443104v = resultFilter;
        this.f556114m = n0Var;
    }

    @Override // rd0.z0
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d a(int i17, int i18) {
        return ((qd0.n0) this.f556114m).f(i17, i18);
    }

    @Override // rd0.z0
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d c(int i17) {
        return ((qd0.n0) this.f556114m).d(i17);
    }

    @Override // rd0.z0
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d d(int i17) {
        return ((qd0.n0) this.f556114m).c(i17);
    }

    @Override // rd0.z0
    public void f(java.lang.String str, boolean z17) {
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((qd0.n0) this.f556114m).f443108z;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p4
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d j(int i17) {
        com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d e17 = ((qd0.n0) this.f556114m).e(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "createDataItemImpl(...)");
        return e17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.o4
    public void r() {
        ((qd0.n0) this.f556114m).i();
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.o4
    public void s(java.lang.String str, int[] iArr, boolean z17) {
        ((qd0.n0) this.f556114m).g(str, iArr, z17);
    }
}
