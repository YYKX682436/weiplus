package com.p314xaae8f345.mm.p1006xc5476f33.hp.p1778xc02f49a5;

/* renamed from: com.tencent.mm.plugin.hp.mmdiff.MMDiffPatchResultService */
/* loaded from: classes11.dex */
public class IntentServiceC16110x65c2df15 extends com.p314xaae8f345.mm.p1006xc5476f33.hp.p1778xc02f49a5.AbstractIntentServiceC16107xeb451ab1 {

    /* renamed from: e, reason: collision with root package name */
    public static x73.i f223931e;

    /* renamed from: f, reason: collision with root package name */
    public static x73.i f223932f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f223933d = true;

    public static void b(android.content.Context context, x73.a aVar, boolean z17) {
        try {
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.hp.p1778xc02f49a5.IntentServiceC16110x65c2df15.class);
            intent.putExtra("result_extra", aVar);
            intent.putExtra("needKillProccess", z17);
            context.startService(intent);
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.MMDiffPatchResultService.HdiffApk", "run result service fail, exception:" + th6);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.hp.p1778xc02f49a5.AbstractIntentServiceC16107xeb451ab1
    public void a(x73.a aVar) {
        x73.i iVar;
        x73.i iVar2;
        if (aVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.MMDiffPatchResultService.HdiffApk", "MMDiffPatchResultService received null result!!!!");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.MMDiffPatchResultService.HdiffApk", "MMDiffPatchResultService receive result: %s, needKillProccess = %s", aVar.m175136x9616526c(), java.lang.Boolean.valueOf(this.f223933d));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Tinker.MMDiffPatchResultService.HdiffApk", "isAuto = %s, autoResultCallBack = %s, maunalResultCallBack = %s.", java.lang.Boolean.valueOf(aVar.f533972f), f223932f, f223931e);
        if (aVar.f533972f && (iVar2 = f223932f) != null) {
            iVar2.a(aVar);
        }
        if (aVar.f533972f || (iVar = f223931e) == null) {
            return;
        }
        iVar.a(aVar);
    }

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.hp.p1778xc02f49a5.AbstractIntentServiceC16107xeb451ab1, android.app.IntentService
    public void onHandleIntent(android.content.Intent intent) {
        if (intent == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Tinker.MMDiffPatchResultService.HdiffApk", "AbstractResultService received a null intent, ignoring.");
            return;
        }
        x73.a aVar = (x73.a) ak0.a0.a(intent, "result_extra");
        this.f223933d = intent.getBooleanExtra("needKillProccess", true);
        a(aVar);
    }
}
