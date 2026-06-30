package ik4;

/* loaded from: classes4.dex */
public final class e implements com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoSizeChangedListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ik4.g f373450d;

    public e(ik4.g gVar) {
        this.f373450d = gVar;
    }

    @Override // com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoSizeChangedListener
    /* renamed from: onVideoSizeChanged */
    public final void mo53285xdc9583f7(com.p314xaae8f345.p3006xb8ff1437.api.InterfaceC26164x73fc6bc6 interfaceC26164x73fc6bc6, long j17, long j18) {
        ik4.g gVar = this.f373450d;
        for (com.p314xaae8f345.p3006xb8ff1437.api.C26165x53666e9a.IOnVideoSizeChangedListener iOnVideoSizeChangedListener : gVar.f373460v) {
            gVar.f373463y = j17;
            gVar.f373464z = j18;
            iOnVideoSizeChangedListener.mo53285xdc9583f7(interfaceC26164x73fc6bc6, j17, j18);
        }
    }
}
