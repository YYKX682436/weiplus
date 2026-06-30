package vv4;

/* loaded from: classes12.dex */
public final class d1 implements ry3.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19219x16fdfab1 f521990a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f521991b;

    public d1(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19219x16fdfab1 activityC19219x16fdfab1, java.lang.String str) {
        this.f521990a = activityC19219x16fdfab1;
        this.f521991b = str;
    }

    @Override // ry3.r
    public final void a(long j17, ry3.q result) {
        int i17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f521990a.f263200d, "uploadImageForSearch callback %s filePath:%s isSuccess:%b, session: %s, mBackPressCancel: %s, mScene: %s, useCdnOpt: %s.", result.f483082g, result.f483081f, java.lang.Boolean.valueOf(result.f483077b), java.lang.Long.valueOf(j17), java.lang.Boolean.valueOf(this.f521990a.f263210q), java.lang.Integer.valueOf(this.f521990a.f263204h), java.lang.Boolean.valueOf(this.f521990a.f263206m));
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19219x16fdfab1 activityC19219x16fdfab1 = this.f521990a;
        if (activityC19219x16fdfab1.f263210q) {
            return;
        }
        activityC19219x16fdfab1.f263212s = 0L;
        if (result.f483077b) {
            su4.j2 j2Var = new su4.j2();
            com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19219x16fdfab1 activityC19219x16fdfab12 = this.f521990a;
            j2Var.f494471a = activityC19219x16fdfab12;
            j2Var.f494475e = activityC19219x16fdfab12.f263203g;
            int i18 = activityC19219x16fdfab12.f263204h;
            j2Var.f494490t = !(i18 == 83 && i18 == 100) && ((i17 = activityC19219x16fdfab12.f263205i) == 15 || i17 == 16);
            int i19 = activityC19219x16fdfab12.f263205i;
            if (i19 == 17) {
                j2Var.f494490t = true;
            }
            if (i19 == 12 || i19 == 11 || i19 == 13 || i19 == 14) {
                j2Var.f494472b = 83;
            } else if (i19 == 18 || i19 == 19 || i19 == 20 || i19 == 21) {
                j2Var.f494472b = 100;
            } else if (i19 == 15 || i19 == 16) {
                j2Var.f494472b = i18;
            } else if (i19 == 17) {
                j2Var.f494472b = i18;
            } else {
                j2Var.f494472b = 81;
            }
            j2Var.f494476f = true;
            if (result.f483083h == 3) {
                j2Var.f494474d = result.f483084i;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
            } else {
                java.util.Map extParams = j2Var.f494477g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(extParams, "extParams");
                ((java.util.HashMap) extParams).put("chatSearch", "2");
                try {
                    java.util.Map extParams2 = j2Var.f494477g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(extParams2, "extParams");
                    ((java.util.HashMap) extParams2).put("reqKey", fp.s0.b(result.f483082g, "utf8"));
                } catch (java.lang.Exception unused) {
                }
                java.lang.String str = "weixin://fts/image?path=" + com.p314xaae8f345.mm.vfs.w6.i(result.f483081f, false);
                try {
                    java.util.Map extParams3 = j2Var.f494477g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(extParams3, "extParams");
                    ((java.util.HashMap) extParams3).put("cacheImageSrc", fp.s0.b(str, "utf8"));
                } catch (java.lang.Exception unused2) {
                }
                j2Var.f494478h = true;
                j2Var.f494479i = false;
                j2Var.f494491u = true;
                j2Var.f494485o = i65.a.d(this.f521990a, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
                j2Var.f494486p = true;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
                com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19219x16fdfab1 activityC19219x16fdfab13 = this.f521990a;
                java.lang.String imagePath = result.f483081f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imagePath, "imagePath");
                activityC19219x16fdfab13.T6(8, imagePath, this.f521990a.f263203g, 0, java.lang.System.currentTimeMillis());
            }
            ku5.u0 u0Var = ku5.t0.f394148d;
            vv4.b1 b1Var = new vv4.b1(this.f521990a);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(b1Var, 500L, false);
        } else {
            pm0.v.X(new vv4.c1(activityC19219x16fdfab1));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19219x16fdfab1 activityC19219x16fdfab14 = this.f521990a;
        activityC19219x16fdfab14.T6(5, this.f521991b, activityC19219x16fdfab14.f263203g, result.f483079d, java.lang.System.currentTimeMillis());
    }
}
