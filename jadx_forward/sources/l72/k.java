package l72;

/* loaded from: classes14.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13534x1dc4b4e7 f398387d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13534x1dc4b4e7 activityC13534x1dc4b4e7) {
        this.f398387d = activityC13534x1dc4b4e7;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13534x1dc4b4e7 activityC13534x1dc4b4e7 = this.f398387d;
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) activityC13534x1dc4b4e7.f181717q.getLayoutParams();
        marginLayoutParams.topMargin = (int) (activityC13534x1dc4b4e7.f181712i.getHeight() * 0.4d);
        activityC13534x1dc4b4e7.f181717q.setLayoutParams(marginLayoutParams);
        activityC13534x1dc4b4e7.f181717q.setVisibility(0);
    }
}
