package fo5;

/* loaded from: classes14.dex */
public final class k0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f346542d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f346543e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bp5.h f346544f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(fo5.r0 r0Var, int i17, bp5.h hVar) {
        super(3);
        this.f346542d = r0Var;
        this.f346543e = i17;
        this.f346544f = hVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        ((java.lang.Number) obj2).intValue();
        ((java.lang.Number) obj3).intValue();
        ro5.b bVar = this.f346542d.f346630p;
        if (bVar != null) {
            bVar.i(this.f346543e, this.f346544f);
            return jz5.f0.f384359a;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderController");
        throw null;
    }
}
