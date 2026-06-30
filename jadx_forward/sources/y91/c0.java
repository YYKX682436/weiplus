package y91;

/* loaded from: classes16.dex */
public class c0 implements r56.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ z91.a f541796d;

    public c0(y91.i0 i0Var, z91.a aVar) {
        this.f541796d = aVar;
    }

    @Override // r56.b
    /* renamed from: call */
    public void mo131526x2e7a5e(java.lang.Object obj) {
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        if (th6 != null && th6.getMessage() != null) {
            int i17 = y91.i0.f541814h;
            v91.b.a("i0", "sendTcpCustom fail: " + th6.getMessage());
        }
        z91.a aVar = this.f541796d;
        if (aVar != null) {
            aVar.a(null);
        }
    }
}
