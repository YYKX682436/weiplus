package mx3;

/* loaded from: classes9.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f414135d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f414136e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f414136e = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx3.o(this.f414136e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx3.o) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f414135d;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                t45.d0 d0Var = new t45.d0();
                d0Var.f497071d = 1;
                t45.e0 e0Var = new t45.e0();
                e0Var.f497080d = this.f414136e;
                d0Var.f497072e = e0Var;
                java.util.LinkedList linkedList = new java.util.LinkedList();
                linkedList.add(d0Var);
                ux3.i iVar = new ux3.i(linkedList);
                this.f414135d = 1;
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
                t45.a0 a0Var = (t45.a0) linkedList2.getFirst();
                if (a0Var != null) {
                    return a0Var;
                }
            }
        } catch (java.lang.Exception unused) {
        }
        return null;
    }
}
