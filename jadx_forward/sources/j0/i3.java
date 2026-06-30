package j0;

/* loaded from: classes14.dex */
public final class i3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f377878d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f377879e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ j0.j3 f377880f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(j0.j3 j3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f377880f = j3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        j0.i3 i3Var = new j0.i3(this.f377880f, interfaceC29045xdcb5ca57);
        i3Var.f377879e = obj;
        return i3Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((j0.i3) mo148xaf65a0fc((p1.a0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f377878d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p1.a0 a0Var = (p1.a0) this.f377879e;
            j0.l3 l3Var = this.f377880f.f377916e;
            if (l3Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("longPressDragObserver");
                throw null;
            }
            this.f377878d = 1;
            if (j0.x2.a(a0Var, l3Var, this) == aVar) {
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
