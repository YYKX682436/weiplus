package c61;

/* loaded from: classes.dex */
public final class t7 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f39303d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t7(yz5.p pVar) {
        super(2);
        this.f39303d = pVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent intent = (android.content.Intent) obj2;
        kotlin.jvm.internal.o.g(intent, "intent");
        this.f39303d.invoke(java.lang.Boolean.valueOf(booleanValue), intent);
        return jz5.f0.f302826a;
    }
}
