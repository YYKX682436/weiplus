package e33;

/* loaded from: classes10.dex */
public class v0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f329025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e33.w0 f329026e;

    public v0(e33.w0 w0Var, java.lang.String str) {
        this.f329026e = w0Var;
        this.f329025d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd activityC15653x403456cd = this.f329026e.f329055e;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15653x403456cd.f220042t2;
        if (activityC15653x403456cd.isDestroyed() || activityC15653x403456cd.isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AlbumPreviewUI", "refreshSumRawSize abort, AlbumPreviewUI isDestroyed||isFinishing");
            return;
        }
        android.widget.TextView textView = activityC15653x403456cd.f220077u;
        java.lang.String str = this.f329025d;
        textView.setVisibility(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? 8 : 0);
        activityC15653x403456cd.f220077u.setText(activityC15653x403456cd.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573709fi0, str));
    }
}
