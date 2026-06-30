package com.tencent.mm.plugin.appbrand.keylogger;

/* loaded from: classes5.dex */
public class o implements kg1.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f84165a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ lg1.a f84166b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f84167c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserDetailActivity f84168d;

    public o(com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserDetailActivity keyStepAnalyserDetailActivity, java.util.Map map, lg1.a aVar, android.content.Context context) {
        this.f84168d = keyStepAnalyserDetailActivity;
        this.f84165a = map;
        this.f84166b = aVar;
        this.f84167c = context;
    }

    @Override // kg1.l
    public void a(kg1.m mVar) {
        int type = mVar.f307706a.getType();
        kg1.g gVar = mVar.f307706a;
        int b17 = gVar.b();
        java.lang.Integer valueOf = java.lang.Integer.valueOf(b17);
        java.util.Map map = this.f84165a;
        lg1.a aVar = map.containsKey(valueOf) ? (lg1.a) map.get(java.lang.Integer.valueOf(b17)) : this.f84166b;
        kg1.a b18 = mVar.b();
        com.tencent.mm.plugin.appbrand.keylogger.KeyStepAnalyserDetailActivity keyStepAnalyserDetailActivity = this.f84168d;
        android.content.Context context = this.f84167c;
        if (type == 1) {
            lg1.c cVar = new lg1.c(context);
            cVar.setStep((lg1.b) keyStepAnalyserDetailActivity.f84119u.get(((kg1.h) mVar.b()).f307694b));
            aVar.addView(cVar);
            return;
        }
        lg1.a aVar2 = new lg1.a(context, type == 3);
        if (map.size() > 0) {
            aVar2.setHasBorder(true);
        }
        if (b18 != null) {
            aVar2.setStep((lg1.b) keyStepAnalyserDetailActivity.f84119u.get(((kg1.h) b18).f307694b));
        }
        aVar.addView(aVar2);
        map.put(java.lang.Integer.valueOf(gVar.c()), aVar2);
    }
}
