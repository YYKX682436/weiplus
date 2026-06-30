package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class z3 extends kotlin.jvm.internal.q implements yz5.l {
    public final /* synthetic */ java.lang.String C;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI f110790d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(java.lang.String str, com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI finderGallerySearchUI) {
        super(1);
        this.C = str;
        this.f110790d = finderGallerySearchUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        com.tencent.mm.plugin.finder.feed.ui.FinderGallerySearchUI finderGallerySearchUI = this.f110790d;
        java.lang.String str = finderGallerySearchUI.B;
        java.lang.String str2 = this.C;
        if (kotlin.jvm.internal.o.b(str2, str)) {
            finderGallerySearchUI.d7(fVar != null ? fVar.f70615a : 0, fVar != null ? fVar.f70616b : 0, fVar != null ? (r45.tu2) fVar.f70618d : null);
        } else {
            com.tencent.mars.xlog.Log.i("Finder.FinderGallerySearchUI", "ignore expired search next page result, currentRequestId:" + str2 + " requestId:" + finderGallerySearchUI.B);
        }
        return jz5.f0.f302826a;
    }
}
