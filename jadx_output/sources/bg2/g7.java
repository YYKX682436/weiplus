package bg2;

/* loaded from: classes12.dex */
public final class g7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f20117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.j7 f20118e;

    public g7(int i17, bg2.j7 j7Var) {
        this.f20117d = i17;
        this.f20118e = j7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopPolling ");
        int i17 = this.f20117d;
        sb6.append(i17);
        sb6.append(' ');
        bg2.j7 j7Var = this.f20118e;
        sb6.append(j7Var.c());
        com.tencent.mars.xlog.Log.i("Finder.LivePollingService", sb6.toString());
        j7Var.f20214d.remove(i17);
        kz5.h0.A(j7Var.f20211a, new bg2.f7(i17));
        j7Var.f20212b.remove(java.lang.Integer.valueOf(i17));
        bg2.j7.b(j7Var);
    }
}
