package jk1;

/* loaded from: classes7.dex */
public class c extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ jk1.d f381585a;

    public c(jk1.d dVar, jk1.b bVar) {
        this.f381585a = dVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        synchronized (this.f381585a.f381590h) {
            this.f381585a.f381589g = intent;
        }
    }
}
