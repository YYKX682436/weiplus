package pn4;

/* loaded from: classes14.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f438594d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pn4.e1 f438595e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(pn4.e1 e1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f438595e = e1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new pn4.c1(this.f438595e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((pn4.c1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f438594d;
        pn4.e1 e1Var = this.f438595e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f438594d = 1;
            obj = pn4.e1.d(e1Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        r45.ih6 ih6Var = (r45.ih6) obj;
        if (ih6Var != null) {
            if (ih6Var.m75933x41a8a7f2(1)) {
                e1Var.i("has_unknow_character");
            } else {
                com.p314xaae8f345.mm.vfs.w6.h(e1Var.g());
                com.p314xaae8f345.mm.vfs.w6.f(e1Var.g());
                this.f438594d = 2;
                if (pn4.e1.c(e1Var, ih6Var, this) == aVar) {
                    return aVar;
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
