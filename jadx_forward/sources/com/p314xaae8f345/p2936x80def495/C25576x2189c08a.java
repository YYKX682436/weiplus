package com.p314xaae8f345.p2936x80def495;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/tencent/skyline/SkylineJSEngineFactory;", "", "Lcom/tencent/skyline/ISkylineJSEngineCallback;", "callback", "Ljz5/f0;", "createJSEngine", "Lcom/tencent/skyline/ISkylineJSEngineFactory;", "sSkylineJSEngineFactory", "Lcom/tencent/skyline/ISkylineJSEngineFactory;", "getSSkylineJSEngineFactory", "()Lcom/tencent/skyline/ISkylineJSEngineFactory;", "setSSkylineJSEngineFactory", "(Lcom/tencent/skyline/ISkylineJSEngineFactory;)V", "<init>", "()V", "skyline_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.skyline.SkylineJSEngineFactory */
/* loaded from: classes16.dex */
public final class C25576x2189c08a {

    /* renamed from: INSTANCE */
    public static final com.p314xaae8f345.p2936x80def495.C25576x2189c08a f46805x4fbc8495 = new com.p314xaae8f345.p2936x80def495.C25576x2189c08a();
    private static com.p314xaae8f345.p2936x80def495.InterfaceC25565x49ae7413 sSkylineJSEngineFactory = new com.p314xaae8f345.p2936x80def495.InterfaceC25565x49ae7413() { // from class: com.tencent.skyline.SkylineJSEngineFactory$sSkylineJSEngineFactory$1
        @Override // com.p314xaae8f345.p2936x80def495.InterfaceC25565x49ae7413
        /* renamed from: createJSEngine */
        public void mo95656xdcdbf9e7(com.p314xaae8f345.p2936x80def495.InterfaceC25564xc3613e5c callback) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
            callback.m95655xc3989e01(false, -1L, -1L);
        }
    };

    private C25576x2189c08a() {
    }

    /* renamed from: createJSEngine */
    public final void m95749xdcdbf9e7(com.p314xaae8f345.p2936x80def495.InterfaceC25564xc3613e5c callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p2936x80def495.InterfaceC25565x49ae7413 interfaceC25565x49ae7413 = sSkylineJSEngineFactory;
        if (interfaceC25565x49ae7413 != null) {
            interfaceC25565x49ae7413.mo95656xdcdbf9e7(callback);
        }
    }

    /* renamed from: getSSkylineJSEngineFactory */
    public final com.p314xaae8f345.p2936x80def495.InterfaceC25565x49ae7413 m95750x45d20087() {
        return sSkylineJSEngineFactory;
    }

    /* renamed from: setSSkylineJSEngineFactory */
    public final void m95751x5c01e5fb(com.p314xaae8f345.p2936x80def495.InterfaceC25565x49ae7413 interfaceC25565x49ae7413) {
        sSkylineJSEngineFactory = interfaceC25565x49ae7413;
    }
}
