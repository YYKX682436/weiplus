package al5;

/* loaded from: classes12.dex */
public class s4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ al5.t4 f87558d;

    public s4(al5.t4 t4Var) {
        this.f87558d = t4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        al5.t4 t4Var = this.f87558d;
        android.content.Context context = t4Var.f87574d;
        if ((context instanceof android.app.Activity) && (((android.app.Activity) context).getWindow() == null || ((android.app.Activity) t4Var.f87574d).isFinishing() || ((android.app.Activity) t4Var.f87574d).isDestroyed())) {
            return;
        }
        try {
            al5.u4 u4Var = t4Var.f87573c;
            if (u4Var == null || !u4Var.isShowing()) {
                return;
            }
            t4Var.f87573c.dismiss();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.mm.ui.yk.b("MicroMsg.WeSnackBar", "Exception %s", e17);
        }
    }
}
