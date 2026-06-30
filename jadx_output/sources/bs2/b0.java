package bs2;

/* loaded from: classes2.dex */
public final class b0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f23805a;

    /* renamed from: b, reason: collision with root package name */
    public db2.c3 f23806b;

    /* renamed from: c, reason: collision with root package name */
    public bs2.h0 f23807c;

    /* renamed from: d, reason: collision with root package name */
    public bs2.f0 f23808d;

    /* renamed from: f, reason: collision with root package name */
    public long f23810f;

    /* renamed from: g, reason: collision with root package name */
    public long f23811g;

    /* renamed from: h, reason: collision with root package name */
    public long f23812h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f23813i;

    /* renamed from: j, reason: collision with root package name */
    public int f23814j;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ bs2.n1 f23816l;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.LinkedList f23809e = new java.util.LinkedList();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f23815k = new java.util.concurrent.ConcurrentHashMap();

    public b0(bs2.n1 n1Var, int i17) {
        this.f23816l = n1Var;
        this.f23805a = i17;
        r45.gt2 b17 = b();
        java.util.LinkedList list = b17.getList(0);
        kotlin.jvm.internal.o.f(list, "getCaches(...)");
        java.util.ArrayList<r45.ft2> arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((r45.ft2) next).getInteger(0) == this.f23805a) {
                arrayList.add(next);
            }
        }
        for (r45.ft2 ft2Var : arrayList) {
            this.f23815k.put(java.lang.Integer.valueOf(ft2Var.getInteger(2)), new bs2.c0(ft2Var.getLong(1)));
        }
        a(b17, "build");
        c(gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_PRELOAD_FAIL_RETRY_CNT_INT_SYNC, 0));
        com.tencent.mars.xlog.Log.i(this.f23816l.f23909c, "init: cache, cgiFailRetryCnt=" + this.f23814j);
    }

    public final void a(r45.gt2 gt2Var, java.lang.String tag) {
        kotlin.jvm.internal.o.g(gt2Var, "<this>");
        kotlin.jvm.internal.o.g(tag, "tag");
        java.lang.String str = this.f23816l.f23909c;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[FinderRefreshPreloadCacheList#print] tag=");
        sb6.append(tag);
        sb6.append(' ');
        java.util.LinkedList list = gt2Var.getList(0);
        kotlin.jvm.internal.o.f(list, "getCaches(...)");
        java.util.ArrayList<r45.ft2> arrayList = new java.util.ArrayList();
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((r45.ft2) next).getInteger(0) == this.f23805a) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        for (r45.ft2 ft2Var : arrayList) {
            arrayList2.add(ft2Var.getInteger(0) + ':' + ft2Var.getInteger(2) + "=>" + ft2Var.getLong(1));
        }
        sb6.append(arrayList2);
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
    }

    public final r45.gt2 b() {
        r45.gt2 gt2Var = new r45.gt2();
        java.lang.Object m17 = gm0.j1.u().c().m(com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_PRELOAD_REFRESH_CACHE_STRING, "");
        kotlin.jvm.internal.o.e(m17, "null cannot be cast to non-null type kotlin.String");
        java.lang.String str = (java.lang.String) m17;
        if (str.length() > 0) {
            try {
                gt2Var.parseFrom(com.tencent.mm.sdk.platformtools.t8.h(str));
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace(this.f23816l.f23909c, e17, "", new java.lang.Object[0]);
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_PRELOAD_REFRESH_CACHE_STRING, null);
            }
        }
        return gt2Var;
    }

    public final void c(int i17) {
        if (this.f23814j != i17) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_FINDER_TIMELINE_PRELOAD_FAIL_RETRY_CNT_INT_SYNC, java.lang.Integer.valueOf(i17));
        }
        this.f23814j = i17;
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[");
        sb6.append(this.f23807c);
        sb6.append(", resp=");
        db2.c3 c3Var = this.f23806b;
        sb6.append(c3Var != null ? java.lang.Integer.valueOf(c3Var.hashCode()) : null);
        sb6.append(", lastTime=");
        sb6.append(this.f23810f);
        sb6.append(", lastRedDotPreloadTime=");
        sb6.append(this.f23811g);
        sb6.append(", overCount=");
        sb6.append(this.f23812h);
        sb6.append(", recycledList=");
        java.util.LinkedList linkedList = this.f23809e;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList.add(pm0.v.u(((com.tencent.mm.protocal.protobuf.FinderObject) it.next()).getId()));
        }
        sb6.append(arrayList);
        sb6.append(']');
        return sb6.toString();
    }
}
