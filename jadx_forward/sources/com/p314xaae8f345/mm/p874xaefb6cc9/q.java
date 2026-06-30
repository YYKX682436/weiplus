package com.p314xaae8f345.mm.p874xaefb6cc9;

/* loaded from: classes7.dex */
public final class q implements com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25502xf517bae0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.ref.WeakReference f150666a;

    public q(java.lang.ref.WeakReference weakReference) {
        this.f150666a = weakReference;
    }

    @Override // com.p314xaae8f345.p2929xca247920.p2930x2eaf9f.p2931xaf3f29eb.InterfaceC25502xf517bae0
    /* renamed from: onFirstFrameRendered */
    public void mo46979x452e7cb1() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("WVA.JsApiOperateWVA", "firstFrame: onFirstFrameRendered callback success!!!");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0) this.f150666a.get();
        if (c0Var != null) {
            c0Var.g("WVAOnFirstFrameEvent", "");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("WVA.JsApiOperateWVA", "firstFrame: AppBrandService already GC'ed or null, skip dispatch!");
        }
    }
}
