package c61;

/* loaded from: classes3.dex */
public final class r7 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nn0.c f39275d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f39276e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(nn0.c cVar, yz5.p pVar) {
        super(3);
        this.f39275d = cVar;
        this.f39276e = pVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent it = (android.content.Intent) obj3;
        kotlin.jvm.internal.o.g((ug5.v) obj2, "<anonymous parameter 1>");
        kotlin.jvm.internal.o.g(it, "it");
        if (!booleanValue) {
            mn0.b0.C(this.f39275d, true, false, false, 6, null);
        }
        this.f39276e.invoke(java.lang.Boolean.valueOf(booleanValue), it);
        return jz5.f0.f302826a;
    }
}
