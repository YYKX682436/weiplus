package xt2;

/* loaded from: classes2.dex */
public final class l3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xt2.r3 f538400d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f538401e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b f538402f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ org.p3363xbe4143f1.C29690xfae77312 f538403g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f538404h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(xt2.r3 r3Var, android.view.View view, com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b, org.p3363xbe4143f1.C29690xfae77312 c29690xfae77312, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f538400d = r3Var;
        this.f538401e = view;
        this.f538402f = c22789xd23e9a9b;
        this.f538403g = c29690xfae77312;
        this.f538404h = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xt2.l3(this.f538400d, this.f538401e, this.f538402f, this.f538403g, this.f538404h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.l3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        xt2.r3 r3Var = this.f538400d;
        android.view.View view = r3Var.f538519i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(view, "access$getCartIv$p(...)");
        int[] t17 = pm0.v.t(view);
        int[] t18 = pm0.v.t(this.f538401e);
        java.lang.Integer S = kz5.z.S(t17, 0);
        int intValue = S != null ? S.intValue() : 0;
        java.lang.Integer S2 = kz5.z.S(t17, 1);
        int intValue2 = S2 != null ? S2.intValue() : 0;
        java.lang.Integer S3 = kz5.z.S(t18, 0);
        int intValue3 = S3 != null ? S3.intValue() : 0;
        java.lang.Integer S4 = kz5.z.S(t18, 1);
        float intValue4 = intValue2 - (S4 != null ? S4.intValue() : 0);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = this.f538402f;
        c22789xd23e9a9b.setTranslationX(((intValue - intValue3) + (r3Var.f538519i.getWidth() / 2.0f)) - (c22789xd23e9a9b.getLayoutParams().width / 2.0f));
        c22789xd23e9a9b.setTranslationY(intValue4 - ym5.x.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, 16.0f));
        c22789xd23e9a9b.mo82568x3e3ac3e8(this.f538403g);
        c22789xd23e9a9b.d();
        c22789xd23e9a9b.m82583xcde73672(0);
        c22789xd23e9a9b.m82582x3ae760af(0.0d);
        c22789xd23e9a9b.g();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveShoppingCartAnimWidget", "playPromotePag: playing, url=" + this.f538404h + ", tx=" + c22789xd23e9a9b.getTranslationX() + ", ty=" + c22789xd23e9a9b.getTranslationY());
        xt2.k3 k3Var = new xt2.k3(c22789xd23e9a9b);
        r3Var.f538514d = k3Var;
        return java.lang.Boolean.valueOf(r3Var.f538513c.mo50297x7c4d7ca2(k3Var, p012xc85e97e9.p023xae79c325.p034x2eaf9f.InterfaceC0559x1327bdda.f1183xe66aab0d));
    }
}
