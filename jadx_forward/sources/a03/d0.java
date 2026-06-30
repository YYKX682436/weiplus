package a03;

/* loaded from: classes8.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f81942d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ a03.h0 f81943e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f81944f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f81945g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(a03.h0 h0Var, android.content.Context context, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f81943e = h0Var;
        this.f81944f = context;
        this.f81945g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new a03.d0(this.f81943e, this.f81944f, this.f81945g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((a03.d0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f81942d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            android.content.Context context = this.f81944f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(context, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
            this.f81942d = 1;
            if (this.f81943e.hj((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context, this.f81945g, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
