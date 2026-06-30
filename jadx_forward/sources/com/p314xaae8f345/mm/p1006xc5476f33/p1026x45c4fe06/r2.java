package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06;

/* loaded from: classes7.dex */
public class r2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.oc f169279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f169280e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f169281f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 f169282g;

    public r2(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.oc ocVar, int i17, int i18) {
        this.f169282g = c11510xdd90c2f2;
        this.f169279d = ocVar;
        this.f169280e = i17;
        this.f169281f = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandRuntime", "addKeyEventObserver#scheduled");
        int i17 = this.f169280e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.oc ocVar = this.f169279d;
        ocVar.f167777b = i17;
        int i18 = this.f169281f;
        ocVar.f167776a = i18;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 c11510xdd90c2f2 = this.f169282g;
        boolean z17 = c11510xdd90c2f2.S1.get(i18) != null;
        java.util.Set copyOnWriteArraySet = z17 ? (java.util.Set) c11510xdd90c2f2.S1.get(ocVar.f167776a) : new java.util.concurrent.CopyOnWriteArraySet();
        copyOnWriteArraySet.add(ocVar);
        if (z17) {
            return;
        }
        c11510xdd90c2f2.S1.put(ocVar.f167776a, copyOnWriteArraySet);
    }
}
