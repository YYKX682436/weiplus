package bb2;

/* loaded from: classes.dex */
public final class q implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f18950d;

    public q(android.view.View view) {
        this.f18950d = view;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            android.view.View view = this.f18950d;
            g4Var.d(10, view.getContext().getResources().getColor(com.tencent.mm.R.color.f479482a31), view.getContext().getString(com.tencent.mm.R.string.f490367t0));
        }
    }
}
