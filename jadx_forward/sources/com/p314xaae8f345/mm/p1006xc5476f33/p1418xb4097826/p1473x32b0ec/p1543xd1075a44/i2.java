package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class i2 implements ut3.d {

    /* renamed from: d, reason: collision with root package name */
    public final android.app.Activity f200149d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f200150e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f200151f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e6 f200152g;

    /* renamed from: h, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f200153h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f200154i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f200155m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e f200156n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f200157o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f200158p;

    /* renamed from: q, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x1 f200159q;

    public i2(android.app.Activity activity, android.widget.ImageView coverIv, android.view.View replaceCoverIv, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.e6 callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverIv, "coverIv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(replaceCoverIv, "replaceCoverIv");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        this.f200149d = activity;
        this.f200150e = coverIv;
        this.f200151f = replaceCoverIv;
        this.f200152g = callback;
        this.f200153h = p3325xe03a0797.p3326xc267989b.z0.b();
        this.f200154i = "";
        this.f200155m = "";
        this.f200157o = "";
        this.f200158p = "";
        replaceCoverIv.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.a2(this));
        this.f200159q = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.x1(activity, 100112);
    }

    public final void a(ml2.x3 x3Var) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", x3Var.f409766d);
        jSONObject.put("sence", 2);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f408858e;
        zy2.zb.j5(zbVar, 7L, jSONObject.toString(), null, 4, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = this;
            java.lang.String r0 = "coverUrl"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            java.lang.String r0 = "setCover liveCover:"
            java.lang.String r0 = r0.concat(r6)
            java.lang.String r1 = "Finder.FinderGameLivePostCoverWidget"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            java.lang.String r0 = ""
            if (r7 != 0) goto L15
            r7 = r0
        L15:
            r5.f200157o = r7
            if (r8 != 0) goto L1b
            r7 = r0
            goto L1c
        L1b:
            r7 = r8
        L1c:
            r5.f200158p = r7
            r7 = 0
            if (r8 == 0) goto L37
            int r1 = r8.length()
            if (r1 <= 0) goto L29
            r1 = 1
            goto L2a
        L29:
            r1 = 0
        L2a:
            if (r1 == 0) goto L2d
            goto L2e
        L2d:
            r8 = r7
        L2e:
            if (r8 == 0) goto L37
            km2.g r1 = km2.g.f390633a
            km2.e r8 = r1.d(r8)
            goto L38
        L37:
            r8 = r7
        L38:
            android.widget.ImageView r1 = r5.f200150e
            if (r8 == 0) goto L5c
            zl2.r4 r6 = zl2.r4.f555483a
            int r2 = r1.getWidth()
            r3 = 500(0x1f4, float:7.0E-43)
            int r2 = java.lang.Math.min(r2, r3)
            int r4 = r1.getHeight()
            int r3 = java.lang.Math.min(r4, r3)
            java.lang.String r8 = r8.f390623a
            r6.P(r1, r8, r2, r3)
            r5.f200154i = r8
            r5.f200155m = r0
            r5.f200156n = r7
            goto L8d
        L5c:
            r5.f200155m = r6
            r5.f200156n = r7
            mn2.g1 r6 = mn2.g1.f411508a
            vo0.d r8 = r6.e()
            mn2.q3 r0 = new mn2.q3
            java.lang.String r2 = r5.f200155m
            com.tencent.mm.plugin.finder.storage.y90 r3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f
            r0.<init>(r2, r3)
            wo0.c r8 = r8.a(r0)
            mn2.f1 r0 = mn2.f1.f411486d
            yo0.i r6 = r6.h(r0)
            r8.g(r6)
            boolean r6 = r8 instanceof wo0.b
            if (r6 == 0) goto L83
            r7 = r8
            wo0.b r7 = (wo0.b) r7
        L83:
            if (r7 == 0) goto L8d
            com.tencent.mm.plugin.finder.live.widget.h2 r6 = new com.tencent.mm.plugin.finder.live.widget.h2
            r6.<init>(r5)
            r7.i(r1, r6)
        L8d:
            com.tencent.mm.plugin.finder.live.viewmodel.e6 r6 = r5.f200152g
            r6.mo57852x3dcbea6f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.i2.b(java.lang.String, java.lang.String, java.lang.String):void");
    }

    @Override // ut3.d
    public boolean c5(android.content.Context context, android.os.Bundle bundle, ut3.c cVar) {
        return false;
    }

    @Override // ut3.d
    public void k3(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046, android.os.Bundle bundle) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("key_extra_data", bundle);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(c16991x15ced046, "null cannot be cast to non-null type android.os.Parcelable");
        intent.putExtra("KSEGMENTMEDIAINFO", c16991x15ced046);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
        android.app.Activity activity = (android.app.Activity) context;
        activity.setResult(-1, intent);
        activity.finish();
    }

    @Override // ut3.d
    public void r3(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 c16994x3ba8255, android.os.Bundle bundle) {
    }
}
