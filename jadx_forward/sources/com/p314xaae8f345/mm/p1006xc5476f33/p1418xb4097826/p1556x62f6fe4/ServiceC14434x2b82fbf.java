package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1556x62f6fe4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/finder/media/FinderLiveMediaBrowserService;", "Lcom/tencent/mm/plugin/finder/media/FinderLiveMediaBrowserBaseService;", "Lsn2/g;", "<init>", "()V", "sn2/c", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.media.FinderLiveMediaBrowserService */
/* loaded from: classes11.dex */
public final class ServiceC14434x2b82fbf extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1556x62f6fe4.AbstractServiceC14432xfa160eae {

    /* renamed from: o, reason: collision with root package name */
    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0 f202385o;

    /* renamed from: p, reason: collision with root package name */
    public p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.k0 f202386p;

    /* renamed from: q, reason: collision with root package name */
    public sn2.f f202387q;

    /* renamed from: r, reason: collision with root package name */
    public sn2.b f202388r;

    /* renamed from: t, reason: collision with root package name */
    public android.graphics.Bitmap f202390t;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f202384n = "FinderLiveMediaBrowserService";

    /* renamed from: s, reason: collision with root package name */
    public boolean f202389s = true;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f202391u = "";

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f202392v = "";

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1556x62f6fe4.AbstractServiceC14432xfa160eae
    /* renamed from: e, reason: from getter */
    public java.lang.String getF202384n() {
        return this.f202384n;
    }

    public void f(boolean z17) {
        this.f202389s = z17;
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.k0 k0Var = this.f202386p;
        if (k0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("stateBuilder");
            throw null;
        }
        i(k0Var.a().f90485d);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f202384n, "notifyControlsVisibilityChanged - Controls set enable: " + z17);
    }

    public final void g(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.r rVar = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.r();
        rVar.d("android.media.metadata.TITLE", str);
        rVar.d("android.media.metadata.ARTIST", str2);
        rVar.d("android.media.metadata.DISPLAY_TITLE", str);
        rVar.d("android.media.metadata.DISPLAY_SUBTITLE", str2);
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.C0042x9e34a075 a17 = rVar.a();
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0 f0Var = this.f202385o;
        if (f0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaSession");
            throw null;
        }
        f0Var.g(a17);
        if (str3 != null) {
            if (!(str3.length() > 0)) {
                str3 = null;
            }
            if (str3 != null) {
                try {
                    wo0.c a18 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(str3, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209889f));
                    a18.f529406d = new sn2.e(this, str, str2);
                    a18.f();
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f202384n, "loadCoverImage - Failed: " + e17.getMessage(), e17);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r9 = this;
            java.lang.String r0 = r9.f202384n
            java.lang.String r1 = "updateLiveMetadata - Metadata updated: "
            dk2.ef r2 = dk2.ef.f314905a     // Catch: java.lang.Exception -> L40
            gk2.e r2 = dk2.ef.I     // Catch: java.lang.Exception -> L40
            if (r2 != 0) goto L12
            java.lang.String r1 = "updateLiveMetadata - Live context not available"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r1)     // Catch: java.lang.Exception -> L40
            return
        L12:
            java.lang.Class<mm2.e1> r3 = mm2.e1.class
            androidx.lifecycle.c1 r3 = r2.a(r3)     // Catch: java.lang.Exception -> L40
            mm2.e1 r3 = (mm2.e1) r3     // Catch: java.lang.Exception -> L40
            r45.nw1 r3 = r3.f410521r     // Catch: java.lang.Exception -> L40
            java.lang.Class<mm2.c1> r4 = mm2.c1.class
            androidx.lifecycle.c1 r2 = r2.a(r4)     // Catch: java.lang.Exception -> L40
            mm2.c1 r2 = (mm2.c1) r2     // Catch: java.lang.Exception -> L40
            ya2.g r4 = ya2.h.f542017a     // Catch: java.lang.Exception -> L40
            java.lang.String r5 = r2.f410385o     // Catch: java.lang.Exception -> L40
            ya2.b2 r4 = r4.b(r5)     // Catch: java.lang.Exception -> L40
            r5 = 56
            com.tencent.mm.protobuf.f r3 = r3.m75936x14adae67(r5)     // Catch: java.lang.Exception -> L40
            r45.xg1 r3 = (r45.xg1) r3     // Catch: java.lang.Exception -> L40
            r5 = 0
            r6 = 1
            if (r3 == 0) goto L42
            boolean r7 = r3.m75933x41a8a7f2(r5)     // Catch: java.lang.Exception -> L40
            if (r7 != r6) goto L42
            r7 = r6
            goto L43
        L40:
            r1 = move-exception
            goto L7e
        L42:
            r7 = r5
        L43:
            java.lang.String r8 = ""
            if (r7 == 0) goto L5d
            java.lang.String r7 = r3.m75945x2fec8307(r6)     // Catch: java.lang.Exception -> L40
            if (r7 == 0) goto L53
            int r7 = r7.length()     // Catch: java.lang.Exception -> L40
            if (r7 != 0) goto L54
        L53:
            r5 = r6
        L54:
            if (r5 != 0) goto L5d
            java.lang.String r3 = r3.m75945x2fec8307(r6)     // Catch: java.lang.Exception -> L40
            if (r3 != 0) goto L65
            goto L64
        L5d:
            if (r4 == 0) goto L64
            java.lang.String r3 = r4.z0()     // Catch: java.lang.Exception -> L40
            goto L65
        L64:
            r3 = r8
        L65:
            java.lang.String r4 = r2.V1     // Catch: java.lang.Exception -> L40
            if (r4 != 0) goto L6a
            goto L6b
        L6a:
            r8 = r4
        L6b:
            r9.f202391u = r8     // Catch: java.lang.Exception -> L40
            r9.f202392v = r3     // Catch: java.lang.Exception -> L40
            java.lang.String r2 = r2.t7()     // Catch: java.lang.Exception -> L40
            r9.g(r8, r3, r2)     // Catch: java.lang.Exception -> L40
            java.lang.String r1 = r1.concat(r8)     // Catch: java.lang.Exception -> L40
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)     // Catch: java.lang.Exception -> L40
            goto L98
        L7e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "updateLiveMetadata - Failed: "
            r2.<init>(r3)
            java.lang.String r3 = r1.getMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r2, r1)
        L98:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1556x62f6fe4.ServiceC14434x2b82fbf.h():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0121 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(int r17) {
        /*
            Method dump skipped, instructions count: 673
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1556x62f6fe4.ServiceC14434x2b82fbf.i(int):void");
    }

    @Override // p012xc85e97e9.p096x62f6fe4.AbstractServiceC1134x1ae0da33, android.app.Service
    public void onCreate() {
        super.onCreate();
        java.lang.String str = this.f202384n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onCreate - Service started");
        this.f202388r = new sn2.b(this);
        this.f202387q = new sn2.f(this);
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0 f0Var = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0(this, str);
        sn2.f fVar = this.f202387q;
        if (fVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("callback");
            throw null;
        }
        f0Var.f(fVar, null);
        f0Var.e(true);
        this.f202385o = f0Var;
        d(f0Var.b());
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.k0 k0Var = new p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.k0();
        k0Var.f90518e = this.f202389s ? 512L : 0L;
        this.f202386p = k0Var;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onCreate - MediaSession created, ready for commands");
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        java.lang.String str = this.f202384n;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onDestroy - Service stopping");
        sn2.b bVar = this.f202388r;
        if (bVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("notificationManager");
            throw null;
        }
        bVar.a();
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0 f0Var = this.f202385o;
        if (f0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaSession");
            throw null;
        }
        f0Var.e(false);
        p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.p010x76508296.f0 f0Var2 = this.f202385o;
        if (f0Var2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mediaSession");
            throw null;
        }
        f0Var2.d();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onDestroy - Service destroyed");
    }
}
