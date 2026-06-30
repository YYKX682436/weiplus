package com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e;

/* loaded from: classes12.dex */
public final class e extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public java.util.HashSet f219035n;

    /* renamed from: o, reason: collision with root package name */
    public int f219036o;

    /* renamed from: p, reason: collision with root package name */
    public int f219037p;

    /* renamed from: q, reason: collision with root package name */
    public int f219038q;

    /* renamed from: r, reason: collision with root package name */
    public int f219039r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.k f219040s;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.k kVar) {
        this.f219040s = kVar;
    }

    @Override // p13.c
    /* renamed from: getName */
    public java.lang.String mo9544xfb82e301() {
        return "BuildChatroomMemberIndexTask";
    }

    @Override // p13.c
    public boolean i() {
        w13.a aVar;
        w13.a aVar2;
        o13.t tVar;
        if (this.f219035n == null) {
            this.f219035n = new java.util.HashSet();
            p75.i0 g17 = p13.a.f432593a.g(kz5.b0.c(p13.a.f432594b));
            g17.f434189c = "MicroMsg.FTS.FTS5SearchChatroomMemberLogic";
            p75.l0 a17 = g17.a();
            w13.a aVar3 = this.f219040s.f219110g;
            if (aVar3 != null && (tVar = aVar3.f423731f) != null) {
                android.database.Cursor o17 = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) tVar).o(a17.f434169a, a17.f434170b);
                while (true) {
                    try {
                        android.database.CursorWrapper cursorWrapper = (android.database.CursorWrapper) o17;
                        if (!cursorWrapper.moveToNext()) {
                            break;
                        }
                        java.util.HashSet hashSet = this.f219035n;
                        if (hashSet != null) {
                            hashSet.add(cursorWrapper.getString(0));
                        }
                    } finally {
                    }
                }
                vz5.b.a(o17, null);
            }
            java.util.HashSet hashSet2 = this.f219035n;
            this.f219037p = hashSet2 != null ? hashSet2.size() : 0;
        }
        o("getBuildChatroomSet");
        while (!java.lang.Thread.interrupted()) {
            p75.i0 g18 = dm.x1.N.g(kz5.c0.i(dm.x1.Q, dm.x1.R, dm.x1.T));
            g18.f434189c = "MicroMsg.FTS.FTS5SearchChatroomMemberLogic";
            g18.c(50, this.f219036o);
            g18.f434192f = kz5.b0.c(dm.x1.P.v());
            p75.l0 a18 = g18.a();
            java.util.ArrayList arrayList = new java.util.ArrayList(50);
            java.util.List k17 = a18.k(gm0.j1.u().f354686f, com.p314xaae8f345.mm.p2621x8fb0427b.a3.class);
            com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.k kVar = this.f219040s;
            java.util.Iterator it = ((java.util.ArrayList) k17).iterator();
            while (it.hasNext()) {
                com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = (com.p314xaae8f345.mm.p2621x8fb0427b.a3) it.next();
                if (!kVar.k(a3Var)) {
                    arrayList.add(a3Var);
                }
            }
            if (arrayList.isEmpty()) {
                o("buildChatroomMemberIndex");
                java.util.HashSet hashSet3 = this.f219035n;
                if (hashSet3 != null) {
                    java.util.HashSet<java.lang.String> hashSet4 = hashSet3.isEmpty() ^ true ? hashSet3 : null;
                    if (hashSet4 != null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.k kVar2 = this.f219040s;
                        for (java.lang.String str : hashSet4) {
                            this.f219039r++;
                            w13.a aVar4 = kVar2.f219110g;
                            if (aVar4 != null) {
                                aVar4.m0(new int[]{2097168}, str);
                            }
                        }
                    }
                }
                o("deleteUnuseChatroom");
                return true;
            }
            this.f219036o += 50;
            w13.a aVar5 = this.f219040s.f219110g;
            if (!(aVar5 != null && ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) aVar5.f423731f).m()) && (aVar2 = this.f219040s.f219110g) != null) {
                aVar2.h();
            }
            java.util.Iterator it6 = arrayList.iterator();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(it6, "iterator(...)");
            while (it6.hasNext()) {
                java.lang.Object next = it6.next();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(next, "next(...)");
                com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var2 = (com.p314xaae8f345.mm.p2621x8fb0427b.a3) next;
                java.util.HashSet hashSet5 = this.f219035n;
                if (hashSet5 != null && hashSet5.remove(a3Var2.f69088x37548063)) {
                    it6.remove();
                } else {
                    this.f219038q++;
                    com.p314xaae8f345.mm.p1006xc5476f33.fts.p1714x625ef5e.k.j(this.f219040s, a3Var2);
                }
            }
            w13.a aVar6 = this.f219040s.f219110g;
            if ((aVar6 != null && ((com.p314xaae8f345.mm.p1006xc5476f33.fts.o) aVar6.f423731f).m()) && (aVar = this.f219040s.f219110g) != null) {
                aVar.j();
            }
        }
        throw new java.lang.InterruptedException();
    }

    @Override // p13.c
    public java.lang.String j() {
        java.lang.String format = java.lang.String.format("{build: " + this.f219037p + " new: " + this.f219038q + ", remove: " + this.f219039r, java.util.Arrays.copyOf(new java.lang.Object[0], 0));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        return format;
    }
}
