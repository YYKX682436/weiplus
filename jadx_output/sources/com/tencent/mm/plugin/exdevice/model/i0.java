package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes13.dex */
public class i0 implements com.tencent.mm.plugin.exdevice.model.c1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.o0 f98919a;

    public i0(com.tencent.mm.plugin.exdevice.model.o0 o0Var) {
        this.f98919a = o0Var;
    }

    public void a(long j17, int i17, int i18, int i19, long j18) {
        java.util.LinkedList linkedList;
        com.tencent.mm.plugin.exdevice.model.o0 o0Var = this.f98919a;
        java.lang.String f17 = a42.i.f(j17);
        synchronized (o0Var.f99012a) {
            linkedList = new java.util.LinkedList(o0Var.f99012a);
        }
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.exdevice.model.m0) it.next()).V0(f17, i18, j18);
        }
        linkedList.clear();
        java.util.Iterator it6 = ((java.util.HashMap) o0Var.f99013b).values().iterator();
        while (it6.hasNext()) {
            ((com.tencent.mm.plugin.exdevice.model.m0) it6.next()).V0(f17, i18, j18);
        }
        com.tencent.mm.autogen.events.ExDeviceSimpleBTOnConnectStateEvent exDeviceSimpleBTOnConnectStateEvent = new com.tencent.mm.autogen.events.ExDeviceSimpleBTOnConnectStateEvent();
        exDeviceSimpleBTOnConnectStateEvent.f54173g.getClass();
        exDeviceSimpleBTOnConnectStateEvent.f54173g.getClass();
        exDeviceSimpleBTOnConnectStateEvent.f54173g.getClass();
        exDeviceSimpleBTOnConnectStateEvent.b(android.os.Looper.getMainLooper());
    }
}
