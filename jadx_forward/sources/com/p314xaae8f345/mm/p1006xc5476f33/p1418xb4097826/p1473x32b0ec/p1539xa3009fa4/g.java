package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4;

/* loaded from: classes3.dex */
public final class g extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f198631d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f198632e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f198633f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f198634g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f198635h;

    /* renamed from: i, reason: collision with root package name */
    public r45.n46 f198636i;

    /* renamed from: m, reason: collision with root package name */
    public r45.xl6 f198637m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f198631d = "Finder.FinderGameLiveAccountUIC";
        this.f198633f = "";
        this.f198634g = "";
    }

    public static final void O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.g gVar, boolean z17) {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doAuth ");
        r45.xl6 xl6Var = gVar.f198637m;
        sb6.append(xl6Var != null ? java.lang.Integer.valueOf(xl6Var.m75939xb282bd08(2)) : null);
        sb6.append(", ");
        r45.xl6 xl6Var2 = gVar.f198637m;
        sb6.append(xl6Var2 != null ? xl6Var2.m75945x2fec8307(3) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(gVar.f198631d, sb6.toString());
        java.lang.String str2 = gVar.f198633f;
        int i17 = gVar.f198635h ? 2 : 1;
        java.lang.String str3 = gVar.f198634g;
        int i18 = !z17 ? 1 : 0;
        r45.xl6 xl6Var3 = gVar.f198637m;
        int m75939xb282bd08 = xl6Var3 != null ? xl6Var3.m75939xb282bd08(2) : 0;
        r45.xl6 xl6Var4 = gVar.f198637m;
        if (xl6Var4 == null || (str = xl6Var4.m75945x2fec8307(3)) == null) {
            str = "";
        }
        ke2.r rVar = new ke2.r(str2, i17, str3, i18, m75939xb282bd08, str);
        rVar.t(gVar.m158354x19263085(), gVar.m158361x893a2f6f().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f9y), 500L);
        pq5.g l17 = rVar.l();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = gVar.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(m158354x19263085, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.feed.ui.FinderGameLiveAuthUI");
        l17.f((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13961x4185f9c0) m158354x19263085);
        l17.K(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.d(z17, gVar));
    }

    public final void P6() {
        android.view.View view = this.f198632e;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("root");
            throw null;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveAccountUIC", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/viewmodel/FinderGameLiveAccountUIC", "hide", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0063  */
    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo450x3e5a77bb(android.os.Bundle r6) {
        /*
            r5 = this;
            r6 = 2131309375(0x7f09333f, float:1.8237032E38)
            android.view.View r6 = r5.mo144222x4ff8c0f0(r6)
            java.lang.String r0 = "findViewById(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r0)
            r5.f198632e = r6
            r45.n46 r6 = new r45.n46
            r6.<init>()
            android.content.Intent r0 = r5.m158359x1e885992()
            java.lang.String r1 = "KEY_POST_FROM_SHARE"
            byte[] r0 = r0.getByteArrayExtra(r1)
            java.lang.String r1 = "safeParser"
            java.lang.String r2 = ""
            r3 = 0
            if (r0 != 0) goto L26
        L24:
            r6 = r3
            goto L33
        L26:
            r6.mo11468x92b714fd(r0)     // Catch: java.lang.Exception -> L2a
            goto L33
        L2a:
            r6 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r1, r2, r6)
            goto L24
        L33:
            r5.f198636i = r6
            r45.xl6 r6 = new r45.xl6
            r6.<init>()
            android.content.Intent r0 = r5.m158359x1e885992()
            java.lang.String r4 = "KEY_FROM_THIRD_PARTY_SHARE"
            byte[] r0 = r0.getByteArrayExtra(r4)
            if (r0 != 0) goto L48
        L46:
            r6 = r3
            goto L55
        L48:
            r6.mo11468x92b714fd(r0)     // Catch: java.lang.Exception -> L4c
            goto L55
        L4c:
            r6 = move-exception
            java.lang.Object[] r6 = new java.lang.Object[]{r6}
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r1, r2, r6)
            goto L46
        L55:
            r5.f198637m = r6
            android.content.Intent r6 = r5.m158359x1e885992()
            java.lang.String r0 = "KEY_APPID"
            java.lang.String r6 = r6.getStringExtra(r0)
            if (r6 != 0) goto L64
            r6 = r2
        L64:
            r5.f198633f = r6
            android.content.Intent r6 = r5.m158359x1e885992()
            java.lang.String r0 = "KEY_TICKET"
            java.lang.String r6 = r6.getStringExtra(r0)
            if (r6 != 0) goto L73
            goto L74
        L73:
            r2 = r6
        L74:
            r5.f198634g = r2
            android.content.Intent r6 = r5.m158359x1e885992()
            java.lang.String r0 = "KEY_FROM_SCAN"
            r1 = 0
            boolean r6 = r6.getBooleanExtra(r0, r1)
            r5.f198635h = r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "onCreate, "
            r6.<init>(r0)
            r45.xl6 r0 = r5.f198637m
            if (r0 == 0) goto L93
            java.lang.String r0 = r0.m75945x2fec8307(r1)
            goto L94
        L93:
            r0 = r3
        L94:
            r6.append(r0)
            java.lang.String r0 = ", "
            r6.append(r0)
            r45.xl6 r1 = r5.f198637m
            if (r1 == 0) goto Laa
            r2 = 2
            int r1 = r1.m75939xb282bd08(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto Lab
        Laa:
            r1 = r3
        Lab:
            r6.append(r1)
            r6.append(r0)
            r45.xl6 r1 = r5.f198637m
            if (r1 == 0) goto Lba
            r2 = 3
            java.lang.String r3 = r1.m75945x2fec8307(r2)
        Lba:
            r6.append(r3)
            r6.append(r0)
            java.lang.String r0 = r5.f198634g
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            java.lang.String r0 = r5.f198631d
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.g.mo450x3e5a77bb(android.os.Bundle):void");
    }
}
