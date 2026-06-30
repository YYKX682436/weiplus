package c61;

/* loaded from: classes.dex */
public final class t7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f120836d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(yz5.p pVar) {
        super(2);
        this.f120836d = pVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent intent = (android.content.Intent) obj2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        this.f120836d.mo149xb9724478(java.lang.Boolean.valueOf(booleanValue), intent);
        return jz5.f0.f384359a;
    }
}
