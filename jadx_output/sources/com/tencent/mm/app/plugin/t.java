package com.tencent.mm.app.plugin;

/* loaded from: classes4.dex */
public class t implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53685d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53686e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f53687f;

    public t(com.tencent.mm.app.plugin.URISpanHandlerSet.AAUriSpanHandler aAUriSpanHandler, java.lang.String str, java.lang.String str2, long j17) {
        this.f53685d = str;
        this.f53686e = str2;
        this.f53687f = j17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.autogen.events.CloseAAEvent closeAAEvent = new com.tencent.mm.autogen.events.CloseAAEvent();
        java.lang.String str = this.f53685d;
        am.b3 b3Var = closeAAEvent.f54063g;
        b3Var.f6211a = str;
        b3Var.f6212b = this.f53686e;
        b3Var.f6213c = this.f53687f;
        closeAAEvent.e();
    }
}
