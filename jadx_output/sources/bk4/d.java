package bk4;

/* loaded from: classes11.dex */
public final class d {

    /* renamed from: k, reason: collision with root package name */
    public static com.tencent.mm.ui.widget.dialog.u3 f21435k;

    /* renamed from: l, reason: collision with root package name */
    public static boolean f21436l;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.view.recyclerview.WxRecyclerAdapter f21441a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.view.RefreshLoadMoreLayout f21442b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashSet f21443c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f21444d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f21445e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.protobuf.g f21446f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f21447g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f21448h;

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.modelbase.u0 f21449i;

    /* renamed from: j, reason: collision with root package name */
    public static final bk4.b f21434j = new bk4.b(null);

    /* renamed from: m, reason: collision with root package name */
    public static final java.util.ArrayList f21437m = new java.util.ArrayList();

    /* renamed from: n, reason: collision with root package name */
    public static final java.util.HashMap f21438n = new java.util.HashMap();

    /* renamed from: o, reason: collision with root package name */
    public static long f21439o = -1;

    /* renamed from: p, reason: collision with root package name */
    public static long f21440p = -1;

    public d(com.tencent.mm.view.recyclerview.WxRecyclerAdapter adapter, com.tencent.mm.view.RefreshLoadMoreLayout refreahLayout, android.content.Context context) {
        kotlin.jvm.internal.o.g(adapter, "adapter");
        kotlin.jvm.internal.o.g(refreahLayout, "refreahLayout");
        this.f21441a = adapter;
        this.f21442b = refreahLayout;
        this.f21443c = new java.util.HashSet();
        this.f21444d = new java.util.HashMap();
        this.f21447g = true;
        bk4.c cVar = new bk4.c(context, this);
        this.f21449i = cVar;
        gm0.j1.d().a(4245, cVar);
    }

    public static final void a(bk4.d dVar, java.util.List list) {
        dVar.getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.HashMap hashMap = f21438n;
        int size = hashMap.size();
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                pj4.n1 n1Var = (pj4.n1) it.next();
                hashMap.put(java.lang.Long.valueOf(n1Var.f355205m), n1Var);
                arrayList.add(java.lang.String.valueOf(n1Var.f355205m));
            }
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("putCacheMap: old=");
        sb6.append(size);
        sb6.append(", histories size=");
        sb6.append(list != null ? java.lang.Integer.valueOf(list.size()) : null);
        sb6.append(", keyList=");
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.HistoryItemLoader", sb6.toString());
    }

    public final void b() {
        if (!this.f21447g || this.f21448h) {
            return;
        }
        this.f21448h = true;
        gm0.j1.d().g(new ej4.f(this.f21446f, 2L, 0L, 200L, null, 16, null));
    }
}
