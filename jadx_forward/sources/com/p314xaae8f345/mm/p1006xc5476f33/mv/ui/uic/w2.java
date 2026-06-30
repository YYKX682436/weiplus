package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.uic;

/* loaded from: classes10.dex */
public final class w2 implements gk4.u {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ fm3.u f233044a;

    public w2(fm3.u uVar) {
        this.f233044a = uVar;
    }

    @Override // gk4.u
    /* renamed from: onPause */
    public void mo67293xb01dfb57() {
        fm3.u uVar = this.f233044a;
        if (uVar.f345675v > 0) {
            uVar.f345676w += c01.id.c() - uVar.f345675v;
            uVar.f345675v = 0L;
        }
    }

    @Override // gk4.u
    /* renamed from: onResume */
    public void mo67294x57429eec() {
        fm3.u uVar = this.f233044a;
        if (uVar.f345675v > 0) {
            uVar.f345676w += c01.id.c() - uVar.f345675v;
        }
        uVar.f345675v = c01.id.c();
    }
}
