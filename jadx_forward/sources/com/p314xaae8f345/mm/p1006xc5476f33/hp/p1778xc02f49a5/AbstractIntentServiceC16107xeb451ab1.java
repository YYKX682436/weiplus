package com.p314xaae8f345.mm.p1006xc5476f33.hp.p1778xc02f49a5;

/* renamed from: com.tencent.mm.plugin.hp.mmdiff.AbstractMMdiffResultService */
/* loaded from: classes11.dex */
public abstract class AbstractIntentServiceC16107xeb451ab1 extends android.app.IntentService {
    public AbstractIntentServiceC16107xeb451ab1() {
        super("TinkerResultService");
    }

    public abstract void a(x73.a aVar);

    @Override // android.app.IntentService
    public void onHandleIntent(android.content.Intent intent) {
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.AbstractMMdiffResultService", "AbstractMMdiffResultService received a null intent, ignoring.");
        } else {
            a((x73.a) ak0.a0.a(intent, "result_extra"));
        }
    }
}
