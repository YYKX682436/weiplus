package com.p314xaae8f345.mm.app.p622xc5476f33;

/* loaded from: classes9.dex */
public class v implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qk.o f135224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135225e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135226f;

    public v(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.DeeplinkUriSpanHandler deeplinkUriSpanHandler, qk.o oVar, java.lang.String str, java.lang.String str2) {
        this.f135224d = oVar;
        this.f135225e = str;
        this.f135226f = str2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        qk.o oVar = this.f135224d;
        int i18 = oVar.f66733x6baace8e;
        oVar.f66733x6baace8e = i18 | 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "shield biz msg %s, %s, old = %d, new = %d", this.f135225e, this.f135226f, java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(oVar.f66733x6baace8e));
        r01.z.q(oVar);
    }
}
