package com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9;

/* loaded from: classes10.dex */
public final class c2 implements i21.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234937a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.atomic.AtomicInteger f234938b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f234939c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.c5 f234940d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.CopyOnWriteArrayList f234941e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f234942f;

    public c2(java.lang.String str, java.util.concurrent.atomic.AtomicInteger atomicInteger, java.lang.String str2, r45.c5 c5Var, java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList, yz5.l lVar) {
        this.f234937a = str;
        this.f234938b = atomicInteger;
        this.f234939c = str2;
        this.f234940d = c5Var;
        this.f234941e = copyOnWriteArrayList;
        this.f234942f = lVar;
    }

    @Override // i21.g
    public void a(boolean z17, int i17) {
        r45.c5 c5Var;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("download ");
        sb6.append(i17);
        sb6.append(" at ");
        sb6.append(this.f234937a);
        sb6.append(", succeed: ");
        sb6.append(z17);
        sb6.append(", downloading: ");
        java.util.concurrent.atomic.AtomicInteger atomicInteger = this.f234938b;
        sb6.append(atomicInteger.get());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileUtilsKt", sb6.toString());
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = this.f234941e;
        if (z17) {
            java.lang.String str = this.f234939c;
            mr3.l lVar = null;
            if (str != null && (c5Var = this.f234940d) != null) {
                i21.q h17 = i21.q.h();
                java.lang.String e17 = h17 != null ? h17.e(str, c5Var.f452825d) : null;
                if (e17 != null) {
                    lVar = new mr3.l(e17, str, c5Var.f452825d, c5Var.f452826e, null, 0, 0, 112, null);
                }
            }
            if (lVar != null) {
                copyOnWriteArrayList.add(lVar);
            }
        }
        if (atomicInteger.decrementAndGet() <= 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ProfileUtilsKt", "onSuccess with download finished, " + copyOnWriteArrayList);
            this.f234942f.mo146xb9724478(copyOnWriteArrayList);
        }
    }
}
