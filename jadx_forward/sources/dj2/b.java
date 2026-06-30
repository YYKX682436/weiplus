package dj2;

/* loaded from: classes10.dex */
public abstract class b extends hn5.c {

    /* renamed from: b, reason: collision with root package name */
    public final android.content.Context f314428b;

    /* renamed from: c, reason: collision with root package name */
    public final lj2.v0 f314429c;

    /* renamed from: d, reason: collision with root package name */
    public final lj2.x0 f314430d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f314431e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f314432f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Rect f314433g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f314434h;

    public b(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f314428b = context;
        this.f314429c = pluginAbility;
        this.f314430d = service;
        this.f314431e = new java.util.HashMap();
        this.f314432f = new java.util.LinkedList();
        this.f314433g = new android.graphics.Rect();
    }

    @Override // hn5.c
    public int a() {
        return this.f314432f.size();
    }

    @Override // hn5.c
    public android.view.View c(int i17, java.lang.Object obj) {
        xh2.a data = (xh2.a) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        int k17 = k(data);
        java.lang.String i18 = i(data);
        java.lang.String l17 = l();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getItemView pos: ");
        sb6.append(i17);
        sb6.append(" key: ");
        sb6.append(i18);
        sb6.append(" micType: ");
        sb6.append(k17);
        sb6.append(" viewCache: ");
        java.util.HashMap hashMap = this.f314431e;
        sb6.append(hashMap);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(l17, sb6.toString());
        android.view.View view = (android.view.View) hashMap.get(i18);
        if (view == null) {
            view = h(data, k17);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(view);
        hashMap.put(i18, view);
        return view;
    }

    @Override // hn5.c
    public hn5.b e(int i17) {
        return ((xh2.a) this.f314432f.get(i17)).f536054b;
    }

    @Override // hn5.c
    public void g(int i17, android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        if (view instanceof lj2.j) {
            ((lj2.j) view).f400410h = this.f314434h;
        }
    }

    public abstract android.view.View h(xh2.a aVar, int i17);

    public java.lang.String i(xh2.a data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        return data.b() + '@' + k(data) + '@' + data.f536054b.f536086e;
    }

    @Override // hn5.c
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public xh2.a b(int i17) {
        java.lang.Object obj = this.f314432f.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        return (xh2.a) obj;
    }

    public final int k(xh2.a aVar) {
        km2.q qVar = aVar.f536053a;
        java.lang.String str = qVar != null ? qVar.f390703a : null;
        lj2.v0 v0Var = this.f314429c;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, v0Var.a0().p())) {
            if (v0Var.a0().g().size() > 0) {
                return 6;
            }
            return v0Var.a0().l().size() > 3 ? 7 : 3;
        }
        km2.q qVar2 = aVar.f536053a;
        if (qVar2 != null) {
            if (qVar2 != null && qVar2.f390710h) {
                return 5;
            }
        }
        if (qVar2 != null) {
            xh2.i iVar = aVar.f536054b;
            if (!iVar.f536089h) {
                return pm0.v.z(iVar.f536090i, 2) ? 1 : 2;
            }
        }
        return (qVar2 == null && aVar.f536054b.f536089h) ? 4 : 0;
    }

    public abstract java.lang.String l();
}
