package rr;

/* loaded from: classes9.dex */
public final class f implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ rr.n f480659a;

    public f(rr.n nVar) {
        this.f480659a = nVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        int i18 = fVar.f152149b;
        rr.n nVar = this.f480659a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nVar.f480671d, "CgiBackupEmojiOperate onResult: errType=" + i17 + ", errCode=" + i18);
        boolean z17 = true;
        if (i17 == 0 && i18 == 0) {
            rr.n.a(nVar, true);
        } else {
            android.app.Activity activity = nVar.f480668a;
            if (i18 != -2049) {
                com.p314xaae8f345.mm.p2621x8fb0427b.p2622x9f28205b.C21053xdbf1e5f4 c21053xdbf1e5f4 = nVar.f480670c;
                if (i18 != -434) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10431, 0, c21053xdbf1e5f4.mo42933xb5885648(), c21053xdbf1e5f4.f68657xb76d85ab, c21053xdbf1e5f4.f68663x861009b5, 1, 3, java.lang.Integer.valueOf(c21053xdbf1e5f4.f68679x22618426), nVar.f480669b, c21053xdbf1e5f4.f68641x3342accf);
                    java.lang.String str = fVar.f152150c;
                    if (str != null && str.length() != 0) {
                        z17 = false;
                    }
                    db5.e1.s(activity, !z17 ? fVar.f152150c : activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.buj), "");
                } else {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(nVar.f480671d, "[cpan] save emoji onSceneEnd error over size.");
                    gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_EMOJI_SYNC_CUSTOM_EMOJI_BATCH_DOWNLOAD_BOOLEAN, java.lang.Boolean.TRUE);
                    nVar.b();
                    com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(10431, 0, c21053xdbf1e5f4.mo42933xb5885648(), c21053xdbf1e5f4.f68657xb76d85ab, c21053xdbf1e5f4.f68663x861009b5, 1, 1, java.lang.Integer.valueOf(c21053xdbf1e5f4.f68679x22618426), nVar.f480669b, c21053xdbf1e5f4.f68641x3342accf);
                }
            } else {
                java.lang.String string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bul);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
                com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 y17 = db5.e1.y(activity, string, "", activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.by_), null);
                if (y17 != null) {
                    y17.show();
                }
            }
            rr.n.a(nVar, false);
        }
        return jz5.f0.f384359a;
    }
}
