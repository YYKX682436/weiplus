package bg2;

/* loaded from: classes2.dex */
public final class n5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f101866d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bg2.o5 f101867e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f101868f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f101869g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n5(bg2.o5 o5Var, android.view.View view, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f101867e = o5Var;
        this.f101868f = view;
        this.f101869g = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bg2.n5(this.f101867e, this.f101868f, this.f101869g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.n5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f101866d;
        bg2.o5 o5Var = this.f101867e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.pg6 pg6Var = o5Var.f101899i;
            boolean z17 = false;
            if (pg6Var != null && !pg6Var.m75933x41a8a7f2(1)) {
                z17 = true;
            }
            if (z17) {
                if (this.f101868f.getVisibility() != 0 || this.f101869g) {
                    this.f101866d = 1;
                    if (p3325xe03a0797.p3326xc267989b.k1.b(200L, this) == aVar) {
                        return aVar;
                    }
                } else {
                    android.view.ViewGroup viewGroup = o5Var.f101897g;
                    if (viewGroup != null) {
                        viewGroup.setVisibility(8);
                    }
                }
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.Integer num = o5Var.f101901n;
        if (num != null) {
            int intValue = num.intValue();
            android.view.ViewGroup viewGroup2 = o5Var.f101897g;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(intValue);
            }
        }
        return jz5.f0.f384359a;
    }
}
