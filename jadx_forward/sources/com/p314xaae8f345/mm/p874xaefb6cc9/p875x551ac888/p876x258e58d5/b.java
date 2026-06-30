package com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5;

/* loaded from: classes7.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.C10917xbadaf420 f150574d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.C10917xbadaf420 c10917xbadaf420) {
        super(1);
        this.f150574d = c10917xbadaf420;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        long j17;
        long j18;
        long j19;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.nc downloadInfo = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.nc) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(downloadInfo, "downloadInfo");
        java.lang.String str = downloadInfo.f166353a;
        boolean z17 = str == null || str.length() == 0;
        com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.C10917xbadaf420 c10917xbadaf420 = this.f150574d;
        if (!z17) {
            long j27 = downloadInfo.f166356d;
            if (j27 > 0) {
                c10917xbadaf420.f150550p = j27;
            }
        }
        j17 = c10917xbadaf420.f150550p;
        if (j17 > 0) {
            j18 = c10917xbadaf420.f150550p;
            if (!fp.i.a(j18)) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("Storage insufficient for download: needSize=");
                j19 = c10917xbadaf420.f150550p;
                sb6.append(j19);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WVA.addDownloadTaskForWVA", sb6.toString());
                c10917xbadaf420.D = true;
                c10917xbadaf420.E = "fail_storage_insufficient";
                c10917xbadaf420.c();
                return jz5.f0.f384359a;
            }
        }
        com.p314xaae8f345.mm.p874xaefb6cc9.p875x551ac888.p876x258e58d5.C10917xbadaf420.D(c10917xbadaf420, downloadInfo);
        return jz5.f0.f384359a;
    }
}
