package com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui;

/* loaded from: classes12.dex */
public class n4 implements com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.e3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13474xf9906714 f181121a;

    public n4(com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13474xf9906714 activityC13474xf9906714) {
        this.f181121a = activityC13474xf9906714;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.p1387x633fb29.e3
    public void a(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Ksnsupload_appid", "wx7fa037cc7dfabad5");
        com.p314xaae8f345.mm.p1006xc5476f33.p1386x782d98c9.ui.ActivityC13474xf9906714 activityC13474xf9906714 = this.f181121a;
        intent.putExtra("Ksnsupload_appname", activityC13474xf9906714.getString(com.p314xaae8f345.mm.R.C30867xcad56011.c5n));
        intent.putExtra("Ksnsupload_source", 1);
        intent.putExtra("need_result", true);
        java.lang.String a17 = c01.n2.a("wx_sport");
        c01.n2.d().c(a17, true).i("prePublishId", "wx_sport");
        intent.putExtra("reportSessionId", a17);
        intent.putExtra("Ksnsupload_type", 0);
        intent.putExtra("sns_kemdia_path", str);
        j45.l.n(activityC13474xf9906714, "sns", ".ui.SnsUploadUI", intent, 2);
    }
}
