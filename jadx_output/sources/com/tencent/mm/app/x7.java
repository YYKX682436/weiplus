package com.tencent.mm.app;

/* loaded from: classes9.dex */
public class x7 implements com.tencent.mm.ui.widget.dialog.j {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.opensdk.modelmsg.WXMediaMessage f53917a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53918b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53919c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f53921e;

    public x7(com.tencent.mm.app.y7 y7Var, com.tencent.mm.opensdk.modelmsg.WXMediaMessage wXMediaMessage, java.lang.String str, java.lang.String str2, java.lang.String str3, android.app.Activity activity) {
        this.f53917a = wXMediaMessage;
        this.f53918b = str;
        this.f53919c = str2;
        this.f53920d = str3;
        this.f53921e = activity;
    }

    @Override // com.tencent.mm.ui.widget.dialog.j
    public void a(boolean z17, java.lang.String str, int i17) {
        if (z17) {
            com.tencent.mm.pluginsdk.model.app.k0.D(this.f53917a, this.f53918b, this.f53919c, this.f53920d, 3, null);
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                com.tencent.mm.autogen.events.SendMsgEvent sendMsgEvent = new com.tencent.mm.autogen.events.SendMsgEvent();
                am.mt mtVar = sendMsgEvent.f54752g;
                java.lang.String str2 = this.f53920d;
                mtVar.f7362a = str2;
                mtVar.f7363b = str;
                mtVar.f7364c = c01.e2.C(str2);
                mtVar.f7365d = 0;
                sendMsgEvent.e();
            }
            android.app.Activity activity = this.f53921e;
            db5.e1.T(activity, activity.getResources().getString(com.tencent.mm.R.string.f490560yi));
            com.tencent.mm.plugin.report.service.g0.INSTANCE.kvStat(10910, "2");
        }
    }
}
