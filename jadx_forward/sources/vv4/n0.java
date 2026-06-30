package vv4;

/* loaded from: classes3.dex */
public final class n0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19218x71796ad1 f522013d;

    public n0(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19218x71796ad1 activityC19218x71796ad1) {
        this.f522013d = activityC19218x71796ad1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19218x71796ad1 activityC19218x71796ad1 = this.f522013d;
        ((com.p314xaae8f345.mm.p1006xc5476f33.gif.C16077xb54fe366) activityC19218x71796ad1.findViewById(com.p314xaae8f345.mm.R.id.im6)).setVisibility(8);
        ((android.widget.TextView) activityC19218x71796ad1.findViewById(com.p314xaae8f345.mm.R.id.iml)).setVisibility(8);
        ((android.widget.TextView) activityC19218x71796ad1.findViewById(com.p314xaae8f345.mm.R.id.dhn)).setVisibility(8);
        ((android.widget.Button) activityC19218x71796ad1.findViewById(com.p314xaae8f345.mm.R.id.dhe)).setVisibility(8);
        ((android.widget.TextView) activityC19218x71796ad1.findViewById(com.p314xaae8f345.mm.R.id.dkg)).setVisibility(0);
        ((android.widget.Button) activityC19218x71796ad1.findViewById(com.p314xaae8f345.mm.R.id.dkd)).setVisibility(0);
        ((android.widget.Button) activityC19218x71796ad1.findViewById(com.p314xaae8f345.mm.R.id.dkd)).setOnClickListener(new vv4.m0(activityC19218x71796ad1));
    }
}
