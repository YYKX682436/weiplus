package com.tencent.mm.plugin.exdevice.ui;

/* loaded from: classes12.dex */
public class n4 implements com.tencent.mm.plugin.exdevice.model.e3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI f99588a;

    public n4(com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI) {
        this.f99588a = exdeviceProfileUI;
    }

    @Override // com.tencent.mm.plugin.exdevice.model.e3
    public void a(java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Ksnsupload_appid", "wx7fa037cc7dfabad5");
        com.tencent.mm.plugin.exdevice.ui.ExdeviceProfileUI exdeviceProfileUI = this.f99588a;
        intent.putExtra("Ksnsupload_appname", exdeviceProfileUI.getString(com.tencent.mm.R.string.c5n));
        intent.putExtra("Ksnsupload_source", 1);
        intent.putExtra("need_result", true);
        java.lang.String a17 = c01.n2.a("wx_sport");
        c01.n2.d().c(a17, true).i("prePublishId", "wx_sport");
        intent.putExtra("reportSessionId", a17);
        intent.putExtra("Ksnsupload_type", 0);
        intent.putExtra("sns_kemdia_path", str);
        j45.l.n(exdeviceProfileUI, "sns", ".ui.SnsUploadUI", intent, 2);
    }
}
