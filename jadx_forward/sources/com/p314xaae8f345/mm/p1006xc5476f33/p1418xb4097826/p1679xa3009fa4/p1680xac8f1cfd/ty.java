package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes8.dex */
public final class ty extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 implements zy2.ua {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f217600d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f217601e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.py f217602f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f217603g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ty(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f217600d = jz5.h.b(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.oy.f217022d);
        this.f217602f = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.py(this);
        this.f217603g = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.sy(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final p15.n O6(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ty r7, int r8) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ty.O6(com.tencent.mm.plugin.finder.viewmodel.component.ty, int):p15.n");
    }

    public final java.lang.String P6() {
        java.lang.String str;
        if (m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857) {
            java.lang.String stringExtra = m158359x1e885992().getStringExtra("finder_username");
            return stringExtra == null ? "" : stringExtra;
        }
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b c15471x9d199e5b = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).e(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b.class);
        return (c15471x9d199e5b == null || (str = c15471x9d199e5b.f215157i) == null) ? "" : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008a A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int Q6() {
        /*
            r7 = this;
            androidx.appcompat.app.AppCompatActivity r0 = r7.m158354x19263085()
            androidx.appcompat.app.AppCompatActivity r1 = r7.m158354x19263085()
            java.lang.String r2 = "activity"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r1, r2)
            pf5.z r3 = pf5.z.f435481a
            pf5.v r1 = r3.a(r1)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC> r4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b.class
            pf5.b0 r1 = r1.e(r4)
            com.tencent.mm.plugin.finder.viewmodel.component.FinderProfileDrawerUIC r1 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15471x9d199e5b) r1
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L25
            boolean r1 = r1.f215159n
            if (r1 != r4) goto L25
            r1 = r4
            goto L26
        L25:
            r1 = r5
        L26:
            androidx.appcompat.app.AppCompatActivity r6 = r7.m158354x19263085()
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r2)
            pf5.v r2 = r3.a(r6)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.s4> r6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s4.class
            pf5.b0 r2 = r2.e(r6)
            com.tencent.mm.plugin.finder.viewmodel.component.s4 r2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.s4) r2
            if (r2 == 0) goto L43
            boolean r2 = r2.P6()
            if (r2 != r4) goto L43
            r2 = r4
            goto L44
        L43:
            r2 = r5
        L44:
            boolean r6 = r0 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857
            if (r6 == 0) goto L52
            com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857) r0
            boolean r0 = r0.m81210x448cda5d()
            if (r0 != 0) goto L52
            r4 = 4
            goto La0
        L52:
            if (r1 != 0) goto L9f
            if (r2 == 0) goto L57
            goto L9f
        L57:
            android.app.Activity r0 = r7.m80379x76847179()
            java.lang.String r1 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r0, r1)
            boolean r1 = r0 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112
            if (r1 == 0) goto L93
            androidx.appcompat.app.AppCompatActivity r0 = (p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) r0
            pf5.v r0 = r3.a(r0)
            java.lang.Class<com.tencent.mm.plugin.finder.viewmodel.component.u6> r1 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u6.class
            pf5.b0 r0 = r0.e(r1)
            com.tencent.mm.plugin.finder.viewmodel.component.u6 r0 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.u6) r0
            if (r0 == 0) goto L87
            com.tencent.mm.plugin.finder.view.f5 r0 = r0.O6()
            if (r0 == 0) goto L82
            boolean r0 = r0.b()
            if (r0 != r4) goto L82
            r0 = r4
            goto L83
        L82:
            r0 = r5
        L83:
            if (r0 != r4) goto L87
            r0 = r4
            goto L88
        L87:
            r0 = r5
        L88:
            if (r0 == 0) goto L8c
            r4 = 2
            goto La0
        L8c:
            com.tencent.mm.plugin.finder.model.BaseFinderFeed r0 = r7.f217601e
            if (r0 == 0) goto L91
            goto La0
        L91:
            r4 = r5
            goto La0
        L93:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L9f:
            r4 = 3
        La0:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ty.Q6():int");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onCreateAfter */
    public void mo739xfd763ae1(android.os.Bundle bundle) {
        super.mo739xfd763ae1(bundle);
        if (m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14075x761bf857) {
            return;
        }
        boolean z17 = m158354x19263085() instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15036x1a33c799;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.py pyVar = this.f217602f;
        if (!z17) {
            android.app.Activity context = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            pf5.z zVar = pf5.z.f435481a;
            if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            java.lang.Object a17 = zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
            fc2.c n17 = zy2.ra.n1((zy2.ra) a17, 0, 1, null);
            if (n17 != null) {
                n17.a(pyVar);
                return;
            }
            return;
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.p1640x9da2e250.AbstractC15124x7bae6180 abstractC15124x7bae6180 : ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15456x2c452bca.class)).getFragments()) {
            android.app.Activity context2 = m80379x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context2, "context");
            pf5.z zVar2 = pf5.z.f435481a;
            if (!(context2 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            fc2.c Y6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar2.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context2).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).Y6(abstractC15124x7bae6180.f210798p);
            if (Y6 != null) {
                Y6.a(pyVar);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onPause */
    public void mo2281xb01dfb57() {
        super.mo2281xb01dfb57();
        if (((java.lang.Boolean) ((jz5.n) this.f217600d).mo141623x754a37bb()).booleanValue()) {
            i95.m c17 = i95.n0.c(ct.e3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1) ((ct.e3) c17)).Ni(null);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onResume */
    public void mo2284x57429eec() {
        if (((java.lang.Boolean) ((jz5.n) this.f217600d).mo141623x754a37bb()).booleanValue()) {
            i95.m c17 = i95.n0.c(ct.e3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            ((com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1) ((ct.e3) c17)).Ni(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.qy(this));
            i95.m c18 = i95.n0.c(ct.e3.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ry ryVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ry) ((jz5.n) this.f217603g).mo141623x754a37bb();
            com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1 j1Var = (com.p314xaae8f345.mm.ui.p2700xc5a27af6.api.p2701xe72d8566.j1) ((ct.e3) c18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScreenShotShareService", "serScreenShotShareReporter");
            j1Var.f290041q = ryVar != null ? new java.lang.ref.WeakReference(ryVar) : null;
        }
    }
}
