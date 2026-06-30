package sd;

/* loaded from: classes8.dex */
public class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sd.k f488176d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sd.w f488177e;

    public q(sd.w wVar, sd.k kVar) {
        this.f488177e = wVar;
        this.f488176d = kVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        sd.w wVar = this.f488177e;
        if (((android.app.Activity) wVar.f488194b).isFinishing()) {
            return;
        }
        sd.k kVar = wVar.f488196d.size() == 0 ? null : (sd.k) wVar.f488196d.pop();
        if (kVar != null) {
            wVar.j(kVar);
        }
        sd.v vVar = wVar.f488196d;
        sd.k kVar2 = this.f488176d;
        vVar.push(kVar2);
        wVar.f488195c.addView(((sd.u0) kVar2).f488187h);
        kVar2.h();
    }
}
