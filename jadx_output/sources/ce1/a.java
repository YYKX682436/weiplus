package ce1;

/* loaded from: classes15.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.os.IInterface f40736d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ce1.b f40737e;

    public a(ce1.b bVar, android.os.IInterface iInterface) {
        this.f40737e = bVar;
        this.f40736d = iInterface;
    }

    @Override // java.lang.Runnable
    public void run() {
        ce1.b bVar = this.f40737e;
        bVar.f40743i.C(bVar.f40739e, bVar.f40740f, this.f40736d, bVar.f40742h);
        bVar.f40738d.unbindService(bVar);
    }
}
