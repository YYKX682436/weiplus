package ws2;

/* loaded from: classes3.dex */
public final class e1 implements dt2.d0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ws2.k1 f530562a;

    public e1(ws2.k1 k1Var) {
        this.f530562a = k1Var;
    }

    @Override // dt2.d0
    public void a(boolean z17) {
        ws2.k1 k1Var = this.f530562a;
        ct2.j jVar = (ct2.j) k1Var.e(ct2.j.class);
        int i17 = jVar != null ? jVar.f303806q : 0;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayService", "onPlayBtnClick start to play:" + z17 + ",offset:" + i17);
        if (z17) {
            ws2.k1.c(k1Var, i17);
        }
    }

    @Override // dt2.d0
    public void b() {
        ws2.k1 k1Var = this.f530562a;
        dt2.b0 b0Var = k1Var.f530606e;
        if (b0Var == null || b0Var.mo58769xfdd9c5e5() == null) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("PARAM_LIVE_MINI_WINDOW_GENERATE_TYPE", 2);
        k1Var.r(intent);
    }

    @Override // dt2.d0
    public void c(qs5.o mode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mode, "mode");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveReplayService", "FullScreenUI onCloseClick mode:" + mode + '!');
        if (mode != qs5.o.f447988h) {
            ws2.k1 k1Var = this.f530562a;
            ct2.j jVar = (ct2.j) k1Var.e(ct2.j.class);
            k1Var.l(4, jVar != null ? jVar.O6() : 0L, true);
        }
    }
}
