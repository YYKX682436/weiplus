package c61;

/* loaded from: classes3.dex */
public final class r7 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ nn0.c f120808d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.p f120809e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r7(nn0.c cVar, yz5.p pVar) {
        super(3);
        this.f120808d = cVar;
        this.f120809e = pVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        android.content.Intent it = (android.content.Intent) obj3;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g((ug5.v) obj2, "<anonymous parameter 1>");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        if (!booleanValue) {
            mn0.b0.C(this.f120808d, true, false, false, 6, null);
        }
        this.f120809e.mo149xb9724478(java.lang.Boolean.valueOf(booleanValue), it);
        return jz5.f0.f384359a;
    }
}
