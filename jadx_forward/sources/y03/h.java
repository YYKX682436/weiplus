package y03;

/* loaded from: classes14.dex */
public class h implements p012xc85e97e9.p093xedfae76a.y {

    /* renamed from: d, reason: collision with root package name */
    public final android.graphics.SurfaceTexture f540177d;

    /* renamed from: e, reason: collision with root package name */
    public y03.i f540178e = null;

    /* renamed from: f, reason: collision with root package name */
    public yz5.p f540179f = null;

    /* renamed from: g, reason: collision with root package name */
    public final p012xc85e97e9.p093xedfae76a.b0 f540180g = new p012xc85e97e9.p093xedfae76a.b0(this, true);

    public h(android.graphics.SurfaceTexture surfaceTexture) {
        p012xc85e97e9.p093xedfae76a.j0 j0Var = new p012xc85e97e9.p093xedfae76a.j0();
        this.f540177d = surfaceTexture;
        j0Var.mo7806x9d92d11c(this, new p012xc85e97e9.p093xedfae76a.k0() { // from class: y03.h$$b
            @Override // p012xc85e97e9.p093xedfae76a.k0
            /* renamed from: onChanged */
            public final void mo525x7bb163d5(java.lang.Object obj) {
                android.util.Size size = (android.util.Size) obj;
                y03.i iVar = y03.h.this.f540178e;
                if (iVar != null) {
                    iVar.a(size.getWidth(), size.getHeight());
                }
            }
        });
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return this.f540180g;
    }
}
