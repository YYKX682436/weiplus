package nh5;

/* loaded from: classes10.dex */
public final class i implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.matrix.MatrixBaseLeakResultUI f418685d;

    public i(com.tencent.mm.ui.matrix.MatrixBaseLeakResultUI matrixBaseLeakResultUI) {
        this.f418685d = matrixBaseLeakResultUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public final boolean onMenuItemClick(android.view.MenuItem it) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MatrixBaseLeakResultUI", "confirmed ");
        com.tencent.mm.ui.matrix.MatrixBaseLeakResultUI matrixBaseLeakResultUI = this.f418685d;
        if (matrixBaseLeakResultUI.d > 0) {
            return false;
        }
        int i17 = matrixBaseLeakResultUI.e - 1;
        matrixBaseLeakResultUI.e = i17;
        if (i17 <= 0) {
            matrixBaseLeakResultUI.finish();
            return false;
        }
        ((ku5.t0) ku5.t0.f394148d).A("Click-Count-Down");
        dp.a.m125854x26a183b(this.f418685d.getApplicationContext(), "再点 " + this.f418685d.e + " 次", 1).show();
        ((ku5.t0) ku5.t0.f394148d).l(new nh5.h(this.f418685d), 5000L, "Click-Count-Down");
        return false;
    }
}
