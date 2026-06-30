package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class d7 extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.Map f215618e = kz5.c1.k(new jz5.l("title_wording", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.vfz)), new jz5.l("content_wording", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.szu)), new jz5.l("thumb_wording", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.veo)), new jz5.l("heart_wording", java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.id.u2a)));

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.Map f215619f = kz5.c1.k(new jz5.l("title_wording_voice_over", "title_wording"), new jz5.l("content_wording_voice_over", "content_wording"));

    /* renamed from: d, reason: collision with root package name */
    public boolean f215620d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d7(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    public static final java.util.Map O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d7 d7Var, dm.x3 x3Var) {
        d7Var.getClass();
        in5.c Lj = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).Lj(d7Var.m158354x19263085());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = Lj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) Lj : null;
        jz5.l[] lVarArr = new jz5.l[6];
        lVarArr[0] = new jz5.l("feed_id", pm0.v.u(abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L));
        lVarArr[1] = new jz5.l("session_buffer", abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.g0() : null);
        lVarArr[2] = new jz5.l("edu_biz_type", java.lang.Integer.valueOf(x3Var.f69116x6a05088b));
        lVarArr[3] = new jz5.l("bypass", x3Var.f69117xb27c84f2);
        lVarArr[4] = new jz5.l("trigger_ts", java.lang.Integer.valueOf(c01.id.e()));
        r45.bf0 bf0Var = x3Var.f69118x6c6ddd30;
        lVarArr[5] = new jz5.l("edu_style_type", bf0Var != null ? java.lang.Integer.valueOf(bf0Var.m75939xb282bd08(3)) : null);
        return kz5.c1.k(lVarArr);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        Q6(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0048 A[Catch: all -> 0x0041, LOOP:0: B:6:0x0048->B:34:0x0082, LOOP_START, TryCatch #0 {all -> 0x0041, blocks: (B:45:0x0039, B:6:0x0048, B:8:0x004e, B:15:0x006b, B:17:0x0071, B:19:0x0078, B:22:0x007e, B:34:0x0082, B:38:0x0061, B:39:0x0064, B:40:0x0067), top: B:44:0x0039 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P6(java.util.List r12) {
        /*
            r11 = this;
            java.lang.Class<c61.l7> r0 = c61.l7.class
            i95.m r0 = i95.n0.c(r0)
            java.lang.String r1 = "getService(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r0, r1)
            c61.l7 r0 = (c61.l7) r0
            jz5.g r0 = r0.H
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.mo141623x754a37bb()
            com.tencent.mm.plugin.finder.storage.r r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.r) r0
            int r1 = c01.id.e()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "storageCount: "
            r2.<init>(r3)
            int r3 = r0.mo78086x7444f759()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FinderCommonEducationUIC"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r2)
            android.database.Cursor r0 = r0.mo78085xb5882a6b()
            r2 = 1
            if (r0 == 0) goto L44
            boolean r4 = r0.moveToFirst()     // Catch: java.lang.Throwable -> L41
            if (r4 != r2) goto L44
            r4 = r2
            goto L45
        L41:
            r12 = move-exception
            goto Lb6
        L44:
            r4 = 0
        L45:
            r5 = 0
            if (r4 == 0) goto Lbc
        L48:
            boolean r4 = r0.isAfterLast()     // Catch: java.lang.Throwable -> L41
            if (r4 != 0) goto Lbc
            dm.x3 r4 = new dm.x3     // Catch: java.lang.Throwable -> L41
            r4.<init>()     // Catch: java.lang.Throwable -> L41
            r4.mo9015xbf5d97fd(r0)     // Catch: java.lang.Throwable -> L41
            int r6 = r4.f69116x6a05088b     // Catch: java.lang.Throwable -> L41
            if (r6 == 0) goto L67
            if (r6 == r2) goto L64
            r7 = 2
            if (r6 == r7) goto L61
            r6 = r5
            goto L69
        L61:
            r45.ki0 r6 = r45.ki0.EDU_BIZ_TYPE_CANCEL_LIKE     // Catch: java.lang.Throwable -> L41
            goto L69
        L64:
            r45.ki0 r6 = r45.ki0.EDU_BIZ_TYPE_LIKE     // Catch: java.lang.Throwable -> L41
            goto L69
        L67:
            r45.ki0 r6 = r45.ki0.EDU_BIZ_TYPE_UNKNOWN     // Catch: java.lang.Throwable -> L41
        L69:
            if (r6 == 0) goto L82
            boolean r7 = r12.contains(r6)     // Catch: java.lang.Throwable -> L41
            if (r7 == 0) goto L82
            long r7 = (long) r1     // Catch: java.lang.Throwable -> L41
            long r9 = r4.f69121x6c3fc521     // Catch: java.lang.Throwable -> L41
            int r9 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r9 < 0) goto L82
            long r9 = r4.f69119xf869a748     // Catch: java.lang.Throwable -> L41
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 > 0) goto L82
            r11.Q6(r4)     // Catch: java.lang.Throwable -> L41
            goto Lbc
        L82:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L41
            r7.<init>()     // Catch: java.lang.Throwable -> L41
            java.lang.String r8 = "item can not show, bizType: "
            r7.append(r8)     // Catch: java.lang.Throwable -> L41
            r7.append(r6)     // Catch: java.lang.Throwable -> L41
            java.lang.String r6 = ", start: "
            r7.append(r6)     // Catch: java.lang.Throwable -> L41
            long r8 = r4.f69121x6c3fc521     // Catch: java.lang.Throwable -> L41
            r7.append(r8)     // Catch: java.lang.Throwable -> L41
            java.lang.String r6 = ", end: "
            r7.append(r6)     // Catch: java.lang.Throwable -> L41
            long r8 = r4.f69119xf869a748     // Catch: java.lang.Throwable -> L41
            r7.append(r8)     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = ", serverTime: "
            r7.append(r4)     // Catch: java.lang.Throwable -> L41
            r7.append(r1)     // Catch: java.lang.Throwable -> L41
            java.lang.String r4 = r7.toString()     // Catch: java.lang.Throwable -> L41
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r3, r4)     // Catch: java.lang.Throwable -> L41
            r0.moveToNext()     // Catch: java.lang.Throwable -> L41
            goto L48
        Lb6:
            throw r12     // Catch: java.lang.Throwable -> Lb7
        Lb7:
            r1 = move-exception
            vz5.b.a(r0, r12)
            throw r1
        Lbc:
            vz5.b.a(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d7.P6(java.util.List):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x0291 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0292  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Q6(dm.x3 r29) {
        /*
            Method dump skipped, instructions count: 790
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.d7.Q6(dm.x3):void");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        cq.k1.a();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209225f6).mo141623x754a37bb()).r()).booleanValue()) {
            P6(kz5.b0.c(r45.ki0.EDU_BIZ_TYPE_LIKE));
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        if (this.f215620d) {
            this.f215620d = false;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ea) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ea.class)).f215774e = false;
        }
    }
}
