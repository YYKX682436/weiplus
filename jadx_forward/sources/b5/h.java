package b5;

/* loaded from: classes13.dex */
public class h extends a5.p0 {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String f99403i = a5.a0.e("WorkContinuationImpl");

    /* renamed from: a, reason: collision with root package name */
    public final b5.w f99404a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f99405b;

    /* renamed from: c, reason: collision with root package name */
    public final a5.n f99406c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f99407d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f99408e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f99409f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f99410g;

    /* renamed from: h, reason: collision with root package name */
    public a5.j0 f99411h;

    public h(b5.w wVar, java.lang.String str, a5.n nVar, java.util.List list) {
        this(wVar, str, nVar, list, null);
    }

    public static boolean b(b5.h hVar, java.util.Set set) {
        set.addAll(hVar.f99408e);
        java.util.Set c17 = c(hVar);
        java.util.Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((java.util.HashSet) c17).contains((java.lang.String) it.next())) {
                return true;
            }
        }
        set.removeAll(hVar.f99408e);
        return false;
    }

    public static java.util.Set c(b5.h hVar) {
        java.util.HashSet hashSet = new java.util.HashSet();
        hVar.getClass();
        return hashSet;
    }

    public a5.j0 a() {
        if (this.f99410g) {
            a5.a0.c().f(f99403i, java.lang.String.format("Already enqueued work ids (%s)", android.text.TextUtils.join(", ", this.f99408e)), new java.lang.Throwable[0]);
        } else {
            k5.e eVar = new k5.e(this);
            ((m5.c) this.f99404a.f99431d).a(eVar);
            this.f99411h = eVar.f385658e;
        }
        return this.f99411h;
    }

    public h(b5.w wVar, java.lang.String str, a5.n nVar, java.util.List list, java.util.List list2) {
        this.f99404a = wVar;
        this.f99405b = str;
        this.f99406c = nVar;
        this.f99407d = list;
        this.f99408e = new java.util.ArrayList(list.size());
        this.f99409f = new java.util.ArrayList();
        if (list2 != null) {
            java.util.Iterator it = list2.iterator();
            while (it.hasNext()) {
                b5.h hVar = (b5.h) it.next();
                ((java.util.ArrayList) this.f99409f).addAll(hVar.f99409f);
            }
        }
        for (int i17 = 0; i17 < list.size(); i17++) {
            java.lang.String uuid = ((a5.t0) list.get(i17)).f82966a.toString();
            ((java.util.ArrayList) this.f99408e).add(uuid);
            ((java.util.ArrayList) this.f99409f).add(uuid);
        }
    }
}
