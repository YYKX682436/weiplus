package on;

/* loaded from: classes11.dex */
public class a implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f428259d;

    public a(on.b bVar, java.lang.String str) {
        this.f428259d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        rn.h hVar = new rn.h();
        java.lang.String str = this.f428259d;
        hVar.f66385x37548063 = str;
        hVar.f66386xae782d0e = 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("ChatroomContactOnStorageChanged", "onNotifyChange username:%s result:%s", str, java.lang.Boolean.valueOf(((nn.j) i95.n0.c(nn.j.class)).Di().mo880xb970c2b9(hVar)));
    }
}
