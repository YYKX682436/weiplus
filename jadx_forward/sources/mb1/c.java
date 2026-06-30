package mb1;

/* loaded from: classes7.dex */
public class c implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f406830d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mb1.d f406831e;

    public c(mb1.d dVar, int i17) {
        this.f406831e = dVar;
        this.f406830d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Ble.ConnectAction", "close", new java.lang.Object[0]);
        mb1.d dVar = this.f406831e;
        dVar.f425519a.k(false);
        dVar.p(new ob1.m(com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6, "fail:connection fail status:" + this.f406830d, jc1.c.I, null));
        dVar.m();
    }
}
