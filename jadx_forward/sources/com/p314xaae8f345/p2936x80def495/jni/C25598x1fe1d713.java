package com.p314xaae8f345.p2936x80def495.jni;

/* renamed from: com.tencent.skyline.jni.NativeHandler */
/* loaded from: classes7.dex */
public class C25598x1fe1d713 implements com.p314xaae8f345.p2936x80def495.jni.InterfaceC25590x8820556a {
    private static final java.lang.String TAG = "NativeHandler";

    /* renamed from: nativeHandlerProxy */
    private com.p314xaae8f345.p2936x80def495.jni.InterfaceC25590x8820556a f46915x3df1bafb;

    /* renamed from: checkAndPost */
    public void m95918xc8fb3cef(long j17) {
        mo95901xc8fb3cef(com.p314xaae8f345.p2936x80def495.jni.RunnableC25599xda94c74.m95920x78ca8d1c(j17));
    }

    /* renamed from: init */
    public void m95919x316510(com.p314xaae8f345.p2936x80def495.jni.InterfaceC25590x8820556a interfaceC25590x8820556a) {
        this.f46915x3df1bafb = interfaceC25590x8820556a;
    }

    @Override // com.p314xaae8f345.p2936x80def495.jni.InterfaceC25590x8820556a
    /* renamed from: checkAndPost */
    public void mo95901xc8fb3cef(java.lang.Runnable runnable) {
        com.p314xaae8f345.p2936x80def495.jni.InterfaceC25590x8820556a interfaceC25590x8820556a = this.f46915x3df1bafb;
        if (interfaceC25590x8820556a != null) {
            interfaceC25590x8820556a.mo95901xc8fb3cef(runnable);
        }
    }
}
