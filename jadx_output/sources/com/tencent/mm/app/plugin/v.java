package com.tencent.mm.app.plugin;

/* loaded from: classes9.dex */
public class v implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk.o f53691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53692e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53693f;

    public v(com.tencent.mm.app.plugin.URISpanHandlerSet.DeeplinkUriSpanHandler deeplinkUriSpanHandler, qk.o oVar, java.lang.String str, java.lang.String str2) {
        this.f53691d = oVar;
        this.f53692e = str;
        this.f53693f = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        qk.o oVar = this.f53691d;
        int i18 = oVar.field_brandFlag;
        oVar.field_brandFlag = i18 | 1;
        com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "shield biz msg %s, %s, old = %d, new = %d", this.f53692e, this.f53693f, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(oVar.field_brandFlag));
        r01.z.q(oVar);
    }
}
