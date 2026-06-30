package com.tencent.mm.plugin.emoji.sync;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes12.dex */
public class BKGLoaderManager$2 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ActivateEvent> {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.emoji.sync.k f97613d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BKGLoaderManager$2(com.tencent.mm.plugin.emoji.sync.k kVar, androidx.lifecycle.y yVar) {
        super(yVar);
        this.f97613d = kVar;
        this.__eventId = -1435144905;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.ActivateEvent activateEvent) {
        final com.tencent.mm.autogen.events.ActivateEvent activateEvent2 = activateEvent;
        ((ku5.t0) ku5.t0.f312615d).h(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.emoji.sync.BKGLoaderManager$2$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.plugin.emoji.sync.BKGLoaderManager$2 bKGLoaderManager$2 = com.tencent.mm.plugin.emoji.sync.BKGLoaderManager$2.this;
                bKGLoaderManager$2.getClass();
                com.tencent.mm.autogen.events.ActivateEvent activateEvent3 = activateEvent2;
                if (!(activateEvent3 instanceof com.tencent.mm.autogen.events.ActivateEvent) || activateEvent3.f53964g.f6412a) {
                    return;
                }
                bKGLoaderManager$2.f97613d.f();
            }
        }, "BKG-mActivateEvent");
        return false;
    }
}
