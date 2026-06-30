package com.tencent.mm.plugin.finder.gallery;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/tencent/mm/plugin/finder/gallery/FinderGalleryDefaultConfig$buildItemCoverts$1", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderGalleryDefaultConfig$buildItemCoverts$1 implements in5.s {
    final /* synthetic */ com.tencent.mm.plugin.finder.gallery.m this$0;

    public FinderGalleryDefaultConfig$buildItemCoverts$1(com.tencent.mm.plugin.finder.gallery.m mVar) {
        this.this$0 = mVar;
    }

    @Override // in5.s
    public in5.r getItemConvert(int type) {
        if (type == 2) {
            return new com.tencent.mm.plugin.finder.gallery.k(this.this$0);
        }
        if (type == 4 || type == 9) {
            return new com.tencent.mm.plugin.finder.gallery.j(this.this$0);
        }
        hc2.l.a("FinderStaggeredConfig", type);
        return new com.tencent.mm.plugin.finder.convert.z2();
    }
}
