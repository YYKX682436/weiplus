package fr5;

/* loaded from: classes15.dex */
public final class y extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ er5.g f347565d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fr5.f0 f347566e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(er5.g gVar, fr5.f0 f0Var) {
        super(2);
        this.f347565d = gVar;
        this.f347566e = f0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        int intValue = ((java.lang.Number) obj2).intValue();
        er5.g gVar = this.f347565d;
        boolean z17 = true;
        boolean b17 = gVar.b(1);
        boolean a17 = gVar.a(booleanValue, intValue);
        boolean b18 = gVar.b(4);
        zq5.l lVar = this.f347566e.f347472d;
        if ((!b17 || !a17) && (!b18 || lVar == null)) {
            z17 = false;
        }
        return java.lang.Boolean.valueOf(z17);
    }
}
