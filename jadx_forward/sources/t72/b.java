package t72;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final t72.b f497573a = new t72.b();

    /* renamed from: b, reason: collision with root package name */
    public static final l75.k0 f497574b;

    static {
        f497574b = c82.e.d() ? c82.e.f121201a.c() : c82.e.f121201a.a();
    }

    public final int a(t72.a favTagInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(favTagInfo, "favTagInfo");
        o75.c cVar = new o75.c(o75.b.f425117e, java.lang.String.valueOf(favTagInfo.mo9766x4c6b483e()), "MicroMsg.SDK.BaseFavTagInfo");
        cVar.f425123d = favTagInfo;
        int a17 = new m75.b(favTagInfo, cVar, dm.q3.f320925q, "MicroMsg.SDK.BaseFavTagInfo").a(f497574b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTagStorage", "[delete] result = " + a17 + ", id = " + favTagInfo.f68043xc8a07680 + ", name = " + favTagInfo.f68044x225f1eb0);
        return a17;
    }

    public final long b(t72.a favTagInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(favTagInfo, "favTagInfo");
        o75.c cVar = new o75.c(o75.b.f425115c, java.lang.String.valueOf(favTagInfo.mo9766x4c6b483e()), "MicroMsg.SDK.BaseFavTagInfo");
        cVar.f425123d = favTagInfo;
        long a17 = new m75.c(favTagInfo, true, cVar, dm.q3.f320925q, "MicroMsg.SDK.BaseFavTagInfo").a(f497574b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTagStorage", "[insert] result = " + a17 + ", id = " + favTagInfo.f68043xc8a07680 + ", name = " + favTagInfo.f68044x225f1eb0);
        return a17;
    }

    public final java.util.List c() {
        p75.n0 n0Var = dm.q3.f320917f;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        p75.i0 g17 = dm.q3.f320917f.g(linkedList);
        g17.f434190d = null;
        g17.d(linkedList2);
        g17.b(linkedList3);
        p75.l0 a17 = g17.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTagStorage", "[queryAll] sql = " + a17);
        return a17.k(f497574b, t72.a.class);
    }

    public final java.util.ArrayList d() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        p75.n0 n0Var = dm.q3.f320917f;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        p75.i0 g17 = dm.q3.f320917f.g(linkedList);
        g17.f434190d = null;
        g17.d(linkedList2);
        g17.b(linkedList3);
        p75.l0 a17 = g17.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTagStorage", "[queryAll] sql = " + a17);
        java.util.Iterator it = ((java.util.ArrayList) a17.k(f497574b, t72.a.class)).iterator();
        while (it.hasNext()) {
            t72.a aVar = (t72.a) it.next();
            arrayList.add(aVar.f68044x225f1eb0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTagStorage", "[queryAll] tag id = " + aVar.f68043xc8a07680 + ", tag name = " + aVar.f68044x225f1eb0);
        }
        return arrayList;
    }

    public final t72.a e(int i17) {
        p75.n0 n0Var = dm.q3.f320917f;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        p75.m0 i18 = dm.q3.f320918g.i(java.lang.Integer.valueOf(i17));
        p75.i0 g17 = dm.q3.f320917f.g(linkedList);
        g17.f434190d = i18;
        g17.d(linkedList2);
        g17.b(linkedList3);
        p75.l0 a17 = g17.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTagStorage", "[queryById] sql = " + a17 + ", id = " + i17);
        return (t72.a) a17.o(f497574b, t72.a.class);
    }

    public final t72.a f(java.lang.String name) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p75.n0 n0Var = dm.q3.f320917f;
        java.util.LinkedList linkedList = new java.util.LinkedList();
        java.util.LinkedList linkedList2 = new java.util.LinkedList();
        java.util.LinkedList linkedList3 = new java.util.LinkedList();
        p75.m0 j17 = dm.q3.f320919h.j(name);
        p75.i0 g17 = dm.q3.f320917f.g(linkedList);
        g17.f434190d = j17;
        g17.d(linkedList2);
        g17.b(linkedList3);
        p75.l0 a17 = g17.a();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTagStorage", "[queryByName] sql = " + a17 + ", name = " + name);
        return (t72.a) a17.o(f497574b, t72.a.class);
    }

    public final int g(t72.a favTagInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(favTagInfo, "favTagInfo");
        o75.c cVar = new o75.c(o75.b.f425116d, java.lang.String.valueOf(favTagInfo.mo9766x4c6b483e()), "MicroMsg.SDK.BaseFavTagInfo");
        cVar.f425123d = favTagInfo;
        int a17 = new m75.e(favTagInfo, cVar, dm.q3.f320925q, "MicroMsg.SDK.BaseFavTagInfo").a(f497574b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavTagStorage", "[update] result = " + a17 + ", id = " + favTagInfo.f68043xc8a07680 + ", name = " + favTagInfo.f68044x225f1eb0);
        return a17;
    }
}
