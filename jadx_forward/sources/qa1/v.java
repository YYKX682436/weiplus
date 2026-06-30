package qa1;

/* loaded from: classes14.dex */
public class v implements k63.p0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f442556a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f442557b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.view.SurfaceHolder f442558c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qa1.o f442559d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ qa1.w f442560e;

    public v(qa1.w wVar, int i17, int i18, android.view.SurfaceHolder surfaceHolder, qa1.o oVar) {
        this.f442560e = wVar;
        this.f442556a = i17;
        this.f442557b = i18;
        this.f442558c = surfaceHolder;
        this.f442559d = oVar;
    }

    @Override // k63.p0
    public void a(android.view.Surface surface) {
        ((k63.s) ((k63.o0) i95.n0.c(k63.o0.class))).getClass();
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, new com.p314xaae8f345.mm.p689xc5a27af6.p751x9697b3de.C10616xc4862b57(p60.l.f433709o, null, 0, new com.p314xaae8f345.mm.p1006xc5476f33.p1762x9697b3de.p1765xc84b4196.C16072xd300b5e1(this.f442556a, this.f442557b), 6, null), p60.q.class, null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GameRecordableSurfaceView.LiveImp", "got surface %s", surface);
        qa1.w wVar = this.f442560e;
        wVar.f442562e = surface;
        android.view.SurfaceHolder surfaceHolder = this.f442558c;
        qa1.p pVar = wVar.f442561d;
        pVar.e(surfaceHolder);
        pVar.b(this.f442559d);
    }
}
