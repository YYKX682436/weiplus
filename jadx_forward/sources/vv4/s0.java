package vv4;

/* loaded from: classes12.dex */
public final class s0 implements ry3.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19218x71796ad1 f522030a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f522031b;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19218x71796ad1 activityC19218x71796ad1, java.lang.String str) {
        this.f522030a = activityC19218x71796ad1;
        this.f522031b = str;
    }

    @Override // ry3.r
    public final void a(long j17, ry3.q result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f522030a.f263187d, "uploadImageForSearch callback %s filePath:%s isSucess:%b, session: %s, %s, mBackPressCancel: %s.", result.f483082g, result.f483081f, java.lang.Boolean.valueOf(result.f483077b), java.lang.Long.valueOf(j17), o13.p.c(j17), java.lang.Boolean.valueOf(this.f522030a.f263195o));
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19218x71796ad1 activityC19218x71796ad1 = this.f522030a;
        if (activityC19218x71796ad1.f263195o) {
            return;
        }
        activityC19218x71796ad1.f263198r = 0L;
        if (result.f483077b) {
            if (result.f483083h == 3) {
                su4.j2 j2Var = new su4.j2();
                com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19218x71796ad1 activityC19218x71796ad12 = this.f522030a;
                j2Var.f494471a = activityC19218x71796ad12;
                j2Var.f494472b = 67;
                j2Var.f494474d = result.f483084i;
                j2Var.f494475e = activityC19218x71796ad12.f263191h;
                j2Var.f494479i = false;
                j2Var.f494476f = true;
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var);
            } else {
                su4.j2 j2Var2 = new su4.j2();
                com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19218x71796ad1 activityC19218x71796ad13 = this.f522030a;
                j2Var2.f494471a = activityC19218x71796ad13;
                j2Var2.f494472b = 67;
                j2Var2.f494474d = "";
                j2Var2.f494475e = activityC19218x71796ad13.f263191h;
                j2Var2.f494476f = true;
                j2Var2.f494478h = true;
                j2Var2.f494479i = false;
                j2Var2.f494491u = true;
                j2Var2.f494485o = i65.a.d(activityC19218x71796ad13, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw);
                j2Var2.f494486p = true;
                java.util.Map extParams = j2Var2.f494477g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(extParams, "extParams");
                ((java.util.HashMap) extParams).put("chatSearch", "2");
                try {
                    java.util.Map extParams2 = j2Var2.f494477g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(extParams2, "extParams");
                    ((java.util.HashMap) extParams2).put("reqKey", fp.s0.b(result.f483082g, "utf8"));
                } catch (java.lang.Exception unused) {
                }
                java.lang.String str = "weixin://fts/image?path=" + com.p314xaae8f345.mm.vfs.w6.i(result.f483081f, false);
                try {
                    java.util.Map extParams3 = j2Var2.f494477g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(extParams3, "extParams");
                    ((java.util.HashMap) extParams3).put("cacheImageSrc", fp.s0.b(str, "utf8"));
                } catch (java.lang.Exception unused2) {
                }
                ((com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.h2) ((su4.a1) i95.n0.c(su4.a1.class))).Vi(j2Var2);
                com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19218x71796ad1 activityC19218x71796ad14 = this.f522030a;
                java.lang.String imagePath = result.f483081f;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imagePath, "imagePath");
                activityC19218x71796ad14.U6(8, imagePath, this.f522030a.f263191h, 0, java.lang.System.currentTimeMillis());
            }
            ku5.u0 u0Var = ku5.t0.f394148d;
            vv4.q0 q0Var = new vv4.q0(this.f522030a);
            ku5.t0 t0Var = (ku5.t0) u0Var;
            t0Var.getClass();
            t0Var.z(q0Var, 500L, false);
        } else {
            pm0.v.X(new vv4.r0(activityC19218x71796ad1));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.ui.ActivityC19218x71796ad1 activityC19218x71796ad15 = this.f522030a;
        activityC19218x71796ad15.U6(5, this.f522031b, activityC19218x71796ad15.f263191h, result.f483079d, java.lang.System.currentTimeMillis());
    }
}
