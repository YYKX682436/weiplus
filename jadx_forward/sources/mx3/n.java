package mx3;

/* loaded from: classes9.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f414132d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f414133e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414134f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(long j17, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f414133e = j17;
        this.f414134f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx3.n(this.f414133e, this.f414134f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx3.n) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f414132d;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                t45.d0 d0Var = new t45.d0();
                d0Var.f497071d = 2;
                t45.f fVar = new t45.f();
                long j17 = this.f414133e;
                java.lang.String str = this.f414134f;
                fVar.f497082d = j17;
                fVar.f497083e = str;
                d0Var.f497073f = fVar;
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(d0Var);
                ux3.i iVar = new ux3.i(linkedList);
                this.f414132d = 1;
                obj = rm0.h.a(iVar, 0L, null, this, 3, null);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            java.util.LinkedList linkedList2 = ((t45.c0) obj).f497068d;
            if (linkedList2 != null) {
                return (t45.a0) linkedList2.getFirst();
            }
            return null;
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
