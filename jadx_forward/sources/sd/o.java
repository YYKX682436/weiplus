package sd;

/* loaded from: classes8.dex */
public class o implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.k f488161d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sd.w f488162e;

    public o(sd.w wVar, sd.k kVar) {
        this.f488162e = wVar;
        this.f488161d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f488162e.j(this.f488161d);
    }
}
