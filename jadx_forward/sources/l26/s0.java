package l26;

/* loaded from: classes16.dex */
public final class s0 extends l26.v0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f396806b;

    public s0(int i17) {
        super("must have exactly " + i17 + " value parameters", null);
        this.f396806b = i17;
    }

    @Override // l26.i
    public boolean b(o06.n0 functionDescriptor) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(functionDescriptor, "functionDescriptor");
        return functionDescriptor.W().size() == this.f396806b;
    }
}
