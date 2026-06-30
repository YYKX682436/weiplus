package com.tencent.mm.plugin.backup.roambackup;

/* loaded from: classes5.dex */
public final class n1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.backup.roambackup.p1 f92663d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f92664e;

    public n1(com.tencent.mm.plugin.backup.roambackup.p1 p1Var, java.lang.String str) {
        this.f92663d = p1Var;
        this.f92664e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        jz5.l lVar = (jz5.l) this.f92663d.f92674e.remove(this.f92664e);
        if (lVar != null) {
            nf.e.f(new com.tencent.mm.plugin.backup.roambackup.m1(lVar));
        }
    }
}
