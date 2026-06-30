package sp2;

/* loaded from: classes2.dex */
public final class i3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f492584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f492585e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sp2.m3 f492586f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(int i17, sp2.m3 m3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f492585e = i17;
        this.f492586f = m3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sp2.i3(this.f492585e, this.f492586f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sp2.i3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f492584d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            int i18 = this.f492585e;
            if (i18 > 0) {
                this.f492584d = 1;
                if (p3325xe03a0797.p3326xc267989b.k1.b(i18, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        sp2.m3 m3Var = this.f492586f;
        android.view.View decorView = m3Var.m158354x19263085().getWindow().getDecorView();
        android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
        if (viewGroup != null) {
            viewGroup.addView(m3Var.P6(), -1, -1);
        }
        m3Var.P6().post(new sp2.h3(m3Var));
        return jz5.f0.f384359a;
    }
}
