package gl5;

/* loaded from: classes15.dex */
public class m implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ gl5.e0 f354575d;

    public m(gl5.e0 e0Var) {
        this.f354575d = e0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        gl5.e0 e0Var = this.f354575d;
        if (e0Var.f354476a0) {
            e0Var.F();
        }
        android.view.ActionMode actionMode = e0Var.f354478c;
        if (actionMode != null) {
            actionMode.hide(0L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("cmEdit.Editor", "mTextActionMode.hide(0)");
        }
    }
}
