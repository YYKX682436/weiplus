package um;

/* loaded from: classes8.dex */
public final class l implements um.m {

    /* renamed from: d, reason: collision with root package name */
    public int f510219d;

    /* renamed from: e, reason: collision with root package name */
    public float f510220e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f510221f;

    /* renamed from: g, reason: collision with root package name */
    public android.graphics.Bitmap f510222g;

    public l() {
        oj0.c cVar = oj0.c.f427259a;
        java.util.List list = oj0.c.f427260b;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new xk0.g(((oj0.a) it.next()).f427254a));
        }
        this.f510221f = arrayList;
    }

    @Override // um.m
    public int A3(boolean z17) {
        return 0;
    }

    @Override // um.m
    public void M(android.graphics.Canvas canvas, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        android.graphics.Bitmap bitmap = this.f510222g;
        if (bitmap != null) {
            ((xk0.g) ((java.util.ArrayList) this.f510221f).get(this.f510219d)).a(canvas, bitmap, this.f510220e);
        }
    }

    @Override // um.m
    public void O3(android.graphics.Canvas canvas) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(canvas, "canvas");
        android.graphics.Bitmap bitmap = this.f510222g;
        if (bitmap != null) {
            ((xk0.g) ((java.util.ArrayList) this.f510221f).get(this.f510219d)).a(canvas, bitmap, this.f510220e);
        }
    }

    @Override // um.m
    public void R2(boolean z17) {
        this.f510219d = 0;
        this.f510220e = 0.0f;
    }

    @Override // um.m
    public /* bridge */ /* synthetic */ void add(java.lang.Object obj) {
    }

    @Override // um.m
    /* renamed from: clear */
    public void mo168218x5a5b64d() {
    }

    /* renamed from: clone */
    public java.lang.Object m168225x5a5dd5d() {
        return new java.lang.Object();
    }

    @Override // um.m
    public void f3(boolean z17) {
    }

    @Override // um.m
    public void o5() {
    }

    @Override // um.m
    /* renamed from: onCreate */
    public void mo168219x3e5a77bb() {
    }

    @Override // um.m
    /* renamed from: onDestroy */
    public void mo168220xac79a11b() {
    }

    @Override // um.m
    public java.lang.Object pop() {
        return new xk0.g(1);
    }
}
