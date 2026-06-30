package t23;

/* loaded from: classes10.dex */
public class k0 implements t23.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t23.o0 f496732a;

    public k0(t23.o0 o0Var) {
        this.f496732a = o0Var;
    }

    @Override // t23.n0
    public java.lang.String a() {
        return "";
    }

    @Override // t23.n0
    public void b(java.lang.String str) {
        t23.o0 o0Var = this.f496732a;
        o0Var.f496747e.size();
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (!o0Var.f496747e.containsKey(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.GalleryCache", "not hit!!!");
            return;
        }
        t23.n0 n0Var = (t23.n0) o0Var.f496747e.get(str);
        if (n0Var != null) {
            n0Var.b(str);
        }
    }
}
