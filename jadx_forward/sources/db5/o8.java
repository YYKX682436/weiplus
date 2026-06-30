package db5;

/* loaded from: classes15.dex */
public class o8 extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f309994a;

    /* renamed from: b, reason: collision with root package name */
    public long f309995b;

    public o8(java.lang.ref.WeakReference weakReference) {
        this.f309994a = weakReference;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e c21520x5bb48e5e;
        mo50303x856b99f0(message.what);
        java.lang.ref.WeakReference weakReference = this.f309994a;
        if (weakReference == null || (c21520x5bb48e5e = (com.p314xaae8f345.mm.ui.p2642x2e06d1.C21520x5bb48e5e) weakReference.get()) == null || message.what != 1) {
            return;
        }
        db5.y7 y7Var = c21520x5bb48e5e.E;
        if (y7Var == null || y7Var.f310116a) {
            c21520x5bb48e5e.f279148m.mo50303x856b99f0(1);
        } else {
            y7Var.a();
            mo50307xb9e94560(message.what, this.f309995b);
        }
    }
}
