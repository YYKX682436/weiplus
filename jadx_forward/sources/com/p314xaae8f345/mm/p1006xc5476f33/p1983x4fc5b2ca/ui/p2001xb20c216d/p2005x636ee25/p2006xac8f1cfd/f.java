package com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd;

/* loaded from: classes5.dex */
public class f extends com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.b implements ev3.d {

    /* renamed from: h, reason: collision with root package name */
    public final int f237751h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f237752i;

    /* renamed from: m, reason: collision with root package name */
    public final sv3.a f237753m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.Map f237754n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a f237755o;

    /* renamed from: p, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e f237756p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(android.view.ViewGroup parent, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.j0 status, int i17) {
        super(parent, status);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f237751h = i17;
        this.f237752i = "MicroMsg.MusicCallbackComponent";
        this.f237753m = new sv3.a(0, null, 3, null);
        this.f237754n = new java.util.LinkedHashMap();
        this.f237756p = new com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.e(this);
    }

    public static void v(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.f fVar, boolean z17, boolean z18, boolean z19, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a aVar;
        java.util.ArrayList<wt3.h> arrayList;
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onToggleLyricsCallback");
        }
        if ((i17 & 4) != 0) {
            z19 = false;
        }
        fVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onToggleLyricsCallback: ");
        sb6.append(z17);
        sb6.append(", currentMusicKey:");
        sv3.a aVar2 = fVar.f237753m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = aVar2.f494921b;
        sb6.append(c16997xb0aa383a != null ? c16997xb0aa383a.a() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.f237752i, sb6.toString());
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a aVar3 = fVar.f237755o;
        if (aVar3 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a2 = aVar2.f494921b;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            if (c16997xb0aa383a2 != null && (arrayList = c16997xb0aa383a2.f237246g) != null) {
                for (wt3.h hVar : arrayList) {
                    r45.ge4 ge4Var = new r45.ge4();
                    ge4Var.f456700d = hVar.f530954a;
                    ge4Var.f456701e = hVar.f530955b;
                    arrayList2.add(ge4Var);
                }
            }
            aVar3.c(z17, arrayList2);
        }
        if (z18 && (aVar = fVar.f237755o) != null) {
            aVar.mo68205x3720c068(z17);
        }
        if (z17 && z19) {
            fVar.s(aVar2.f494921b, aVar2.f494920a);
        }
    }

    @Override // ev3.d
    public void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a aVar = this.f237755o;
        if (aVar != null) {
            aVar.a();
        }
        sv3.a aVar2 = this.f237753m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a = aVar2.f494921b;
        if (c16997xb0aa383a == null) {
            return;
        }
        int i17 = aVar2.f494920a;
        java.lang.String a17 = c16997xb0aa383a.a();
        java.util.Iterator it = o(c16997xb0aa383a, i17).iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            ev3.c cVar = (ev3.c) ((java.util.LinkedHashMap) this.f237754n).get(java.lang.Integer.valueOf(intValue));
            if (cVar != null) {
                cVar.S(intValue, a17);
            }
        }
    }

    @Override // ev3.d
    public void c(int i17, ev3.c cVar) {
        this.f237754n.put(java.lang.Integer.valueOf(i17), cVar);
    }

    @Override // ev3.d
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a d() {
        return this.f237753m.f494921b;
    }

    @Override // ev3.d
    public com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a f() {
        return this.f237755o;
    }

    @Override // ev3.d
    public void g() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a aVar = this.f237755o;
        if (aVar != null) {
            aVar.s(false, null);
        }
        t(null, true);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    @Override // ev3.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a r8, int r9, android.view.View r10, boolean r11, boolean r12, android.os.Bundle r13) {
        /*
            r7 = this;
            if (r8 == 0) goto L37
            int r0 = r8.f237252p
            if (r0 > 0) goto L7
            goto L37
        L7:
            com.tencent.mm.plugin.vlog.model.h0 r0 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.j0.f257165a
            r0.getClass()
            r0 = 1
            if (r9 == r0) goto L28
            r0 = 2
            if (r9 == r0) goto L25
            r0 = 3
            if (r9 == r0) goto L22
            r0 = 14
            if (r9 == r0) goto L1f
            switch(r9) {
                case 7: goto L28;
                case 8: goto L28;
                case 9: goto L25;
                case 10: goto L22;
                default: goto L1c;
            }
        L1c:
            java.lang.String r9 = ""
            goto L2a
        L1f:
            java.lang.String r9 = "recently_played"
            goto L2a
        L22:
            java.lang.String r9 = "search"
            goto L2a
        L25:
            java.lang.String r9 = "like"
            goto L2a
        L28:
            java.lang.String r9 = "recommend"
        L2a:
            r2 = r9
            com.tencent.mm.plugin.recordvideo.ui.editor.EditorAudioView$a r0 = r7.f237755o
            if (r0 == 0) goto L37
            r1 = r8
            r3 = r10
            r4 = r12
            r5 = r11
            r6 = r13
            r0.k(r1, r2, r3, r4, r5, r6)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.f.k(com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo, int, android.view.View, boolean, boolean, android.os.Bundle):void");
    }

    @Override // ev3.d
    public void l(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, boolean z17, boolean z18, boolean z19) {
        if (z17) {
            if (c16997xb0aa383a != null) {
                y(i17, c16997xb0aa383a, z18);
                wv3.b.f531581a.c(c16997xb0aa383a, z19, i17);
                return;
            }
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onSelectMusic: false, same=");
        sv3.a aVar = this.f237753m;
        sb6.append(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar.f494921b, c16997xb0aa383a));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f237752i, sb6.toString());
        if (c16997xb0aa383a == null || !p3321xbce91901.jvm.p3324x21ffc6bd.o.b(aVar.f494921b, c16997xb0aa383a)) {
            return;
        }
        t(null, false);
        t(aVar.f494921b, false);
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("key_boolean", true);
        this.f348515d.j(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.i0.f237786p, bundle);
    }

    public java.util.List o(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, int i17) {
        boolean z17 = true;
        java.util.List k17 = kz5.c0.k(java.lang.Integer.valueOf(i17));
        int i18 = this.f237751h;
        if (i17 != i18) {
            k17.add(java.lang.Integer.valueOf(i18));
        } else {
            java.lang.Integer valueOf = c16997xb0aa383a != null ? java.lang.Integer.valueOf(c16997xb0aa383a.f237252p) : null;
            if (valueOf != null && valueOf.intValue() == 10) {
                k17.add(2);
            } else if (valueOf != null && valueOf.intValue() == 11) {
                k17.add(3);
            } else if (valueOf != null && valueOf.intValue() == 12) {
                k17.add(9);
            } else {
                if ((valueOf == null || valueOf.intValue() != 13) && (valueOf == null || valueOf.intValue() != 14)) {
                    z17 = false;
                }
                if (z17) {
                    k17.add(10);
                }
            }
        }
        return k17;
    }

    public boolean q(int i17) {
        return false;
    }

    public final void r(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, int i17) {
        java.lang.String a17;
        if (c16997xb0aa383a == null || (a17 = c16997xb0aa383a.a()) == null) {
            return;
        }
        java.util.Iterator it = o(c16997xb0aa383a, i17).iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            ev3.c cVar = (ev3.c) ((java.util.LinkedHashMap) this.f237754n).get(java.lang.Integer.valueOf(intValue));
            if (cVar != null) {
                cVar.J(intValue, a17);
            }
        }
    }

    public final void s(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, int i17) {
        java.lang.String a17;
        if (c16997xb0aa383a == null || (a17 = c16997xb0aa383a.a()) == null) {
            return;
        }
        java.util.Iterator it = o(c16997xb0aa383a, i17).iterator();
        while (it.hasNext()) {
            int intValue = ((java.lang.Number) it.next()).intValue();
            ev3.c cVar = (ev3.c) ((java.util.LinkedHashMap) this.f237754n).get(java.lang.Integer.valueOf(intValue));
            if (cVar != null) {
                cVar.y(intValue, a17);
            }
        }
    }

    public void t(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a2;
        java.lang.String a17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a3;
        java.lang.String a18;
        sv3.a aVar = this.f237753m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a4 = aVar.f494921b;
        java.lang.String a19 = c16997xb0aa383a != null ? c16997xb0aa383a.a() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a5 = aVar.f494921b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a19, c16997xb0aa383a5 != null ? c16997xb0aa383a5.a() : null);
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a aVar2 = this.f237755o;
        if (aVar2 != null) {
            aVar2.m(c16997xb0aa383a);
        }
        int i17 = aVar.f494920a;
        java.util.Map map = this.f237754n;
        if (c16997xb0aa383a == null && (c16997xb0aa383a3 = aVar.f494921b) != null && c16997xb0aa383a3 != null && (a18 = c16997xb0aa383a3.a()) != null) {
            java.util.Iterator it = o(c16997xb0aa383a3, i17).iterator();
            while (it.hasNext()) {
                int intValue = ((java.lang.Number) it.next()).intValue();
                ev3.c cVar = (ev3.c) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(intValue));
                if (cVar != null) {
                    cVar.S(intValue, a18);
                }
            }
        }
        if (c16997xb0aa383a != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a6 = aVar.f494921b;
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c16997xb0aa383a6 != null ? c16997xb0aa383a6.a() : null, c16997xb0aa383a.a())) {
                s(aVar.f494921b, i17);
            }
        }
        if (!z17 || c16997xb0aa383a != null || (c16997xb0aa383a2 = aVar.f494921b) == null || (a17 = c16997xb0aa383a2.a()) == null) {
            return;
        }
        java.util.Iterator it6 = o(c16997xb0aa383a2, i17).iterator();
        while (it6.hasNext()) {
            int intValue2 = ((java.lang.Number) it6.next()).intValue();
            ev3.c cVar2 = (ev3.c) ((java.util.LinkedHashMap) map).get(java.lang.Integer.valueOf(intValue2));
            if (cVar2 != null) {
                cVar2.K(intValue2, a17);
            }
        }
    }

    public void u() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.C17040x9d8b708e.a aVar = this.f237755o;
        if (aVar != null) {
            aVar.q(null);
        }
    }

    public ev3.d w() {
        return this;
    }

    public final void x(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a) {
        boolean z17 = false;
        if (c16997xb0aa383a != null && c16997xb0aa383a.f237254r) {
            java.util.ArrayList arrayList = c16997xb0aa383a.f237246g;
            if (arrayList != null && (arrayList.isEmpty() ^ true)) {
                z17 = true;
            }
        }
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("key_boolean", z17);
        this.f348515d.j(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.ui.p2001xb20c216d.p2005x636ee25.p2006xac8f1cfd.i0.f237787q, bundle);
    }

    public void y(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a, boolean z17) {
        sv3.a aVar = this.f237753m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a2 = aVar.f494921b;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c16997xb0aa383a2 != null ? c16997xb0aa383a2.a() : null, c16997xb0aa383a != null ? c16997xb0aa383a.a() : null)) {
            r(aVar.f494921b, aVar.f494920a);
        }
        int i18 = this.f237751h;
        if (i17 != i18 && !q(i17)) {
            ev3.c cVar = (ev3.c) ((java.util.LinkedHashMap) this.f237754n).get(java.lang.Integer.valueOf(i18));
            if (cVar != null) {
                cVar.o(i17, c16997xb0aa383a, z17, true, i18, true);
            }
        }
        z(i17, c16997xb0aa383a);
        t(aVar.f494921b, false);
        x(c16997xb0aa383a);
    }

    public final void z(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1988x633fb29.p1989x58d9bd6.C16997xb0aa383a c16997xb0aa383a) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateCurrentSelectDataOnAudioSelect「");
        sb6.append(c16997xb0aa383a != null ? c16997xb0aa383a.f237256t : null);
        sb6.append("」, ");
        sb6.append(c16997xb0aa383a != null ? c16997xb0aa383a.a() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f237752i, sb6.toString());
        sv3.a aVar = this.f237753m;
        aVar.f494921b = c16997xb0aa383a;
        aVar.f494920a = i17;
    }
}
