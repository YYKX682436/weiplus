package yi0;

/* loaded from: classes10.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f544022d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f544022d = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yi0.e(this.f544022d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yi0.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.f fVar = new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.f();
        java.lang.String str = this.f544022d;
        if (ui0.a.a(str)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TextStatusDataSource", "do not show text status cause in black list!");
            return fVar;
        }
        ((we0.l1) ((xe0.i0) i95.n0.c(xe0.i0.class))).getClass();
        mj4.h M = ai4.m0.f86706a.M(str);
        if (M == null) {
            return fVar;
        }
        com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s0 s0Var = new com.p314xaae8f345.mm.p775xd2ae381c.p777xc5476f33.p778x65fc9e8.s0();
        mj4.k kVar = (mj4.k) M;
        s0Var.f149607d = kVar.l();
        s0Var.f149616p = kVar.k();
        yi0.a aVar2 = yi0.b.f544010d;
        int i17 = kVar.f408600b.f76525x91a52c19;
        aVar2.getClass();
        boolean z17 = true;
        s0Var.f149609f = (i17 != 1 ? i17 != 2 ? yi0.b.f544011e : yi0.b.f544013g : yi0.b.f544012f).ordinal();
        s0Var.f149614n = kVar.j();
        s0Var.f149615o = kVar.i();
        s0Var.f149608e = r5.f76512x81959a6e * 1000;
        s0Var.f149613m = kVar.g();
        java.lang.String h17 = kVar.h();
        ((we0.y0) ((xe0.e0) i95.n0.c(xe0.e0.class))).getClass();
        bk4.f0 f0Var = bk4.f0.f102998a;
        pj4.o1 j17 = f0Var.j(h17);
        ((we0.y0) ((xe0.e0) i95.n0.c(xe0.e0.class))).getClass();
        pj4.g0 h18 = j17 != null ? bk4.g0.h(j17) : null;
        if (h18 == null) {
            xe0.e0 e0Var = (xe0.e0) i95.n0.c(xe0.e0.class);
            java.util.LinkedList linkedList = xe0.j0.a(M, false, 1, null).f436752m;
            ((we0.y0) e0Var).getClass();
            h18 = linkedList != null ? bk4.g0.f(linkedList) : null;
        }
        pj4.o0 a17 = xe0.j0.a(M, false, 1, null);
        s0Var.f149622v = "0";
        java.lang.String d17 = wi4.a.d(a17);
        if (d17 != null && !r26.n0.N(d17)) {
            z17 = false;
        }
        if (!z17) {
            xe0.i0 i0Var = (xe0.i0) i95.n0.c(xe0.i0.class);
            java.util.LinkedList linkedList2 = a17.f436749g;
            ((we0.l1) i0Var).getClass();
            pj4.j0 a18 = linkedList2 != null ? sj4.a1.a(linkedList2) : null;
            if (a18 != null && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(a18.f436672d, "5")) {
                byte[] decode = android.util.Base64.decode(a18.f436674f, 0);
                com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = new com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725();
                c19792x256d2725.mo11468x92b714fd(decode);
                s0Var.f149618r = vi0.j.a(c19792x256d2725);
            }
            java.util.LinkedList jumpInfos = a17.f436749g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jumpInfos, "jumpInfos");
            pj4.j0 j0Var = (pj4.j0) kz5.n0.Z(jumpInfos);
            if (j0Var != null) {
                s0Var.f149622v = j0Var.f436672d;
            }
        }
        s0Var.f149620t = wi4.a.c(a17);
        s0Var.f149621u = wi4.a.e(a17);
        ((we0.y0) ((xe0.e0) i95.n0.c(xe0.e0.class))).getClass();
        s0Var.f149611h = f0Var.m(a17);
        s0Var.f149610g = h18 != null ? h18.f436579d : null;
        s0Var.f149612i = a17.f436747e;
        s0Var.f149619s = kVar.v();
        s0Var.f149617q = kVar.p();
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(s0Var.f149622v, "0")) {
            s0Var.f149609f = 0;
            s0Var.f149617q = "text_state_default_image_2";
        }
        fVar.f149498d = s0Var;
        return fVar;
    }
}
