package th5;

/* loaded from: classes12.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ th5.o f500891d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ th5.g0 f500892e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(th5.o oVar, th5.g0 g0Var) {
        super(2);
        this.f500891d = oVar;
        this.f500892e = g0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        long longValue = ((java.lang.Number) obj).longValue();
        long longValue2 = ((java.lang.Number) obj2).longValue();
        if (longValue > 0) {
            float e17 = e06.p.e(((float) longValue2) / ((float) longValue), 0.0f, 1.0f);
            th5.o oVar = this.f500891d;
            oVar.f500957i = e17;
            v65.i.c(this.f500892e.f500481f, null, new th5.c0(oVar, e17, null), 1, null);
        }
        return jz5.f0.f384359a;
    }
}
