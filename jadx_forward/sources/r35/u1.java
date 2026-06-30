package r35;

/* loaded from: classes11.dex */
public class u1 implements lz.f {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f450802a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r f450803b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f450804c;

    /* renamed from: f, reason: collision with root package name */
    public r35.v1 f450807f;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f450811j;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f450805d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f450806e = false;

    /* renamed from: g, reason: collision with root package name */
    public lz.i f450808g = null;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View.OnClickListener f450809h = null;

    /* renamed from: i, reason: collision with root package name */
    public r35.d2 f450810i = null;

    /* renamed from: k, reason: collision with root package name */
    public boolean f450812k = false;

    /* renamed from: l, reason: collision with root package name */
    public final android.view.View.OnClickListener f450813l = new r35.q1(this);

    /* renamed from: m, reason: collision with root package name */
    public final lz.i f450814m = new r35.r1(this);

    /* renamed from: n, reason: collision with root package name */
    public final lz.h f450815n = new r35.s1(this);

    public u1(android.content.Context context) {
        r35.t1 t1Var = new r35.t1(this);
        this.f450802a = context;
        r35.v1 v1Var = new r35.v1(context);
        this.f450807f = v1Var;
        v1Var.f450821d = t1Var;
    }

    public final void a(java.lang.String str) {
        android.content.res.Resources resources;
        int i17;
        r35.v1 v1Var = this.f450807f;
        v1Var.C = str;
        boolean R4 = com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(str);
        v1Var.f450827m = R4;
        if (!R4 && i95.n0.c(r35.p3.class) != null) {
            ((r35.t) ((r35.p3) i95.n0.c(r35.p3.class))).getClass();
            v1Var.f450828n = r01.z.g(str);
        }
        if (!v1Var.f450828n) {
            v1Var.f450831q = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(str);
        }
        if (v1Var.f450828n && i95.n0.c(r35.p3.class) != null) {
            r35.p3 p3Var = (r35.p3) i95.n0.c(r35.p3.class);
            java.lang.String str2 = v1Var.C;
            boolean z17 = v1Var.I;
            android.content.Context context = v1Var.f450825h;
            if (z17) {
                resources = context.getResources();
                i17 = com.p314xaae8f345.mm.R.C30860x5b28f31.f561425i5;
            } else {
                resources = context.getResources();
                i17 = com.p314xaae8f345.mm.R.C30860x5b28f31.f561423i3;
            }
            int dimensionPixelSize = resources.getDimensionPixelSize(i17);
            ((r35.t) p3Var).getClass();
            o11.f fVar = new o11.f();
            fVar.f423616g = s01.r.k(str2);
            fVar.f423611b = true;
            fVar.f423628s = true;
            fVar.f423624o = com.p314xaae8f345.mm.R.raw.f78922x61de8d17;
            if (dimensionPixelSize > 0) {
                fVar.f423630u = dimensionPixelSize * 0.1f;
                fVar.f423629t = true;
            }
            v1Var.E = fVar.a();
        }
        r35.v1 v1Var2 = this.f450807f;
        v1Var2.A = this.f450806e;
        v1Var2.h();
        b();
    }

    public void b() {
        java.lang.String concat;
        if (this.f450803b == null || this.f450804c == null) {
            return;
        }
        java.util.HashMap hashMap = this.f450805d;
        java.util.Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f450803b).w((java.lang.String) it.next());
        }
        hashMap.clear();
        if (this.f450812k) {
            return;
        }
        int n17 = ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f450803b).n(this.f450804c);
        lz.i iVar = this.f450808g;
        if (iVar == null) {
            iVar = this.f450814m;
        }
        android.view.View.OnClickListener onClickListener = this.f450809h;
        if (onClickListener == null) {
            onClickListener = this.f450813l;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.a3 a3Var = this.f450807f.f450831q;
        boolean z17 = a3Var != null && a3Var.P0();
        r35.v1 v1Var = this.f450807f;
        boolean R4 = v1Var.f450828n ? v1Var.f450830p : com.p314xaae8f345.mm.p2621x8fb0427b.z3.R4(v1Var.C);
        r35.v1 v1Var2 = this.f450807f;
        if (v1Var2.f450828n) {
            z17 = v1Var2.f450829o;
        }
        int i17 = v1Var2.f450835u + ((!R4 || z17) ? 2 : 1);
        android.content.Context context = this.f450802a;
        int f17 = v1Var2.f(context);
        int i18 = 0;
        int i19 = 0;
        while (i18 < this.f450807f.getCount() && i18 < i17) {
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3 c19662x4f7a67f3 = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3(context, 1);
            if (i19 >= 0) {
                concat = "pref_contact_list_row_" + i19;
            } else {
                concat = "pref_contact_list_row_".concat(i19 == -1 ? "header" : i19 == -2 ? "footer" : "unkown");
            }
            c19662x4f7a67f3.C(concat);
            lz.j jVar = c19662x4f7a67f3.N;
            r35.v1 v1Var3 = this.f450807f;
            r35.k2 k2Var = (r35.k2) jVar;
            k2Var.getClass();
            k2Var.f450695a = v1Var3;
            k2Var.f450696b = i19;
            r35.k2 k2Var2 = (r35.k2) c19662x4f7a67f3.N;
            k2Var2.f450697c = f17;
            k2Var2.f450698d = z17;
            k2Var2.f450702h = onClickListener;
            k2Var2.f450700f = this.f450815n;
            k2Var2.f450701g = iVar;
            ((com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.h0) this.f450803b).d(c19662x4f7a67f3, n17 + i19);
            hashMap.put(c19662x4f7a67f3.f279313q, c19662x4f7a67f3);
            i18 += f17;
            i19++;
        }
        c(false);
    }

    public void c(boolean z17) {
        for (com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb : this.f450805d.values()) {
            if (c21560x1fce98fb instanceof com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3) {
                ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2480xabe4e85a.C19662x4f7a67f3) c21560x1fce98fb).W(z17);
            }
        }
    }
}
