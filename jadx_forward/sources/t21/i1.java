package t21;

/* loaded from: classes12.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f496325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t21.l1 f496326e;

    public i1(t21.l1 l1Var, java.lang.String str) {
        this.f496326e = l1Var;
        this.f496325d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        t21.l1 l1Var = this.f496326e;
        t21.w0 w0Var = l1Var.f496364a;
        java.lang.String str = this.f496325d;
        if (w0Var.K(str).equals(str)) {
            return;
        }
        com.p314xaae8f345.mm.vfs.w6.h(l1Var.f496364a.K(str));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NetSceneUploadVideo", "delete thumbPath %s", str);
    }
}
