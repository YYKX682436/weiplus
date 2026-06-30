package pv0;

/* loaded from: classes5.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pv0.m f440068d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(pv0.m mVar) {
        super(2);
        this.f440068d = mVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        int intValue = ((java.lang.Number) obj).intValue();
        dw0.c filter = (dw0.c) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filter, "filter");
        pv0.m.K(this.f440068d, intValue, filter);
        return jz5.f0.f384359a;
    }
}
