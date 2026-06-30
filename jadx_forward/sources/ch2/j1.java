package ch2;

/* loaded from: classes10.dex */
public final class j1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ch2.o2 f122916d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f122917e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(ch2.o2 o2Var, java.util.LinkedList linkedList, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f122916d = o2Var;
        this.f122917e = linkedList;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ch2.j1(this.f122916d, this.f122917e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ch2.j1 j1Var = (ch2.j1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        j1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        ch2.o2 o2Var = this.f122916d;
        om2.g q76 = o2Var.q7();
        java.util.LinkedList list = this.f122917e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "$list");
        if (!q76.N6(list)) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(list, "$list");
            java.util.Iterator it = list.iterator();
            int i17 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i17 = -1;
                    break;
                }
                if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((r45.yx1) it.next()).f473002r, o2Var.h7().m8())) {
                    break;
                }
                i17++;
            }
            if (i17 > 0) {
                android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
                db5.t7.m123883x26a183b(context, context.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mjn, new java.lang.Integer(i17)), 0).show();
            }
        }
        return jz5.f0.f384359a;
    }
}
