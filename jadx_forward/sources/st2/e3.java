package st2;

/* loaded from: classes3.dex */
public final class e3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f493812d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f493813e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f493814f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f493815g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f493816h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(android.widget.TextView textView, java.lang.String str, java.util.LinkedList linkedList, boolean z17, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f493812d = textView;
        this.f493813e = str;
        this.f493814f = linkedList;
        this.f493815g = z17;
        this.f493816h = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new st2.e3(this.f493812d, this.f493813e, this.f493814f, this.f493815g, this.f493816h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        st2.e3 e3Var = (st2.e3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        e3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        gm2.c1 c1Var = gm2.c1.f354853a;
        android.widget.TextView textView = this.f493812d;
        android.content.Context context = textView.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        textView.setText(c1Var.q(context, this.f493813e, this.f493814f, this.f493815g));
        yz5.a aVar2 = this.f493816h;
        if (aVar2 != null) {
            aVar2.mo152xb9724478();
        }
        return jz5.f0.f384359a;
    }
}
