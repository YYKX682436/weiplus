package com.tencent.mm.plugin.finder.extension.reddot;

/* loaded from: classes8.dex */
public final class g implements zy2.ka {

    /* renamed from: a, reason: collision with root package name */
    public zy2.ja f105527a;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.extension.reddot.z9 f105529c;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager$mainUiIndexChangeListener$1 f105533g;

    /* renamed from: b, reason: collision with root package name */
    public int f105528b = -1;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f105530d = jz5.h.b(com.tencent.mm.plugin.finder.extension.reddot.f.f105503d);

    /* renamed from: e, reason: collision with root package name */
    public final androidx.lifecycle.k0 f105531e = new com.tencent.mm.plugin.finder.extension.reddot.c(this);

    /* renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.k0 f105532f = new com.tencent.mm.plugin.finder.extension.reddot.b(this);

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager$mainUiIndexChangeListener$1] */
    public g() {
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.f105533g = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.HomeUITabChangeEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.extension.reddot.DiscoveryFinderRedDotManager$mainUiIndexChangeListener$1
            {
                this.__eventId = -1095690568;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.HomeUITabChangeEvent homeUITabChangeEvent) {
                com.tencent.mm.autogen.events.HomeUITabChangeEvent event = homeUITabChangeEvent;
                kotlin.jvm.internal.o.g(event, "event");
                if (event.f54438g.f7425a == 2) {
                    return false;
                }
                zy2.ia.n0(((c61.l7) i95.n0.c(c61.l7.class)).nk(), "Discovery", null, 2, null);
                return false;
            }
        };
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x007f, code lost:
    
        if (r2.equals("FinderMentionEntrance") == false) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bb, code lost:
    
        r4 = 256;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00b8, code lost:
    
        if (r2.equals("FinderEntrance") == false) goto L58;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List a(java.util.List r8) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.g.a(java.util.List):java.util.List");
    }

    public final boolean b(com.tencent.mm.plugin.finder.extension.reddot.a aVar) {
        if (!kotlin.jvm.internal.o.b(aVar != null ? aVar.f105331e : null, "FinderMentionEntrance")) {
            return false;
        }
        r45.f03 f03Var = aVar.f105328b;
        return (f03Var != null && f03Var.f373887d == 2) && !((c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class))).aj();
    }

    public boolean c() {
        r45.f03 f03Var;
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = this.f105529c;
        if (z9Var != null && z9Var.f105327a) {
            if ((z9Var == null || (f03Var = z9Var.f105328b) == null || f03Var.f373887d != 1) ? false : true) {
                return true;
            }
        }
        return false;
    }

    public boolean d() {
        r45.f03 f03Var;
        com.tencent.mm.plugin.finder.extension.reddot.z9 z9Var = this.f105529c;
        if (z9Var != null && z9Var.f105327a) {
            if ((z9Var == null || (f03Var = z9Var.f105328b) == null || f03Var.f373887d != 26) ? false : true) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
    
        if (c92.g.f39738a.c() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        r8 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
    
        if (r6.equals("NearbyEntrance") == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
    
        if (r6.equals("FinderMentionEntrance") == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00b7, code lost:
    
        r9 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0086, code lost:
    
        if (c92.g.f39738a.c() != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b4, code lost:
    
        if (r6.equals("FinderEntrance") == false) goto L60;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(int r12, com.tencent.mm.plugin.finder.extension.reddot.jb r13, r45.f03 r14) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.extension.reddot.g.e(int, com.tencent.mm.plugin.finder.extension.reddot.jb, r45.f03):void");
    }
}
