package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes2.dex */
public final class gi {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f216057a;

    /* renamed from: b, reason: collision with root package name */
    public final int f216058b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f216059c;

    /* renamed from: d, reason: collision with root package name */
    public int f216060d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.TextView f216061e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f216062f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f216063g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f216064h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.ViewGroup f216065i;

    /* renamed from: j, reason: collision with root package name */
    public final android.widget.TextView f216066j;

    /* renamed from: k, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15322xff344627 f216067k;

    /* renamed from: l, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hi f216068l;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [int] */
    /* JADX WARN: Type inference failed for: r15v4 */
    public gi(java.lang.Object tab, int i17, boolean z17, boolean z18, boolean z19) {
        float f17;
        float f18;
        boolean z27;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ei eiVar;
        int i18;
        android.widget.ImageView imageView;
        android.content.Context context;
        android.content.res.Resources resources;
        android.view.View findViewById;
        int i19;
        boolean z28;
        android.view.View findViewById2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tab, "tab");
        this.f216057a = tab;
        this.f216058b = i17;
        this.f216059c = z19;
        this.f216068l = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.hi(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.fi.f215938d);
        if (z19) {
            zx2.u uVar = tab instanceof zx2.u ? (zx2.u) tab : null;
            if (uVar != null) {
                uVar.f558614a = this;
            }
        } else {
            oa.i iVar = tab instanceof oa.i ? (oa.i) tab : null;
            if (iVar != null) {
                iVar.f425311a = this;
            }
        }
        if (z17) {
            f18 = 15.0f * 1.0f * j65.f.g();
            f17 = 400;
        } else {
            android.content.Context context2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
            java.lang.Object systemService = context2.getSystemService("window");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
            android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            float f19 = displayMetrics.density;
            f17 = context2.getResources().getDisplayMetrics().density;
            f18 = 15.0f * f19;
        }
        float f27 = f18 / f17;
        int color = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560797ug);
        d92.f fVar = d92.f.f309003a;
        if (i17 == 1) {
            int i27 = z18 ? com.p314xaae8f345.mm.R.C30864xbddafb2a.e7n : com.p314xaae8f345.mm.R.C30864xbddafb2a.akc;
            if (z19) {
                zx2.u uVar2 = tab instanceof zx2.u ? (zx2.u) tab : null;
                if (uVar2 != null) {
                    uVar2.c(i27);
                }
            } else {
                oa.i iVar2 = tab instanceof oa.i ? (oa.i) tab : null;
                if (iVar2 != null) {
                    iVar2.c(i27);
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ei eiVar2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl.M;
            android.view.View a17 = eiVar2.a(this);
            android.widget.TextView textView = a17 != null ? (android.widget.TextView) a17.findViewById(com.p314xaae8f345.mm.R.id.nuw) : null;
            this.f216061e = textView;
            android.view.View a18 = eiVar2.a(this);
            if (a18 == null || (findViewById2 = a18.findViewById(com.p314xaae8f345.mm.R.id.nvk)) == null) {
                i19 = 1;
                z28 = false;
            } else {
                i19 = 1;
                z28 = false;
                d92.f.o(fVar, findViewById2, true, false, false, 4, null);
            }
            if (textView != null) {
                textView.setTextSize(i19, f27);
            }
            android.view.View a19 = eiVar2.a(this);
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = a19 != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) a19.findViewById(com.p314xaae8f345.mm.R.id.nuz) : null;
            this.f216062f = c22699x3dcdb352;
            if (c22699x3dcdb352 != null) {
                d92.f.o(fVar, c22699x3dcdb352, true, false, false, 4, null);
            }
            android.view.View a27 = eiVar2.a(this);
            this.f216063g = a27 != null ? (android.widget.ImageView) a27.findViewById(com.p314xaae8f345.mm.R.id.f568729nv0) : null;
            android.view.View a28 = eiVar2.a(this);
            this.f216064h = a28 != null ? (android.widget.ImageView) a28.findViewById(com.p314xaae8f345.mm.R.id.f564903ah1) : null;
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79777xe843128);
            }
            z27 = z28;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ei eiVar3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl.M;
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl.N.contains(java.lang.Integer.valueOf(i17))) {
                int i28 = z18 ? com.p314xaae8f345.mm.R.C30864xbddafb2a.e7o : com.p314xaae8f345.mm.R.C30864xbddafb2a.akb;
                if (z19) {
                    zx2.u uVar3 = tab instanceof zx2.u ? (zx2.u) tab : null;
                    if (uVar3 != null) {
                        uVar3.c(i28);
                    }
                } else {
                    oa.i iVar3 = tab instanceof oa.i ? (oa.i) tab : null;
                    if (iVar3 != null) {
                        iVar3.c(i28);
                    }
                }
                android.view.View a29 = eiVar3.a(this);
                if (a29 == null || (findViewById = a29.findViewById(com.p314xaae8f345.mm.R.id.nvk)) == null) {
                    eiVar = eiVar3;
                    i18 = 1;
                    z27 = false;
                } else {
                    eiVar = eiVar3;
                    i18 = 1;
                    z27 = false;
                    d92.f.o(fVar, findViewById, true, false, false, 4, null);
                }
                android.view.View a37 = eiVar.a(this);
                android.widget.TextView textView2 = a37 != null ? (android.widget.TextView) a37.findViewById(com.p314xaae8f345.mm.R.id.nuw) : null;
                this.f216061e = textView2;
                if (textView2 != null) {
                    textView2.setTextSize(i18, f27);
                }
                android.view.View a38 = eiVar.a(this);
                this.f216063g = a38 != null ? (android.widget.ImageView) a38.findViewById(com.p314xaae8f345.mm.R.id.nut) : null;
                android.view.View a39 = eiVar.a(this);
                this.f216064h = a39 != null ? (android.widget.ImageView) a39.findViewById(com.p314xaae8f345.mm.R.id.f564902ah0) : null;
                android.view.View a47 = eiVar.a(this);
                android.view.ViewGroup viewGroup = a47 != null ? (android.view.ViewGroup) a47.findViewById(com.p314xaae8f345.mm.R.id.nuy) : null;
                this.f216065i = viewGroup;
                if (viewGroup != null && (imageView = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.nux)) != null) {
                    rr.v.a(imageView, com.p314xaae8f345.mm.R.raw.f79166x83ef8a31, (viewGroup == null || (context = viewGroup.getContext()) == null || (resources = context.getResources()) == null) ? z27 : resources.getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
                }
                android.view.View a48 = eiVar.a(this);
                android.widget.TextView textView3 = a48 != null ? (android.widget.TextView) a48.findViewById(com.p314xaae8f345.mm.R.id.f568730nv1) : null;
                this.f216066j = textView3;
                if (textView3 != null) {
                    textView3.setTextSize(i18, 9.0f);
                }
                android.view.View a49 = eiVar.a(this);
                this.f216067k = a49 != null ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15322xff344627) a49.findViewById(com.p314xaae8f345.mm.R.id.s7q) : null;
            } else {
                z27 = false;
                if (z19) {
                    zx2.u uVar4 = tab instanceof zx2.u ? (zx2.u) tab : null;
                    if (uVar4 != null) {
                        uVar4.c(com.p314xaae8f345.mm.R.C30864xbddafb2a.aka);
                    }
                } else {
                    oa.i iVar4 = tab instanceof oa.i ? (oa.i) tab : null;
                    if (iVar4 != null) {
                        iVar4.c(com.p314xaae8f345.mm.R.C30864xbddafb2a.aka);
                    }
                }
            }
        }
        b(color, z27);
    }

    public final void a(boolean z17) {
        android.widget.TextView textView = this.f216061e;
        if (textView != null) {
            if (z17) {
                com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
            } else {
                textView.getPaint().setFakeBoldText(false);
                textView.getPaint().setStrokeWidth(0.0f);
            }
        }
    }

    public final void b(int i17, boolean z17) {
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff c2718xca2902ff;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1677xa36c9c24.C15436x4c00d79 c15436x4c00d79;
        android.widget.TextView textView = this.f216061e;
        if (textView != null) {
            textView.setTextColor(i17);
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = this.f216062f;
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.m82040x7541828(i17);
        }
        int i18 = this.f216058b;
        if (z17) {
            return;
        }
        boolean z18 = this.f216059c;
        java.lang.Object obj = this.f216057a;
        if (z18) {
            zx2.u uVar = obj instanceof zx2.u ? (zx2.u) obj : null;
            if (uVar == null || (c15436x4c00d79 = uVar.f558620g) == null) {
                return;
            }
            c15436x4c00d79.m62994xc75d81ec(i17);
            return;
        }
        oa.i iVar = obj instanceof oa.i ? (oa.i) obj : null;
        if (iVar == null || (c2718xca2902ff = iVar.f425317g) == null) {
            return;
        }
        c2718xca2902ff.m20368xc75d81ec(i17);
    }

    public final void c(int i17) {
        java.lang.String str;
        android.content.Context context;
        android.content.res.Resources resources;
        android.widget.TextView textView = this.f216061e;
        int i18 = this.f216058b;
        if (i18 == 4 && !hc2.e.a()) {
            if (textView == null) {
                return;
            }
            textView.setText(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(i17));
        } else {
            if (textView == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            android.view.View a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.bl.M.a(this);
            if (a17 == null || (context = a17.getContext()) == null || (resources = context.getResources()) == null || (str = resources.getString(i17)) == null) {
                str = "";
            }
            textView.setText(t70Var.H2(i18, str));
        }
    }
}
