package qj3;

/* loaded from: classes10.dex */
public final class h extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce implements ju3.d0 {

    /* renamed from: h, reason: collision with root package name */
    public uj3.b f445424h;

    /* renamed from: i, reason: collision with root package name */
    public uj3.k f445425i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 f445426m;

    /* renamed from: n, reason: collision with root package name */
    public final qj3.i f445427n;

    /* renamed from: o, reason: collision with root package name */
    public final qj3.g f445428o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f445429p;

    /* renamed from: q, reason: collision with root package name */
    public android.graphics.Bitmap f445430q;

    /* renamed from: r, reason: collision with root package name */
    public int f445431r;

    /* renamed from: s, reason: collision with root package name */
    public int f445432s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, uj3.b statusManager, uj3.k kVar) {
        super(context, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(statusManager, "statusManager");
        this.f445424h = statusManager;
        this.f445425i = kVar;
        this.f445429p = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.ci9, this);
        qj3.i iVar = new qj3.i(this, this);
        this.f445427n = iVar;
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.mb8);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        qj3.g gVar = new qj3.g((android.widget.FrameLayout) findViewById, this, this.f445425i);
        this.f445428o = gVar;
        m67975xd72b7a67().add(iVar);
        m67975xd72b7a67().add(gVar);
    }

    /* renamed from: getBitmap */
    public final android.graphics.Bitmap m160239x12501425() {
        return this.f445430q;
    }

    /* renamed from: getConfig */
    public final uj3.k m160240x1456a638() {
        return this.f445425i;
    }

    /* renamed from: getConfigProvider */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 m160241xf6475849() {
        return this.f445426m;
    }

    /* renamed from: getMHeight */
    public final int m160242x4471f3be() {
        return this.f445432s;
    }

    /* renamed from: getMWidth */
    public final int m160243x24129c4f() {
        return this.f445431r;
    }

    /* renamed from: getMultiTalkEditPhotoWrapper */
    public final qj3.g m160244xafdb561a() {
        return this.f445428o;
    }

    /* renamed from: getStatusManager */
    public final uj3.b m160245x7d191fa5() {
        return this.f445424h;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005f A[SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(it3.y r5, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "navigator"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r0)
            java.lang.String r0 = "configProvider"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r6, r0)
            super.m(r5, r6)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "configProvider "
            r5.<init>(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "MicroMsg.MultiTalkScreenEditContainerPlugin"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r5)
            r4.f445426m = r6
            dw3.c0 r5 = dw3.c0.f325715a
            r5.b(r6)
            java.util.ArrayList r5 = r4.m67975xd72b7a67()
            java.util.Iterator r5 = r5.iterator()
        L2f:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L63
            java.lang.Object r0 = r5.next()
            yt3.r2 r0 = (yt3.r2) r0
            com.tencent.mm.component.api.jumper.UICustomParam r1 = r6.f237210o
            r2 = 0
            if (r1 == 0) goto L57
            java.util.Map r1 = r1.f146312h
            if (r1 == 0) goto L57
            java.lang.String r3 = r0.mo122733x337a8b()
            java.util.HashMap r1 = (java.util.HashMap) r1
            java.lang.Object r1 = r1.get(r3)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L57
            boolean r1 = r1.booleanValue()
            goto L58
        L57:
            r1 = r2
        L58:
            r1 = r1 ^ 1
            if (r1 == 0) goto L5d
            goto L5f
        L5d:
            r2 = 8
        L5f:
            r0.mo9067x901b6914(r2)
            goto L2f
        L63:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: qj3.h.m(it3.y, com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce, yt3.r2
    /* renamed from: onBackPress */
    public boolean mo9064x4ceae47d() {
        super.mo9064x4ceae47d();
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce
    public void r(ct0.b bVar) {
        super.r(bVar);
        if (bVar == null || bVar.f303751o == null) {
            return;
        }
        this.f445428o.a(false, bVar);
    }

    /* renamed from: setBitmap */
    public final void m160246x5854831(android.graphics.Bitmap bitmap) {
        this.f445430q = bitmap;
    }

    /* renamed from: setConfig */
    public final void m160247x78bda44(uj3.k kVar) {
        this.f445425i = kVar;
    }

    /* renamed from: setConfigProvider */
    public final void m160248xbe3dc055(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624) {
        this.f445426m = c16993xacc19624;
    }

    /* renamed from: setDrawingEnable */
    public final void m160249x18ba59ff(boolean z17) {
        bn5.g gVar;
        ym5.w2 w2Var = this.f445428o.f445415m;
        if (w2Var == null || (gVar = (bn5.g) w2Var.m177310x5143ab24()) == null) {
            return;
        }
        gVar.m10955xbc91ffe0(z17);
    }

    /* renamed from: setMHeight */
    public final void m160250xb7e34132(int i17) {
        this.f445432s = i17;
    }

    /* renamed from: setMWidth */
    public final void m160251x1747d05b(int i17) {
        this.f445431r = i17;
    }

    /* renamed from: setStatusManager */
    public final void m160252xfef8619(uj3.b bVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bVar, "<set-?>");
        this.f445424h = bVar;
    }

    @Override // ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb interfaceC4987x84e327cb;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiTalkScreenEditContainerPlugin", "status :" + status + " , param :" + bundle);
        int ordinal = status.ordinal();
        if (ordinal == 32) {
            super.mo9064x4ceae47d();
            return;
        }
        qk.g6 g6Var = qk.g6.TEXT;
        qj3.g gVar = this.f445428o;
        if (ordinal == 40) {
            if (bundle != null) {
                java.lang.CharSequence charSequence = bundle.getCharSequence("PARAM_EDIT_TEXT_CONTENT");
                int i17 = bundle.getInt("PARAM_EDIT_TEXT_COLOR");
                int i18 = bundle.getInt("PARAM_EDIT_TEXT_COLOR_BG_INT");
                java.lang.String obj = charSequence != null ? charSequence.toString() : null;
                l45.q qVar = gVar.f445416n;
                if (qVar != null) {
                    new l45.a((l45.n) qVar).a(g6Var);
                }
                l45.q qVar2 = gVar.f445416n;
                if (qVar2 != null) {
                    ((l45.n) qVar2).s(obj, i17, i18, "");
                    return;
                }
                return;
            }
            return;
        }
        if (ordinal != 42) {
            if (ordinal == 45) {
                if (bundle != null) {
                    bundle.getCharSequence("PARAM_EDIT_TEXT_CONTENT");
                    bundle.getInt("PARAM_EDIT_TEXT_COLOR");
                    bundle.getInt("PARAM_EDIT_TEXT_COLOR_BG_INT");
                    return;
                }
                return;
            }
            if (ordinal == 65) {
                if (gVar.f445418p) {
                    return;
                }
                android.content.Context context = gVar.f445417o;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type android.app.Activity");
                if (((android.app.Activity) context).isFinishing()) {
                    return;
                }
                gVar.f445418p = true;
                qk.o9 o9Var = gVar.f445414i;
                if (o9Var != null) {
                    o9Var.g(new qj3.a(gVar), true);
                    return;
                }
                return;
            }
            if (ordinal == 112) {
                if (bundle == null || (interfaceC4987x84e327cb = (com.p314xaae8f345.mm.api.InterfaceC4987x84e327cb) bundle.getParcelable("PARAM_EDIT_EMOJI_INFO")) == null) {
                    return;
                }
                gVar.getClass();
                l45.q qVar3 = gVar.f445416n;
                if (qVar3 != null) {
                    new l45.a((l45.n) qVar3).a(g6Var);
                }
                l45.q qVar4 = gVar.f445416n;
                if (qVar4 != null) {
                    ((l45.n) qVar4).r(interfaceC4987x84e327cb);
                    return;
                }
                return;
            }
            if (ordinal == 73) {
                l45.q qVar5 = gVar.f445416n;
                if (qVar5 != null) {
                    new l45.a((l45.n) qVar5).a(qk.g6.EMOJI);
                    return;
                }
                return;
            }
            if (ordinal == 74) {
                l45.q qVar6 = gVar.f445416n;
                if (qVar6 != null) {
                    new l45.a((l45.n) qVar6).a(g6Var);
                    return;
                }
                return;
            }
            qk.g6 g6Var2 = qk.g6.MOSAIC;
            switch (ordinal) {
                case 79:
                    gVar.mo9066x6761d4f();
                    return;
                case 80:
                    gVar.f445422t = g6Var2;
                    gVar.f445423u = 0;
                    l45.q qVar7 = gVar.f445416n;
                    if (qVar7 != null) {
                        new l45.a((l45.n) qVar7).a(g6Var2);
                    }
                    l45.q qVar8 = gVar.f445416n;
                    if (qVar8 != null) {
                        new l45.a((l45.n) qVar8).b(g6Var2, 0, null);
                    }
                    nu3.i iVar = nu3.i.f421751a;
                    nu3.i.c(iVar, "KEY_CLICK_MOSAIC_COUNT_INT", 0, 2, null);
                    iVar.b(8);
                    return;
                case 81:
                    gVar.f445422t = g6Var2;
                    gVar.f445423u = 1;
                    l45.q qVar9 = gVar.f445416n;
                    if (qVar9 != null) {
                        new l45.a((l45.n) qVar9).a(g6Var2);
                    }
                    l45.q qVar10 = gVar.f445416n;
                    if (qVar10 != null) {
                        new l45.a((l45.n) qVar10).b(g6Var2, 1, null);
                    }
                    nu3.i iVar2 = nu3.i.f421751a;
                    nu3.i.c(iVar2, "KEY_CLICK_BRUSH_COUNT_INT", 0, 2, null);
                    iVar2.b(9);
                    return;
                case com.p314xaae8f345.p2892x20aab405.p2895x1ceb8fc5.C25342xb76fba4e.f45675x92fdfc4b /* 82 */:
                    if (bundle != null) {
                        int i19 = bundle.getInt("EDIT_PHOTO_DOODLE_PENCIL_INDEX_INT");
                        qk.g6 g6Var3 = qk.g6.DOODLE;
                        gVar.f445422t = g6Var3;
                        gVar.f445423u = i19;
                        l45.q qVar11 = gVar.f445416n;
                        if (qVar11 != null) {
                            new l45.a((l45.n) qVar11).a(g6Var3);
                        }
                        l45.q qVar12 = gVar.f445416n;
                        if (qVar12 != null) {
                            new l45.a((l45.n) qVar12).b(g6Var3, i19, null);
                            return;
                        }
                        return;
                    }
                    return;
                case 83:
                    l45.q qVar13 = gVar.f445416n;
                    if (qVar13 != null) {
                        new l45.a((l45.n) qVar13).b(um.f.f510211c.a(), -1, null);
                    }
                    l45.q qVar14 = gVar.f445416n;
                    if (qVar14 != null) {
                        new l45.a((l45.n) qVar14).a(gVar.f445422t);
                    }
                    l45.q qVar15 = gVar.f445416n;
                    if (qVar15 != null) {
                        new l45.a((l45.n) qVar15).b(gVar.f445422t, gVar.f445423u, null);
                        return;
                    }
                    return;
                case com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1105xc515088e.l.f34676x366c91de /* 84 */:
                    uj3.b.a(this.f445424h, uj3.a.f509729g, null, 2, null);
                    return;
                default:
                    return;
            }
        }
    }
}
