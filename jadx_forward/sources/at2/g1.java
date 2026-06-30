package at2;

/* loaded from: classes.dex */
public final class g1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f95199d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ at2.n1 f95200e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.f0 f95201f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f95202g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f95203h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.List f95204i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f95205m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ long f95206n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(at2.n1 n1Var, p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var, android.widget.TextView textView, java.lang.String str, java.util.List list, int i17, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f95200e = n1Var;
        this.f95201f = f0Var;
        this.f95202g = textView;
        this.f95203h = str;
        this.f95204i = list;
        this.f95205m = i17;
        this.f95206n = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new at2.g1(this.f95200e, this.f95201f, this.f95202g, this.f95203h, this.f95204i, this.f95205m, this.f95206n, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((at2.g1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f95199d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f95200e.f95256y = true;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        while (this.f95200e.f95256y) {
            p3321xbce91901.jvm.p3324x21ffc6bd.f0 f0Var = this.f95201f;
            int i18 = f0Var.f391649d + 1;
            f0Var.f391649d = i18;
            if (i18 > Integer.MAX_VALUE) {
                f0Var.f391649d = 0;
            }
            this.f95202g.setText(this.f95203h + ((java.lang.String) this.f95204i.get(f0Var.f391649d % this.f95205m)));
            this.f95199d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(this.f95206n, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f384359a;
    }
}
