package xc2;

/* loaded from: classes2.dex */
public final class b extends xc2.r {

    /* renamed from: l, reason: collision with root package name */
    public long f534601l;

    /* renamed from: m, reason: collision with root package name */
    public long f534602m;

    /* renamed from: n, reason: collision with root package name */
    public long f534603n;

    /* renamed from: p, reason: collision with root package name */
    public xc2.a f534605p;

    /* renamed from: q, reason: collision with root package name */
    public xc2.a f534606q;

    /* renamed from: t, reason: collision with root package name */
    public boolean f534609t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f534610u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f534611v;

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f534604o = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.List f534607r = kz5.c0.k(5, 58, 2, 1, 52);

    /* renamed from: s, reason: collision with root package name */
    public final java.util.List f534608s = kz5.c0.i(".ui.AppBrandPluginUI", ".launching.AppBrandLaunchProxyUI", ".ui.SnsAdNativeLandingPagesPreviewUI");

    /* JADX WARN: Code restructure failed: missing block: B:178:0x01a4, code lost:
    
        if ((r6 != null && r6.m77224x4236b52c() == 34) != false) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x01e6, code lost:
    
        if ((r6 != null && r6.m77224x4236b52c() == 34) != false) goto L154;
     */
    /* JADX WARN: Removed duplicated region for block: B:70:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0335  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(in5.s0 r52, android.view.View r53, xc2.p0 r54, int r55) {
        /*
            Method dump skipped, instructions count: 1011
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc2.b.B(in5.s0, android.view.View, xc2.p0, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0426  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0432  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x04a3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x04c9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x042b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void C(android.view.View r63, xc2.p0 r64, java.lang.String r65) {
        /*
            Method dump skipped, instructions count: 1256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc2.b.C(android.view.View, xc2.p0, java.lang.String):void");
    }

    public final void D(android.view.View view, xc2.n0 n0Var) {
        if (n0Var.f534746l <= 0 || n0Var.f534747m <= 0) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(view.getMeasuredWidth());
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(view.getMeasuredHeight());
            n0Var.f534746l = valueOf.intValue();
            n0Var.f534747m = valueOf2.intValue();
        }
    }

    @Override // xc2.j, xc2.z2
    public void b(in5.s0 holder, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        ((java.util.ArrayList) this.f534604o).add(java.lang.Integer.valueOf(i17));
    }

    @Override // xc2.j, xc2.z2
    public void c(java.lang.String activityName, xc2.p0 infoEx, android.view.View jumpView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activityName, "activityName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        super.c(activityName, infoEx, jumpView);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdHardJumperEventHandler", "startActivity, activityName=".concat(activityName));
        java.util.Iterator it = this.f534608s.iterator();
        while (it.hasNext()) {
            if (r26.n0.B(activityName, (java.lang.String) it.next(), false)) {
                this.f534611v = true;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c7  */
    @Override // xc2.j, xc2.z2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(in5.s0 r56, android.view.View r57, xc2.p0 r58) {
        /*
            Method dump skipped, instructions count: 582
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc2.b.e(in5.s0, android.view.View, xc2.p0):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0122  */
    @Override // xc2.r, xc2.j, xc2.z2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void f(in5.s0 r52, android.view.View r53, xc2.p0 r54) {
        /*
            Method dump skipped, instructions count: 598
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: xc2.b.f(in5.s0, android.view.View, xc2.p0):void");
    }

    @Override // xc2.j, xc2.z2
    public void g(android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.g(jumpView, infoEx);
        C(jumpView, infoEx, "OnPause");
    }

    @Override // xc2.j, xc2.z2
    public void i(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.i(holder, jumpView, infoEx);
        C(jumpView, infoEx, "UnFocus");
    }

    @Override // xc2.j, xc2.z2
    public void j(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, ec2.f event) {
        xc2.a aVar;
        xc2.a aVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        super.j(holder, jumpView, infoEx, event);
        long j17 = event.f342468b;
        int i17 = event.f332492d;
        if (i17 == 1) {
            xc2.a aVar3 = this.f534605p;
            if (aVar3 == null) {
                aVar3 = new xc2.a(event.f332498j);
                this.f534606q = aVar3;
            }
            aVar = aVar3.f534595a == event.f332498j ? aVar3 : null;
            if (aVar != null) {
                aVar.f534596b = j17;
                return;
            }
            return;
        }
        if (i17 == 2) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            if (currentTimeMillis - this.f534603n < 500) {
                return;
            }
            this.f534603n = currentTimeMillis;
            xc2.a aVar4 = this.f534605p;
            if (aVar4 != null) {
                aVar = aVar4.f534595a == event.f332498j ? aVar4 : null;
                if (aVar != null) {
                    aVar.f534598d++;
                    return;
                }
                return;
            }
            return;
        }
        if (i17 == 3) {
            xc2.a aVar5 = this.f534605p;
            if (aVar5 != null) {
                aVar = aVar5.f534595a == event.f332498j ? aVar5 : null;
                if (aVar != null) {
                    aVar.f534599e.add(java.lang.Integer.valueOf(event.f332496h));
                    return;
                }
                return;
            }
            return;
        }
        if (i17 != 6) {
            if (i17 == 11 && (aVar2 = this.f534605p) != null) {
                aVar = aVar2.f534595a == event.f332498j ? aVar2 : null;
                if (aVar != null) {
                    long j18 = aVar.f534596b;
                    if (j18 > 0) {
                        aVar.f534597c += j17 - j18;
                        aVar.f534596b = 0L;
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        xc2.a aVar6 = this.f534605p;
        if (aVar6 != null) {
            aVar = aVar6.f534595a == event.f332498j ? aVar6 : null;
            if (aVar != null) {
                long j19 = aVar.f534596b;
                if (j19 > 0) {
                    aVar.f534597c += j17 - j19;
                    aVar.f534596b = 0L;
                }
            }
        }
    }

    @Override // xc2.j
    public void q(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.q(holder, jumpView, infoEx);
        infoEx.G = false;
        infoEx.H = false;
    }

    @Override // xc2.r, xc2.j
    public void r(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.r(holder, jumpView, infoEx);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClickDo feedId=");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = infoEx.f534777f;
        sb6.append(abstractC14490x69736cb5 != null ? java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.AdHardJumperEventHandler", sb6.toString());
        B(holder, jumpView, infoEx, 0);
    }
}
