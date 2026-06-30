package bb2;

/* loaded from: classes10.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bb2.w1 f100353d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f100354e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f100355f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f100356g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(bb2.w1 w1Var, java.util.List list, java.lang.String str, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f100353d = w1Var;
        this.f100354e = list;
        this.f100355f = str;
        this.f100356g = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bb2.c1(this.f100353d, this.f100354e, this.f100355f, this.f100356g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        bb2.c1 c1Var = (bb2.c1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        c1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        bb2.b1 b1Var = bb2.w1.f100568x;
        this.f100353d.a(this.f100354e, this.f100355f, this.f100356g);
        return jz5.f0.f384359a;
    }
}
