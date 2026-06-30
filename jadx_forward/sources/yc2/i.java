package yc2;

/* loaded from: classes2.dex */
public final class i implements com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f542365a;

    public i(android.app.Activity activity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f542365a = activity;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.r
    /* renamed from: onDispatch */
    public boolean mo9541xb6136779(long j17, java.lang.String str, java.lang.Object obj, int i17) {
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "finderAuthorRecommendMusicLikeAction")) {
            if (obj instanceof org.json.JSONObject) {
                try {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicOrAudioLiteAppStoreCallback", "[finderAuthorRecommendMusicLikeAction] data:" + obj);
                    bw5.g80 g80Var = new bw5.g80();
                    boolean[] zArr = g80Var.f109273x;
                    g80Var.f109256d = ((org.json.JSONObject) obj).optString("listen_id");
                    zArr[2] = true;
                    bw5.ar0 ar0Var = bw5.ar0.TingScene_UnDefined;
                    g80Var.f109266q = 1604;
                    zArr[12] = true;
                    g80Var.f109258f = ((org.json.JSONObject) obj).optInt("like_state") == 0;
                    zArr[3] = true;
                    g80Var.f109260h = 2;
                    zArr[6] = true;
                    g80Var.f109265p = 3;
                    zArr[11] = true;
                    g80Var.f109259g = false;
                    zArr[5] = true;
                    ((ef0.f2) ((qk.h8) i95.n0.c(qk.h8.class))).Di(new qk.aa(this.f542365a, g80Var, true, null, yc2.h.f542364d, 8, null), null);
                } catch (org.json.JSONException e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderMusicOrAudioLiteAppStoreCallback", java.lang.String.valueOf(e17.getMessage()));
                }
            }
        } else if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "finderAudioListenLaterAction") && (obj instanceof org.json.JSONObject)) {
            try {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderMusicOrAudioLiteAppStoreCallback", "[finderAudioListenLaterAction] data:" + obj);
                bw5.v70 v70Var = new bw5.v70();
                v70Var.u(((org.json.JSONObject) obj).optString("listen_id"));
                v70Var.y(((org.json.JSONObject) obj).optInt("type"));
                v70Var.x(((org.json.JSONObject) obj).optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28));
                v70Var.p(((org.json.JSONObject) obj).optString("author"));
                v70Var.q(((org.json.JSONObject) obj).optString("cover"));
                v70Var.r(((org.json.JSONObject) obj).optInt("duration"));
                bw5.e70 e70Var = new bw5.e70();
                boolean[] zArr2 = e70Var.E;
                e70Var.f108293f = v70Var.m13171x7531c8a2();
                zArr2[3] = true;
                e70Var.d(((org.json.JSONObject) obj).optString("nonce_id"));
                e70Var.e(((org.json.JSONObject) obj).optString("tid"));
                e70Var.f108294g = v70Var.c();
                zArr2[4] = true;
                e70Var.f108296i = v70Var.f115736v;
                zArr2[6] = true;
                e70Var.f108295h = v70Var.f();
                zArr2[5] = true;
                e70Var.f108299o = true;
                zArr2[9] = true;
                v70Var.s(e70Var);
                bw5.ar0 ar0Var2 = bw5.ar0.TingScene_FinderFeed;
                i95.m c17 = i95.n0.c(qk.a8.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                qk.a8.E8((qk.a8) c17, this.f542365a, ar0Var2, v70Var, null, 0, 0, null, null, null, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1111x8fb0427b.e0.f34847x366c91de, null);
            } catch (org.json.JSONException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("FinderMusicOrAudioLiteAppStoreCallback", java.lang.String.valueOf(e18.getMessage()));
            }
        }
        return true;
    }
}
