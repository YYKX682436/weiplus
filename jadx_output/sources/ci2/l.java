package ci2;

/* loaded from: classes10.dex */
public final class l extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ci2.n f41686d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ci2.n nVar) {
        super(1);
        this.f41686d = nVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        ci2.n nVar = this.f41686d;
        nVar.f41694h = true;
        nVar.f41691e.f262201b.setColor(intValue);
        return jz5.f0.f302826a;
    }
}
