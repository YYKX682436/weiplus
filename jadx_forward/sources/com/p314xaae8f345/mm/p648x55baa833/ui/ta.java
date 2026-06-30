package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes5.dex */
public class ta implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10362xd5e3feb2 f146088d;

    public ta(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10362xd5e3feb2 activityC10362xd5e3feb2) {
        this.f146088d = activityC10362xd5e3feb2;
    }

    @Override // java.lang.Runnable
    public void run() {
        int i17;
        float height;
        float dimension;
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10362xd5e3feb2 activityC10362xd5e3feb2 = this.f146088d;
        if (activityC10362xd5e3feb2.A != null) {
            if (activityC10362xd5e3feb2.F) {
                height = (r1.getHeight() * 2) + activityC10362xd5e3feb2.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561100j);
                dimension = activityC10362xd5e3feb2.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561423i3);
            } else {
                height = r1.getHeight() + activityC10362xd5e3feb2.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561100j);
                dimension = activityC10362xd5e3feb2.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561423i3);
            }
            i17 = (int) (height + dimension);
        } else {
            i17 = 0;
        }
        if (activityC10362xd5e3feb2.f145442e.getCount() / 4 > 0) {
            i17 *= (activityC10362xd5e3feb2.f145442e.getCount() / 4) + 1;
        }
        activityC10362xd5e3feb2.D.setLayoutParams(new android.widget.LinearLayout.LayoutParams(activityC10362xd5e3feb2.D.getWidth(), i17));
    }
}
