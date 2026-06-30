package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes.dex */
public final class pc extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.q {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.p f166463d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc(yz5.p pVar) {
        super(3);
        this.f166463d = pVar;
    }

    @Override // yz5.q
    /* renamed from: invoke */
    public java.lang.Object mo147xb9724478(java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3) {
        int intValue = ((java.lang.Number) obj).intValue();
        int intValue2 = ((java.lang.Number) obj2).intValue();
        java.lang.String str = (java.lang.String) obj3;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.WVADownloadInfoFetcher", "fetchWVADownloadInfo: CGI error, errType=" + intValue + ", errCode=" + intValue2 + ", errMsg=" + str);
        this.f166463d.mo149xb9724478(java.lang.Integer.valueOf(intValue2), str);
        return jz5.f0.f384359a;
    }
}
