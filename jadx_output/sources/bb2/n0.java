package bb2;

/* loaded from: classes.dex */
public final class n0 implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f18922d;

    public n0(androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        this.f18922d = appCompatActivity;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f18922d;
            g4Var.d(1, appCompatActivity.getResources().getColor(com.tencent.mm.R.color.Red_100), appCompatActivity.getString(com.tencent.mm.R.string.gyt));
        }
    }
}
