package com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806;

/* loaded from: classes12.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f234575d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b0 f234576e;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b0 b0Var, int i17) {
        this.f234576e = b0Var;
        this.f234575d = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b0 b0Var = this.f234576e;
        int i17 = this.f234575d;
        ob0.s3 h17 = b0Var.h(false, i17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MemoryWatchDog", "[dumpMemoryAsync] %s", h17);
        if (b0Var.c(h17)) {
            b0Var.o(h17, i17);
        }
    }
}
