package c66;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final c66.q f121026a = new c66.q();

    /* renamed from: b, reason: collision with root package name */
    public static final int f121027b = 86400 * 3;

    /* renamed from: c, reason: collision with root package name */
    public static final int f121028c = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a.y() * 86400;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f121029d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f121030e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f121031f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f121032g;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f121033h;

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f121034i;

    /* renamed from: j, reason: collision with root package name */
    public static final jz5.g f121035j;

    /* renamed from: k, reason: collision with root package name */
    public static final jz5.g f121036k;

    /* renamed from: l, reason: collision with root package name */
    public static final jz5.g f121037l;

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f121038m;

    /* renamed from: n, reason: collision with root package name */
    public static final jz5.g f121039n;

    /* renamed from: o, reason: collision with root package name */
    public static final jz5.g f121040o;

    /* renamed from: p, reason: collision with root package name */
    public static final jz5.g f121041p;

    static {
        new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper()).mo50297x7c4d7ca2(c66.a.f121013d, com.p314xaae8f345.tav.p2959x5befac44.C25764x27f5008f.f48024x857b539d);
        f121029d = "finderLocalBackupFeedInfoTable";
        f121030e = "finderDataItemTableName";
        f121031f = "findTabRedDotKaraInfoTable";
        f121032g = jz5.h.b(c66.f.f121015d);
        f121033h = jz5.h.b(c66.o.f121024d);
        f121034i = jz5.h.b(c66.b.f121014d);
        f121035j = jz5.h.b(c66.g.f121016d);
        f121036k = jz5.h.b(c66.k.f121020d);
        f121037l = jz5.h.b(c66.p.f121025d);
        f121038m = jz5.h.b(c66.i.f121018d);
        f121039n = jz5.h.b(c66.h.f121017d);
        f121040o = jz5.h.b(c66.j.f121019d);
        f121041p = jz5.h.b(c66.l.f121021d);
    }

    public static final com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b a(c66.q qVar) {
        qVar.getClass();
        return (com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b) ((jz5.n) f121032g).mo141623x754a37bb();
    }

    public final java.util.ArrayList b(java.util.List list, kk.l lVar, yz5.l lVar2) {
        java.util.HashMap hashMap = new java.util.HashMap();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.Object obj : list) {
            java.lang.Object obj2 = lVar.get(obj);
            if (obj2 != null) {
                hashMap.put(obj, obj2);
            } else {
                arrayList.add(obj);
            }
        }
        java.util.List<android.util.Pair> list2 = (java.util.List) lVar2.mo146xb9724478(arrayList);
        if (list2 != null) {
            for (android.util.Pair pair : list2) {
                lVar.put(pair.first, pair.second);
                hashMap.put(pair.first, pair.second);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            java.lang.Object obj3 = hashMap.get(it.next());
            if (obj3 != null) {
                arrayList2.add(obj3);
            }
        }
        return arrayList2;
    }

    public final java.util.concurrent.CopyOnWriteArrayList c() {
        return (java.util.concurrent.CopyOnWriteArrayList) ((jz5.n) f121039n).mo141623x754a37bb();
    }

    public final com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae d() {
        return (com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) ((jz5.n) f121033h).mo141623x754a37bb();
    }

    public final boolean e(java.util.List feedList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedList, "feedList");
        if (feedList.isEmpty()) {
            return false;
        }
        try {
            ((com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26924x4cd4bae) ((jz5.n) f121035j).mo141623x754a37bb()).m107160x184bd5c(feedList);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.WCFinderWCDB", "updateFinderFeedList success, feedList = " + feedList);
            java.util.Iterator it = feedList.iterator();
            while (it.hasNext()) {
                ni0.i iVar = (ni0.i) it.next();
                ((kk.l) ((jz5.n) f121036k).mo141623x754a37bb()).put(iVar.f418764a, iVar);
            }
            return true;
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("Finder.WCFinderWCDB", "updateFinderFeedList fail, feedList = " + feedList);
            return false;
        }
    }
}
