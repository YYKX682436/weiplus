package mj;

/* loaded from: classes12.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mj.i f408497d;

    public g(mj.i iVar) {
        this.f408497d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        mj.i iVar = this.f408497d;
        if (iVar.f408506c) {
            iVar.f408506c = false;
            iVar.f408504a.removeView(iVar.f408507d);
        }
    }
}
