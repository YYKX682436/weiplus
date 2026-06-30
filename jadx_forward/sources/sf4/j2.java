package sf4;

/* loaded from: classes4.dex */
public final class j2 {

    /* renamed from: a, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b f489032a;

    /* renamed from: b, reason: collision with root package name */
    public sf4.f2 f489033b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f489034c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f489035d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f489036e;

    /* renamed from: f, reason: collision with root package name */
    public if4.h f489037f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f489038g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f489040i;

    /* renamed from: k, reason: collision with root package name */
    public int f489042k;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18500xf5912cca f489043l;

    /* renamed from: m, reason: collision with root package name */
    public final sf4.i2 f489044m;

    /* renamed from: h, reason: collision with root package name */
    public final fp.e f489039h = new fp.e(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);

    /* renamed from: j, reason: collision with root package name */
    public final long f489041j = 987;

    /* JADX WARN: Type inference failed for: r1v1, types: [com.tencent.mm.sdk.event.IListener, com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr$onlineVideoEventListener$1] */
    public j2() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        ?? r17 = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5814x771f4db2>(a0Var) { // from class: com.tencent.mm.plugin.story.ui.view.gallery.StoryVideoViewMgr$onlineVideoEventListener$1
            {
                this.f39173x3fe91575 = -2133747774;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5814x771f4db2 c5814x771f4db2) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5814x771f4db2 event = c5814x771f4db2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                sf4.j2 j2Var = sf4.j2.this;
                j2Var.getClass();
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onelinevideo event callback, retcode:");
                am.hn hnVar = event.f136121g;
                sb6.append(hnVar != null ? java.lang.Integer.valueOf(hnVar.f88378b) : null);
                sb6.append(", currVideoItem:");
                sb6.append(j2Var.f489037f);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", sb6.toString());
                if4.h hVar = j2Var.f489037f;
                if (hVar != null) {
                    if (!(hVar.f372786a == 0) && hnVar.f88378b == -21112) {
                        pm0.v.X(new sf4.h2(j2Var, event));
                    }
                }
                return false;
            }
        };
        this.f489043l = r17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", "init create StoryVideoViewMgr " + hashCode());
        r17.mo48813x58998cd();
        this.f489044m = new sf4.i2(this);
    }

    public final void b(android.view.ViewGroup parent, android.view.ViewGroup.LayoutParams layoutParams) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        this.f489042k = 0;
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b2 = this.f489032a;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c18499x2fc2446b2 != null ? c18499x2fc2446b2.getParent() : null, parent);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("attachVideoView, parent:");
        sb6.append(parent.hashCode());
        sb6.append(", isVideoPause:false, currentSessionId:");
        sb6.append(this.f489035d);
        sb6.append(", isPlayingVideoItem:");
        sb6.append(this.f489036e);
        sb6.append(" videoView ");
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b3 = this.f489032a;
        sb6.append(c18499x2fc2446b3 != null ? java.lang.Integer.valueOf(c18499x2fc2446b3.hashCode()) : null);
        sb6.append(" sameParent ");
        sb6.append(b17);
        sb6.append(" this:");
        sb6.append(hashCode());
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.Gallery.StoryVideoViewMgr", sb6.toString(), new java.lang.Object[0]);
        d(parent, true);
        if (this.f489032a == null) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b4 = new com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b(context, null);
            this.f489032a = c18499x2fc2446b4;
            sf4.f2 f2Var = new sf4.f2(this);
            this.f489033b = f2Var;
            c18499x2fc2446b4.m48235xbc2f47ad(f2Var);
            com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b5 = this.f489032a;
            if (c18499x2fc2446b5 != null) {
                c18499x2fc2446b5.mo61532x526554de(this.f489044m);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b6 = this.f489032a;
            if (c18499x2fc2446b6 != null) {
                c18499x2fc2446b6.m75326x5d1e8363(new sf4.g2(this));
            }
            this.f489036e = false;
        }
        if (b17) {
            if (layoutParams == null || (c18499x2fc2446b = this.f489032a) == null) {
                return;
            }
            c18499x2fc2446b.setLayoutParams(layoutParams);
            return;
        }
        if (layoutParams == null) {
            parent.addView(this.f489032a);
        } else {
            parent.addView(this.f489032a, layoutParams);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if (r4 == (r5 != null ? r5.f372790e : null)) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0055, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0053, code lost:
    
        if (r4 == (r3 != null ? r3.f372790e : null)) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(if4.h r8, boolean r9) {
        /*
            r7 = this;
            java.lang.String r0 = "item"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r8, r0)
            r0 = 1
            r1 = 0
            r2 = 0
            int r3 = r8.f372786a
            if4.i r4 = r8.f372790e
            if (r3 == 0) goto L25
            if4.h r5 = r7.f489037f
            if (r5 == 0) goto L19
            int r6 = r5.f372786a
            if (r6 != r3) goto L19
            r3 = r0
            goto L1a
        L19:
            r3 = r2
        L1a:
            if (r3 == 0) goto L25
            if (r5 == 0) goto L21
            if4.i r3 = r5.f372790e
            goto L22
        L21:
            r3 = r1
        L22:
            if (r4 != r3) goto L25
            goto L55
        L25:
            r45.xe6 r3 = r8.f372791f
            java.lang.String r3 = r3.f471556f
            if (r3 == 0) goto L34
            int r3 = r3.length()
            if (r3 != 0) goto L32
            goto L34
        L32:
            r3 = r2
            goto L35
        L34:
            r3 = r0
        L35:
            if (r3 != 0) goto L57
            if4.h r3 = r7.f489037f
            if (r3 == 0) goto L42
            r45.xe6 r3 = r3.f372791f
            if (r3 == 0) goto L42
            java.lang.String r3 = r3.f471556f
            goto L43
        L42:
            r3 = r1
        L43:
            r45.xe6 r5 = r8.f372791f
            java.lang.String r5 = r5.f471556f
            boolean r3 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r3, r5)
            if (r3 == 0) goto L57
            if4.h r3 = r7.f489037f
            if (r3 == 0) goto L53
            if4.i r1 = r3.f372790e
        L53:
            if (r4 != r1) goto L57
        L55:
            r1 = r0
            goto L58
        L57:
            r1 = r2
        L58:
            r1 = r1 ^ r0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "change:"
            r3.<init>(r4)
            r3.append(r1)
            r4 = 32
            r3.append(r4)
            boolean r4 = r7.f489038g
            r3.append(r4)
            java.lang.String r4 = ", "
            r3.append(r4)
            r3.append(r9)
            java.lang.String r4 = ", changeVideoItem: origin: "
            r3.append(r4)
            if4.h r4 = r7.f489037f
            r3.append(r4)
            java.lang.String r4 = ", new: "
            r3.append(r4)
            r3.append(r8)
            java.lang.String r4 = ",  change:"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = " this:"
            r3.append(r4)
            int r4 = r7.hashCode()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.Object[] r4 = new java.lang.Object[r2]
            java.lang.String r5 = "MicroMsg.Gallery.StoryVideoViewMgr"
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c(r5, r3, r4)
            if (r1 == 0) goto Lb6
            r7.f489037f = r8
            boolean r8 = r7.f489038g
            if (r8 != 0) goto Lb0
            if (r9 == 0) goto Lb6
        Lb0:
            r7.f(r2, r0)
            r7.e()
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: sf4.j2.c(if4.h, boolean):void");
    }

    public final void d(android.view.ViewGroup viewGroup, boolean z17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkDetachVideoView, videoView:");
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b = this.f489032a;
        sb6.append(c18499x2fc2446b != null ? c18499x2fc2446b.hashCode() : 0);
        sb6.append(", isPlay:");
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b2 = this.f489032a;
        sb6.append(c18499x2fc2446b2 != null ? c18499x2fc2446b2.mo61531xc00617a4() : false);
        sb6.append(", parent:");
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b3 = this.f489032a;
        android.view.ViewParent parent = c18499x2fc2446b3 != null ? c18499x2fc2446b3.getParent() : null;
        sb6.append(parent != null ? parent.hashCode() : 0);
        sb6.append(", newParent:");
        sb6.append(viewGroup != null ? viewGroup.hashCode() : 0);
        sb6.append(", isPlayingVideoItem:");
        sb6.append(this.f489036e);
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.Gallery.StoryVideoViewMgr", sb6.toString(), new java.lang.Object[0]);
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b4 = this.f489032a;
        if ((c18499x2fc2446b4 != null ? c18499x2fc2446b4.getParent() : null) != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b5 = this.f489032a;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c18499x2fc2446b5 != null ? c18499x2fc2446b5.getParent() : null, viewGroup)) {
                return;
            }
            f(false, true);
            com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b6 = this.f489032a;
            android.view.ViewParent parent2 = c18499x2fc2446b6 != null ? c18499x2fc2446b6.getParent() : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(parent2, "null cannot be cast to non-null type android.view.ViewGroup");
            ((android.view.ViewGroup) parent2).removeView(this.f489032a);
            this.f489037f = null;
        }
    }

    public final void e() {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.Gallery.StoryVideoViewMgr", "playVideo, false " + this.f489038g + ", " + this.f489037f, new java.lang.Object[0]);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setVideoViewProp, isMute:");
        sb6.append(this.f489034c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Gallery.StoryVideoViewMgr", sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b = this.f489032a;
        if (c18499x2fc2446b != null) {
            c18499x2fc2446b.mo61536x764d819b(this.f489034c);
        }
        this.f489038g = true;
        if4.h hVar = this.f489037f;
        if (hVar != null) {
            this.f489035d = java.util.UUID.randomUUID().toString();
            sf4.f2 f2Var = this.f489033b;
            if (f2Var != null) {
                f2Var.f489008f = hVar;
                f2Var.f489006d = ef4.k0.f333992a.b(hVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoPlayProxy", "setStoryVideoItem " + hVar + " videoCache " + f2Var.f489006d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b2 = this.f489032a;
            if (c18499x2fc2446b2 != null) {
                c18499x2fc2446b2.l0(hVar, this.f489035d);
            }
            if (hVar.f372790e != if4.i.f372793d) {
                this.f489036e = true;
            }
            if (!this.f489040i) {
                this.f489039h.b();
                this.f489040i = true;
            }
        }
        mf4.d.f407696d.f142451d = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4553xb23e0071.m40062x608a19a0(this.f489032a != null ? r1.getContext() : null);
    }

    public final void f(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.c("MicroMsg.Gallery.StoryVideoViewMgr", "stopVideo, detach: " + z17, new java.lang.Object[0]);
        if (this.f489036e) {
            this.f489035d = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p2235x68af8f5.ui.p2241x373aa5.p2242xf44c7752.C18499x2fc2446b c18499x2fc2446b = this.f489032a;
            if (c18499x2fc2446b != null) {
                c18499x2fc2446b.mo48239x360802();
            }
            if (this.f489040i) {
                this.f489039h.a();
                this.f489040i = false;
            }
            this.f489036e = false;
        }
        if (z17) {
            this.f489038g = false;
            d(null, z18);
            mf4.d dVar = mf4.d.f407693a;
            mf4.d.f407696d.f142458k = java.lang.System.currentTimeMillis();
            if (z18) {
                dVar.c();
            }
        }
    }
}
