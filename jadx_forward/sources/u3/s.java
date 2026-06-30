package u3;

/* loaded from: classes13.dex */
public abstract class s implements u3.b {

    /* renamed from: l, reason: collision with root package name */
    public static final u3.r f505750l = new u3.h("translationX");

    /* renamed from: m, reason: collision with root package name */
    public static final u3.r f505751m = new u3.i("translationY");

    /* renamed from: n, reason: collision with root package name */
    public static final u3.r f505752n = new u3.j("scaleX");

    /* renamed from: o, reason: collision with root package name */
    public static final u3.r f505753o = new u3.k("scaleY");

    /* renamed from: p, reason: collision with root package name */
    public static final u3.r f505754p = new u3.l("rotation");

    /* renamed from: q, reason: collision with root package name */
    public static final u3.r f505755q = new u3.m("rotationX");

    /* renamed from: r, reason: collision with root package name */
    public static final u3.r f505756r = new u3.n("rotationY");

    /* renamed from: s, reason: collision with root package name */
    public static final u3.r f505757s = new u3.g("alpha");

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f505761d;

    /* renamed from: e, reason: collision with root package name */
    public final u3.t f505762e;

    /* renamed from: i, reason: collision with root package name */
    public float f505766i;

    /* renamed from: a, reason: collision with root package name */
    public float f505758a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f505759b = Float.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public boolean f505760c = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f505763f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float f505764g = -3.4028235E38f;

    /* renamed from: h, reason: collision with root package name */
    public long f505765h = 0;

    /* renamed from: j, reason: collision with root package name */
    public final java.util.ArrayList f505767j = new java.util.ArrayList();

    /* renamed from: k, reason: collision with root package name */
    public final java.util.ArrayList f505768k = new java.util.ArrayList();

    public s(java.lang.Object obj, u3.t tVar) {
        this.f505761d = obj;
        this.f505762e = tVar;
        if (tVar == f505754p || tVar == f505755q || tVar == f505756r) {
            this.f505766i = 0.1f;
            return;
        }
        if (tVar == f505757s) {
            this.f505766i = 0.00390625f;
        } else if (tVar == f505752n || tVar == f505753o) {
            this.f505766i = 0.00390625f;
        } else {
            this.f505766i = 1.0f;
        }
    }

    public u3.s a(u3.p pVar) {
        java.util.ArrayList arrayList = this.f505767j;
        if (!arrayList.contains(pVar)) {
            arrayList.add(pVar);
        }
        return this;
    }

    public abstract void b();

    public final void c(boolean z17) {
        java.util.ArrayList arrayList;
        int i17 = 0;
        this.f505763f = false;
        java.lang.ThreadLocal threadLocal = u3.f.f505742f;
        if (threadLocal.get() == null) {
            threadLocal.set(new u3.f());
        }
        u3.f fVar = (u3.f) threadLocal.get();
        fVar.f505743a.m174754xc84af884(this);
        java.util.ArrayList arrayList2 = fVar.f505744b;
        int indexOf = arrayList2.indexOf(this);
        if (indexOf >= 0) {
            arrayList2.set(indexOf, null);
            fVar.f505747e = true;
        }
        this.f505765h = 0L;
        this.f505760c = false;
        while (true) {
            arrayList = this.f505767j;
            if (i17 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i17) != null) {
                ((u3.p) arrayList.get(i17)).a(this, z17, this.f505759b, this.f505758a);
            }
            i17++;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }

    public void d(float f17) {
        java.util.ArrayList arrayList;
        this.f505762e.b(this.f505761d, f17);
        int i17 = 0;
        while (true) {
            arrayList = this.f505768k;
            if (i17 >= arrayList.size()) {
                break;
            }
            if (arrayList.get(i17) != null) {
                ((u3.q) arrayList.get(i17)).a(this, this.f505759b, this.f505758a);
            }
            i17++;
        }
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                return;
            }
            if (arrayList.get(size) == null) {
                arrayList.remove(size);
            }
        }
    }
}
