package t21;

/* loaded from: classes12.dex */
public class z0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f496602d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t21.c1 f496603e;

    public z0(t21.c1 c1Var, java.lang.String str) {
        this.f496603e = c1Var;
        this.f496602d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        t21.c1 c1Var = this.f496603e;
        t21.w0 w0Var = c1Var.f496252a;
        java.lang.String str = this.f496602d;
        if (w0Var.K(str).equals(str)) {
            return;
        }
        com.p314xaae8f345.mm.vfs.w6.h(c1Var.f496252a.K(str));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideo", "delete thumbPath %s", str);
    }
}
