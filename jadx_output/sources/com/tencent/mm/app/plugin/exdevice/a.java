package com.tencent.mm.app.plugin.exdevice;

/* loaded from: classes11.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f53655d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f53656e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.app.plugin.exdevice.b f53657f;

    public a(com.tencent.mm.app.plugin.exdevice.b bVar, int i17, java.lang.String str) {
        this.f53657f = bVar;
        this.f53655d = i17;
        this.f53656e = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str = this.f53656e;
        int i17 = this.f53655d;
        if (1 == i17) {
            com.tencent.mm.autogen.events.ExDeviceOpInChattingUIEvent exDeviceOpInChattingUIEvent = new com.tencent.mm.autogen.events.ExDeviceOpInChattingUIEvent();
            am.o6 o6Var = exDeviceOpInChattingUIEvent.f54154g;
            o6Var.f7513a = 0;
            o6Var.f7514b = str;
            o6Var.f7515c = this.f53657f.f53658a.g();
            exDeviceOpInChattingUIEvent.e();
            if (str.equals("gh_43f2581f6fd6")) {
                ((ve4.f) com.tencent.mm.sdk.event.q.f192403a.a(ve4.f.class)).O6(1);
            }
        }
        com.tencent.mm.autogen.events.MMSwitchViewPushEvent mMSwitchViewPushEvent = new com.tencent.mm.autogen.events.MMSwitchViewPushEvent();
        am.kj kjVar = mMSwitchViewPushEvent.f54487g;
        kjVar.f7158b = i17;
        kjVar.f7159c = 1;
        kjVar.f7157a = str;
        mMSwitchViewPushEvent.e();
    }
}
