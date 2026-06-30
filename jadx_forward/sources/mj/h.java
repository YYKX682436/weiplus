package mj;

/* loaded from: classes12.dex */
public class h implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f408498d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mj.i f408499e;

    public h(mj.i iVar, boolean z17) {
        this.f408499e = iVar;
        this.f408498d = z17;
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z17 = this.f408498d;
        mj.i iVar = this.f408499e;
        if (z17) {
            if (iVar.f408510g) {
                mj.i.f408500n.post(new mj.f(iVar));
            }
        } else if (iVar.f408510g) {
            mj.i.f408500n.post(new mj.g(iVar));
        }
    }
}
