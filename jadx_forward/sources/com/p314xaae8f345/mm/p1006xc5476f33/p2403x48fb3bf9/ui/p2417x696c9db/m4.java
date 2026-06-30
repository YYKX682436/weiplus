package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes.dex */
public class m4 implements com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19328xb24711f5 f267213d;

    public m4(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19328xb24711f5 activityC19328xb24711f5) {
        this.f267213d = activityC19328xb24711f5;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void b(long j17, int i17, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewDownloadUI", "onTaskFailed id=%d, errCode=%d, hasChangeUrl=%b", java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19328xb24711f5 activityC19328xb24711f5 = this.f267213d;
        dp.a.m125854x26a183b(activityC19328xb24711f5.mo55332x76847179(), activityC19328xb24711f5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5w), 1).show();
        java.util.List list = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19328xb24711f5.K;
        activityC19328xb24711f5.V6(null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void c(long j17, java.lang.String str, boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewDownloadUI", "onTaskFinished id=%d, savedFilePath=%s, hasChangeUrl=%b", java.lang.Long.valueOf(j17), str, java.lang.Boolean.valueOf(z17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19328xb24711f5 activityC19328xb24711f5 = this.f267213d;
        dp.a.m125854x26a183b(activityC19328xb24711f5.mo55332x76847179(), activityC19328xb24711f5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.l5z), 1).show();
        java.util.List list = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19328xb24711f5.K;
        activityC19328xb24711f5.getClass();
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_result_err_code", 0);
        activityC19328xb24711f5.setResult(-1, intent);
        activityC19328xb24711f5.finish();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void f(long j17) {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void h(long j17, java.lang.String str, long j18, long j19) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19328xb24711f5 activityC19328xb24711f5 = this.f267213d;
        android.widget.TextView textView = activityC19328xb24711f5.f265301z;
        if (textView == null || j19 == 0) {
            return;
        }
        textView.setText(activityC19328xb24711f5.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f575193l60, java.lang.Long.valueOf((j18 * 100) / j19)));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void i(long j17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewDownloadUI", "onTaskResumed id=%d, savedFilePath=%s", java.lang.Long.valueOf(j17), str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void k(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewDownloadUI", "onTaskPaused id=%d", java.lang.Long.valueOf(j17));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void l(long j17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewDownloadUI", "onTaskStarted id=%d, savedFilePath=%s", java.lang.Long.valueOf(j17), str);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.g1
    public void m(long j17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebViewDownloadUI", "onTaskRemoved id=%d", java.lang.Long.valueOf(j17));
        java.util.List list = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ActivityC19328xb24711f5.K;
        this.f267213d.U6();
    }
}
