package s7;

/* loaded from: classes16.dex */
public class v2 implements s7.b1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f485399a;

    /* renamed from: b, reason: collision with root package name */
    public float f485400b;

    /* renamed from: c, reason: collision with root package name */
    public float f485401c;

    /* renamed from: d, reason: collision with root package name */
    public s7.w2 f485402d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f485403e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f485404f;

    /* renamed from: g, reason: collision with root package name */
    public int f485405g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f485406h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ s7.f3 f485407i;

    public v2(s7.f3 f3Var, s7.a1 a1Var) {
        this.f485407i = f3Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        this.f485399a = arrayList;
        this.f485402d = null;
        this.f485403e = false;
        this.f485404f = true;
        this.f485405g = -1;
        if (a1Var == null) {
            return;
        }
        a1Var.h(this);
        if (this.f485406h) {
            this.f485402d.b((s7.w2) arrayList.get(this.f485405g));
            arrayList.set(this.f485405g, this.f485402d);
            this.f485406h = false;
        }
        s7.w2 w2Var = this.f485402d;
        if (w2Var != null) {
            arrayList.add(w2Var);
        }
    }

    @Override // s7.b1
    public void a(float f17, float f18) {
        boolean z17 = this.f485406h;
        java.util.List list = this.f485399a;
        if (z17) {
            this.f485402d.b((s7.w2) list.get(this.f485405g));
            list.set(this.f485405g, this.f485402d);
            this.f485406h = false;
        }
        s7.w2 w2Var = this.f485402d;
        if (w2Var != null) {
            list.add(w2Var);
        }
        this.f485400b = f17;
        this.f485401c = f18;
        this.f485402d = new s7.w2(this.f485407i, f17, f18, 0.0f, 0.0f);
        this.f485405g = list.size();
    }

    @Override // s7.b1
    public void b(float f17, float f18) {
        this.f485402d.a(f17, f18);
        this.f485399a.add(this.f485402d);
        s7.f3 f3Var = this.f485407i;
        s7.w2 w2Var = this.f485402d;
        this.f485402d = new s7.w2(f3Var, f17, f18, f17 - w2Var.f485415a, f18 - w2Var.f485416b);
        this.f485406h = false;
    }

    @Override // s7.b1
    public void c(float f17, float f18, float f19, float f27) {
        this.f485402d.a(f17, f18);
        this.f485399a.add(this.f485402d);
        this.f485402d = new s7.w2(this.f485407i, f19, f27, f19 - f17, f27 - f18);
        this.f485406h = false;
    }

    @Override // s7.b1
    /* renamed from: close */
    public void mo163950x5a5ddf8() {
        this.f485399a.add(this.f485402d);
        b(this.f485400b, this.f485401c);
        this.f485406h = true;
    }

    @Override // s7.b1
    public void d(float f17, float f18, float f19, float f27, float f28, float f29) {
        if (this.f485404f || this.f485403e) {
            this.f485402d.a(f17, f18);
            this.f485399a.add(this.f485402d);
            this.f485403e = false;
        }
        this.f485402d = new s7.w2(this.f485407i, f28, f29, f28 - f19, f29 - f27);
        this.f485406h = false;
    }

    @Override // s7.b1
    public void e(float f17, float f18, float f19, boolean z17, boolean z18, float f27, float f28) {
        this.f485403e = true;
        this.f485404f = false;
        s7.w2 w2Var = this.f485402d;
        s7.f3.a(w2Var.f485415a, w2Var.f485416b, f17, f18, f19, z17, z18, f27, f28, this);
        this.f485404f = true;
        this.f485406h = false;
    }
}
