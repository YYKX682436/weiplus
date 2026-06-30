package com.tencent.mm.plugin.finder.gallery;

/* loaded from: classes2.dex */
public final class n0 extends com.tencent.mm.plugin.finder.gallery.m {

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed f111394c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderObject f111395d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.tencent.mm.plugin.finder.gallery.a data) {
        super(data);
        kotlin.jvm.internal.o.g(data, "data");
    }

    @Override // com.tencent.mm.plugin.finder.gallery.m, com.tencent.mm.plugin.finder.gallery.d
    public in5.s a(int i17) {
        return !k() ? new in5.s() { // from class: com.tencent.mm.plugin.finder.gallery.FinderGalleryTextStateConfig$buildItemCoverts$1
            @Override // in5.s
            public in5.r getItemConvert(int type) {
                if (type == 2) {
                    return new pd2.a();
                }
                if (type == 4 || type == 9) {
                    return new pd2.a();
                }
                hc2.l.a("FinderStaggeredConfig", type);
                return new com.tencent.mm.plugin.finder.convert.z2();
            }
        } : new com.tencent.mm.plugin.finder.gallery.FinderGalleryDefaultConfig$buildItemCoverts$1(this);
    }

    @Override // com.tencent.mm.plugin.finder.gallery.m, com.tencent.mm.plugin.finder.gallery.d
    public boolean b() {
        return k();
    }

    @Override // com.tencent.mm.plugin.finder.gallery.m, com.tencent.mm.plugin.finder.gallery.d
    public boolean d() {
        return !k();
    }

    @Override // com.tencent.mm.plugin.finder.gallery.m, com.tencent.mm.plugin.finder.gallery.d
    public androidx.recyclerview.widget.p2 e(int i17) {
        return !k() ? new com.tencent.mm.plugin.finder.gallery.m0() : new com.tencent.mm.plugin.finder.gallery.l();
    }

    @Override // com.tencent.mm.plugin.finder.gallery.m, com.tencent.mm.plugin.finder.gallery.d
    public androidx.recyclerview.widget.RecyclerView.LayoutManager f(android.content.Context context, int i17) {
        kotlin.jvm.internal.o.g(context, "context");
        if (k()) {
            return super.f(context, i17);
        }
        androidx.recyclerview.widget.GridLayoutManager gridLayoutManager = new androidx.recyclerview.widget.GridLayoutManager(context, 3);
        gridLayoutManager.setItemPrefetchEnabled(true);
        return gridLayoutManager;
    }

    @Override // com.tencent.mm.plugin.finder.gallery.m, com.tencent.mm.plugin.finder.gallery.d
    public int g() {
        return 10001;
    }

    @Override // com.tencent.mm.plugin.finder.gallery.m, com.tencent.mm.plugin.finder.gallery.d
    public void h(com.tencent.mm.ui.MMActivity activity, int i17, int i18, android.content.Intent intent, com.tencent.mm.plugin.finder.gallery.c curActivity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(curActivity, "curActivity");
        byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra("SELECT_OBJECT") : null;
        if (byteArrayExtra != null) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
            finderObject.parseFrom(byteArrayExtra);
            this.f111395d = finderObject;
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

    @Override // com.tencent.mm.plugin.finder.gallery.m, com.tencent.mm.plugin.finder.gallery.d
    public void i(com.tencent.mm.ui.MMActivity activity, int i17, com.tencent.mm.plugin.finder.model.BaseFinderFeed feed, java.util.List dataList, com.tencent.mm.protobuf.g gVar, boolean z17) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(feed, "feed");
        kotlin.jvm.internal.o.g(dataList, "dataList");
        this.f111394c = feed;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("SELECT_OBJECT", feed.getFeedObject().getFeedObject().toByteArray());
        ((com.tencent.mm.feature.textstatus.StatusThirdShareFeatureService) ((xe0.g0) i95.n0.c(xe0.g0.class))).wi(activity, intent, 10001);
    }

    public final boolean l(int i17, int i18, com.tencent.mm.ui.MMActivity mMActivity, boolean z17) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f111394c;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f111395d;
        if (finderObject == null) {
            finderObject = baseFinderFeed != null ? baseFinderFeed.getFeedObject().getFeedObject() : null;
        }
        com.tencent.mm.plugin.finder.gallery.b0 b0Var = com.tencent.mm.plugin.finder.gallery.b0.f111350a;
        if (i17 != 10001 || i18 != -1 || finderObject == null) {
            if (i17 != 10001) {
                return false;
            }
            if (z17) {
                b0Var.g(finderObject != null ? finderObject.getId() : 0L);
                return false;
            }
            b0Var.e(finderObject != null ? finderObject.getId() : 0L);
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("SELECT_OBJECT", finderObject.toByteArray());
        mMActivity.setResult(-1, intent);
        mMActivity.finish();
        if (z17) {
            b0Var.f(finderObject.getId());
            return true;
        }
        b0Var.c(finderObject.getId());
        return true;
    }
}
