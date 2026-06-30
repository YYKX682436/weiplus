package xm2;

/* loaded from: classes14.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xm2.l f536754d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(xm2.l lVar) {
        super(1);
        this.f536754d = lVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        xm2.l lVar = this.f536754d;
        yz5.l lVar2 = lVar.f536759e;
        if (lVar2 != null) {
            lVar2.mo146xb9724478(lVar.f536755a.get(e06.p.f(intValue, 0, r0.size() - 1)));
        }
        return jz5.f0.f384359a;
    }
}
