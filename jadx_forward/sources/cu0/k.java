package cu0;

/* loaded from: classes5.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f303854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f303855e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ cu0.x f303856f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f303857g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(yz5.a aVar, yz5.l lVar, cu0.x xVar, int i17) {
        super(0);
        this.f303854d = aVar;
        this.f303855e = lVar;
        this.f303856f = xVar;
        this.f303857g = i17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        jz5.l lVar = (jz5.l) this.f303854d.mo152xb9724478();
        int intValue = ((java.lang.Number) lVar.f384366d).intValue();
        int intValue2 = ((java.lang.Number) lVar.f384367e).intValue();
        if (this.f303855e != null) {
            this.f303856f.f303886c.e(e06.p.f(intValue, 0, this.f303857g) / this.f303857g);
        }
        return new jz5.l(java.lang.Integer.valueOf(intValue), java.lang.Integer.valueOf(intValue2));
    }
}
