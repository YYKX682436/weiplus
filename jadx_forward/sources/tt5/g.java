package tt5;

/* loaded from: classes14.dex */
public class g extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2 f503583a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2 abstractTextureViewSurfaceTextureListenerC25495xcec752e2, android.os.Looper looper) {
        super(looper);
        this.f503583a = abstractTextureViewSurfaceTextureListenerC25495xcec752e2;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        this.f503583a.f296839i = java.lang.System.currentTimeMillis();
        if (((qt5.c) this.f503583a.f296835e).f448191c) {
            if (!"auto".equals(((qt5.c) this.f503583a.f296835e).d(true))) {
                ((qt5.c) this.f503583a.f296835e).j("auto");
            }
            com.p314xaae8f345.p2928x71e6eee8.ui.AbstractTextureViewSurfaceTextureListenerC25495xcec752e2 abstractTextureViewSurfaceTextureListenerC25495xcec752e2 = this.f503583a;
            qt5.c cVar = (qt5.c) abstractTextureViewSurfaceTextureListenerC25495xcec752e2.f296835e;
            if (cVar.f448189a != null && cVar.f448191c) {
                try {
                    cVar.f448189a.autoFocus(abstractTextureViewSurfaceTextureListenerC25495xcec752e2);
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.w(qt5.c.f448188u, "autoFocus() " + e17.getMessage());
                }
            }
            com.p314xaae8f345.p2943x68b0d85.p2944xbe97f590.Log.i("ScanView", "do auto focus");
        }
    }
}
