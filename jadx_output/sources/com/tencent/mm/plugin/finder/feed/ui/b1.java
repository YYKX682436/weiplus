package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class b1 implements com.tencent.mm.ui.de {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderBaseFeedUI f109692a;

    public b1(com.tencent.mm.plugin.finder.feed.ui.FinderBaseFeedUI finderBaseFeedUI) {
        this.f109692a = finderBaseFeedUI;
    }

    @Override // com.tencent.mm.ui.de
    public void a() {
        vb2.m mVar = this.f109692a.f109219t;
        if (mVar != null) {
            mVar.f434679o.setImageResource(com.tencent.mm.R.raw.icons_outlined_merge);
        } else {
            kotlin.jvm.internal.o.o("finderFullActionBarLayoutBinding");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.de
    public void b() {
        vb2.m mVar = this.f109692a.f109219t;
        if (mVar != null) {
            mVar.f434679o.setImageResource(com.tencent.mm.R.raw.icons_outlined_sperated);
        } else {
            kotlin.jvm.internal.o.o("finderFullActionBarLayoutBinding");
            throw null;
        }
    }
}
