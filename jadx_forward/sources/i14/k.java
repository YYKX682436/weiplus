package i14;

/* loaded from: classes8.dex */
public final class k extends u13.g {

    /* renamed from: q, reason: collision with root package name */
    public p13.y f368864q;

    /* renamed from: r, reason: collision with root package name */
    public wd0.x1 f368865r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.CharSequence f368866s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.CharSequence f368867t;

    /* renamed from: u, reason: collision with root package name */
    public final i14.i f368868u;

    /* renamed from: v, reason: collision with root package name */
    public final i14.j f368869v;

    public k(int i17, int i18) {
        super(22, i17);
        this.f368868u = new i14.i(this);
        this.f368869v = new i14.j(this);
    }

    @Override // u13.g
    public void a(android.content.Context context, u13.e eVar, java.lang.Object... extraData) {
        vd0.c3 c3Var;
        wd0.w1 aj6;
        java.util.Map map;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extraData, "extraData");
        java.util.Arrays.copyOf(extraData, extraData.length);
        p13.r rVar = this.f505295e;
        vd0.z2 z2Var = null;
        java.lang.String str = rVar != null ? rVar.f432663b : null;
        if (str == null) {
            return;
        }
        wd0.y1 y1Var = (wd0.y1) i95.n0.c(wd0.y1.class);
        p13.y yVar = this.f368864q;
        java.lang.String valueOf = java.lang.String.valueOf(yVar != null ? yVar.f432720e : null);
        vd0.l3 l3Var = (vd0.l3) y1Var;
        l3Var.getClass();
        synchronized (l3Var.f516993d) {
            l3Var.Zi();
            vd0.y2 Ni = l3Var.Ni("");
            c3Var = Ni != null ? Ni.f517075b : null;
        }
        if (c3Var != null && (map = c3Var.f516916c) != null) {
            z2Var = (vd0.z2) map.get(valueOf);
        }
        if (c3Var == null || z2Var == null) {
            throw new java.lang.IllegalArgumentException("setting result not found: itemKey=".concat(valueOf));
        }
        java.lang.Boolean bool = (java.lang.Boolean) c3Var.f516917d.get(valueOf);
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        if (r26.n0.N(str)) {
            aj6 = wd0.w1.f526304d;
        } else {
            java.lang.String lowerCase = r26.n0.u0(str).toString().toLowerCase(java.util.Locale.ROOT);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
            aj6 = l3Var.aj(z2Var, lowerCase);
            if (aj6 == null) {
                aj6 = wd0.w1.f526304d;
            }
        }
        wd0.x1 bj6 = l3Var.bj(z2Var, aj6, booleanValue);
        this.f368865r = bj6;
        jz5.l Vi = ((vd0.l3) ((wd0.y1) i95.n0.c(wd0.y1.class))).Vi(bj6, str);
        this.f368866s = (java.lang.CharSequence) Vi.f384366d;
        this.f368867t = (java.lang.CharSequence) Vi.f384367e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(eVar, "null cannot be cast to non-null type com.tencent.mm.plugin.setting.fts.FTSSettingSearchDataItem.FTSSettingSearchViewHolder");
        i14.i iVar = (i14.i) eVar;
        u50.y yVar2 = (u50.y) i95.n0.c(u50.y.class);
        android.view.View view = iVar.f368860a;
        boolean z17 = this.f505294d;
        ((s50.r0) yVar2).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.j(view, z17);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(this.f368866s, iVar.f368861b);
        if (this.f368867t != null) {
            android.widget.TextView textView = iVar.f368862c;
            if (textView != null) {
                textView.setVisibility(0);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.n3.a(this.f368867t, iVar.f368862c);
            return;
        }
        android.widget.TextView textView2 = iVar.f368862c;
        if (textView2 == null) {
            return;
        }
        textView2.setVisibility(8);
    }

    @Override // u13.g
    public java.lang.String f() {
        wd0.x1 x1Var = this.f368865r;
        if (x1Var == null) {
            return null;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(x1Var);
        return x1Var.f526311a;
    }

    @Override // u13.g
    public int j() {
        p13.y yVar = this.f368864q;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(yVar);
        return yVar.f432733r;
    }

    @Override // u13.g
    public u13.f k() {
        return this.f368869v;
    }
}
