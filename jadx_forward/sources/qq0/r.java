package qq0;

/* loaded from: classes7.dex */
public final class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qq0.u f447442d;

    public r(qq0.u uVar) {
        this.f447442d = uVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        qq0.u uVar = this.f447442d;
        if (uVar.f447452h) {
            return;
        }
        uVar.f447452h = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicSclViewCoverLogic", "CoverLogic, removeCoverFromScl, remove cover when timeout");
        uVar.b(false);
        qq0.u.a(uVar, "removeCoverFromScl");
    }
}
