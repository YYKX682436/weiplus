package j8;

/* loaded from: classes15.dex */
public class n implements j8.b {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f379657a;

    /* renamed from: b, reason: collision with root package name */
    public final j8.a f379658b;

    /* renamed from: c, reason: collision with root package name */
    public final j8.m f379659c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.OrientationEventListener f379660d;

    /* renamed from: e, reason: collision with root package name */
    public j8.h f379661e = null;

    public n(android.content.Context context, j8.a aVar, j8.m mVar) {
        this.f379657a = context;
        this.f379658b = aVar;
        this.f379659c = mVar;
    }

    @Override // j8.b
    public void a() {
        if (this.f379660d != null) {
            this.f379658b.a(this.f379661e);
            return;
        }
        j8.l lVar = new j8.l(this, this.f379657a, this.f379659c.f379656d);
        this.f379660d = lVar;
        if (lVar.canDetectOrientation()) {
            this.f379660d.enable();
        }
    }

    @Override // j8.b
    public void b() {
        android.view.OrientationEventListener orientationEventListener = this.f379660d;
        if (orientationEventListener == null) {
            return;
        }
        orientationEventListener.disable();
        this.f379660d = null;
    }
}
