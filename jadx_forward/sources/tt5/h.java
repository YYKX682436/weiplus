package tt5;

/* loaded from: classes13.dex */
public class h extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2 f503584a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2 abstractTextureViewSurfaceTextureListenerC25495xcec752e2, android.os.Looper looper) {
        super(looper);
        this.f503584a = abstractTextureViewSurfaceTextureListenerC25495xcec752e2;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        this.f503584a.f296838h = java.lang.System.currentTimeMillis();
        com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanView", "take one shot");
        if (((qt5.c) this.f503584a.f296835e).f448191c) {
            com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2 abstractTextureViewSurfaceTextureListenerC25495xcec752e2 = this.f503584a;
            ((qt5.c) abstractTextureViewSurfaceTextureListenerC25495xcec752e2.f296835e).n(abstractTextureViewSurfaceTextureListenerC25495xcec752e2);
        }
    }
}
