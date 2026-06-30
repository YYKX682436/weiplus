package com.p314xaae8f345.mm.p642xad8b531f;

/* loaded from: classes12.dex */
public class a2 implements w11.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p642xad8b531f.b2 f144835d;

    public a2(com.p314xaae8f345.mm.p642xad8b531f.b2 b2Var) {
        this.f144835d = b2Var;
    }

    @Override // w11.f0
    /* renamed from: onCanceled */
    public void mo43374x9dc2a798(java.lang.String str) {
        ((com.p314xaae8f345.mm.p642xad8b531f.j) this.f144835d).a(null);
    }

    @Override // w11.f0
    /* renamed from: onFinished */
    public void mo43375x7cf2e371() {
        ((com.p314xaae8f345.mm.p642xad8b531f.j) this.f144835d).b();
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.u0
    /* renamed from: onSceneEnd */
    public void mo815x76e0bfae(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.NotifySyncMgr", "onGYNetEnd: %d [%d,%d,%s]", java.lang.Integer.valueOf(hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (i17 == 0 && i18 == 0) {
            return;
        }
        mo43374x9dc2a798(null);
    }
}
