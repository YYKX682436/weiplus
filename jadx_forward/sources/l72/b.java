package l72;

/* loaded from: classes14.dex */
public class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13534x1dc4b4e7 f398368d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13534x1dc4b4e7 activityC13534x1dc4b4e7) {
        this.f398368d = activityC13534x1dc4b4e7;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceActionUI", "openCameraPreviewFailedAnimation");
        com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13534x1dc4b4e7 activityC13534x1dc4b4e7 = this.f398368d;
        activityC13534x1dc4b4e7.f181722v.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c7i);
        activityC13534x1dc4b4e7.f181720t.setText(com.p314xaae8f345.mm.R.C30867xcad56011.c7t);
        activityC13534x1dc4b4e7.f181720t.setOnClickListener(new l72.a(this));
        activityC13534x1dc4b4e7.f181707d.setVisibility(8);
        activityC13534x1dc4b4e7.f181710g.setVisibility(0);
        activityC13534x1dc4b4e7.f181718r.clearAnimation();
        activityC13534x1dc4b4e7.f181714n.setVisibility(0);
        activityC13534x1dc4b4e7.f181708e.setVisibility(8);
    }
}
