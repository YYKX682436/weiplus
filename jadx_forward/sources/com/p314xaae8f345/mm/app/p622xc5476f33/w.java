package com.p314xaae8f345.mm.app.p622xc5476f33;

/* loaded from: classes9.dex */
public class w implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk.o f135227d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135228e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135229f;

    public w(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.DeeplinkUriSpanHandler deeplinkUriSpanHandler, qk.o oVar, java.lang.String str, java.lang.String str2) {
        this.f135227d = oVar;
        this.f135228e = str;
        this.f135229f = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        qk.o oVar = this.f135227d;
        int i18 = oVar.f66733x6baace8e;
        oVar.f66733x6baace8e = i18 & (-2);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "receive biz msg %s, %s, old = %d, new = %d", this.f135228e, this.f135229f, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(oVar.f66733x6baace8e));
        r01.z.q(oVar);
    }
}
