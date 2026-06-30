package t21;

/* loaded from: classes12.dex */
public class v1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f496530d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t21.w1 f496531e;

    public v1(t21.w1 w1Var, java.lang.String str) {
        this.f496531e = w1Var;
        this.f496530d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        t21.w1 w1Var = this.f496531e;
        t21.u1 u1Var = w1Var.f496588a;
        java.lang.String str = this.f496530d;
        if (u1Var.I(str).equals(str)) {
            return;
        }
        com.p314xaae8f345.mm.vfs.w6.h(w1Var.f496588a.I(str));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideoOriginCgi", "delete thumbPath %s", str);
    }
}
