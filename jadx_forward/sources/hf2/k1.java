package hf2;

/* loaded from: classes10.dex */
public final class k1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hf2.p1 f362627d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f362628e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k1(hf2.p1 p1Var, v65.n nVar) {
        super(3);
        this.f362627d = p1Var;
        this.f362628e = nVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        android.graphics.Bitmap bitmap = (android.graphics.Bitmap) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        r45.ei0 restoreData = (r45.ei0) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(restoreData, "restoreData");
        hf2.p1 p1Var = this.f362627d;
        p1Var.f362669a.q7("dropBitmap", bitmap, booleanValue, restoreData, true);
        qc0.g1 g1Var = p1Var.f362672d;
        if (g1Var != null) {
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2013x8f55093d.C17090xc5b6aeb7) g1Var).d();
        }
        p1Var.f362672d = null;
        this.f362628e.a(java.lang.Boolean.TRUE);
        return jz5.f0.f384359a;
    }
}
