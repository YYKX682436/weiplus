package com.tencent.mm.console;

/* loaded from: classes11.dex */
public class CommandLine extends com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.CommandProcessorEvent> {
    public CommandLine() {
        super(com.tencent.mm.app.a0.f53288d);
        this.__eventId = 1064607011;
    }

    @Override // com.tencent.mm.sdk.event.IListener
    public boolean callback(com.tencent.mm.autogen.events.CommandProcessorEvent commandProcessorEvent) {
        com.tencent.mm.autogen.events.CommandProcessorEvent commandProcessorEvent2 = commandProcessorEvent;
        am.j3 j3Var = commandProcessorEvent2.f54071h;
        am.i3 i3Var = commandProcessorEvent2.f54070g;
        j3Var.f7008a = com.tencent.mm.console.k0.e(i3Var.f6898b, i3Var.f6897a, i3Var.f6899c);
        return false;
    }
}
