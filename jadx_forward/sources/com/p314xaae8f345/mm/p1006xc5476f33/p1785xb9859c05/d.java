package com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05;

/* loaded from: classes14.dex */
public class d implements com.p314xaae8f345.mm.sdk.p2603x2137b148.h5 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j f223971a;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1785xb9859c05.j jVar) {
        this.f223971a = jVar;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.h5
    public void a(int i17) {
        if (i17 == 2) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.IPCallManager", "system phone call state offhook, stop call");
            this.f223971a.j(0, 0);
        }
    }
}
