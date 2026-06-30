package c66;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public static final c66.q f39493a = new c66.q();

    /* renamed from: b, reason: collision with root package name */
    public static final int f39494b = 86400 * 3;

    /* renamed from: c, reason: collision with root package name */
    public static final int f39495c = com.tencent.mm.plugin.finder.storage.aj0.f126440a.y() * 86400;

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f39496d;

    /* renamed from: e, reason: collision with root package name */
    public static final java.lang.String f39497e;

    /* renamed from: f, reason: collision with root package name */
    public static final java.lang.String f39498f;

    /* renamed from: g, reason: collision with root package name */
    public static final jz5.g f39499g;

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f39500h;

    /* renamed from: i, reason: collision with root package name */
    public static final jz5.g f39501i;

    /* renamed from: j, reason: collision with root package name */
    public static final jz5.g f39502j;

    /* renamed from: k, reason: collision with root package name */
    public static final jz5.g f39503k;

    /* renamed from: l, reason: collision with root package name */
    public static final jz5.g f39504l;

    /* renamed from: m, reason: collision with root package name */
    public static final jz5.g f39505m;

    /* renamed from: n, reason: collision with root package name */
    public static final jz5.g f39506n;

    /* renamed from: o, reason: collision with root package name */
    public static final jz5.g f39507o;

    /* renamed from: p, reason: collision with root package name */
    public static final jz5.g f39508p;

    static {
        new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper()).postDelayed(c66.a.f39480d, com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
        f39496d = "finderLocalBackupFeedInfoTable";
        f39497e = "finderDataItemTableName";
        f39498f = "findTabRedDotKaraInfoTable";
        f39499g = jz5.h.b(c66.f.f39482d);
        f39500h = jz5.h.b(c66.o.f39491d);
        f39501i = jz5.h.b(c66.b.f39481d);
        f39502j = jz5.h.b(c66.g.f39483d);
        f39503k = jz5.h.b(c66.k.f39487d);
        f39504l = jz5.h.b(c66.p.f39492d);
        f39505m = jz5.h.b(c66.i.f39485d);
        f39506n = jz5.h.b(c66.h.f39484d);
        f39507o = jz5.h.b(c66.j.f39486d);
        f39508p = jz5.h.b(c66.l.f39488d);
    }

    public static final com.tencent.wcdb.core.Database a(c66.q qVar) {
        qVar.getClass();
        return (com.tencent.wcdb.core.Database) ((jz5.n) f39499g).getValue();
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
        java.util.List<android.util.Pair> list2 = (java.util.List) lVar2.invoke(arrayList);
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
        return (java.util.concurrent.CopyOnWriteArrayList) ((jz5.n) f39506n).getValue();
    }

    public final com.tencent.wcdb.core.Table d() {
        return (com.tencent.wcdb.core.Table) ((jz5.n) f39500h).getValue();
    }

    public final boolean e(java.util.List feedList) {
        kotlin.jvm.internal.o.g(feedList, "feedList");
        if (feedList.isEmpty()) {
            return false;
        }
        try {
            ((com.tencent.wcdb.core.Table) ((jz5.n) f39502j).getValue()).insertOrReplaceObjects(feedList);
            com.tencent.mars.xlog.Log.i("Finder.WCFinderWCDB", "updateFinderFeedList success, feedList = " + feedList);
            java.util.Iterator it = feedList.iterator();
            while (it.hasNext()) {
                ni0.i iVar = (ni0.i) it.next();
                ((kk.l) ((jz5.n) f39503k).getValue()).put(iVar.f337231a, iVar);
            }
            return true;
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.w("Finder.WCFinderWCDB", "updateFinderFeedList fail, feedList = " + feedList);
            return false;
        }
    }
}
