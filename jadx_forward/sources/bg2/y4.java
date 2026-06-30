package bg2;

/* loaded from: classes2.dex */
public final class y4 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f102202d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.a5 f102203e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.r4 f102204f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4(bg2.a5 a5Var, bg2.r4 r4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f102203e = a5Var;
        this.f102204f = r4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bg2.y4(this.f102203e, this.f102204f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.y4) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f102202d;
        bg2.a5 a5Var = this.f102203e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f102202d = 1;
            obj = bg2.a5.Y6(a5Var, false, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (((java.lang.Boolean) obj).booleanValue()) {
            a5Var.d7();
        }
        bg2.r4 r4Var = this.f102204f;
        if (r4Var.f101991b.hasStarted()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a5Var.f101451e, "[toastViewIn] view:" + r4Var.f101990a + " has started in anim.");
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(a5Var.f101451e, "[toastViewIn] view:" + r4Var.f101990a);
            android.view.ViewGroup Z6 = a5Var.Z6();
            if (Z6 != null) {
                Z6.setVisibility(0);
            }
            android.view.ViewGroup Z62 = a5Var.Z6();
            if (Z62 != null) {
                Z62.addView(r4Var.f101990a);
            }
            r4Var.f101991b.setAnimationListener(new bg2.t4(a5Var, r4Var));
            r4Var.f101990a.startAnimation(r4Var.f101991b);
        }
        return jz5.f0.f384359a;
    }
}
