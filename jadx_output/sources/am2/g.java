package am2;

/* loaded from: classes3.dex */
public final class g implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ am2.h f8670d;

    public g(am2.h hVar) {
        this.f8670d = hVar;
    }

    @Override // db5.o4
    public final void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            android.view.MenuItem f17 = g4Var.f(1, "礼物条通知");
            am2.h hVar = this.f8670d;
            ((db5.h4) f17).f228382z = new am2.e(hVar);
            ((db5.h4) g4Var.f(2, "banner通知")).f228382z = new am2.f(hVar);
        }
    }
}
