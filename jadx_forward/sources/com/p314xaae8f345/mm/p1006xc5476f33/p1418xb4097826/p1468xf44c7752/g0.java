package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752;

/* loaded from: classes2.dex */
public final class g0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m {

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f192899c;

    /* renamed from: d, reason: collision with root package name */
    public int f192900d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f192901e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.a data) {
        super(data);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d
    public in5.s a(int i17) {
        return !k() ? new in5.s() { // from class: com.tencent.mm.plugin.finder.gallery.FinderGallerySnsCoverConfig$buildItemCoverts$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                if (type == 2) {
                    return new pd2.a();
                }
                if (type == 4 || type == 9) {
                    return new pd2.a();
                }
                hc2.l.a("FinderStaggeredConfig", type);
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
            }
        } : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.C14148x24cc0f8f(this);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d
    public boolean b() {
        return k();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d
    public boolean d() {
        return !k();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.p2 e(int i17) {
        return !k() ? new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.f0() : new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.l();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d
    public p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager f(android.content.Context context, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (k()) {
            return super.f(context, i17);
        }
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d(context, 3);
        c1161x57298f5d.m8091xc21abdf5(true);
        return c1161x57298f5d;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d
    public int g() {
        return com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d
    public void h(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, int i17, int i18, android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.c curActivity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curActivity, "curActivity");
        if (intent != null) {
            this.f192900d = intent.getIntExtra("TAB_TYPE", 0);
        }
        byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra("SELECT_OBJECT") : null;
        if (byteArrayExtra != null) {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
            c19792x256d2725.mo11468x92b714fd(byteArrayExtra);
            this.f192901e = c19792x256d2725;
        }
        int ordinal = curActivity.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                return;
            }
            l(i17, i18, activity, true);
        } else if (!l(i17, i18, activity, false) && i17 == 20000 && i18 == -1) {
            activity.setResult(-1, intent);
            activity.finish();
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d
    public void i(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, java.util.List dataList, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, boolean z17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        this.f192899c = feed;
        android.content.Intent intent = new android.content.Intent();
        this.f192900d = i17;
        intent.putExtra("SELECT_OBJECT", feed.getFeedObject().getFeedObject().mo14344x5f01b1f6());
        ((com.p314xaae8f345.mm.p689xc5a27af6.p765xa4f4bf5f.C10691x3b04d9e9) ((xe0.g0) i95.n0.c(xe0.g0.class))).wi(activity, intent, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6);
    }

    public final boolean l(int i17, int i18, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f192899c;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f192901e;
        if (c19792x256d2725 == null) {
            c19792x256d2725 = abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.getFeedObject().getFeedObject() : null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.b0 b0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.b0.f192883a;
        if (i17 != 10003 || i18 != -1 || c19792x256d2725 == null) {
            if (i17 != 10003) {
                return false;
            }
            if (z17) {
                b0Var.g(c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L);
                return false;
            }
            b0Var.e(c19792x256d2725 != null ? c19792x256d2725.m76784x5db1b11() : 0L);
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("SELECT_OBJECT", c19792x256d2725.mo14344x5f01b1f6());
        intent.putExtra("SELECT_TAB_TYPE", this.f192900d);
        abstractActivityC21394xb3d2c0cf.setResult(-1, intent);
        abstractActivityC21394xb3d2c0cf.finish();
        if (z17) {
            b0Var.f(c19792x256d2725.m76784x5db1b11());
            return true;
        }
        b0Var.c(c19792x256d2725.m76784x5db1b11());
        return true;
    }
}
