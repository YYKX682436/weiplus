package aw2;

/* loaded from: classes10.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ aw2.n f14722d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(aw2.n nVar) {
        super(1);
        this.f14722d = nVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        aw2.n nVar = this.f14722d;
        if (booleanValue) {
            nVar.f14777e.d();
        } else {
            nVar.f14777e.f();
        }
        return jz5.f0.f302826a;
    }
}
