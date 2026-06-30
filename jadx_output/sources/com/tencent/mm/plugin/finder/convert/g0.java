package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class g0 extends com.tencent.mm.plugin.finder.convert.d {

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.feed.k8 f103435i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed currentItem, com.tencent.mm.plugin.finder.feed.k8 contract, android.content.Context context, int i17, kotlin.jvm.internal.i iVar) {
        super(holder, currentItem);
        if ((i17 & 8) != 0) {
            context = holder.itemView.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
        }
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(currentItem, "currentItem");
        kotlin.jvm.internal.o.g(contract, "contract");
        kotlin.jvm.internal.o.g(context, "context");
        this.f103435i = contract;
    }

    @Override // com.tencent.mm.plugin.finder.convert.d, com.tencent.mm.plugin.finder.convert.r0
    public void a() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
    
        if ((r3.length() == 0) != false) goto L12;
     */
    @Override // com.tencent.mm.plugin.finder.convert.d, com.tencent.mm.plugin.finder.convert.s0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b() {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.g0.b():void");
    }
}
