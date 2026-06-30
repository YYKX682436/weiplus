package mm2;

/* loaded from: classes3.dex */
public final class s extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mm2.w f410916d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(mm2.w wVar) {
        super(2);
        this.f410916d = wVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj).longValue();
        long longValue = ((java.lang.Number) obj2).longValue();
        mm2.h hVar = this.f410916d.f411037p;
        if (hVar != null) {
            hVar.m147955xa7077af8(longValue);
        }
        return jz5.f0.f384359a;
    }
}
