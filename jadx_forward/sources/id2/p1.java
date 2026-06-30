package id2;

/* loaded from: classes.dex */
public final class p1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f372259d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f372260e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ id2.v1 f372261f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1(android.widget.TextView textView, id2.v1 v1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f372260e = textView;
        this.f372261f = v1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new id2.p1(this.f372260e, this.f372261f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((id2.p1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f372259d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            android.content.Context context = this.f372260e.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            this.f372259d = 1;
            obj = ((c61.l7) b6Var).sl(context, 0, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (((java.lang.Boolean) ((jz5.l) obj).f384366d).booleanValue()) {
            id2.v1.Q6(this.f372261f);
        }
        return jz5.f0.f384359a;
    }
}
