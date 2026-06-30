package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ah extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.k8 f102885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.bh f102886e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah(com.tencent.mm.plugin.finder.feed.k8 k8Var, com.tencent.mm.plugin.finder.convert.bh bhVar) {
        super(0);
        this.f102885d = k8Var;
        this.f102886e = bhVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        final com.tencent.mm.ui.MMActivity f122643d = this.f102885d.getF122643d();
        final com.tencent.mm.plugin.finder.convert.bh bhVar = this.f102886e;
        return new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FinderEnhanceActionEvent>(f122643d) { // from class: com.tencent.mm.plugin.finder.convert.FinderFeedFullVideoConvert$listener$2$1
            {
                this.__eventId = -1276602516;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FinderEnhanceActionEvent finderEnhanceActionEvent) {
                com.tencent.mm.autogen.events.FinderEnhanceActionEvent event = finderEnhanceActionEvent;
                kotlin.jvm.internal.o.g(event, "event");
                pm0.v.X(new com.tencent.mm.plugin.finder.convert.zg(com.tencent.mm.plugin.finder.convert.bh.this, event));
                return false;
            }
        };
    }
}
