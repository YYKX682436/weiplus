package xw;

/* loaded from: classes11.dex */
public class i implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f539058d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.p0 f539059e;

    public i(xw.j jVar, java.util.Map map, com.p314xaae8f345.mm.p944x882e457a.p0 p0Var) {
        this.f539058d = map;
        this.f539059e = p0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.du5 du5Var;
        java.util.Map map;
        eq1.z zVar = eq1.z.f337409a;
        com.p314xaae8f345.mm.p944x882e457a.p0 p0Var = this.f539059e;
        if ((p0Var != null ? p0Var.f152259a : null) == null || (du5Var = p0Var.f152259a.f459094h) == null || (map = this.f539058d) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BizPayAlbumLogic", "onBizPayAlbumNotify data invalid");
        } else {
            zVar.b(map, x51.j1.g(du5Var));
        }
    }
}
