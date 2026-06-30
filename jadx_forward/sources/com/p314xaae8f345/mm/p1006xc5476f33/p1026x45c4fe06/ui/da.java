package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui;

/* loaded from: classes3.dex */
public class da implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171200d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f171201e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ga f171202f;

    public da(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ga gaVar, java.lang.String str, java.lang.String str2) {
        this.f171202f = gaVar;
        this.f171200d = str;
        this.f171201e = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.ga gaVar = this.f171202f;
        java.util.HashMap hashMap = gaVar.f171272f;
        java.lang.String str = this.f171200d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.fa faVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.fa) hashMap.get(str);
        if (faVar == null) {
            faVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ui.fa(gaVar, gaVar.getContext());
            faVar.f171244d = str;
            faVar.a();
            gaVar.addView(faVar);
            hashMap.put(str, faVar);
        }
        faVar.f171245e = this.f171201e;
        faVar.a();
    }
}
