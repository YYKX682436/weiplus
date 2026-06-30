package qe5;

/* loaded from: classes12.dex */
public final class h extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d f443651d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    /* JADX WARN: Code restructure failed: missing block: B:41:0x00f0, code lost:
    
        if ((r0 != null && r0.f68112x10a0fed7 == r8.f68112x10a0fed7) == false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d T6() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qe5.h.T6():com.tencent.mm.pluginsdk.model.app.d");
    }

    public final kd5.e U6() {
        j75.f Q6 = Q6();
        if (Q6 != null) {
            return (kd5.e) Q6.mo140437x75286adb();
        }
        return null;
    }

    public final com.p314xaae8f345.mm.p2621x8fb0427b.f9 V6() {
        kd5.e U6 = U6();
        if (U6 != null) {
            return U6.f388410e;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        if (r0.intValue() == 130) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean W6() {
        /*
            r7 = this;
            kd5.e r0 = r7.U6()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Le
            boolean r0 = r0.f388417o
            if (r0 != r1) goto Le
            r0 = r1
            goto Lf
        Le:
            r0 = r2
        Lf:
            if (r0 == 0) goto L3a
            kd5.e r0 = r7.U6()
            if (r0 == 0) goto L32
            com.tencent.mm.vfs.r6 r3 = new com.tencent.mm.vfs.r6
            java.lang.String r4 = r0.F
            r3.<init>(r4)
            boolean r4 = r3.m()
            if (r4 == 0) goto L2f
            long r3 = r3.C()
            long r5 = r0.f388427y
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L2f
            goto L30
        L2f:
            r1 = r2
        L30:
            r2 = r1
            goto L73
        L32:
            java.lang.String r0 = "MicroMsg.File.AppAttachLocalLogicUIC"
            java.lang.String r1 = "isRecordFileReadyToOpen fileDownloadState is null"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)
            goto L73
        L3a:
            ez.v0 r0 = ez.v0.f339310a
            com.tencent.mm.storage.f9 r0 = r7.V6()
            if (r0 == 0) goto L4b
            int r0 = g95.e0.b(r0)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            goto L4c
        L4b:
            r0 = 0
        L4c:
            if (r0 == 0) goto L5a
            r0.intValue()
            r3 = 130(0x82, float:1.82E-43)
            int r0 = r0.intValue()
            if (r0 != r3) goto L5a
            goto L5b
        L5a:
            r1 = r2
        L5b:
            if (r1 == 0) goto L6a
            com.tencent.mm.storage.f9 r0 = r7.V6()
            if (r0 == 0) goto L6a
            te5.h r1 = te5.h.f500182a
            boolean r0 = r1.a(r0)
            goto L72
        L6a:
            com.tencent.mm.pluginsdk.model.app.d r0 = r7.T6()
            boolean r0 = r7.X6(r0)
        L72:
            r2 = r0
        L73:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: qe5.h.W6():boolean");
    }

    public final boolean X6(com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.app.d dVar) {
        if (dVar == null) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.r6 r6Var = new com.p314xaae8f345.mm.vfs.r6(dVar.f68099xfeae815);
        return dVar.f68113xeb1a61d6 != 0 && r6Var.m() && r6Var.C() == dVar.f68113xeb1a61d6;
    }

    public final boolean Y6() {
        java.lang.String str;
        java.lang.String str2;
        if (!W6()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.File.AppAttachLocalLogicUIC", "summerapp tryOpenFile file is not ready");
            return true;
        }
        kd5.e U6 = U6();
        int i17 = U6 != null ? U6.f388411f : 0;
        if (i17 != 1) {
            if (i17 == 3) {
                android.content.Intent intent = new android.content.Intent();
                kd5.e U62 = U6();
                java.lang.String str3 = "";
                if (U62 == null || (str = U62.F) == null) {
                    str = "";
                }
                intent.putExtra(com.p314xaae8f345.p3085x8ea91595.p3094xb4b4fd90.p3095x7bee9175.C26702xd2c07cc3.DownloadInfos.DownloadInfoColumns.f56316x2db2ba1, str);
                kd5.e U63 = U6();
                if (U63 != null && (str2 = U63.f388425w) != null) {
                    str3 = str2;
                }
                intent.putExtra(com.p314xaae8f345.p3085x8ea91595.p3090x2a97d52d.C26667x4be17176.f56084x2da4207, str3);
                kd5.e U64 = U6();
                intent.putExtra("fileExt", U64 != null ? U64.f388426x : null);
                com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = P6();
                if (P6 == null) {
                    return true;
                }
                P6.setResult(-1, intent);
                P6.finish();
                return true;
            }
            kd5.e U65 = U6();
            if ((U65 != null ? U65.f388411f : 0) != 9) {
                kd5.e U66 = U6();
                if (U66 != null ? U66.f388417o : false) {
                    kd5.e U67 = U6();
                    if (U67 != null) {
                        U67.f388416n = 19;
                    }
                } else {
                    kd5.e U68 = U6();
                    if (U68 != null) {
                        U68.f388416n = 1;
                    }
                }
            }
            U6();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            pf5.z zVar = pf5.z.f435481a;
            if (((qe5.z) zVar.a(activity).a(qe5.z.class)).b7()) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity2 = m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity2, "activity");
                if (((qe5.z) zVar.a(activity2).a(qe5.z.class)).c7()) {
                    jt.a0 a0Var = (jt.a0) i95.n0.c(jt.a0.class);
                    kd5.e U69 = U6();
                    java.lang.String str4 = U69 != null ? U69.f388426x : null;
                    ((ht.s) a0Var).getClass();
                    if (!com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.t3.l(str4)) {
                        kd5.e U610 = U6();
                        java.lang.String str5 = U610 != null ? U610.f388426x : null;
                        ((ht.a) ((jt.v) i95.n0.c(jt.v.class))).getClass();
                        java.lang.String e17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2488x696c9db.f.e(str5);
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(e17, "getMimeTypeByExt(...)");
                        if (!((java.util.HashSet) com.p314xaae8f345.mm.p2470x93e71c27.p2474x633fb29.t3.f270977c).contains(e17)) {
                            return true;
                        }
                        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity3 = m158354x19263085();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity3, "activity");
                        ((qe5.z) zVar.a(activity3).a(qe5.z.class)).e7();
                        return true;
                    }
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity4 = m158354x19263085();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity4, "activity");
                    com.p314xaae8f345.mm.ui.p2650x55bb7a46.uic.p2675x2ff57c.C21861x2820f062 c21861x2820f062 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.uic.p2675x2ff57c.C21861x2820f062) zVar.a(activity4).a(com.p314xaae8f345.mm.ui.p2650x55bb7a46.uic.p2675x2ff57c.C21861x2820f062.class);
                    android.os.Bundle bundleExtra = c21861x2820f062.m158359x1e885992().getBundleExtra("jumpChat");
                    if (bundleExtra != null) {
                        bundleExtra.putString("dn", ((yv1.b1) ((c01.f8) i95.n0.c(c01.f8.class))).Ni(c21861x2820f062.m80379x76847179(), bundleExtra));
                        android.os.Parcel obtain = android.os.Parcel.obtain();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtain, "obtain(...)");
                        obtain.writeBundle(bundleExtra);
                        byte[] marshall = obtain.marshall();
                        obtain.recycle();
                        com.p314xaae8f345.mm.vfs.r7 r7Var = com.p314xaae8f345.mm.vfs.q7.f294674a;
                        com.p314xaae8f345.mm.vfs.w6.R(lp0.b.h0("miniQBArg").u() + "/jumpChat", marshall);
                    }
                    p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity5 = m158354x19263085();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity5, "activity");
                    return ((qe5.z) zVar.a(activity5).a(qe5.z.class)).d7(false);
                }
            }
        } else {
            kd5.e U611 = U6();
            if (U611 != null) {
                U611.f388416n = 7;
            }
            U6();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity6 = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity6, "activity");
            pf5.z zVar2 = pf5.z.f435481a;
            if (((qe5.z) zVar2.a(activity6).a(qe5.z.class)).b7()) {
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity7 = m158354x19263085();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity7, "activity");
                if (((qe5.z) zVar2.a(activity7).a(qe5.z.class)).d7(false)) {
                    return true;
                }
            }
        }
        return false;
    }
}
