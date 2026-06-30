package x51;

/* loaded from: classes5.dex */
public class a1 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f533502d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f533503e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ x51.c1 f533504f;

    public a1(x51.c1 c1Var, android.app.Activity activity, java.lang.Runnable runnable) {
        this.f533504f = c1Var;
        this.f533502d = activity;
        this.f533503e = runnable;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.L().putBoolean("had_show_permission_guild", true);
        android.app.Activity activity = this.f533502d;
        x51.c1 c1Var = this.f533504f;
        c1Var.getClass();
        boolean Di = ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).Di(activity, new java.lang.String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 32, "", "");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PermissionCheckHelper", "check init, summerper checkPermission checkStorage[%b]", java.lang.Boolean.valueOf(Di));
        java.lang.Runnable runnable = this.f533503e;
        if (Di) {
            c1Var.b(activity, runnable);
        } else {
            jx3.f.INSTANCE.mo68477x336bdfd8(462L, 18L, 1L, true);
            c1Var.f533509a = runnable;
        }
    }
}
