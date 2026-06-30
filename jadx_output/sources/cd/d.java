package cd;

/* loaded from: classes9.dex */
public final class d implements com.tencent.kinda.framework.app.KindaHKFingerprintImpl.BioAuthCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cd.a f40501a;

    public d(cd.a aVar) {
        this.f40501a = aVar;
    }

    @Override // com.tencent.kinda.framework.app.KindaHKFingerprintImpl.BioAuthCallback
    public void onResult(org.json.JSONObject data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f40501a.onCall(data);
    }
}
