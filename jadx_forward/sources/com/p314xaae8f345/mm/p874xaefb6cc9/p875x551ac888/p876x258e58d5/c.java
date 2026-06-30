package com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5;

/* loaded from: classes7.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.C10917xbadaf420 f150575d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.C10917xbadaf420 c10917xbadaf420) {
        super(2);
        this.f150575d = c10917xbadaf420;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WVA.addDownloadTaskForWVA", "fetchWVADownloadInfo failed: errCode=" + ((java.lang.Number) obj).intValue() + ", errMsg=" + str);
        com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.C10917xbadaf420 c10917xbadaf420 = this.f150575d;
        c10917xbadaf420.D = true;
        if (str == null) {
            str = "fail_fetch_download_info";
        }
        c10917xbadaf420.E = str;
        c10917xbadaf420.c();
        return jz5.f0.f384359a;
    }
}
