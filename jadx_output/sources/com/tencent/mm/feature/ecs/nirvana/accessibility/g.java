package com.tencent.mm.feature.ecs.nirvana.accessibility;

/* loaded from: classes15.dex */
public class g {
    public int C;
    public int D;
    public int E;
    public int F;
    public float G;
    public java.lang.String H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public float f65653J;
    public float K;
    public float L;
    public float M;
    public float[] N;
    public com.tencent.mm.feature.ecs.nirvana.accessibility.g O;
    public java.util.List R;
    public com.tencent.mm.feature.ecs.nirvana.accessibility.e S;
    public com.tencent.mm.feature.ecs.nirvana.accessibility.e T;
    public float[] V;
    public float[] X;
    public android.graphics.Rect Y;

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.feature.ecs.nirvana.accessibility.h f65654a;

    /* renamed from: c, reason: collision with root package name */
    public int f65656c;

    /* renamed from: d, reason: collision with root package name */
    public int f65657d;

    /* renamed from: e, reason: collision with root package name */
    public int f65658e;

    /* renamed from: f, reason: collision with root package name */
    public int f65659f;

    /* renamed from: g, reason: collision with root package name */
    public int f65660g;

    /* renamed from: h, reason: collision with root package name */
    public int f65661h;

    /* renamed from: i, reason: collision with root package name */
    public int f65662i;

    /* renamed from: j, reason: collision with root package name */
    public int f65663j;

    /* renamed from: k, reason: collision with root package name */
    public int f65664k;

    /* renamed from: l, reason: collision with root package name */
    public float f65665l;

    /* renamed from: m, reason: collision with root package name */
    public float f65666m;

    /* renamed from: n, reason: collision with root package name */
    public float f65667n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f65668o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f65669p;

    /* renamed from: q, reason: collision with root package name */
    public java.util.List f65670q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f65671r;

    /* renamed from: s, reason: collision with root package name */
    public java.util.List f65672s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f65673t;

    /* renamed from: u, reason: collision with root package name */
    public java.util.List f65674u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f65675v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.List f65676w;

    /* renamed from: x, reason: collision with root package name */
    public java.lang.String f65677x;

    /* renamed from: y, reason: collision with root package name */
    public java.util.List f65678y;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String f65679z;

    /* renamed from: b, reason: collision with root package name */
    public int f65655b = -1;
    public int A = -1;
    public boolean B = false;
    public final java.util.List P = new java.util.ArrayList();
    public final java.util.List Q = new java.util.ArrayList();
    public boolean U = true;
    public boolean W = true;

    public g(com.tencent.mm.feature.ecs.nirvana.accessibility.h hVar) {
        this.f65654a = hVar;
    }

    public static boolean a(com.tencent.mm.feature.ecs.nirvana.accessibility.g gVar, h10.b bVar) {
        return (gVar.f65657d & bVar.f277977d) != 0;
    }

    public static java.lang.CharSequence b(com.tencent.mm.feature.ecs.nirvana.accessibility.g gVar) {
        java.lang.CharSequence[] charSequenceArr = {gVar.d(gVar.f65671r, gVar.f65672s), gVar.d(gVar.f65669p, gVar.f65670q), gVar.d(gVar.f65677x, gVar.f65678y)};
        java.lang.CharSequence charSequence = null;
        for (int i17 = 0; i17 < 3; i17++) {
            java.lang.CharSequence charSequence2 = charSequenceArr[i17];
            if (charSequence2 != null && charSequence2.length() > 0) {
                charSequence = (charSequence == null || charSequence.length() == 0) ? charSequence2 : android.text.TextUtils.concat(charSequence, ", ", charSequence2);
            }
        }
        return charSequence;
    }

    public final void c(java.util.List list) {
        if (f(h10.c.f277989s)) {
            list.add(this);
        }
        java.util.Iterator it = ((java.util.ArrayList) this.P).iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.feature.ecs.nirvana.accessibility.g) it.next()).c(list);
        }
    }

    public final android.text.SpannableString d(java.lang.String str, java.util.List list) {
        if (str == null) {
            return null;
        }
        android.text.SpannableString spannableString = new android.text.SpannableString(str);
        if (list != null) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                h10.m mVar = (h10.m) it.next();
                int ordinal = mVar.f278055c.ordinal();
                int i17 = mVar.f278054b;
                int i18 = mVar.f278053a;
                if (ordinal == 0) {
                    spannableString.setSpan(new android.text.style.TtsSpan.Builder("android.type.verbatim").build(), i18, i17, 0);
                } else if (ordinal == 1) {
                    spannableString.setSpan(new android.text.style.LocaleSpan(java.util.Locale.forLanguageTag(((h10.d) mVar).f277998e)), i18, i17, 0);
                } else if (ordinal == 2) {
                    spannableString.setSpan(new android.text.style.URLSpan(((h10.p) mVar).f278064e), i18, i17, 0);
                }
            }
        }
        return spannableString;
    }

    public final java.lang.String e() {
        java.lang.String str;
        if (f(h10.c.f277990t) && (str = this.f65669p) != null && !str.isEmpty()) {
            return this.f65669p;
        }
        java.util.Iterator it = ((java.util.ArrayList) this.P).iterator();
        while (it.hasNext()) {
            java.lang.String e17 = ((com.tencent.mm.feature.ecs.nirvana.accessibility.g) it.next()).e();
            if (e17 != null && !e17.isEmpty()) {
                return e17;
            }
        }
        return null;
    }

    public final boolean f(h10.c cVar) {
        return (cVar.f277997d & this.f65656c) != 0;
    }

    public final com.tencent.mm.feature.ecs.nirvana.accessibility.g g(float[] fArr, boolean z17) {
        float f17 = fArr[3];
        boolean z18 = false;
        float f18 = fArr[0] / f17;
        float f19 = fArr[1] / f17;
        if (f18 < this.f65653J || f18 >= this.L || f19 < this.K || f19 >= this.M) {
            return null;
        }
        float[] fArr2 = new float[4];
        java.util.Iterator it = ((java.util.ArrayList) this.Q).iterator();
        while (it.hasNext()) {
            com.tencent.mm.feature.ecs.nirvana.accessibility.g gVar = (com.tencent.mm.feature.ecs.nirvana.accessibility.g) it.next();
            if (!gVar.f(h10.c.f277991u)) {
                if (gVar.U) {
                    gVar.U = false;
                    if (gVar.V == null) {
                        gVar.V = new float[16];
                    }
                    if (!android.opengl.Matrix.invertM(gVar.V, 0, gVar.N, 0)) {
                        java.util.Arrays.fill(gVar.V, 0.0f);
                    }
                }
                android.opengl.Matrix.multiplyMV(fArr2, 0, gVar.V, 0, fArr, 0);
                com.tencent.mm.feature.ecs.nirvana.accessibility.g g17 = gVar.g(fArr2, z17);
                if (g17 != null) {
                    return g17;
                }
            }
        }
        if (z17 && this.f65662i != -1) {
            z18 = true;
        }
        if (h() || z18) {
            return this;
        }
        return null;
    }

    public final boolean h() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        if (f(h10.c.f277989s)) {
            return false;
        }
        if (f(h10.c.B)) {
            return true;
        }
        return ((this.f65657d & (~com.tencent.mm.feature.ecs.nirvana.accessibility.h.f65680x)) == 0 && (this.f65656c & com.tencent.mm.feature.ecs.nirvana.accessibility.h.f65681y) == 0 && ((str = this.f65669p) == null || str.isEmpty()) && (((str2 = this.f65671r) == null || str2.isEmpty()) && ((str3 = this.f65677x) == null || str3.isEmpty()))) ? false : true;
    }

    public final void i(float[] fArr, float[] fArr2, float[] fArr3) {
        android.opengl.Matrix.multiplyMV(fArr, 0, fArr2, 0, fArr3, 0);
        float f17 = fArr[3];
        fArr[0] = fArr[0] / f17;
        fArr[1] = fArr[1] / f17;
        fArr[2] = fArr[2] / f17;
        fArr[3] = 0.0f;
    }

    public final void j(float[] fArr, java.util.Set set, boolean z17) {
        set.add(this);
        if (this.W) {
            z17 = true;
        }
        if (z17) {
            if (this.X == null) {
                this.X = new float[16];
            }
            if (this.N == null) {
                this.N = new float[16];
            }
            android.opengl.Matrix.multiplyMM(this.X, 0, fArr, 0, this.N, 0);
            float[] fArr2 = {this.f65653J, this.K, 0.0f, 1.0f};
            float[] fArr3 = new float[4];
            float[] fArr4 = new float[4];
            float[] fArr5 = new float[4];
            float[] fArr6 = new float[4];
            i(fArr3, this.X, fArr2);
            fArr2[0] = this.L;
            fArr2[1] = this.K;
            i(fArr4, this.X, fArr2);
            fArr2[0] = this.L;
            fArr2[1] = this.M;
            i(fArr5, this.X, fArr2);
            fArr2[0] = this.f65653J;
            fArr2[1] = this.M;
            i(fArr6, this.X, fArr2);
            if (this.Y == null) {
                this.Y = new android.graphics.Rect();
            }
            this.Y.set(java.lang.Math.round(java.lang.Math.min(fArr3[0], java.lang.Math.min(fArr4[0], java.lang.Math.min(fArr5[0], fArr6[0])))), java.lang.Math.round(java.lang.Math.min(fArr3[1], java.lang.Math.min(fArr4[1], java.lang.Math.min(fArr5[1], fArr6[1])))), java.lang.Math.round(java.lang.Math.max(fArr3[0], java.lang.Math.max(fArr4[0], java.lang.Math.max(fArr5[0], fArr6[0])))), java.lang.Math.round(java.lang.Math.max(fArr3[1], java.lang.Math.max(fArr4[1], java.lang.Math.max(fArr5[1], fArr6[1])))));
            this.W = false;
        }
        java.util.Iterator it = ((java.util.ArrayList) this.P).iterator();
        int i17 = -1;
        while (it.hasNext()) {
            com.tencent.mm.feature.ecs.nirvana.accessibility.g gVar = (com.tencent.mm.feature.ecs.nirvana.accessibility.g) it.next();
            gVar.A = i17;
            i17 = gVar.f65655b;
            gVar.j(this.X, set, z17);
        }
    }
}
