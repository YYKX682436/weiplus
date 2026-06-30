package com.tencent.mm.plugin.account.bind.ui;

/* loaded from: classes14.dex */
public class NeedVerifyQQEventListener extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.NeedVerifyQQEvent> implements p61.d5 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.autogen.events.NeedVerifyQQEvent f73091d;

    public NeedVerifyQQEventListener(androidx.lifecycle.y yVar) {
        super(yVar);
        this.__eventId = -1913553765;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.NeedVerifyQQEvent needVerifyQQEvent) {
        com.tencent.mm.autogen.events.NeedVerifyQQEvent needVerifyQQEvent2 = needVerifyQQEvent;
        this.f73091d = needVerifyQQEvent2;
        new p61.f5(needVerifyQQEvent2.f54517g.f7553a, this).a();
        return false;
    }
}
