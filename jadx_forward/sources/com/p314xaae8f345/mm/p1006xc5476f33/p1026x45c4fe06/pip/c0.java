package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip;

/* loaded from: classes7.dex */
public class c0 implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 f168971a;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var) {
        this.f168971a = o0Var;
    }

    public final boolean a() {
        if (this.f168971a.D) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f168971a.f169051a, "interceptAudioFocusChange, runtime paused");
            return true;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var = this.f168971a;
        if (o0Var.f169066p == null) {
            java.lang.String str = o0Var.f169051a;
            return true;
        }
        if (o0Var.f169063m != null && (!o0Var.f169071u || !o0Var.f169072v)) {
            return false;
        }
        java.lang.String str2 = o0Var.f169051a;
        return true;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r1
    /* renamed from: onPause */
    public void mo10367xb01dfb57() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var = this.f168971a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o0Var.f169051a, "onPause");
        if (a()) {
            return;
        }
        o0Var.f169066p.f168969h.mo129532x65825f6();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r1
    /* renamed from: onResume */
    public void mo10368x57429eec() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var = this.f168971a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o0Var.f169051a, "onResume");
        if (a()) {
            return;
        }
        o0Var.f169066p.f168969h.mo129534x68ac462();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1095x62f6fe4.r1
    /* renamed from: onStop */
    public void mo10369xc39f8281() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.pip.o0 o0Var = this.f168971a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(o0Var.f169051a, "onStop");
        if (a()) {
            return;
        }
        o0Var.f169066p.f168969h.mo129532x65825f6();
    }
}
