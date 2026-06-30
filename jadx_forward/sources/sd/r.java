package sd;

/* loaded from: classes8.dex */
public class r implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.k f488179d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sd.w f488180e;

    public r(sd.w wVar, sd.k kVar) {
        this.f488180e = wVar;
        this.f488179d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f488180e.f488195c.removeView(((sd.u0) this.f488179d).f488187h);
    }
}
