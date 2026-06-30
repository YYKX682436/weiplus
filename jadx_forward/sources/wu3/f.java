package wu3;

/* loaded from: classes10.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wu3.h f531266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.MotionEvent f531267e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(wu3.h hVar, android.view.MotionEvent motionEvent) {
        super(2);
        this.f531266d = hVar;
        this.f531267e = motionEvent;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        zu3.f fVar;
        android.graphics.Matrix m17 = (android.graphics.Matrix) obj;
        boolean booleanValue = ((java.lang.Boolean) obj2).booleanValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(m17, "m");
        wu3.h hVar = this.f531266d;
        hVar.f531289u.set(m17);
        hVar.k();
        if (booleanValue && (fVar = hVar.f531286r) != null) {
            fVar.a(hVar, this.f531267e);
        }
        return jz5.f0.f384359a;
    }
}
