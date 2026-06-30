package com.tencent.mm.plugin.appbrand.ui;

/* loaded from: classes3.dex */
public class da implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f89667d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f89668e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.ui.ga f89669f;

    public da(com.tencent.mm.plugin.appbrand.ui.ga gaVar, java.lang.String str, java.lang.String str2) {
        this.f89669f = gaVar;
        this.f89667d = str;
        this.f89668e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.ui.ga gaVar = this.f89669f;
        java.util.HashMap hashMap = gaVar.f89739f;
        java.lang.String str = this.f89667d;
        com.tencent.mm.plugin.appbrand.ui.fa faVar = (com.tencent.mm.plugin.appbrand.ui.fa) hashMap.get(str);
        if (faVar == null) {
            faVar = new com.tencent.mm.plugin.appbrand.ui.fa(gaVar, gaVar.getContext());
            faVar.f89711d = str;
            faVar.a();
            gaVar.addView(faVar);
            hashMap.put(str, faVar);
        }
        faVar.f89712e = this.f89668e;
        faVar.a();
    }
}
