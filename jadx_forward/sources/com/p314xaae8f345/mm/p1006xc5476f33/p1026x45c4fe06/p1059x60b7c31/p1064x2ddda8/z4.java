package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class z4 implements ui1.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j5 f161346a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y f161347b;

    public z4(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j5 j5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.y yVar) {
        this.f161346a = j5Var;
        this.f161347b = yVar;
    }

    @Override // ui1.y
    public void a(int i17, java.util.ArrayList resultData, int i18, boolean z17) {
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultData, "resultData");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxaCarLicensePlateChooserViewController", "prompt onMsg, resultCode:" + i17 + ", id:" + i18 + "  userAgreementChecked:" + z17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.j5 j5Var = this.f161346a;
        boolean z18 = true;
        if (1 != i17) {
            j5Var.f161140h.f143454i = 4L;
            j5Var.f161141i.a();
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1307x2264dc6d.api.p1308xb29de3e3.C13026x8642c3d7 c13026x8642c3d7 = j5Var.h().f176156d;
        java.lang.String str = (c13026x8642c3d7 == null || (arrayList = c13026x8642c3d7.f176137d) == null) ? null : (java.lang.String) kz5.n0.a0(arrayList, i18);
        if (str != null && str.length() != 0) {
            z18 = false;
        }
        if (z18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WxaCarLicensePlateChooserViewController", "prompt onMsg, invalid avatarId(index):" + i18);
        } else {
            p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.y4(str, this.f161347b, z17, null), 3, null);
            j5Var.f161140h.f143454i = 3L;
            j5Var.f161141i.b(str);
        }
    }
}
