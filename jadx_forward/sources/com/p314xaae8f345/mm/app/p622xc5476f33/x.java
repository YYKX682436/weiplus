package com.p314xaae8f345.mm.app.p622xc5476f33;

/* loaded from: classes9.dex */
public class x implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f135240d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.DeeplinkUriSpanHandler f135241e;

    public x(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.DeeplinkUriSpanHandler deeplinkUriSpanHandler, java.lang.String str) {
        this.f135241e = deeplinkUriSpanHandler;
        this.f135240d = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        java.lang.String str = this.f135240d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.URISpanHandlerSet", "AppBrandServiceHelper switchTo to receive msg for username %s", str);
        ab5.c0.d(com.p314xaae8f345.mm.app.p622xc5476f33.C5082xed6d00e.this.f135123a, str, true);
    }
}
