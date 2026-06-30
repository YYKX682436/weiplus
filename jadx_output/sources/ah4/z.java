package ah4;

/* loaded from: classes13.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PInt f5033d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pointers.PInt f5034e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f5035f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ah4.a0 f5036g;

    public z(ah4.a0 a0Var, com.tencent.mm.pointers.PInt pInt, com.tencent.mm.pointers.PInt pInt2, boolean z17) {
        this.f5036g = a0Var;
        this.f5033d = pInt;
        this.f5034e = pInt2;
        this.f5035f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        ah4.a0 a0Var = this.f5036g;
        a0Var.f4990r = true;
        try {
            a0Var.f4984i.A4(this.f5033d.value, this.f5034e.value, this.f5035f);
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TalkRoomPlayer", e17, "", new java.lang.Object[0]);
        }
        a0Var.f4990r = false;
    }
}
