package cl2;

/* loaded from: classes3.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f124457d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cl2.j f124458e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f124459f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f124460g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(cl2.j jVar, android.widget.TextView textView, android.widget.TextView textView2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f124458e = jVar;
        this.f124459f = textView;
        this.f124460g = textView2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new cl2.g(this.f124458e, this.f124459f, this.f124460g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((cl2.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f124457d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f124457d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(1000L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        android.widget.TextView textView = this.f124459f;
        cl2.j jVar = this.f124458e;
        jVar.n(textView, true);
        jVar.n(this.f124460g, true);
        return jz5.f0.f384359a;
    }
}
