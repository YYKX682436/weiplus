package com.tencent.mm.plugin.brandservice.ui.timeline;

/* loaded from: classes.dex */
class BizTimeLineMusicImp$1 extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.MusicPlayerEvent> {
    public BizTimeLineMusicImp$1(com.tencent.mm.plugin.brandservice.ui.timeline.j3 j3Var, androidx.lifecycle.y yVar) {
        super(yVar);
        this.__eventId = -1155728636;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.MusicPlayerEvent musicPlayerEvent) {
        int i17 = musicPlayerEvent.f54512g.f7036b;
        if (i17 == 0 || i17 == 1 || i17 == 2 || i17 == 3 || i17 == 4 || i17 == 7) {
            throw null;
        }
        return false;
    }
}
