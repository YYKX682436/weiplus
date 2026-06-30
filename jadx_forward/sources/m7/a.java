package m7;

/* loaded from: classes13.dex */
public abstract class a implements java.lang.Cloneable {
    public android.content.res.Resources.Theme A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean F;

    /* renamed from: d, reason: collision with root package name */
    public int f405942d;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.drawable.Drawable f405946h;

    /* renamed from: i, reason: collision with root package name */
    public int f405947i;

    /* renamed from: m, reason: collision with root package name */
    public android.graphics.drawable.Drawable f405948m;

    /* renamed from: n, reason: collision with root package name */
    public int f405949n;

    /* renamed from: s, reason: collision with root package name */
    public boolean f405954s;

    /* renamed from: u, reason: collision with root package name */
    public android.graphics.drawable.Drawable f405956u;

    /* renamed from: v, reason: collision with root package name */
    public int f405957v;

    /* renamed from: z, reason: collision with root package name */
    public boolean f405961z;

    /* renamed from: e, reason: collision with root package name */
    public float f405943e = 1.0f;

    /* renamed from: f, reason: collision with root package name */
    public w6.z f405944f = w6.z.f524786c;

    /* renamed from: g, reason: collision with root package name */
    public com.p147xb1cd08cc.p148x5de23a5.g f405945g = com.p147xb1cd08cc.p148x5de23a5.g.NORMAL;

    /* renamed from: o, reason: collision with root package name */
    public boolean f405950o = true;

    /* renamed from: p, reason: collision with root package name */
    public int f405951p = -1;

    /* renamed from: q, reason: collision with root package name */
    public int f405952q = -1;

    /* renamed from: r, reason: collision with root package name */
    public t6.h f405953r = p7.a.f433987b;

    /* renamed from: t, reason: collision with root package name */
    public boolean f405955t = true;

    /* renamed from: w, reason: collision with root package name */
    public t6.l f405958w = new t6.l();

    /* renamed from: x, reason: collision with root package name */
    public java.util.Map f405959x = new q7.d();

    /* renamed from: y, reason: collision with root package name */
    public java.lang.Class f405960y = java.lang.Object.class;
    public boolean E = true;

    public static boolean e(int i17, int i18) {
        return (i17 & i18) != 0;
    }

    public m7.a a(m7.a aVar) {
        if (this.B) {
            return mo15459x5a5dd5d().a(aVar);
        }
        if (e(aVar.f405942d, 2)) {
            this.f405943e = aVar.f405943e;
        }
        if (e(aVar.f405942d, 262144)) {
            this.C = aVar.C;
        }
        if (e(aVar.f405942d, 1048576)) {
            this.F = aVar.F;
        }
        if (e(aVar.f405942d, 4)) {
            this.f405944f = aVar.f405944f;
        }
        if (e(aVar.f405942d, 8)) {
            this.f405945g = aVar.f405945g;
        }
        if (e(aVar.f405942d, 16)) {
            this.f405946h = aVar.f405946h;
            this.f405947i = 0;
            this.f405942d &= -33;
        }
        if (e(aVar.f405942d, 32)) {
            this.f405947i = aVar.f405947i;
            this.f405946h = null;
            this.f405942d &= -17;
        }
        if (e(aVar.f405942d, 64)) {
            this.f405948m = aVar.f405948m;
            this.f405949n = 0;
            this.f405942d &= -129;
        }
        if (e(aVar.f405942d, 128)) {
            this.f405949n = aVar.f405949n;
            this.f405948m = null;
            this.f405942d &= -65;
        }
        if (e(aVar.f405942d, 256)) {
            this.f405950o = aVar.f405950o;
        }
        if (e(aVar.f405942d, 512)) {
            this.f405952q = aVar.f405952q;
            this.f405951p = aVar.f405951p;
        }
        if (e(aVar.f405942d, 1024)) {
            this.f405953r = aVar.f405953r;
        }
        if (e(aVar.f405942d, 4096)) {
            this.f405960y = aVar.f405960y;
        }
        if (e(aVar.f405942d, 8192)) {
            this.f405956u = aVar.f405956u;
            this.f405957v = 0;
            this.f405942d &= -16385;
        }
        if (e(aVar.f405942d, 16384)) {
            this.f405957v = aVar.f405957v;
            this.f405956u = null;
            this.f405942d &= -8193;
        }
        if (e(aVar.f405942d, 32768)) {
            this.A = aVar.A;
        }
        if (e(aVar.f405942d, 65536)) {
            this.f405955t = aVar.f405955t;
        }
        if (e(aVar.f405942d, 131072)) {
            this.f405954s = aVar.f405954s;
        }
        if (e(aVar.f405942d, 2048)) {
            ((x.b) this.f405959x).putAll(aVar.f405959x);
            this.E = aVar.E;
        }
        if (e(aVar.f405942d, 524288)) {
            this.D = aVar.D;
        }
        if (!this.f405955t) {
            ((q7.d) this.f405959x).clear();
            int i17 = this.f405942d & (-2049);
            this.f405954s = false;
            this.f405942d = i17 & (-131073);
            this.E = true;
        }
        this.f405942d |= aVar.f405942d;
        this.f405958w.f497506b.i(aVar.f405958w.f497506b);
        i();
        return this;
    }

    @Override // 
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public m7.a mo15459x5a5dd5d() {
        try {
            m7.a aVar = (m7.a) super.clone();
            t6.l lVar = new t6.l();
            aVar.f405958w = lVar;
            lVar.f497506b.i(this.f405958w.f497506b);
            q7.d dVar = new q7.d();
            aVar.f405959x = dVar;
            dVar.putAll(this.f405959x);
            aVar.f405961z = false;
            aVar.B = false;
            return aVar;
        } catch (java.lang.CloneNotSupportedException e17) {
            throw new java.lang.RuntimeException(e17);
        }
    }

    public m7.a c(java.lang.Class cls) {
        if (this.B) {
            return mo15459x5a5dd5d().c(cls);
        }
        q7.n.b(cls);
        this.f405960y = cls;
        this.f405942d |= 4096;
        i();
        return this;
    }

    public m7.a d(w6.z zVar) {
        if (this.B) {
            return mo15459x5a5dd5d().d(zVar);
        }
        q7.n.b(zVar);
        this.f405944f = zVar;
        this.f405942d |= 4;
        i();
        return this;
    }

    /* renamed from: equals */
    public boolean m146892xb2c87fbf(java.lang.Object obj) {
        if (!(obj instanceof m7.a)) {
            return false;
        }
        m7.a aVar = (m7.a) obj;
        if (java.lang.Float.compare(aVar.f405943e, this.f405943e) == 0 && this.f405947i == aVar.f405947i && q7.p.a(this.f405946h, aVar.f405946h) && this.f405949n == aVar.f405949n && q7.p.a(this.f405948m, aVar.f405948m) && this.f405957v == aVar.f405957v && q7.p.a(this.f405956u, aVar.f405956u) && this.f405950o == aVar.f405950o && this.f405951p == aVar.f405951p && this.f405952q == aVar.f405952q && this.f405954s == aVar.f405954s && this.f405955t == aVar.f405955t && this.C == aVar.C && this.D == aVar.D && this.f405944f.equals(aVar.f405944f) && this.f405945g == aVar.f405945g && this.f405958w.mo743xb2c87fbf(aVar.f405958w)) {
            return ((x.n) this.f405959x).m174750xb2c87fbf(aVar.f405959x) && this.f405960y.equals(aVar.f405960y) && q7.p.a(this.f405953r, aVar.f405953r) && q7.p.a(this.A, aVar.A);
        }
        return false;
    }

    public final m7.a f(d7.v vVar, t6.p pVar) {
        if (this.B) {
            return mo15459x5a5dd5d().f(vVar, pVar);
        }
        t6.k kVar = d7.v.f308376f;
        q7.n.b(vVar);
        j(kVar, vVar);
        return n(pVar, false);
    }

    public m7.a g(int i17, int i18) {
        if (this.B) {
            return mo15459x5a5dd5d().g(i17, i18);
        }
        this.f405952q = i17;
        this.f405951p = i18;
        this.f405942d |= 512;
        i();
        return this;
    }

    public m7.a h(com.p147xb1cd08cc.p148x5de23a5.g gVar) {
        if (this.B) {
            return mo15459x5a5dd5d().h(gVar);
        }
        q7.n.b(gVar);
        this.f405945g = gVar;
        this.f405942d |= 8;
        i();
        return this;
    }

    /* renamed from: hashCode */
    public int m146893x8cdac1b() {
        float f17 = this.f405943e;
        char[] cArr = q7.p.f441843a;
        return q7.p.e(this.A, q7.p.e(this.f405953r, q7.p.e(this.f405960y, q7.p.e(this.f405959x, q7.p.e(this.f405958w, q7.p.e(this.f405945g, q7.p.e(this.f405944f, (((((((((((((q7.p.e(this.f405956u, (q7.p.e(this.f405948m, (q7.p.e(this.f405946h, ((java.lang.Float.floatToIntBits(f17) + com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.v5.f34918x366c91de) * 31) + this.f405947i) * 31) + this.f405949n) * 31) + this.f405957v) * 31) + (this.f405950o ? 1 : 0)) * 31) + this.f405951p) * 31) + this.f405952q) * 31) + (this.f405954s ? 1 : 0)) * 31) + (this.f405955t ? 1 : 0)) * 31) + (this.C ? 1 : 0)) * 31) + (this.D ? 1 : 0))))))));
    }

    public final m7.a i() {
        if (this.f405961z) {
            throw new java.lang.IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return this;
    }

    public m7.a j(t6.k kVar, java.lang.Object obj) {
        if (this.B) {
            return mo15459x5a5dd5d().j(kVar, obj);
        }
        q7.n.b(kVar);
        q7.n.b(obj);
        this.f405958w.f497506b.put(kVar, obj);
        i();
        return this;
    }

    public m7.a k(t6.h hVar) {
        if (this.B) {
            return mo15459x5a5dd5d().k(hVar);
        }
        q7.n.b(hVar);
        this.f405953r = hVar;
        this.f405942d |= 1024;
        i();
        return this;
    }

    public m7.a l(boolean z17) {
        if (this.B) {
            return mo15459x5a5dd5d().l(true);
        }
        this.f405950o = !z17;
        this.f405942d |= 256;
        i();
        return this;
    }

    public m7.a m(java.lang.Class cls, t6.p pVar, boolean z17) {
        if (this.B) {
            return mo15459x5a5dd5d().m(cls, pVar, z17);
        }
        q7.n.b(cls);
        q7.n.b(pVar);
        ((q7.d) this.f405959x).put(cls, pVar);
        int i17 = this.f405942d | 2048;
        this.f405955t = true;
        int i18 = i17 | 65536;
        this.f405942d = i18;
        this.E = false;
        if (z17) {
            this.f405942d = i18 | 131072;
            this.f405954s = true;
        }
        i();
        return this;
    }

    public m7.a n(t6.p pVar, boolean z17) {
        if (this.B) {
            return mo15459x5a5dd5d().n(pVar, z17);
        }
        d7.b0 b0Var = new d7.b0(pVar, z17);
        m(android.graphics.Bitmap.class, pVar, z17);
        m(android.graphics.drawable.Drawable.class, b0Var, z17);
        m(android.graphics.drawable.BitmapDrawable.class, b0Var, z17);
        m(h7.f.class, new h7.i(pVar), z17);
        i();
        return this;
    }

    public m7.a o(boolean z17) {
        if (this.B) {
            return mo15459x5a5dd5d().o(z17);
        }
        this.F = z17;
        this.f405942d |= 1048576;
        i();
        return this;
    }
}
