package dl;

/* loaded from: classes10.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f316644d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f316645e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f316646f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dl.t f316647g;

    public n(dl.t tVar, float f17, float f18, float f19) {
        this.f316647g = tVar;
        this.f316644d = f17;
        this.f316645e = f18;
        this.f316646f = f19;
    }

    @Override // java.lang.Runnable
    public void run() {
        dl.t tVar = this.f316647g;
        ok.c cVar = tVar.H;
        cVar.f427453k = 1000L;
        android.graphics.Rect rect = tVar.f316663x;
        cVar.f427448f = this.f316645e;
        cVar.f427449g = this.f316646f;
        cVar.f427450h = rect;
        cVar.f427451i.set(rect);
        cVar.f427447e = this.f316644d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.CropArtist", "onAnimationEnd to launch hide nine grid");
        tVar.M();
        tVar.H.b();
    }
}
