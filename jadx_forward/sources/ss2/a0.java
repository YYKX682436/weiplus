package ss2;

/* loaded from: classes10.dex */
public final class a0 implements ry2.n, ut3.d {
    public android.os.Bundle A;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf f493438d;

    /* renamed from: e, reason: collision with root package name */
    public final ry2.o f493439e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f493440f;

    /* renamed from: g, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15327x51a31969 f493441g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewGroup f493442h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.ImageView f493443i;

    /* renamed from: m, reason: collision with root package name */
    public java.util.ArrayList f493444m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f493445n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f493446o;

    /* renamed from: p, reason: collision with root package name */
    public int f493447p;

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f493448q;

    /* renamed from: r, reason: collision with root package name */
    public java.util.ArrayList f493449r;

    /* renamed from: s, reason: collision with root package name */
    public final java.util.ArrayList f493450s;

    /* renamed from: t, reason: collision with root package name */
    public java.util.ArrayList f493451t;

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f493452u;

    /* renamed from: v, reason: collision with root package name */
    public java.util.ArrayList f493453v;

    /* renamed from: w, reason: collision with root package name */
    public java.util.ArrayList f493454w;

    /* renamed from: x, reason: collision with root package name */
    public final jz5.g f493455x;

    /* renamed from: y, reason: collision with root package name */
    public final jz5.g f493456y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.ArrayList f493457z;

    public a0(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, ry2.o postDataManager) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(postDataManager, "postDataManager");
        this.f493438d = activity;
        this.f493439e = postDataManager;
        this.f493445n = "";
        this.f493446o = "";
        this.f493448q = new java.util.ArrayList();
        new java.util.LinkedList();
        this.f493450s = new java.util.ArrayList();
        this.f493452u = new java.util.ArrayList();
        this.f493455x = jz5.h.b(new ss2.o(this));
        this.f493456y = jz5.h.b(ss2.x.f493525d);
        this.f493457z = kz5.c0.d(new ss2.m());
    }

    public static final void c(ss2.a0 a0Var, int i17) {
        java.lang.Object obj = a0Var.f493457z.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        in5.c cVar = (in5.c) obj;
        boolean z17 = cVar instanceof ss2.m;
        boolean z18 = true;
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf = a0Var.f493438d;
        if (z17) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0((android.content.Context) abstractActivityC21394xb3d2c0cf, 1, true);
            k0Var.f293405n = ss2.y.f493526d;
            k0Var.f293414s = new ss2.z(a0Var);
            k0Var.v();
            return;
        }
        if (cVar instanceof ss2.n) {
            android.content.Intent intent = new android.content.Intent();
            intent.setClassName(abstractActivityC21394xb3d2c0cf, "com.tencent.mm.plugin.sns.ui.SnsUploadBrowseUI");
            intent.putExtra("sns_gallery_position", i17);
            java.util.ArrayList arrayList = a0Var.f493444m;
            if (arrayList != null && !arrayList.isEmpty()) {
                z18 = false;
            }
            if (z18) {
                intent.putExtra("sns_gallery_temp_paths", a0Var.f493449r);
            } else {
                intent.putExtra("sns_gallery_temp_paths", a0Var.f493444m);
            }
            intent.putExtra("key_from_scene", 7);
            abstractActivityC21394xb3d2c0cf.startActivityForResult(intent, 8485);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    @Override // ry2.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ry2.r0 a() {
        /*
            Method dump skipped, instructions count: 859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ss2.a0.a():ry2.r0");
    }

    @Override // ry2.n
    public android.view.View b() {
        android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(this.f493438d).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dcf, (android.view.ViewGroup) null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(inflate, "inflate(...)");
        this.f493440f = inflate;
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.pyu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f493441g = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15327x51a31969) findViewById;
        android.view.View view = this.f493440f;
        if (view == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.pyw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f493442h = (android.view.ViewGroup) findViewById2;
        android.view.View view2 = this.f493440f;
        if (view2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
            throw null;
        }
        android.view.View findViewById3 = view2.findViewById(com.p314xaae8f345.mm.R.id.pyv);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f493443i = (android.widget.ImageView) findViewById3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15327x51a31969 c15327x51a31969 = this.f493441g;
        if (c15327x51a31969 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("photoGridView");
            throw null;
        }
        c15327x51a31969.m62274x6cc57722(true);
        e();
        android.view.View view3 = this.f493440f;
        if (view3 != null) {
            return view3;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("rootView");
        throw null;
    }

    @Override // ut3.d
    public boolean c5(android.content.Context context, android.os.Bundle bundle, ut3.c cVar) {
        return false;
    }

    public final int d() {
        java.util.ArrayList arrayList = this.f493444m;
        if (!(arrayList == null || arrayList.isEmpty())) {
            return 4;
        }
        java.util.ArrayList arrayList2 = this.f493449r;
        return !(arrayList2 == null || arrayList2.isEmpty()) ? 2 : 1;
    }

    public final void e() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15327x51a31969 c15327x51a31969 = this.f493441g;
        if (c15327x51a31969 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("photoGridView");
            throw null;
        }
        java.util.ArrayList arrayList = this.f493457z;
        c15327x51a31969.b(arrayList.size());
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15327x51a31969 c15327x51a319692 = this.f493441g;
        if (c15327x51a319692 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("photoGridView");
            throw null;
        }
        java.util.List<android.view.View> m62271xf9bd9d24 = c15327x51a319692.m62271xf9bd9d24();
        int i17 = 0;
        for (java.lang.Object obj : arrayList) {
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            in5.c cVar = (in5.c) obj;
            android.view.View view = m62271xf9bd9d24.get(i17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.ui.MMImageView");
            com.p314xaae8f345.mm.ui.C21405x85fc1ce0 c21405x85fc1ce0 = (com.p314xaae8f345.mm.ui.C21405x85fc1ce0) view;
            if (cVar instanceof ss2.n) {
                c21405x85fc1ce0.setColorFilter(0);
                c21405x85fc1ce0.setAlpha(1.0f);
                android.graphics.drawable.Drawable drawable = c21405x85fc1ce0.getDrawable();
                android.graphics.drawable.Drawable mutate = drawable != null ? drawable.mutate() : null;
                if (mutate != null) {
                    mutate.setAlpha(255);
                }
                c21405x85fc1ce0.setPadding(0, 0, 0, 0);
                c21405x85fc1ce0.setOnClickListener(new ss2.s(this, i17));
            } else if (cVar instanceof ss2.m) {
                c21405x85fc1ce0.setOnClickListener(new ss2.t(this, i17));
                float q17 = i65.a.q(this.f493438d);
                if (q17 > 1.4f) {
                    q17 = 1.4f;
                }
                int intValue = (int) (((java.lang.Number) ((jz5.n) this.f493455x).mo141623x754a37bb()).intValue() / q17);
                c21405x85fc1ce0.setPadding(intValue, intValue, intValue, intValue);
                c21405x85fc1ce0.setImageDrawable(com.p314xaae8f345.mm.ui.uk.e(c21405x85fc1ce0.getContext(), com.p314xaae8f345.mm.R.raw.f80873x3bd419f7, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.a(com.p314xaae8f345.mm.R.C30859x5a72f63.f77762x20e833)));
            }
            i17 = i18;
        }
    }

    @Override // ut3.d
    public void k3(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16991x15ced046 c16991x15ced046, android.os.Bundle bundle) {
    }

    @Override // ut3.d
    public void r3(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1987xbb85ad5b.C16994x3ba8255 c16994x3ba8255, android.os.Bundle bundle) {
    }
}
