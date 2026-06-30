package c61;

/* loaded from: classes3.dex */
public final class b8 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ws5.f f120429d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f120430e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(ws5.f fVar, yz5.p pVar) {
        super(3);
        this.f120429d = fVar;
        this.f120430e = pVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent intent = (android.content.Intent) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((ug5.v) obj2, "<anonymous parameter 1>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        if (!booleanValue) {
            java.lang.Object q17 = this.f120429d.q();
            nn0.c cVar = q17 instanceof nn0.c ? (nn0.c) q17 : null;
            if (cVar != null) {
                mn0.b0.C(cVar, true, false, false, 6, null);
            }
        }
        this.f120430e.mo149xb9724478(java.lang.Boolean.valueOf(booleanValue), intent);
        return jz5.f0.f384359a;
    }
}
