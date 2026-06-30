package com.tencent.mm.plugin.finder.gallery;

/* loaded from: classes2.dex */
public final class v extends com.tencent.mm.plugin.finder.gallery.m {

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.model.BaseFinderFeed f111414c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.protocal.protobuf.FinderObject f111415d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(com.tencent.mm.plugin.finder.gallery.a data) {
        super(data);
        kotlin.jvm.internal.o.g(data, "data");
    }

    @Override // com.tencent.mm.plugin.finder.gallery.m, com.tencent.mm.plugin.finder.gallery.d
    public boolean d() {
        return !k();
    }

    @Override // com.tencent.mm.plugin.finder.gallery.m, com.tencent.mm.plugin.finder.gallery.d
    public int g() {
        return 10006;
    }

    @Override // com.tencent.mm.plugin.finder.gallery.m, com.tencent.mm.plugin.finder.gallery.d
    public void h(com.tencent.mm.ui.MMActivity activity, int i17, int i18, android.content.Intent intent, com.tencent.mm.plugin.finder.gallery.c curActivity) {
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(curActivity, "curActivity");
        byte[] byteArrayExtra = intent != null ? intent.getByteArrayExtra("SELECT_OBJECT") : null;
        if (byteArrayExtra != null) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = new com.tencent.mm.protocal.protobuf.FinderObject();
            finderObject.parseFrom(byteArrayExtra);
            this.f111415d = finderObject;
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
        this.f111414c = feed;
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("SELECT_OBJECT", feed.getFeedObject().getFeedObject().toByteArray());
        intent.setClassName(activity, "com.tencent.mm.plugin.masssend.ui.MassSendSelectPreviewFinderActivity");
        activity.startActivityForResult(intent, 10006);
    }

    public final boolean l(int i17, int i18, com.tencent.mm.ui.MMActivity mMActivity, boolean z17) {
        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = this.f111414c;
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = this.f111415d;
        if (finderObject == null) {
            finderObject = baseFinderFeed != null ? baseFinderFeed.getFeedObject().getFeedObject() : null;
        }
        if (i17 != 10006 || i18 != -1 || finderObject == null) {
            return false;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("SELECT_OBJECT", finderObject.toByteArray());
        mMActivity.setResult(-1, intent);
        mMActivity.finish();
        return true;
    }
}
