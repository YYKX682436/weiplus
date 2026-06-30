package e33;

/* loaded from: classes5.dex */
public class g4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f328768d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ e33.h4 f328769e;

    public g4(e33.h4 h4Var, java.lang.String str) {
        this.f328769e = h4Var;
        this.f328768d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561 activityC15656x6f26b561 = this.f328769e.f328788f;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1718xf44c7752.ui.ActivityC15656x6f26b561.f220105k2;
        if (activityC15656x6f26b561.isDestroyed() || activityC15656x6f26b561.isFinishing()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ImagePreviewUI", "refreshSumRawSize abort, AlbumPreviewUI isDestroyed||isFinishing");
            return;
        }
        android.widget.TextView textView = activityC15656x6f26b561.f220137x;
        java.lang.String str = this.f328768d;
        textView.setVisibility(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) ? 8 : 0);
        activityC15656x6f26b561.f220137x.setText(activityC15656x6f26b561.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573709fi0, str));
    }
}
