package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes11.dex */
public class cb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10364x5bffdef3 f145617d;

    public cb(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10364x5bffdef3 activityC10364x5bffdef3) {
        this.f145617d = activityC10364x5bffdef3;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10364x5bffdef3 activityC10364x5bffdef3 = this.f145617d;
        int dimension = (int) (activityC10364x5bffdef3.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561100j) + activityC10364x5bffdef3.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561423i3) + activityC10364x5bffdef3.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561462j9));
        if (activityC10364x5bffdef3.f145465g.getCount() / 4 > 0) {
            dimension *= (activityC10364x5bffdef3.f145465g.getCount() / 4) + 1;
        }
        activityC10364x5bffdef3.f145462d.setLayoutParams(new android.widget.LinearLayout.LayoutParams(activityC10364x5bffdef3.f145462d.getWidth(), dimension));
    }
}
