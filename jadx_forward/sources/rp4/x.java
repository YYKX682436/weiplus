package rp4;

/* loaded from: classes10.dex */
public final class x {

    /* renamed from: e, reason: collision with root package name */
    public volatile int f480233e;

    /* renamed from: f, reason: collision with root package name */
    public volatile int f480234f;

    /* renamed from: l, reason: collision with root package name */
    public int f480240l;

    /* renamed from: m, reason: collision with root package name */
    public int f480241m;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.LinkedList f480229a = new java.util.LinkedList();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedList f480230b = new java.util.LinkedList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f480231c = new java.util.LinkedList();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.LinkedList f480232d = new java.util.LinkedList();

    /* renamed from: g, reason: collision with root package name */
    public final android.graphics.Rect f480235g = new android.graphics.Rect();

    /* renamed from: h, reason: collision with root package name */
    public final android.graphics.Rect f480236h = new android.graphics.Rect();

    /* renamed from: i, reason: collision with root package name */
    public final android.graphics.Rect f480237i = new android.graphics.Rect();

    /* renamed from: j, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 f480238j = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1(kz5.p0.f395529d);

    /* renamed from: k, reason: collision with root package name */
    public final java.util.LinkedList f480239k = new java.util.LinkedList();

    public final void a() {
        if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_sns_video_enable_hdr_lut, 1) != 1) {
            return;
        }
        java.util.LinkedList<com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1> linkedList = this.f480239k;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        for (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var : linkedList) {
            if (i1Var.f257150b == 2) {
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var = this.f480238j;
                rs0.q a17 = rs0.r.f480849a.a(i1Var.f257149a);
                if (a17 != null) {
                    h1Var.b(a17.f480846b, a17.f480847c, a17.f480848d);
                }
            }
            arrayList.add(jz5.f0.f384359a);
        }
    }

    public final void b() {
        this.f480239k.clear();
        this.f480239k.addAll(this.f480232d);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1(this.f480239k);
        this.f480238j = h1Var;
        h1Var.r(0L);
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.h1 h1Var2 = this.f480238j;
        so4.g gVar = so4.g.f492309a;
        h1Var2.q(so4.g.f492314f);
        this.f480238j.u(this.f480233e, this.f480234f);
        a();
    }

    public final boolean c() {
        if (this.f480233e != 0 && this.f480234f != 0) {
            return true;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MediaModel", "isNormalSizeValid maxWidth: " + this.f480233e + ", maxHeight: " + this.f480234f);
        return false;
    }

    public final void d(int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaModel", "maxWidth: " + i17 + ", maxHeight: " + i18);
        this.f480234f = i18;
        this.f480233e = i17;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x028f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x029e A[ADDED_TO_REGION, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e(rp4.w r15) {
        /*
            Method dump skipped, instructions count: 700
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rp4.x.e(rp4.w):void");
    }

    public final void f(java.util.List paths, java.util.List types, java.util.List sourceFrom) {
        int i17;
        long j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b1 b1Var;
        com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(paths, "paths");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(types, "types");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sourceFrom, "sourceFrom");
        java.util.LinkedList linkedList = this.f480229a;
        linkedList.clear();
        java.util.LinkedList linkedList2 = this.f480230b;
        linkedList2.clear();
        java.util.LinkedList sources = this.f480231c;
        sources.clear();
        java.util.LinkedList linkedList3 = this.f480232d;
        linkedList3.clear();
        linkedList.addAll(paths);
        linkedList2.addAll(types);
        sources.addAll(com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b1.f257100d.a(paths, types, sourceFrom));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sources, "sources");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(sources, 10));
        java.util.Iterator it = sources.iterator();
        while (true) {
            i17 = 2;
            if (!it.hasNext()) {
                break;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b1 b1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b1) it.next();
            if (b1Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.q1) {
                i1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1(((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.q1) b1Var2).f257247e, 2, b1Var2.f257103c);
                i1Var.f257160l.a();
            } else if (b1Var2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.o0) {
                i1Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1(((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.o0) b1Var2).f257233e, 1, b1Var2.f257103c);
                i1Var.f257160l.a();
            } else {
                i1Var = null;
            }
            arrayList.add(i1Var);
        }
        java.util.List V = kz5.n0.V(arrayList);
        java.util.ArrayList arrayList2 = (java.util.ArrayList) V;
        java.util.Iterator it6 = arrayList2.iterator();
        int i18 = 0;
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            int i19 = i18 + 1;
            if (i18 < 0) {
                kz5.c0.p();
                throw null;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1 i1Var2 = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) next;
            com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b1 b1Var3 = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.b1) sources.get(i18);
            int i27 = i1Var2.f257150b;
            java.util.ArrayList arrayList3 = arrayList2;
            com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16992x127e9e90.EditItem editItem = i1Var2.f257159k;
            if (i27 == 1) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(b1Var3, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.ImageSource");
                editItem.f37770x368f3a = 1;
                j17 = 4000;
                b1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.o0) b1Var3;
            } else if (i27 != i17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaModel", "unknown track type:" + i1Var2.f257150b);
                j17 = 0L;
                b1Var = b1Var3;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(b1Var3, "null cannot be cast to non-null type com.tencent.mm.plugin.vlog.model.VideoSource");
                com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.q1 q1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.q1) b1Var3;
                editItem.f37770x368f3a = i17;
                j17 = q1Var.f257248f;
                b1Var = q1Var;
            }
            i1Var2.d(0L);
            i1Var2.c(j17);
            editItem.f37767xaa09dada = j17;
            editItem.f37769x2a5f0245 = j17;
            int i28 = b1Var.f257101a;
            android.graphics.Rect rect = this.f480236h;
            int i29 = b1Var.f257102b;
            rect.set(0, 0, i28, i29);
            int i37 = b1Var.f257101a;
            if (i37 > 1080 || i29 > 1280) {
                float f17 = i37;
                float f18 = i29;
                float max = java.lang.Math.max((f17 * 1.0f) / 1080, (1.0f * f18) / 1280);
                i1Var2.f257154f = (int) (f17 / max);
                i1Var2.f257155g = (int) (f18 / max);
                i1Var2.f257156h = max;
            } else {
                i1Var2.f257154f = i37;
                i1Var2.f257155g = i29;
            }
            arrayList2 = arrayList3;
            i18 = i19;
            i17 = 2;
        }
        java.util.ArrayList arrayList4 = arrayList2;
        rm5.i iVar = rm5.j.f479031v;
        java.util.ArrayList arrayList5 = new java.util.ArrayList(kz5.d0.q(V, 10));
        java.util.Iterator it7 = arrayList4.iterator();
        while (it7.hasNext()) {
            arrayList5.add(((com.p314xaae8f345.mm.p1006xc5476f33.p2324x37470e.p2325x633fb29.i1) it7.next()).f257160l);
        }
        iVar.a(arrayList5);
        linkedList3.addAll(V);
    }
}
