package com.p314xaae8f345.mm.p1006xc5476f33.p2080x6854f06.p2081x633fb29;

/* renamed from: com.tencent.mm.plugin.shake.model.ShakeMgrImpl */
/* loaded from: classes11.dex */
public class C17661x1f327a92 implements o25.v1 {
    /* renamed from: attachAvatarDrawable */
    public void m69122x69141abc(android.widget.ImageView imageView, int i17, java.lang.String str, java.lang.String str2) {
        android.graphics.Paint paint = i34.d.f369844m;
        if (4 != i17 && (!h34.z.d(i17) || 6 == i17)) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str2, null);
            return;
        }
        if (4 != i17) {
            imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        }
        imageView.post(new i34.a(imageView, str2, -1, str, i17));
    }

    @Override // o25.v1
    /* renamed from: checkShakeCardEntrance */
    public void mo69123x3909afe4() {
        g34.a.a();
    }

    @Override // o25.v1
    /* renamed from: clearShakeCardEntranceData */
    public void mo69124x654d9d89() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardUtil", "ShakeCardUtil clearShakeCardEntranceData()");
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_ENTRANCE_BEGIN_TIME_INT_SYNC, 0);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_ENTRANCE_END_TIME_INT_SYNC, 0);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_ENTRANCE_NAME_STRING_SYNC, "");
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_ACTIVITY_TYPE_INT_SYNC, 0);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_FLOW_CONTROL_LEVEL_MIN_INT_SYNC, 0);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_FLOW_CONTROL_LEVEL_MAX_INT_SYNC, 0);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_ENTRANCE_TIP_STRING_SYNC, "");
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a.g().p(262154, false);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_ID_STRING_SYNC, "");
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_DESC_STRING_SYNC, "");
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_TEXT_STRING_SYNC, "");
    }

    /* renamed from: getAttachAvatarDrawablePath */
    public java.lang.String m69125x6802c677(java.lang.String str) {
        return i34.d.b(str);
    }

    /* renamed from: getShakeItemMusicType */
    public int m69126x19711dbc() {
        return 4;
    }

    @Override // o25.v1
    /* renamed from: getShakeMessageUnreadCnt */
    public int mo69127xf0c91463() {
        return c34.h0.Ri().f();
    }

    @Override // o25.v1
    /* renamed from: isShakeCardEntranceOpen */
    public boolean mo69128x555c596c() {
        return g34.a.g();
    }

    @Override // o25.v1
    /* renamed from: isShowShakeTV */
    public boolean mo69129x3d8522c1() {
        return h34.z.e();
    }

    @Override // o25.v1
    /* renamed from: setShakeCardEntranceData */
    public void mo69130xe7c9a694() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ShakeCardUtil", "ShakeCardUtil setShakeCardEntranceData()");
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_ENTRANCE_BEGIN_TIME_INT_SYNC, java.lang.Integer.valueOf(currentTimeMillis));
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_ENTRANCE_END_TIME_INT_SYNC, java.lang.Integer.valueOf(86400 + currentTimeMillis));
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_ENTRANCE_NAME_STRING_SYNC, "");
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_ACTIVITY_TYPE_INT_SYNC, 0);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_FLOW_CONTROL_LEVEL_MIN_INT_SYNC, 1);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_FLOW_CONTROL_LEVEL_MAX_INT_SYNC, 6);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_ENTRANCE_TIP_STRING_SYNC, "");
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a.g().p(262154, true);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_ID_STRING_SYNC, "" + currentTimeMillis);
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_DESC_STRING_SYNC, "hello");
        c01.d9.b().p().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_TEXT_STRING_SYNC, "shake card");
    }
}
