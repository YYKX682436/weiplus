package gx0;

/* loaded from: classes5.dex */
public final class p7 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f358361d;

    /* renamed from: e, reason: collision with root package name */
    public int f358362e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f358363f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(gx0.w8 w8Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f358363f = w8Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new gx0.p7(this.f358363f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gx0.p7) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        gx0.w8 w8Var;
        io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a surfaceHolderCallbackC28529xf54f34a;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f358362e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            gx0.w8 w8Var2 = this.f358363f;
            java.lang.ref.WeakReference weakReference = w8Var2.A;
            if (weakReference != null && (surfaceHolderCallbackC28529xf54f34a = (io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a) weakReference.get()) != null) {
                return surfaceHolderCallbackC28529xf54f34a;
            }
            gx0.bf V6 = w8Var2.V6();
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = w8Var2.m158354x19263085();
            this.f358361d = w8Var2;
            this.f358362e = 1;
            V6.getClass();
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a, new gx0.td(V6, m158354x19263085, null), this);
            if (g17 == aVar) {
                return aVar;
            }
            w8Var = w8Var2;
            obj = g17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            w8Var = (gx0.w8) this.f358361d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a surfaceHolderCallbackC28529xf54f34a2 = (io.p3277xa1c40a32.p3283xc97dd6cb.SurfaceHolderCallbackC28529xf54f34a) obj;
        surfaceHolderCallbackC28529xf54f34a2.setId(android.view.View.generateViewId());
        w8Var.A = new java.lang.ref.WeakReference(surfaceHolderCallbackC28529xf54f34a2);
        surfaceHolderCallbackC28529xf54f34a2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        w8Var.B7().addView(surfaceHolderCallbackC28529xf54f34a2);
        return surfaceHolderCallbackC28529xf54f34a2;
    }
}
