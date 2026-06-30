package y91;

/* loaded from: classes16.dex */
public class g0 implements r56.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ y91.i0 f541806d;

    public g0(y91.i0 i0Var) {
        this.f541806d = i0Var;
    }

    @Override // r56.b
    /* renamed from: call */
    public void mo131526x2e7a5e(java.lang.Object obj) {
        java.lang.Throwable th6 = (java.lang.Throwable) obj;
        ((java.util.HashSet) this.f541806d.f541821g).clear();
        if (th6 == null || th6.getMessage() == null) {
            int i17 = y91.i0.f541814h;
            v91.b.a("i0", "get mDevice info err");
        } else {
            int i18 = y91.i0.f541814h;
            v91.b.a("i0", "get mDevice info err:" + th6.getMessage());
        }
    }
}
