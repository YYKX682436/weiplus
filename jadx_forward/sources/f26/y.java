package f26;

/* loaded from: classes16.dex */
public abstract class y extends f26.x {

    /* renamed from: e, reason: collision with root package name */
    public final f26.z0 f340771e;

    public y(f26.z0 delegate) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(delegate, "delegate");
        this.f340771e = delegate;
    }

    @Override // f26.z0
    /* renamed from: D0 */
    public f26.z0 A0(boolean z17) {
        return z17 == x0() ? this : this.f340771e.A0(z17).C0(v0());
    }

    @Override // f26.z0
    /* renamed from: E0 */
    public f26.z0 C0(f26.r1 newAttributes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(newAttributes, "newAttributes");
        return newAttributes != v0() ? new f26.b1(this, newAttributes) : this;
    }

    @Override // f26.x
    public f26.z0 F0() {
        return this.f340771e;
    }
}
