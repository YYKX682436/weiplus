package b5;

/* loaded from: classes13.dex */
public class h extends a5.p0 {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f17870i = a5.a0.e("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    public final b5.w f17871a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f17872b;

    /* renamed from: c, reason: collision with root package name */
    public final a5.n f17873c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f17874d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f17875e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f17876f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17877g;

    /* renamed from: h, reason: collision with root package name */
    public a5.j0 f17878h;

    public h(b5.w wVar, java.lang.String str, a5.n nVar, java.util.List list) {
        this(wVar, str, nVar, list, null);
    }

    public static boolean b(b5.h hVar, java.util.Set set) {
        set.addAll(hVar.f17875e);
        java.util.Set c17 = c(hVar);
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((java.util.HashSet) c17).contains((java.lang.String) it.next())) {
                return true;
            }
        }
        set.removeAll(hVar.f17875e);
        return false;
    }

    public static java.util.Set c(b5.h hVar) {
        java.util.HashSet hashSet = new java.util.HashSet();
        hVar.getClass();
        return hashSet;
    }

    public a5.j0 a() {
        if (this.f17877g) {
            a5.a0.c().f(f17870i, java.lang.String.format("Already enqueued work ids (%s)", android.text.TextUtils.join(", ", this.f17875e)), new java.lang.Throwable[0]);
        } else {
            k5.e eVar = new k5.e(this);
            ((m5.c) this.f17871a.f17898d).a(eVar);
            this.f17878h = eVar.f304125e;
        }
        return this.f17878h;
    }

    public h(b5.w wVar, java.lang.String str, a5.n nVar, java.util.List list, java.util.List list2) {
        this.f17871a = wVar;
        this.f17872b = str;
        this.f17873c = nVar;
        this.f17874d = list;
        this.f17875e = new java.util.ArrayList(list.size());
        this.f17876f = new java.util.ArrayList();
        if (list2 != null) {
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                b5.h hVar = (b5.h) it.next();
                ((java.util.ArrayList) this.f17876f).addAll(hVar.f17876f);
            }
        }
        for (int i17 = 0; i17 < list.size(); i17++) {
            java.lang.String uuid = ((a5.t0) list.get(i17)).f1433a.toString();
            ((java.util.ArrayList) this.f17875e).add(uuid);
            ((java.util.ArrayList) this.f17876f).add(uuid);
        }
    }
}
