package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes3.dex */
public final class x3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f148566d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yl2.g1 f148567e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f148568f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f148569g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f148570h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(yl2.g1 g1Var, android.app.Activity activity, boolean z17, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f148567e = g1Var;
        this.f148568f = activity;
        this.f148569g = z17;
        this.f148570h = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.x3(this.f148567e, this.f148568f, this.f148569g, this.f148570h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.x3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f148566d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            yl2.g1 g1Var = this.f148567e;
            this.f148566d = 1;
            obj = yl2.g1.t(g1Var, null, false, this, 3, null);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        yl2.a0 a0Var = (yl2.a0) obj;
        if (a0Var instanceof yl2.x) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "goToAnchorLiveDirect failed, errCode:" + ((yl2.x) a0Var).f544614a);
        } else {
            boolean z17 = a0Var instanceof yl2.z;
            yl2.g1 g1Var2 = this.f148567e;
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "goToAnchorLiveDirect continueLive");
                g1Var2.d(((yl2.z) a0Var).f544620a);
            } else if (a0Var instanceof yl2.y) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", "goToAnchorLiveDirect success");
                android.content.Intent intent = new android.content.Intent();
                intent.putExtra("FunctionGuideAction", ((com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f) this.f148568f).getIntent().getIntExtra("FunctionGuideAction", 0));
                g1Var2.h(intent, ((yl2.y) a0Var).f544616a, this.f148569g);
            }
        }
        this.f148570h.mo152xb9724478();
        return jz5.f0.f384359a;
    }
}
