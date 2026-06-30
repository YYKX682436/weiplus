package l72;

/* loaded from: classes14.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13534x1dc4b4e7 f398388d;

    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13534x1dc4b4e7 activityC13534x1dc4b4e7) {
        this.f398388d = activityC13534x1dc4b4e7;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13534x1dc4b4e7 activityC13534x1dc4b4e7 = this.f398388d;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) activityC13534x1dc4b4e7.f181715o.getLayoutParams();
        int height = ((int) (activityC13534x1dc4b4e7.f181712i.getHeight() * 0.4d)) + ((int) (activityC13534x1dc4b4e7.f181712i.getWidth() * 0.35d)) + com.p314xaae8f345.mm.ui.zk.a(activityC13534x1dc4b4e7, 30);
        marginLayoutParams.topMargin = height;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceActionUI", "topMargin：%d", java.lang.Integer.valueOf(height));
        activityC13534x1dc4b4e7.f181715o.setLayoutParams(marginLayoutParams);
        activityC13534x1dc4b4e7.f181715o.setVisibility(0);
    }
}
