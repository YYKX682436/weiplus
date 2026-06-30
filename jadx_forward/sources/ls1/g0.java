package ls1;

/* loaded from: classes8.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f402519d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ls1.e0 f402520e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(int i17, ls1.e0 e0Var) {
        super(0);
        this.f402519d = i17;
        this.f402520e = e0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = ls1.j0.f402529b;
        int i17 = this.f402519d;
        java.lang.Object obj = concurrentHashMap.get(java.lang.Integer.valueOf(i17));
        ls1.e0 e0Var = this.f402520e;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(obj, e0Var)) {
            concurrentHashMap.remove(java.lang.Integer.valueOf(i17));
            e0Var.getClass();
            pm0.v.X(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.w(e0Var));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Preload.TmplWebViewManager", "remove preload when tmpl fail:" + i17 + ", " + e0Var.U());
        }
        return jz5.f0.f384359a;
    }
}
