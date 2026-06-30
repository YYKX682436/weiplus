package x51;

/* loaded from: classes16.dex */
public class b0 implements p5.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ x51.d0 f533507a;

    public b0(x51.d0 d0Var) {
        this.f533507a = d0Var;
    }

    @Override // p5.h
    public java.lang.Object a(p5.m mVar) {
        java.lang.Object obj;
        synchronized (mVar.f433518a) {
            obj = mVar.f433520c;
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            return (java.lang.String) this.f533507a.f533517a.call();
        }
        return null;
    }
}
