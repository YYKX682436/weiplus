package com.tencent.mm.mj_publisher.finder.movie_composing.panel.base;

/* loaded from: classes5.dex */
public abstract class l extends qv0.f {
    public final ex0.r I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(android.content.Context context, ex0.r focusedSegmentVM) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(focusedSegmentVM, "focusedSegmentVM");
        this.I = focusedSegmentVM;
    }

    public final ex0.r getFocusedSegmentVM() {
        return this.I;
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void p() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        androidx.lifecycle.c1 a17 = zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(gx0.bf.class);
        kotlin.jvm.internal.o.f(a17, "get(...)");
        ((gx0.bf) a17).o7(this.I.l(), true);
    }

    @Override // com.tencent.mm.mj_publisher.finder.movie_composing.panel.base.BaseComposingPanel
    public void t() {
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        gx0.bf bfVar = (gx0.bf) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(gx0.bf.class);
        bfVar.getClass();
        com.tencent.maas.model.time.MJTimeRange PositiveInfiniteTimeRange = com.tencent.maas.model.time.MJTimeRange.PositiveInfiniteTimeRange;
        kotlin.jvm.internal.o.f(PositiveInfiniteTimeRange, "PositiveInfiniteTimeRange");
        bfVar.o7(PositiveInfiniteTimeRange, true);
    }
}
