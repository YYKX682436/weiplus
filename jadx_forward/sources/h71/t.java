package h71;

/* loaded from: classes14.dex */
public class t implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11392x4c96dbc1 f360942d;

    public t(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11392x4c96dbc1 activityC11392x4c96dbc1) {
        this.f360942d = activityC11392x4c96dbc1;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1016x38927740.ui.ActivityC11392x4c96dbc1 activityC11392x4c96dbc1 = this.f360942d;
        android.view.View findViewById = activityC11392x4c96dbc1.m79335xcc101dd9().findViewById(com.p314xaae8f345.mm.R.id.m9_);
        if (findViewById == null) {
            findViewById = activityC11392x4c96dbc1.m79335xcc101dd9().findViewById(com.p314xaae8f345.mm.R.id.mq8);
        }
        if (findViewById != null) {
            android.graphics.Rect rect = new android.graphics.Rect();
            findViewById.getHitRect(rect);
            if (activityC11392x4c96dbc1.f154752p == 0) {
                activityC11392x4c96dbc1.f154752p = activityC11392x4c96dbc1.f154751o;
            }
            int max = java.lang.Math.max(activityC11392x4c96dbc1.f154751o, (activityC11392x4c96dbc1.m79335xcc101dd9().getHeight() - rect.bottom) + activityC11392x4c96dbc1.f154752p);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MySafeDeviceListUI", "marginTop:" + max + " minTopPadding:" + activityC11392x4c96dbc1.f154751o + " getListView().getHeight():" + activityC11392x4c96dbc1.m79335xcc101dd9().getHeight() + " out.bottom:" + rect.bottom + " curTopPadding:" + activityC11392x4c96dbc1.f154752p);
            findViewById.setPadding(0, max, 0, findViewById.getPaddingBottom());
            if (activityC11392x4c96dbc1.f154752p != max) {
                activityC11392x4c96dbc1.f154752p = max;
                activityC11392x4c96dbc1.m79335xcc101dd9().requestLayout();
            }
        }
    }
}
