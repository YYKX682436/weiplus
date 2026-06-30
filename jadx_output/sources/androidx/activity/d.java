package androidx.activity;

/* loaded from: classes13.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f9031d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.IntentSender.SendIntentException f9032e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.activity.e f9033f;

    public d(androidx.activity.e eVar, int i17, android.content.IntentSender.SendIntentException sendIntentException) {
        this.f9033f = eVar;
        this.f9031d = i17;
        this.f9032e = sendIntentException;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f9033f.a(this.f9031d, 0, new android.content.Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", this.f9032e));
    }
}
