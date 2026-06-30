package eg2;

/* loaded from: classes3.dex */
public final class n extends eg2.c0 {

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f334122g;

    /* renamed from: h, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1497x5a753b7.C14215x6ef072f6 f334123h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl f334124i;

    /* renamed from: m, reason: collision with root package name */
    public final p3325xe03a0797.p3326xc267989b.y0 f334125m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f334126n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f334127o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f334128p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f334129q;

    /* renamed from: r, reason: collision with root package name */
    public int f334130r;

    /* renamed from: s, reason: collision with root package name */
    public yz5.p f334131s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ju3.d0 status, android.view.ViewGroup parent, qc0.a editContext) {
        super(status, parent, editContext);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(editContext, "editContext");
        this.f334122g = jz5.h.b(new eg2.m(parent));
        this.f334125m = p3325xe03a0797.p3326xc267989b.z0.b();
        this.f334130r = 1;
    }

    public static final void a(eg2.n nVar, boolean z17) {
        yz5.p pVar;
        yz5.p pVar2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1497x5a753b7.C14215x6ef072f6 c14215x6ef072f6 = nVar.f334123h;
        if (c14215x6ef072f6 != null) {
            c14215x6ef072f6.m56826x773c2518(false);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderCoverHDCheckboxPlugin", "onCheckboxToggled: isChecked=" + z17 + ", localHDPath=" + nVar.f334126n + ", originalImagePath=" + nVar.f334127o);
        te2.m3.f499757a.a(te2.j3.f499667g, nVar.f334130r == 2 ? te2.l3.f499734e : te2.l3.f499733d, 0L);
        ut3.f.f512709c.f512711b.putBoolean("has_apply_hd", z17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderCoverHDCheckboxPlugin", "onCheckboxToggled: set EXTRA_KEY_HAS_APPLY_HD=" + z17 + " to extData");
        if (z17) {
            java.lang.String str = nVar.f334126n;
            if (str == null || (pVar2 = nVar.f334131s) == null) {
                return;
            }
            pVar2.mo149xb9724478(java.lang.Boolean.TRUE, str);
            return;
        }
        java.lang.String str2 = nVar.f334127o;
        if (str2 == null || (pVar = nVar.f334131s) == null) {
            return;
        }
        pVar.mo149xb9724478(java.lang.Boolean.FALSE, str2);
    }

    public static final void b(eg2.n nVar, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1497x5a753b7.C14215x6ef072f6 c14215x6ef072f6;
        if (nVar.f334128p && (c14215x6ef072f6 = nVar.f334123h) != null) {
            c14215x6ef072f6.setVisibility(z17 ? 4 : 0);
        }
    }

    @Override // yt3.r2
    /* renamed from: onAttach */
    public void mo10988x3b13c504() {
        qc0.a aVar = this.f334079f;
        android.os.Bundle bundle = aVar.f442881c.M;
        this.f334127o = bundle != null ? bundle.getString("original_image_path") : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16993xacc19624 c16993xacc19624 = aVar.f442881c;
        android.os.Bundle bundle2 = c16993xacc19624.M;
        this.f334129q = bundle2 != null ? bundle2.getBoolean("show_hd_red_dot", false) : false;
        android.os.Bundle bundle3 = c16993xacc19624.M;
        this.f334130r = bundle3 != null ? bundle3.getInt("hd_scene", 1) : 1;
        if (this.f334123h == null) {
            android.view.ViewGroup viewGroup = this.f334078e;
            android.view.View childAt = viewGroup.getChildAt(0);
            android.view.ViewGroup viewGroup2 = childAt instanceof android.view.ViewGroup ? (android.view.ViewGroup) childAt : null;
            if (viewGroup2 == null) {
                viewGroup2 = viewGroup;
            }
            android.content.Context context = viewGroup.getContext();
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561237cz);
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1497x5a753b7.C14215x6ef072f6 c14215x6ef072f6 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1497x5a753b7.C14215x6ef072f6(context, null, 0, 6, null);
            c14215x6ef072f6.m56825x405278aa(new eg2.e(this));
            this.f334123h = c14215x6ef072f6;
            viewGroup2.addView(c14215x6ef072f6, new android.widget.RelativeLayout.LayoutParams(-2, dimensionPixelSize2));
            viewGroup2.post(new eg2.f(this, dimensionPixelSize));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1497x5a753b7.C14215x6ef072f6 c14215x6ef072f62 = this.f334123h;
        if (c14215x6ef072f62 != null) {
            c14215x6ef072f62.setVisibility(8);
        }
        jz5.g gVar = this.f334122g;
        ((hk0.u0) ((jz5.n) gVar).mo141623x754a37bb()).Z6(2, new eg2.g(this));
        ((hk0.u0) ((jz5.n) gVar).mo141623x754a37bb()).Z6(3, new eg2.h(this));
        ((hk0.u0) ((jz5.n) gVar).mo141623x754a37bb()).Z6(4, new eg2.i(this));
        ((hk0.u0) ((jz5.n) gVar).mo141623x754a37bb()).a7(1, new eg2.j(this));
    }

    @Override // yt3.r2
    /* renamed from: onDetach */
    public void mo10989x3f5eee52() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderCoverHDCheckboxPlugin", "onDetach");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sl slVar = this.f334124i;
        if (slVar != null) {
            slVar.dismiss();
        }
        this.f334124i = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1497x5a753b7.C14215x6ef072f6 c14215x6ef072f6 = this.f334123h;
        if (c14215x6ef072f6 != null) {
            c14215x6ef072f6.setVisibility(8);
        }
        p3325xe03a0797.p3326xc267989b.z0.e(this.f334125m, null, 1, null);
    }
}
