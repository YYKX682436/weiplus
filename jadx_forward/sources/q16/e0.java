package q16;

/* loaded from: classes15.dex */
public final class e0 extends b06.b {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q16.g0 f441258b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(java.lang.Object obj, q16.g0 g0Var) {
        super(obj);
        this.f441258b = g0Var;
    }

    @Override // b06.b
    public boolean d(f06.v property, java.lang.Object obj, java.lang.Object obj2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(property, "property");
        if (this.f441258b.f441263a) {
            throw new java.lang.IllegalStateException("Cannot modify readonly DescriptorRendererOptions");
        }
        return true;
    }
}
