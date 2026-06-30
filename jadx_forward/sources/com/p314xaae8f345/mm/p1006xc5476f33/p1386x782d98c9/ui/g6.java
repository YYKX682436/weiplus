package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes12.dex */
public class g6 implements com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.e3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7 f180999a;

    public g6(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7 activityC13477xb2a3ecd7) {
        this.f180999a = activityC13477xb2a3ecd7;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.e3
    public void a(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Ksnsupload_appid", "wx7fa037cc7dfabad5");
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13477xb2a3ecd7 activityC13477xb2a3ecd7 = this.f180999a;
        intent.putExtra("Ksnsupload_appname", activityC13477xb2a3ecd7.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c5n));
        intent.putExtra("Ksnsupload_source", 1);
        intent.putExtra("need_result", true);
        java.lang.String a17 = c01.n2.a("wx_sport");
        c01.n2.d().c(a17, true).i("prePublishId", "wx_sport");
        intent.putExtra("reportSessionId", a17);
        intent.putExtra("Ksnsupload_type", 0);
        intent.putExtra("sns_kemdia_path", str);
        j45.l.n(activityC13477xb2a3ecd7, "sns", ".ui.SnsUploadUI", intent, 2);
    }
}
