package aj2;

/* loaded from: classes8.dex */
public final class f extends com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22848x6ddd90cf {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(java.util.ArrayList dataList, final java.lang.String anchorUserId, final yz5.l micEvent) {
        super(new in5.s(anchorUserId, micEvent) { // from class: com.tencent.mm.plugin.finder.live.mic.preview.FinderLiveMicSelectRecyclerAdapter$MicChangeLayoutFactory
            private final java.lang.String anchorUserId;
            private final yz5.l micEvent;

            {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUserId, "anchorUserId");
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micEvent, "micEvent");
                this.anchorUserId = anchorUserId;
                this.micEvent = micEvent;
            }

            public final java.lang.String getAnchorUserId() {
                return this.anchorUserId;
            }

            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                return new aj2.c(this.anchorUserId, this.micEvent);
            }

            public final yz5.l getMicEvent() {
                return this.micEvent;
            }
        }, dataList, false);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(anchorUserId, "anchorUserId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(micEvent, "micEvent");
    }
}
