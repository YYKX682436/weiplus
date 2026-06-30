package k31;

/* loaded from: classes9.dex */
public final class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l31.b f385380d;

    public m(l31.b bVar) {
        this.f385380d = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        l31.b bVar = this.f385380d;
        if (bVar.f396849d) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SubscribeMsgStorageTaskManager", "task %s has cancelled", bVar.b());
        } else {
            bVar.run();
        }
    }
}
