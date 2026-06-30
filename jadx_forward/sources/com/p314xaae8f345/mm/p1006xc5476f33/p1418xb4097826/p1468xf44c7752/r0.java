package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752;

/* loaded from: classes2.dex */
public final class r0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj {

    /* renamed from: y, reason: collision with root package name */
    public final int f192935y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f192936z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, int i17) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f192935y = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void C() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122 abstractC13919x46aff122 = this.f188103t;
        if (abstractC13919x46aff122 != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.AbstractC13919x46aff122.m56346x54c164a7(abstractC13919x46aff122, false, 1, null);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void G(ym5.s3 reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var = this.f187957g;
        if (i0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.t0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(i0Var, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.gallery.FinderGalleryTimelineContract.ViewCallback");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.t0 t0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.t0) i0Var;
            if (reason.f545054f) {
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 m82555x4905e9fa = t0Var.o().m82555x4905e9fa();
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = m82555x4905e9fa.getLayoutManager();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutManager, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.view.manager.FinderLinearLayoutManager");
                int w17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1671x31c90fad.C15415x74224fd8) layoutManager).w() + 1;
                if (w17 < t0Var.a().m82898xfb7e5820().size()) {
                    m82555x4905e9fa.post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.s0(m82555x4905e9fa, w17));
                }
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public void P() {
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj
    public void X(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 model, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.gj callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(model, "model");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        super.X(model, callback);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.i0 i0Var = this.f187957g;
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf a17 = i0Var != null ? i0Var.a() : null;
        if (a17 == null) {
            return;
        }
        a17.F = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.q0(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.dj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.c0
    public in5.s h() {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.gallery.FinderGalleryTimelineContract$Presenter$buildItemCoverts$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                if (type == 2) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.r0.this.getClass();
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.p0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.r0.this, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.r0.this.f187960m);
                }
                if (type == 4) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.r0 r0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.r0.this;
                    cw2.f8 f8Var = r0Var.f187962o;
                    r0Var.getClass();
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.o0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.r0.this, f8Var, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.r0.this.f187960m);
                }
                if (type != 9) {
                    if (type != 2003) {
                        hc2.l.a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.r0.this.f188102s, type);
                        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.r0 r0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.r0.this;
                    com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = r0Var2.f187954d;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.th(r0Var2, ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activity).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6(), 0);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.r0 r0Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.r0.this;
                cw2.f8 f8Var2 = r0Var3.f187962o;
                r0Var3.getClass();
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.r0 r0Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.r0.this;
                int i17 = r0Var4.f187960m;
                com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context = r0Var4.f187954d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.zf(f8Var2, r0Var3, false, i17, nyVar != null ? nyVar.f216913n : 0);
            }
        };
    }
}
