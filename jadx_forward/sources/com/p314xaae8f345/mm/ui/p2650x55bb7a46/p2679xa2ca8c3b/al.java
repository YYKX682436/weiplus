package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public final class al {
    public al(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static final void a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.al alVar, yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.ao aoVar, java.util.Map map) {
        alVar.getClass();
        java.lang.String str = (java.lang.String) map.get(".msg.appmsg.giftinfo.attrcontent");
        java.lang.String str2 = (java.lang.String) map.get(".msg.appmsg.giftinfo.tip");
        java.lang.String str3 = (java.lang.String) map.get(".msg.appmsg.giftinfo.object_id");
        long Z = str3 != null ? pm0.v.Z(str3) : 0L;
        java.lang.String str4 = (java.lang.String) map.get(".msg.appmsg.giftinfo.gift_id");
        r45.tq4 tq4Var = new r45.tq4();
        tq4Var.f468237e = str4;
        tq4Var.f468236d = Z;
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            bundle.putByteArray("KEY_FINDER_LIVE_JUMP_DATA", tq4Var.mo14344x5f01b1f6());
            java.lang.String str5 = (java.lang.String) map.get(".msg.appmsg.finder_appmsg_type");
            bundle.putInt("KEY_FINDER_LIVE_JUMP_TYPE", str5 != null ? java.lang.Integer.parseInt(str5) : 0);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ChattingItemFinderLiveLotteryGift", "putByteArray error:" + th6);
        }
        aoVar.f284926p.setText(str2);
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        int m84164x40077844 = (int) aoVar.f284912b.m84164x40077844();
        ((ke0.e) xVar).getClass();
        aoVar.f284912b.c(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.l(context, str, m84164x40077844, 4, bundle, true), android.widget.TextView.BufferType.SPANNABLE, null);
    }
}
