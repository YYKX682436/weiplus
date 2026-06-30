package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752;

/* loaded from: classes2.dex */
public final class e0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m {

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f192896c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.a data) {
        super(data);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d
    public in5.s a(int i17) {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.gallery.FinderGalleryRingToneConfig$buildItemCoverts$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                if (type == 2) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.e0.this);
                }
                if (type == 4 || type == 9) {
                    return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.c0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.e0.this);
                }
                hc2.l.a("FinderStaggeredConfig", type);
                return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.z2();
            }
        };
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.m, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.d
    public void h(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity, int i17, int i18, android.content.Intent intent, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.c curActivity) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(curActivity, "curActivity");
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
        if (feed.getFeedObject().getMediaType() != 4) {
            return;
        }
        this.f192896c = feed;
    }

    public final boolean l(int i17, int i18, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f192896c;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.b0 b0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.b0.f192883a;
        if (i17 != 10002 || i18 != -1 || abstractC14490x69736cb5 == null) {
            if (i17 != 10002) {
                return false;
            }
            if (z17) {
                b0Var.g(abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L);
                return false;
            }
            b0Var.e(abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L);
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("SELECT_OBJECT", abstractC14490x69736cb5.getFeedObject().getFeedObject().mo14344x5f01b1f6());
        abstractActivityC21394xb3d2c0cf.setResult(-1, intent);
        abstractActivityC21394xb3d2c0cf.finish();
        if (z17) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = this.f192896c;
            b0Var.f(abstractC14490x69736cb52 != null ? abstractC14490x69736cb52.mo2128x1ed62e84() : 0L);
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb53 = this.f192896c;
        b0Var.c(abstractC14490x69736cb53 != null ? abstractC14490x69736cb53.mo2128x1ed62e84() : 0L);
        return true;
    }
}
