package ey5;

/* loaded from: classes13.dex */
public class i implements com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f339186a;

    public i(ey5.r rVar, java.lang.Runnable runnable) {
        this.f339186a = runnable;
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback
    /* renamed from: onCancel */
    public void mo99149x3d6f0539() {
        java.lang.Runnable runnable = this.f339186a;
        if (runnable != null) {
            runnable.run();
        }
    }

    @Override // com.p314xaae8f345.p2981xfaaf2ff7.p2985xbf8bc95e.p2986x330697.InterfaceC25961x718093f7.CancelableCallback
    /* renamed from: onFinish */
    public void mo99150x42fe6352() {
        java.lang.Runnable runnable = this.f339186a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
