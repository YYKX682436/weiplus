package nf4;

/* loaded from: classes4.dex */
public final class g extends l75.n0 implements l75.q0 {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f418378i = {l75.n0.m145250x3fdc6f77(nf4.f.W, "StoryExtItem")};

    /* renamed from: m, reason: collision with root package name */
    public static final java.lang.String f418379m = "select *, rowid from StoryExtItem ";

    /* renamed from: n, reason: collision with root package name */
    public static final java.lang.String f418380n = "select * from StoryExtItem";

    /* renamed from: d, reason: collision with root package name */
    public final l75.k0 f418381d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.ArrayList f418382e;

    /* renamed from: f, reason: collision with root package name */
    public final jt0.j f418383f;

    /* renamed from: g, reason: collision with root package name */
    public final jt0.j f418384g;

    /* renamed from: h, reason: collision with root package name */
    public final l75.k0 f418385h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(l75.k0 vdb) {
        super(vdb, nf4.f.W, "StoryExtItem", dm.db.f317978z);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(vdb, "vdb");
        l75.e0 e0Var = nf4.f.W;
        this.f418381d = vdb;
        this.f418382e = new java.util.ArrayList();
        this.f418383f = new jt0.j(1000);
        this.f418384g = new jt0.j(1000);
        this.f418385h = vdb;
    }

    public final java.util.List D0() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = this.f418385h.f(f418379m, null, 2);
        f17.moveToFirst();
        do {
            nf4.f fVar = new nf4.f();
            fVar.mo9015xbf5d97fd(f17);
            arrayList.add(fVar);
        } while (f17.moveToNext());
        f17.close();
        return arrayList;
    }

    public final nf4.f J0(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        if (username.length() == 0) {
            return null;
        }
        nf4.f fVar = (nf4.f) this.f418383f.get(username);
        if (fVar != null) {
            return fVar;
        }
        nf4.f fVar2 = (nf4.f) this.f418384g.get(username);
        if (fVar2 != null) {
            return fVar2;
        }
        nf4.f L0 = L0(username);
        f1(L0);
        return L0;
    }

    public final nf4.f L0(java.lang.String str) {
        nf4.f fVar = new nf4.f();
        fVar.f66297xdde069b = str;
        super.get(fVar, m145254xa242f8f3());
        return fVar;
    }

    public final nf4.f P0(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        nf4.f fVar = (nf4.f) this.f418384g.get(username);
        if (fVar != null) {
            return fVar;
        }
        nf4.f L0 = L0(username);
        f1(L0);
        return L0;
    }

    public final int W0(java.lang.String userName, java.lang.String md52) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(md52, "md5");
        nf4.f L0 = L0(userName);
        L0.f66284x4b6e68b9 = md52;
        super.mo11260x413cb2b4(L0);
        return 0;
    }

    public final boolean b1(nf4.f info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        f1(info);
        return super.mo11260x413cb2b4(info);
    }

    public final int d1(long j17, nf4.f extinfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extinfo, "extinfo");
        android.content.ContentValues mo9763xeb27878e = extinfo.mo9763xeb27878e();
        mo9763xeb27878e.remove("rowid");
        f1(extinfo);
        return this.f418385h.p("StoryExtItem", mo9763xeb27878e, "rowid=?", new java.lang.String[]{"" + j17});
    }

    public final void f1(nf4.f fVar) {
        if (fVar != null) {
            if (fVar.m149511x6bf53a6c().length() == 0) {
                return;
            }
            boolean h17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().h(fVar.m149511x6bf53a6c());
            jt0.j jVar = this.f418384g;
            jt0.j jVar2 = this.f418383f;
            if (h17) {
                jVar2.put(fVar.m149511x6bf53a6c(), fVar);
                jVar.mo141381xc84af884(fVar.m149511x6bf53a6c());
            } else {
                jVar2.mo141381xc84af884(fVar.m149511x6bf53a6c());
                jVar.put(fVar.m149511x6bf53a6c(), fVar);
            }
        }
    }

    @Override // l75.q0
    /* renamed from: onNotifyChange */
    public void mo735xb0dfc7d8(java.lang.String str, l75.w0 w0Var) {
        if (str == null || w0Var == null) {
            return;
        }
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "notify_story_read");
        java.util.ArrayList arrayList = this.f418382e;
        ef4.h hVar = ef4.h.f333977d;
        if (b17) {
            java.lang.Object obj = w0Var.f398509d;
            if (obj instanceof nf4.f) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryExtInfo");
                ((nf4.f) obj).m149511x6bf53a6c();
                java.util.Iterator it = arrayList.iterator();
                if (it.hasNext()) {
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it.next());
                    throw null;
                }
                java.util.List list = ef4.i.f333979a;
                s75.d.b(hVar, "FavourUserChecker_StoryStateChecker");
                return;
            }
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "notify_story_unread")) {
            java.lang.Object obj2 = w0Var.f398509d;
            if (obj2 instanceof nf4.f) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryExtInfo");
                ((nf4.f) obj2).m149511x6bf53a6c();
                java.util.Iterator it6 = arrayList.iterator();
                if (it6.hasNext()) {
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it6.next());
                    throw null;
                }
                java.util.List list2 = ef4.i.f333979a;
                s75.d.b(hVar, "FavourUserChecker_StoryStateChecker");
                return;
            }
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "notify_story_invalid")) {
            java.lang.Object obj3 = w0Var.f398509d;
            if (obj3 instanceof nf4.f) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryExtInfo");
                ((nf4.f) obj3).m149511x6bf53a6c();
                java.util.Iterator it7 = arrayList.iterator();
                if (it7.hasNext()) {
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it7.next());
                    throw null;
                }
                java.util.List list3 = ef4.i.f333979a;
                s75.d.b(hVar, "FavourUserChecker_StoryStateChecker");
                return;
            }
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, "notify_story_valid")) {
            java.lang.Object obj4 = w0Var.f398509d;
            if (obj4 instanceof nf4.f) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj4, "null cannot be cast to non-null type com.tencent.mm.plugin.story.storage.StoryExtInfo");
                ((nf4.f) obj4).m149511x6bf53a6c();
                java.util.Iterator it8 = arrayList.iterator();
                if (it8.hasNext()) {
                    p001xcca8366f.p003x91727fcf.v4.p009x62f6fe4.f.a(it8.next());
                    throw null;
                }
                java.util.List list4 = ef4.i.f333979a;
                s75.d.b(hVar, "FavourUserChecker_StoryStateChecker");
            }
        }
    }

    @Override // l75.n0
    /* renamed from: replace */
    public boolean mo11260x413cb2b4(l75.f0 f0Var) {
        nf4.f item = (nf4.f) f0Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        boolean mo11260x413cb2b4 = super.mo11260x413cb2b4(item);
        f1(item);
        return mo11260x413cb2b4;
    }

    public final nf4.f y0(java.lang.String userName) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        nf4.f J0 = J0(userName);
        return J0 != null ? J0 : L0(userName);
    }

    public final java.util.List z0() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        android.database.Cursor f17 = this.f418385h.f(f418380n, null, 2);
        f17.moveToFirst();
        do {
            nf4.f fVar = new nf4.f();
            fVar.mo9015xbf5d97fd(f17);
            arrayList.add(fVar);
        } while (f17.moveToNext());
        f17.close();
        return arrayList;
    }
}
