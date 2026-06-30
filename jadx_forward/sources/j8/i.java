package j8;

/* loaded from: classes15.dex */
public class i extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j8.j f379644a;

    public i(j8.j jVar) {
        this.f379644a = jVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        j8.j jVar = this.f379644a;
        j8.h a17 = jVar.f379646a.a();
        if (a17.equals(jVar.f379650e)) {
            return;
        }
        jVar.f379650e = a17;
        jVar.f379648c.a(a17);
    }
}
