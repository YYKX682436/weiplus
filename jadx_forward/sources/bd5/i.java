package bd5;

/* loaded from: classes10.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2665xc4e39b55.ActivityC21828xc79db19c f100971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.Set f100972e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2665xc4e39b55.ActivityC21828xc79db19c activityC21828xc79db19c, java.util.Set set, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f100971d = activityC21828xc79db19c;
        this.f100972e = set;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new bd5.i(this.f100971d, this.f100972e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        bd5.i iVar = (bd5.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        iVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        int i17 = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2665xc4e39b55.ActivityC21828xc79db19c.F;
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2665xc4e39b55.ActivityC21828xc79db19c activityC21828xc79db19c = this.f100971d;
        activityC21828xc79db19c.getClass();
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.q qVar = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.q.f283315f;
        qVar.getClass();
        java.util.List list = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.q.f283317h;
        java.lang.String str = activityC21828xc79db19c.f283345w;
        if (str == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("talker");
            throw null;
        }
        java.util.Set set = this.f100972e;
        bd5.c cVar = new bd5.c(str, list, set);
        xm3.n0 n0Var = new xm3.n0();
        n0Var.f536892d = 200;
        n0Var.f536890b = false;
        xm3.t0 t0Var = new xm3.t0(new com.p314xaae8f345.mm.p1006xc5476f33.p1925x6c8df6be.C16718x7059cefe(cVar, n0Var, activityC21828xc79db19c, null, null, 24, null), new com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2663xb63dd9d4.C21825x54c2dfa1(qVar), true);
        t0Var.f536913J = false;
        activityC21828xc79db19c.h7().mo7960x6cab2c8d(t0Var);
        bd5.k kVar = new bd5.k(activityC21828xc79db19c);
        activityC21828xc79db19c.h7().i(kVar);
        activityC21828xc79db19c.B = kVar;
        int size = set.size();
        com.p314xaae8f345.mm.ui.p2712x43ceaabb.AbstractC22433x7fa3716b W6 = activityC21828xc79db19c.W6(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2665xc4e39b55.C21827xd3270e1a.class);
        if (!(W6 instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2665xc4e39b55.C21827xd3270e1a)) {
            W6 = null;
        }
        com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2665xc4e39b55.C21827xd3270e1a c21827xd3270e1a = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2665xc4e39b55.C21827xd3270e1a) W6;
        if (c21827xd3270e1a != null) {
            java.lang.String str2 = activityC21828xc79db19c.f283347y;
            if (str2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("cropImagePath");
                throw null;
            }
            em.c2 c2Var = c21827xd3270e1a.f283340f;
            if (c2Var != null) {
                if (c2Var.f335703b == null) {
                    c2Var.f335703b = (android.widget.ImageView) c2Var.f335702a.findViewById(com.p314xaae8f345.mm.R.id.a_4);
                }
                android.widget.ImageView imageView = c2Var.f335703b;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(imageView, "getAvatarIv(...)");
                int h17 = i65.a.h(c21827xd3270e1a.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561182bo);
                gk0.k kVar2 = new gk0.k(h17, h17);
                kVar2.f353967e = com.p314xaae8f345.mm.R.C30859x5a72f63.f560023b;
                ((h83.g) ((gk0.n0) i95.n0.c(gk0.n0.class))).Ai(imageView, str2, kVar2);
                em.c2 c2Var2 = c21827xd3270e1a.f283340f;
                if (c2Var2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("binding");
                    throw null;
                }
                if (c2Var2.f335704c == null) {
                    c2Var2.f335704c = (android.widget.TextView) c2Var2.f335702a.findViewById(com.p314xaae8f345.mm.R.id.cut);
                }
                c2Var2.f335704c.setText(c21827xd3270e1a.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.pbt, java.lang.Integer.valueOf(size)));
            }
        }
        return jz5.f0.f384359a;
    }
}
