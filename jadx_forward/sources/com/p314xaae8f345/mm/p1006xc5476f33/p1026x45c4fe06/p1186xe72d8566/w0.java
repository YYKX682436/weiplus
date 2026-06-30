package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1186xe72d8566;

/* loaded from: classes3.dex */
public final class w0 implements p11.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f170121a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 f170122b;

    public w0(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        this.f170121a = str;
        this.f170122b = interfaceC29045xdcb5ca57;
    }

    @Override // p11.d
    public final void a(boolean z17, java.lang.Object[] objArr) {
        java.lang.Boolean valueOf = java.lang.Boolean.valueOf(z17);
        java.lang.String str = this.f170121a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiReturnGeneratedPoster", "downloadImageSynchronously onImageDownload success? %s=%b", str, valueOf);
        this.f170122b.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(z17 ? com.p314xaae8f345.mm.sdk.p2603x2137b148.x.J(str, null) : null));
    }
}
