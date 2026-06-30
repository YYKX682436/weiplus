package lc3;

/* loaded from: classes7.dex */
public abstract class b0 extends lc3.c0 {

    /* renamed from: d, reason: collision with root package name */
    public yz5.l f399419d;

    /* renamed from: e, reason: collision with root package name */
    public final int f399420e = -1;

    @Override // lc3.c0
    public final boolean g() {
        return false;
    }

    public lc3.b0 r() {
        java.lang.Object newInstance = getClass().newInstance();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(newInstance, "newInstance(...)");
        return (lc3.b0) newInstance;
    }

    public final yz5.l s() {
        yz5.l lVar = this.f399419d;
        if (lVar != null) {
            return lVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
        throw null;
    }

    public abstract void t(lc3.a0 a0Var);
}
