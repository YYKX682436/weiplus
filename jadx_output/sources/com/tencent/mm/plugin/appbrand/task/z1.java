package com.tencent.mm.plugin.appbrand.task;

/* loaded from: classes5.dex */
public final class z1 extends java.lang.IllegalStateException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(com.tencent.luggage.sdk.processes.LuggageServiceType type) {
        super("unexpected service type:" + type.name());
        kotlin.jvm.internal.o.g(type, "type");
    }
}
