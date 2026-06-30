package hy4;

/* loaded from: classes8.dex */
public final class p implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hy4.s f367717d;

    public p(hy4.s sVar, hy4.n nVar) {
        this.f367717d = sVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        hy4.s sVar = this.f367717d;
        java.lang.String str = sVar.f367729c;
        if (str == null) {
            return;
        }
        com.p314xaae8f345.mm.vfs.r6[] I = new com.p314xaae8f345.mm.vfs.r6(str).s().I(new hy4.o(this));
        if (I != null) {
            for (com.p314xaae8f345.mm.vfs.r6 r6Var : I) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ViewCaptureHelper", "deleteFile file: %s, result: %b", r6Var.o(), java.lang.Boolean.valueOf(r6Var.l()));
            }
        }
        sVar.f367729c = null;
    }
}
