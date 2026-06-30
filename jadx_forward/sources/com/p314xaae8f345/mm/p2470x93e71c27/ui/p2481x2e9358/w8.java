package com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358;

/* loaded from: classes3.dex */
public final class w8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f272242d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f272243e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 f272244f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w8(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 h9Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f272244f = h9Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.w8 w8Var = new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.w8(this.f272244f, interfaceC29045xdcb5ca57);
        w8Var.f272243e = obj;
        return w8Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.w8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f272242d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var2 = (p3325xe03a0797.p3326xc267989b.y0) this.f272243e;
            this.f272243e = y0Var2;
            this.f272242d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(100L, this) == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f272243e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.h9 h9Var = this.f272244f;
            animatorSet.playTogether(h9Var.f271911x, h9Var.f271912y, h9Var.f271913z, h9Var.A, h9Var.B);
            animatorSet.addListener(new com.p314xaae8f345.mm.p2470x93e71c27.ui.p2481x2e9358.v8(h9Var, animatorSet));
            h9Var.O = animatorSet;
            animatorSet.start();
        }
        return jz5.f0.f384359a;
    }
}
