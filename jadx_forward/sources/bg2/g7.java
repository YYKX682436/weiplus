package bg2;

/* loaded from: classes12.dex */
public final class g7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f101650d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.j7 f101651e;

    public g7(int i17, bg2.j7 j7Var) {
        this.f101650d = i17;
        this.f101651e = j7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("stopPolling ");
        int i17 = this.f101650d;
        sb6.append(i17);
        sb6.append(' ');
        bg2.j7 j7Var = this.f101651e;
        sb6.append(j7Var.c());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LivePollingService", sb6.toString());
        j7Var.f101747d.remove(i17);
        kz5.h0.A(j7Var.f101744a, new bg2.f7(i17));
        j7Var.f101745b.remove(java.lang.Integer.valueOf(i17));
        bg2.j7.b(j7Var);
    }
}
