package com.p314xaae8f345.mm.ui.p2650x55bb7a46;

/* loaded from: classes11.dex */
public class q8 implements m3.i {

    /* renamed from: a, reason: collision with root package name */
    public boolean f284150a = false;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2650x55bb7a46.db f284151b = null;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a f284152c;

    public q8(com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a activityC21624x4b97e77a) {
        this.f284152c = activityC21624x4b97e77a;
    }

    @Override // m3.i
    public java.lang.Object get() {
        if (!this.f284150a) {
            int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.ActivityC21624x4b97e77a.f279786t;
            for (com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 abstractC22275x3ce1d8c9 : this.f284152c.m80390x535466d0(true)) {
                if (abstractC22275x3ce1d8c9 instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.db) {
                    this.f284151b = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.db) abstractC22275x3ce1d8c9;
                }
            }
        }
        this.f284150a = true;
        return this.f284151b;
    }
}
