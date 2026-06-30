package df2;

/* loaded from: classes3.dex */
public final class p5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f312572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.s5 f312573e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.ImageView f312574f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(df2.s5 s5Var, android.widget.ImageView imageView, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312573e = s5Var;
        this.f312574f = imageView;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.p5(this.f312573e, this.f312574f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.p5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f312572d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f312572d = 1;
            obj = this.f312573e.a(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f312574f.setImageBitmap(com.p314xaae8f345.mm.p786x600aa8b.e.c((java.lang.String) obj));
        return jz5.f0.f384359a;
    }
}
