package com.tencent.mm.app.plugin;

/* loaded from: classes15.dex */
public class u implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53689e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f53690f;

    public u(com.tencent.mm.app.plugin.URISpanHandlerSet.AAUriSpanHandler aAUriSpanHandler, java.lang.String str, java.lang.String str2, long j17) {
        this.f53688d = str;
        this.f53689e = str2;
        this.f53690f = j17;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.autogen.events.CloseAAUrgeNotifyEvent closeAAUrgeNotifyEvent = new com.tencent.mm.autogen.events.CloseAAUrgeNotifyEvent();
        java.lang.String str = this.f53688d;
        am.c3 c3Var = closeAAUrgeNotifyEvent.f54064g;
        c3Var.f6307a = str;
        c3Var.f6308b = this.f53689e;
        c3Var.f6309c = this.f53690f;
        closeAAUrgeNotifyEvent.e();
    }
}
