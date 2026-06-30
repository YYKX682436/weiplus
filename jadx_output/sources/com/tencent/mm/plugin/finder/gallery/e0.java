package com.tencent.mm.plugin.finder.gallery;

/* loaded from: classes2.dex */
public final class e0 extends com.tencent.mm.plugin.finder.gallery.m {

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed f111363c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(com.tencent.mm.plugin.finder.gallery.a data) {
        super(data);
        kotlin.jvm.internal.o.g(data, "data");
    }

    @Override // com.tencent.mm.plugin.finder.gallery.m, com.tencent.mm.plugin.finder.gallery.d
    public in5.s a(int i17) {
        return new in5.s() { // from class: com.tencent.mm.plugin.finder.gallery.FinderGalleryRingToneConfig$buildItemCoverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == 2) {
                    return new com.tencent.mm.plugin.finder.gallery.d0(com.tencent.mm.plugin.finder.gallery.e0.this);
                }
                if (type == 4 || type == 9) {
                    return new com.tencent.mm.plugin.finder.gallery.c0(com.tencent.mm.plugin.finder.gallery.e0.this);
                }
                hc2.l.a("FinderStaggeredConfig", type);
                return new com.tencent.mm.plugin.finder.convert.z2();
            }
        };
    }

    @Override // com.tencent.mm.plugin.finder.gallery.m, com.tencent.mm.plugin.finder.gallery.d
    public void h(com.tencent.mm.ui.MMActivity activity, int i17, int i18, android.content.Intent intent, com.tencent.mm.plugin.finder.gallery.c curActivity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(curActivity, "curActivity");
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

    @Override // com.tencent.mm.plugin.finder.gallery.m, com.tencent.mm.plugin.finder.gallery.d
    public void i(com.tencent.mm.ui.MMActivity activity, int i17, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, java.util.List dataList, com.tencent.mm.protobuf.g gVar, boolean z17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(dataList, "dataList");
        if (feed.getFeedObject().getMediaType() != 4) {
            return;
        }
        this.f111363c = feed;
    }

    public final boolean l(int i17, int i18, com.tencent.mm.ui.MMActivity mMActivity, boolean z17) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f111363c;
        com.tencent.mm.plugin.finder.gallery.b0 b0Var = com.tencent.mm.plugin.finder.gallery.b0.f111350a;
        if (i17 != 10002 || i18 != -1 || baseFinderFeed == null) {
            if (i17 != 10002) {
                return false;
            }
            if (z17) {
                b0Var.g(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L);
                return false;
            }
            b0Var.e(baseFinderFeed != null ? baseFinderFeed.getItemId() : 0L);
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("SELECT_OBJECT", baseFinderFeed.getFeedObject().getFeedObject().toByteArray());
        mMActivity.setResult(-1, intent);
        mMActivity.finish();
        if (z17) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed2 = this.f111363c;
            b0Var.f(baseFinderFeed2 != null ? baseFinderFeed2.getItemId() : 0L);
            return true;
        }
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed3 = this.f111363c;
        b0Var.c(baseFinderFeed3 != null ? baseFinderFeed3.getItemId() : 0L);
        return true;
    }
}
