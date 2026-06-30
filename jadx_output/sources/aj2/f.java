package aj2;

/* loaded from: classes8.dex */
public final class f extends com.tencent.mm.view.recyclerview.WxRecyclerAdapter {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.util.ArrayList dataList, final java.lang.String anchorUserId, final yz5.l micEvent) {
        super(new in5.s(anchorUserId, micEvent) { // from class: com.tencent.mm.plugin.finder.live.mic.preview.FinderLiveMicSelectRecyclerAdapter$MicChangeLayoutFactory
            private final java.lang.String anchorUserId;
            private final yz5.l micEvent;

            {
                kotlin.jvm.internal.o.g(anchorUserId, "anchorUserId");
                kotlin.jvm.internal.o.g(micEvent, "micEvent");
                this.anchorUserId = anchorUserId;
                this.micEvent = micEvent;
            }

            public final java.lang.String getAnchorUserId() {
                return this.anchorUserId;
            }

            @Override // in5.s
            public in5.r getItemConvert(int type) {
                return new aj2.c(this.anchorUserId, this.micEvent);
            }

            public final yz5.l getMicEvent() {
                return this.micEvent;
            }
        }, dataList, false);
        kotlin.jvm.internal.o.g(dataList, "dataList");
        kotlin.jvm.internal.o.g(anchorUserId, "anchorUserId");
        kotlin.jvm.internal.o.g(micEvent, "micEvent");
    }
}
