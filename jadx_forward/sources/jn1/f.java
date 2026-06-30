package jn1;

/* loaded from: classes11.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final jn1.f f382025d = new jn1.f();

    public f() {
        super(1);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        g75.z state = (g75.z) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        j75.d dVar = state.f379599d;
        if (dVar != null && (dVar instanceof jn1.d)) {
            jn1.d dVar2 = (jn1.d) dVar;
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.p314xaae8f345.mm.p943x351df9c2.r0 n07 = com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().n0(dVar2.f382023b);
            java.lang.String str = dVar2.f382023b;
            if (n07 == null) {
                com.p314xaae8f345.mm.p2621x8fb0427b.z3 n17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
                byte[] s17 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().s(str);
                if (s17 != null) {
                    com.p314xaae8f345.mm.p2495xc50a8b8b.f mo11468x92b714fd = new r45.tn4().mo11468x92b714fd(s17);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.e(mo11468x92b714fd, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ModContact");
                    n07 = com.p314xaae8f345.mm.p943x351df9c2.g.e(str, (r45.tn4) mo11468x92b714fd, n17);
                }
            }
            if (n07 == null) {
                n07 = new com.p314xaae8f345.mm.p943x351df9c2.r0();
                n07.f152070i = -1;
                n07.f152062a = str;
                n07.f152063b = 3;
                n07.f152067f = 1;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Avatar.AvatarImgFlagPPC", "imgFlag is null and create username:" + str + " result:" + com.p314xaae8f345.mm.p943x351df9c2.d1.Ni().y0(n07));
            }
            state.l("Avatar_ImgFlag", n07);
        }
        return jz5.f0.f384359a;
    }
}
