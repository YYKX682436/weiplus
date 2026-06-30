package ta1;

/* loaded from: classes7.dex */
public class w implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f498224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ta1.q0 f498225e;

    public w(ta1.q0 q0Var, android.content.Context context) {
        this.f498225e = q0Var;
        this.f498224d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.w7.a();
        ta1.q0 q0Var = this.f498225e;
        q0Var.getClass();
        com.p290xb772556d.p291xca4f91d6.C2825x872614ab.m21000x97a93317(new ta1.b0(q0Var));
        com.p290xb772556d.p291xca4f91d6.C2826xfbf608c9.m21006xca02700a(new ta1.c0(q0Var));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecorderMgr", "init mediasdk");
        q0Var.f498200c.m21029x316510(this.f498224d);
    }
}
