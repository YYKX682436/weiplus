package sd;

/* loaded from: classes8.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.m f488150d;

    public l(sd.m mVar) {
        this.f488150d = mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        sd.m mVar = this.f488150d;
        sd.v vVar = mVar.f488156g.f488196d;
        sd.k kVar = mVar.f488155f;
        boolean contains = vVar.contains(kVar);
        sd.w wVar = mVar.f488156g;
        if (!contains) {
            wVar.f488196d.push(kVar);
        }
        if (wVar.f488200h != null) {
            return;
        }
        wVar.f488195c.postDelayed(new sd.s(wVar), 200L);
    }
}
