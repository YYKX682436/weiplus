package gk;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final gk.b f353941a = new gk.b();

    /* renamed from: b, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 f353942b;

    static {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 J2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("AdCommonFeatureMAP", ((java.lang.Number) ((jz5.n) jz5.h.b(gk.a.f353940d)).mo141623x754a37bb()).intValue(), 2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(J2, "getAccountAwareMMKV(...)");
        f353942b = J2;
    }

    public final r45.e5 a(java.lang.String aid) {
        byte[] j17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aid, "aid");
        try {
            j17 = f353942b.j("magicAd-adsInfo-".concat(aid));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdCommonFeatureMAP", "Failed to decode ad info for aid: ".concat(aid), e17);
        }
        if (j17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdCommonFeatureMAP", "No ad info found for aid: ".concat(aid));
            return null;
        }
        r45.e5 e5Var = new r45.e5();
        e5Var.m75932x347fbd55(j17);
        return e5Var;
    }

    public final r45.e5 b(wj.t0 posId) {
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(posId, "posId");
        java.util.Set c17 = c(posId.f528051d);
        if (c17 == null || (str = (java.lang.String) kz5.n0.Y(c17)) == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdCommonFeatureMAP", "getAdsInfo, serverAid for cur posId not found, posId: " + posId);
            return null;
        }
        r45.e5 a17 = a(str);
        if (a17 != null) {
            return a17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("AdCommonFeatureMAP", "getAdsInfo, adInfo not found, posId: " + posId + ", aid: " + str + ' ');
        return null;
    }

    public final java.util.Set c(java.lang.String posId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(posId, "posId");
        java.util.Set v17 = f353942b.v(g(posId));
        if (v17 != null) {
            return v17;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("AdCommonFeatureMAP", "No aid found for posId: ".concat(posId));
        return null;
    }

    public final boolean d(java.lang.String posId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(posId, "posId");
        long q17 = f353942b.q("magicAd-expiredTime-".concat(posId), 0L);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        boolean z17 = q17 <= currentTimeMillis;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdCommonFeatureMAP", "checkIsExpired, expiredTime: " + q17 + ", curTime: " + currentTimeMillis + ", isExpired: " + z17);
        return z17;
    }

    public final void e(java.lang.String posId, java.lang.String aid) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(posId, "posId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aid, "aid");
        java.lang.String g17 = g(posId);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = f353942b;
        java.util.Set v17 = o4Var.v(g17);
        if (v17 == null) {
            v17 = new java.util.HashSet();
        }
        v17.add(aid);
        o4Var.F(f353941a.g(posId), v17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdCommonFeatureMAP", "Aid set to " + aid + " for posId: " + posId);
    }

    public final boolean f(java.lang.String posId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(posId, "posId");
        boolean i17 = f353942b.i("magicAd-feedback-".concat(posId), false);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdCommonFeatureMAP", "is feedback, posId: " + posId + ", enable: " + i17);
        return i17;
    }

    public final java.lang.String g(java.lang.String str) {
        return "magicAd-new-posAidSet-" + str;
    }

    public final void h(java.lang.String aid) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aid, "aid");
        f353942b.remove("magicAd-adsInfo-".concat(aid));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdCommonFeatureMAP", "reset adInfo, aid: ".concat(aid));
    }

    public final void i(java.lang.String aid, r45.e5 adInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(aid, "aid");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adInfo, "adInfo");
        byte[] mo14344x5f01b1f6 = adInfo.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
        f353942b.H("magicAd-adsInfo-".concat(aid), mo14344x5f01b1f6);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdCommonFeatureMAP", "Ad info (byte array) set for aid: ".concat(aid));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdCommonFeatureMAP", "Ad info set for aid: ".concat(aid));
    }

    public final void j(long j17, java.lang.String posId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(posId, "posId");
        f353942b.B("magicAd-expiredTime-".concat(posId), j17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("AdCommonFeatureMAP", "Expired time set to: " + j17);
    }
}
