package nu0;

/* loaded from: classes5.dex */
public final class d3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f421445d;

    /* renamed from: e, reason: collision with root package name */
    public int f421446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f421447f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(nu0.b4 b4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f421447f = b4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nu0.d3(this.f421447f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nu0.d3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        nu0.b4 b4Var;
        io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a surfaceHolderCallbackC28529xf54f34a;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f421446e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            nu0.b4 b4Var2 = this.f421447f;
            java.lang.ref.WeakReference weakReference = b4Var2.f421423y;
            if (weakReference != null && (surfaceHolderCallbackC28529xf54f34a = (io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a) weakReference.get()) != null) {
                return surfaceHolderCallbackC28529xf54f34a;
            }
            nu0.q0 U6 = b4Var2.U6();
            android.app.Activity m80379x76847179 = b4Var2.m80379x76847179();
            this.f421445d = b4Var2;
            this.f421446e = 1;
            U6.getClass();
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new nu0.z(U6, m80379x76847179, null), this);
            if (g17 == aVar) {
                return aVar;
            }
            b4Var = b4Var2;
            obj = g17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b4Var = (nu0.b4) this.f421445d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a surfaceHolderCallbackC28529xf54f34a2 = (io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a) obj;
        surfaceHolderCallbackC28529xf54f34a2.setId(android.view.View.generateViewId());
        b4Var.f421423y = new java.lang.ref.WeakReference(surfaceHolderCallbackC28529xf54f34a2);
        surfaceHolderCallbackC28529xf54f34a2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        b4Var.m7().addView(surfaceHolderCallbackC28529xf54f34a2);
        return surfaceHolderCallbackC28529xf54f34a2;
    }
}
