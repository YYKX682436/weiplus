package e72;

/* loaded from: classes14.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ e72.v f331453d;

    public n(e72.v vVar) {
        this.f331453d = vVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.f331453d.f331477q) {
            e72.v vVar = this.f331453d;
            if (vVar.f331465e >= vVar.f331464d.length - 1) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NumberFaceMotion", "hy: already last. handle upper judge.");
                e72.v vVar2 = this.f331453d;
                vVar2.f331469i = true;
                com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.y yVar = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.y.INSTANCE;
                com.p314xaae8f345.mm.vfs.w6.N(vVar2.f331463c.f331426c, -1, -1);
                yVar.f181576d.f181577i.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceDetectNativeManager", "hy: set face data instance null!");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NumberFaceMotion", "hy: startShowNext");
                e72.v vVar3 = this.f331453d;
                vVar3.f331465e++;
                vVar3.f331466f = -1;
                vVar3.n(true);
                this.f331453d.o();
            }
        }
    }
}
