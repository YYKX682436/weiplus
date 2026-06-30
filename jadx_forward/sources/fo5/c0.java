package fo5;

/* loaded from: classes11.dex */
public final class c0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f346495d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(fo5.r0 r0Var) {
        super(0);
        this.f346495d = r0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ro5.b bVar = this.f346495d.f346630p;
        if (bVar != null) {
            return java.lang.Boolean.valueOf(bVar.mo162803xc7cd3f2e());
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderController");
        throw null;
    }
}
