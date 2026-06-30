package g4;

/* loaded from: classes5.dex */
public final class o3 extends qz5.l implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public int f350005d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g4.q3 f350006e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.j3 f350007f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(g4.q3 q3Var, g4.j3 j3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(1, interfaceC29045xdcb5ca57);
        this.f350006e = q3Var;
        this.f350007f = j3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo2108xaf65a0fc(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 completion) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(completion, "completion");
        return new g4.o3(this.f350006e, this.f350007f, completion);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
        return ((g4.o3) mo2108xaf65a0fc((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f350005d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            g4.j3 j3Var = this.f350007f;
            this.f350006e.f350045b = j3Var.f349923b;
            p3325xe03a0797.p3326xc267989b.p3328x30012e.j jVar = j3Var.f349922a;
            g4.n3 n3Var = new g4.n3(this);
            this.f350005d = 1;
            if (jVar.a(n3Var, this) == aVar) {
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
