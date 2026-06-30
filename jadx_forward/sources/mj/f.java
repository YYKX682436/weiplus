package mj;

/* loaded from: classes12.dex */
public class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mj.i f408496d;

    public f(mj.i iVar) {
        this.f408496d = iVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        mj.i iVar = this.f408496d;
        if (iVar.f408506c) {
            return;
        }
        iVar.f408506c = true;
        iVar.f408504a.addView(iVar.f408507d, iVar.f408505b);
    }
}
