package eg4;

/* loaded from: classes4.dex */
public class k1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ eg4.t1 f334283d;

    public k1(eg4.t1 t1Var) {
        this.f334283d = t1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.database.Cursor mo78085xb5882a6b = r21.w.wi().mo78085xb5882a6b();
        eg4.t1 t1Var = this.f334283d;
        t1Var.s(mo78085xb5882a6b);
        t1Var.notifyDataSetChanged();
    }
}
