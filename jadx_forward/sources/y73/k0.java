package y73;

/* loaded from: classes11.dex */
public class k0 implements x73.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y73.d0 f541265a;

    public k0(y73.d0 d0Var) {
        this.f541265a = d0Var;
    }

    @Override // x73.i
    public void a(x73.a aVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.hp.p1778xc02f49a5.IntentServiceC16110x65c2df15.f223932f = null;
        if (aVar != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "HdiffApk, onPatchResult, result.isSuccess = %s, result = %s", java.lang.Boolean.valueOf(aVar.f533970d), aVar);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "HdiffApk, onPatchResult, result.isnull.");
        }
        y73.d0 d0Var = this.f541265a;
        c83.e.d(d0Var.f541239d, aVar.f533971e);
        c83.e.u();
        c83.e.e();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "HdiffApk merge finish. auto");
        if (!aVar.f533970d) {
            if (d0Var.f541241f) {
                android.widget.Toast.makeText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "merge patch fail", 1).show();
                return;
            }
            return;
        }
        boolean z17 = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_upgrade_force_show_notifyupdate_ready, 0) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.SyncResponseProcessor", "HdiffApk merge finish. notifyExptKeyChange, isForceAutoMergeNotify = %s.", java.lang.Boolean.valueOf(z17));
        if (z17) {
            w73.a.e("mmdiff_apk_has_ready", 0, 4);
        }
        if (d0Var.f541241f) {
            android.widget.Toast.makeText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "merge patch success, Switch wechat from background to foreground.", 1).show();
        }
    }
}
