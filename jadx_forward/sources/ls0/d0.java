package ls0;

/* loaded from: classes10.dex */
public final class d0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ls0.r0 f402348d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(ls0.r0 r0Var) {
        super(0);
        this.f402348d = r0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f402348d.f402449t, "onDrawFrameOnFrameAvailableFailed!! force use request draw");
        this.f402348d.f402433g0 = true;
        fs0.g gVar = this.f402348d.B;
        if (gVar != null) {
            gVar.d(false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaEditorIDKeyStat", "markRemuxOnFrameAvailableDrawFailed");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(986L, 86L, 1L);
        ls0.k kVar = this.f402348d.F;
        if (kVar != null) {
            kVar.f402396q = null;
        }
        return jz5.f0.f384359a;
    }
}
