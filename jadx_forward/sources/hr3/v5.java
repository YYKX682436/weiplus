package hr3;

/* loaded from: classes11.dex */
public class v5 implements db5.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String[] f365632a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16851xecb309af f365633b;

    public v5(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16851xecb309af activityC16851xecb309af, java.lang.String[] strArr) {
        this.f365633b = activityC16851xecb309af;
        this.f365632a = strArr;
    }

    @Override // db5.c1
    public void e(int i17) {
        int lastIndexOf;
        r61.a aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16851xecb309af activityC16851xecb309af = this.f365633b;
        if (i17 == 0) {
            java.lang.String str = activityC16851xecb309af.f235250g;
            if (str == null || str.length() == 0 || (lastIndexOf = activityC16851xecb309af.f235250g.lastIndexOf(32) + 1) <= 0) {
                return;
            }
            activityC16851xecb309af.V6(activityC16851xecb309af.f235250g.substring(lastIndexOf));
            return;
        }
        if (i17 == 1) {
            java.lang.String str2 = activityC16851xecb309af.f235250g;
            if (str2 == null || str2.length() == 0) {
                return;
            }
            java.lang.String substring = activityC16851xecb309af.f235250g.substring(0, activityC16851xecb309af.f235250g.lastIndexOf(32));
            if (substring == null || substring.length() == 0) {
                return;
            }
            c01.e2.q0(activityC16851xecb309af.f235248e, substring.trim());
            return;
        }
        if (i17 == 2) {
            java.lang.String[] strArr = this.f365632a;
            if (strArr == null || strArr.length <= 2 || (aVar = activityC16851xecb309af.f235249f) == null || activityC16851xecb309af.f235248e == null) {
                return;
            }
            if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(aVar.f474333p)) {
                java.lang.String d17 = activityC16851xecb309af.f235248e.d1();
                java.lang.String str3 = activityC16851xecb309af.f235249f.f474333p;
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17) || com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    dp.a.m125854x26a183b(activityC16851xecb309af.mo55332x76847179(), activityC16851xecb309af.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bgr), 0).show();
                    return;
                }
                ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                android.graphics.Bitmap m17 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ai().m(d17);
                if (m17 == null) {
                    dp.a.m125854x26a183b(activityC16851xecb309af.mo55332x76847179(), activityC16851xecb309af.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bgs), 0).show();
                    com.p314xaae8f345.mm.p943x351df9c2.m0 m0Var = new com.p314xaae8f345.mm.p943x351df9c2.m0();
                    m0Var.a(d17, new hr3.w5(activityC16851xecb309af, m0Var, d17, str3));
                    return;
                } else if (activityC16851xecb309af.X6(str3, m17)) {
                    dp.a.m125854x26a183b(activityC16851xecb309af.mo55332x76847179(), activityC16851xecb309af.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bgt), 0).show();
                    return;
                } else {
                    dp.a.m125854x26a183b(activityC16851xecb309af.mo55332x76847179(), activityC16851xecb309af.mo55332x76847179().getString(com.p314xaae8f345.mm.R.C30867xcad56011.bgr), 0).show();
                    return;
                }
            }
        } else if (i17 != 3) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putInt("fromScene", 2);
        intent.putExtra("reportArgs", bundle);
        ((bt.d) ((ct.u2) i95.n0.c(ct.u2.class))).f105601d.getClass();
        android.os.Bundle bundleExtra = intent.getBundleExtra("reportArgs");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11621, java.lang.Integer.valueOf(bundleExtra != null ? bundleExtra.getInt("fromScene") : 0), 0);
        ((uz.v1) ((vz.v1) i95.n0.c(vz.v1.class))).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.C13222x107de37 r17 = com.p314xaae8f345.mm.p1006xc5476f33.p1357x798ad335.p1360x633fb29.r0.i().r("http://dianhua.qq.com/cgi-bin/cloudgrptemplate?t=dianhuaben_download&channel=100008");
        if (r17 == null || r17.f178496f != 3) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WxPhoneBookHelper", "weixin phonebook already download successfully, install directly");
        if (com.p314xaae8f345.mm.vfs.w6.j(r17.f178497g)) {
            com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.n1.d(activityC16851xecb309af, r17.f178497g, null, false);
        }
    }
}
