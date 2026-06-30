package com.p314xaae8f345.mm.vfs;

/* loaded from: classes12.dex */
public final class z1 implements com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab.OnCancelListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.vfs.w1 f294798a;

    public z1(com.p314xaae8f345.mm.vfs.w1 w1Var) {
        this.f294798a = w1Var;
    }

    @Override // com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab.OnCancelListener
    /* renamed from: onCancel */
    public final void mo82492x3d6f0539() {
        com.p314xaae8f345.mm.vfs.w1 w1Var = this.f294798a;
        synchronized (w1Var) {
            long j17 = w1Var.f294754d;
            if (j17 != 0) {
                com.p314xaae8f345.mm.vfs.C22748x3d92d33a.m82308xae7a2e7a(j17, true);
            }
        }
    }
}
