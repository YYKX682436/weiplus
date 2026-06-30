package h5;

/* loaded from: classes13.dex */
public class c extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h5.d f360514a;

    public c(h5.d dVar) {
        this.f360514a = dVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent != null) {
            this.f360514a.f(context, intent);
        }
    }
}
