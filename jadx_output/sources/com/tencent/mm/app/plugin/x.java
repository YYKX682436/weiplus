package com.tencent.mm.app.plugin;

/* loaded from: classes9.dex */
public class x implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53707d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.plugin.URISpanHandlerSet.DeeplinkUriSpanHandler f53708e;

    public x(com.tencent.mm.app.plugin.URISpanHandlerSet.DeeplinkUriSpanHandler deeplinkUriSpanHandler, java.lang.String str) {
        this.f53708e = deeplinkUriSpanHandler;
        this.f53707d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str = this.f53707d;
        com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "AppBrandServiceHelper switchTo to receive msg for username %s", str);
        ab5.c0.d(com.tencent.mm.app.plugin.URISpanHandlerSet.this.f53590a, str, true);
    }
}
