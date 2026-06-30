package zk3;

/* loaded from: classes8.dex */
public final class r implements kk3.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f555029a;

    public r(zk3.g0 g0Var) {
        this.f555029a = g0Var;
    }

    @Override // kk3.b
    public final void a(java.util.List list) {
        zk3.g0.V6(this.f555029a, list, true, false, false);
        this.f555029a.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "initBallInfo");
        this.f555029a.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTask.MultiTaskMinusScreenUIC", "transDataFilePath");
        boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M("multitask_tips_config").getBoolean("multitask_first_trans_img_path", true);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTaskTipsHelper", "needMultiTaskTransImgFile, needTrans: " + z17);
        if (z17) {
            ((ku5.t0) ku5.t0.f394148d).q(new zk3.f0(list));
        }
    }
}
