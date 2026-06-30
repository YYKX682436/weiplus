package com.tencent.mm.plugin.finder.convert;

@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00020\u00040\u0003B\u001d\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/tencent/mm/plugin/finder/convert/FinderFeedFullConvert$StateListener", "Lcom/tencent/mm/plugin/finder/model/BaseFinderFeed;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Lcom/tencent/mm/sdk/event/IListener;", "Lcom/tencent/mm/autogen/events/FeedContactChangeEvent;", "Lcom/tencent/mm/plugin/finder/convert/qe;", "parent", "Lin5/s0;", "holder", "<init>", "(Lcom/tencent/mm/plugin/finder/convert/qe;Lin5/s0;)V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderFeedFullConvert$StateListener<T extends com.tencent.mm.plugin.finder.model.BaseFinderFeed> extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FeedContactChangeEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.convert.qe f102826d;

    /* renamed from: e, reason: collision with root package name */
    public final in5.s0 f102827e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public FinderFeedFullConvert$StateListener(com.tencent.mm.plugin.finder.convert.qe r4, in5.s0 r5) {
        /*
            r3 = this;
            java.lang.String r0 = "parent"
            kotlin.jvm.internal.o.g(r4, r0)
            java.lang.String r0 = "holder"
            kotlin.jvm.internal.o.g(r5, r0)
            android.content.Context r0 = r5.f293121e
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity"
            kotlin.jvm.internal.o.e(r0, r1)
            r2 = r0
            com.tencent.mm.ui.MMActivity r2 = (com.tencent.mm.ui.MMActivity) r2
            r3.<init>(r2)
            r3.f102826d = r4
            r3.f102827e = r5
            boolean r5 = r0 instanceof com.tencent.mm.ui.MMActivity
            if (r5 == 0) goto L2f
            kotlin.jvm.internal.o.e(r0, r1)
            com.tencent.mm.ui.MMActivity r0 = (com.tencent.mm.ui.MMActivity) r0
            androidx.lifecycle.o r5 = r0.mo133getLifecycle()
            com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$uiLifecycleObserver$1 r4 = r4.R
            r5.a(r4)
        L2f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.convert.FinderFeedFullConvert$StateListener.<init>(com.tencent.mm.plugin.finder.convert.qe, in5.s0):void");
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.FeedContactChangeEvent feedContactChangeEvent) {
        com.tencent.mm.autogen.events.FeedContactChangeEvent event = feedContactChangeEvent;
        kotlin.jvm.internal.o.g(event, "event");
        pm0.v.X(new com.tencent.mm.plugin.finder.convert.v8(this, event));
        return false;
    }
}
