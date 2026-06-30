package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class vh extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final int f104789e;

    public vh(int i17) {
        this.f104789e = i17;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.f488813ai2;
    }

    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        so2.m1 item = (so2.m1) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mars.xlog.Log.i("FinderFeedLiveListItemConvert", "[updateLiveList]onBindViewHolder holder:" + holder + " tabType:" + this.f104789e + ",position:" + i17 + ",type:" + i18 + ',' + item);
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
