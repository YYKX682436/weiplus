package d13;

/* loaded from: classes14.dex */
public final class a implements p012xc85e97e9.p093xedfae76a.k0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ d13.c f307254d;

    public a(d13.c cVar) {
        this.f307254d = cVar;
    }

    @Override // p012xc85e97e9.p093xedfae76a.k0
    /* renamed from: onChanged */
    public void mo525x7bb163d5(java.lang.Object obj) {
        d13.b bVar;
        android.util.Size size = (android.util.Size) obj;
        if (size == null || (bVar = this.f307254d.f307256e) == null) {
            return;
        }
        int width = size.getWidth();
        int height = size.getHeight();
        b13.g gVar = (b13.g) bVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FlutterVoipMgr", "onSurfaceTextureSizeChanged: width=" + width + ", height=" + height);
        gVar.f98635a.j(gVar.f98636b, width, height, gVar.f98637c);
    }
}
