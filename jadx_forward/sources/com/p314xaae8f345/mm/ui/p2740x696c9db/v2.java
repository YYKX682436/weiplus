package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public class v2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22499xed564269 f292368d;

    public v2(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22499xed564269 activityC22499xed564269) {
        this.f292368d = activityC22499xed564269;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22499xed564269 activityC22499xed564269 = this.f292368d;
        if (activityC22499xed564269.getIntent().getBooleanExtra("CropImage_DirectlyIntoFilter", false)) {
            activityC22499xed564269.finish();
            return;
        }
        activityC22499xed564269.f291533f.setVisibility(8);
        activityC22499xed564269.f291534g.setVisibility(0);
        android.widget.ImageView imageView = activityC22499xed564269.f291536i;
        imageView.setVisibility(((java.lang.Integer) imageView.getTag()).intValue());
        activityC22499xed564269.f291535h.setVisibility(0);
    }
}
