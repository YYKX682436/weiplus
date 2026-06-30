package gm0;

/* loaded from: classes8.dex */
public class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.r6 f354709d;

    public d0(gm0.b0 b0Var, com.p314xaae8f345.mm.vfs.r6 r6Var) {
        this.f354709d = r6Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.vfs.r6 r6Var = this.f354709d;
        com.p314xaae8f345.mm.vfs.r6[] I = r6Var.s().I(new gm0.c0(this, r6Var.m82467xfb82e301()));
        if (I != null) {
            for (com.p314xaae8f345.mm.vfs.r6 r6Var2 : I) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMKernel.CoreStorage", "Delete temporary recovery database file: " + r6Var2.m82467xfb82e301());
                r6Var2.l();
            }
        }
    }
}
