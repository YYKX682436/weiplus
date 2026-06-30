package yn1;

/* loaded from: classes11.dex */
public final class m3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.q0 f545291d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yn1.a4 f545292e;

    public m3(bw5.q0 q0Var, yn1.a4 a4Var) {
        this.f545291d = q0Var;
        this.f545292e = a4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bw5.q0 q0Var = this.f545291d;
        java.lang.String str = q0Var.f113413h[2] ? q0Var.f113410e : "";
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getStatusExtra(...)");
        byte[] bytes = str.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        java.lang.String g17 = kk.k.g(bytes);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f545292e.f545139a, "[notifyTaskCode] convIdHash = " + g17);
        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
        com.p314xaae8f345.mm.vfs.w6.g(new com.p314xaae8f345.mm.vfs.r6(lp0.b.h0("MicroMsg.BackupMoveServer"), g17).o(), true);
    }
}
