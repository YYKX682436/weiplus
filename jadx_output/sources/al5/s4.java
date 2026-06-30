package al5;

/* loaded from: classes12.dex */
public class s4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ al5.t4 f6025d;

    public s4(al5.t4 t4Var) {
        this.f6025d = t4Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        al5.t4 t4Var = this.f6025d;
        android.content.Context context = t4Var.f6041d;
        if ((context instanceof android.app.Activity) && (((android.app.Activity) context).getWindow() == null || ((android.app.Activity) t4Var.f6041d).isFinishing() || ((android.app.Activity) t4Var.f6041d).isDestroyed())) {
            return;
        }
        try {
            al5.u4 u4Var = t4Var.f6040c;
            if (u4Var == null || !u4Var.isShowing()) {
                return;
            }
            t4Var.f6040c.dismiss();
        } catch (java.lang.Exception e17) {
            com.tencent.mm.ui.yk.b("MicroMsg.WeSnackBar", "Exception %s", e17);
        }
    }
}
