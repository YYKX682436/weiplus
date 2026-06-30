package st2;

/* loaded from: classes3.dex */
public final class d3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f493794d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f493795e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f493796f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f493797g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ float f493798h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f493799i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d3(android.widget.TextView textView, java.lang.String str, int i17, float f17, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f493795e = textView;
        this.f493796f = str;
        this.f493797g = i17;
        this.f493798h = f17;
        this.f493799i = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new st2.d3(this.f493795e, this.f493796f, this.f493797g, this.f493798h, this.f493799i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((st2.d3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f493794d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            st2.g3 g3Var = st2.g3.f493859a;
            android.content.Context context = this.f493795e.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            java.lang.String str = this.f493796f;
            int i18 = (int) (this.f493797g * this.f493798h);
            boolean z17 = !this.f493799i;
            this.f493794d = 1;
            obj = g3Var.l(context, str, i18, z17, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
