package bk4;

/* loaded from: classes11.dex */
public final class d {

    /* renamed from: k, reason: collision with root package name */
    public static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f102968k;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f102969l;

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf f102974a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 f102975b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashSet f102976c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f102977d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f102978e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2495xc50a8b8b.g f102979f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f102980g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f102981h;

    /* renamed from: i, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p944x882e457a.u0 f102982i;

    /* renamed from: j, reason: collision with root package name */
    public static final bk4.b f102967j = new bk4.b(null);

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.ArrayList f102970m = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.HashMap f102971n = new java.util.HashMap();

    /* renamed from: o, reason: collision with root package name */
    public static long f102972o = -1;

    /* renamed from: p, reason: collision with root package name */
    public static long f102973p = -1;

    public d(com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf adapter, com.p314xaae8f345.mm.p2776x373aa5.C22801x87cbdc00 refreahLayout, android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(refreahLayout, "refreahLayout");
        this.f102974a = adapter;
        this.f102975b = refreahLayout;
        this.f102976c = new java.util.HashSet();
        this.f102977d = new java.util.HashMap();
        this.f102980g = true;
        bk4.c cVar = new bk4.c(context, this);
        this.f102982i = cVar;
        gm0.j1.d().a(4245, cVar);
    }

    public static final void a(bk4.d dVar, java.util.List list) {
        dVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = f102971n;
        int size = hashMap.size();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                pj4.n1 n1Var = (pj4.n1) it.next();
                hashMap.put(java.lang.Long.valueOf(n1Var.f436738m), n1Var);
                arrayList.add(java.lang.String.valueOf(n1Var.f436738m));
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("putCacheMap: old=");
        sb6.append(size);
        sb6.append(", histories size=");
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        sb6.append(", keyList=");
        sb6.append(arrayList);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatus.HistoryItemLoader", sb6.toString());
    }

    public final void b() {
        if (!this.f102980g || this.f102981h) {
            return;
        }
        this.f102981h = true;
        gm0.j1.d().g(new ej4.f(this.f102979f, 2L, 0L, 200L, null, 16, null));
    }
}
