package bt3;

/* loaded from: classes9.dex */
public class n1 implements bt3.j0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zs3.y f105889a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ dn.h f105890b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ bt3.o1 f105891c;

    public n1(bt3.o1 o1Var, zs3.y yVar, dn.h hVar) {
        this.f105891c = o1Var;
        this.f105889a = yVar;
        this.f105890b = hVar;
    }

    @Override // bt3.j0
    public void a(java.lang.String str, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgCDNService", "summersafecdn NetSceneCheckMd5 callback [%d, %d], [%s]", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        bt3.o1 o1Var = this.f105891c;
        zs3.y yVar = this.f105889a;
        if (i17 != 4 || i18 != 102) {
            yVar.f68317xf47749d7 = str;
            yVar.f68318xf47770e7 = this.f105890b.f69522xf9dbbe9c;
            ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).mo9952xce0038c9(yVar, dm.i4.f66867x2a5c95c7);
            o1Var.f105897d.a();
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.RecordMsgCDNService", "summersafecdn NetSceneCheckMd5 MM_ERR_GET_AESKEY_FAILED old status[%d, %d, %d]", java.lang.Integer.valueOf(yVar.f68328x10a0fed7), java.lang.Long.valueOf(yVar.f68325x90a9378), java.lang.Long.valueOf(yVar.f68330xeb1a61d6));
        yVar.f68325x90a9378 = 0L;
        yVar.f68330xeb1a61d6 = 0L;
        yVar.f68328x10a0fed7 = 0;
        ((bt3.t1) ((ys3.i) ((zs3.q) i95.n0.c(zs3.q.class))).bj()).mo9952xce0038c9(yVar, dm.i4.f66867x2a5c95c7);
        o1Var.f105897d.c(yVar, false);
    }
}
