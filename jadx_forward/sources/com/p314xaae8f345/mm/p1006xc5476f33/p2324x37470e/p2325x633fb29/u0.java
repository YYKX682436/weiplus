package com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29;

/* loaded from: classes10.dex */
public final class u0 implements im5.a {

    /* renamed from: h, reason: collision with root package name */
    public boolean f257267h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f257268i;

    /* renamed from: m, reason: collision with root package name */
    public int f257269m;

    /* renamed from: n, reason: collision with root package name */
    public int f257270n;

    /* renamed from: r, reason: collision with root package name */
    public long f257274r;

    /* renamed from: x, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 f257280x;

    /* renamed from: y, reason: collision with root package name */
    public long f257281y;

    /* renamed from: z, reason: collision with root package name */
    public long f257282z;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f257263d = new java.util.LinkedList();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f257264e = new java.util.LinkedList();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f257265f = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f257266g = new java.util.LinkedList();

    /* renamed from: o, reason: collision with root package name */
    public float f257271o = dq4.c.f323902a.c();

    /* renamed from: p, reason: collision with root package name */
    public final android.graphics.RectF f257272p = new android.graphics.RectF();

    /* renamed from: q, reason: collision with root package name */
    public final android.graphics.RectF f257273q = new android.graphics.RectF();

    /* renamed from: s, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.k1 f257275s = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.k1();

    /* renamed from: t, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 f257276t = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1(kz5.p0.f395529d);

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f257277u = new java.util.LinkedList();

    /* renamed from: v, reason: collision with root package name */
    public int f257278v = -1;

    /* renamed from: w, reason: collision with root package name */
    public int f257279w = -1;
    public float A = 1.0f;
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.w0 B = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.w0(0, 0);

    public final void a(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 refComposition, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refComposition, "refComposition");
        java.util.ArrayList arrayList = refComposition.f257130c;
        rm5.i iVar = rm5.j.f479031v;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        for (java.lang.Object obj : arrayList) {
            int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) obj).f257150b;
            boolean z18 = true;
            if (i17 != 2 && i17 != 1) {
                z18 = false;
            }
            if (z18) {
                arrayList2.add(obj);
            }
        }
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList3.add(((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) it.next()).f257160l);
        }
        iVar.a(arrayList3);
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.addAll(arrayList);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1(arrayList4);
        this.f257276t = h1Var;
        if (z17) {
            h1Var.r(this.f257274r);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var2 = this.f257276t;
        so4.g gVar = so4.g.f492309a;
        h1Var2.q(so4.g.f492314f);
        this.f257276t.u(this.f257269m, this.f257270n);
    }

    public final void b() {
        this.f257278v = -1;
        java.util.LinkedList linkedList = this.f257277u;
        linkedList.clear();
        linkedList.addAll(this.f257266g);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1(linkedList);
        this.f257276t = h1Var;
        h1Var.r(this.f257274r);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var2 = this.f257276t;
        so4.g gVar = so4.g.f492309a;
        h1Var2.q(so4.g.f492314f);
        this.f257276t.u(this.f257269m, this.f257270n);
    }

    public final void c(so4.b template) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(template, "template");
        throw null;
    }

    public final com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 d() {
        return this.f257280x;
    }

    @Override // im5.a
    /* renamed from: dead */
    public void mo10668x2efc64() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.k1 k1Var = this.f257275s;
        k1Var.getClass();
        gm0.j1.d().q(1469, k1Var);
        gm0.j1.d().q(2972, k1Var);
    }

    public final void j(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiMediaModel", "editTrack index:" + i17);
        this.f257279w = i17;
        long j17 = this.f257276t.j();
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.w0 w0Var = this.B;
        w0Var.f257311a = j17;
        w0Var.f257312b = this.f257276t.h();
        int i18 = this.f257279w;
        if (i18 >= 0) {
            java.util.LinkedList linkedList = this.f257277u;
            if (i18 < linkedList.size()) {
                java.lang.Object obj = linkedList.get(this.f257279w);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) obj;
                this.f257280x = i1Var;
                rm5.j jVar = i1Var.f257160l;
                this.f257281y = jVar.f479037f;
                this.f257282z = jVar.f479038g;
                this.A = jVar.f479039h;
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1(i1Var.f257149a, i1Var.f257150b, 0, 4, null);
                rm5.j jVar2 = i1Var.f257160l;
                i1Var2.c(jVar2.f479041j);
                i1Var2.a(((float) jVar2.f479041j) / jVar2.f479039h);
                i1Var2.b(jVar2.f479039h);
                i1Var2.f257154f = i1Var.f257154f;
                i1Var2.f257155g = i1Var.f257155g;
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.y yVar = i1Var2.f257157i;
                android.graphics.Rect rect = yVar.f257318b;
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.y yVar2 = i1Var.f257157i;
                rect.set(yVar2.f257318b);
                yVar.f257320d.set(yVar2.f257320d);
                yVar.f257319c.set(yVar2.f257319c);
                yVar.f257317a.set(yVar2.f257317a);
                rm5.j jVar3 = i1Var2.f257160l;
                jVar3.f479045n.set(jVar2.f479045n);
                jVar3.g();
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1(kz5.b0.c(i1Var2));
                this.f257276t = h1Var;
                h1Var.u(this.f257269m, this.f257270n);
                this.f257276t.q(so4.g.f492314f);
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var2 = this.f257276t;
                float f17 = (float) this.f257281y;
                float f18 = this.A;
                h1Var2.s(f17 / f18, ((float) this.f257282z) / f18);
            }
        }
    }

    public final void k(int i17, long j17, long j18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiMediaModel", "editTrack editIndex:" + i17 + ", start:" + j17 + ", end:" + j18);
        java.util.LinkedList linkedList = this.f257277u;
        if (i17 >= 0 && i17 < linkedList.size()) {
            java.lang.Object obj = linkedList.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) obj;
            if (j17 >= 0 && j18 >= 0) {
                i1Var.d(j17);
                i1Var.c(j18);
            }
            rm5.i iVar = rm5.j.f479031v;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) it.next()).f257160l);
            }
            iVar.a(arrayList);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1(linkedList);
        this.f257276t = h1Var;
        h1Var.r(this.f257274r);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var2 = this.f257276t;
        so4.g gVar = so4.g.f492309a;
        h1Var2.q(so4.g.f492314f);
        this.f257276t.u(this.f257269m, this.f257270n);
    }

    public final void l(boolean z17, long j17, long j18, int i17, int i18, boolean z18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MultiMediaModel", "endEditTrack editIndex:" + this.f257279w + ", confirm:" + z17 + ", start:" + j17 + ", end:" + j18);
        int i19 = this.f257279w;
        java.util.LinkedList linkedList = this.f257277u;
        if (i19 >= 0 && i19 < linkedList.size()) {
            java.lang.Object obj = linkedList.get(this.f257279w);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) obj;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16992x127e9e90.EditItem editItem = i1Var.f257159k;
            editItem.f37762xd5b83c7d++;
            editItem.f37764x7935d5a1 += i17;
            editItem.f37765x82a6880e += i18;
            rm5.j jVar = i1Var.f257160l;
            if (!z17 || j17 < 0 || j18 < 0) {
                i1Var.d(this.f257281y);
                i1Var.c(this.f257282z);
            } else {
                i1Var.d(((float) j17) * jVar.f479039h);
                i1Var.c(((float) j18) * jVar.f479039h);
            }
            i1Var.f257159k.f37769x2a5f0245 = ((float) (jVar.f479038g - jVar.f479037f)) / jVar.f479039h;
            if (z18) {
                this.f257280x = null;
                this.f257279w = -1;
            }
            rm5.i iVar = rm5.j.f479031v;
            java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) it.next()).f257160l);
            }
            iVar.a(arrayList);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1(linkedList);
        this.f257276t = h1Var;
        h1Var.r(this.f257274r);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var2 = this.f257276t;
        so4.g gVar = so4.g.f492309a;
        h1Var2.q(so4.g.f492314f);
        this.f257276t.u(this.f257269m, this.f257270n);
    }

    public final boolean s() {
        return this.f257278v >= 0;
    }

    public final android.graphics.Rect t() {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) this.f257266g.getFirst()).f257157i.f257320d;
    }

    public final void u(float f17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = this.f257280x;
        if (i1Var != null) {
            i1Var.b(f17);
            i1Var.f257160l.g();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) kz5.n0.Z(this.f257276t.f257130c);
        if (i1Var2 != null) {
            i1Var2.b(f17);
            rm5.j jVar = i1Var2.f257160l;
            jVar.g();
            this.f257276t.s(jVar.f479035d, jVar.f479036e);
        }
    }

    public final void v(android.graphics.RectF maxVisibleRect, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(maxVisibleRect, "maxVisibleRect");
        this.f257273q.set(maxVisibleRect);
        android.graphics.RectF rectF = this.f257272p;
        rectF.set(maxVisibleRect);
        if (z17) {
            rectF.inset(0.0f, (maxVisibleRect.height() - (maxVisibleRect.width() * this.f257271o)) / 2);
        }
    }

    public final void w(int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.k1 k1Var = this.f257275s;
        k1Var.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VLogDataManager", "setPreviewSize, width:" + i17 + ", " + i18);
        k1Var.getClass();
        k1Var.getClass();
    }

    public final void x(boolean z17, android.util.Size screenSize) {
        int width;
        int height;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(screenSize, "screenSize");
        android.graphics.Rect rect = new android.graphics.Rect();
        int i17 = 0;
        for (java.lang.Object obj : this.f257266g) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) obj;
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.y yVar = i1Var.f257157i;
            float f17 = i1Var.f257155g / i1Var.f257154f;
            if (i17 == 0) {
                width = screenSize.getWidth();
                height = screenSize.getHeight();
            } else {
                width = rect.width();
                height = rect.height();
            }
            float f18 = height;
            float f19 = width;
            float f27 = f18 / f19;
            if (!(i17 == 0 && z17) && (i17 == 0 || f17 <= f27)) {
                float f28 = f18 / f17;
                float f29 = (f19 - f28) / 2;
                yVar.f257320d.set((int) f29, 0, (int) (f28 + f29), height);
            } else {
                float f37 = f19 * f17;
                float f38 = (f18 - f37) / 2;
                yVar.f257320d.set(0, (int) f38, width, (int) (f37 + f38));
            }
            if (i17 == 0) {
                android.graphics.Rect rect2 = yVar.f257320d;
                if (screenSize.getWidth() * screenSize.getHeight() < rect2.width() * rect2.height()) {
                    rect.set(0, 0, screenSize.getWidth(), screenSize.getHeight());
                } else {
                    rect.set(rect2);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.q0.b(yVar.f257317a, new android.graphics.RectF(0.0f, 0.0f, i1Var.f257154f, i1Var.f257155g), new android.graphics.RectF(rect));
            float a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.q0.a(yVar.f257317a);
            yVar.f257321e = a17;
            yVar.f257322f = 5.0f * a17;
            yVar.f257323g = a17 * 0.25f;
            i1Var.f257160l.f479047p = true;
            i17 = i18;
        }
    }

    public final void y() {
        for (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var : this.f257266g) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.y yVar = i1Var.f257157i;
            boolean isIdentity = yVar.f257317a.isIdentity();
            rm5.j jVar = i1Var.f257160l;
            if (isIdentity) {
                float f17 = (i1Var.f257155g * 1.0f) / i1Var.f257154f;
                android.graphics.RectF rectF = this.f257272p;
                android.graphics.Rect rect = yVar.f257320d;
                rectF.round(rect);
                if (f17 > rectF.height() / rectF.width()) {
                    float width = ((i1Var.f257155g * ((rectF.width() * 1.0f) / i1Var.f257154f)) - rectF.height()) / 2;
                    rect.top = (int) (rectF.top - width);
                    rect.bottom = (int) (rectF.bottom + width);
                } else {
                    float height = ((i1Var.f257154f * ((rectF.height() * 1.0f) / i1Var.f257155g)) - rectF.width()) / 2;
                    rect.left = (int) (rectF.left - height);
                    rect.right = (int) (rectF.right + height);
                }
                rectF.round(yVar.f257318b);
                android.graphics.Matrix matrix = yVar.f257317a;
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.q0.b(matrix, new android.graphics.RectF(0.0f, 0.0f, i1Var.f257154f, i1Var.f257155g), new android.graphics.RectF(rect));
                android.graphics.RectF rectF2 = this.f257273q;
                rect.offset(-((int) rectF2.left), -((int) rectF2.top));
                jVar.f479045n.set(rect);
                float a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.q0.a(matrix);
                yVar.f257321e = a17;
                yVar.f257322f = 5.0f * a17;
                yVar.f257323g = a17 * 0.25f;
            }
            jVar.f479047p = true;
        }
    }

    public final void c(java.util.List trackList, java.util.List list) {
        java.lang.Object next;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(trackList, "trackList");
        rm5.i iVar = rm5.j.f479031v;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : trackList) {
            int i17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) obj).f257150b;
            boolean z17 = true;
            if (i17 != 2 && i17 != 1) {
                z17 = false;
            }
            if (z17) {
                arrayList.add(obj);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) it.next()).f257160l);
        }
        iVar.a(arrayList2);
        java.util.Iterator it6 = trackList.iterator();
        java.util.ArrayList arrayList3 = null;
        if (it6.hasNext()) {
            next = it6.next();
            if (it6.hasNext()) {
                long j17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) next).f257160l.f479036e;
                do {
                    java.lang.Object next2 = it6.next();
                    long j18 = ((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) next2).f257160l.f479036e;
                    if (j17 < j18) {
                        next = next2;
                        j17 = j18;
                    }
                } while (it6.hasNext());
            }
        } else {
            next = null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) next;
        long j19 = i1Var != null ? i1Var.f257160l.f479036e : com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        if (list != null) {
            arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
            for (java.util.Iterator it7 = list.iterator(); it7.hasNext(); it7 = it7) {
                jz5.o oVar = (jz5.o) it7.next();
                java.lang.String str = (java.lang.String) oVar.f384374d;
                long longValue = ((java.lang.Number) oVar.f384375e).longValue();
                long longValue2 = ((java.lang.Number) oVar.f384376f).longValue();
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var2 = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1(str, 3, 0, 4, null);
                i1Var2.e(longValue);
                i1Var2.a(java.lang.Math.min(longValue2, j19));
                i1Var2.d(0L);
                i1Var2.c(longValue2 - longValue);
                i1Var2.f257160l.f(3.0f);
                arrayList3.add(i1Var2);
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        arrayList4.addAll(trackList);
        if (arrayList3 != null) {
            arrayList4.addAll(arrayList3);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1(arrayList4);
        this.f257276t = h1Var;
        h1Var.r(this.f257274r);
        this.f257276t.q(so4.g.f492314f);
        this.f257276t.u(this.f257269m, this.f257270n);
    }
}
