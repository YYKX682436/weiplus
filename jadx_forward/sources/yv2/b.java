package yv2;

/* loaded from: classes10.dex */
public final class b implements ya2.p1 {

    /* renamed from: d, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f547731d;

    /* renamed from: e, reason: collision with root package name */
    public w25.h f547732e;

    /* renamed from: f, reason: collision with root package name */
    public int f547733f;

    /* renamed from: g, reason: collision with root package name */
    public int f547734g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ze2 f547735h;

    /* renamed from: i, reason: collision with root package name */
    public android.os.Bundle f547736i;

    /* renamed from: m, reason: collision with root package name */
    public android.content.Intent f547737m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f547738n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f547739o;

    public b() {
    }

    public b(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, w25.h locView, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(locView, "locView");
        this.f547731d = activity;
        this.f547732e = locView;
        this.f547733f = i17;
    }

    public final w25.h a() {
        w25.h hVar = this.f547732e;
        if (hVar != null) {
            return hVar;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("locView");
        throw null;
    }

    public final void b() {
        java.lang.String str;
        java.lang.String m75945x2fec8307;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("near_life_scene", 6);
        r45.ze2 ze2Var = this.f547735h;
        intent.putExtra("get_lat", ze2Var != null ? ze2Var.m75938x746dc8a6(1) : 0.0f);
        r45.ze2 ze2Var2 = this.f547735h;
        intent.putExtra("get_lng", ze2Var2 != null ? ze2Var2.m75938x746dc8a6(0) : 0.0f);
        r45.ze2 ze2Var3 = this.f547735h;
        java.lang.String str2 = "";
        if (ze2Var3 == null || (str = ze2Var3.m75945x2fec8307(5)) == null) {
            str = "";
        }
        intent.putExtra("get_poi_classify_id", str);
        r45.ze2 ze2Var4 = this.f547735h;
        if (ze2Var4 != null && (m75945x2fec8307 = ze2Var4.m75945x2fec8307(2)) != null) {
            str2 = m75945x2fec8307;
        }
        intent.putExtra("get_city", str2);
        android.content.Intent intent2 = this.f547737m;
        if (intent2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
            throw null;
        }
        intent.putExtra("is_force_dark_mode", intent2.getBooleanExtra("is_force_dark_mode", false));
        android.content.Intent intent3 = this.f547737m;
        if (intent3 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
            throw null;
        }
        intent.putExtra("is_force_dark_mode", intent3.getBooleanExtra("is_force_dark_mode", false));
        android.content.Intent intent4 = this.f547737m;
        if (intent4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
            throw null;
        }
        intent.putExtra("can_show_create_poi_tips", intent4.getBooleanExtra("can_show_create_poi_tips", true));
        android.content.Intent intent5 = this.f547737m;
        if (intent5 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
            throw null;
        }
        intent.putExtra("show_city", intent5.getBooleanExtra("show_city", true));
        android.content.Intent intent6 = this.f547737m;
        if (intent6 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intent");
            throw null;
        }
        intent.putExtra("poi_show_none", intent6.getBooleanExtra("poi_show_none", true));
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = this.f547731d;
        if (abstractActivityC21394xb3d2c0cf == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(com.p314xaae8f345.p3076xcbed6b1f.p3080xbe953013.p3081x4189335b.C26617x73f7249d.f55566xbe5e9100);
            throw null;
        }
        j45.l.n(abstractActivityC21394xb3d2c0cf, "nearlife", "com.tencent.mm.plugin.nearlife.ui.CheckInLifeUI", intent, this.f547733f);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.b1.f(5, 10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0024, code lost:
    
        if (r3.f547734g == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(android.content.Intent r4, android.os.Bundle r5) {
        /*
            r3 = this;
            java.lang.String r0 = "intent"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r0)
            java.lang.String r0 = "postData"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            r3.f547737m = r4
            r3.f547736i = r5
            com.tencent.mm.plugin.finder.storage.ad0 r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a
            lb2.j r4 = r4.a()
            java.lang.Object r4 = r4.r()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            r5 = 0
            if (r4 == 0) goto L27
            int r4 = r3.f547734g
            r0 = 1
            if (r4 != r0) goto L27
            goto L28
        L27:
            r0 = r5
        L28:
            r4 = 0
            java.lang.String r1 = "activity"
            if (r0 == 0) goto L44
            w25.h r0 = r3.a()
            com.tencent.mm.ui.MMActivity r2 = r3.f547731d
            if (r2 == 0) goto L40
            r4 = 2131766567(0x7f102d27, float:1.9164328E38)
            java.lang.String r4 = r2.getString(r4)
            r0.mo57388x93bf3962(r4)
            goto L56
        L40:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r1)
            throw r4
        L44:
            w25.h r0 = r3.a()
            com.tencent.mm.ui.MMActivity r2 = r3.f547731d
            if (r2 == 0) goto L66
            r4 = 2131766571(0x7f102d2b, float:1.9164336E38)
            java.lang.String r4 = r2.getString(r4)
            r0.mo57388x93bf3962(r4)
        L56:
            w25.h r4 = r3.a()
            yv2.a r0 = new yv2.a
            r0.<init>(r3)
            r4.mo57396x23417dd0(r0)
            r3.d(r5)
            return
        L66:
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r1)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: yv2.b.c(android.content.Intent, android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(boolean r18) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yv2.b.d(boolean):void");
    }

    public void e() {
        this.f547738n = false;
        this.f547739o = true;
        f();
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x001c, code lost:
    
        if (r3.f547734g == 1) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            r3 = this;
            w25.h r0 = r3.a()
            r0.d()
            com.tencent.mm.plugin.finder.storage.ad0 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.ad0.f207935a
            lb2.j r0 = r0.a()
            java.lang.Object r0 = r0.r()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L1f
            int r0 = r3.f547734g
            r1 = 1
            if (r0 != r1) goto L1f
            goto L20
        L1f:
            r1 = 0
        L20:
            if (r1 == 0) goto L3c
            w25.h r0 = r3.a()
            com.tencent.mm.ui.MMActivity r1 = r3.f547731d
            if (r1 == 0) goto L35
            r2 = 2131766567(0x7f102d27, float:1.9164328E38)
            java.lang.String r1 = r1.getString(r2)
            r0.mo57388x93bf3962(r1)
            goto L3c
        L35:
            java.lang.String r0 = "activity"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r0)
            r0 = 0
            throw r0
        L3c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yv2.b.f():void");
    }
}
