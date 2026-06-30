package gp4;

/* loaded from: classes10.dex */
public final class j extends yt3.a implements android.view.View.OnClickListener, bp4.m2 {

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 f355945f;

    /* renamed from: g, reason: collision with root package name */
    public zu3.a f355946g;

    /* renamed from: h, reason: collision with root package name */
    public zv3.f f355947h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 view, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f355945f = view;
        view.m72597x24b3e0b8(gp4.a.f355923d);
        view.m72599x1bcd5a79(new gp4.b(status));
        view.m72596xa2b9091a(new gp4.c(this, status));
        view.m72603x41ec0de3(new gp4.d(this));
        view.m72602xa36e9463(new gp4.e(status));
        view.m72600x3c9dea39(new gp4.f(this, status));
        view.m72604x442a909c(new gp4.g(status));
    }

    public static void A(gp4.j jVar, zu3.a aVar, bv3.d dVar, java.lang.String str, long j17, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            dVar = null;
        }
        if ((i17 & 4) != 0) {
            str = null;
        }
        if ((i17 & 8) != 0) {
            j17 = -1;
        }
        jVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiEditItemContainerPlugin", "addTimeEditItemData " + aVar + ' ' + dVar + ' ' + str);
        if (aVar != null) {
            if (jVar.f355946g == null || !jVar.Q(aVar)) {
                if (dVar != null) {
                    bv3.d.a(aVar.f557293c, dVar, false, false, 6, null);
                }
                if (dVar == null && j17 >= 0) {
                    aVar.f557293c.d(j17, 10000 + j17);
                }
                if (str != null) {
                    aVar.f557294d = str;
                }
                jVar.f355945f.j(aVar);
            }
        }
    }

    public static /* synthetic */ void B(gp4.j jVar, zu3.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var, java.lang.String str, long j17, int i17, java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var2 = (i17 & 2) != 0 ? null : i1Var;
        java.lang.String str2 = (i17 & 4) != 0 ? null : str;
        if ((i17 & 8) != 0) {
            j17 = -1;
        }
        jVar.z(aVar, i1Var2, str2, j17);
    }

    public final jz5.l C(java.util.List list, java.util.List list2) {
        java.util.List V0 = kz5.n0.V0(list2);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((zu3.a) it.next()).f557293c);
        }
        long j17 = 0;
        long j18 = 0;
        for (bv3.d dVar : kz5.n0.F0(arrayList, gp4.h.f355943d)) {
            if (dVar.c() >= j18) {
                j17 += dVar.b() - dVar.c();
            } else if (dVar.b() > j18) {
                j17 += dVar.b() - j18;
            }
            j18 = dVar.b();
            kz5.h0.B(V0, new gp4.i(dVar));
        }
        return new jz5.l(java.lang.Integer.valueOf(list2.size() - ((java.util.ArrayList) V0).size()), java.lang.Long.valueOf(j17));
    }

    public final void D(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiEditItemContainerPlugin", "enableGif:" + z17);
        this.f355945f.f257489q = z17 ^ true;
    }

    public final java.util.ArrayList E() {
        return this.f355945f.m72588x368fc4eb();
    }

    public final int F() {
        java.util.Iterator<T> it = this.f355945f.m72584x220820f0().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (((zu3.n) it.next()) instanceof zu3.l) {
                i17++;
            }
        }
        return i17;
    }

    public final android.graphics.Bitmap G(java.lang.String cacheId, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cacheId, "cacheId");
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 c18801xf3fcf614 = this.f355945f;
        java.util.ArrayList k17 = c18801xf3fcf614.k(cacheId);
        if (k17.isEmpty()) {
            return null;
        }
        zv3.f fVar = new zv3.f(new float[]{c18801xf3fcf614.getLeft(), c18801xf3fcf614.getTop(), c18801xf3fcf614.getRight(), c18801xf3fcf614.getBottom()}, I(), k17, i17, (c18801xf3fcf614.getHeight() * i17) / c18801xf3fcf614.getWidth());
        this.f355947h = fVar;
        fVar.e();
        zv3.f fVar2 = this.f355947h;
        android.graphics.Bitmap d17 = fVar2 != null ? fVar2.d(1L) : null;
        zv3.f fVar3 = this.f355947h;
        if (fVar3 != null) {
            fVar3.a();
        }
        this.f355947h = null;
        return d17;
    }

    public final int H() {
        java.util.Iterator<T> it = this.f355945f.m72584x220820f0().iterator();
        int i17 = 0;
        while (it.hasNext()) {
            if (((zu3.n) it.next()) instanceof zu3.b0) {
                i17++;
            }
        }
        return i17;
    }

    public final float[] I() {
        lt3.n nVar = lt3.n.f402793a;
        android.graphics.Rect rect = lt3.n.f402796d;
        return new float[]{rect.left, rect.top, rect.right, rect.bottom};
    }

    public final void J(float f17, float f18) {
        this.f355945f.getClass();
        android.graphics.Rect rect = lt3.n.f402795c;
        int i17 = (int) f18;
        rect.top = i17;
        rect.bottom = i17 + ((int) f17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimeEditorItemContainer", "initHeightSafeArea safeAreaRect:" + rect);
    }

    public final void K(float f17, float f18) {
        this.f355945f.getClass();
        android.graphics.Rect rect = lt3.n.f402795c;
        int i17 = (int) f18;
        rect.left = i17;
        rect.right = i17 + ((int) f17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimeEditorItemContainer", "initWidthSafeArea safeAreaRect:" + rect);
    }

    public final java.lang.String L(java.util.List trackList, boolean z17) {
        java.lang.Object next;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trackList, "trackList");
        java.util.Iterator it = trackList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) next).f257160l.f479036e;
                do {
                    java.lang.Object next2 = it.next();
                    long j18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) next2).f257160l.f479036e;
                    if (j17 < j18) {
                        next = next2;
                        j17 = j18;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) next;
        long j19 = i1Var != null ? i1Var.f257160l.f479036e : com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        java.util.List<zu3.a> m72583x46784382 = this.f355945f.m72583x46784382();
        java.util.ArrayList<zu3.j> arrayList = new java.util.ArrayList();
        for (zu3.a aVar : m72583x46784382) {
            zu3.j jVar = aVar instanceof zu3.j ? (zu3.j) aVar : null;
            bv3.d dVar = aVar.f557293c;
            dVar.d(dVar.c(), java.lang.Math.min(aVar.f557293c.b(), j19));
            if (jVar != null) {
                arrayList.add(jVar);
            }
        }
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (zu3.j jVar2 : arrayList) {
            arrayList2.add(java.lang.Long.valueOf(z17 ? 0L : jVar2.f557293c.b() - jVar2.f557293c.c()));
        }
        java.util.Map l17 = kz5.c1.l(new jz5.l("emojiCount", java.lang.Integer.valueOf(size)), new jz5.l("emojiStatus", kz5.n0.g0(arrayList2, "|", null, null, 0, null, null, 62, null)));
        if (z17) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                arrayList3.add(((zu3.j) it6.next()).f557294d);
            }
            l17.put("useEmojiTrackCount", java.lang.Integer.valueOf(kz5.n0.X0(arrayList3).size()));
            l17.put("totalDurationMs", 0);
        } else {
            jz5.l C = C(arrayList, trackList);
            l17.put("useEmojiTrackCount", C.f384366d);
            l17.put("totalDurationMs", C.f384367e);
        }
        java.lang.String gVar = new cl0.g(l17).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "toString(...)");
        return r26.i0.t(gVar, ",", ";", false);
    }

    public final java.lang.String M(java.util.List trackList, boolean z17) {
        java.lang.Object next;
        long b17;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trackList, "trackList");
        java.util.Iterator it = trackList.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                long j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) next).f257160l.f479036e;
                do {
                    java.lang.Object next2 = it.next();
                    long j18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) next2).f257160l.f479036e;
                    if (j17 < j18) {
                        next = next2;
                        j17 = j18;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) next;
        long j19 = i1Var != null ? i1Var.f257160l.f479036e : com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        java.util.List<zu3.a> m72583x46784382 = this.f355945f.m72583x46784382();
        java.util.ArrayList<zu3.a0> arrayList = new java.util.ArrayList();
        for (zu3.a aVar : m72583x46784382) {
            zu3.a0 a0Var = aVar instanceof zu3.a0 ? (zu3.a0) aVar : null;
            if (a0Var != null) {
                bv3.d dVar = aVar.f557293c;
                dVar.d(dVar.c(), java.lang.Math.min(aVar.f557293c.b(), j19));
            } else {
                a0Var = null;
            }
            if (a0Var != null) {
                arrayList.add(a0Var);
            }
        }
        int size = arrayList.size();
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (zu3.a0 a0Var2 : arrayList) {
            jz5.l[] lVarArr = new jz5.l[3];
            lVarArr[0] = new jz5.l("font", com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.x.b(a0Var2.f557301k));
            if (z17) {
                b17 = 0;
            } else {
                bv3.d dVar2 = a0Var2.f557293c;
                b17 = dVar2.b() - dVar2.c();
            }
            lVarArr[1] = new jz5.l("durationMs", java.lang.Long.valueOf(b17));
            lVarArr[2] = new jz5.l("isRead", java.lang.Integer.valueOf(a0Var2.a() ? 1 : 0));
            arrayList2.add(kz5.c1.k(lVarArr));
        }
        java.util.Map l17 = kz5.c1.l(new jz5.l("textCount", java.lang.Integer.valueOf(size)), new jz5.l("textStatus", arrayList2));
        if (z17) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
            java.util.Iterator it6 = arrayList.iterator();
            while (it6.hasNext()) {
                arrayList3.add(((zu3.a0) it6.next()).f557294d);
            }
            l17.put("useTextTrackCount", java.lang.Integer.valueOf(kz5.n0.X0(arrayList3).size()));
            l17.put("totalDurationMs", 0);
        } else {
            jz5.l C = C(arrayList, trackList);
            l17.put("useTextTrackCount", C.f384366d);
            l17.put("totalDurationMs", C.f384367e);
        }
        java.lang.String gVar = new cl0.g(l17).toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(gVar, "toString(...)");
        return r26.i0.t(gVar, ",", ";", false);
    }

    public final void N(boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 c18801xf3fcf614 = this.f355945f;
        android.view.View view = c18801xf3fcf614.f257497y;
        if (view != null) {
            c18801xf3fcf614.q(view, z17);
        }
        if (z17) {
            return;
        }
        this.f355946g = null;
    }

    public final void O(boolean z17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiEditItemContainerPlugin", "setFullScreen:" + z17);
    }

    public final void P() {
        this.f355945f.u();
    }

    public final boolean Q(zu3.a aVar) {
        zu3.a aVar2 = this.f355946g;
        if (!(aVar2 instanceof zu3.a0) || !(aVar instanceof zu3.a0)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(aVar2, "null cannot be cast to non-null type com.tencent.mm.plugin.recordvideo.ui.editor.item.TextItem");
        zu3.a0 a0Var = (zu3.a0) aVar2;
        zu3.a0 item = (zu3.a0) aVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        a0Var.f557297g = item.f557297g;
        a0Var.f557298h = item.f557298h;
        a0Var.f557299i = item.f557299i;
        a0Var.f557300j = item.f557300j;
        a0Var.f557296f.set(item.f557296f);
        a0Var.f557301k = item.f557301k;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextItem", a0Var.m179489x9616526c());
        zu3.a aVar3 = this.f355946g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar3);
        this.f355945f.v(aVar3);
        this.f355946g = null;
        return true;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/vlog/ui/plugin/timeedit/MultiEditItemContainerPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/vlog/ui/plugin/timeedit/MultiEditItemContainerPlugin", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    @Override // yt3.r2
    /* renamed from: onPause */
    public void mo11000xb01dfb57() {
        this.f355945f.l();
    }

    @Override // yt3.r2
    /* renamed from: onResume */
    public void mo11001x57429eec() {
        this.f355945f.r();
    }

    @Override // bp4.m2
    /* renamed from: onVideoPause */
    public void mo10995x65d3157a() {
    }

    @Override // bp4.m2
    /* renamed from: onVideoPlay */
    public void mo10996x4d9b9b30() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.ui.p2328xc5476f33.p2331x84359257.C18801xf3fcf614 c18801xf3fcf614 = this.f355945f;
        android.view.View view = c18801xf3fcf614.f257497y;
        if (view != null) {
            c18801xf3fcf614.q(view, false);
        }
    }

    @Override // yt3.r2
    /* renamed from: release */
    public void mo9065x41012807() {
        this.f355945f.m72595x6761d4f();
    }

    @Override // yt3.r2
    /* renamed from: reset */
    public void mo9066x6761d4f() {
        this.f355945f.m72595x6761d4f();
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        this.f355945f.setVisibility(i17);
    }

    public final void z(zu3.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var, java.lang.String str, long j17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addTimeEditItemData ");
        sb6.append(aVar);
        sb6.append(' ');
        sb6.append(i1Var != null ? i1Var.f257153e : null);
        sb6.append(' ');
        sb6.append(str);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiEditItemContainerPlugin", sb6.toString());
        if (aVar != null) {
            if (this.f355946g == null || !Q(aVar)) {
                if (i1Var != null) {
                    bv3.d.a(aVar.f557293c, i1Var.f257153e, false, false, 6, null);
                }
                if (i1Var == null && j17 >= 0) {
                    aVar.f557293c.d(j17, 10000 + j17);
                }
                if (str != null) {
                    aVar.f557294d = str;
                }
                this.f355945f.j(aVar);
            }
        }
    }
}
