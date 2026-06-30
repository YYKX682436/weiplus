package com.p314xaae8f345.mm.ui.p2740x696c9db;

/* loaded from: classes15.dex */
public class u2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22499xed564269 f292327d;

    public u2(com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22499xed564269 activityC22499xed564269) {
        this.f292327d = activityC22499xed564269;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2740x696c9db.ActivityC22499xed564269 activityC22499xed564269 = this.f292327d;
        if (activityC22499xed564269.f291533f == null) {
            return;
        }
        if (activityC22499xed564269.getIntent().getBooleanExtra("CropImage_DirectlyIntoFilter", false)) {
            android.content.SharedPreferences.Editor edit = activityC22499xed564269.getSharedPreferences(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.e(), 0).edit();
            edit.putBoolean("CropImage_Filter_Show", activityC22499xed564269.f291533f.findViewById(com.p314xaae8f345.mm.R.id.f565524cn3).getVisibility() == 0);
            edit.commit();
        }
        java.lang.String stringExtra = activityC22499xed564269.getIntent().getStringExtra("CropImage_OutputPath");
        if (stringExtra == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(lp0.b.m());
            sb6.append(kk.k.g((activityC22499xed564269.f291539o + java.lang.System.currentTimeMillis()).getBytes()));
            sb6.append("_fiter.jpg");
            stringExtra = sb6.toString();
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("CropImage_Compress_Img", true);
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22502x1bc6a5e8 c22502x1bc6a5e8 = activityC22499xed564269.f291533f;
        if (c22502x1bc6a5e8 != null) {
            intent.putExtra("CropImage_filterId", c22502x1bc6a5e8.m81078x50de1429());
        }
        if (activityC22499xed564269.f291533f.m81078x50de1429() == 0) {
            intent.putExtra("CropImage_OutputPath", activityC22499xed564269.f291539o);
            activityC22499xed564269.setResult(-1, intent);
        } else if (activityC22499xed564269.Y6(activityC22499xed564269.f291533f.m81077xcae45837(), stringExtra, false)) {
            intent.putExtra("CropImage_OutputPath", stringExtra);
            activityC22499xed564269.setResult(-1, intent);
        } else {
            activityC22499xed564269.setResult(-1);
        }
        activityC22499xed564269.finish();
    }
}
