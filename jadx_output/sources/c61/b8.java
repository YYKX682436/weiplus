package c61;

/* loaded from: classes3.dex */
public final class b8 extends kotlin.jvm.internal.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws5.f f38896d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f38897e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(ws5.f fVar, yz5.p pVar) {
        super(3);
        this.f38896d = fVar;
        this.f38897e = pVar;
    }

    @Override // yz5.q
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent intent = (android.content.Intent) obj3;
        kotlin.jvm.internal.o.g((ug5.v) obj2, "<anonymous parameter 1>");
        kotlin.jvm.internal.o.g(intent, "intent");
        if (!booleanValue) {
            java.lang.Object q17 = this.f38896d.q();
            nn0.c cVar = q17 instanceof nn0.c ? (nn0.c) q17 : null;
            if (cVar != null) {
                mn0.b0.C(cVar, true, false, false, 6, null);
            }
        }
        this.f38897e.invoke(java.lang.Boolean.valueOf(booleanValue), intent);
        return jz5.f0.f302826a;
    }
}
