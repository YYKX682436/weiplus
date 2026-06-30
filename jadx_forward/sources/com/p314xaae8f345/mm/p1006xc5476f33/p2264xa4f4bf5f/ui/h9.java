package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class h9 implements com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.r5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pj4.a0 f255488a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 f255489b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f255490c;

    public h9(pj4.a0 a0Var, com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var) {
        this.f255488a = a0Var;
        this.f255489b = activityC18639xf6f98078;
        this.f255490c = h0Var;
    }

    public final void a(int i17, java.lang.String str) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.TextStatusEditActivity", "initEmojiInfo:  emojiUploadCheck errType:" + i17 + " gifMd5:" + str);
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.ActivityC18639xf6f98078 activityC18639xf6f98078 = this.f255489b;
        if (i17 != 0) {
            activityC18639xf6f98078.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.g9(activityC18639xf6f98078));
            return;
        }
        java.lang.String str2 = this.f255488a.f436490d;
        if (str2 != null) {
            if (str == null || r26.n0.N(str)) {
                str = str2;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            }
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.q0) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.z5.class))).getClass();
            com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = new com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4();
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
                c21053xdbf1e5f4.f68671x4b6e68b9 = str;
            }
            this.f255490c.f391656d = c21053xdbf1e5f4;
            activityC18639xf6f98078.runOnUiThread(new com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.f9(activityC18639xf6f98078, c21053xdbf1e5f4));
        }
    }
}
