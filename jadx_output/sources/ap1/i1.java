package ap1;

/* loaded from: classes11.dex */
public final class i1 extends com.tencent.mm.ui.contact.o4 implements rd0.z0 {

    /* renamed from: m, reason: collision with root package name */
    public final rd0.a1 f12687m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(com.tencent.mm.ui.contact.l4 selectContactUI, rd0.b1 resultFilter) {
        super(selectContactUI, true, 14);
        kotlin.jvm.internal.o.g(selectContactUI, "selectContactUI");
        kotlin.jvm.internal.o.g(resultFilter, "resultFilter");
        ((rd0.j1) i95.n0.c(rd0.j1.class)).getClass();
        qd0.n0 n0Var = new qd0.n0(this, kn1.k.s());
        n0Var.f361571v = resultFilter;
        this.f12687m = n0Var;
    }

    @Override // rd0.z0
    public com.tencent.mm.ui.contact.item.d a(int i17, int i18) {
        return ((qd0.n0) this.f12687m).f(i17, i18);
    }

    @Override // rd0.z0
    public com.tencent.mm.ui.contact.item.d c(int i17) {
        return ((qd0.n0) this.f12687m).d(i17);
    }

    @Override // rd0.z0
    public com.tencent.mm.ui.contact.item.d d(int i17) {
        return ((qd0.n0) this.f12687m).c(i17);
    }

    @Override // rd0.z0
    public void f(java.lang.String str, boolean z17) {
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return ((qd0.n0) this.f12687m).f361575z;
    }

    @Override // com.tencent.mm.ui.contact.p4
    public com.tencent.mm.ui.contact.item.d j(int i17) {
        com.tencent.mm.ui.contact.item.d e17 = ((qd0.n0) this.f12687m).e(i17);
        kotlin.jvm.internal.o.f(e17, "createDataItemImpl(...)");
        return e17;
    }

    @Override // com.tencent.mm.ui.contact.o4
    public void r() {
        ((qd0.n0) this.f12687m).i();
    }

    @Override // com.tencent.mm.ui.contact.o4
    public void s(java.lang.String str, int[] iArr, boolean z17) {
        ((qd0.n0) this.f12687m).g(str, iArr, z17);
    }
}
