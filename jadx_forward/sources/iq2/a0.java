package iq2;

/* loaded from: classes2.dex */
public final class a0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f375242d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ iq2.d0 f375243e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(iq2.d0 d0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f375243e = d0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new iq2.a0(this.f375243e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((iq2.a0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f375242d;
        boolean z17 = true;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f375242d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(50L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        iq2.d0 d0Var = this.f375243e;
        if (d0Var.f375274y) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14594x9de071a c14594x9de071a = d0Var.f375259j;
            if (c14594x9de071a == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                throw null;
            }
            boolean z18 = c14594x9de071a.g1();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14595xffb7e034 b17 = ((gq2.j) d0Var.f375252c.f382634g).f356097g.b();
            boolean z19 = b17 != null && b17.h1();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(d0Var.f375254e, "onUserVisibleFocused isScrollTop: " + z18 + " isParentScrollBottom: " + z19);
            if (z18 || z19) {
                z17 = z18;
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1599x338a58.C14594x9de071a c14594x9de071a2 = d0Var.f375259j;
                if (c14594x9de071a2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("recyclerView");
                    throw null;
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(c14594x9de071a2, arrayList.toArray(), "com/tencent/mm/plugin/finder/nearby/newlivesquare/vertical/fragment/LiveStreamTabFragmentViewCallback$onUserVisibleFocused$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "scrollToPosition", "(I)V");
                c14594x9de071a2.a1(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(c14594x9de071a2, "com/tencent/mm/plugin/finder/nearby/newlivesquare/vertical/fragment/LiveStreamTabFragmentViewCallback$onUserVisibleFocused$1", "invokeSuspend", "(Ljava/lang/Object;)Ljava/lang/Object;", "Undefined", "scrollToPosition", "(I)V");
            }
            ((gq2.j) d0Var.f375252c.f382634g).f356097g.j(z17);
        }
        return jz5.f0.f384359a;
    }
}
