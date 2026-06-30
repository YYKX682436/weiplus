package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes10.dex */
public final class w1 implements i21.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f236264a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f236265b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f236266c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.l f236267d;

    public w1(java.lang.String str, java.util.concurrent.atomic.AtomicInteger atomicInteger, java.util.ArrayList arrayList, yz5.l lVar) {
        this.f236264a = str;
        this.f236265b = atomicInteger;
        this.f236266c = arrayList;
        this.f236267d = lVar;
    }

    @Override // i21.g
    public void a(boolean z17, int i17) {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download ");
        sb6.append(i17);
        sb6.append(" at ");
        java.lang.String str = this.f236264a;
        sb6.append(str);
        sb6.append(", succeed: ");
        sb6.append(z17);
        sb6.append(", downloading: ");
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f236265b;
        sb6.append(atomicInteger.get());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileUtilsKt", sb6.toString());
        java.util.ArrayList arrayList = this.f236266c;
        if (z17) {
            arrayList.add(str);
        }
        if (atomicInteger.addAndGet(-1) <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileUtilsKt", "onSuccess with download finished, " + arrayList);
            this.f236267d.mo146xb9724478(arrayList);
        }
    }
}
