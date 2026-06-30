package mz4;

/* loaded from: classes12.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz4.j0 f414852d;

    public m0(mz4.j0 j0Var) {
        this.f414852d = j0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        mz4.j0 j0Var = this.f414852d;
        long j17 = j0Var.f414836k;
        if (j17 <= 0 || j0Var.f414834i <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.WXRTManager", "checkUpdateStorage not match to check favLocalId:%s editBeginTime:%s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j0Var.f414834i));
            return;
        }
        java.lang.String p17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2445xd0d3a7c0.ui.p2452xb9121c89.ActivityC19519x7af4daf3) j0Var.f414833h).J1.p(false);
        boolean e17 = j0Var.e("checkUpdateStorageInner");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Note.WXRTManager", "checkUpdateStorage() called isSameHtmlContent:%b", java.lang.Boolean.valueOf(e17));
        if (e17) {
            return;
        }
        j0Var.f414835j = p17;
        if (j0Var.f414838m) {
            j0Var.m(p17, false);
        } else {
            j0Var.f414838m = true;
            j0Var.m(p17, true);
        }
    }
}
