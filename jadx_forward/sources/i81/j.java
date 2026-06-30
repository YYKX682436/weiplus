package i81;

/* loaded from: classes7.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Map f371125a;

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f371126b;

    static {
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put(":appbrand0", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.ActivityC11550x40c70d1d.class);
        hashMap.put(":appbrand1", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.ActivityC11553xd81a96b4.class);
        hashMap.put(":appbrand2", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.ActivityC11554xd81a96b5.class);
        hashMap.put(":appbrand3", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.ActivityC11555xd81a96b6.class);
        hashMap.put(":appbrand4", com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.ui.ActivityC11556xd81a96b7.class);
        f371125a = java.util.Collections.unmodifiableMap(hashMap);
        java.util.HashSet hashSet = new java.util.HashSet();
        f371126b = hashSet;
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.n.f33390x24728b);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.m.f33388x24728b);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.k.f33386x24728b);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.i.f33384x24728b);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.g.f33382x24728b);
        hashSet.add(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ad.p1027x60b7c31.s.f33394x24728b);
        hashSet.add(if1.o.f69932x24728b);
        hashSet.add(if1.q.f69936x24728b);
        hashSet.add(if1.n.f69930x24728b);
        hashSet.add(if1.p.f69934x24728b);
        hashSet.add(if1.m.f69928x24728b);
    }

    public static boolean a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4) {
        boolean z17 = true;
        if (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6.f167695n3) {
            int h17 = bm5.o1.f104252a.h(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.ad.C19905xf8d64aaf());
            if (h17 != 0 && h17 == 1) {
                return true;
            }
        }
        if (!i81.d.b()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "isAdContact, showad experiment closed");
            return false;
        }
        boolean z18 = c11809xbc286be4.g() ? c11809xbc286be4.f158833m2 : c11809xbc286be4.f158832l2;
        if (i81.d.a()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "isAdContact, set to all show ad");
        } else {
            z17 = z18;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandAdUtils[AppBrandSplashAd]", "isAdContact, appId:%s, canShowAd:%s", c11809xbc286be4.f158811d, java.lang.Boolean.valueOf(z17));
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void b(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 r10, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1194x363585.e0 r11, boolean r12) {
        /*
            int r11 = r11.ordinal()
            r0 = 3
            r1 = 2
            r2 = 1
            if (r11 == 0) goto L12
            if (r11 == r2) goto L10
            if (r11 == r1) goto Le
            goto L12
        Le:
            r11 = r0
            goto L13
        L10:
            r11 = r1
            goto L13
        L12:
            r11 = r2
        L13:
            com.tencent.mm.plugin.appbrand.report.quality.QualitySessionRuntime r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.p1185x26d0c0ff.e.a(r10)
            if (r3 != 0) goto L2b
            com.tencent.mm.plugin.appbrand.report.quality.QualitySession r3 = new com.tencent.mm.plugin.appbrand.report.quality.QualitySession
            java.lang.String r5 = ""
            com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC r6 = r10.u0()
            com.tencent.mm.plugin.appbrand.report.AppBrandStatObject r7 = r10.l2()
            r8 = 0
            r4 = r3
            r4.<init>(r5, r6, r7, r8)
        L2b:
            com.tencent.mm.plugin.report.service.g0 r10 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE
            r4 = 7
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            java.lang.String r6 = r3.f169668e
            r4[r5] = r6
            int r5 = r3.f169672i
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r2] = r5
            int r5 = r3.f169669f
            if (r5 == r2) goto L4d
            if (r5 == r1) goto L4a
            if (r5 == r0) goto L47
            r2 = 0
            goto L4f
        L47:
            cm.e0 r2 = cm.e0.demo
            goto L4f
        L4a:
            cm.e0 r2 = cm.e0.debug
            goto L4f
        L4d:
            cm.e0 r2 = cm.e0.release
        L4f:
            r4[r1] = r2
            int r1 = r3.f169670g
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r4[r0] = r1
            int r0 = r3.f169671h
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 4
            r4[r1] = r0
            r0 = 5
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            r4[r0] = r11
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            r12 = 6
            r4[r12] = r11
            r11 = 21052(0x523c, float:2.95E-41)
            r10.d(r11, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i81.j.b(com.tencent.mm.plugin.appbrand.o6, com.tencent.mm.plugin.appbrand.task.e0, boolean):void");
    }

    public static void c(i81.q qVar) {
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11539x905d5b94.m48815xb9a3283c(qVar.m134915x9a3f0ba2())) {
            mi1.i iVar = qVar.m134914xcfb7c672().f371056f;
            iVar.m147351x5e721652(iVar.getContext().getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561553lt));
            return;
        }
        android.view.View mo2206x5ca2d9f1 = qVar.m134914xcfb7c672().mo2206x5ca2d9f1();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mo2206x5ca2d9f1, "<this>");
        android.content.Context context = mo2206x5ca2d9f1.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        mi1.f3.a(mo2206x5ca2d9f1, context, false);
        mi1.i iVar2 = qVar.m134914xcfb7c672().f371056f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(iVar2, "<this>");
        android.content.Context context2 = iVar2.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
        mi1.f3.c(iVar2, context2, false);
    }
}
