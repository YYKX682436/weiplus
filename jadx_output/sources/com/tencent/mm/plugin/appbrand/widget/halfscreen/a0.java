package com.tencent.mm.plugin.appbrand.widget.halfscreen;

/* loaded from: classes7.dex */
public final class a0 implements com.tencent.mm.plugin.appbrand.widget.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.config.HalfScreenConfig f91150a;

    public a0(com.tencent.mm.plugin.appbrand.config.HalfScreenConfig halfScreenConfig) {
        this.f91150a = halfScreenConfig;
    }

    @Override // com.tencent.mm.plugin.appbrand.widget.o
    public final float[] a(android.content.Context context) {
        return this.f91150a.f77360g.a(context.getResources().getConfiguration().orientation);
    }
}
