package f26;

/* loaded from: classes16.dex */
public final class b1 extends f26.y {

    /* renamed from: f, reason: collision with root package name */
    public final f26.r1 f340661f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(f26.z0 delegate, f26.r1 attributes) {
        super(delegate);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attributes, "attributes");
        this.f340661f = attributes;
    }

    @Override // f26.x
    public f26.x H0(f26.z0 delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        return new f26.b1(delegate, this.f340661f);
    }

    @Override // f26.x, f26.o0
    public f26.r1 v0() {
        return this.f340661f;
    }
}
