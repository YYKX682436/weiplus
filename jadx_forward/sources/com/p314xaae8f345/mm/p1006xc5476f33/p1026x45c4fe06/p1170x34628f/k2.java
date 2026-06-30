package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public abstract class k2 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f168349d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f168350e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f168351f = false;

    public k2(java.lang.String str) {
        this.f168349d = str;
    }

    public abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        if ((this.f168350e || this.f168351f) ? false : true) {
            this.f168350e = true;
            a();
        }
    }
}
