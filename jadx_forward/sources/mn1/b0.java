package mn1;

/* loaded from: classes12.dex */
public class b0 extends android.content.BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ mn1.z f411361a;

    public b0(mn1.z zVar) {
        this.f411361a = zVar;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent != null && java.util.Objects.equals(intent.getAction(), io.p3284xd2ae381c.p3310xe3a677a0.p3311x72a369b7.p3312xd0d13ae7.C28751x907cc752.f71926x1a5a11be)) {
            mn1.z.a(this.f411361a, true);
        }
    }
}
