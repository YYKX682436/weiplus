package ah4;

/* loaded from: classes13.dex */
public class z implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f f86566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f f86567e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f86568f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ah4.a0 f86569g;

    public z(ah4.a0 a0Var, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f, com.p314xaae8f345.mm.p2493x1bc889d6.C19767x257d7f c19767x257d7f2, boolean z17) {
        this.f86569g = a0Var;
        this.f86566d = c19767x257d7f;
        this.f86567e = c19767x257d7f2;
        this.f86568f = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        ah4.a0 a0Var = this.f86569g;
        a0Var.f86523r = true;
        try {
            a0Var.f86517i.A4(this.f86566d.f38864x6ac9171, this.f86567e.f38864x6ac9171, this.f86568f);
        } catch (android.os.RemoteException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TalkRoomPlayer", e17, "", new java.lang.Object[0]);
        }
        a0Var.f86523r = false;
    }
}
