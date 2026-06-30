package com.tencent.mm.app.plugin;

/* loaded from: classes9.dex */
public class w implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk.o f53694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53695e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53696f;

    public w(com.tencent.mm.app.plugin.URISpanHandlerSet.DeeplinkUriSpanHandler deeplinkUriSpanHandler, qk.o oVar, java.lang.String str, java.lang.String str2) {
        this.f53694d = oVar;
        this.f53695e = str;
        this.f53696f = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        qk.o oVar = this.f53694d;
        int i18 = oVar.field_brandFlag;
        oVar.field_brandFlag = i18 & (-2);
        com.tencent.mars.xlog.Log.i("MicroMsg.URISpanHandlerSet", "receive biz msg %s, %s, old = %d, new = %d", this.f53695e, this.f53696f, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(oVar.field_brandFlag));
        r01.z.q(oVar);
    }
}
