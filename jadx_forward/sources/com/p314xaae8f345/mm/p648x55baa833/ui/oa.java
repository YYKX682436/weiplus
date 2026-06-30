package com.p314xaae8f345.mm.p648x55baa833.ui;

/* loaded from: classes.dex */
public class oa implements android.content.DialogInterface.OnCancelListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10361xc5a22f5 f145945d;

    public oa(com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10361xc5a22f5 activityC10361xc5a22f5) {
        this.f145945d = activityC10361xc5a22f5;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p648x55baa833.ui.ActivityC10361xc5a22f5 activityC10361xc5a22f5 = this.f145945d;
        if (activityC10361xc5a22f5.f145434q != null) {
            gm0.j1.n().f354821b.d(activityC10361xc5a22f5.f145434q);
            activityC10361xc5a22f5.f145434q = null;
        }
        activityC10361xc5a22f5.finish();
    }
}
