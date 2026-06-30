package ef3;

/* loaded from: classes9.dex */
public class n implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f333957a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f333958b;

    public n(int i17, long j17) {
        this.f333957a = i17;
        this.f333958b = j17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.wh5 wh5Var = (r45.wh5) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.QueryWeChatWalletManager", "callback ui");
        int i17 = this.f333957a - 1;
        if (wh5Var != null || i17 < 0) {
            ef3.q.f333959a = false;
            java.util.ArrayList arrayList = (java.util.ArrayList) ef3.q.f333960b;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                ef3.p pVar = (ef3.p) arrayList.get(size);
                com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.t2 t2Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.t2) pVar;
                t2Var.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MallWalletUI", "net callback: %s", wh5Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.ActivityC16483x6e20aea1 activityC16483x6e20aea1 = t2Var.f230026a;
                android.app.Dialog dialog = activityC16483x6e20aea1.f229854m;
                if (dialog != null) {
                    dialog.dismiss();
                    activityC16483x6e20aea1.f229854m = null;
                }
                if (wh5Var != null) {
                    r45.yj6 yj6Var = wh5Var.f470698d;
                    if (yj6Var != null) {
                        activityC16483x6e20aea1.f229852h = yj6Var;
                        activityC16483x6e20aea1.V6(false);
                    }
                    r45.yt5 yt5Var = wh5Var.f470699e;
                    if (yt5Var != null && yt5Var.f472887d == 13) {
                        activityC16483x6e20aea1.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p1853x330614.ui.s2(t2Var, wh5Var));
                    }
                }
                arrayList.remove(pVar);
            }
        } else if (i17 >= 0) {
            long j17 = this.f333958b;
            new ef3.c(j17, null).l().q(new ef3.o()).h(new ef3.n(i17, j17));
        }
        return null;
    }
}
