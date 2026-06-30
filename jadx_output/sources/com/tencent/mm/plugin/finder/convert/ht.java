package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes12.dex */
public final class ht extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f103613e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f103614f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f103615g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f103616h;

    public ht(int i17, boolean z17, java.lang.String str, java.lang.String sdkRequestId) {
        kotlin.jvm.internal.o.g(sdkRequestId, "sdkRequestId");
        this.f103613e = i17;
        this.f103614f = z17;
        this.f103615g = str;
        this.f103616h = sdkRequestId;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.dcg;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        js2.d item = (js2.d) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        holder.itemView.setOnClickListener(new com.tencent.mm.plugin.finder.convert.gt(this));
    }
}
