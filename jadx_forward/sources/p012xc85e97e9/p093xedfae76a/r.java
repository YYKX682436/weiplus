package p012xc85e97e9.p093xedfae76a;

/* loaded from: classes7.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f93182d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p093xedfae76a.C1116x78c71f86 f93183e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(p012xc85e97e9.p093xedfae76a.C1116x78c71f86 c1116x78c71f86, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f93183e = c1116x78c71f86;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 completion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
        p012xc85e97e9.p093xedfae76a.r rVar = new p012xc85e97e9.p093xedfae76a.r(this.f93183e, completion);
        rVar.f93182d = obj;
        return rVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public final java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        p012xc85e97e9.p093xedfae76a.r rVar = (p012xc85e97e9.p093xedfae76a.r) mo148xaf65a0fc(obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        rVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f93182d;
        p012xc85e97e9.p093xedfae76a.C1116x78c71f86 c1116x78c71f86 = this.f93183e;
        if (c1116x78c71f86.f93114d.b().compareTo(p012xc85e97e9.p093xedfae76a.n.INITIALIZED) >= 0) {
            c1116x78c71f86.f93114d.a(c1116x78c71f86);
        } else {
            p3325xe03a0797.p3326xc267989b.v2.c(y0Var.getF93115e(), null, 1, null);
        }
        return jz5.f0.f384359a;
    }
}
