package com.tencent.mm.plugin.exdevice.model;

/* loaded from: classes11.dex */
public class h0 implements com.tencent.mm.plugin.exdevice.model.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.ExDeviceOpInChattingUIEvent f98914a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.exdevice.model.o0 f98915b;

    public h0(com.tencent.mm.plugin.exdevice.model.o0 o0Var, com.tencent.mm.autogen.events.ExDeviceOpInChattingUIEvent exDeviceOpInChattingUIEvent) {
        this.f98915b = o0Var;
        this.f98914a = exDeviceOpInChattingUIEvent;
    }

    @Override // com.tencent.mm.plugin.exdevice.model.z1
    public void a(boolean z17) {
        if (z17) {
            am.o6 o6Var = this.f98914a.f54154g;
            this.f98915b.i(o6Var.f7513a, o6Var.f7514b);
        }
    }
}
