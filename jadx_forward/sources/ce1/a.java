package ce1;

/* loaded from: classes15.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.IInterface f122269d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ce1.b f122270e;

    public a(ce1.b bVar, android.os.IInterface iInterface) {
        this.f122270e = bVar;
        this.f122269d = iInterface;
    }

    @Override // java.lang.Runnable
    public void run() {
        ce1.b bVar = this.f122270e;
        bVar.f122276i.C(bVar.f122272e, bVar.f122273f, this.f122269d, bVar.f122275h);
        bVar.f122271d.unbindService(bVar);
    }
}
