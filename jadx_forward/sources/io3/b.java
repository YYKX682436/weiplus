package io3;

/* loaded from: classes13.dex */
public class b extends com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ io3.c f375032a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(io3.c cVar, java.lang.String str) {
        super(str);
        this.f375032a = cVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.n3
    /* renamed from: handleMessage */
    public void mo1038x5b586cbf(android.os.Message message) {
        try {
            this.f375032a.a(message);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.NormsgSensorEngine", "NormsgSensorEngineWorker handle msg error:" + th6.getMessage());
        }
    }
}
