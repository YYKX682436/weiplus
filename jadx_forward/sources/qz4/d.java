package qz4;

/* loaded from: classes12.dex */
public final class d {
    public static final boolean a(am.sn snVar) {
        com.p314xaae8f345.mm.p2621x8fb0427b.f9 k17;
        if (snVar == null) {
            return false;
        }
        java.lang.String str = snVar.f89442f;
        long j17 = snVar.f89437a;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str) || j17 <= 0 || !((k17 = pt0.f0.f439742b1.k(str, j17)) == null || k17.m124847x74d37ac6() <= 0 || k17.V2() || k17.W2())) {
            return false;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WNNoteUtilKt", "checkNoteSourceMsgInfo deleted, talker:%s, msgId:%d", str, java.lang.Long.valueOf(j17));
        db5.t7.m123882x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.h_s, 0).show();
        return true;
    }

    public static final boolean b(am.zl zlVar) {
        if (zlVar == null) {
            return false;
        }
        android.os.Bundle bundle = zlVar.f90118h;
        java.lang.String string = bundle != null ? bundle.getString("snslocalid") : null;
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(string)) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(string);
            if (k17 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WNNoteUtilKt", "checkNoteAttachSnsInfo deleted snsInfo %s", string);
                db5.t7.m123882x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.h_s, 0).show();
                return true;
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(k17.f68896xdde069b, gm0.j1.b().k()) && !k17.m70414xa57c8812(2) && !k17.m70414xa57c8812(8)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.WNNoteUtilKt", "checkNoteAttachSnsInfo deleted, other user=" + k17.f68896xdde069b + ", localId=%s", string);
                db5.t7.m123882x26a183b(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, com.p314xaae8f345.mm.R.C30867xcad56011.h_s, 0).show();
                return true;
            }
        }
        return false;
    }
}
