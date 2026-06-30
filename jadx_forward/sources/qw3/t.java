package qw3;

/* loaded from: classes3.dex */
public class t implements android.widget.Filter.FilterListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 f448740d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569) {
        this.f448740d = activityC17101x8420a569;
    }

    @Override // android.widget.Filter.FilterListener
    public void onFilterComplete(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BankRemitBankcardInputUI", "filter complete: %d", java.lang.Integer.valueOf(i17));
        com.p314xaae8f345.mm.p1006xc5476f33.p2018x185239e.p2019x9137034c.ui.ActivityC17101x8420a569 activityC17101x8420a569 = this.f448740d;
        android.widget.ListView listView = activityC17101x8420a569.f238019p;
        if (listView != null) {
            if (i17 <= 0) {
                if (i17 > 0 || listView.getVisibility() != 0) {
                    return;
                }
                activityC17101x8420a569.f238019p.setVisibility(8);
                return;
            }
            if (i17 == 1) {
                android.widget.FrameLayout.LayoutParams layoutParams = (android.widget.FrameLayout.LayoutParams) listView.getLayoutParams();
                layoutParams.height = i65.a.b(activityC17101x8420a569.mo55332x76847179(), 68);
                activityC17101x8420a569.f238019p.setLayoutParams(layoutParams);
            } else {
                android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) listView.getLayoutParams();
                layoutParams2.height = i65.a.b(activityC17101x8420a569.mo55332x76847179(), 136);
                activityC17101x8420a569.f238019p.setLayoutParams(layoutParams2);
            }
            activityC17101x8420a569.f238019p.setVisibility(0);
        }
    }
}
