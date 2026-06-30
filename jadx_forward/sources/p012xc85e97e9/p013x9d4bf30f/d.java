package p012xc85e97e9.p013x9d4bf30f;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f90564d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.IntentSender.SendIntentException f90565e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p013x9d4bf30f.e f90566f;

    public d(p012xc85e97e9.p013x9d4bf30f.e eVar, int i17, android.content.IntentSender.SendIntentException sendIntentException) {
        this.f90566f = eVar;
        this.f90564d = i17;
        this.f90565e = sendIntentException;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f90566f.a(this.f90564d, 0, new android.content.Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f90565e));
    }
}
